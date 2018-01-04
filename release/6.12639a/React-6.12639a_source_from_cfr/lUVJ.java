/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class lUVJ
extends FMkR {
    private ntkx Fyjx;

    public lUVJ() {
        this.Fyjx = new lUVJ$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)lUVJ.OO(FMkR$WjFM.a("\u8fec\u90fa\uee0f\u5b18\u2d66\u1f1d\u4c54\uc918\uecde\u0185\u76b9\uc1f1\ue802\u88bc\uef42\u67bf\u3eef\u37b5\ubeda\ub7dc\u1466\ua608\u273a\u831b\u2296\u24b8\u1fb5\u68d4\uf95e")));
        this.setDescription((String)lUVJ.OO(FMkR$WjFM.a("\u8fec\u90fa\uee0f\u5b18\u2d66\u1f1d\u4c54\uc918\uecde\u0185\u76b9\uc1f1\ue802\u88bc\uef42\u67bf\u3eef\u37b5\ubeda\ub7dc\u1466\ua608\u273a\u831b\u2296\u24b2\u1fb1\u68ca\uf958\ue848\u04e8\ua5ed\u8496\u8fc3\u372e\u5bbf")));
        this.setID((String)lUVJ.OO((biRJ)((Object)o.k(-51227950))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(1742689159)), (psKX)((Object)o.k(1742689159)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)lUVJ.OO(this.IVtS()));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 674781184);
    }

    private static Object OO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

