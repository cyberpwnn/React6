/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class qltw
extends FMkR {
    private ntkx Fyjx;

    public qltw() {
        this.Fyjx = new qltw$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)qltw.rH(FMkR$WjFM.a("\udc16\u352c\u3905\u21de\uf4fe\u1b92\u1ee3\u8c9f\uc01c\uc9c7\u4049\u12b2\ud156\udb4e\ub104\u2b61\ub67a\u771e\u874d\u255b\u3e08\u87ac\u3d06\u2ad2\u7aa6\u309d\uc3f8\u2a7a")));
        this.setDescription((String)qltw.rH(FMkR$WjFM.a("\udc16\u352c\u3905\u21de\uf4fe\u1b92\u1ee3\u8c9f\uc01c\uc9c7\u4049\u12b2\ud156\udb4e\ub104\u2b61\ub67a\u771e\u874d\u255b\u3e08\u87ac\u3d06\u2ad2\u7aac\u3099\uc3e6\u2a7c\u5777\u2eab\u8ab7\u88eb\ua684\u55c5\u4244")));
        this.setID((String)qltw.rH((biRJ)((Object)o.k(265835244))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        try {
            this.setValue((double)qltw.rH(qltw.rH((mXRj)o.a((TEqA)o.k(911295720), 878134470))));
            return;
        }
        catch (Exception exception) {
            this.setValue(0.0);
            return;
        }
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -1780394091);
    }

    private static Object rH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

