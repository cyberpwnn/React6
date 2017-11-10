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

public class jqQA {
    private static /* synthetic */ int[] afrc;
    private static /* synthetic */ int[] HESB;

    public static Vector mXJp(AWvK aWvK, Vector vector, double d) {
        switch (jqQA.pirH()[jqQA.sE(aWvK)]) {
            case 1: {
                return jqQA.mXJp(vector, d);
            }
            case 2: {
                return jqQA.ksfs(vector, d);
            }
            case 3: {
                return jqQA.yJLL(vector, d);
            }
        }
        return null;
    }

    public static Vector mXJp(Vector vector, double d) {
        Object object = jqQA.sE(vector);
        Object object2 = jqQA.sE(vector);
        Object object3 = jqQA.sE(vector);
        double d2 = object == 0.0 ? 1.0 : d / object;
        return new Vector((double)(object * d2), (double)(object2 * d2), (double)(object3 * d2));
    }

    public static Vector ksfs(Vector vector, double d) {
        Object object = jqQA.sE(vector);
        Object object2 = jqQA.sE(vector);
        Object object3 = jqQA.sE(vector);
        double d2 = object2 == 0.0 ? 1.0 : d / object2;
        return new Vector((double)(object * d2), (double)(object2 * d2), (double)(object3 * d2));
    }

    public static Vector yJLL(Vector vector, double d) {
        Object object = jqQA.sE(vector);
        Object object2 = jqQA.sE(vector);
        Object object3 = jqQA.sE(vector);
        double d2 = object3 == 0.0 ? 1.0 : d / object3;
        return new Vector((double)(object * d2), (double)(object2 * d2), (double)(object3 * d2));
    }

    public static Vector mXJp(Vector vector) {
        jqQA.sE(vector, - jqQA.sE(vector));
        jqQA.sE(vector, - jqQA.sE(vector));
        return vector;
    }

    public static boolean ksfs(Location location, Location location2, double d) {
        Vector vector = jqQA.SnBs(location, location2);
        Object object = jqQA.sE(location);
        if (jqQA.sE(vector, object) <= d) {
            return true;
        }
        return false;
    }

    public static Vector ksfs(Vector vector) {
        return new Vector((double)jqQA.sE(vector), (double)(- jqQA.sE(vector)), (double)jqQA.sE(vector));
    }

    public static Vector yJLL(Vector vector) {
        return new Vector((double)jqQA.sE(vector), (double)jqQA.sE(vector), (double)(- jqQA.sE(vector)));
    }

    public static Vector SnBs(Vector vector) {
        return new Vector((double)(- jqQA.sE(vector)), (double)jqQA.sE(vector), (double)jqQA.sE(vector));
    }

    public static Vector qdWJ(Vector vector) {
        return new Vector((double)jqQA.sE(vector), (double)jqQA.sE(vector), (double)(- jqQA.sE(vector)));
    }

    public static Vector JRFt(Vector vector) {
        return new Vector((double)jqQA.sE(vector), (double)(- jqQA.sE(vector)), (double)jqQA.sE(vector));
    }

    public static Vector halY(Vector vector) {
        return new Vector((double)(- jqQA.sE(vector)), (double)jqQA.sE(vector), (double)jqQA.sE(vector));
    }

    private static double qdWJ(double d, int n) {
        return (double)jqQA.sE(jqQA.sE(jqQA.sE(d, n)));
    }

    public static Vector mXJp(Vector vector, int n) {
        jqQA.sE(vector, jqQA.qdWJ((double)jqQA.sE(vector), n));
        jqQA.sE(vector, jqQA.qdWJ((double)jqQA.sE(vector), n));
        jqQA.sE(vector, jqQA.qdWJ((double)jqQA.sE(vector), n));
        return vector;
    }

