package react.controller;

import java.lang.reflect.InvocationTargetException;

import org.bukkit.command.CommandSender;
import org.cyberpwn.glang.GList;
import org.cyberpwn.json.JSONObject;

import react.Gate;
import react.api.IFix;
import surge.Main;
import surge.Surge;
import surge.control.Controller;
import surge.util.C;

public class FixController extends Controller
{
	private GList<IFix> fixes;

	@Override
	public void dump(JSONObject object)
	{
		object.put("fixes-loaded", fixes.size());
	}

	@Override
	public void start()
	{
		fixes = new GList<IFix>();

		for(Class<?> i : Main.anchors.get(111))
		{
			try
			{
				fixes.add((IFix) i.getConstructor().newInstance());
			}

			catch(InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e)
			{
				e.printStackTrace();
			}
		}

		Surge.register(this);
	}

	public GList<IFix> getFixes()
	{
		return fixes;
	}

	public void runFix(CommandSender sender, String name, String[] args)
	{
		for(IFix i : fixes)
		{
			if(i.getId().equalsIgnoreCase(name))
			{
				i.run(sender, args);
				return;
			}
		}

		for(IFix i : fixes)
		{
			for(String j : i.getAliases())
			{
				if(j.equalsIgnoreCase(name))
				{
					i.run(sender, args);
					return;
				}
			}
		}

		Gate.msgError(sender, "Unknown fix '" + C.RED + name + C.GRAY + "'");
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{

	}
}
