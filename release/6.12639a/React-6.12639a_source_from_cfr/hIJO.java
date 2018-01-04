/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class hIJO
extends FMkR {
    private ntkx Fyjx;

    public hIJO() {
        this.Fyjx = new hIJO$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)hIJO.gN(FMkR$WjFM.a("\u0792\u8ebb\ud922\ube91\ue161\u0a48\udcf9\u5f51\u9fd0\u5289\u7d3a\u4f20\u86b6\ud7c4\u743e\u8bc6\ua320\ua760\ue943\u5574\u0dc8\uaea3\u57a8\ucb33\ud3ca\u7fab\ue987\uca25")));
        this.setDescription((String)hIJO.gN(FMkR$WjFM.a("\u0792\u8ebb\ud922\ube91\ue161\u0a48\udcf9\u5f51\u9fd0\u5289\u7d3a\u4f20\u86b6\ud7c4\u743e\u8bc6\ua320\ua760\ue943\u5574\u0dc8\uaea3\u57a8\ucb33\ud3c0\u7faf\ue999\uca23\u165d\uf1bc\u5c50\u3014\u9693\u8044\u1048")));
        this.setID((String)hIJO.gN((biRJ)((Object)o.k(1642156608))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(-1118678018)), (psKX)((Object)o.k(-1118678018)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)hIJO.gN(this.IVtS()));
    }

    @Override
    public String get() {
        return hIJO.gN(hIJO.gN(new StringBuilder((String)hIJO.gN(hIJO.gN(mrFx$WjFM.d("\u49b6\ub310\u3315\u7b24\u42a1\u5524\ua9e1\ub382\u930e\uf8bb\u6cfe\ub62d\uf9bc\u970c\udab7\u86d2\u1350\u1f2d\u1bac\uc962\u26bd\u421f\u181b\u6620\u43ab\u7295\u6b0e\ua6d4\ub671\u3510")))), this.xynF().uVol(this.getValue())));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 2037077918);
    }

    private static Object gN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

