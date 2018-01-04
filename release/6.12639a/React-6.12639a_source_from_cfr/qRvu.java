/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.util.Vector;

public abstract class qRvu {
    private feCR<Location> CgeK = new feCR();
    private feCR<Location> pHbi = new feCR();
    private Lhwj<Location> OIEY = new Lhwj();

    public qRvu(int n, int n2, Location location) {
        Object object = qRvu.JK(qRvu.JK(location), new Vector(n, n, n));
        Object object2 = qRvu.JK(qRvu.JK(location), new Vector(- n, - n, - n));
        Kwaa kwaa = new Kwaa((Location)object, (Location)object2);
        Object object3 = qRvu.JK(kwaa);
        new qRvu$1(this, (Iterator)object3, location, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean yJLS(Location location, Location location2) {
        Location location3;
        Object object = qRvu.JK(location);
        reference var4_4 = qRvu.JK(qRvu.JK(object), qRvu.JK(location2));
        while (var4_4 < qRvu.JK(qRvu.JK(object), qRvu.JK(location2))) {
            location3 = new Location((World)qRvu.JK(object), (double)var4_4, (double)qRvu.JK(object), (double)qRvu.JK(object));
            if (qRvu.JK((feCR)o.a(this, -969845418), location3) == false) {
                if (qRvu.JK((feCR)o.a(this, -1166125740), location3) == false) {
                    return false;
                }
            }
            if (var4_4 >= qRvu.JK(qRvu.JK(object), qRvu.JK(location2))) {
                object = qRvu.JK(location3);
            }
            ++var4_4;
        }
        var4_4 = qRvu.JK(qRvu.JK(object), qRvu.JK(location2));
        while (var4_4 < qRvu.JK(qRvu.JK(object), qRvu.JK(location2))) {
            location3 = new Location((World)qRvu.JK(object), (double)qRvu.JK(object), (double)var4_4, (double)qRvu.JK(object));
            if (qRvu.JK((feCR)o.a(this, -969845418), location3) == false) {
                if (qRvu.JK((feCR)o.a(this, -1166125740), location3) == false) {
                    return false;
                }
            }
            if (var4_4 >= qRvu.JK(qRvu.JK(object), qRvu.JK(location2))) {
                object = qRvu.JK(location3);
            }
            ++var4_4;
        }
        var4_4 = qRvu.JK(qRvu.JK(object), qRvu.JK(location2));
        while (var4_4 < qRvu.JK(qRvu.JK(object), qRvu.JK(location2))) {
            location3 = new Location((World)qRvu.JK(object), (double)qRvu.JK(object), (double)qRvu.JK(object), (double)var4_4);
            if (qRvu.JK((feCR)o.a(this, -969845418), location3) == false) {
                if (qRvu.JK((feCR)o.a(this, -1166125740), location3) == false) {
                    return false;
                }
            }
            if (var4_4 >= qRvu.JK(qRvu.JK(object), qRvu.JK(location2))) {
                object = qRvu.JK(location3);
            }
            ++var4_4;
        }
        return true;
    }

    public int UtIU(Location location, Location location2) {
        return (int)(qRvu.JK(qRvu.JK(location) - qRvu.JK(location2)) + qRvu.JK(qRvu.JK(location) - qRvu.JK(location2)) + qRvu.JK(qRvu.JK(location) - qRvu.JK(location2)));
    }

    public abstract void yJLS(Location var1);

    public abstract void finished();

    public abstract boolean UtIU(Location var1);

    public abstract boolean biLo(Location var1);

    static /* synthetic */ feCR yJLS(qRvu qRvu2) {
        return (feCR)o.a(qRvu2, -1166125740);
    }

    static /* synthetic */ feCR UtIU(qRvu qRvu2) {
        return (feCR)o.a(qRvu2, -969845418);
    }

    static /* synthetic */ Lhwj biLo(qRvu qRvu2) {
        return (Lhwj)o.a(qRvu2, 1539461822);
    }

    private static Object JK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

