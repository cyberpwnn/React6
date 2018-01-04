/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class CoVI$1
implements nceQ<GjaJ> {
    final /* synthetic */ CoVI ofuG;

    CoVI$1(CoVI coVI) {
        this.ofuG = coVI;
    }

    public GjaJ HeSD() {
        Rapb rapb = new Rapb();
        CoVI$1.Bj(rapb);
        return rapb;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.HeSD();
    }

    private static Object Bj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

