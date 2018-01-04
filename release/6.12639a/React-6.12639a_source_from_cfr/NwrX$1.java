/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class NwrX$1
implements ntkx {
    final /* synthetic */ NwrX TjLf;

    NwrX$1(NwrX nwrX) {
        this.TjLf = nwrX;
    }

    @Override
    public String uVol(double d) {
        return NwrX$1.sL(NwrX$1.sL(new StringBuilder((String)NwrX$1.sL(NwrX$1.sL(d, false))), NwrX$1.sL(nJPf$sILv.G("\u6d42\u94b8\ud066\u3c7d\uc6e0\ueee5\u278d\u99c0\u3872\u24ad\uefd9\u7d7b\u76cf\ucb2f\uec66\u01d4\u0b4a\ud7c0\ue195\u8b49\u0cb7\u5075\ua776\u65e9\u7024\ub632\ud5bb\u05db"))));
    }

    private static Object sL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

