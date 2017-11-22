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

class WaHe$2
extends BukkitRunnable {
    private final /* synthetic */ Player ogdh;
    private final /* synthetic */ String XTBG;

    WaHe$2(Player player, String string) {
        this.ogdh = player;
        this.XTBG = string;
    }

    public void run() {
        WaHe$2.gW((Player)cv.b((Object)this, 1633743859), (String)cv.b((Object)this, -1109920782));
    }

    private static Object gW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

