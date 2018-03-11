package react.fix;

import org.bukkit.Chunk;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.volmit.react.util.Anchor;
import com.volmit.react.util.TaskLater;

import react.Gate;
import react.React;
import react.action.source.PlayerActionSource;
import react.api.ActionType;
import react.api.Capability;
import react.api.SelectorPosition;

@Anchor(111)
public class FixInvisibleChunk extends Fix implements Listener
{
	boolean running;

	public FixInvisibleChunk()
	{
		running = false;
		setName("Fix Invisible Chunk");
		setId("ghost-chunk");
		setAliases(new String[] {"gchunk", "chunk"});
		setDescription("Re-sends chunk packets in this chunk.");
		setUsage("[-brutal]");
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(CommandSender sender, String[] args)
	{
		if(!Capability.CHUNK_RELIGHTING.isCapable())
		{
			Capability.CHUNK_RELIGHTING.sendNotCapable(sender);
			return;
		}

		if(sender instanceof Player)
		{
			Player p = (Player) sender;
			Chunk ch = p.getLocation().getChunk();

			for(String i : args)
			{
				if(i.equalsIgnoreCase("-brutal"))
				{
					ch.getWorld().refreshChunk(ch.getX(), ch.getZ());
					Gate.msgActing(sender, "Force Refreshed (brutality)");
					break;
				}
			}

			new TaskLater("kdel", 5)
			{
				@Override
				public void run()
				{
					SelectorPosition pos = new SelectorPosition();
					pos.add(ch);
					React.instance.actionController.fire(ActionType.FIX_LIGHTING, new PlayerActionSource(p), pos);
					Gate.msgActing(sender, "Attempting to resend this chunk to nearby players.");
				}
			};
		}

		else
		{
			Gate.msgError(sender, "Consoles cant have a position. Use /re a fix-lighting @c:<chunk> instead");
		}
	}
}
