package react.command;

import java.util.Collections;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;

import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SampledType;
import react.api.SideGate;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandStatus extends ReactCommand
{
	public CommandStatus()
	{
		command = Info.COMMAND_STATUS;
		aliases = new String[] {Info.COMMAND_STATUS_ALIAS_1, Info.COMMAND_STATUS_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_STATUS_USAGE;
		description = Info.COMMAND_STATUS_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Player p = (Player) sender;

		int slot = -1;

		if((slot = findSlot(p)) != -1)
		{
			p.getInventory().setItem(slot, makeBook());
		}
	}

	private ItemStack makeBook()
	{
		ItemStack is = new ItemStack(Material.WRITTEN_BOOK);
		BookMeta book = (BookMeta) is.getItemMeta();
		book.setTitle("Server Status");
		GList<String> set = new GList<String>();
		addStatusPages(set);
		addSpikePages(set);
		book.setPages(set);
		is.setItemMeta(book);

		return is;
	}

	private void addSpikePages(GList<String> set)
	{
		String f = "";
		f += C.DARK_AQUA + C.BOLD.toString() + C.ITALIC + "Server Spikes\n" + C.RESET;

		GList<Integer> ints = React.instance.spikeController.getSpikes().v();
		Collections.sort(ints);
		Collections.reverse(ints);

		while(ints.size() > 12)
		{
			ints.remove(ints.size() - 1);
		}

		for(int i : ints)
		{
			for(String j : React.instance.spikeController.getSpikes().k())
			{
				if(React.instance.spikeController.getSpikes().get(j).equals(i))
				{
					String jn = j.length() > 14 ? j.substring(0, 14) + "..." : j;
					f += C.GRAY + jn + ": " + C.BLACK + C.BOLD.toString() + i + "\n";
					break;
				}
			}
		}

		set.add(f);
	}

	private void addStatusPages(GList<String> set)
	{
		String f = "";
		f += C.DARK_AQUA + C.BOLD.toString() + C.ITALIC + "General\n" + C.RESET;
		f += C.GRAY + "Players Online: " + Bukkit.getServer().getOnlinePlayers().size() + "\n";
		f += C.GRAY + "Chunks Loaded: " + React.instance.sampleController.getSampler(SampledType.CHK.toString()).get() + "\n";
		f += C.GRAY + "Worlds Loaded: " + Bukkit.getWorlds().size() + "\n";
		f += C.DARK_AQUA + C.BOLD.toString() + C.ITALIC + "Memory\n" + C.RESET;
		f += C.GRAY + React.instance.sampleController.getSampler(SampledType.MEM.toString()).get() + " of " + React.instance.sampleController.getSampler(SampledType.MAXMEM.toString()).get() + "\n";
		f += C.DARK_AQUA + C.BOLD.toString() + C.ITALIC + "Tick\n" + C.RESET;
		f += C.GRAY + "Tick Usage: " + React.instance.sampleController.getSampler(SampledType.TIU.toString()).get() + " (" + F.f(React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue(), 0) + "ms)\n";
		set.add(f);
	}

	private int findSlot(Player p)
	{
		int test = p.getInventory().getHeldItemSlot();

		if(p.getInventory().getItem(test) == null || p.getInventory().getItem(test).getType().equals(Material.AIR))
		{
			return test;
		}

		for(int i = 0; i < 9; i++)
		{
			test = i;

			if(p.getInventory().getItem(test) == null || p.getInventory().getItem(test).getType().equals(Material.AIR))
			{
				return test;
			}
		}

		return -1;
	}
}
