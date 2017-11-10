/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class oDkQ {
    private double min;
    private double max;

    public oDkQ(double d, double d2) {
        this.min = d;
        this.max = d2;
    }

    public oDkQ(int n, int n2) {
        this((double)n, (double)n2);
    }

    public oDkQ(long l, long l2) {
        this((double)l, (double)l2);
    }

    public double HnTK() {
        return (Double)yy.h(this, -672136600) + oDkQ.vg() * ((Double)yy.h(this, -1777859978) - (Double)yy.h(this, -672136600) + 1.0);
    }

    public int cKAG() {
        return (int)this.HnTK();
    }

    public long YESR() {
        return (long)this.HnTK();
    }

    public boolean WNxt(double d) {
        if (d >= (Double)yy.h(this, -672136600) && d <= (Double)yy.h(this, -1777859978)) {
            return true;
        }
        return false;
    }

    public boolean vsgc(int n) {
        return this.WNxt(n);
    }

    public boolean SBla(long l) {
        return this.WNxt(l);
    }

    public double getMin() {
        return (Double)yy.h(this, -672136600);
    }

    public void jhSC(double d) {
        yy.E(this, -672136600, d);
    }

    public double getMax() {
        return (Double)yy.h(this, -1777859978);
    }

    public void tTQG(double d) {
        yy.E(this, -1777859978, d);
    }

    private static Object vg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

