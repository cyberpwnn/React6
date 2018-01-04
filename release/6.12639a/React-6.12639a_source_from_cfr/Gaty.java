/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.block.Hopper
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.block.Hopper;

public final class Gaty
extends Enum<Gaty> {
    public static final /* enum */ Gaty LXoM;
    public static final /* enum */ Gaty MeCx;
    public static final /* enum */ Gaty FNmQ;
    public static final /* enum */ Gaty IrIo;
    public static final /* enum */ Gaty bipG;
    private int direction;
    private static /* synthetic */ int[] OHgD;
    private static final /* synthetic */ Gaty[] IiXl;

    static {
        o.w(-233679948, (Object)new Gaty(mrFx$WjFM.d("\u4f48\u042b\u6bc2\uc7aa"), 0, 0));
        o.w(-1539746893, (Object)new Gaty(mrFx$WjFM.d("\u4f42\u042b\u6bc7\uc7b0\u1016"), 1, 2));
        o.w(1604408226, (Object)new Gaty(mrFx$WjFM.d("\u4f5f\u042b\u6bc0\uc7b0\u1016"), 2, 3));
        o.w(1992905633, (Object)new Gaty(mrFx$WjFM.d("\u4f49\u0425\u6bc6\uc7b0"), 3, 5));
        o.w(545018784, (Object)new Gaty(mrFx$WjFM.d("\u4f5b\u0421\u6bc6\uc7b0"), 4, 4));
        o.w(-139504737, new Gaty[]{(Gaty)((Object)o.k(-233679948)), (Gaty)((Object)o.k(-1539746893)), (Gaty)((Object)o.k(1604408226)), (Gaty)((Object)o.k(1992905633)), (Gaty)((Object)o.k(545018784))});
    }

    private Gaty(String string2, int n2, int n3) {
        this.direction = string2;
    }

    public Location VwLY(Location location) {
        switch (Gaty.CgJH()[this.ordinal()]) {
            case 1: {
                return Gaty.EW(Gaty.EW(location), 0.0, -1.0, 0.0);
            }
            case 4: {
                return Gaty.EW(Gaty.EW(location), 1.0, 0.0, 0.0);
            }
            case 2: {
                return Gaty.EW(Gaty.EW(location), 0.0, 0.0, -1.0);
            }
            case 3: {
                return Gaty.EW(Gaty.EW(location), 0.0, 0.0, 1.0);
            }
            case 5: {
                return Gaty.EW(Gaty.EW(location), -1.0, 0.0, 0.0);
            }
        }
        return null;
    }

    public static boolean yJLS(Hopper hopper) {
        if (hopper.getRawData() >= 8) {
            return true;
        }
        return false;
    }

    public static Gaty UtIU(Hopper hopper) {
        int n = hopper.getRawData();
        if (n >= 8) {
            n -= 8;
        }
        Gaty[] arrgaty = Gaty.values();
        int n2 = arrgaty.length;
        int n3 = 0;
        while (n3 < n2) {
            Gaty gaty = arrgaty[n3];
            if ((Integer)o.a((Object)gaty, 838226846) == n) {
                return gaty;
            }
            ++n3;
        }
        return null;
    }

    public static Gaty[] values() {
        Gaty[] arrgaty = (Gaty[])o.k(-139504737);
        int n = arrgaty.length;
        Gaty[] arrgaty2 = new Gaty[n];
        Gaty.EW(arrgaty, false, arrgaty2, false, n);
        return arrgaty2;
    }

    public static Gaty valueOf(String string) {
        return (Gaty)((Object)Gaty.EW(Gaty.class, string));
    }

    static /* synthetic */ int[] CgJH() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(928732061);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[Gaty.values().length];
        try {
            arrn[((Gaty)o.k((int)-233679948)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Gaty)o.k((int)1992905633)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Gaty)o.k((int)-1539746893)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Gaty)o.k((int)1604408226)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Gaty)o.k((int)545018784)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(928732061, arrn3);
        return arrn3;
    }

    private static Object EW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

