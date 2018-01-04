/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class mXWy
extends FMkR {
    private ntkx Fyjx;

    public mXWy() {
        this.Fyjx = new mXWy$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)mXWy.TX(mrFx$WjFM.d("\u1e49\u685d\u8b1c\uf57a\u779f\u9143\uc0db\u2264\u4189\u235e\ua4db\uc1b6\u598f\u74f1\u5a94\uf71b\uadc5\u01d2\udb48\u7cf7\u2073\u434b")));
        this.setDescription((String)mXWy.TX(mrFx$WjFM.d("\u1e49\u685d\u8b1c\uf57a\u779f\u9143\uc0db\u2264\u4189\u235e\ua4db\uc1b6\u598f\u74f1\u5a94\uf71b\uadc5\u01d2\udb42\u7cf3\u206d\u434d\ubf5e\ue1e9\u3971\u3f0b\u4f5e\ud720\ucfdb")));
        this.setID((String)mXWy.TX((biRJ)((Object)o.k(652628604))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)mXWy.TX((aoCB)o.a((TEqA)o.k(911295720), 1277777833)));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 637032034);
    }

    private static Object TX(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

