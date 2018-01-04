/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class EJip
extends Enum<EJip> {
    public static final /* enum */ EJip qnIy;
    public static final /* enum */ EJip nJly;
    public static final /* enum */ EJip wDfe;
    private static /* synthetic */ int[] vItK;
    private static final /* synthetic */ EJip[] PKhe;

    static {
        o.w(-1176677744, (Object)new EJip(nJPf$sILv.G("\u79a9\uaa7a\uc256\u6a7d\u17c5\uce87\u895f\ub9d9\u4fe2\u7faf\u80dd\u77ea"), 0));
        o.w(1287541391, (Object)new EJip(nJPf$sILv.G("\u79ba\uaa79\uc259\u6a77\u17cf\uce99\u8949\ub9d5\u4ff2\u7fae\u80df\u77ff\u39bb"), 1));
        o.w(319771278, (Object)new EJip(nJPf$sILv.G("\u79b8\uaa78\uc24e\u6a70\u17c8\uce9c\u8942\ub9c1"), 2));
        o.w(-118861171, new EJip[]{(EJip)((Object)o.k(-1176677744)), (EJip)((Object)o.k(1287541391)), (EJip)((Object)o.k(319771278))});
    }

    private EJip(String string2, int n2) {
    }

    public boolean yJLS(ThWp thWp) {
        if (EJip.DI(thWp, (ThWp)((Object)o.k(-166964573))) != false) {
            switch (EJip.CEEt()[this.ordinal()]) {
                case 3: {
                    return true;
                }
                case 2: {
                    return true;
                }
                case 1: {
                    return false;
                }
            }
        }
        switch (EJip.CEEt()[this.ordinal()]) {
            case 3: {
                return true;
            }
            case 2: {
                return false;
            }
            case 1: {
                return true;
            }
        }
        return false;
    }

    public static EJip[] values() {
        EJip[] arreJip = (EJip[])o.k(-118861171);
        int n = arreJip.length;
        EJip[] arreJip2 = new EJip[n];
        EJip.DI(arreJip, false, arreJip2, false, n);
        return arreJip2;
    }

    public static EJip valueOf(String string) {
        return (EJip)((Object)EJip.DI(EJip.class, string));
    }

    static /* synthetic */ int[] CEEt() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(-1140698485);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[EJip.values().length];
        try {
            arrn[((EJip)o.k((int)319771278)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((EJip)o.k((int)1287541391)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((EJip)o.k((int)-1176677744)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(-1140698485, arrn3);
        return arrn3;
    }

    private static Object DI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