    public static Vector mXJp(Vector vector, Vector vector2, double d) {
        Object object = jqQA.sE(d);
        Object object2 = jqQA.sE(vector);
        Object object3 = jqQA.sE(vector);
        Object object4 = jqQA.sE(vector);
        Object object5 = jqQA.sE(vector2);
        Object object6 = jqQA.sE(vector2);
        Object object7 = jqQA.sE(vector2);
        reference var18_10 = object5 * (object5 * object2 + object6 * object3 + object7 * object4) * (1.0 - jqQA.sE(object)) + object2 * jqQA.sE(object) + ((- object7) * object3 + object6 * object4) * jqQA.sE(object);
        reference var20_11 = object6 * (object5 * object2 + object6 * object3 + object7 * object4) * (1.0 - jqQA.sE(object)) + object3 * jqQA.sE(object) + (object7 * object2 - object5 * object4) * jqQA.sE(object);
        reference var22_12 = object7 * (object5 * object2 + object6 * object3 + object7 * object4) * (1.0 - jqQA.sE(object)) + object4 * jqQA.sE(object) + ((- object6) * object2 + object5 * object3) * jqQA.sE(object);
        return jqQA.mXJp(new Vector((double)var18_10, (double)var20_11, (double)var22_12), 4);
    }

    public static PBUD<BlockFace> mXJp(BlockFace blockFace) {
        PBUD<BlockFace> pBUD = new PBUD<BlockFace>();
        switch (jqQA.eiwi()[jqQA.sE(blockFace)]) {
            case 6: {
                jqQA.sE(pBUD, (BlockFace)yy.p(-620625480));
                break;
            }
            case 2: {
                jqQA.sE(pBUD, (BlockFace)yy.p(861340045));
                break;
            }
            case 14: {
                jqQA.sE(pBUD, (BlockFace)yy.p(861340045));
                jqQA.sE(pBUD, (BlockFace)yy.p(861340045));
                jqQA.sE(pBUD, (BlockFace)yy.p(425197958));
                break;
            }
            case 15: {
                jqQA.sE(pBUD, (BlockFace)yy.p(861340045));
                jqQA.sE(pBUD, (BlockFace)yy.p(861340045));
                jqQA.sE(pBUD, (BlockFace)yy.p(-1154285173));
                break;
            }
            case 1: {
                jqQA.sE(pBUD, (BlockFace)yy.p(425197958));
                break;
            }
            case 7: {
                jqQA.sE(pBUD, (BlockFace)yy.p(425197958));
                jqQA.sE(pBUD, (BlockFace)yy.p(861340045));
                break;
            }
            case 13: {
                jqQA.sE(pBUD, (BlockFace)yy.p(425197958));
                jqQA.sE(pBUD, (BlockFace)yy.p(425197958));
                jqQA.sE(pBUD, (BlockFace)yy.p(861340045));
                break;
            }
            case 12: {
                jqQA.sE(pBUD, (BlockFace)yy.p(425197958));
                jqQA.sE(pBUD, (BlockFace)yy.p(425197958));
                jqQA.sE(pBUD, (BlockFace)yy.p(2127036812));
                break;
            }
            case 8: {
                jqQA.sE(pBUD, (BlockFace)yy.p(425197958));
                jqQA.sE(pBUD, (BlockFace)yy.p(2127036812));
                break;
            }
            case 19: {
                jqQA.sE(pBUD, (BlockFace)yy.p(-1780809343));
                break;
            }
            case 3: {
                jqQA.sE(pBUD, (BlockFace)yy.p(-1154285173));
                break;
            }
            case 9: {
                jqQA.sE(pBUD, (BlockFace)yy.p(-1154285173));
                jqQA.sE(pBUD, (BlockFace)yy.p(861340045));
                break;
            }
            case 16: {
                jqQA.sE(pBUD, (BlockFace)yy.p(-1154285173));
                jqQA.sE(pBUD, (BlockFace)yy.p(-1154285173));
                jqQA.sE(pBUD, (BlockFace)yy.p(861340045));
                break;
            }
            case 17: {
                jqQA.sE(pBUD, (BlockFace)yy.p(-1154285173));
                jqQA.sE(pBUD, (BlockFace)yy.p(-1154285173));
                jqQA.sE(pBUD, (BlockFace)yy.p(2127036812));
                break;
            }
            case 10: {
                jqQA.sE(pBUD, (BlockFace)yy.p(-1154285173));
                jqQA.sE(pBUD, (BlockFace)yy.p(2127036812));
                break;
            }
            case 5: {
                jqQA.sE(pBUD, (BlockFace)yy.p(585630090));
                break;
            }
            case 4: {
                jqQA.sE(pBUD, (BlockFace)yy.p(2127036812));
                break;
            }
            case 11: {
                jqQA.sE(pBUD, (BlockFace)yy.p(2127036812));
                jqQA.sE(pBUD, (BlockFace)yy.p(2127036812));
                jqQA.sE(pBUD, (BlockFace)yy.p(425197958));
                break;
            }
            case 18: {
                jqQA.sE(pBUD, (BlockFace)yy.p(2127036812));
                jqQA.sE(pBUD, (BlockFace)yy.p(2127036812));
                jqQA.sE(pBUD, (BlockFace)yy.p(-1154285173));
            }
        }
        return pBUD;
    }

