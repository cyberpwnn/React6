/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class uqOm
implements LhyL {
    private feCR<kAOQ> Oshh = new feCR();
    private feCR<hHgD> lpKw = new feCR();
    private feCR<hHgD> LQNJ = new feCR();
    private feCR<xynF> tLnl = new feCR();
    public long wVXl;
    public static uqOm aoke;

    public uqOm() {
        o.w(-609594549, this);
        uqOm.Ij(this.paft(), new nJPf());
        this.wVXl = uqOm.Ij();
    }

    @Override
    public feCR<kAOQ> VLkD() {
        return (feCR)o.a(this, -1485613110);
    }

    @Override
    public void yJLS(kAOQ kAOQ2) {
        uqOm.Ij(this.VLkD(), kAOQ2);
    }

    @Override
    public void tick() {
        Object object;
        Object object2 = uqOm.Ij(this.VLkD());
        while (object2.hasNext()) {
            object = (kAOQ)object2.next();
            try {
                object.update();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        object2 = uqOm.Ij((feCR)o.a(this, 2074564553));
        while (object2.hasNext()) {
            object = (hHgD)object2.next();
            Object object3 = uqOm.Ij(this.paft());
            while (object3.hasNext()) {
                xynF xynF2 = (xynF)object3.next();
                xynF2.TEqA((String)uqOm.Ij(object));
            }
        }
        uqOm.Ij((feCR)o.a(this, 2074564553));
    }

    @Override
    public feCR<hHgD> ggmf() {
        return (feCR)o.a(this, 1436637127);
    }

    @Override
    public void yJLS(hHgD hHgD2) {
        if (uqOm.Ij((feCR)o.a(this, 1436637127)) > true) {
            if (uqOm.Ij(uqOm.Ij((hHgD)uqOm.Ij((feCR)o.a(this, 1436637127), uqOm.Ij((feCR)o.a(this, 1436637127)) - true)), uqOm.Ij(hHgD2)) != false) {
                if (uqOm.Ij((String[])uqOm.Ij((hHgD)uqOm.Ij((feCR)o.a(this, 1436637127), uqOm.Ij((feCR)o.a(this, 1436637127)) - true)), (String[])uqOm.Ij(hHgD2)) != false) {
                    return;
                }
            }
        }
        uqOm.Ij((feCR)o.a(this, 1436637127), hHgD2);
        uqOm.Ij((feCR)o.a(this, 2074564553), hHgD2);
    }

    @Override
    public feCR<xynF> paft() {
        return (feCR)o.a(this, -429238333);
    }

    private static Object Ij(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

