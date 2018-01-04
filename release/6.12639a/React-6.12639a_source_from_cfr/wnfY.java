/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class wnfY
extends FMkR {
    private ntkx Fyjx;
    private OXoN iVEr = new OXoN(50);

    public wnfY() {
        this.Fyjx = new wnfY$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)wnfY.tt(nJPf$sILv.G("\uef19\udf6a\u9ea2\ufa33\uae47\ua067\u860e\ud160\u09f4\u0eb3\u3217\ufea6\uc958\u19b2\u9b7c\u48ab\u3985\uc660\u34c0\ude90\ufff8\u56bf\uafff\ud03f\ua820\u5c09\u7ed2\u0308\u6d0c")));
        this.setDescription((String)wnfY.tt(nJPf$sILv.G("\uef19\udf6a\u9ea2\ufa33\uae47\ua067\u860e\ud160\u09f4\u0eb3\u3217\ufea6\uc958\u19b2\u9b7c\u48ab\u3985\uc660\u34c0\ude90\ufff8\u56bf\uafff\ud03f\ua820\u5c03\u7ed6\u0316\u6d0a\u039d\u4621\u9c6c\uf910\u6c82\u0ed2\u31bc")));
        this.setID((String)wnfY.tt((biRJ)((Object)o.k(-1235725590))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(-1868409976)), (psKX)((Object)o.k(-1868409976)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        wnfY.tt((OXoN)o.a(this, -1884006792), wnfY.tt(this.IVtS()));
        this.setValue((double)wnfY.tt((OXoN)o.a(this, -1884006792)));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 2121094774);
    }

    private static Object tt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

