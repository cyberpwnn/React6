/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class uWeE {
    private double min;
    private double max;

    public uWeE(double d, double d2) {
        this.min = d;
        this.max = d2;
    }

    public uWeE(int n, int n2) {
        this((double)n, (double)n2);
    }

    public uWeE(long l, long l2) {
        this((double)l, (double)l2);
    }

    public double RslK() {
        return (Double)o.a(this, -504151768) + uWeE.mz() * ((Double)o.a(this, -61193945) - (Double)o.a(this, -504151768) + 1.0);
    }

    public int qvVM() {
        return (int)this.RslK();
    }

    public long RtLr() {
        return (long)this.RslK();
    }

    public boolean XRaB(double d) {
        if (d >= (Double)o.a(this, -504151768) && d <= (Double)o.a(this, -61193945)) {
            return true;
        }
        return false;
    }

    public boolean baAO(int n) {
        return this.XRaB(n);
    }

    public boolean bhlC(long l) {
        return this.XRaB(l);
    }

    public double getMin() {
        return (Double)o.a(this, -504151768);
    }

    public void hanW(double d) {
        o.v(this, -504151768, d);
    }

    public double getMax() {
        return (Double)o.a(this, -61193945);
    }

    public void dfaE(double d) {
        o.v(this, -61193945, d);
    }

    private static Object mz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

