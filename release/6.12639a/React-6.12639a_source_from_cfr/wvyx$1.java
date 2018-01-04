/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class wvyx$1
implements Runnable {
    final /* synthetic */ wvyx DlBB;
    private final /* synthetic */ File CNjU;

    wvyx$1(wvyx wvyx2, File file) {
        this.DlBB = wvyx2;
        this.CNjU = file;
    }

    @Override
    public void run() {
        if (wvyx$1.EM((File)o.a(this, 587028417)) != false) {
            try {
                wvyx$1.EM((File)o.a(this, 587028417));
                wvyx$1.EM((File)o.a(this, 587028417));
                return;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    private static Object EM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

