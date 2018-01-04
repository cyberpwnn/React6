/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class XSMK
extends FMkR {
    private ntkx Fyjx;

    public XSMK() {
        this.Fyjx = new XSMK$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)XSMK.Be(nJPf$sILv.G("\u17e2\u77dd\u602d\ud401\ub0b8\uccb2\u227c\u1914\ub5be\u4cd2\u5364\u670b\u8836\u1065\udde5\u4f32\u47be\u91b7\u106c\u77fa\ua2f8\u56a6\u13e4\u58f1")));
        this.setDescription((String)XSMK.Be(nJPf$sILv.G("\u17e2\u77dd\u602d\ud401\ub0b8\uccb2\u227c\u1914\ub5be\u4cd2\u5364\u670b\u8836\u1065\udde5\u4f32\u47be\u91b7\u106c\u77fa\ua2f2\u56a2\u13fa\u58f7\u43ed\u7072\u16ab\ubb11\u5d19\u0a79\u2aa9")));
        this.setID((String)XSMK.Be((biRJ)((Object)o.k(-1842457882))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(1742689159)), (psKX)((Object)o.k(1742689159)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)(XSMK.Be(XSMK.Be(this.IVtS())) - XSMK.Be(this.IVtS())));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -457877622);
    }

    private static Object Be(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

