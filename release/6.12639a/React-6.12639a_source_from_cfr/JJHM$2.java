/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class JJHM$2
implements Runnable {
    final /* synthetic */ JJHM KMtq;

    JJHM$2(JJHM jJHM) {
        this.KMtq = jJHM;
    }

    @Override
    public void run() {
        JJHM$2.wC(JJHM$2.wC((JJHM)o.a(this, -1326101007)));
        JJHM$2.wC((JJHM)o.a(this, -1326101007));
        JJHM jJHM = (JJHM)o.a(this, -1326101007);
        o.v(jJHM, -751940112, (Integer)o.a(jJHM, -751940112) + 1);
        JJHM$2.wC(JJHM$2.wC((JJHM)o.a(this, -1326101007)));
        JJHM$2.wC((JJHM)o.a(this, -1326101007), JJHM$2.wC(JJHM$2.wC((JJHM)o.a(this, -1326101007))));
        JJHM jJHM2 = (JJHM)o.a(this, -1326101007);
        JJHM$2.wC(jJHM2, JJHM$2.wC(jJHM2) + JJHM$2.wC((JJHM)o.a(this, -1326101007)));
        JJHM$2.wC(JJHM$2.wC((JJHM)o.a(this, -1326101007)));
        JJHM jJHM3 = (JJHM)o.a(this, -1326101007);
        JJHM$2.wC(jJHM3, JJHM$2.wC(jJHM3) + JJHM$2.wC(JJHM$2.wC((JJHM)o.a(this, -1326101007))));
        JJHM$2.wC(JJHM$2.wC((JJHM)o.a(this, -1326101007)));
        JJHM$2.wC(JJHM$2.wC((JJHM)o.a(this, -1326101007)));
        JJHM$2.wC(JJHM$2.wC((JJHM)o.a(this, -1326101007)));
    }

    private static Object wC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

