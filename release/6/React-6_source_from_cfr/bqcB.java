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

public abstract class bqcB {
    private wfPa<Location> xPRO = new wfPa();
    private wfPa<Location> hRDm = new wfPa();
    private QyFw<Location> xqsu = new QyFw();

    public bqcB(int n, int n2, Location location) {
        Object object = bqcB.Wt(bqcB.Wt(location), new Vector(n, n, n));
        Object object2 = bqcB.Wt(bqcB.Wt(location), new Vector(- n, - n, - n));
        gWIG gWIG2 = new gWIG((Location)object, (Location)object2);
        Object object3 = bqcB.Wt(gWIG2);
        new bqcB$1(this, (Iterator)object3, location, n2);
    }

    public boolean ssNb(Location location, Location location2) {
        Location location3;
        Object object = bqcB.Wt(location);
        reference var4_4 = bqcB.Wt(bqcB.Wt(object), bqcB.Wt(location2));
        do {
            if (var4_4 >= bqcB.Wt(bqcB.Wt(object), bqcB.Wt(location2))) break;
            location3 = new Location((World)bqcB.Wt(object), (double)var4_4, (double)bqcB.Wt(object), (double)bqcB.Wt(object));
            if (bqcB.Wt((wfPa)cv.b(this, -1214384884), location3) == false) {
                if (bqcB.Wt((wfPa)cv.b(this, -1439566577), location3) == false) {
                    return false;
                }
            }
            if (var4_4 >= bqcB.Wt(bqcB.Wt(object), bqcB.Wt(location2))) {
                object = bqcB.Wt(location3);
            }
            ++var4_4;
        } while (true);
        var4_4 = bqcB.Wt(bqcB.Wt(object), bqcB.Wt(location2));
        do {
            if (var4_4 >= bqcB.Wt(bqcB.Wt(object), bqcB.Wt(location2))) break;
            location3 = new Location((World)bqcB.Wt(object), (double)bqcB.Wt(object), (double)var4_4, (double)bqcB.Wt(object));
            if (bqcB.Wt((wfPa)cv.b(this, -1214384884), location3) == false) {
                if (bqcB.Wt((wfPa)cv.b(this, -1439566577), location3) == false) {
                    return false;
                }
            }
            if (var4_4 >= bqcB.Wt(bqcB.Wt(object), bqcB.Wt(location2))) {
                object = bqcB.Wt(location3);
            }
            ++var4_4;
        } while (true);
        var4_4 = bqcB.Wt(bqcB.Wt(object), bqcB.Wt(location2));
        do {
            if (var4_4 >= bqcB.Wt(bqcB.Wt(object), bqcB.Wt(location2))) break;
            location3 = new Location((World)bqcB.Wt(object), (double)bqcB.Wt(object), (double)bqcB.Wt(object), (double)var4_4);
            if (bqcB.Wt((wfPa)cv.b(this, -1214384884), location3) == false) {
                if (bqcB.Wt((wfPa)cv.b(this, -1439566577), location3) == false) {
                    return false;
                }
            }
            if (var4_4 >= bqcB.Wt(bqcB.Wt(object), bqcB.Wt(location2))) {
                object = bqcB.Wt(location3);
            }
            ++var4_4;
        } while (true);
        return true;
    }

    public int DYFV(Location location, Location location2) {
        return (int)(bqcB.Wt(bqcB.Wt(location) - bqcB.Wt(location2)) + bqcB.Wt(bqcB.Wt(location) - bqcB.Wt(location2)) + bqcB.Wt(bqcB.Wt(location) - bqcB.Wt(location2)));
    }

    public abstract void IWSm(Location var1);

    public abstract void finished();

    public abstract boolean ssNb(Location var1);

    public abstract boolean DYFV(Location var1);

    static /* synthetic */ wfPa ssNb(bqcB bqcB2) {
        return (wfPa)cv.b(bqcB2, -1439566577);
    }

    static /* synthetic */ wfPa DYFV(bqcB bqcB2) {
        return (wfPa)cv.b(bqcB2, -1214384884);
    }

    static /* synthetic */ QyFw IWSm(bqcB bqcB2) {
        return (QyFw)cv.b(bqcB2, 1518793992);
    }

    private static Object Wt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

