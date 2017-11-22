/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class IXEl {
    private double min;
    private double max;

    public IXEl(double d, double d2) {
        this.min = d;
        this.max = d2;
    }

    public IXEl(int n, int n2) {
        this((double)n, (double)n2);
    }

    public IXEl(long l, long l2) {
        this((double)l, (double)l2);
    }

    public double YokS() {
        return (Double)cv.b(this, -682100544) + IXEl.nx() * ((Double)cv.b(this, 1983772867) - (Double)cv.b(this, -682100544) + 1.0);
    }

    public int MJeY() {
        return (int)this.YokS();
    }

    public long vIhv() {
        return (long)this.YokS();
    }

    public boolean avmQ(double d) {
        if (d >= (Double)cv.b(this, -682100544) && d <= (Double)cv.b(this, 1983772867)) {
            return true;
        }
        return false;
    }

    public boolean gEYM(int n) {
        return this.avmQ(n);
    }

    public boolean cIji(long l) {
        return this.avmQ(l);
    }

    public double getMin() {
        return (Double)cv.b(this, -682100544);
    }

    public void CMSR(double d) {
        cv.e(this, -682100544, d);
    }

    public double getMax() {
        return (Double)cv.b(this, 1983772867);
    }

    public void CoXE(double d) {
        cv.e(this, 1983772867, d);
    }

    private static Object nx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

