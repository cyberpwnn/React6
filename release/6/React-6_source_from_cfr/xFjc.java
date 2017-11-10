/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class xFjc
extends Enum<xFjc> {
    public static final /* enum */ xFjc jpwO;
    public static final /* enum */ xFjc NVVB;
    public static final /* enum */ xFjc klIi;
    private static final /* synthetic */ xFjc[] EunR;

    public static xFjc[] values() {
        return (xFjc[])((xFjc[])yy.p(408029030)).clone();
    }

    public static xFjc valueOf(String string) {
        return (xFjc)((Object)xFjc.DC(xFjc.class, string));
    }

    private xFjc() {
    }

    public boolean mXJp(UtMF utMF) {
        if (xFjc.DC(utMF, (UtMF)((Object)yy.p(1787430755))) != false) {
            switch (((int[])yy.p(1772357273))[this.ordinal()]) {
                case 1: {
                    return true;
                }
                case 2: {
                    return true;
                }
                case 3: {
                    return false;
                }
            }
        }
        switch (((int[])yy.p(1772357273))[this.ordinal()]) {
            case 1: {
                return true;
            }
            case 2: {
                return false;
            }
            case 3: {
                return true;
            }
        }
        return false;
    }

    static {
        yy.K(1640499053, (Object)new xFjc());
        yy.K(-665909608, (Object)new xFjc());
        yy.K(936183650, (Object)new xFjc());
        yy.K(408029030, new xFjc[]{(xFjc)((Object)yy.p(1640499053)), (xFjc)((Object)yy.p(-665909608)), (xFjc)((Object)yy.p(936183650))});
    }

    private static Object DC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

