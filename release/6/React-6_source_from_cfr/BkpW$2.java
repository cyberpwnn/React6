/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class BkpW$2
implements xqeH<EmKi> {
    final /* synthetic */ BkpW rowT;

    BkpW$2(BkpW bkpW) {
        this.rowT = bkpW;
    }

    public EmKi jhSt() {
        uWVB uWVB2 = new uWVB();
        BkpW$2.zN(uWVB2, BkpW$2.zN(10000));
        return uWVB2;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.jhSt();
    }

    private static Object zN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

