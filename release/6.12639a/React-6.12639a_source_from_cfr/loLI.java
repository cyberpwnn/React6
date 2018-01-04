/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class loLI
implements qSgW {
    private OXoN ayKc = new OXoN(6);
    private OXoN pcSj = new OXoN(6);
    private OXoN vKSG = new OXoN(20);
    private double rqTb = 0.0;
    private double OtXM = 0.0;
    private double Ostt = 0.0;
    private double EfWy = 0.0;
    private boolean running = false;
    private boolean TYRN = false;
    private double NOOq = 0.0;
    private double FOiJ = 0.0;
    private double qoGa;
    private long AILW = 0;
    private long UTDo = 0;
    private long keFK = 0;
    private long gWxU = 0;
    private int hSJa = 0;
    private int VFFr = 0;
    private int BvbY = 0;
    private int yLKF = 0;
    private int lVfA = 0;
    private int wowN = 0;
    private int FOhw = 0;
    private xPJu CyeH;
    private Iyhh NXBW;
    private xFyR UBcR;
    private StackTraceElement[] gOfj = null;
    private TNku<Long, feCR<StackTraceElement>> NgnK = new TNku();

    public loLI() {
        this.CyeH = new loLI$1(this);
        this.NXBW = new loLI$2(this);
        this.UBcR = new loLI$3(this);
    }

    public void start() {
        loLI.gY((Iyhh)o.a(this, -1033810543));
        loLI.gY((xFyR)o.a(this, 881806735));
        loLI.gY((xPJu)o.a(this, -510046835));
        o.v(this, 947998091, true);
        loLI.gY(this);
    }

    public void stop() {
        loLI.gY((Iyhh)o.a(this, -1033810543));
        loLI.gY((xFyR)o.a(this, 881806735));
        loLI.gY((xPJu)o.a(this, -510046835));
        o.v(this, 947998091, false);
        loLI.gY(this);
    }

    @Override
    public void owir() {
        if (((Boolean)o.a(this, 947998091)).booleanValue()) {
            loLI.gY((Iyhh)o.a(this, -1033810543));
        }
    }

    @Override
    public String YMWq() {
        return loLI.gY(loLI.gY(new StringBuilder(FMkR$WjFM.a("\u2827\u3a85\u83cc\uf05f\u0b4f\u5578\u8425\u1e7d\ub3a3\u1589\ua2cb\u1d5d\u7c53")), loLI.gY(loLI.gY())));
    }

    public OXoN MBTF() {
        return (OXoN)o.a(this, -371176042);
    }

    public double biXx() {
        return (Double)o.a(this, -1563800171);
    }

    public double KgAj() {
        return (Double)o.a(this, -1191424620);
    }

    public boolean isRunning() {
        return (Boolean)o.a(this, 947998091);
    }

    public Iyhh UknG() {
        return (Iyhh)o.a(this, -1033810543);
    }

    public OXoN jXIQ() {
        return (OXoN)o.a(this, 230182291);
    }

    public double OsNL() {
        return (Double)o.a(this, 1625574914);
    }

    public double yJbA() {
        return (Double)o.a(this, -1867559423);
    }

    public double htEq() {
        return (Double)o.a(this, -482324992);
    }

    public double wnns() {
        return (Double)o.a(this, -1817817601);
    }

    public double TXIq() {
        return (Double)o.a(this, 1871007230);
    }

    public xFyR CNIo() {
        return (xFyR)o.a(this, 881806735);
    }

    public long TymD() {
        return (Long)o.a(this, 786451965);
    }

    public long sQaC() {
        return (Long)o.a(this, -781496836);
    }

    public long PCLi() {
        return (Long)o.a(this, -1468379653);
    }

    public OXoN JlOg() {
        return (OXoN)o.a(this, 1650019722);
    }

    public long LqtU() {
        return (Long)o.a(this, -250786423);
    }

    public int hcCr() {
        return (Integer)o.a(this, 1563446664);
    }

    public int xjAr() {
        return (Integer)o.a(this, -1380889209);
    }

    public int woPC() {
        return (Integer)o.a(this, -745517690);
    }

    public int Edom() {
        return (Integer)o.a(this, -1613542011);
    }

    public int PTOC() {
        return (Integer)o.a(this, -1453109884);
    }

    public xPJu KoRk() {
        return (xPJu)o.a(this, -510046835);
    }

    public int iCbw() {
        return (Integer)o.a(this, 1974685059);
    }

    public int iUIP() {
        return (Integer)o.a(this, -718058382);
    }

    public void yJLS(OXoN oXoN) {
        o.v(this, -371176042, oXoN);
    }

    public void UtIU(OXoN oXoN) {
        o.v(this, 230182291, oXoN);
    }

    public void biLo(OXoN oXoN) {
        o.v(this, 1650019722, oXoN);
    }

    public void qcvH(double d) {
        o.v(this, -1563800171, d);
    }

    public void bhlC(double d) {
        o.v(this, -1191424620, d);
    }

    public void DaUw(double d) {
        o.v(this, 1625574914, d);
    }

    public void Dqxl(double d) {
        o.v(this, -1867559423, d);
    }

    public void xykf(boolean bl) {
        o.v(this, 947998091, bl);
    }

    public void MSAa(double d) {
        o.v(this, -482324992, d);
    }

    public void JIWX(double d) {
        o.v(this, -1817817601, d);
    }

    public void jxvf(double d) {
        o.v(this, 1871007230, d);
    }

    public void IpeM(long l) {
        o.v(this, 786451965, l);
    }

    public void WOYg(long l) {
        o.v(this, -781496836, l);
    }

    public void IEpg(long l) {
        o.v(this, -1468379653, l);
    }

    public void PKGC(long l) {
        o.v(this, -250786423, l);
    }

    public void GjaJ(int n) {
        o.v(this, 1563446664, n);
    }

    public void IFSe(int n) {
        o.v(this, -1380889209, n);
    }

    public void IhWD(int n) {
        o.v(this, -745517690, n);
    }

    public void IVtS(int n) {
        o.v(this, -1613542011, n);
    }

    public void FMkR(int n) {
        o.v(this, -1453109884, n);
    }

    public void Kvlx(int n) {
        o.v(this, 1974685059, n);
    }

    public void qlgl(int n) {
        o.v(this, -718058382, n);
    }

    public void yJLS(xPJu xPJu2) {
        o.v(this, -510046835, xPJu2);
    }

    public void yJLS(Iyhh iyhh) {
        o.v(this, -1033810543, iyhh);
    }

    public void yJLS(xFyR xFyR2) {
        o.v(this, 881806735, xFyR2);
    }

    public boolean isFrozen() {
        return (Boolean)o.a(this, 2128039025);
    }

    public StackTraceElement[] Fgtv() {
        return (StackTraceElement[])o.a(this, 681921648);
    }

    public TNku<Long, feCR<StackTraceElement>> XAfJ() {
        return (TNku)o.a(this, -1667085201);
    }

    static /* synthetic */ void yJLS(loLI loLI2, int n) {
        o.v(loLI2, 1563446664, n);
    }

    static /* synthetic */ void UtIU(loLI loLI2, int n) {
        o.v(loLI2, -745517690, n);
    }

    static /* synthetic */ void biLo(loLI loLI2, int n) {
        o.v(loLI2, -1613542011, n);
    }

    static /* synthetic */ void VwLY(loLI loLI2, int n) {
        o.v(loLI2, -1380889209, n);
    }

    static /* synthetic */ void TEqA(loLI loLI2, int n) {
        o.v(loLI2, -1453109884, n);
    }

    static /* synthetic */ void KTiK(loLI loLI2, int n) {
        o.v(loLI2, 1974685059, n);
    }

    static /* synthetic */ void GPlk(loLI loLI2, int n) {
        o.v(loLI2, -718058382, n);
    }

    static /* synthetic */ void yJLS(loLI loLI2, double d) {
        o.v(loLI2, -1191424620, d);
    }

    static /* synthetic */ void UtIU(loLI loLI2, double d) {
        o.v(loLI2, -1867559423, d);
    }

    static /* synthetic */ OXoN yJLS(loLI loLI2) {
        return (OXoN)o.a(loLI2, -371176042);
    }

    static /* synthetic */ double UtIU(loLI loLI2) {
        return (Double)o.a(loLI2, -1191424620);
    }

    static /* synthetic */ OXoN biLo(loLI loLI2) {
        return (OXoN)o.a(loLI2, 230182291);
    }

    static /* synthetic */ double VwLY(loLI loLI2) {
        return (Double)o.a(loLI2, -1867559423);
    }

    static /* synthetic */ void biLo(loLI loLI2, double d) {
        o.v(loLI2, -1563800171, d);
    }

    static /* synthetic */ void VwLY(loLI loLI2, double d) {
        o.v(loLI2, 1625574914, d);
    }

    static /* synthetic */ void TEqA(loLI loLI2, double d) {
        o.v(loLI2, -482324992, d);
    }

    static /* synthetic */ double TEqA(loLI loLI2) {
        return (Double)o.a(loLI2, 1625574914);
    }

    static /* synthetic */ void KTiK(loLI loLI2, double d) {
        o.v(loLI2, -1817817601, d);
    }

    static /* synthetic */ double KTiK(loLI loLI2) {
        return (Double)o.a(loLI2, -1817817601);
    }

    static /* synthetic */ void GPlk(loLI loLI2, double d) {
        o.v(loLI2, 1871007230, d);
    }

    static /* synthetic */ void yJLS(loLI loLI2, boolean bl) {
        o.v(loLI2, 2128039025, bl);
    }

    static /* synthetic */ TNku GPlk(loLI loLI2) {
        return (TNku)o.a(loLI2, -1667085201);
    }

    static /* synthetic */ void yJLS(loLI loLI2, long l) {
        o.v(loLI2, 786451965, l);
    }

    static /* synthetic */ void UtIU(loLI loLI2, long l) {
        o.v(loLI2, -781496836, l);
    }

    static /* synthetic */ void biLo(loLI loLI2, long l) {
        o.v(loLI2, -1468379653, l);
    }

    static /* synthetic */ OXoN ktHX(loLI loLI2) {
        return (OXoN)o.a(loLI2, 1650019722);
    }

    static /* synthetic */ void VwLY(loLI loLI2, long l) {
        o.v(loLI2, -250786423, l);
    }

    private static Object gY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

