/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class qltY
extends FMkR {
    private ntkx Fyjx;

    public qltY() {
        this.Fyjx = new qltY$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)qltY.TC(mrFx$WjFM.d("\uc680\ubc46\ub0de\u818b\u933b\uaec5\uf5aa\u8601\u0a45\u2a16\u1a1d\ufdcd\ubd48\u9f2e\udf27\u0b47\u1311\u34f3\ufc6a\uff9e\u3ca3\u15b0\ucbe7\ua8fe\u4cb2\uacf5\u453c\u6632\u81cc\u8a6d\u7fd0")));
        this.setDescription((String)qltY.TC(mrFx$WjFM.d("\uc680\ubc46\ub0de\u818b\u933b\uaec5\uf5aa\u8601\u0a45\u2a16\u1a1d\ufdcd\ubd48\u9f2e\udf27\u0b47\u1311\u34f3\ufc6a\uff9e\u3ca3\u15b0\ucbe7\ua8fe\u4cb2\uacf5\u453c\u6638\u81c8\u8a73\u7fd6\ub4cf\ude61\u3489\u4898\u6a71\ue2f7\uf7c4")));
        this.setID((String)qltY.TC((biRJ)((Object)o.k(-1952623888))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)qltY.TC(qltY.TC((WiUt)o.a((TEqA)o.k(911295720), 1578190000))));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 333862514);
    }

    private static Object TC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

