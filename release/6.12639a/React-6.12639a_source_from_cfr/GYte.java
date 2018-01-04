/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.util.Vector;

public class GYte {
    private Location COTa;
    private Vector VrBR;
    private Vector tVsc;

    public GYte(Location location, Vector vector, Vector vector2) {
        this.COTa = location;
        this.VrBR = vector;
        this.tVsc = vector2;
    }

    public GYte(Location location, Vector vector) {
        this(location, new Vector(0, 0, 0), vector);
    }

    public GYte(Location location) {
        this(location, new Vector(1, 1, 1));
    }

    public boolean wKtV(Location location) {
        Location location2 = this.getCenter();
        if (GYte.xW(location) > GYte.xW(location2) - GYte.xW((Vector)o.a(this, -1704902178))) {
            if (GYte.xW(location) < GYte.xW(location2) + GYte.xW((Vector)o.a(this, -1704902178))) {
                if (GYte.xW(location) > GYte.xW(location2) - GYte.xW((Vector)o.a(this, -1704902178))) {
                    if (GYte.xW(location) < GYte.xW(location2) + GYte.xW((Vector)o.a(this, -1704902178))) {
                        if (GYte.xW(location) > GYte.xW(location2) - GYte.xW((Vector)o.a(this, -1704902178))) {
                            if (GYte.xW(location) < GYte.xW(location2) + GYte.xW((Vector)o.a(this, -1704902178))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public Location tenm() {
        reference var1_1 = GYte.xW() * (GYte.xW((Vector)o.a(this, -1704902178)) * 2.0) - GYte.xW((Vector)o.a(this, -1704902178));
        reference var3_2 = GYte.xW() * (GYte.xW((Vector)o.a(this, -1704902178)) * 2.0) - GYte.xW((Vector)o.a(this, -1704902178));
        reference var5_3 = GYte.xW() * (GYte.xW((Vector)o.a(this, -1704902178)) * 2.0) - GYte.xW((Vector)o.a(this, -1704902178));
        return GYte.xW(this.getCenter(), new Vector((double)var1_1, (double)var3_2, (double)var5_3));
    }

    public Location QEwq() {
        return GYte.xW(this.getCenter(), GYte.xW() >= 0.5 ? GYte.xW((Vector)o.a(this, -1704902178)) : - GYte.xW((Vector)o.a(this, -1704902178)), GYte.xW() >= 0.5 ? GYte.xW((Vector)o.a(this, -1704902178)) : - GYte.xW((Vector)o.a(this, -1704902178)), GYte.xW() >= 0.5 ? GYte.xW((Vector)o.a(this, -1704902178)) : - GYte.xW((Vector)o.a(this, -1704902178)));
    }

    public Location getCenter() {
        return GYte.xW(GYte.xW((Location)o.a(this, -1995226659)), (Vector)o.a(this, 457851356));
    }

    public Location getLocation() {
        return (Location)o.a(this, -1995226659);
    }

    public Vector sRKe() {
        return (Vector)o.a(this, 457851356);
    }

    public Vector BlpV() {
        return (Vector)o.a(this, -1704902178);
    }

    private static Object xW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

