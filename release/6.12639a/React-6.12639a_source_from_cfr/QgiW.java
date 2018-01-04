/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class QgiW
extends FMkR {
    private ntkx Fyjx;

    public QgiW() {
        this.Fyjx = new QgiW$1(this);
    }

    @Override
    public void equl() {
        this.setName(FMkR$WjFM.a("\ua82a\ud9a2\ua5fc\u81b9\u7aae\u637b\u43b2\uf641\u095b\u11b4\ua34d\u7fce"));
        this.setDescription(FMkR$WjFM.a("\ua82c\ud9bb\ua5e0\u81b6\u7ab4\u6364\u43ba\uf65a\u0950\u11e7\ua320\u7ff0\u1155\u40f8\uf7db\u22fc\u35e9\ue643\u6e75\u6684\u9c15\u4fb9\ufb38\ub162\ucfde\u5336\u19df\u02d1\u59cf\u3d5a\ue062\u1426\u2607\u1fe9\u3529\u27c8\u8299\u448c\uafe6\u494d\u8257\uea15\u5b01"));
        this.setID((String)QgiW.Wg((biRJ)((Object)o.k(1264538316))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)QgiW.Wg(QgiW.Wg((YMXs)o.a((TEqA)o.k(911295720), 1289770898))));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -1760733296);
    }

    private static Object Wg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

