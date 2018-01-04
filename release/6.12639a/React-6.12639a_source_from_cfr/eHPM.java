/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class eHPM
extends FMkR {
    private ntkx Fyjx;

    public eHPM() {
        this.Fyjx = new eHPM$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)eHPM.HF(FMkR$WjFM.a("\u304a\u7e0f\u5509\u1772\u555a\u9cea\u66c2\ud89d\u4de8\u9afe\u86d5\u38dc\u7f8c\ube77\u7f5d\u18b4\uf928")));
        this.setDescription((String)eHPM.HF(FMkR$WjFM.a("\u304a\u7e0f\u5509\u1772\u555a\u9cea\u66c2\ud89d\u4de8\u9afe\u86d5\u38dc\u7f8c\ube7d\u7f59\u18aa\uf92e\ube23\uf781\u6845\u71b5\u1c3d\u87b5\u08ec")));
        this.setID((String)eHPM.HF((biRJ)((Object)o.k(-659533104))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(1742689159)), (psKX)((Object)o.k(1742689159)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)eHPM.HF(this.IVtS()));
    }

    @Override
    public String get() {
        return eHPM.HF(eHPM.HF(new StringBuilder(nJPf$sILv.G("\u31cf\u1b1b")), this.xynF().uVol(this.getValue())));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 912611326);
    }

    private static Object HF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

