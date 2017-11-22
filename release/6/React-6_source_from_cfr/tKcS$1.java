/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Color
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

class tKcS$1
extends dDce {
    final /* synthetic */ tKcS yRrK;
    private final /* synthetic */ ktOu BKGQ;

    tKcS$1(tKcS tKcS2, ktOu ktOu2) {
        this.yRrK = tKcS2;
        this.BKGQ = ktOu2;
    }

    @Override
    public void run() {
        Object object = tKcS$1.uN(tKcS$1.uN((ktOu)cv.b(this, -1623067979)));
        while (object.hasNext()) {
            Location location = (Location)object.next();
            if (((Boolean)cv.e(213913963)).booleanValue()) {
                tKcS$1.uN((JbuU)((Object)cv.e(27718324)), new JbuU$OXeK((Color)tKcS$1.uN((ktOu)cv.b(this, -1623067979), location)), location, tKcS$1.uN((tKcS)cv.b(this, -1573391689)));
            }
            if (!((Boolean)cv.e(-1873276568)).booleanValue()) continue;
            Object object2 = tKcS$1.uN((Color)tKcS$1.uN((ktOu)cv.b(this, -1623067979), location));
            try {
                Object object3 = tKcS$1.uN(tKcS$1.uN((tKcS)cv.b(this, -1573391689)));
                while (object3.hasNext()) {
                    Player player = (Player)object3.next();
                    player.sendBlockChange(location, (Material)cv.e(1933570739), (byte)tKcS$1.uN(object2));
                    new tKcS$1$1(this, KUXS$dwji.S("\u3f48\uca0f\ue583\ua1e2\u670e\u3372\u84f9\udb29\uacc8\u3bab\uc778\uc7ca\u95a0\u11b1\u49fd\u7e90\ufb4a"), 2, 88, location, player);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static Object uN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

