/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class Pubc {
    private double AGfG;
    private int kuDH;
    private boolean brXy;
    private double GQhA;
    private bqeB iThr;
    private long fLAr;
    private final int id;

    public Pubc(int n) {
        this.id = n;
        this.GQhA = 0.0;
        this.AGfG = 0.0;
        this.kuDH = 0;
        this.brXy = false;
        this.iThr = new bqeB(20);
        this.fLAr = (Long)cv.e(871764466);
    }

    public double tLDs() {
        return (Double)cv.b(this, -199165597);
    }

    public void EmLA(double d) {
        cv.e(this, -199165597, d);
        Pubc.lQ((bqeB)cv.b(this, -1920861854), d);
    }

    public int vslr() {
        return (Integer)cv.b(this, 1404828013);
    }

    public void hHYn(int n) {
        cv.e(this, 1404828013, n);
    }

    public boolean HTYB() {
        return (Boolean)cv.b(this, 867105132);
    }

    public void nJLQ(boolean bl) {
        cv.e(this, 867105132, bl);
    }

    public double lCky() {
        return (Double)cv.b(this, 881064303);
    }

    public void WGJn(double d) {
        cv.e(this, 881064303, d);
    }

    public double FouE() {
        return (double)Pubc.lQ((bqeB)cv.b(this, -1920861854));
    }

    public long getTick() {
        return (Long)cv.b(this, 809040238);
    }

    public void setTick(long l) {
        cv.e(this, 809040238, l);
    }

    public long EucK() {
        return (Long)cv.e(871764466) - this.getTick();
    }

    public int getId() {
        return (Integer)cv.b(this, 121829737);
    }

    private static Object lQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

