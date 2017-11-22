/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class FFBA
extends jqQR {
    public static wfPa<String> uFha;

    @Override
    public void start() {
        FFBA.ssNb(new FFBA$1(this));
    }

    public static void ssNb(Runnable runnable) {
        Object object = FFBA.YL((wfPa)FFBA.YL((ktOu)cv.e(-1326510031), FFBA.YL(-8)));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            try {
                FFBA.YL(FFBA.YL(class_, rgig$AWxc.r("\u88c2\ua335\u777b\u5476\ud238\u6f77"), new Class[]{Runnable.class}), null, new Object[]{runnable});
                return;
            }
            catch (Exception exception) {
            }
        }
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
    }

    static {
        cv.V(1675424468, new wfPa());
    }

    private static Object YL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

