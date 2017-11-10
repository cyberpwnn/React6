/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class PJgj
implements WFnH {
    @Override
    public void jVod(String string) {
        PJgj.NY(PJgj.NY(), string);
    }

    @Override
    public void wnXH(String string) {
        PJgj.NY(PJgj.NY(), string);
    }

    @Override
    public void qKCn(String string) {
        PJgj.NY(PJgj.NY(), string);
    }

    @Override
    public void HdqI(String string) {
        PJgj.NY(PJgj.NY(), string);
    }

    private static Object NY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

