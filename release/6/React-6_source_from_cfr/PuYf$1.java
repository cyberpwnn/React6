/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class PuYf$1
extends vIXT {
    final /* synthetic */ PuYf wevJ;

    PuYf$1(PuYf puYf) {
        this.wevJ = puYf;
    }

    @Override
    public void run() {
        PuYf$1.Fj(PuYf$1.Fj((PuYf)cv.b(this, -913698884)), PuYf$1.Fj(PuYf$1.Fj(new StringBuilder(KUXS$dwji.S("\u42da\u6aea\u82d8\ucf80\uf911\u6a47\u2768\ub560\u8d81\udecf\uf232\u907f\udc07\ue921\u4535\u56be\u7a34\ud4a7\u20ed\ue3d7\u5245\u17b7")), PuYf$1.Fj(24092.0, false))));
    }

    private static Object Fj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

