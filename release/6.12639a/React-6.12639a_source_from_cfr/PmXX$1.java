/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class PmXX$1
implements ntkx {
    final /* synthetic */ PmXX grCS;

    PmXX$1(PmXX pmXX) {
        this.grCS = pmXX;
    }

    @Override
    public String uVol(double d) {
        return PmXX$1.TN(PmXX$1.TN(new StringBuilder((String)PmXX$1.TN(PmXX$1.TN(d, false))), PmXX$1.TN(FMkR$WjFM.a("\ufafd\u7397\u7e1f\u0fc5\u1e24\u057b\uc638\uc1f5\u9ff6\u88a6\ufad7\u9b97\uaf3a\u230b\u68db\u08d4\u2188\u0018\u7d2c\u889d\u653c\uc54b\u2046\uc288\ub077\uef95\u41cb\u2263\u2032\u2ab8"))));
    }

    private static Object TN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

