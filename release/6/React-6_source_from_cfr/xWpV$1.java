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

class xWpV$1
extends BukkitRunnable {
    private final /* synthetic */ Player jhjw;

    xWpV$1(Player player) {
        this.jhjw = player;
    }

    public void run() {
        xWpV$1.Pl((Player)yy.h((Object)this, -997063127), "");
    }

    private static Object Pl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

