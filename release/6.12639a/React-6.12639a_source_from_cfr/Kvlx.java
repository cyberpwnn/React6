/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class Kvlx {
    private NwfF CyCE;
    private feCR<NwfF> PSsL;
    private String name;

    public Kvlx(String string, NwfF nwfF) {
        this.name = string;
        this.CyCE = nwfF;
        this.PSsL = new feCR();
    }

    public void yJLS(NwfF nwfF) {
        Kvlx.ZV((feCR)o.a(this, 1246119313), nwfF);
    }

    public NwfF FMkR() {
        return (NwfF)o.a(this, 78529936);
    }

    public void UtIU(NwfF nwfF) {
        o.v(this, 78529936, nwfF);
    }

    public feCR<NwfF> Kvlx() {
        return (feCR)o.a(this, 1246119313);
    }

    public String qlgl() {
        return Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(new StringBuilder(), this.FMkR().aLXV()), this.FMkR().get()), (psKX)((Object)o.k(692209039))), this.FMkR().aLXV()), mrFx$WjFM.d("\u4f15")), this.FMkR().getID()));
    }

    public String HCPo() {
        Object object = "";
        Object object2 = Kvlx.ZV(this.Kvlx());
        while (object2.hasNext()) {
            NwfF nwfF = (NwfF)object2.next();
            Object object3 = Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(new StringBuilder(), nwfF.aLXV()), nwfF.get()), (psKX)((Object)o.k(692209039))), nwfF.aLXV()), nJPf$sILv.G("\u0330")), nwfF.getID()));
            object = Kvlx.ZV(Kvlx.ZV(Kvlx.ZV(new StringBuilder((String)Kvlx.ZV(object)), nJPf$sILv.G("\u0330")), object3));
        }
        if (Kvlx.ZV(object) < 2) {
            return object;
        }
        return Kvlx.ZV(object, true);
    }

    public String getName() {
        return (String)o.a(this, -2098903668);
    }

    public void setName(String string) {
        o.v(this, -2098903668, string);
    }

    public void yJLS(feCR<NwfF> feCR2) {
        o.v(this, 1246119313, feCR2);
    }

    private static Object ZV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

