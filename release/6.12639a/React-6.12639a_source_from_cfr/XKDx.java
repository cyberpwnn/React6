/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.block.BlockFace
 *  org.bukkit.entity.Entity
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

public class XKDx {
    private static /* synthetic */ int[] ywKj;
    private static /* synthetic */ int[] qpMu;

    public static Vector yJLS(nuUa nuUa2, Vector vector, double d) {
        switch (XKDx.QFSb()[XKDx.cA(nuUa2)]) {
            case 1: {
                return XKDx.yJLS(vector, d);
            }
            case 2: {
                return XKDx.UtIU(vector, d);
            }
            case 3: {
                return XKDx.biLo(vector, d);
            }
        }
        return null;
    }

    public static Vector yJLS(Vector vector, double d) {
        Object object = XKDx.cA(vector);
        Object object2 = XKDx.cA(vector);
        Object object3 = XKDx.cA(vector);
        double d2 = object == 0.0 ? 1.0 : d / object;
        return new Vector((double)(object * d2), (double)(object2 * d2), (double)(object3 * d2));
    }

    public static Vector UtIU(Vector vector, double d) {
        Object object = XKDx.cA(vector);
        Object object2 = XKDx.cA(vector);
        Object object3 = XKDx.cA(vector);
        double d2 = object2 == 0.0 ? 1.0 : d / object2;
        return new Vector((double)(object * d2), (double)(object2 * d2), (double)(object3 * d2));
    }

    public static Vector biLo(Vector vector, double d) {
        Object object = XKDx.cA(vector);
        Object object2 = XKDx.cA(vector);
        Object object3 = XKDx.cA(vector);
        double d2 = object3 == 0.0 ? 1.0 : d / object3;
        return new Vector((double)(object * d2), (double)(object2 * d2), (double)(object3 * d2));
    }

    public static Vector yJLS(Vector vector) {
        XKDx.cA(vector, - XKDx.cA(vector));
        XKDx.cA(vector, - XKDx.cA(vector));
        return vector;
    }

    public static boolean UtIU(Location location, Location location2, double d) {
        Vector vector = XKDx.VwLY(location, location2);
        Object object = XKDx.cA(location);
        if (XKDx.cA(vector, object) <= d) {
            return true;
        }
        return false;
    }

    public static Vector UtIU(Vector vector) {
        return new Vector((double)XKDx.cA(vector), (double)(- XKDx.cA(vector)), (double)XKDx.cA(vector));
    }

    public static Vector biLo(Vector vector) {
        return new Vector((double)XKDx.cA(vector), (double)XKDx.cA(vector), (double)(- XKDx.cA(vector)));
    }

    public static Vector VwLY(Vector vector) {
        return new Vector((double)(- XKDx.cA(vector)), (double)XKDx.cA(vector), (double)XKDx.cA(vector));
    }

    public static Vector TEqA(Vector vector) {
        return new Vector((double)XKDx.cA(vector), (double)XKDx.cA(vector), (double)(- XKDx.cA(vector)));
    }

    public static Vector KTiK(Vector vector) {
        return new Vector((double)XKDx.cA(vector), (double)(- XKDx.cA(vector)), (double)XKDx.cA(vector));
    }

    public static Vector GPlk(Vector vector) {
        return new Vector((double)(- XKDx.cA(vector)), (double)XKDx.cA(vector), (double)XKDx.cA(vector));
    }

    private static double TEqA(double d, int n) {
        return (double)XKDx.cA(XKDx.cA(XKDx.cA(d, n)));
    }

    public static Vector yJLS(Vector vector, int n) {
        XKDx.cA(vector, XKDx.TEqA((double)XKDx.cA(vector), n));
        XKDx.cA(vector, XKDx.TEqA((double)XKDx.cA(vector), n));
        XKDx.cA(vector, XKDx.TEqA((double)XKDx.cA(vector), n));
        return vector;
    }

