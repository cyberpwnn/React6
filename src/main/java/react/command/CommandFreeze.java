package react.command;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import org.cyberpwn.glang.GList;

import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.sched.Task;
import surge.util.Anchor;
import surge.util.P;

@Anchor(0)
public class CommandFreeze extends ReactCommand
{
	public CommandFreeze()
	{
		command = "freeze";
		aliases = new String[] {"fr"};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_HELP_USAGE;
		description = Info.COMMAND_HELP_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		new Task("spam", 0, 100)
		{
			@Override
			public void run()
			{
				for(int i = 0; i < 50; i++)
				{
					Location l = P.getAnyPlayer().getLocation();
					Vector v = Vector.getRandom().subtract(Vector.getRandom());
					Entity e = l.getWorld().dropItem(l, new ItemStack(new GList<Material>(Material.values()).qdel(Material.AIR).pickRandom()));
					e.setVelocity(v.multiply(0.9));
				}
			}
		};
	}
}
