/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class rxda$1
implements Runnable {
    final /* synthetic */ File xiiX;
    final /* synthetic */ rxda Rsni;

    rxda$1(rxda rxda2, File file) {
        this.Rsni = rxda2;
        this.xiiX = file;
    }

    @Override
    public void run() {
        if (rxda$1.BP((File)cv.b(this, -1895042504)) != false) {
            try {
                rxda$1.BP((File)cv.b(this, -1895042504));
                rxda$1.BP((File)cv.b(this, -1895042504));
                return;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    private static Object BP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