    public static Vector SnBs(Location location, Location location2) {
        return jqQA.sE(jqQA.sE(jqQA.sE(jqQA.sE(location2), jqQA.sE(location))));
    }

    public static Vector qdWJ(Location location, Location location2) {
        return jqQA.sE(jqQA.sE(jqQA.sE(location2), jqQA.sE(location)));
    }

    public static Vector mXJp(float f, float f2) {
        return new Vector((double)(jqQA.sE(f2) * jqQA.sE(f)), (double)jqQA.sE(f2), (double)(jqQA.sE(f2) * jqQA.sE(- f)));
    }

    public static void mXJp(Entity entity, Vector vector) {
        jqQA.mXJp(entity, vector, 1.0);
    }

    public static void mXJp(Entity entity, Vector vector, double d) {
        Vector vector2 = entity.getVelocity();
        jqQA.sE(vector2, jqQA.sE(jqQA.sE(vector), d));
        entity.setVelocity(vector2);
    }

    public static Vector ssMm(Vector vector) {
        if (jqQA.sE(vector) != 0.0) {
            jqQA.sE(vector, - jqQA.sE(vector));
        }
        if (jqQA.sE(vector) != 0.0) {
            jqQA.sE(vector, - jqQA.sE(vector));
        }
        if (jqQA.sE(vector) != 0.0) {
            jqQA.sE(vector, - jqQA.sE(vector));
        }
        return vector;
    }

    public static double yIkI(Vector vector) {
        Vector vector2 = new Vector(0, 0, 0);
        Object object = jqQA.sE(new Vector(0, 0, 0), vector);
        return (double)jqQA.sE(vector2, object);
    }

    public static PBUD<Vector> mXJp(Vector vector, PBUD<Vector> pBUD) {
        return new PBUD<Vector>((List<Vector>)jqQA.sE(new jqQA$1(vector), pBUD));
    }

