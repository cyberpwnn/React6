/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class NUlR
implements wncc {
    private dMNe mOut = new dMNe(6);
    private dMNe sjyd = new dMNe(6);
    private dMNe EvYa = new dMNe(20);
    private double ePQp = 0.0;
    private double UtfX = 0.0;
    private double VLuQ = 0.0;
    private double Jkul = 0.0;
    private boolean running = false;
    private double UAbR = 0.0;
    private double bGgX = 0.0;
    private double gphl;
    private long hIXG = 0;
    private long VVFP = 0;
    private long eaqA = 0;
    private long EKeR = 0;
    private int XAwx = 0;
    private int CVaH = 0;
    private int sbiY = 0;
    private int FWXQ = 0;
    private int QNfQ = 0;
    private int hjxw = 0;
    private int Qgwt = 0;
    private rotp nljq;
    private INmP iCiV;
    private lfSt xYGU;

    public NUlR() {
        this.nljq = new NUlR$1(this);
        this.iCiV = new NUlR$2(this);
        this.xYGU = new NUlR$3(this);
    }

    public void start() {
        NUlR.hX((INmP)yy.h(this, 1674380756));
        NUlR.hX((lfSt)yy.h(this, 232719826));
        NUlR.hX((rotp)yy.h(this, -1593637432));
        yy.E(this, -916322858, true);
        NUlR.hX(this);
    }

    public void stop() {
        NUlR.hX((INmP)yy.h(this, 1674380756));
        NUlR.hX((lfSt)yy.h(this, 232719826));
        NUlR.hX((rotp)yy.h(this, -1593637432));
        yy.E(this, -916322858, false);
        NUlR.hX(this);
    }

    @Override
    public void AWsr() {
        if (((Boolean)yy.h(this, -916322858)).booleanValue()) {
            NUlR.hX((INmP)yy.h(this, 1674380756));
        }
    }

    @Override
    public String LrGi() {
        return NUlR.hX(NUlR.hX(new StringBuilder(BkvY$LhxG.I("\u093f\u6b62\ue6dd\u2fb2\u208a\ue5e6\u87e5\u3873\u82dc\ube58\u9add\ue61f\u5ea3")), NUlR.hX(NUlR.hX())));
    }

    public dMNe KTsB() {
        return (dMNe)yy.h(this, -2120350256);
    }

    public double hGxw() {
        return (Double)yy.h(this, -558561883);
    }

    public double OGmN() {
        return (Double)yy.h(this, 1640957342);
    }

    public boolean isRunning() {
        return (Boolean)yy.h(this, -916322858);
    }

    public INmP Mcik() {
        return (INmP)yy.h(this, 1674380756);
    }

    public dMNe nlYH() {
        return (dMNe)yy.h(this, 699729315);
    }

    public double nBIE() {
        return (Double)yy.h(this, 1773077924);
    }

    public double fuej() {
        return (Double)yy.h(this, 815597017);
    }

    public double WhyT() {
        return (Double)yy.h(this, 1002112418);
    }

    public double IqSO() {
        return (Double)yy.h(this, 963511767);
    }

    public double vbqV() {
        return (Double)yy.h(this, -717093416);
    }

    public lfSt YpAW() {
        return (lfSt)yy.h(this, 232719826);
    }

    public long bFtu() {
        return (Long)yy.h(this, 1604781485);
    }

    public long oDkQ() {
        return (Long)yy.h(this, -720042586);
    }

    public long cBHm() {
        return (Long)yy.h(this, -333380181);
    }

    public dMNe vcRa() {
        return (dMNe)yy.h(this, -463534676);
    }

    public long Gryi() {
        return (Long)yy.h(this, 1288570273);
    }

    public int xyyN() {
        return (Integer)yy.h(this, 999622058);
    }

    public int rNTr() {
        return (Integer)yy.h(this, 1708918175);
    }

    public int IydG() {
        return (Integer)yy.h(this, -1121319520);
    }

    public int tnMY() {
        return (Integer)yy.h(this, 727451125);
    }

    public int myxn() {
        return (Integer)yy.h(this, -2103507474);
    }

    public rotp hjil() {
        return (rotp)yy.h(this, -1593637432);
    }

    public int BclT() {
        return (Integer)yy.h(this, -1357511181);
    }

    public int VvxM() {
        return (Integer)yy.h(this, -1973877260);
    }

    public void mXJp(dMNe dMNe2) {
        yy.E(this, -2120350256, dMNe2);
    }

    public void ksfs(dMNe dMNe2) {
        yy.E(this, 699729315, dMNe2);
    }

    public void yJLL(dMNe dMNe2) {
        yy.E(this, -463534676, dMNe2);
    }

    public void ksfs(double d) {
        yy.E(this, -558561883, d);
    }

    public void hGxw(double d) {
        yy.E(this, 1640957342, d);
    }

    public void eYCP(double d) {
        yy.E(this, 1773077924, d);
    }

    public void dMNe(double d) {
        yy.E(this, 815597017, d);
    }

    public void gUxV(boolean bl) {
        yy.E(this, -916322858, bl);
    }

    public void jVod(double d) {
        yy.E(this, 1002112418, d);
    }

    public void wnXH(double d) {
        yy.E(this, 963511767, d);
    }

    public void qKCn(double d) {
        yy.E(this, -717093416, d);
    }

    public void qArm(long l) {
        yy.E(this, 1604781485, l);
    }

    public void Fomb(long l) {
        yy.E(this, -720042586, l);
    }

    public void Ralc(long l) {
        yy.E(this, -333380181, l);
    }

    public void SnAm(long l) {
        yy.E(this, 1288570273, l);
    }

    public void jEqq(int n) {
        yy.E(this, 999622058, n);
    }

    public void lUIx(int n) {
        yy.E(this, 1708918175, n);
    }

    public void WXMo(int n) {
        yy.E(this, -1121319520, n);
    }

    public void NLsD(int n) {
        yy.E(this, 727451125, n);
    }

    public void CLqw(int n) {
        yy.E(this, -2103507474, n);
    }

    public void vsgm(int n) {
        yy.E(this, -1357511181, n);
    }

    public void inDC(int n) {
        yy.E(this, -1973877260, n);
    }

    public void mXJp(rotp rotp2) {
        yy.E(this, -1593637432, rotp2);
    }

    public void mXJp(INmP iNmP) {
        yy.E(this, 1674380756, iNmP);
    }

    public void mXJp(lfSt lfSt2) {
        yy.E(this, 232719826, lfSt2);
    }

    static /* synthetic */ void mXJp(NUlR nUlR, int n) {
        yy.E(nUlR, 999622058, n);
    }

    static /* synthetic */ void ksfs(NUlR nUlR, int n) {
        yy.E(nUlR, -1121319520, n);
    }

    static /* synthetic */ void yJLL(NUlR nUlR, int n) {
        yy.E(nUlR, 727451125, n);
    }

    static /* synthetic */ void SnBs(NUlR nUlR, int n) {
        yy.E(nUlR, 1708918175, n);
    }

    static /* synthetic */ void qdWJ(NUlR nUlR, int n) {
        yy.E(nUlR, -2103507474, n);
    }

    static /* synthetic */ void JRFt(NUlR nUlR, int n) {
        yy.E(nUlR, -1357511181, n);
    }

    static /* synthetic */ void halY(NUlR nUlR, int n) {
        yy.E(nUlR, -1973877260, n);
    }

    static /* synthetic */ void mXJp(NUlR nUlR, double d) {
        yy.E(nUlR, 1640957342, d);
    }

    static /* synthetic */ void ksfs(NUlR nUlR, double d) {
        yy.E(nUlR, 815597017, d);
    }

    static /* synthetic */ dMNe mXJp(NUlR nUlR) {
        return (dMNe)yy.h(nUlR, -2120350256);
    }

    static /* synthetic */ double ksfs(NUlR nUlR) {
        return (Double)yy.h(nUlR, 1640957342);
    }

    static /* synthetic */ dMNe yJLL(NUlR nUlR) {
        return (dMNe)yy.h(nUlR, 699729315);
    }

    static /* synthetic */ double SnBs(NUlR nUlR) {
        return (Double)yy.h(nUlR, 815597017);
    }

    static /* synthetic */ void yJLL(NUlR nUlR, double d) {
        yy.E(nUlR, -558561883, d);
    }

    static /* synthetic */ void SnBs(NUlR nUlR, double d) {
        yy.E(nUlR, 1773077924, d);
    }

    static /* synthetic */ void qdWJ(NUlR nUlR, double d) {
        yy.E(nUlR, 1002112418, d);
    }

    static /* synthetic */ double qdWJ(NUlR nUlR) {
        return (Double)yy.h(nUlR, 1773077924);
    }

    static /* synthetic */ void JRFt(NUlR nUlR, double d) {
        yy.E(nUlR, 963511767, d);
    }

    static /* synthetic */ double JRFt(NUlR nUlR) {
        return (Double)yy.h(nUlR, 963511767);
    }

    static /* synthetic */ void halY(NUlR nUlR, double d) {
        yy.E(nUlR, -717093416, d);
    }

    static /* synthetic */ void mXJp(NUlR nUlR, long l) {
        yy.E(nUlR, 1604781485, l);
    }

    static /* synthetic */ void ksfs(NUlR nUlR, long l) {
        yy.E(nUlR, -720042586, l);
    }

    static /* synthetic */ void yJLL(NUlR nUlR, long l) {
        yy.E(nUlR, -333380181, l);
    }

    static /* synthetic */ dMNe halY(NUlR nUlR) {
        return (dMNe)yy.h(nUlR, -463534676);
    }

    static /* synthetic */ void SnBs(NUlR nUlR, long l) {
        yy.E(nUlR, 1288570273, l);
    }

    private static Object hX(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

