/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class BAkl
extends FMkR {
    private ntkx Fyjx;

    public BAkl() {
        this.Fyjx = new BAkl$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)BAkl.QE(mrFx$WjFM.d("\u11db\uda3f\ub392\u5a2c\u4520\ue2e7\u1006\u979c\uad95\u5345\u8f4e\u654f\u959f\uaeef\u24f4\u6c34\uc0ac\u5030\u89fa\u999e\u3677\u8db5\u20b7\ud387\u07ee\u25a3\udbb7\u5f65\u5b0d\u26b5\uc553")));
        this.setDescription((String)BAkl.QE(mrFx$WjFM.d("\u11db\uda3f\ub392\u5a2c\u4520\ue2e7\u1006\u979c\uad95\u5345\u8f4e\u654f\u959f\uaeef\u24f4\u6c34\uc0ac\u5030\u89fa\u999e\u3677\u8db5\u20b7\ud387\u07ee\u25a3\udbb7\u5f6f\u5b09\u26ab\uc555\uad32\u3829\u85e2\u2a5a\u39c4\u9246\ucd24")));
        this.setID((String)BAkl.QE((biRJ)((Object)o.k(1119769096))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)BAkl.QE((aoCB)o.a((TEqA)o.k(911295720), 1277777833)));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -1124116876);
    }

    private static Object QE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

