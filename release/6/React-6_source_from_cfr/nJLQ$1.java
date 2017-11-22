/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class nJLQ$1
implements xqeH<EmKi> {
    final /* synthetic */ nJLQ kkcI;

    nJLQ$1(nJLQ nJLQ2) {
        this.kkcI = nJLQ2;
    }

    public EmKi jhSt() {
        jyXs jyXs2 = new jyXs();
        nJLQ$1.HA(jyXs2);
        return jyXs2;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.jhSt();
    }

    private static Object HA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

