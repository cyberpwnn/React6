/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class gEea
extends FMkR {
    private ntkx Fyjx;

    public gEea() {
        this.Fyjx = new gEea$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)gEea.OM(FMkR$WjFM.a("\ud103\uba8e\u3b2b\u14a1\u8cf2\u5f6a\ufd2f\ud8c2\u8374\u432f\u9131\u948d\u03e5\u5bb8\ub931\ue25f\ucd73\u3784\uc081\uf8b3\u48e7\u72f4\u47e6\u7db1\u7b80\u03b5\ue27a\uaacf\u16e4\u2d23")));
        this.setDescription((String)gEea.OM(FMkR$WjFM.a("\ud103\uba8e\u3b2b\u14a1\u8cf2\u5f6a\ufd2f\ud8c2\u8374\u432f\u9131\u948d\u03e5\u5bb8\ub931\ue25f\ucd73\u3784\uc081\uf8b3\u48e7\u72f4\u47e6\u7db1\u7b80\u03b5\ue270\uaacb\u16fa\u2d25\u066b\ua523\uc1e6\u16df\ua3e9\u6c55\ubc18")));
        this.setID((String)gEea.OM((biRJ)((Object)o.k(1614828036))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        try {
            this.setValue((double)gEea.OM(gEea.OM((WiUt)o.a((TEqA)o.k(911295720), 1578190000))));
            return;
        }
        catch (Exception exception) {
            this.setValue(0.0);
            return;
        }
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 1610504068);
    }

    private static Object OM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

