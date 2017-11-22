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

public class TNqe {
    private static /* synthetic */ int[] mrno;
    private static /* synthetic */ int[] CXLb;

    public static Vector ssNb(mrKm mrKm2, Vector vector, double d) {
        switch (TNqe.ydSf()[TNqe.ps(mrKm2)]) {
            case 1: {
                return TNqe.ssNb(vector, d);
            }
            case 2: {
                return TNqe.DYFV(vector, d);
            }
            case 3: {
                return TNqe.IWSm(vector, d);
            }
        }
        return null;
    }

    public static Vector ssNb(Vector vector, double d) {
        Object object = TNqe.ps(vector);
        Object object2 = TNqe.ps(vector);
        Object object3 = TNqe.ps(vector);
        double d2 = object == 0.0 ? 1.0 : d / object;
        return new Vector((double)(object * d2), (double)(object2 * d2), (double)(object3 * d2));
    }

    public static Vector DYFV(Vector vector, double d) {
        Object object = TNqe.ps(vector);
        Object object2 = TNqe.ps(vector);
        Object object3 = TNqe.ps(vector);
        double d2 = object2 == 0.0 ? 1.0 : d / object2;
        return new Vector((double)(object * d2), (double)(object2 * d2), (double)(object3 * d2));
    }

    public static Vector IWSm(Vector vector, double d) {
        Object object = TNqe.ps(vector);
        Object object2 = TNqe.ps(vector);
        Object object3 = TNqe.ps(vector);
        double d2 = object3 == 0.0 ? 1.0 : d / object3;
        return new Vector((double)(object * d2), (double)(object2 * d2), (double)(object3 * d2));
    }

    public static Vector ssNb(Vector vector) {
        TNqe.ps(vector, - TNqe.ps(vector));
        TNqe.ps(vector, - TNqe.ps(vector));
        return vector;
    }

    public static boolean DYFV(Location location, Location location2, double d) {
        Vector vector = TNqe.OXeK(location, location2);
        Object object = TNqe.ps(location);
        if (TNqe.ps(vector, object) <= d) {
            return true;
        }
        return false;
    }

    public static Vector DYFV(Vector vector) {
        return new Vector((double)TNqe.ps(vector), (double)(- TNqe.ps(vector)), (double)TNqe.ps(vector));
    }

    public static Vector IWSm(Vector vector) {
        return new Vector((double)TNqe.ps(vector), (double)TNqe.ps(vector), (double)(- TNqe.ps(vector)));
    }

    public static Vector OXeK(Vector vector) {
        return new Vector((double)(- TNqe.ps(vector)), (double)TNqe.ps(vector), (double)TNqe.ps(vector));
    }

    public static Vector YoSa(Vector vector) {
        return new Vector((double)TNqe.ps(vector), (double)TNqe.ps(vector), (double)(- TNqe.ps(vector)));
    }

    public static Vector jhSt(Vector vector) {
        return new Vector((double)TNqe.ps(vector), (double)(- TNqe.ps(vector)), (double)TNqe.ps(vector));
    }

    public static Vector BkpW(Vector vector) {
        return new Vector((double)(- TNqe.ps(vector)), (double)TNqe.ps(vector), (double)TNqe.ps(vector));
    }

    private static double YoSa(double d, int n) {
        return (double)TNqe.ps(TNqe.ps(TNqe.ps(d, n)));
    }

    public static Vector ssNb(Vector vector, int n) {
        TNqe.ps(vector, TNqe.YoSa((double)TNqe.ps(vector), n));
        TNqe.ps(vector, TNqe.YoSa((double)TNqe.ps(vector), n));
        TNqe.ps(vector, TNqe.YoSa((double)TNqe.ps(vector), n));
        return vector;
    }

    public static Vector ssNb(Vector vector, Vector vector2, double d) {
        Object object = TNqe.ps(d);
        Object object2 = TNqe.ps(vector);
        Object object3 = TNqe.ps(vector);
        Object object4 = TNqe.ps(vector);
        Object object5 = TNqe.ps(vector2);
        Object object6 = TNqe.ps(vector2);
        Object object7 = TNqe.ps(vector2);
        reference var18_10 = object5 * (object5 * object2 + object6 * object3 + object7 * object4) * (1.0 - TNqe.ps(object)) + object2 * TNqe.ps(object) + ((- object7) * object3 + object6 * object4) * TNqe.ps(object);
        reference var20_11 = object6 * (object5 * object2 + object6 * object3 + object7 * object4) * (1.0 - TNqe.ps(object)) + object3 * TNqe.ps(object) + (object7 * object2 - object5 * object4) * TNqe.ps(object);
        reference var22_12 = object7 * (object5 * object2 + object6 * object3 + object7 * object4) * (1.0 - TNqe.ps(object)) + object4 * TNqe.ps(object) + ((- object6) * object2 + object5 * object3) * TNqe.ps(object);
        return TNqe.ssNb(new Vector((double)var18_10, (double)var20_11, (double)var22_12), 4);
    }

