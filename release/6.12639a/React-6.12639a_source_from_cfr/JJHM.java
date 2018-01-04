/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class JJHM
implements XcqT,
wMIF {
    private int id;
    private String name;
    private boolean plCA;
    private double tVJn;
    private double ghvX;
    private double TiqN;
    private boolean completed;
    private MRfD bjiX;
    private MRfD XKjJ;
    protected int GRjY;

    public JJHM(String string) {
        this.VwLY(string, false);
        JJHM.xd((MRfD)o.a(this, -1088729621));
        this.id = JJHM.xd(JJHM.xd(), false, new JJHM$1(this));
    }

    public JJHM(String string, int n) {
        this.VwLY(string, true);
        JJHM.xd((MRfD)o.a(this, -1088729621));
        this.id = JJHM.xd(JJHM.xd(), false, n, new JJHM$2(this));
    }

    public JJHM(String string, int n, int n2) {
        this.VwLY(string, true);
        JJHM.xd((MRfD)o.a(this, -1088729621));
        this.id = JJHM.xd(JJHM.xd(), false, n, new JJHM$3(this, n2));
    }

    private void VwLY(String string, boolean bl) {
        o.v(this, -1088729621, new MRfD());
        o.v(this, -104313352, new MRfD());
        o.v(this, 372723191, bl);
        o.v(this, 590892534, string);
        o.v(this, 928861685, false);
        o.v(this, 374361588, 0.0);
        o.v(this, 1794002419, 0.0);
        o.v(this, 899173858, 0.0);
        o.v(this, -751940112, 0);
    }

    @Override
    public void cancel() {
        JJHM.xd(JJHM.xd(), (Integer)o.a(this, 90000865));
        o.v(this, 928861685, true);
        JJHM.xd((MRfD)o.a(this, -1088729621));
        JJHM jJHM = this;
        o.v(jJHM, 1794002419, (Double)o.a(jJHM, 1794002419) + JJHM.xd((MRfD)o.a(this, -1088729621)));
        JJHM.xd((MRfD)o.a(this, -1088729621));
        JJHM.xd((MRfD)o.a(this, -104313352));
    }

    @Override
    public int getId() {
        return (Integer)o.a(this, 90000865);
    }

    @Override
    public boolean XKDx() {
        return (Boolean)o.a(this, 372723191);
    }

    @Override
    public String getName() {
        return (String)o.a(this, 590892534);
    }

    @Override
    public double FNbH() {
        return (Double)o.a(this, 374361588);
    }

    @Override
    public boolean VfbL() {
        return (Boolean)o.a(this, 928861685);
    }

    @Override
    public double lnpk() {
        return (Double)o.a(this, 899173858);
    }

    @Override
    public double iLTq() {
        return (Double)o.a(this, 1794002419);
    }

    static /* synthetic */ MRfD yJLS(JJHM jJHM) {
        return (MRfD)o.a(jJHM, -104313352);
    }

    static /* synthetic */ void yJLS(JJHM jJHM, boolean bl) {
        o.v(jJHM, 928861685, bl);
    }

    static /* synthetic */ MRfD UtIU(JJHM jJHM) {
        return (MRfD)o.a(jJHM, -1088729621);
    }

    static /* synthetic */ void yJLS(JJHM jJHM, double d) {
        o.v(jJHM, 1794002419, d);
    }

    static /* synthetic */ void UtIU(JJHM jJHM, double d) {
        o.v(jJHM, 374361588, d);
    }

    static /* synthetic */ double biLo(JJHM jJHM) {
        return (Double)o.a(jJHM, 1794002419);
    }

    static /* synthetic */ void biLo(JJHM jJHM, double d) {
        o.v(jJHM, 899173858, d);
    }

    static /* synthetic */ double VwLY(JJHM jJHM) {
        return (Double)o.a(jJHM, 899173858);
    }

    static /* synthetic */ double TEqA(JJHM jJHM) {
        return (Double)o.a(jJHM, 374361588);
    }

    private static Object xd(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

