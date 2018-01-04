/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class PvHf
extends FMkR {
    private ntkx Fyjx;

    public PvHf() {
        this.Fyjx = new PvHf$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)PvHf.oz(mrFx$WjFM.d("\u9614\u0125\u5cbb\u8683\u9bcf\udafc\uf467\u0542\uba05\u9683\ufb61\ub182\uaa86\u59b7\ua66a\u3f5a\u2858\uf9aa\ua4ca\u742d\u5f81\u6751\u6aca\udee8\u3e1f\ubc71\u384e\u53da\u0c54")));
        this.setDescription((String)PvHf.oz(mrFx$WjFM.d("\u9614\u0125\u5cbb\u8683\u9bcf\udafc\uf467\u0542\uba05\u9683\ufb61\ub182\uaa86\u59b7\ua66a\u3f5a\u2858\uf9aa\ua4ca\u742d\u5f81\u6751\u6aca\udee8\u3e1f\ubc7b\u384a\u53c4\u0c52\u456e\ub916\ua09b\u41f5\ucc2f\ua354\uc252")));
        this.setID((String)PvHf.oz((biRJ)((Object)o.k(113332962))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(5);
    }

    @Override
    public void IgvC() {
        this.setValue((double)PvHf.oz(PvHf.oz((eilm)o.a((TEqA)o.k(911295720), 180896829))));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -1147906162);
    }

    private static Object oz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

