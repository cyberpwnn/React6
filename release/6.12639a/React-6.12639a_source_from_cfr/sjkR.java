/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class sjkR
extends FMkR {
    private ntkx Fyjx;

    public sjkR() {
        this.Fyjx = new sjkR$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)sjkR.ry(nJPf$sILv.G("\u5b11\u1382\u8baa\u6ea0\u275f\u945b\uab51\uffc5\u36bc\uc016\u0705\u6bd9\u2bdb\u2a08\u0f89\u87eb\ud20b\u2058\uf6a8\u51d4\uf4fc\u96e3\ua250\ucf52\ubeca\uaf8d\u965a\uaad6\u655e")));
        this.setDescription((String)sjkR.ry(nJPf$sILv.G("\u5b11\u1382\u8baa\u6ea0\u275f\u945b\uab51\uffc5\u36bc\uc016\u0705\u6bd9\u2bdb\u2a08\u0f89\u87eb\ud20b\u2058\uf6a8\u51d4\uf4fc\u96e3\ua250\ucf52\ubeca\uaf87\u965e\uaac8\u6558\ubdde\uaede\u34ad\u8b36\u0b45\uf272\u2881")));
        this.setID((String)sjkR.ry((biRJ)((Object)o.k(-529313032))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)sjkR.ry(sjkR.ry((mXRj)o.a((TEqA)o.k(911295720), 878134470))));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -918202477);
    }

    private static Object ry(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

