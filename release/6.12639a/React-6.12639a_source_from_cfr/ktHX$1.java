/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class ktHX$1
implements nceQ<GjaJ> {
    final /* synthetic */ ktHX EBjP;

    ktHX$1(ktHX ktHX2) {
        this.EBjP = ktHX2;
    }

    public GjaJ HeSD() {
        Rapb rapb = new Rapb();
        ktHX$1.IL(rapb);
        return rapb;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.HeSD();
    }

    private static Object IL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

