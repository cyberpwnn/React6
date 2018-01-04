/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class ktHX$3
extends XAcv<Double> {
    final /* synthetic */ ktHX EBjP;

    ktHX$3(ktHX ktHX2) {
        this.EBjP = ktHX2;
    }

    @Override
    public void yJLS(Double d) {
        Object object = ktHX$3.tN(d);
        Object object2 = (String)o.k(1289110734);
        ktHX$3.tN((ktHX)o.a(this, 628573389), object);
        object2 = ktHX$3.tN(object2, FMkR$WjFM.a("\ued88\ud3be"), ktHX$3.tN(ktHX$3.tN((ktHX)o.a(this, 628573389)), false));
        ktHX$3.tN((ktHX)o.a(this, 628573389), object2);
    }

    private static Object tN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

