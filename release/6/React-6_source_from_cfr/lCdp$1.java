/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class lCdp$1
implements xqeH<EmKi> {
    final /* synthetic */ lCdp YoaF;

    lCdp$1(lCdp lCdp2) {
        this.YoaF = lCdp2;
    }

    public EmKi jhSt() {
        jyXs jyXs2 = new jyXs();
        lCdp$1.Ba(jyXs2);
        return jyXs2;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.jhSt();
    }

    private static Object Ba(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

