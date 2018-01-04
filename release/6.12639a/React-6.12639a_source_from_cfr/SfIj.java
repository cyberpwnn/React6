/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class SfIj {
    private feCR<VfbL> RLBx;

    public /* varargs */ SfIj(VfbL ... arrvfbL) {
        this.RLBx = new feCR<VfbL>(arrvfbL);
    }

    public SfIj() {
        this.RLBx = new feCR();
    }

    public feCR<VfbL> Ihrv() {
        return (feCR)o.a(this, -404403146);
    }

    public vbpi ivSs() {
        vbpi vbpi2 = new vbpi();
        JRRx jRRx = new JRRx();
        Object object = SfIj.Ef((feCR)o.a(this, -404403146));
        while (object.hasNext()) {
            VfbL vfbL = (VfbL)object.next();
            vbpi vbpi3 = new vbpi();
            SfIj.Ef(vbpi3, mrFx$WjFM.d("\u2d95\udfbe\uc783\u1774"), SfIj.Ef(vfbL));
            SfIj.Ef(vbpi3, mrFx$WjFM.d("\u2d82\udfb4\uc797\u176f\ueca0"), SfIj.Ef(SfIj.Ef(SfIj.Ef(vfbL))));
            SfIj.Ef(jRRx, vbpi3);
        }
        SfIj.Ef(vbpi2, mrFx$WjFM.d("\u2d95\udfbe\uc783\u1774"), "");
        SfIj.Ef(vbpi2, mrFx$WjFM.d("\u2d84\udfa3\uc78f\u1772\uecb3"), jRRx);
        return vbpi2;
    }

    private static Object Ef(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

