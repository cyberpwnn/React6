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

class YMXg$1
extends CxNA {
    final /* synthetic */ YMXg bbDq;
    private final /* synthetic */ TNku rNod;

    YMXg$1(YMXg yMXg, TNku tNku) {
        this.bbDq = yMXg;
        this.rNod = tNku;
    }

    @Override
    public void run() {
        Object object = YMXg$1.qF(YMXg$1.qF((TNku)o.a(this, -1219274247)));
        while (object.hasNext()) {
            Location location = (Location)object.next();
            if (((Boolean)o.k(-1777182497)).booleanValue()) {
                YMXg$1.qF((Fpab)((Object)o.k(1660115448)), new Fpab$VwLY((Color)YMXg$1.qF((TNku)o.a(this, -1219274247), location)), location, YMXg$1.qF((YMXg)o.a(this, 768039415)));
            }
            if (!((Boolean)o.k(-61253408)).booleanValue()) continue;
            Object object2 = YMXg$1.qF((Color)YMXg$1.qF((TNku)o.a(this, -1219274247), location));
            try {
                Object object3 = YMXg$1.qF(YMXg$1.qF((YMXg)o.a(this, 768039415)));
                while (object3.hasNext()) {
                    Player player = (Player)object3.next();
                    player.sendBlockChange(location, (Material)o.k(325868019), (byte)YMXg$1.qF(object2));
                    new YMXg$1$1(this, mrFx$WjFM.d("\u3f5b\u1a18\u2091\u495e\u9940\uf44f\ue40c\ua217\uf3f6\ub383\u5e83\u213f\u66f6\u864f\u3f11\ua24f\ucb09"), 2, 88, location, player);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static Object qF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

