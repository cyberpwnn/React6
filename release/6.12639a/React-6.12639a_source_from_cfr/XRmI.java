/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class XRmI
extends FMkR {
    private ntkx Fyjx;

    public XRmI() {
        this.Fyjx = new XRmI$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)XRmI.Ti(nJPf$sILv.G("\ua6d3\u9762\u67e3\ub63b\ufea6\u859f\uf2d9\ud92d\u0458\u87df\u5f60\u8d04\u594c\u0436\u183a\uae8b\ud699\uf056\u38ed\u92ad\ua206\u4565\ue27f\u85fc")));
        this.setDescription((String)XRmI.Ti(nJPf$sILv.G("\ua6d3\u9762\u67e3\ub63b\ufea6\u859f\uf2d9\ud92d\u0458\u87df\u5f60\u8d04\u594c\u0436\u183a\uae8b\ud699\uf056\u38ed\u92ad\ua20c\u4561\ue261\u85fa\uf1a9\u5af7\u9bf7\u183c\u5d77\u6744\u796c")));
        this.setID((String)XRmI.Ti((biRJ)((Object)o.k(781996670))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)XRmI.Ti((aoCB)o.a((TEqA)o.k(911295720), 1277777833)));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 1611159461);
    }

    private static Object Ti(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

