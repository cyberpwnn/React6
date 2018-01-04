/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class bFxK
extends FMkR {
    private ntkx Fyjx;

    public bFxK() {
        this.Fyjx = new bFxK$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)bFxK.pu(nJPf$sILv.G("\ua9a9\uc706\uabf8\u5a4a\ua981\uae7c\u54dc\u5342\uc694\uf51f\u755d\u638f\u524d\u6adc\u10b4\u783b\u3173\ua9c9\u159d\ud42d\ua504\ud72c\u62db\uc17d\u6ed6\uc736\u8950")));
        this.setDescription((String)bFxK.pu(nJPf$sILv.G("\ua9a9\uc706\uabf8\u5a4a\ua981\uae7c\u54dc\u5342\uc694\uf51f\u755d\u638f\u524d\u6adc\u10b4\u783b\u3173\ua9c9\u159d\ud42d\ua504\ud72c\u62db\uc177\u6ed2\uc728\u8956\ue24f\ufbf0\uac02\ue11f\u36fb\u7c64\u3a10")));
        this.setID((String)bFxK.pu((biRJ)((Object)o.k(1030509116))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-1118678018)), (psKX)((Object)o.k(-1118678018)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)bFxK.pu(this.IVtS()));
    }

    @Override
    public String get() {
        return bFxK.pu(bFxK.pu(new StringBuilder((String)bFxK.pu(bFxK.pu(mrFx$WjFM.d("\u4021\uc800\u4fba\uaa4f\u9e27\u1d50\u08de\u8df8\ub591\ucae6\u9059\u2671\uae4b\u7142\u2a2b\u8e4e\u3c12\u53c4\uf19a\u1234\u6b51\u620f\u9a3e\u7589\u8631\u0f5e\u53c2\u0884\u6bb4")))), bFxK.pu((int)this.getValue())));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 707680156);
    }

    private static Object pu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

