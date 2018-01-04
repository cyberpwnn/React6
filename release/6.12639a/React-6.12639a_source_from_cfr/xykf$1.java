/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class xykf$1
implements nceQ<GjaJ> {
    final /* synthetic */ xykf nuWa;

    xykf$1(xykf xykf2) {
        this.nuWa = xykf2;
    }

    public GjaJ HeSD() {
        Rapb rapb = new Rapb();
        xykf$1.xv(rapb);
        return rapb;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.HeSD();
    }

    private static Object xv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

