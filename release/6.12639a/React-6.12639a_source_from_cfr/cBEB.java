/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class cBEB {
    private double rqTb;
    private int dNYf;
    private boolean GQwE;
    private double jrMp;
    private OXoN FpwG;
    private long iUXR;
    private final int id;

    public cBEB(int n) {
        this.id = n;
        this.jrMp = 0.0;
        this.rqTb = 0.0;
        this.dNYf = 0;
        this.GQwE = false;
        this.FpwG = new OXoN(20);
        this.iUXR = (Long)o.k(-619556004);
    }

    public double biXx() {
        return (Double)o.a(this, -878363010);
    }

    public void qcvH(double d) {
        o.v(this, -878363010, d);
        cBEB.fL((OXoN)o.a(this, 1346322045), d);
    }

    public int JQqr() {
        return (Integer)o.a(this, -1652867460);
    }

    public void uVol(int n) {
        o.v(this, -1652867460, n);
    }

    public boolean VMER() {
        return (Boolean)o.a(this, -1719452037);
    }

    public void UQfI(boolean bl) {
        o.v(this, -1719452037, bl);
    }

    public double JRRx() {
        return (Double)o.a(this, -1991557622);
    }

    public void UQfI(double d) {
        o.v(this, -1991557622, d);
    }

    public double gggG() {
        return (double)cBEB.fL((OXoN)o.a(this, 1346322045));
    }

    public long getTick() {
        return (Long)o.a(this, 444481033);
    }

    public void setTick(long l) {
        o.v(this, 444481033, l);
    }

    public long eirM() {
        return (Long)o.k(-619556004) - this.getTick();
    }

    public int getId() {
        return (Integer)o.a(this, 855457288);
    }

    private static Object fL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

