/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class mOgX
extends FMkR {
    private ntkx Fyjx;

    public mOgX() {
        this.Fyjx = new mOgX$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)mOgX.qn(nJPf$sILv.G("\u4e26\u12dd\u954e\u6ddf\u13c0\u1f38\uf3f8\u1d25\u9699\u77e0\u4003\u7d66\u23be\u8510\u0b10\ue7f5\u43bf\u76e6\u575c\uf686\u8d85\ue8c2\u9dd6\u097c\u2419\ud252\ue49b\u3e1b\uc260")));
        this.setDescription((String)mOgX.qn(nJPf$sILv.G("\u4e26\u12dd\u954e\u6ddf\u13c0\u1f38\uf3f8\u1d25\u9699\u77e0\u4003\u7d66\u23be\u8510\u0b10\ue7f5\u43bf\u76e6\u575c\uf686\u8d85\ue8c2\u9dd6\u097c\u2419\ud258\ue49f\u3e05\uc266\u2161\u6ad3\uf4b2\ua085\u501d\ub6e2\u139a")));
        this.setID((String)mOgX.qn((biRJ)((Object)o.k(-1282846078))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)mOgX.qn((aoCB)o.a((TEqA)o.k(911295720), 1277777833)));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 1204770723);
    }

    private static Object qn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

