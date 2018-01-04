/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class JJHM$1
implements Runnable {
    final /* synthetic */ JJHM KMtq;

    JJHM$1(JJHM jJHM) {
        this.KMtq = jJHM;
    }

    @Override
    public void run() {
        JJHM$1.jG(JJHM$1.jG((JJHM)o.a(this, -142848644)));
        JJHM$1.jG((JJHM)o.a(this, -142848644));
        JJHM$1.jG(JJHM$1.jG((JJHM)o.a(this, -142848644)));
        JJHM$1.jG((JJHM)o.a(this, -142848644), true);
        JJHM$1.jG(JJHM$1.jG((JJHM)o.a(this, -142848644)));
        JJHM$1.jG((JJHM)o.a(this, -142848644), JJHM$1.jG(JJHM$1.jG((JJHM)o.a(this, -142848644))));
        JJHM$1.jG((JJHM)o.a(this, -142848644), JJHM$1.jG(JJHM$1.jG((JJHM)o.a(this, -142848644))));
        JJHM$1.jG((JJHM)o.a(this, -142848644), JJHM$1.jG((JJHM)o.a(this, -142848644)));
        JJHM$1.jG(JJHM$1.jG((JJHM)o.a(this, -142848644)));
        JJHM$1.jG(JJHM$1.jG((JJHM)o.a(this, -142848644)));
    }

    private static Object jG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

