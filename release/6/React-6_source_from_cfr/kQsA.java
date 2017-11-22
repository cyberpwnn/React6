/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class kQsA
implements XSJd {
    private bqeB oEcc = new bqeB(6);
    private bqeB ePvu = new bqeB(6);
    private bqeB nmUK = new bqeB(20);
    private double AGfG = 0.0;
    private double wDix = 0.0;
    private double stSo = 0.0;
    private double LXpr = 0.0;
    private boolean running = false;
    private boolean BJsu = false;
    private double aVMs = 0.0;
    private double AjUU = 0.0;
    private double stSS;
    private long AadL = 0;
    private long cvGJ = 0;
    private long KpBX = 0;
    private long vRiD = 0;
    private int giAG = 0;
    private int NhJL = 0;
    private int LGom = 0;
    private int DjmB = 0;
    private int KfpS = 0;
    private int XeEo = 0;
    private int CFHE = 0;
    private UARh SDVk;
    private WaKm TFyK;
    private DbEj JuQm;
    private StackTraceElement[] QiDo = null;
    private ktOu<Long, wfPa<StackTraceElement>> oDvn = new ktOu();

    public kQsA() {
        this.SDVk = new kQsA$1(this);
        this.TFyK = new kQsA$2(this);
        this.JuQm = new kQsA$3(this);
    }

    public void start() {
        kQsA.nw((WaKm)cv.b(this, -18942187));
        kQsA.nw((DbEj)cv.b(this, 995292951));
        kQsA.nw((UARh)cv.b(this, 1169225489));
        cv.e(this, -2124351725, true);
        kQsA.nw(this);
    }

    public void stop() {
        kQsA.nw((WaKm)cv.b(this, -18942187));
        kQsA.nw((DbEj)cv.b(this, 995292951));
        kQsA.nw((UARh)cv.b(this, 1169225489));
        cv.e(this, -2124351725, false);
        kQsA.nw(this);
    }

    @Override
    public void FFBA() {
        if (((Boolean)cv.b(this, -2124351725)).booleanValue()) {
            kQsA.nw((WaKm)cv.b(this, -18942187));
        }
    }

    @Override
    public String BuHU() {
        return kQsA.nw(kQsA.nw(new StringBuilder(rgig$AWxc.r("\u8b25\uf98c\u0723\u31df\u3f7d\ue37e\u9e6f\u019f\ua2b0\u5038\u8aa3\ua6f2\u62b4")), kQsA.nw(kQsA.nw())));
    }

    public bqeB Nodd() {
        return (bqeB)cv.b(this, 8845081);
    }

    public double tLDs() {
        return (Double)cv.b(this, 550631256);
    }

    public double JkiO() {
        return (Double)cv.b(this, 613283675);
    }

    public boolean isRunning() {
        return (Boolean)cv.b(this, -2124351725);
    }

    public WaKm pXtD() {
        return (WaKm)cv.b(this, -18942187);
    }

    public bqeB ktXk() {
        return (bqeB)cv.b(this, -1759512742);
    }

    public double NgTe() {
        return (Double)cv.b(this, -16255163);
    }

    public double vswA() {
        return (Double)cv.b(this, -1853163708);
    }

    public double yBLM() {
        return (Double)cv.b(this, -124192953);
    }

    public double IXEl() {
        return (Double)cv.b(this, -2076838074);
    }

    public double nRmP() {
        return (Double)cv.b(this, -1599867071);
    }

    public DbEj uyeC() {
        return (DbEj)cv.b(this, 995292951);
    }

    public long DsJQ() {
        return (Long)cv.b(this, 283047744);
    }

    public long XdPy() {
        return (Long)cv.b(this, -704383165);
    }

    public long FMxr() {
        return (Long)cv.b(this, -341969086);
    }

    public bqeB IXDX() {
        return (bqeB)cv.b(this, -1853098163);
    }

    public long vJEF() {
        return (Long)cv.b(this, -710084788);
    }

    public int LqnN() {
        return (Integer)cv.b(this, -1058212017);
    }

    public int jXBg() {
        return (Integer)cv.b(this, -1429604530);
    }

    public int CNCt() {
        return (Integer)cv.b(this, -334760119);
    }

    public int rgig() {
        return (Integer)cv.b(this, -1932527800);
    }

    public int IygB() {
        return (Integer)cv.b(this, 1856239435);
    }

    public UARh JIdp() {
        return (UARh)cv.b(this, 1169225489);
    }

    public int aeww() {
        return (Integer)cv.b(this, 268171082);
    }

    public int TNqe() {
        return (Integer)cv.b(this, -839715019);
    }

    public void ssNb(bqeB bqeB2) {
        cv.e(this, 8845081, bqeB2);
    }

    public void DYFV(bqeB bqeB2) {
        cv.e(this, -1759512742, bqeB2);
    }

    public void IWSm(bqeB bqeB2) {
        cv.e(this, -1853098163, bqeB2);
    }

    public void EmLA(double d) {
        cv.e(this, 550631256, d);
    }

    public void LGKN(double d) {
        cv.e(this, 613283675, d);
    }

    public void NUdB(double d) {
        cv.e(this, -16255163, d);
    }

    public void OOtu(double d) {
        cv.e(this, -1853163708, d);
    }

    public void WGJn(boolean bl) {
        cv.e(this, -2124351725, bl);
    }

    public void aLYV(double d) {
        cv.e(this, -124192953, d);
    }

    public void Smci(double d) {
        cv.e(this, -2076838074, d);
    }

    public void oVCY(double d) {
        cv.e(this, -1599867071, d);
    }

    public void rwyd(long l) {
        cv.e(this, 283047744, l);
    }

    public void hHYn(long l) {
        cv.e(this, -704383165, l);
    }

    public void kQcX(long l) {
        cv.e(this, -341969086, l);
    }

    public void rMgK(long l) {
        cv.e(this, -710084788, l);
    }

    public void GsQl(int n) {
        cv.e(this, -1058212017, n);
    }

    public void DXfX(int n) {
        cv.e(this, -1429604530, n);
    }

    public void EmKi(int n) {
        cv.e(this, -334760119, n);
    }

    public void ejGG(int n) {
        cv.e(this, -1932527800, n);
    }

    public void TNcV(int n) {
        cv.e(this, 1856239435, n);
    }

    public void INcj(int n) {
        cv.e(this, 268171082, n);
    }

    public void VCgr(int n) {
        cv.e(this, -839715019, n);
    }

    public void ssNb(UARh uARh) {
        cv.e(this, 1169225489, uARh);
    }

    public void ssNb(WaKm waKm) {
        cv.e(this, -18942187, waKm);
    }

    public void ssNb(DbEj dbEj) {
        cv.e(this, 995292951, dbEj);
    }

    public boolean isFrozen() {
        return (Boolean)cv.b(this, -1033242828);
    }

    public StackTraceElement[] VoJs() {
        return (StackTraceElement[])cv.b(this, 1223751479);
    }

    public ktOu<Long, wfPa<StackTraceElement>> QhBc() {
        return (ktOu)cv.b(this, -341444810);
    }

    static /* synthetic */ void ssNb(kQsA kQsA2, int n) {
        cv.e(kQsA2, -1058212017, n);
    }

    static /* synthetic */ void DYFV(kQsA kQsA2, int n) {
        cv.e(kQsA2, -334760119, n);
    }

    static /* synthetic */ void IWSm(kQsA kQsA2, int n) {
        cv.e(kQsA2, -1932527800, n);
    }

    static /* synthetic */ void OXeK(kQsA kQsA2, int n) {
        cv.e(kQsA2, -1429604530, n);
    }

    static /* synthetic */ void YoSa(kQsA kQsA2, int n) {
        cv.e(kQsA2, 1856239435, n);
    }

    static /* synthetic */ void jhSt(kQsA kQsA2, int n) {
        cv.e(kQsA2, 268171082, n);
    }

    static /* synthetic */ void BkpW(kQsA kQsA2, int n) {
        cv.e(kQsA2, -839715019, n);
    }

    static /* synthetic */ void ssNb(kQsA kQsA2, double d) {
        cv.e(kQsA2, 613283675, d);
    }

    static /* synthetic */ void DYFV(kQsA kQsA2, double d) {
        cv.e(kQsA2, -1853163708, d);
    }

    static /* synthetic */ bqeB ssNb(kQsA kQsA2) {
        return (bqeB)cv.b(kQsA2, 8845081);
    }

    static /* synthetic */ double DYFV(kQsA kQsA2) {
        return (Double)cv.b(kQsA2, 613283675);
    }

    static /* synthetic */ bqeB IWSm(kQsA kQsA2) {
        return (bqeB)cv.b(kQsA2, -1759512742);
    }

    static /* synthetic */ double OXeK(kQsA kQsA2) {
        return (Double)cv.b(kQsA2, -1853163708);
    }

    static /* synthetic */ void IWSm(kQsA kQsA2, double d) {
        cv.e(kQsA2, 550631256, d);
    }

    static /* synthetic */ void OXeK(kQsA kQsA2, double d) {
        cv.e(kQsA2, -16255163, d);
    }

    static /* synthetic */ void YoSa(kQsA kQsA2, double d) {
        cv.e(kQsA2, -124192953, d);
    }

    static /* synthetic */ double YoSa(kQsA kQsA2) {
        return (Double)cv.b(kQsA2, -16255163);
    }

    static /* synthetic */ void jhSt(kQsA kQsA2, double d) {
        cv.e(kQsA2, -2076838074, d);
    }

    static /* synthetic */ double jhSt(kQsA kQsA2) {
        return (Double)cv.b(kQsA2, -2076838074);
    }

    static /* synthetic */ void BkpW(kQsA kQsA2, double d) {
        cv.e(kQsA2, -1599867071, d);
    }

    static /* synthetic */ void ssNb(kQsA kQsA2, boolean bl) {
        cv.e(kQsA2, -1033242828, bl);
    }

    static /* synthetic */ ktOu BkpW(kQsA kQsA2) {
        return (ktOu)cv.b(kQsA2, -341444810);
    }

    static /* synthetic */ void ssNb(kQsA kQsA2, long l) {
        cv.e(kQsA2, 283047744, l);
    }

    static /* synthetic */ void DYFV(kQsA kQsA2, long l) {
        cv.e(kQsA2, -704383165, l);
    }

    static /* synthetic */ void IWSm(kQsA kQsA2, long l) {
        cv.e(kQsA2, -341969086, l);
    }

    static /* synthetic */ bqeB lCdp(kQsA kQsA2) {
        return (bqeB)cv.b(kQsA2, -1853098163);
    }

    static /* synthetic */ void OXeK(kQsA kQsA2, long l) {
        cv.e(kQsA2, -710084788, l);
    }

    private static Object nw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

