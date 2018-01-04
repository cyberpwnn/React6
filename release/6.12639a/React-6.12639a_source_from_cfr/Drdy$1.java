/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class Drdy$1
implements ntkx {
    final /* synthetic */ Drdy wyBY;

    Drdy$1(Drdy drdy) {
        this.wyBY = drdy;
    }

    @Override
    public String uVol(double d) {
        return Drdy$1.ts(Drdy$1.ts(new StringBuilder((String)Drdy$1.ts(Drdy$1.ts(d, false))), Drdy$1.ts(FMkR$WjFM.a("\u3ea5\u6c63\u7a1c\u5dbf\uf4b0\u3f7f\ubee6\u60ad\u5f2a\u07a1\uad0a\u53f8\uafe1\ufdae\u9c46\u929d\ufbd6\u8eff\u296f\u55cf\uc895\ucda8\u652d\ub947\u4d11"))));
    }

    private static Object ts(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

