/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class HeSD$2
implements nceQ<GjaJ> {
    final /* synthetic */ HeSD kQxI;

    HeSD$2(HeSD heSD) {
        this.kQxI = heSD;
    }

    public GjaJ HeSD() {
        CgHM cgHM = new CgHM();
        HeSD$2.ap(cgHM, HeSD$2.ap(10000));
        return cgHM;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.HeSD();
    }

    private static Object ap(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

