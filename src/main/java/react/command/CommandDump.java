package react.command;

import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.json.JSONArray;
import org.cyberpwn.json.JSONObject;

import react.Gate;
import react.React;
import react.api.Capability;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.control.Control;
import surge.control.IController;
import surge.util.Anchor;
import surge.util.C;
import surge.util.I;
import surge.util.Paste;

@Anchor(0)
public class CommandDump extends ReactCommand
{
	public CommandDump()
	{
		command = "dump";
		aliases = new String[] {"du"};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.RELOAD.getNode()};
		usage = "";
		description = "Dumps server information to a pastebin";
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		JSONObject js = new JSONObject();

		JSONObject react = new JSONObject();
		JSONObject rplugin = new JSONObject();

		rplugin.put("react-version", Bukkit.getPluginManager().getPlugin("React").getDescription().getVersion());

		JSONObject capabilities = new JSONObject();
		JSONArray capable = new JSONArray();
		JSONArray notcapable = new JSONArray();
		JSONObject controllers = new JSONObject();
		GList<IController> con = new GList<IController>();
		for(Field j : React.class.getFields())
		{
			if(j.isAnnotationPresent(Control.class))
			{
				try
				{
					con.add((IController) j.get(React.instance));
				}

				catch(IllegalArgumentException | IllegalAccessException e)
				{
					e.printStackTrace();
				}
			}
		}

		controllers.put("active", con.size());
		JSONArray activeCon = new JSONArray();

		for(IController i : con)
		{
			JSONObject jcon = new JSONObject();
			jcon.put("name", i.getClass().getSimpleName());
			jcon.put("tick", F.time(i.getTime(), 5));
			JSONObject prop = new JSONObject();
			i.dump(prop);
			jcon.put("properties", prop);
			activeCon.put(jcon);
		}

		for(Capability i : Capability.capabilities)
		{
			if(i.isCapable())
			{
				capable.put(i.getName());
			}

			else
			{
				notcapable.put(i.getName());
			}
		}


		capabilities.put("capable", capable);
		capabilities.put("not-capable", notcapable);
		react.put("plugin", rplugin);
		react.put("controllers", activeCon);
		react.put("capabilities", capabilities);
		JSONObject timings = new JSONObject();

		for(String i : I.m.k())
		{
			timings.put(i, "AVG: " + F.f(I.m.get(i).getAverage(), 5) + " /" + I.m.get(i).size() + " HIT: " + F.f(I.h.get(i)) + " TOT: " + F.f(I.y.get(i), 6));
		}

		react.put("timings", timings);
		js.put("react", react);

		new A()
		{
			@Override
			public void run()
			{
				try
				{
					String s = Paste.paste(js.toString(4));
					Gate.msgSuccess(sender, "Dumped: " + C.WHITE + C.UNDERLINE + s + ".json");
				}

				catch(Exception e)
				{
					Gate.msgError(sender, "Failed to paste.");
					e.printStackTrace();
				}
			}
		};
	}
}
