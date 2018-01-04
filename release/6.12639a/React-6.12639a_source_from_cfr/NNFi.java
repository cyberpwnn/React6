/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Event
 *  org.bukkit.event.player.PlayerCommandPreprocessEvent
 *  org.bukkit.plugin.PluginManager
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.PluginManager;

public class NNFi {
    private String command;
    private CommandSender sender;
    private boolean ubNy;

    public NNFi(String string) {
        this.command = string;
        this.sender = NNFi.Dr();
        this.ubNy = false;
    }

    public NNFi AaVw() {
        o.v(this, 1849376089, true);
        return this;
    }

    public void biLo(CommandSender commandSender) {
        o.v(this, 474627416, (Object)commandSender);
        this.execute();
    }

    public void execute() {
        if (((Boolean)o.a(this, 1849376089)).booleanValue()) {
            if ((CommandSender)o.a(this, 474627416) instanceof Player) {
                NNFi.Dr().getPluginManager().callEvent((Event)new PlayerCommandPreprocessEvent((Player)((CommandSender)o.a(this, 474627416)), NNFi.Dr((String)o.a(this, -80200361), nJPf$sILv.G("\u516b")) != false ? (String)o.a(this, -80200361) : NNFi.Dr(NNFi.Dr(new StringBuilder(nJPf$sILv.G("\u516b")), (String)o.a(this, -80200361)))));
                return;
            }
            NNFi.Dr((CommandSender)o.a(this, 474627416), NNFi.Dr(NNFi.Dr(NNFi.Dr(new StringBuilder(nJPf$sILv.G("\u5134\u2b87\ub56e\u5d8e\u8197\ua1f1\u4191\u20b3")), NNFi.Dr((String)o.a(this, -80200361), nJPf$sILv.G("\u516b")) != false ? NNFi.Dr((String)o.a(this, -80200361), true) : (Object)o.a(this, -80200361)), nJPf$sILv.G("\u517f"))));
            return;
        }
        NNFi.Dr((CommandSender)o.a(this, 474627416), (String)o.a(this, -80200361));
    }

    private static Object Dr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

