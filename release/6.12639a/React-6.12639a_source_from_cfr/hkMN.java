/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class hkMN
extends FMkR {
    private ntkx Fyjx;

    public hkMN() {
        this.Fyjx = new hkMN$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)hkMN.hZ(FMkR$WjFM.a("\u20eb\u25ba\ub88b\u183b\u5155\uffd1\uec32\ub697\u8fba\ub8fc\uc080\u9b89\u595d\uba2a\u4331\uc618\ua2dd\uade9\u8c1d\ufa25\uf83e\u41a8\uff0f\ue61e\u7941\u4ae6\uf60a")));
        this.setDescription((String)hkMN.hZ(FMkR$WjFM.a("\u20eb\u25ba\ub88b\u183b\u5155\uffd1\uec32\ub697\u8fba\ub8fc\uc080\u9b89\u595d\uba2a\u4331\uc618\ua2dd\uade9\u8c1d\ufa25\uf83e\u41a8\uff0f\ue614\u7945\u4af8\uf60c\u790d\uba8d\u0a27\u8d1e\u346c\u78ea\uc9e1")));
        this.setID((String)hkMN.hZ((biRJ)((Object)o.k(-567520706))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-1118678018)), (psKX)((Object)o.k(-1118678018)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)hkMN.hZ(this.IVtS()));
    }

    @Override
    public String get() {
        return hkMN.hZ(hkMN.hZ(new StringBuilder((String)hkMN.hZ(hkMN.hZ(mrFx$WjFM.d("\u8eb4\u0dbc\u5b39\u68e8\ua1b6\u7dee\ub0c0\u2b9a\ucebc\u2818\u5d62\u5397\ue599\uc7db\u2a1d\ufa40\uf48f\uabc5\u4a99\u8977\u0560\uc4de\ud6c4\ueb06\ua803\u7dc5\u15cc\u4d58\ua9bd")))), this.xynF().uVol(this.getValue())));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -1948362848);
    }

    private static Object hZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

