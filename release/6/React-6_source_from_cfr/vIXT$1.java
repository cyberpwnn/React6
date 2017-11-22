/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class vIXT$1
extends dMUO {
    final /* synthetic */ vIXT RcJi;

    vIXT$1(vIXT vIXT2) {
        this.RcJi = vIXT2;
    }

    @Override
    public void run() {
        vIXT$1.Ux((vIXT)cv.b(this, -1932723866));
    }

    private static Object Ux(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

