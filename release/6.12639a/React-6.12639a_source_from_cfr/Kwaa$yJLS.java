/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class Kwaa$yJLS
extends Enum<Kwaa$yJLS> {
    public static final /* enum */ Kwaa$yJLS TbPM;
    public static final /* enum */ Kwaa$yJLS MwMn;
    public static final /* enum */ Kwaa$yJLS BDJu;
    public static final /* enum */ Kwaa$yJLS KgvP;
    public static final /* enum */ Kwaa$yJLS IkAt;
    public static final /* enum */ Kwaa$yJLS jQLn;
    public static final /* enum */ Kwaa$yJLS iNIn;
    public static final /* enum */ Kwaa$yJLS HDyy;
    public static final /* enum */ Kwaa$yJLS lFRE;
    public static final /* enum */ Kwaa$yJLS kdsm;
    private static /* synthetic */ int[] lxvA;
    private static final /* synthetic */ Kwaa$yJLS[] TbSJ;

    static {
        o.w(1179139411, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4cf\u3ae0\u150f\u87b6\u9323"), 0));
        o.w(1100757698, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4c4\u3aee\u150e\u87b6"), 1));
        o.w(1634220737, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4d2\u3ae0\u1508\u87b6\u9323"), 2));
        o.w(164182720, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4d6\u3aea\u150e\u87b6"), 3));
        o.w(-901825857, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4d4\u3aff"), 4));
        o.w(-1832699202, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4c5\u3ae0\u150a\u87ac"), 5));
        o.w(-727369027, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4c9\u3ae0\u150f\u87ab\u9331\u3b78\ua3aa\u8bb2\u584b\u8882"), 6));
        o.w(806566588, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4d7\u3aea\u150f\u87b6\u9322\u3b74\ua3a5\u8baa"), 7));
        o.w(-616482117, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4c3\u3ae0\u1509\u87aa"), 8));
        o.w(-1763885750, (Object)new Kwaa$yJLS(FMkR$WjFM.a("\ua4d4\u3ae1\u1516\u87ac\u9324\u3b60\ua3aa"), 9));
        o.w(-1658241719, new Kwaa$yJLS[]{(Kwaa$yJLS)((Object)o.k(1179139411)), (Kwaa$yJLS)((Object)o.k(1100757698)), (Kwaa$yJLS)((Object)o.k(1634220737)), (Kwaa$yJLS)((Object)o.k(164182720)), (Kwaa$yJLS)((Object)o.k(-901825857)), (Kwaa$yJLS)((Object)o.k(-1832699202)), (Kwaa$yJLS)((Object)o.k(-727369027)), (Kwaa$yJLS)((Object)o.k(806566588)), (Kwaa$yJLS)((Object)o.k(-616482117)), (Kwaa$yJLS)((Object)o.k(-1763885750))});
    }

    private Kwaa$yJLS(String string2, int n2) {
    }

    public Kwaa$yJLS eQNN() {
        switch (Kwaa$yJLS.JcbI()[this.ordinal()]) {
            case 1: {
                return (Kwaa$yJLS)((Object)o.k(1634220737));
            }
            case 2: {
                return (Kwaa$yJLS)((Object)o.k(164182720));
            }
            case 3: {
                return (Kwaa$yJLS)((Object)o.k(1179139411));
            }
            case 4: {
                return (Kwaa$yJLS)((Object)o.k(1100757698));
            }
            case 7: {
                return (Kwaa$yJLS)((Object)o.k(806566588));
            }
            case 8: {
                return (Kwaa$yJLS)((Object)o.k(-727369027));
            }
            case 5: {
                return (Kwaa$yJLS)((Object)o.k(-1832699202));
            }
            case 6: {
                return (Kwaa$yJLS)((Object)o.k(-901825857));
            }
            case 9: {
                return (Kwaa$yJLS)((Object)o.k(-616482117));
            }
        }
        return (Kwaa$yJLS)((Object)o.k(-1763885750));
    }

    public static Kwaa$yJLS[] values() {
        Kwaa$yJLS[] arrkwaa$yJLS = (Kwaa$yJLS[])o.k(-1658241719);
        int n = arrkwaa$yJLS.length;
        Kwaa$yJLS[] arrkwaa$yJLS2 = new Kwaa$yJLS[n];
        Kwaa$yJLS.TB(arrkwaa$yJLS, false, arrkwaa$yJLS2, false, n);
        return arrkwaa$yJLS2;
    }

    public static Kwaa$yJLS valueOf(String string) {
        return (Kwaa$yJLS)((Object)Kwaa$yJLS.TB(Kwaa$yJLS.class, string));
    }

    static /* synthetic */ int[] JcbI() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(1486306632);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[Kwaa$yJLS.values().length];
        try {
            arrn[((Kwaa$yJLS)o.k((int)-616482117)).ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Kwaa$yJLS)o.k((int)-1832699202)).ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Kwaa$yJLS)o.k((int)1100757698)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Kwaa$yJLS)o.k((int)-727369027)).ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Kwaa$yJLS)o.k((int)1179139411)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Kwaa$yJLS)o.k((int)1634220737)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Kwaa$yJLS)o.k((int)-1763885750)).ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Kwaa$yJLS)o.k((int)-901825857)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Kwaa$yJLS)o.k((int)806566588)).ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((Kwaa$yJLS)o.k((int)164182720)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(1486306632, arrn3);
        return arrn3;
    }

    private static Object TB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

