/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class gEea$1
implements ntkx {
    final /* synthetic */ gEea pbjJ;

    gEea$1(gEea gEea2) {
        this.pbjJ = gEea2;
    }

    @Override
    public String uVol(double d) {
        return gEea$1.cR(gEea$1.cR(new StringBuilder((String)gEea$1.cR(gEea$1.cR(d, false))), gEea$1.cR(mrFx$WjFM.d("\u2ca7\u8068\u9c0e\u1704\uba2b\uefac\u838d\u6a1e\udb35\u4b7d\u0c1f\u9e0c\u1647\u091d\uba2a\uceaf\uc83d\u0e70\u7310\u8b67\ua88e\u3622\u7edc\ued2d\u5a26\u8819\u00a0\u86f2"))));
    }

    private static Object cR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

