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

public class LqnN {
    private Location WHQb;
    private Vector FYFb;
    private Vector UBmw;

    public LqnN(Location location, Vector vector, Vector vector2) {
        this.WHQb = location;
        this.FYFb = vector;
        this.UBmw = vector2;
    }

    public LqnN(Location location, Vector vector) {
        this(location, new Vector(0, 0, 0), vector);
    }

    public LqnN(Location location) {
        this(location, new Vector(1, 1, 1));
    }

    public boolean LGKl(Location location) {
        Location location2 = this.getCenter();
        if (LqnN.qD(location) > LqnN.qD(location2) - LqnN.qD((Vector)cv.b(this, -1137051494))) {
            if (LqnN.qD(location) < LqnN.qD(location2) + LqnN.qD((Vector)cv.b(this, -1137051494))) {
                if (LqnN.qD(location) > LqnN.qD(location2) - LqnN.qD((Vector)cv.b(this, -1137051494))) {
                    if (LqnN.qD(location) < LqnN.qD(location2) + LqnN.qD((Vector)cv.b(this, -1137051494))) {
                        if (LqnN.qD(location) > LqnN.qD(location2) - LqnN.qD((Vector)cv.b(this, -1137051494))) {
                            if (LqnN.qD(location) < LqnN.qD(location2) + LqnN.qD((Vector)cv.b(this, -1137051494))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public Location Oajx() {
        reference var1_1 = LqnN.qD() * (LqnN.qD((Vector)cv.b(this, -1137051494)) * 2.0) - LqnN.qD((Vector)cv.b(this, -1137051494));
        reference var3_2 = LqnN.qD() * (LqnN.qD((Vector)cv.b(this, -1137051494)) * 2.0) - LqnN.qD((Vector)cv.b(this, -1137051494));
        reference var5_3 = LqnN.qD() * (LqnN.qD((Vector)cv.b(this, -1137051494)) * 2.0) - LqnN.qD((Vector)cv.b(this, -1137051494));
        return LqnN.qD(this.getCenter(), new Vector((double)var1_1, (double)var3_2, (double)var5_3));
    }

    public Location yRrK() {
        return LqnN.qD(this.getCenter(), LqnN.qD() >= 0.5 ? LqnN.qD((Vector)cv.b(this, -1137051494)) : - LqnN.qD((Vector)cv.b(this, -1137051494)), LqnN.qD() >= 0.5 ? LqnN.qD((Vector)cv.b(this, -1137051494)) : - LqnN.qD((Vector)cv.b(this, -1137051494)), LqnN.qD() >= 0.5 ? LqnN.qD((Vector)cv.b(this, -1137051494)) : - LqnN.qD((Vector)cv.b(this, -1137051494)));
    }

    public Location getCenter() {
        return LqnN.qD(LqnN.qD((Location)cv.b(this, 2118187141)), (Vector)cv.b(this, 6748292));
    }

    public Location getLocation() {
        return (Location)cv.b(this, 2118187141);
    }

    public Vector BKGQ() {
        return (Vector)cv.b(this, 6748292);
    }

    public Vector ofwX() {
        return (Vector)cv.b(this, -1137051494);
    }

    private static Object qD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

