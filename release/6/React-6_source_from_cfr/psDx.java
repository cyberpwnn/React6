/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class psDx
extends Thread {
    public psDx() {
        this.setName(YEBy$TyVf.W("\u5b7f\u28ff\u42fc\u988e\u4e96\u9f69\uadf4\u70e8\uca00\ub69a\u0d52\u67bc\uafe9\uc52b"));
    }

    @Override
    public void run() {
        psDx.tn(KUXS$dwji.S("\ufd4c\uf5dc\ufe88\u6751\u8799\u8ed5\u78a5\u9493\u240e\ud101\ue70c\ue9ac\uba28\u3827\u95c9\u9a2d"));
        while (!psDx.interrupted()) {
            try {
                psDx.tn(50);
                Object object = psDx.tn(psDx.tn());
                while (object.hasNext()) {
                    XSJd xSJd = (XSJd)object.next();
                    xSJd.FFBA();
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    private static Object tn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

