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

public abstract class Nwie {
    private PBUD<Location> uWdh = new PBUD();
    private PBUD<Location> GQam = new PBUD();
    private hGxw<Location> QElt = new hGxw();

    public Nwie(int n, int n2, Location location) {
        Object object = Nwie.UN(Nwie.UN(location), new Vector(n, n, n));
        Object object2 = Nwie.UN(Nwie.UN(location), new Vector(- n, - n, - n));
        FVfT fVfT = new FVfT((Location)object, (Location)object2);
        Object object3 = Nwie.UN(fVfT);
        new Nwie$1(this, (Iterator)object3, location, n2);
    }

    public boolean mXJp(Location location, Location location2) {
        Location location3;
        Object object = Nwie.UN(location);
        reference var4_4 = Nwie.UN(Nwie.UN(object), Nwie.UN(location2));
        do {
            if (var4_4 >= Nwie.UN(Nwie.UN(object), Nwie.UN(location2))) break;
            location3 = new Location((World)Nwie.UN(object), (double)var4_4, (double)Nwie.UN(object), (double)Nwie.UN(object));
            if (Nwie.UN((PBUD)yy.h(this, 399567226), location3) == false) {
                if (Nwie.UN((PBUD)yy.h(this, -653399697), location3) == false) {
                    return false;
                }
            }
            if (var4_4 >= Nwie.UN(Nwie.UN(object), Nwie.UN(location2))) {
                object = Nwie.UN(location3);
            }
            ++var4_4;
        } while (true);
        var4_4 = Nwie.UN(Nwie.UN(object), Nwie.UN(location2));
        do {
            if (var4_4 >= Nwie.UN(Nwie.UN(object), Nwie.UN(location2))) break;
            location3 = new Location((World)Nwie.UN(object), (double)Nwie.UN(object), (double)var4_4, (double)Nwie.UN(object));
            if (Nwie.UN((PBUD)yy.h(this, 399567226), location3) == false) {
                if (Nwie.UN((PBUD)yy.h(this, -653399697), location3) == false) {
                    return false;
                }
            }
            if (var4_4 >= Nwie.UN(Nwie.UN(object), Nwie.UN(location2))) {
                object = Nwie.UN(location3);
            }
            ++var4_4;
        } while (true);
        var4_4 = Nwie.UN(Nwie.UN(object), Nwie.UN(location2));
        do {
            if (var4_4 >= Nwie.UN(Nwie.UN(object), Nwie.UN(location2))) break;
            location3 = new Location((World)Nwie.UN(object), (double)Nwie.UN(object), (double)Nwie.UN(object), (double)var4_4);
            if (Nwie.UN((PBUD)yy.h(this, 399567226), location3) == false) {
                if (Nwie.UN((PBUD)yy.h(this, -653399697), location3) == false) {
                    return false;
                }
            }
            if (var4_4 >= Nwie.UN(Nwie.UN(object), Nwie.UN(location2))) {
                object = Nwie.UN(location3);
            }
            ++var4_4;
        } while (true);
        return true;
    }

    public int ksfs(Location location, Location location2) {
        return (int)(Nwie.UN(Nwie.UN(location) - Nwie.UN(location2)) + Nwie.UN(Nwie.UN(location) - Nwie.UN(location2)) + Nwie.UN(Nwie.UN(location) - Nwie.UN(location2)));
    }

    public abstract void yJLL(Location var1);

    public abstract void finished();

    public abstract boolean mXJp(Location var1);

    public abstract boolean ksfs(Location var1);

    static /* synthetic */ PBUD mXJp(Nwie nwie) {
        return (PBUD)yy.h(nwie, -653399697);
    }

    static /* synthetic */ PBUD ksfs(Nwie nwie) {
        return (PBUD)yy.h(nwie, 399567226);
    }

    static /* synthetic */ hGxw yJLL(Nwie nwie) {
        return (hGxw)yy.h(nwie, 271771966);
    }

    private static Object UN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

