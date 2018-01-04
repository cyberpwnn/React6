/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class ArMt
implements mGQw {
    private TNku<String, Double> vBVJ = new TNku();

    @Override
    public void yJLS(Elru elru) throws Exception {
        ArMt.gl(elru, ArMt.gl((TNku)o.a(this, -324645763)));
        ArMt.gl(elru, ArMt.gl((TNku)o.a(this, -324645763)));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws Exception {
        Object object = ArMt.gl(rFBK2);
        Object object2 = ArMt.gl(rFBK2);
        ArMt.gl((TNku)o.a(this, -324645763));
        int n = 0;
        do {
            if (n >= ArMt.gl(object)) break;
            ArMt.gl((TNku)o.a(this, -324645763), ArMt.gl(object, n), ArMt.gl(object2, n));
            ++n;
        } while (true);
    }

    public TNku<String, Double> Iyhh() {
        return (TNku)o.a(this, -324645763);
    }

    public void biLo(TNku<String, Double> tNku) {
        o.v(this, -324645763, tNku);
    }

    private static Object gl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

