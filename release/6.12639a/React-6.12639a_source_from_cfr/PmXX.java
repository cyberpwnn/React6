/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class PmXX
extends FMkR {
    private ntkx Fyjx;
    private OXoN iVEr = new OXoN(50);

    public PmXX() {
        this.Fyjx = new PmXX$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)PmXX.ET(nJPf$sILv.G("\u41a5\u1f8b\u6288\u6931\ud6cc\u2051\u3755\u6414\u7bdd\u3dfa\u02bd\u148f\uf4f0\uccd1\u86e9\ud856\u92df\u5d7b\u0cf9\u8b94\u6af9\u68b6")));
        this.setDescription((String)PmXX.ET(nJPf$sILv.G("\u41a5\u1f8b\u6288\u6931\ud6cc\u2051\u3755\u6414\u7bdd\u3dfa\u02bd\u148f\uf4f0\uccd1\u86e9\ud856\u92df\u5d7b\u0cf3\u8b90\u6ae7\u68b0\ue6aa\u4fd3\u4572\u020d\uea51\u7138\u465c")));
        this.setID((String)PmXX.ET((biRJ)((Object)o.k(711152348))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(-1868409976)), (psKX)((Object)o.k(-1868409976)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        PmXX.ET((OXoN)o.a(this, 1255626362), PmXX.ET(this.IVtS()));
        this.setValue((double)PmXX.ET(this.IVtS()));
    }

    @Override
    public String get() {
        return PmXX.ET(PmXX.ET(new StringBuilder((String)PmXX.ET(this.xynF().uVol(this.getValue()))), PmXX.ET(FMkR$WjFM.a("\ue6a2\ud7f7\u22f2\udcc6\ucab6\ud746\ub055\u540b\u2554\u66b2\u83e7\ud261\ucca7\u7cfa\u6d14\u0149\u5a94\u7ceb\u91a3\u5e49\u43e3\ue725\ufdeb\u9c81"))));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 2041927289);
    }

    private static Object ET(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

