/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class OPax$1
implements ntkx {
    final /* synthetic */ OPax FGQE;

    OPax$1(OPax oPax) {
        this.FGQE = oPax;
    }

    @Override
    public String uVol(double d) {
        return OPax$1.Sg(OPax$1.Sg((OPax)o.a(this, 199906926)) > 19.89 ? 20.0 : d, false);
    }

    private static Object Sg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

