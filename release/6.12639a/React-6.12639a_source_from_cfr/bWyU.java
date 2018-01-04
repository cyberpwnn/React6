/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class bWyU
extends FMkR {
    private ntkx Fyjx;

    public bWyU() {
        this.Fyjx = new bWyU$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)bWyU.Vr(nJPf$sILv.G("\u5e15\u828f\u8571\u445c\ua00a\u5c08\uc7c5\ua18b\u3f1a\uac47\u1e91\u73fe\u60ee\u14d2\u9673\uf66d\u9c96\u02ef\uf55c\u1246\u4759\u8f91\u08fb\u7ad5\u999c\uf8a8\ua241\ucae7\u80cd\u89c2\uc99e\u6eb2\u764c\u7f36\u57d7")));
        this.setDescription((String)bWyU.Vr(nJPf$sILv.G("\u5e15\u828f\u8571\u445c\ua00a\u5c08\uc7c5\ua18b\u3f1a\uac47\u1e91\u73fe\u60ee\u14d2\u9673\uf66d\u9c96\u02ef\uf55c\u1246\u4759\u8f91\u08fb\u7ad5\u999c\uf8a8\ua241\ucae7\u80cd\u89c2\uc99e\u6eb8\u7648\u7f28\u57d1\u6618\u6046\u8add\u9708\uebf1\u800e\u060a")));
        this.setID((String)bWyU.Vr((biRJ)((Object)o.k(998789642))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-857517477)), (psKX)((Object)o.k(-857517477)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)bWyU.Vr((aoCB)o.a((TEqA)o.k(911295720), 1277777833)));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -1858054233);
    }

    private static Object Vr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

