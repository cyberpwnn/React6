/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class IiDT
extends FMkR {
    private ntkx Fyjx;

    public IiDT() {
        this.Fyjx = new IiDT$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)IiDT.Xo(nJPf$sILv.G("\ue138\ubb49\u2ce3\ue016\u78d3\ueb22\u99d4\u4a41\u8c12\u398e\uce44\u4b23\ud9c6\u4b19\ub29b\ua957\ub35d\ua2ed\u36ab\uca29\uc399\ucb5b\u534e\ub3fc")));
        this.setDescription((String)IiDT.Xo(nJPf$sILv.G("\ue138\ubb49\u2ce3\ue016\u78d3\ueb22\u99d4\u4a41\u8c12\u398e\uce44\u4b23\ud9c6\u4b19\ub29b\ua957\ub35d\ua2ed\u36ab\uca29\uc393\ucb5f\u5350\ub3fa\ubddb\u5c28\ue850\ubb20\u4c5e\ub50f\u4d65")));
        this.setID((String)IiDT.Xo((biRJ)((Object)o.k(737891048))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(1742689159)), (psKX)((Object)o.k(1742689159)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)IiDT.Xo(this.IVtS()));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 2121160584);
    }

    private static Object Xo(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

