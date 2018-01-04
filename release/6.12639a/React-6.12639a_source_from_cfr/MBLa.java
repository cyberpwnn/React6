/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class MBLa
extends FMkR {
    private ntkx Fyjx;

    public MBLa() {
        this.Fyjx = new MBLa$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)MBLa.Qa(nJPf$sILv.G("\u4f34\u2bee\u555f\u0cf1\u0d66\ufc7e\u8391\u63db\u9f72\uf7d6\u3dcd\u8abe\u803b\u6531\u0bff\u1ed1\u6bad\udf3f\u112b\ub14e\u7dd3\u7625\uf126")));
        this.setDescription((String)MBLa.Qa(nJPf$sILv.G("\u4f34\u2bee\u555f\u0cf1\u0d66\ufc7e\u8391\u63db\u9f72\uf7d6\u3dcd\u8abe\u803b\u6531\u0bff\u1ed1\u6bad\udf3f\u112b\ub144\u7dd7\u763b\uf120\u0c1d\u2888\ue6b4\u2ab7\ueb1e\u3538\uf7fc")));
        this.setID((String)MBLa.Qa((biRJ)((Object)o.k(-1092463922))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)MBLa.Qa(MBLa.Qa((YLuU)o.a((TEqA)o.k(911295720), -1625533873))));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 1272141730);
    }

    private static Object Qa(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

