/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class Drdy
extends FMkR {
    private ntkx Fyjx;

    public Drdy() {
        this.Fyjx = new Drdy$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)Drdy.nf(nJPf$sILv.G("\uc591\uaabc\u744f\u23a6\ua71a\u4fbf\u07ce\uc0dd\uf0c6\ue3af\ub0dc\u8a11\u1dbb\u16b7\u6059\u4e1c\u67a9\u67d8\u253e\u2d32\ued4b\u4ca6\ub4cf\u8d58\u1b80\u7a9c\u8a86")));
        this.setDescription((String)Drdy.nf(nJPf$sILv.G("\uc591\uaabc\u744f\u23a6\ua71a\u4fbf\u07ce\uc0dd\uf0c6\ue3af\ub0dc\u8a11\u1dbb\u16b7\u6059\u4e1c\u67a9\u67d8\u253e\u2d32\ued4b\u4ca6\ub4cf\u8d52\u1b84\u7a82\u8a80\u3a79\ucd96\u653d\u2eaa\u5724\u0b1b\u0bfc")));
        this.setID((String)Drdy.nf((biRJ)((Object)o.k(910316276))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        try {
            this.setValue((double)Drdy.nf(Drdy.nf((eilm)o.a((TEqA)o.k(911295720), 180896829))));
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
        return (ntkx)o.a(this, -1132111988);
    }

    private static Object nf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

