/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.scheduler.BukkitRunnable
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class AqqI$2
extends BukkitRunnable {
    private final /* synthetic */ Player urTi;
    private final /* synthetic */ String VNUg;

    AqqI$2(Player player, String string) {
        this.urTi = player;
        this.VNUg = string;
    }

    public void run() {
        AqqI$2.SV((Player)o.a((Object)this, 1811437385), (String)o.a((Object)this, 1621251912));
    }

    private static Object SV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

