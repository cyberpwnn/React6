/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class OrfP
extends WOht {
    private TNku<Long, mGQw> LbQn;

    public OrfP() {
        super((jGAA)((Object)o.k(310791408)));
        this.LbQn = new TNku();
    }

    public OrfP(TNku<Long, mGQw> tNku) {
        super((jGAA)((Object)o.k(310791408)));
        this.LbQn = tNku;
    }

    @Override
    public void yJLS(Elru elru) throws Exception {
        OrfP.QI(elru, OrfP.QI((TNku)o.a(this, 914181355)));
        OrfP.QI(elru, OrfP.QI((TNku)o.a(this, 914181355)));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws Exception {
        Object object = OrfP.QI(rFBK2);
        Object object2 = OrfP.QI(rFBK2, new ArMt());
        OrfP.QI((TNku)o.a(this, 914181355));
        int n = 0;
        do {
            if (n >= OrfP.QI(object)) break;
            OrfP.QI((TNku)o.a(this, 914181355), OrfP.QI(object, n), OrfP.QI(object2, n));
            ++n;
        } while (true);
    }

    public TNku<Long, mGQw> sILv() {
        return (TNku)o.a(this, 914181355);
    }

    public void VwLY(TNku<Long, mGQw> tNku) {
        o.v(this, 914181355, tNku);
    }

    private static Object QI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