    public static Vector yJLS(Vector vector, Vector vector2, double d) {
        Object object = XKDx.cA(d);
        Object object2 = XKDx.cA(vector);
        Object object3 = XKDx.cA(vector);
        Object object4 = XKDx.cA(vector);
        Object object5 = XKDx.cA(vector2);
        Object object6 = XKDx.cA(vector2);
        Object object7 = XKDx.cA(vector2);
        reference var18_10 = object5 * (object5 * object2 + object6 * object3 + object7 * object4) * (1.0 - XKDx.cA(object)) + object2 * XKDx.cA(object) + ((- object7) * object3 + object6 * object4) * XKDx.cA(object);
        reference var20_11 = object6 * (object5 * object2 + object6 * object3 + object7 * object4) * (1.0 - XKDx.cA(object)) + object3 * XKDx.cA(object) + (object7 * object2 - object5 * object4) * XKDx.cA(object);
        reference var22_12 = object7 * (object5 * object2 + object6 * object3 + object7 * object4) * (1.0 - XKDx.cA(object)) + object4 * XKDx.cA(object) + ((- object6) * object2 + object5 * object3) * XKDx.cA(object);
        return XKDx.yJLS(new Vector((double)var18_10, (double)var20_11, (double)var22_12), 4);
    }

    public static feCR<BlockFace> yJLS(BlockFace blockFace) {
        feCR<BlockFace> feCR2 = new feCR<BlockFace>();
        switch (XKDx.JSGT()[XKDx.cA(blockFace)]) {
            case 6: {
                XKDx.cA(feCR2, (BlockFace)o.k(315245003));
                break;
            }
            case 2: {
                XKDx.cA(feCR2, (BlockFace)o.k(1922515418));
                break;
            }
            case 14: {
                XKDx.cA(feCR2, (BlockFace)o.k(1922515418));
                XKDx.cA(feCR2, (BlockFace)o.k(1922515418));
                XKDx.cA(feCR2, (BlockFace)o.k(-1597685287));
                break;
            }
            case 15: {
                XKDx.cA(feCR2, (BlockFace)o.k(1922515418));
                XKDx.cA(feCR2, (BlockFace)o.k(1922515418));
                XKDx.cA(feCR2, (BlockFace)o.k(-1036828200));
                break;
            }
            case 1: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1597685287));
                break;
            }
            case 7: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1597685287));
                XKDx.cA(feCR2, (BlockFace)o.k(1922515418));
                break;
            }
            case 13: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1597685287));
                XKDx.cA(feCR2, (BlockFace)o.k(-1597685287));
                XKDx.cA(feCR2, (BlockFace)o.k(1922515418));
                break;
            }
            case 12: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1597685287));
                XKDx.cA(feCR2, (BlockFace)o.k(-1597685287));
                XKDx.cA(feCR2, (BlockFace)o.k(1460290007));
                break;
            }
            case 8: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1597685287));
                XKDx.cA(feCR2, (BlockFace)o.k(1460290007));
                break;
            }
            case 19: {
                XKDx.cA(feCR2, (BlockFace)o.k(122372566));
                break;
            }
            case 3: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1036828200));
                break;
            }
            case 9: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1036828200));
                XKDx.cA(feCR2, (BlockFace)o.k(1922515418));
                break;
            }
            case 16: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1036828200));
                XKDx.cA(feCR2, (BlockFace)o.k(-1036828200));
                XKDx.cA(feCR2, (BlockFace)o.k(1922515418));
                break;
            }
            case 17: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1036828200));
                XKDx.cA(feCR2, (BlockFace)o.k(-1036828200));
                XKDx.cA(feCR2, (BlockFace)o.k(1460290007));
                break;
            }
            case 10: {
                XKDx.cA(feCR2, (BlockFace)o.k(-1036828200));
                XKDx.cA(feCR2, (BlockFace)o.k(1460290007));
                break;
            }
            case 5: {
                XKDx.cA(feCR2, (BlockFace)o.k(1715290581));
                break;
            }
            case 4: {
                XKDx.cA(feCR2, (BlockFace)o.k(1460290007));
                break;
            }
            case 11: {
                XKDx.cA(feCR2, (BlockFace)o.k(1460290007));
                XKDx.cA(feCR2, (BlockFace)o.k(1460290007));
                XKDx.cA(feCR2, (BlockFace)o.k(-1597685287));
                break;
            }
            case 18: {
                XKDx.cA(feCR2, (BlockFace)o.k(1460290007));
                XKDx.cA(feCR2, (BlockFace)o.k(1460290007));
                XKDx.cA(feCR2, (BlockFace)o.k(-1036828200));
            }
        }
        return feCR2;
    }

    public static Vector VwLY(Location location, Location location2) {
        return XKDx.cA(XKDx.cA(XKDx.cA(XKDx.cA(location2), XKDx.cA(location))));
    }

    public static Vector TEqA(Location location, Location location2) {
        return XKDx.cA(XKDx.cA(XKDx.cA(location2), XKDx.cA(location)));
    }

    public static Vector yJLS(float f, float f2) {
        return new Vector((double)(XKDx.cA(f2) * XKDx.cA(f)), (double)XKDx.cA(f2), (double)(XKDx.cA(f2) * XKDx.cA(- f)));
    }

    public static void yJLS(Entity entity, Vector vector) {
        XKDx.yJLS(entity, vector, 1.0);
    }

    public static void yJLS(Entity entity, Vector vector, double d) {
        Vector vector2 = entity.getVelocity();
        XKDx.cA(vector2, XKDx.cA(XKDx.cA(vector), d));
        entity.setVelocity(vector2);
    }

    public static Vector ktHX(Vector vector) {
        if (XKDx.cA(vector) != 0.0) {
            XKDx.cA(vector, - XKDx.cA(vector));
        }
        if (XKDx.cA(vector) != 0.0) {
            XKDx.cA(vector, - XKDx.cA(vector));
        }
        if (XKDx.cA(vector) != 0.0) {
            XKDx.cA(vector, - XKDx.cA(vector));
        }
        return vector;
    }

    public static double HeSD(Vector vector) {
        Vector vector2 = new Vector(0, 0, 0);
        Object object = XKDx.cA(new Vector(0, 0, 0), vector);
        return (double)XKDx.cA(vector2, object);
    }

    public static feCR<Vector> yJLS(Vector vector, feCR<Vector> feCR2) {
        return new feCR<Vector>((List<Vector>)XKDx.cA(new XKDx$1(vector), feCR2));
    }

    public static BlockFace Ipep(Vector vector) {
        BlockFace blockFace;
        Vector vector2 = XKDx.qcvH(vector);
        BlockFace[] arrblockFace = (BlockFace[])XKDx.cA();
        int n = arrblockFace.length;
        int n2 = 0;
        while (n2 < n) {
            blockFace = arrblockFace[n2];
            if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) {
                if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) {
                    if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) {
                        return blockFace;
                    }
                }
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])XKDx.cA();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            blockFace = arrblockFace[n2];
            if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) {
                if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) {
                    return blockFace;
                }
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])XKDx.cA();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            blockFace = arrblockFace[n2];
            if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) {
                if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) {
                    return blockFace;
                }
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])XKDx.cA();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            block19 : {
                block18 : {
                    blockFace = arrblockFace[n2];
                    if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) break block18;
                    if (XKDx.cA(vector2) != (Object)XKDx.cA(blockFace)) break block19;
                }
                return blockFace;
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])XKDx.cA();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            block21 : {
                block20 : {
                    blockFace = arrblockFace[n2];
                    if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) break block20;
                    if (XKDx.cA(vector2) == (Object)XKDx.cA(blockFace)) break block20;
                    if (XKDx.cA(vector2) != (Object)XKDx.cA(blockFace)) break block21;
                }
                return blockFace;
            }
            ++n2;
        }
        return null;
    }

    public static Vector yJLS(Vector vector, float f) {
        Location location = new Location((World)XKDx.cA().get(0), 0.0, 0.0, 0.0);
        XKDx.cA(location, vector);
        Object object = XKDx.cA(location);
        Object object2 = XKDx.cA(location);
        LOpQ lOpQ = new LOpQ(360.0);
        LOpQ lOpQ2 = new LOpQ(180.0);
        XKDx.cA(lOpQ, object);
        XKDx.cA(lOpQ2, object2);
        XKDx.cA(lOpQ, f);
        XKDx.cA(location, XKDx.cA(lOpQ));
        XKDx.cA(location, XKDx.cA(lOpQ2));
        return XKDx.cA(location);
    }

    public static Vector UtIU(Vector vector, float f) {
        Location location = new Location((World)XKDx.cA().get(0), 0.0, 0.0, 0.0);
        XKDx.cA(location, vector);
        Object object = XKDx.cA(location);
        Object object2 = XKDx.cA(location);
        LOpQ lOpQ = new LOpQ(360.0);
        LOpQ lOpQ2 = new LOpQ(180.0);
        XKDx.cA(lOpQ, object);
        XKDx.cA(lOpQ2, object2);
        XKDx.cA(lOpQ, f);
        XKDx.cA(location, XKDx.cA(lOpQ));
        XKDx.cA(location, XKDx.cA(lOpQ2));
        return XKDx.cA(location);
    }

    public static Vector biLo(Vector vector, float f) {
        Location location = new Location((World)XKDx.cA().get(0), 0.0, 0.0, 0.0);
        XKDx.cA(location, vector);
        Object object = XKDx.cA(location);
        Object object2 = XKDx.cA(location);
        LOpQ lOpQ = new LOpQ(360.0);
        XKDx.cA(lOpQ, object);
        XKDx.cA(location, XKDx.cA(lOpQ));
        XKDx.cA(location, XKDx.cA(-90.0f, object2 - f));
        return XKDx.cA(location);
    }

    public static Vector VwLY(Vector vector, float f) {
        Location location = new Location((World)XKDx.cA().get(0), 0.0, 0.0, 0.0);
        XKDx.cA(location, vector);
        Object object = XKDx.cA(location);
        Object object2 = XKDx.cA(location);
        LOpQ lOpQ = new LOpQ(360.0);
        XKDx.cA(lOpQ, object);
        XKDx.cA(location, XKDx.cA(lOpQ));
        XKDx.cA(location, XKDx.cA(90.0f, object2 + f));
        return XKDx.cA(location);
    }

    public static Vector qcvH(Vector vector) {
        Object object = XKDx.cA(vector);
        XKDx.cA(object);
        if (XKDx.cA(object) > 0.333) {
            XKDx.cA(object, true);
        } else if (XKDx.cA(object) < -0.333) {
            XKDx.cA(object, -1);
        } else {
            XKDx.cA(object, false);
        }
        if (XKDx.cA(object) > 0.333) {
            XKDx.cA(object, true);
        } else if (XKDx.cA(object) < -0.333) {
            XKDx.cA(object, -1);
        } else {
            XKDx.cA(object, false);
        }
        if (XKDx.cA(object) > 0.333) {
            XKDx.cA(object, true);
        } else if (XKDx.cA(object) < -0.333) {
            XKDx.cA(object, -1);
        } else {
            XKDx.cA(object, false);
        }
        return object;
    }

    static /* synthetic */ int[] QFSb() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(1834828229);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((nuUa[])XKDx.cA()).length];
        try {
            arrn[XKDx.cA((nuUa)o.k((int)-1743766990))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((nuUa)o.k((int)2038774321))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((nuUa)o.k((int)-1500104144))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(1834828229, arrn3);
        return arrn3;
    }

    static /* synthetic */ int[] JSGT() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(-899661372);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((BlockFace[])XKDx.cA()).length];
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)315245003))] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)1922515418))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)-1515830845))] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)1587298738))] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)-1597685287))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)-460832335))] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)2002338224))] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)897008047))] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)-1916911186))] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)122372566))] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)-1036828200))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)284311981))] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)-170049108))] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)-1023589973))] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)82657722))] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)1715290581))] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)1460290007))] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)264782265))] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[XKDx.cA((BlockFace)o.k((int)699482552))] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(-899661372, arrn3);
        return arrn3;
    }

    private static Object cA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

