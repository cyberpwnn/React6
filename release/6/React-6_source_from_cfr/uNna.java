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

public class uNna {
    private String command;
    private CommandSender sender;
    private boolean bPmJ;

    public uNna(String string) {
        this.command = string;
        this.sender = uNna.ju();
        this.bPmJ = false;
    }

    public uNna Hecg() {
        cv.e(this, 117896665, true);
        return this;
    }

    public void IWSm(CommandSender commandSender) {
        cv.e(this, 282981400, (Object)commandSender);
        this.execute();
    }

    public void execute() {
        if (((Boolean)cv.b(this, 117896665)).booleanValue()) {
            if ((CommandSender)cv.b(this, 282981400) instanceof Player) {
                uNna.ju().getPluginManager().callEvent((Event)new PlayerCommandPreprocessEvent((Player)((CommandSender)cv.b(this, 282981400)), uNna.ju((String)cv.b(this, -456854501), KUXS$dwji.S("\uc668")) != false ? (String)cv.b(this, -456854501) : uNna.ju(uNna.ju(new StringBuilder(KUXS$dwji.S("\uc668")), (String)cv.b(this, -456854501)))));
                return;
            }
            uNna.ju((CommandSender)cv.b(this, 282981400), uNna.ju(uNna.ju(uNna.ju(new StringBuilder(KUXS$dwji.S("\uc637\u867d\ue140\ub010\u84c3\ucfba\u7c12\uca28")), uNna.ju((String)cv.b(this, -456854501), KUXS$dwji.S("\uc668")) != false ? uNna.ju((String)cv.b(this, -456854501), true) : (Object)cv.b(this, -456854501)), KUXS$dwji.S("\uc67c"))));
            return;
        }
        uNna.ju((CommandSender)cv.b(this, 282981400), (String)cv.b(this, -456854501));
    }

    private static Object ju(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

