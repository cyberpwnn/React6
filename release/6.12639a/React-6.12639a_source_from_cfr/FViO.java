/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class FViO
extends FMkR {
    private ntkx Fyjx;

    public FViO() {
        this.Fyjx = new FViO$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)FViO.tH(nJPf$sILv.G("\ue137\ue4ad\u8848\uc5a8\ub9b9\u5618\ueddf\u91f6\ufc70\ud2ed\u8af7\u5bbd\u3f9a\ud929\u64b6\u9142\u32a0\uc748\ua0d9\u3846\uf010\ue38d\u2a72\u5c42\ufde7\udbce\u3042\ufafe\u8eff\u499b\ub3a5\u98bf\u09a3\uc71f\u78bf\u7c03\u6977\u7161")));
        this.setDescription((String)FViO.tH(nJPf$sILv.G("\ue137\ue4ad\u8848\uc5a8\ub9b9\u5618\ueddf\u91f6\ufc70\ud2ed\u8af7\u5bbd\u3f9a\ud929\u64b6\u9142\u32a0\uc748\ua0d9\u3846\uf010\ue38d\u2a72\u5c42\ufde7\udbce\u3042\ufafe\u8eff\u499b\ub3a5\u98bf\u09a3\uc71f\u78b5\u7c07\u6969\u7167\ua4e6\udf7a\ub0c0\u48f9\u62c1\u14b3\ud5bf")));
        this.setID((String)FViO.tH((biRJ)((Object)o.k(-2017111546))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        try {
            this.setValue((double)(FViO.tH(FViO.tH((WiUt)o.a((TEqA)o.k(911295720), 1578190000))) / 5.0E7));
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
        return (ntkx)o.a(this, 176117361);
    }

    private static Object tH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

