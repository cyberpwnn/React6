/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class DaUw$1
extends xGOy {
    final /* synthetic */ DaUw TXIq;

    DaUw$1(DaUw daUw) {
        this.TXIq = daUw;
    }

    @Override
    public void run() {
        DaUw$1.wL(DaUw$1.wL((DaUw)o.a(this, -1647491610)), DaUw$1.wL(DaUw$1.wL(new StringBuilder(FMkR$WjFM.a("\u3c6d\ua89c\u180c\u1ebc\u87e0\u56e2\u91e9\u7ac2\u3afd\u319c\u7255\u70d9\ue53f\u5473\u401b\ud647\ua7d1\u51ef\ud61a\u383a\u57dc\u57fa")), DaUw$1.wL(24092.0, false))));
    }

    private static Object wL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

