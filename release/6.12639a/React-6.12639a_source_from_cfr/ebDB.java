/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class ebDB
extends FMkR {
    private ntkx Fyjx;

    public ebDB() {
        this.Fyjx = new ebDB$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)ebDB.TZ(nJPf$sILv.G("\u5c9f\u83a6\uf8db\u50e9\ucb4d\uc166\u5731\u4fa1\uc6a5\uf5fc\uef4a\u2acb\u72cb\uea8c\u2534\ua08b\u45bf\u4121\uff0a\u83c6\u137c\u2516\u8629\uf104\u481f\ue079\u26a7\ud6c8")));
        this.setDescription((String)ebDB.TZ(nJPf$sILv.G("\u5c9f\u83a6\uf8db\u50e9\ucb4d\uc166\u5731\u4fa1\uc6a5\uf5fc\uef4a\u2acb\u72cb\uea8c\u2534\ua08b\u45bf\u4121\uff0a\u83c6\u137c\u2516\u8629\uf104\u4815\ue07d\u26b9\ud6ce\u8eae\ub994\u5ded\u2059\uce86\u7f03\ue35b")));
        this.setID((String)ebDB.TZ((biRJ)((Object)o.k(2002014962))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(5);
    }

    @Override
    public void IgvC() {
        this.setValue((double)ebDB.TZ(ebDB.TZ((WiUt)o.a((TEqA)o.k(911295720), 1578190000))));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -932423802);
    }

    private static Object TZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

