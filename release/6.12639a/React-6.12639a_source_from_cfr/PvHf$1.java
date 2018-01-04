/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class PvHf$1
implements ntkx {
    final /* synthetic */ PvHf mkED;

    PvHf$1(PvHf pvHf) {
        this.mkED = pvHf;
    }

    @Override
    public String uVol(double d) {
        return PvHf$1.QF(PvHf$1.QF(new StringBuilder((String)PvHf$1.QF(PvHf$1.QF(d, false))), PvHf$1.QF(FMkR$WjFM.a("\u8752\u8c74\u8ec1\udb6d\u4e07\u7c90\u100f\u207d\u7fc0\uef40\u4c18\ub9fc\u62d8\uc5a1\u85a6\uec5d\u64ef\u7434\u40ee\ue808\ufe81\u5cf5\u5c49\u3368\ua5b2\uc2dd\u1283"))));
    }

    private static Object QF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

