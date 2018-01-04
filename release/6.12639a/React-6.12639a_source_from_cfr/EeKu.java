/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class EeKu
implements qSgW {
    private feCR<XcqT> UtnT = new feCR();
    private TNku<String, BBRC> SgQb = new TNku();

    public void yJLS(XcqT xcqT) {
        EeKu.et((feCR)o.a(this, -1703129653), xcqT);
    }

    @Override
    public void owir() {
        Object object = EeKu.et(EeKu.et((feCR)o.a(this, -1703129653)));
        while (object.hasNext()) {
            XcqT xcqT = (XcqT)object.next();
            this.biLo(xcqT);
            if (!xcqT.VfbL()) continue;
            this.UtIU(xcqT);
            EeKu.et((feCR)o.a(this, -1703129653), xcqT);
        }
    }

    private void UtIU(XcqT xcqT) {
        EeKu.et((TNku)o.a(this, -160150054), xcqT.getName());
    }

    private void biLo(XcqT xcqT) {
        if (EeKu.et((TNku)o.a(this, -160150054), xcqT.getName()) == false) {
            EeKu.et((TNku)o.a(this, -160150054), xcqT.getName(), new BBRC());
        }
        BBRC bBRC = (BBRC)EeKu.et((TNku)o.a(this, -160150054), xcqT.getName());
        EeKu.et(bBRC, xcqT.iLTq());
        EeKu.et(bBRC, xcqT.FNbH());
        EeKu.et(bBRC, xcqT.lnpk());
    }

    @Override
    public String YMWq() {
        return FMkR$WjFM.a("\u4a65\u96b2\u9bd9\u0eb9\u8cad\u5273\u1ff8");
    }

    public feCR<XcqT> SfIj() {
        return (feCR)o.a(this, -1703129653);
    }

    public TNku<String, BBRC> WjFM() {
        return (TNku)o.a(this, -160150054);
    }

    private static Object et(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

