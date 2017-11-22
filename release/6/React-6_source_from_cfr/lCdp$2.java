/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class lCdp$2
implements xqeH<EmKi> {
    final /* synthetic */ lCdp YoaF;

    lCdp$2(lCdp lCdp2) {
        this.YoaF = lCdp2;
    }

    public EmKi jhSt() {
        uWVB uWVB2 = new uWVB();
        lCdp$2.vw(uWVB2, lCdp$2.vw(10000));
        return uWVB2;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.jhSt();
    }

    private static Object vw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

