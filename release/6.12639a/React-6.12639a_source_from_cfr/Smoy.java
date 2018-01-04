/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class Smoy
extends PeBo {
    private feCR<jycd> CFVi;
    private TNku<jycd, String> jOtj;
    private TNku<jycd, Long> sImu;

    public Smoy(int n) throws Nwmj {
        super(n);
        Smoy.HS(this.nuLT(), new OirP());
        Smoy.HS(this.nuLT(), new hPyb());
        Smoy.HS(this.nuLT(), new oDiX());
        Smoy.HS(this.nuLT(), new nuLT());
        Smoy.HS(this.nuLT(), new ECDB());
        this.CFVi = new feCR();
        this.sImu = new TNku();
        this.jOtj = new TNku();
    }

    public abstract DXtE CEKe();

    public void yJLS(jycd jycd2) {
        Smoy.HS((feCR)o.a(this, -804041505), jycd2);
    }

    private boolean UtIU(jycd jycd2) {
        Object object = Smoy.HS((feCR)o.a(this, -804041505));
        while (object.hasNext()) {
            jycd jycd3 = (jycd)object.next();
            if (Smoy.HS(Smoy.HS(jycd3), Smoy.HS(jycd2)) == false) continue;
            return (boolean)Smoy.HS(Smoy.HS(jycd3), Smoy.HS(jycd2));
        }
        return false;
    }

    private jycd xynF(String string) {
        Object object = Smoy.HS(Smoy.HS((TNku)o.a(this, 1368607964)));
        while (object.hasNext()) {
            jycd jycd2 = (jycd)object.next();
            if (Smoy.HS((String)Smoy.HS((TNku)o.a(this, 1368607964), jycd2), string) == false) continue;
            return jycd2;
        }
        return null;
    }

    @Override
    public JROj VwLY(JROj jROj) {
        if (jROj instanceof OirP) {
            OirP oirP = (OirP)jROj;
            jycd jycd2 = new jycd((String)Smoy.HS(oirP), (String)Smoy.HS(oirP));
            if (this.UtIU(jycd2)) {
                String string = this.qSgW();
                this.yJLS(jycd2, string);
                return new DXtK(string);
            }
            return new dfot(false);
        }
        if (jROj instanceof hPyb) {
            hPyb hPyb2 = (hPyb)jROj;
            jycd jycd3 = this.xynF((String)Smoy.HS(hPyb2));
            if (jycd3 != null) {
                String string = this.qSgW();
                this.yJLS(jycd3, string);
                return new DXtK(string);
            }
            return new dfot(false);
        }
        if (jROj instanceof oDiX) {
            oDiX oDiX2 = (oDiX)jROj;
            jycd jycd4 = this.xynF((String)Smoy.HS(oDiX2));
            if (jycd4 != null) {
                this.TEqA(jycd4);
                return new dfot(true);
            }
            return new dfot(false);
        }
        if (jROj instanceof nuLT) {
            nuLT nuLT2 = (nuLT)jROj;
            jycd jycd5 = this.xynF((String)Smoy.HS(nuLT2));
            if (jycd5 != null) {
                return new HnQt(this.CEKe());
            }
            return new dfot(false);
        }
        if (jROj instanceof ECDB) {
            ECDB eCDB = (ECDB)jROj;
            jycd jycd6 = this.xynF((String)Smoy.HS(eCDB));
            if (jycd6 != null) {
                long l = this.VwLY(jycd6);
                Object object = Smoy.HS();
                this.biLo(jycd6);
                return new OrfP(this.TNku().biLo(l, (long)object));
            }
            return new dfot(false);
        }
        return new dfot(false);
    }

    public abstract cAiw TNku();

    public void biLo(jycd jycd2) {
        Smoy.HS((TNku)o.a(this, 849169637), jycd2, Smoy.HS(Smoy.HS()));
    }

    public long VwLY(jycd jycd2) {
        if (Smoy.HS((TNku)o.a(this, 849169637), jycd2) == false) {
            return (long)(Smoy.HS() - 10000);
        }
        return (long)Smoy.HS((Long)Smoy.HS((TNku)o.a(this, 849169637), jycd2));
    }

    private void yJLS(jycd jycd2, String string) {
        Smoy.HS((TNku)o.a(this, 1368607964), jycd2, string);
    }

    private void TEqA(jycd jycd2) {
        Smoy.HS((TNku)o.a(this, 1368607964), jycd2);
    }

    private String qSgW() {
        return Smoy.HS(Smoy.HS(Smoy.HS(Smoy.HS()), FMkR$WjFM.a("\ua445"), ""));
    }

    private static Object HS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

