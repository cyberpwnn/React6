/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class XdNf
extends FMkR {
    private ntkx Fyjx;

    public XdNf() {
        this.Fyjx = new XdNf$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)XdNf.ha(nJPf$sILv.G("\u7ff5\u4c22\u5474\uda8c\ua501\u584f\u1628\ua01c\u4dfb\ubf40\u5fed\u4b5b\u410c\u9d30\u490d\u0cd8\ue10c\uf0b0\u253c\u1685\uf343\uf0a0\u0f0f\u39a7")));
        this.setDescription((String)XdNf.ha(nJPf$sILv.G("\u7ff5\u4c22\u5474\uda8c\ua501\u584f\u1628\ua01c\u4dfb\ubf40\u5fed\u4b5b\u410c\u9d30\u490d\u0cd8\ue10c\uf0b0\u253c\u1685\uf349\uf0a4\u0f11\u39a1\u8d49\u5338\u7f13\u4907\u2b84\uf769\u02c7")));
        this.setID((String)XdNf.ha((biRJ)((Object)o.k(1032082136))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(-1118678018)), (psKX)((Object)o.k(-1118678018)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue((double)XdNf.ha(XdNf.ha(XdNf.ha(XdNf.ha()))));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 206919609);
    }

    private static Object ha(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

