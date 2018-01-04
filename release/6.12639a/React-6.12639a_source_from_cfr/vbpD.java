/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class vbpD
extends JAPK {
    private String username;
    private String password;
    private String HxJV;
    private boolean WPol;
    private DXtE dEsb;
    private TNku<Long, ArMt> fLYb;

    public vbpD(String string, int n) throws Nwmj {
        super(string, n);
        vbpD.rI(this.nuLT(), new DXtK());
        vbpD.rI(this.nuLT(), new HnQt());
        vbpD.rI(this.nuLT(), new dfot());
        vbpD.rI(this.nuLT(), new OrfP());
        this.WPol = false;
        this.fLYb = new TNku();
        this.dEsb = vbpD.rI();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void equl(int n) {
        while (vbpD.rI(this.sILv()) > vbpD.rI(n)) {
            vbpD.rI(this.sILv(), vbpD.rI(vbpD.rI(vbpD.rI(this.sILv())), false));
        }
    }

    public TNku<Long, ArMt> sILv() {
        return (TNku)o.a(this, 509234201);
    }

    public int FgpE() throws Exception {
        if (!((Boolean)o.a(this, -468956136)).booleanValue()) {
            return -1;
        }
        JROj jROj = this.yJLS(new ECDB((String)o.a(this, 266357783)));
        if (jROj instanceof OrfP) {
            Object object = vbpD.rI((OrfP)jROj);
            Object object2 = vbpD.rI(vbpD.rI(object));
            while (object2.hasNext()) {
                Object object3 = vbpD.rI((Long)object2.next());
                vbpD.rI((TNku)o.a(this, 509234201), vbpD.rI(object3), (ArMt)vbpD.rI(object, vbpD.rI(object3)));
            }
            return (int)vbpD.rI(object);
        }
        return -1;
    }

    public boolean AqqI() throws Exception {
        if (!((Boolean)o.a(this, -468956136)).booleanValue()) {
            return false;
        }
        JROj jROj = this.yJLS(new oDiX((String)o.a(this, 266357783)));
        if (jROj instanceof dfot) {
            return (boolean)vbpD.rI((dfot)jROj);
        }
        return false;
    }

    public boolean JQxi() throws Exception {
        if (!((Boolean)o.a(this, -468956136)).booleanValue()) {
            return false;
        }
        JROj jROj = this.yJLS(new nuLT((String)o.a(this, 266357783)));
        if (jROj instanceof HnQt) {
            o.v(this, -1261548525, vbpD.rI((HnQt)jROj));
            return true;
        }
        return false;
    }

    public boolean TpxX() throws Exception {
        if (!((Boolean)o.a(this, -468956136)).booleanValue()) {
            return false;
        }
        JROj jROj = this.yJLS(new hPyb((String)o.a(this, 266357783)));
        if (jROj instanceof DXtK) {
            o.v(this, 266357783, vbpD.rI((DXtK)jROj));
            o.v(this, -468956136, true);
            return true;
        }
        return false;
    }

    public boolean biLo(String string, String string2) throws Exception {
        o.v(this, -1437709183, string);
        o.v(this, 2078493824, string2);
        JROj jROj = this.yJLS(new OirP(string, string2));
        if (jROj instanceof DXtK) {
            o.v(this, 266357783, vbpD.rI((DXtK)jROj));
            o.v(this, -468956136, true);
            return true;
        }
        return false;
    }

    public String getUsername() {
        return (String)o.a(this, -1437709183);
    }

    public String getPassword() {
        return (String)o.a(this, 2078493824);
    }

    public String QWNe() {
        return (String)o.a(this, 266357783);
    }

    public boolean EeMj() {
        return (Boolean)o.a(this, -468956136);
    }

    public DXtE wMIF() {
        return (DXtE)o.a(this, -1261548525);
    }

    private static Object rI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

