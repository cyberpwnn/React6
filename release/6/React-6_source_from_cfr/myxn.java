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

public class myxn {
    private Location WjNN;
    private Vector OcXe;
    private Vector JCGt;

    public myxn(Location location, Vector vector, Vector vector2) {
        this.WjNN = location;
        this.OcXe = vector;
        this.JCGt = vector2;
    }

    public myxn(Location location, Vector vector) {
        this(location, new Vector(0, 0, 0), vector);
    }

    public myxn(Location location) {
        this(location, new Vector(1, 1, 1));
    }

    public boolean qArm(Location location) {
        Location location2 = this.getCenter();
        if (myxn.Jh(location) > myxn.Jh(location2) - myxn.Jh((Vector)yy.h(this, -793771597))) {
            if (myxn.Jh(location) < myxn.Jh(location2) + myxn.Jh((Vector)yy.h(this, -793771597))) {
                if (myxn.Jh(location) > myxn.Jh(location2) - myxn.Jh((Vector)yy.h(this, -793771597))) {
                    if (myxn.Jh(location) < myxn.Jh(location2) + myxn.Jh((Vector)yy.h(this, -793771597))) {
                        if (myxn.Jh(location) > myxn.Jh(location2) - myxn.Jh((Vector)yy.h(this, -793771597))) {
                            if (myxn.Jh(location) < myxn.Jh(location2) + myxn.Jh((Vector)yy.h(this, -793771597))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public Location klIi() {
        reference var1_1 = myxn.Jh() * (myxn.Jh((Vector)yy.h(this, -793771597)) * 2.0) - myxn.Jh((Vector)yy.h(this, -793771597));
        reference var3_2 = myxn.Jh() * (myxn.Jh((Vector)yy.h(this, -793771597)) * 2.0) - myxn.Jh((Vector)yy.h(this, -793771597));
        reference var5_3 = myxn.Jh() * (myxn.Jh((Vector)yy.h(this, -793771597)) * 2.0) - myxn.Jh((Vector)yy.h(this, -793771597));
        return myxn.Jh(this.getCenter(), new Vector((double)var1_1, (double)var3_2, (double)var5_3));
    }

    public Location EunR() {
        return myxn.Jh(this.getCenter(), myxn.Jh() >= 0.5 ? myxn.Jh((Vector)yy.h(this, -793771597)) : - myxn.Jh((Vector)yy.h(this, -793771597)), myxn.Jh() >= 0.5 ? myxn.Jh((Vector)yy.h(this, -793771597)) : - myxn.Jh((Vector)yy.h(this, -793771597)), myxn.Jh() >= 0.5 ? myxn.Jh((Vector)yy.h(this, -793771597)) : - myxn.Jh((Vector)yy.h(this, -793771597)));
    }

    public Location getCenter() {
        return myxn.Jh(myxn.Jh((Location)yy.h(this, -1929117260)), (Vector)yy.h(this, 450560425));
    }

    public Location getLocation() {
        return (Location)yy.h(this, -1929117260);
    }

    public Vector HLTG() {
        return (Vector)yy.h(this, 450560425);
    }

    public Vector dxVy() {
        return (Vector)yy.h(this, -793771597);
    }

    private static Object Jh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

