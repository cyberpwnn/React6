/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class JkaV$1
extends CxNA {
    final /* synthetic */ JkaV AQFG;
    private final /* synthetic */ feCR ePym;

    JkaV$1(JkaV jkaV, feCR feCR2) {
        this.AQFG = jkaV;
        this.ePym = feCR2;
    }

    @Override
    public void run() {
        Object object = JkaV$1.Eq((feCR)o.a(this, -1607510478));
        while (object.hasNext()) {
            Jbjx jbjx = (Jbjx)object.next();
            JkaV$1.Eq((JkaV)o.a(this, -295872975), JkaV$1.Eq(jbjx), true);
        }
    }

    private static Object Eq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

