/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class HLIY$1
extends CxNA {
    final /* synthetic */ HLIY dxjo;

    HLIY$1(HLIY hLIY) {
        this.dxjo = hLIY;
    }

    @Override
    public void run() {
        HLIY$1.jb((HLIY)o.a(this, -839821779)).tick();
    }

    private static Object jb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