    public static BlockFace CVAs(Vector vector) {
        BlockFace blockFace;
        Vector vector2 = jqQA.qAsQ(vector);
        BlockFace[] arrblockFace = (BlockFace[])jqQA.sE();
        int n = arrblockFace.length;
        int n2 = 0;
        while (n2 < n) {
            blockFace = arrblockFace[n2];
            if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) {
                if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) {
                    if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) {
                        return blockFace;
                    }
                }
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])jqQA.sE();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            blockFace = arrblockFace[n2];
            if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) {
                if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) {
                    return blockFace;
                }
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])jqQA.sE();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            blockFace = arrblockFace[n2];
            if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) {
                if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) {
                    return blockFace;
                }
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])jqQA.sE();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            block19 : {
                block18 : {
                    blockFace = arrblockFace[n2];
                    if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) break block18;
                    if (jqQA.sE(vector2) != (Object)jqQA.sE(blockFace)) break block19;
                }
                return blockFace;
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])jqQA.sE();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            block21 : {
                block20 : {
                    blockFace = arrblockFace[n2];
                    if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) break block20;
                    if (jqQA.sE(vector2) == (Object)jqQA.sE(blockFace)) break block20;
                    if (jqQA.sE(vector2) != (Object)jqQA.sE(blockFace)) break block21;
                }
                return blockFace;
            }
            ++n2;
        }
        return null;
    }

    public static Vector mXJp(Vector vector, float f) {
        Location location = new Location((World)jqQA.sE().get(0), 0.0, 0.0, 0.0);
        jqQA.sE(location, vector);
        Object object = jqQA.sE(location);
        Object object2 = jqQA.sE(location);
        GbYt gbYt = new GbYt(360.0);
        GbYt gbYt2 = new GbYt(180.0);
        jqQA.sE(gbYt, object);
        jqQA.sE(gbYt2, object2);
        jqQA.sE(gbYt, f);
        jqQA.sE(location, jqQA.sE(gbYt));
        jqQA.sE(location, jqQA.sE(gbYt2));
        return jqQA.sE(location);
    }

    public static Vector ksfs(Vector vector, float f) {
        Location location = new Location((World)jqQA.sE().get(0), 0.0, 0.0, 0.0);
        jqQA.sE(location, vector);
        Object object = jqQA.sE(location);
        Object object2 = jqQA.sE(location);
        GbYt gbYt = new GbYt(360.0);
        GbYt gbYt2 = new GbYt(180.0);
        jqQA.sE(gbYt, object);
        jqQA.sE(gbYt2, object2);
        jqQA.sE(gbYt, f);
        jqQA.sE(location, jqQA.sE(gbYt));
        jqQA.sE(location, jqQA.sE(gbYt2));
        return jqQA.sE(location);
    }

    public static Vector yJLL(Vector vector, float f) {
        Location location = new Location((World)jqQA.sE().get(0), 0.0, 0.0, 0.0);
        jqQA.sE(location, vector);
        Object object = jqQA.sE(location);
        Object object2 = jqQA.sE(location);
        GbYt gbYt = new GbYt(360.0);
        jqQA.sE(gbYt, object);
        jqQA.sE(location, jqQA.sE(gbYt));
        jqQA.sE(location, jqQA.sE(-90.0f, object2 - f));
        return jqQA.sE(location);
    }

    public static Vector SnBs(Vector vector, float f) {
        Location location = new Location((World)jqQA.sE().get(0), 0.0, 0.0, 0.0);
        jqQA.sE(location, vector);
        Object object = jqQA.sE(location);
        Object object2 = jqQA.sE(location);
        GbYt gbYt = new GbYt(360.0);
        jqQA.sE(gbYt, object);
        jqQA.sE(location, jqQA.sE(gbYt));
        jqQA.sE(location, jqQA.sE(90.0f, object2 + f));
        return jqQA.sE(location);
    }

    public static Vector qAsQ(Vector vector) {
        Object object = jqQA.sE(vector);
        jqQA.sE(object);
        if (jqQA.sE(object) > 0.333) {
            jqQA.sE(object, true);
        } else if (jqQA.sE(object) < -0.333) {
            jqQA.sE(object, -1);
        } else {
            jqQA.sE(object, false);
        }
        if (jqQA.sE(object) > 0.333) {
            jqQA.sE(object, true);
        } else if (jqQA.sE(object) < -0.333) {
            jqQA.sE(object, -1);
        } else {
            jqQA.sE(object, false);
        }
        if (jqQA.sE(object) > 0.333) {
            jqQA.sE(object, true);
        } else if (jqQA.sE(object) < -0.333) {
            jqQA.sE(object, -1);
        } else {
            jqQA.sE(object, false);
        }
        return object;
    }

    static /* synthetic */ int[] pirH() {
        int[] arrn;
        int[] arrn2 = (int[])yy.p(845283802);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((AWvK[])jqQA.sE()).length];
        try {
            arrn[jqQA.sE((AWvK)yy.p((int)-1284373536))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((AWvK)yy.p((int)-1811152075))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((AWvK)yy.p((int)-719125714))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        yy.K(845283802, arrn3);
        return arrn3;
    }

    static /* synthetic */ int[] eiwi() {
        int[] arrn;
        int[] arrn2 = (int[])yy.p(-1657798193);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((BlockFace[])jqQA.sE()).length];
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-620625480))] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)861340045))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)1194394064))] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-871562843))] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)425197958))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-1354563170))] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)43647395))] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)737542564))] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-886308391))] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-1780809343))] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-1154285173))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)205128098))] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-1162804777))] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)59507160))] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-143916627))] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)585630090))] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)2127036812))] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-1773731418))] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[jqQA.sE((BlockFace)yy.p((int)-1940520533))] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        yy.K(-1657798193, arrn3);
        return arrn3;
    }

    private static Object sE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

