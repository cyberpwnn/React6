package react.command;

import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import com.volmit.react.util.A;
import com.volmit.react.util.Anchor;
import com.volmit.react.util.C;
import com.volmit.react.util.Control;
import com.volmit.react.util.F;
import com.volmit.react.util.GList;
import com.volmit.react.util.I;
import com.volmit.react.util.IController;
import com.volmit.react.util.JSONArray;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.Paste;

import react.Gate;
import react.React;
import react.api.Capability;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;

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

		for(String i : I.m.k().sortCopy())
		{
			JSONObject tx = new JSONObject();

			double perTick = (double) I.h.get(i) / (double) I.hit;
			String w = "";

			if(perTick > 0.3 && I.m.get(i).getAverage() > 4)
			{
				w = " WARNING";
			}

			tx.put("Average", F.f(I.m.get(i).getAverage(), 5) + " (over " + I.m.get(i).size() + " ticks)");
			tx.put("Hits", F.f(I.h.get(i)) + " hits across " + F.f(I.hit) + " total ticks (about " + F.f(perTick, 2) + " per tick)");
			tx.put("Time", F.f(I.y.get(i), 6) + " Total execution time");

			if(w.length() > 0)
			{
				tx.put("WARNING", "Tick time and hits per tick for " + i + " is high");
			}

			timings.put(i, tx);
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
