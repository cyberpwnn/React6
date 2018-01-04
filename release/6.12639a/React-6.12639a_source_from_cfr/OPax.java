/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class OPax
extends FMkR {
    private ntkx Fyjx;

    public OPax() {
        this.Fyjx = new OPax$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)OPax.dI(FMkR$WjFM.a("\uce19\u8415\ue42a\u1e36\u494a\u809c\u2d04\u40d0\u0519\u2b3a\u1a41\u635d\u8ebb\u5d23\u26e4\u02a6")));
        this.setDescription((String)OPax.dI(FMkR$WjFM.a("\uce19\u8415\ue42a\u1e36\u494a\u809c\u2d04\u40d0\u0519\u2b3a\u1a41\u635d\u8eb1\u5d27\u26fa\u02a0\uad61\ua417\u1f72\u7286\u2390\u9c0a\u503e")));
        this.setID((String)OPax.dI((biRJ)((Object)o.k(-1955441954))));
        this.setValue(20.0);
        this.yJLS((psKX)((Object)o.k(-1868409976)), (psKX)((Object)o.k(-1868409976)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)OPax.dI(this.IVtS()));
    }

    @Override
    public String get() {
        if (- this.getValue() > 20.0) {
            return OPax.dI(OPax.dI(OPax.dI(OPax.dI(OPax.dI(OPax.dI(new StringBuilder(), OPax.dI(OPax.dI(0.5)) != false ? (psKX)((Object)o.k(1742689159)) : (psKX)((Object)o.k(568215020))), OPax.dI(nJPf$sILv.G("\ua9c7\u3b08\u3ad3\u8f63\ue11a\ue134\u0f44\uf9a9\ud6c3\ueda1\u3367\u3c0c\uf8f9\u8ade\u4b5b\u5a9c\ubcd4\u3869\u0477\u83d5\u76c6\u89c1\ud0f9\u7a45\u50e0"))), (psKX)((Object)o.k(568215020))), nJPf$sILv.G("\ua994")), OPax.dI(- this.getValue(), true)));
        }
        return OPax.dI(OPax.dI(new StringBuilder((String)OPax.dI(this.xynF().uVol(this.getValue()))), OPax.dI(nJPf$sILv.G("\ua9c7\u3b08\u3ad3\u8f63\ue11a\ue134\u0f44\uf9a9\ud6c3\ueda1\u3367\u3c0c\uf8f9\u8ade\u4b5b\u5a9c\ubcd4\u3869\u0477\u83c0\u76c0\u89cf\ud0e1\u7a4c\u50eb"))));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 990926443);
    }

    private static Object dI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

