/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class IhcW
extends FMkR {
    private ntkx Fyjx;

    public IhcW() {
        this.Fyjx = new IhcW$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)IhcW.GA(FMkR$WjFM.a("\uc154\uc6e6\uc9aa\ucc4a\u6d7f\u3eae\uc746\u719d\uffb8\u5d0b\u34d6\uab68\u3bd6\uca54\u009e\u64ac\u7ac8\uee97\u8b23\uf74b\ufa13\u7cc9\u487a")));
        this.setDescription((String)IhcW.GA(FMkR$WjFM.a("\uc154\uc6e6\uc9aa\ucc4a\u6d7f\u3eae\uc746\u719d\uffb8\u5d0b\u34d6\uab68\u3bd6\uca54\u009e\u64ac\u7ac8\uee97\u8b23\uf741\ufa17\u7cd7\u487c\u3fa2\ub51b\u22e1\u76fb\u9ed3\u5f79\u39b0")));
        this.setID((String)IhcW.GA((biRJ)((Object)o.k(-1905241372))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(1742689159)), (psKX)((Object)o.k(1742689159)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)IhcW.GA(IhcW.GA(this.IVtS())));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 500193161);
    }

    private static Object GA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

