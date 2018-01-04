/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class dDgX
extends ggmf {
    public static String dMxt;
    public static feCR<String> jqna;

    static {
        o.w(1787909858, new feCR());
    }

    @Override
    public void start() {
        dDgX.yJLS(new dDgX$1(this));
    }

    public static void xykf(String string) {
        new dDgX$2(string);
    }

    public static void BuLd() {
        Object object = dDgX.Ya((feCR)dDgX.Ya((TNku)o.k(278287122), dDgX.Ya(-10)));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            try {
                Thread thread = (Thread)dDgX.Ya(class_);
                new dDgX$3(thread);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    public static void yJLS(Runnable runnable) {
        Object object = dDgX.Ya((feCR)dDgX.Ya((TNku)o.k(278287122), dDgX.Ya(-8)));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            try {
                dDgX.Ya(dDgX.Ya(class_, mrFx$WjFM.d("\ub281\u3780\u9119\u1f9c\u63cb\u18ba"), new Class[]{Runnable.class}), null, new Object[]{runnable});
                return;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
    }

    private static Object Ya(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

