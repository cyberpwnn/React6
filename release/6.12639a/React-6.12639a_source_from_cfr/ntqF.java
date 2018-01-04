/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class ntqF
extends FMkR {
    private ntkx Fyjx;

    public ntqF() {
        this.Fyjx = new ntqF$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)ntqF.wO(nJPf$sILv.G("\u9564\u467f\u27fc\u8163\u7d8c\u42c5\u075b\uc00e\u987e\u5c56\ua12c\uf42c\u55dd\ub30d\uf43d\u5606\u9084\u3471\ueaba\uf7dd\uc723\u0a19\ub791\ubb1e\u4d56\uf4eb\u336e")));
        this.setDescription((String)ntqF.wO(nJPf$sILv.G("\u9564\u467f\u27fc\u8163\u7d8c\u42c5\u075b\uc00e\u987e\u5c56\ua12c\uf42c\u55dd\ub30d\uf43d\u5606\u9084\u3471\ueaba\uf7dd\uc723\u0a19\ub791\ubb14\u4d52\uf4f5\u3368\u0bb3\u1c6a\ucec6\u1266\ud082\ud101\ub075")));
        this.setID((String)ntqF.wO((biRJ)((Object)o.k(-768322944))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)ntqF.wO((aoCB)o.a((TEqA)o.k(911295720), 1277777833)));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 1489589856);
    }

    private static Object wO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

