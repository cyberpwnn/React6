package react.command;

import java.util.Collections;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;

import react.Gate;
import react.Info;
import react.api.ChunkIssue;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import react.controller.EventController;
import react.lagmap.LagMap;
import react.lagmap.LagMapChunk;
import react.text.ColoredString;
import react.text.RTEX;
import react.text.RTX;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandTopChunk extends ReactCommand
{
	public CommandTopChunk()
	{
		command = Info.COMMAND_TOPCHUNK;
		aliases = new String[] {Info.COMMAND_TOPCHUNK_ALIAS_1, Info.COMMAND_TOPCHUNK_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_CHUNK_BLAME.getNode()};
		usage = Info.COMMAND_TOPCHUNK_USAGE;
		description = Info.COMMAND_TOPCHUNK_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		LagMap map = EventController.map;
		GList<LagMapChunk> htl = new GList<LagMapChunk>(map.getChunks().v());
		Collections.sort(htl);
		Collections.reverse(htl);
		int k = 0;

		for(LagMapChunk i : htl)
		{
			String string = " " + i.getWorld().getName() + " -> [" + i.getX() + ", " + i.getZ() + "] ";
			C color = C.AQUA;
			int maxLength = 48;
			int left = string.length() + 2;
			int of = (maxLength - left) / 2;

			k++;
			RTX rtx = new RTX();
			RTEX rtex = new RTEX();
			rtex.getExtras().add(new ColoredString(C.AQUA, "Click to teleport"));
			rtx.addText(F.repeat(" ", of), C.BLACK);
			rtx.addTextFireHoverCommand(string, rtex, "/react chunktp " + i.getWorld().getName() + " " + i.getX() + " " + i.getZ(), color);
			rtx.addText(F.repeat(" ", of), C.BLACK);
			rtx.tellRawTo((Player) sender);

			for(ChunkIssue j : i.getHits().k())
			{
				Gate.msg(sender, "  " + j.name() + ": " + C.WHITE + F.time(i.getMS(j), 2));
			}

			if(k > 5)
			{
				break;
			}
		}

		sender.sendMessage("  ");
	}
}
