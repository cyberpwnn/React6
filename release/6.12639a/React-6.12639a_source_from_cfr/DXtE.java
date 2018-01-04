/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class DXtE
implements mGQw {
    private String BStW;
    private int oVtL;
    private String qLXu;
    private String TYHM;
    private int maxPlayers;
    private feCR<String> KpOw;
    private int viewDistance;
    private int sImr;
    private String Hwge;
    private feCR<mGQw> AsUQ;
    private feCR<String> iweW;
    private feCR<String> Gcbv;
    private feCR<String> fLYo;

    public static DXtE XcqT() {
        return new DXtE$1();
    }

    public DXtE() {
        this.BStW = this.mFpP();
        this.oVtL = this.Lqeo();
        this.qLXu = this.rMoL();
        this.TYHM = this.gxcp();
        this.maxPlayers = this.xGOy();
        this.viewDistance = this.cBEB();
        this.sImr = this.bhsi();
        this.Hwge = this.nceQ();
        this.AsUQ = this.QVao();
        this.iweW = this.XAcv();
        this.Gcbv = this.tBsG();
        this.fLYo = this.LFqk();
        this.KpOw = this.qmPN();
    }

    @Override
    public void yJLS(Elru elru) throws Exception {
        DXtE.Zg(elru, (String)o.a(this, -1639625501));
        DXtE.Zg(elru, (Integer)o.a(this, -869511982));
        DXtE.Zg(elru, (String)o.a(this, 412110032));
        DXtE.Zg(elru, (String)o.a(this, -307999537));
        DXtE.Zg(elru, (Integer)o.a(this, -1461039922));
        DXtE.Zg(elru, (Integer)o.a(this, 1137003725));
        DXtE.Zg(elru, (Integer)o.a(this, 718163148));
        DXtE.Zg(elru, (String)o.a(this, 117066955));
        DXtE.Zg(elru, (feCR)o.a(this, -1821553446));
        DXtE.Zg(elru, (feCR)o.a(this, 572148953));
        DXtE.Zg(elru, (feCR)o.a(this, 1661684952));
        DXtE.Zg(elru, (feCR)o.a(this, 527781079));
        DXtE.Zg(elru, (feCR)o.a(this, -267957034));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws Exception {
        o.v(this, -1639625501, DXtE.Zg(rFBK2));
        o.v(this, -869511982, (int)DXtE.Zg(rFBK2));
        o.v(this, 412110032, DXtE.Zg(rFBK2));
        o.v(this, -307999537, DXtE.Zg(rFBK2));
        o.v(this, -1461039922, (int)DXtE.Zg(rFBK2));
        o.v(this, 1137003725, (int)DXtE.Zg(rFBK2));
        o.v(this, 718163148, (int)DXtE.Zg(rFBK2));
        o.v(this, 117066955, DXtE.Zg(rFBK2));
        o.v(this, -1821553446, DXtE.Zg(rFBK2, new goyd()));
        o.v(this, 572148953, DXtE.Zg(rFBK2));
        o.v(this, 1661684952, DXtE.Zg(rFBK2));
        o.v(this, 527781079, DXtE.Zg(rFBK2));
        o.v(this, -267957034, DXtE.Zg(rFBK2));
    }

    protected abstract String mFpP();

    protected abstract int Lqeo();

    protected abstract String rMoL();

    protected abstract String gxcp();

    protected abstract int xGOy();

    protected abstract feCR<String> qmPN();

    protected abstract int cBEB();

    protected abstract int bhsi();

    protected abstract String nceQ();

    protected abstract feCR<mGQw> QVao();

    protected abstract feCR<String> XAcv();

    protected abstract feCR<String> tBsG();

    protected abstract feCR<String> LFqk();

    public String getMotd() {
        return (String)o.a(this, -1639625501);
    }

    public int JJHM() {
        return (Integer)o.a(this, -869511982);
    }

    public String vbvg() {
        return (String)o.a(this, 412110032);
    }

    public String EeKu() {
        return (String)o.a(this, -307999537);
    }

    public int getMaxPlayers() {
        return (Integer)o.a(this, -1461039922);
    }

    public feCR<String> BBRC() {
        return (feCR)o.a(this, -267957034);
    }

    public int getViewDistance() {
        return (Integer)o.a(this, 1137003725);
    }

    public int tvby() {
        return (Integer)o.a(this, 718163148);
    }

    public String pivX() {
        return (String)o.a(this, 117066955);
    }

    public feCR<mGQw> fSgy() {
        return (feCR)o.a(this, -1821553446);
    }

    public feCR<String> xFyR() {
        return (feCR)o.a(this, 572148953);
    }

    public feCR<String> NLvB() {
        return (feCR)o.a(this, 1661684952);
    }

    public feCR<String> loLI() {
        return (feCR)o.a(this, 527781079);
    }

    private static Object Zg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

