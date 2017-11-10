/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class NUlR$3
extends lfSt {
    final /* synthetic */ NUlR xrYE;

    NUlR$3(NUlR nUlR) {
        this.xrYE = nUlR;
    }

    @Override
    public void ogLP() {
        NUlR$3.yL((NUlR)yy.h(this, -2026437238), this.GkJR());
        NUlR$3.yL((NUlR)yy.h(this, -2026437238), this.xGQd());
        NUlR$3.yL((NUlR)yy.h(this, -2026437238), this.cAfA());
        NUlR$3.yL(NUlR$3.yL((NUlR)yy.h(this, -2026437238)), this.Gryi());
        NUlR$3.yL((NUlR)yy.h(this, -2026437238), NUlR$3.yL(NUlR$3.yL((NUlR)yy.h(this, -2026437238))));
    }

    private static Object yL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

