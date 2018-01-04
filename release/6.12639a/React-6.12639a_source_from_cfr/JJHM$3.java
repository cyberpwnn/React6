/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class JJHM$3
implements Runnable {
    final /* synthetic */ JJHM KMtq;
    private final /* synthetic */ int LIHg;

    JJHM$3(JJHM jJHM, int n) {
        this.KMtq = jJHM;
        this.LIHg = n;
    }

    @Override
    public void run() {
        JJHM$3.iw(JJHM$3.iw((JJHM)o.a(this, 18238957)));
        JJHM$3.iw((JJHM)o.a(this, 18238957));
        JJHM jJHM = (JJHM)o.a(this, 18238957);
        o.v(jJHM, -751940112, (Integer)o.a(jJHM, -751940112) + 1);
        JJHM$3.iw(JJHM$3.iw((JJHM)o.a(this, 18238957)));
        JJHM$3.iw((JJHM)o.a(this, 18238957), JJHM$3.iw(JJHM$3.iw((JJHM)o.a(this, 18238957))));
        JJHM jJHM2 = (JJHM)o.a(this, 18238957);
        JJHM$3.iw(jJHM2, JJHM$3.iw(jJHM2) + JJHM$3.iw((JJHM)o.a(this, 18238957)));
        JJHM$3.iw(JJHM$3.iw((JJHM)o.a(this, 18238957)));
        JJHM jJHM3 = (JJHM)o.a(this, 18238957);
        JJHM$3.iw(jJHM3, JJHM$3.iw(jJHM3) + JJHM$3.iw(JJHM$3.iw((JJHM)o.a(this, 18238957))));
        JJHM$3.iw(JJHM$3.iw((JJHM)o.a(this, 18238957)));
        JJHM$3.iw(JJHM$3.iw((JJHM)o.a(this, 18238957)));
        JJHM$3.iw(JJHM$3.iw((JJHM)o.a(this, 18238957)));
        if ((Integer)o.a((JJHM)o.a(this, 18238957), -751940112) >= (Integer)o.a(this, -1118876180)) {
            JJHM$3.iw((JJHM)o.a(this, 18238957));
        }
    }

    private static Object iw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

