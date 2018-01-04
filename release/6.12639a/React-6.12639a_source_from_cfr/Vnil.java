/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class Vnil
extends FMkR {
    private ntkx Fyjx;

    public Vnil() {
        this.Fyjx = new Vnil$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)Vnil.qx(FMkR$WjFM.a("\u1970\ub1f5\u839d\u665f\ufac7\u7ee0\u8a30\ud183\u03d1\u5af8\ub922\u7fe4\u60cc\uce35\u84cf\u4627\u27cf\ub583\u5414\uedcd\u8215\uf36c\u7c65\ua2e9\u396e\u3dd3")));
        this.setDescription((String)Vnil.qx(FMkR$WjFM.a("\u1970\ub1f5\u839d\u665f\ufac7\u7ee0\u8a30\ud183\u03d1\u5af8\ub922\u7fe4\u60cc\uce35\u84cf\u4627\u27cf\ub583\u5414\uedcd\u8215\uf36c\u7c6f\ua2ed\u3970\u3dd5\u0a0a\u417e\uf86e\uc2a6\uabca\ue0b1\ue265")));
        this.setID((String)Vnil.qx((biRJ)((Object)o.k(-864726310))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)Vnil.qx(this.IVtS()));
    }

    @Override
    public String get() {
        return Vnil.qx(Vnil.qx(new StringBuilder((String)Vnil.qx(this.xynF().uVol(this.getValue()))), Vnil.qx(nJPf$sILv.G("\u7309\u11e3\uc767\u3fed\ue6a1\ue081\u39dc\u7391\ue007\u4c74\uc1fa\u6adfw\ub0af\uf5f9\uf209\u5a14\udad8\u4b03\u8c18\u0ead\u4209\u89a3\u471f\ua9af\u9964"))));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 65230775);
    }

    private static Object qx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

