/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class UtWk
extends FMkR {
    private ntkx Fyjx;

    public UtWk() {
        this.Fyjx = new UtWk$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)UtWk.SN(nJPf$sILv.G("\u6560\ue508\ue8df\u0f47\u5fa5\u75c4\u6880\ubd82\u4472\u8c71\ue81a\uee1f\ub92e\uc690\u13ae\ub66a\u147d\u3fff\u2dd7\u1763\ud70d\u9dbe\ubd20\uc221\uee79\u6e30\uf348")));
        this.setDescription((String)UtWk.SN(nJPf$sILv.G("\u6560\ue508\ue8df\u0f47\u5fa5\u75c4\u6880\ubd82\u4472\u8c71\ue81a\uee1f\ub92e\uc690\u13ae\ub66a\u147d\u3fff\u2dd7\u1763\ud70d\u9dbe\ubd20\uc22b\uee7d\u6e2e\uf34e\u6118\u9c14\u5972\u954b\ubd12\ub54a\ufb1b")));
        this.setID((String)UtWk.SN((biRJ)((Object)o.k(-200322494))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-1118678018)), (psKX)((Object)o.k(-1118678018)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)UtWk.SN(this.IVtS()));
    }

    @Override
    public String get() {
        return UtWk.SN(UtWk.SN(new StringBuilder((String)UtWk.SN(this.xynF().uVol(this.getValue()))), UtWk.SN(mrFx$WjFM.d("\u665b\ue559\ubc69\u7350\uf887\u8eac\ud832\ue38d\u63b2\u0cbd\u6461\u2798\uec66\u07b4\u540b\u83d1\ubdc2\uaaf1\u8397\u2174\u5db7\u47f8\ud21c\u4f3e\uf7ce\u3c5f\u29e3\u095a\uc0aa"))));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -1259382870);
    }

    private static Object SN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