    public static wfPa<BlockFace> ssNb(BlockFace blockFace) {
        wfPa<BlockFace> wfPa2 = new wfPa<BlockFace>();
        switch (TNqe.GcEw()[TNqe.ps(blockFace)]) {
            case 6: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(216856695));
                break;
            }
            case 2: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(1382611062));
                break;
            }
            case 14: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(1382611062));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1382611062));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1388705905));
                break;
            }
            case 15: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(1382611062));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1382611062));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-322439056));
                break;
            }
            case 1: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(1388705905));
                break;
            }
            case 7: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(1388705905));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1382611062));
                break;
            }
            case 13: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(1388705905));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1388705905));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1382611062));
                break;
            }
            case 12: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(1388705905));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1388705905));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1364133773));
                break;
            }
            case 8: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(1388705905));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1364133773));
                break;
            }
            case 19: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(254343282));
                break;
            }
            case 3: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(-322439056));
                break;
            }
            case 9: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(-322439056));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1382611062));
                break;
            }
            case 16: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(-322439056));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-322439056));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1382611062));
                break;
            }
            case 17: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(-322439056));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-322439056));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1364133773));
                break;
            }
            case 10: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(-322439056));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1364133773));
                break;
            }
            case 5: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1471022979));
                break;
            }
            case 4: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1364133773));
                break;
            }
            case 11: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1364133773));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1364133773));
                TNqe.ps(wfPa2, (BlockFace)cv.e(1388705905));
                break;
            }
            case 18: {
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1364133773));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-1364133773));
                TNqe.ps(wfPa2, (BlockFace)cv.e(-322439056));
            }
        }
        return wfPa2;
    }

    public static Vector OXeK(Location location, Location location2) {
        return TNqe.ps(TNqe.ps(TNqe.ps(TNqe.ps(location2), TNqe.ps(location))));
    }

    public static Vector YoSa(Location location, Location location2) {
        return TNqe.ps(TNqe.ps(TNqe.ps(location2), TNqe.ps(location)));
    }

    public static Vector ssNb(float f, float f2) {
        return new Vector((double)(TNqe.ps(f2) * TNqe.ps(f)), (double)TNqe.ps(f2), (double)(TNqe.ps(f2) * TNqe.ps(- f)));
    }

    public static void ssNb(Entity entity, Vector vector) {
        TNqe.ssNb(entity, vector, 1.0);
    }

    public static void ssNb(Entity entity, Vector vector, double d) {
        Vector vector2 = entity.getVelocity();
        TNqe.ps(vector2, TNqe.ps(TNqe.ps(vector), d));
        entity.setVelocity(vector2);
    }

    public static Vector lCdp(Vector vector) {
        if (TNqe.ps(vector) != 0.0) {
            TNqe.ps(vector, - TNqe.ps(vector));
        }
        if (TNqe.ps(vector) != 0.0) {
            TNqe.ps(vector, - TNqe.ps(vector));
        }
        if (TNqe.ps(vector) != 0.0) {
            TNqe.ps(vector, - TNqe.ps(vector));
        }
        return vector;
    }

    public static double nJLQ(Vector vector) {
        Vector vector2 = new Vector(0, 0, 0);
        Object object = TNqe.ps(new Vector(0, 0, 0), vector);
        return (double)TNqe.ps(vector2, object);
    }

    public static wfPa<Vector> ssNb(Vector vector, wfPa<Vector> wfPa2) {
        return new wfPa<Vector>((List<Vector>)TNqe.ps(new TNqe$1(vector), wfPa2));
    }

    public static BlockFace vtFs(Vector vector) {
        BlockFace blockFace;
        Vector vector2 = TNqe.EmLA(vector);
        BlockFace[] arrblockFace = (BlockFace[])TNqe.ps();
        int n = arrblockFace.length;
        int n2 = 0;
        while (n2 < n) {
            blockFace = arrblockFace[n2];
            if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) {
                if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) {
                    if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) {
                        return blockFace;
                    }
                }
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])TNqe.ps();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            blockFace = arrblockFace[n2];
            if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) {
                if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) {
                    return blockFace;
                }
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])TNqe.ps();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            blockFace = arrblockFace[n2];
            if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) {
                if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) {
                    return blockFace;
                }
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])TNqe.ps();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            block19 : {
                block18 : {
                    blockFace = arrblockFace[n2];
                    if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) break block18;
                    if (TNqe.ps(vector2) != (Object)TNqe.ps(blockFace)) break block19;
                }
                return blockFace;
            }
            ++n2;
        }
        arrblockFace = (BlockFace[])TNqe.ps();
        n = arrblockFace.length;
        n2 = 0;
        while (n2 < n) {
            block21 : {
                block20 : {
                    blockFace = arrblockFace[n2];
                    if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) break block20;
                    if (TNqe.ps(vector2) == (Object)TNqe.ps(blockFace)) break block20;
                    if (TNqe.ps(vector2) != (Object)TNqe.ps(blockFace)) break block21;
                }
                return blockFace;
            }
            ++n2;
        }
        return null;
    }

    public static Vector ssNb(Vector vector, float f) {
        Location location = new Location((World)TNqe.ps().get(0), 0.0, 0.0, 0.0);
        TNqe.ps(location, vector);
        Object object = TNqe.ps(location);
        Object object2 = TNqe.ps(location);
        kstv kstv2 = new kstv(360.0);
        kstv kstv3 = new kstv(180.0);
        TNqe.ps(kstv2, object);
        TNqe.ps(kstv3, object2);
        TNqe.ps(kstv2, f);
        TNqe.ps(location, TNqe.ps(kstv2));
        TNqe.ps(location, TNqe.ps(kstv3));
        return TNqe.ps(location);
    }

    public static Vector DYFV(Vector vector, float f) {
        Location location = new Location((World)TNqe.ps().get(0), 0.0, 0.0, 0.0);
        TNqe.ps(location, vector);
        Object object = TNqe.ps(location);
        Object object2 = TNqe.ps(location);
        kstv kstv2 = new kstv(360.0);
        kstv kstv3 = new kstv(180.0);
        TNqe.ps(kstv2, object);
        TNqe.ps(kstv3, object2);
        TNqe.ps(kstv2, f);
        TNqe.ps(location, TNqe.ps(kstv2));
        TNqe.ps(location, TNqe.ps(kstv3));
        return TNqe.ps(location);
    }

    public static Vector IWSm(Vector vector, float f) {
        Location location = new Location((World)TNqe.ps().get(0), 0.0, 0.0, 0.0);
        TNqe.ps(location, vector);
        Object object = TNqe.ps(location);
        Object object2 = TNqe.ps(location);
        kstv kstv2 = new kstv(360.0);
        TNqe.ps(kstv2, object);
        TNqe.ps(location, TNqe.ps(kstv2));
        TNqe.ps(location, TNqe.ps(-90.0f, object2 - f));
        return TNqe.ps(location);
    }

    public static Vector OXeK(Vector vector, float f) {
        Location location = new Location((World)TNqe.ps().get(0), 0.0, 0.0, 0.0);
        TNqe.ps(location, vector);
        Object object = TNqe.ps(location);
        Object object2 = TNqe.ps(location);
        kstv kstv2 = new kstv(360.0);
        TNqe.ps(kstv2, object);
        TNqe.ps(location, TNqe.ps(kstv2));
        TNqe.ps(location, TNqe.ps(90.0f, object2 + f));
        return TNqe.ps(location);
    }

    public static Vector EmLA(Vector vector) {
        Object object = TNqe.ps(vector);
        TNqe.ps(object);
        if (TNqe.ps(object) > 0.333) {
            TNqe.ps(object, true);
        } else if (TNqe.ps(object) < -0.333) {
            TNqe.ps(object, -1);
        } else {
            TNqe.ps(object, false);
        }
        if (TNqe.ps(object) > 0.333) {
            TNqe.ps(object, true);
        } else if (TNqe.ps(object) < -0.333) {
            TNqe.ps(object, -1);
        } else {
            TNqe.ps(object, false);
        }
        if (TNqe.ps(object) > 0.333) {
            TNqe.ps(object, true);
        } else if (TNqe.ps(object) < -0.333) {
            TNqe.ps(object, -1);
        } else {
            TNqe.ps(object, false);
        }
        return object;
    }

    static /* synthetic */ int[] ydSf() {
        int[] arrn;
        int[] arrn2 = (int[])cv.e(2069887789);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((mrKm[])TNqe.ps()).length];
        try {
            arrn[TNqe.ps((mrKm)cv.e((int)-1515981579))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((mrKm)cv.e((int)681309428))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((mrKm)cv.e((int)1817572599))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        cv.V(2069887789, arrn3);
        return arrn3;
    }

    static /* synthetic */ int[] GcEw() {
        int[] arrn;
        int[] arrn2 = (int[])cv.e(-1601307860);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((BlockFace[])TNqe.ps()).length];
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)216856695))] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)1382611062))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)1475083055))] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)123271982))] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)1388705905))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-1227883735))] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-1839596760))] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-194839765))] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)1612249898))] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)254343282))] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-322439056))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)2041117461))] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-640550124))] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)703331095))] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-817169642))] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-1471022979))] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-1364133773))] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-924976367))] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[TNqe.ps((BlockFace)cv.e((int)-1577518320))] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        cv.V(-1601307860, arrn3);
        return arrn3;
    }

    private static Object ps(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

