/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class BKFT {
    public static String repeat(String string, int n) {
        return BKFT.ix(string, n);
    }

    public static feCR<String> GPlk(String string, int n) {
        Object object = BKFT.ix(string);
        feCR<String> feCR2 = new feCR<String>();
        String[] arrstring = (String[])BKFT.ix(BKFT.ix(string, n), FMkR$WjFM.a("\u32a0"));
        int n2 = arrstring.length;
        int n3 = 0;
        while (n3 < n2) {
            String string2 = arrstring[n3];
            BKFT.ix(feCR2, BKFT.ix(BKFT.ix(BKFT.ix(new StringBuilder((String)BKFT.ix(object)), BKFT.ix(string2)), BKFT.ix(string2))));
            ++n3;
        }
        return feCR2;
    }

    public static String yJLS(psKX psKX2, psKX psKX3, psKX psKX4, psKX psKX5, String string) {
        return BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(new StringBuilder(), psKX2), mrFx$WjFM.d("\u3d79")), psKX3), string), psKX2), mrFx$WjFM.d("\u3d7f")), psKX4), mrFx$WjFM.d("\u3d18\u4f86")), psKX5));
    }

    public static String yJLS(psKX psKX2, psKX psKX3, psKX psKX4, String string) {
        return BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(new StringBuilder(), psKX2), mrFx$WjFM.d("\u3d79")), psKX3), string), psKX2), mrFx$WjFM.d("\u3d7f\u4f9c\u01cf")), psKX4));
    }

    public static String yJLS(psKX psKX2, int n) {
        return BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(new StringBuilder(), psKX2), (psKX)((Object)o.k(1944140422))), BKFT.repeat(nJPf$sILv.G("\u179a"), n)));
    }

    public static String UtIU(psKX psKX2, int n) {
        return BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(new StringBuilder(), psKX2), (psKX)((Object)o.k(1944140422))), BKFT.repeat(FMkR$WjFM.a("\u4f0d"), n)));
    }

    public static String yJLS(psKX psKX2, int object, double d, String string, String string2, String string3) {
        Object object2 = BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(new StringBuilder(), psKX2), (psKX)((Object)o.k(-911320963))), string));
        object = object < BKFT.ix(string) + BKFT.ix(string3) + BKFT.ix(string2) ? (Object)(BKFT.ix(string) + BKFT.ix(string3) + BKFT.ix(string2) + 6) : object;
        int n = object - (BKFT.ix(string) + BKFT.ix(string3) + BKFT.ix(string2));
        int n2 = (int)((double)n * d);
        int n3 = object - n2;
        if (d == 0.0) {
            return BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(new StringBuilder((String)BKFT.ix(object2)), (psKX)((Object)o.k(1251758875))), (psKX)((Object)o.k(-911320963))), BKFT.ix(nJPf$sILv.G("\u179a"), n3)), (psKX)((Object)o.k(1251758875))), (psKX)((Object)o.k(-911320963))), string3));
        }
        return BKFT.ix(BKFT.ix(BKFT.ix(new StringBuilder((String)BKFT.ix(object2)), BKFT.ix(nJPf$sILv.G("\u179a"), n2)), d == 1.0 ? string3 : BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(BKFT.ix(new StringBuilder((String)BKFT.ix(string2)), (psKX)((Object)o.k(1251758875))), (psKX)((Object)o.k(-911320963))), BKFT.ix(nJPf$sILv.G("\u179a"), n3)), (psKX)((Object)o.k(1251758875))), (psKX)((Object)o.k(-911320963))), string3))));
    }

    private static Object ix(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

