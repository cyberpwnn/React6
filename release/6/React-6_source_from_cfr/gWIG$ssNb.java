/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class gWIG$ssNb
extends Enum<gWIG$ssNb> {
    public static final /* enum */ gWIG$ssNb lpMN;
    public static final /* enum */ gWIG$ssNb kmJS;
    public static final /* enum */ gWIG$ssNb jOsX;
    public static final /* enum */ gWIG$ssNb lEYN;
    public static final /* enum */ gWIG$ssNb msOw;
    public static final /* enum */ gWIG$ssNb pQdX;
    public static final /* enum */ gWIG$ssNb rGJK;
    public static final /* enum */ gWIG$ssNb aMiL;
    public static final /* enum */ gWIG$ssNb fvjl;
    public static final /* enum */ gWIG$ssNb iUaG;
    private static /* synthetic */ int[] EKyi;
    private static final /* synthetic */ gWIG$ssNb[] iVAf;

    static {
        cv.V(-1984433145, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30dc\u46c5\u2f57\u48b1\u349e"), 0));
        cv.V(1237775366, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30d7\u46cb\u2f56\u48b1"), 1));
        cv.V(-285543423, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30c1\u46c5\u2f50\u48b1\u349e"), 2));
        cv.V(-1350634496, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30c5\u46cf\u2f56\u48b1"), 3));
        cv.V(196670467, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30c7\u46da"), 4));
        cv.V(-714542078, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30d6\u46c5\u2f52\u48ab"), 5));
        cv.V(-1717963763, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30da\u46c5\u2f57\u48ac\u348c\ub22d\u2a1d\uac1a\uf957\u3200"), 6));
        cv.V(159380492, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30c4\u46cf\u2f57\u48b1\u349f\ub221\u2a12\uac02"), 7));
        cv.V(1610609679, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30d0\u46c5\u2f51\u48ad"), 8));
        cv.V(1267594254, (Object)new gWIG$ssNb(KUXS$dwji.S("\u30c7\u46c4\u2f4e\u48ab\u3499\ub235\u2a1d"), 9));
        cv.V(-1951861751, new gWIG$ssNb[]{(gWIG$ssNb)((Object)cv.e(-1984433145)), (gWIG$ssNb)((Object)cv.e(1237775366)), (gWIG$ssNb)((Object)cv.e(-285543423)), (gWIG$ssNb)((Object)cv.e(-1350634496)), (gWIG$ssNb)((Object)cv.e(196670467)), (gWIG$ssNb)((Object)cv.e(-714542078)), (gWIG$ssNb)((Object)cv.e(-1717963763)), (gWIG$ssNb)((Object)cv.e(159380492)), (gWIG$ssNb)((Object)cv.e(1610609679)), (gWIG$ssNb)((Object)cv.e(1267594254))});
    }

    private gWIG$ssNb(String string2, int n2) {
    }

    public gWIG$ssNb nRrG() {
        switch (gWIG$ssNb.cSRj()[this.ordinal()]) {
            case 1: {
                return (gWIG$ssNb)((Object)cv.e(-285543423));
            }
            case 2: {
                return (gWIG$ssNb)((Object)cv.e(-1350634496));
            }
            case 3: {
                return (gWIG$ssNb)((Object)cv.e(-1984433145));
            }
            case 4: {
                return (gWIG$ssNb)((Object)cv.e(1237775366));
            }
            case 7: {
                return (gWIG$ssNb)((Object)cv.e(159380492));
            }
            case 8: {
                return (gWIG$ssNb)((Object)cv.e(-1717963763));
            }
            case 5: {
                return (gWIG$ssNb)((Object)cv.e(-714542078));
            }
            case 6: {
                return (gWIG$ssNb)((Object)cv.e(196670467));
            }
            case 9: {
                return (gWIG$ssNb)((Object)cv.e(1610609679));
            }
        }
        return (gWIG$ssNb)((Object)cv.e(1267594254));
    }

    public static gWIG$ssNb[] values() {
        gWIG$ssNb[] arrgWIG$ssNb = (gWIG$ssNb[])cv.e(-1951861751);
        int n = arrgWIG$ssNb.length;
        gWIG$ssNb[] arrgWIG$ssNb2 = new gWIG$ssNb[n];
        gWIG$ssNb.yt(arrgWIG$ssNb, false, arrgWIG$ssNb2, false, n);
        return arrgWIG$ssNb2;
    }

    public static gWIG$ssNb valueOf(String string) {
        return (gWIG$ssNb)((Object)gWIG$ssNb.yt(gWIG$ssNb.class, string));
    }

    static /* synthetic */ int[] cSRj() {
        int[] arrn;
        int[] arrn2 = (int[])cv.e(-230755320);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[gWIG$ssNb.values().length];
        try {
            arrn[((gWIG$ssNb)cv.e((int)1610609679)).ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((gWIG$ssNb)cv.e((int)-714542078)).ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((gWIG$ssNb)cv.e((int)1237775366)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((gWIG$ssNb)cv.e((int)-1717963763)).ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((gWIG$ssNb)cv.e((int)-1984433145)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((gWIG$ssNb)cv.e((int)-285543423)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((gWIG$ssNb)cv.e((int)1267594254)).ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((gWIG$ssNb)cv.e((int)196670467)).ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((gWIG$ssNb)cv.e((int)159380492)).ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((gWIG$ssNb)cv.e((int)-1350634496)).ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        cv.V(-230755320, arrn3);
        return arrn3;
    }

    private static Object yt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

