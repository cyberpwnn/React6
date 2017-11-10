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

public class PeEO {
    private String command;
    private CommandSender sender;
    private boolean vdNw;

    public PeEO(String string) {
        this.command = string;
        this.sender = PeEO.VP();
        this.vdNw = false;
    }

    public PeEO dobQ() {
        yy.E(this, 1330710544, true);
        return this;
    }

    public void yJLL(CommandSender commandSender) {
        yy.E(this, 215352549, (Object)commandSender);
        this.execute();
    }

    public void execute() {
        if (((Boolean)yy.h(this, 1330710544)).booleanValue()) {
            if ((CommandSender)yy.h(this, 215352549) instanceof Player) {
                PeEO.VP().getPluginManager().callEvent((Event)new PlayerCommandPreprocessEvent((Player)((CommandSender)yy.h(this, 215352549)), PeEO.VP((String)yy.h(this, 1796932830), KDGY$JAHk.Y("\u36f6")) != false ? (String)yy.h(this, 1796932830) : PeEO.VP(PeEO.VP(new StringBuilder(KDGY$JAHk.Y("\u36f6")), (String)yy.h(this, 1796932830)))));
                return;
            }
            PeEO.VP((CommandSender)yy.h(this, 215352549), PeEO.VP(PeEO.VP(PeEO.VP(new StringBuilder(KDGY$JAHk.Y("\u36a9\u7a5d\u897e\u0948\u5756\ue751\u1bf3\u957f")), PeEO.VP((String)yy.h(this, 1796932830), KDGY$JAHk.Y("\u36f6")) != false ? PeEO.VP((String)yy.h(this, 1796932830), true) : (Object)yy.h(this, 1796932830)), KDGY$JAHk.Y("\u36e2"))));
            return;
        }
        PeEO.VP((CommandSender)yy.h(this, 215352549), (String)yy.h(this, 1796932830));
    }

    private static Object VP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

