/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class HnQt
extends WOht {
    private DXtE dEsb;

    public HnQt() {
        super((jGAA)((Object)o.k(693521649)));
        this.dEsb = HnQt.iF();
    }

    public HnQt(DXtE dXtE) {
        super((jGAA)((Object)o.k(693521649)));
        this.dEsb = dXtE;
    }

    @Override
    public void yJLS(Elru elru) throws Exception {
        HnQt.iF(elru, (DXtE)o.a(this, -429830922));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws Exception {
        HnQt.iF(rFBK2, (DXtE)o.a(this, -429830922));
    }

    public DXtE wMIF() {
        return (DXtE)o.a(this, -429830922);
    }

    public void yJLS(DXtE dXtE) {
        o.v(this, -429830922, dXtE);
    }

    private static Object iF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

