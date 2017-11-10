/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class FVfT$mXJp
extends Enum<FVfT$mXJp> {
    public static final /* enum */ FVfT$mXJp IaOS;
    public static final /* enum */ FVfT$mXJp mHRd;
    public static final /* enum */ FVfT$mXJp jaPJ;
    public static final /* enum */ FVfT$mXJp psbT;
    public static final /* enum */ FVfT$mXJp qCaF;
    public static final /* enum */ FVfT$mXJp XJxu;
    public static final /* enum */ FVfT$mXJp eYoa;
    public static final /* enum */ FVfT$mXJp Hnns;
    public static final /* enum */ FVfT$mXJp WjYf;
    public static final /* enum */ FVfT$mXJp WPgQ;
    private static /* synthetic */ int[] pYkk;
    private static final /* synthetic */ FVfT$mXJp[] uOll;

    static {
        yy.K(-627768094, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa9av\ua486\ue0d4\u5f7d"), 0));
        yy.K(1948911639, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa91x\ua487\ue0d4"), 1));
        yy.K(552732696, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa87v\ua481\ue0d4\u5f7d"), 2));
        yy.K(789120237, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa83|\ua487\ue0d4"), 3));
        yy.K(1790248166, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa81i"), 4));
        yy.K(-1776352021, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa90v\ua483\ue0ce"), 5));
        yy.K(-827063060, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa9cv\ua486\ue0c9\u5f6f\u0ae4\ue861\uf160\u7b9a\ue9ea"), 6));
        yy.K(-1613888287, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa82|\ua486\ue0d4\u5f7c\u0ae8\ue86e\uf178"), 7));
        yy.K(-627374870, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa96v\ua480\ue0c8"), 8));
        yy.K(-1886714657, (Object)new FVfT$mXJp(NVIs$JbpD.H("\uaa81w\ua49f\ue0ce\u5f7a\u0afc\ue861"), 9));
        yy.K(-1237318432, new FVfT$mXJp[]{(FVfT$mXJp)((Object)yy.p(-627768094)), (FVfT$mXJp)((Object)yy.p(1948911639)), (FVfT$mXJp)((Object)yy.p(552732696)), (FVfT$mXJp)((Object)yy.p(789120237)), (FVfT$mXJp)((Object)yy.p(1790248166)), (FVfT$mXJp)((Object)yy.p(-1776352021)), (FVfT$mXJp)((Object)yy.p(-827063060)), (FVfT$mXJp)((Object)yy.p(-1613888287)), (FVfT$mXJp)((Object)yy.p(-627374870)), (FVfT$mXJp)((Object)yy.p(-1886714657))});
    }

    private FVfT$mXJp(String string2, int n2) {
    }

    public FVfT$mXJp PmXT() {
        switch (FVfT$mXJp.GHjf()[this.ordinal()]) {
            case 1: {
                return (FVfT$mXJp)((Object)yy.p(552732696));
            }
            case 2: {
                return (FVfT$mXJp)((Object)yy.p(789120237));
            }
            case 3: {
                return (FVfT$mXJp)((Object)yy.p(-627768094));
            }
            case 4: {
                return (FVfT$mXJp)((Object)yy.p(1948911639));
            }
            case 7: {
                return (FVfT$mXJp)((Object)yy.p(-1613888287));
            }
            case 8: {
                return (FVfT$mXJp)((Object)yy.p(-827063060));
            }
            case 5: {
                return (FVfT$mXJp)((Object)yy.p(-1776352021));
            }
            case 6: {
                return (FVfT$mXJp)((Object)yy.p(1790248166));
            }
            case 9: {
                return (FVfT$mXJp)((Object)yy.p(-627374870));
            }
        }
        return (FVfT$mXJp)((Object)yy.p(-1886714657));
    }

    public static FVfT$mXJp[] values() {
        FVfT$mXJp[] arrfVfT$mXJp = (FVfT$mXJp[])yy.p(-1237318432);
        int n = arrfVfT$mXJp.length;
        FVfT$mXJp[] arrfVfT$mXJp2 = new FVfT$mXJp[n];
        FVfT$mXJp.jU(arrfVfT$mXJp, false, arrfVfT$mXJp2, false, n);
        return arrfVfT$mXJp2;
    }

    public static FVfT$mXJp valueOf(String string) {
        return (FVfT$mXJp)((Object)FVfT$mXJp.jU(FVfT$mXJp.class, string));
    }

    static /* synthetic */ int[] GHjf() {
        int[] arrn;
        int[] arrn2 = (int[])yy.p(-712636363);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[FVfT$mXJp.values().length];
        try {
            arrn[((FVfT$mXJp)yy.p((int)-627374870)).ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((FVfT$mXJp)yy.p((int)-1776352021)).ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((FVfT$mXJp)yy.p((int)1948911639)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((FVfT$mXJp)yy.p((int)-827063060)).ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((FVfT$mXJp)yy.p((int)-627768094)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((FVfT$mXJp)yy.p((int)552732696)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((FVfT$mXJp)yy.p((int)-1886714657)).ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((FVfT$mXJp)yy.p((int)1790248166)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((FVfT$mXJp)yy.p((int)-1613888287)).ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((FVfT$mXJp)yy.p((int)789120237)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        yy.K(-712636363, arrn3);
        return arrn3;
    }

    private static Object jU(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

