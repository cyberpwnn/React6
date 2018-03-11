package react.controller;

import org.bukkit.command.CommandSender;

import com.volmit.react.surge.Surge;
import com.volmit.react.util.C;
import com.volmit.react.util.Controller;
import com.volmit.react.util.GList;
import com.volmit.react.util.JSONObject;

import react.Gate;
import react.api.IFix;
import react.fix.FixEntityAI;
import react.fix.FixInvisibleChunk;

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

		fixes.add(new FixEntityAI());
		fixes.add(new FixInvisibleChunk());

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
