/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class ejSW
extends FMkR {
    private ntkx Fyjx;

    public ejSW() {
        this.Fyjx = new ejSW$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)ejSW.yS(mrFx$WjFM.d("\u207b\u62a2\uf5fa\u6f43\u7c33\u5da9\ub964\u9254\u25d7\ue23f\ub7a0\ua3f5\ub78c\u27fa\ufa3f\u3034\u73c7\u5c85\uffc1\u184d\u286e\ua6b1\u0adf\u1e8c\u7f18\ucdb1\uadc8\uae0c")));
        this.setDescription((String)ejSW.yS(mrFx$WjFM.d("\u207b\u62a2\uf5fa\u6f43\u7c33\u5da9\ub964\u9254\u25d7\ue23f\ub7a0\ua3f5\ub78c\u27fa\ufa3f\u3034\u73c7\u5c85\uffc1\u184d\u286e\ua6b1\u0adf\u1e8c\u7f12\ucdb5\uadd6\uae0a\u5d63\u262b\u4ccb\u2bcb\udb31\u348e\ub668")));
        this.setID((String)ejSW.yS((biRJ)((Object)o.k(459035360))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)ejSW.yS(ejSW.yS((eilm)o.a((TEqA)o.k(911295720), 180896829))));
    }

    @Override
    public String get() {
        return ejSW.yS(new StringBuilder((String)ejSW.yS(this.xynF().uVol(this.getValue()))));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -109095014);
    }

    private static Object yS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

