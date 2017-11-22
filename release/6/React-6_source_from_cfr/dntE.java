/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class dntE {
    protected final tvRU[] ktXk;
    protected double xScale = 1.0;
    protected double yScale = 1.0;
    protected double zScale = 1.0;

    protected dntE(tvRU[] arrtvRU) {
        this.ktXk = arrtvRU;
    }

    public void setScale(double d) {
        this.setXScale(d);
        this.setYScale(d);
        this.setZScale(d);
    }

    public double getXScale() {
        return (Double)cv.b(this, -965800068);
    }

    public void setXScale(double d) {
        cv.e(this, -965800068, d);
    }

    public double getYScale() {
        return (Double)cv.b(this, -544206977);
    }

    public void setYScale(double d) {
        cv.e(this, -544206977, d);
    }

    public double getZScale() {
        return (Double)cv.b(this, 554438526);
    }

    public void setZScale(double d) {
        cv.e(this, 554438526, d);
    }

    public tvRU[] TNcV() {
        return (tvRU[])((tvRU[])cv.b(this, -824766599)).clone();
    }

    public double noise(double d, double d2, double d3) {
        return this.noise(d, 0.0, 0.0, d2, d3);
    }

    public double noise(double d, double d2, double d3, boolean bl) {
        return this.noise(d, 0.0, 0.0, d2, d3, bl);
    }

    public double noise(double d, double d2, double d3, double d4) {
        return this.noise(d, d2, 0.0, d3, d4);
    }

    public double noise(double d, double d2, double d3, double d4, boolean bl) {
        return this.noise(d, d2, 0.0, d3, d4, bl);
    }

    public double noise(double d, double d2, double d3, double d4, double d5) {
        return this.noise(d, d2, d3, d4, d5, false);
    }

    public double noise(double d, double d2, double d3, double d4, double d5, boolean bl) {
        double d6 = 0.0;
        double d7 = 1.0;
        double d8 = 1.0;
        double d9 = 0.0;
        d *= ((Double)cv.b(this, -965800068)).doubleValue();
        d2 *= ((Double)cv.b(this, -544206977)).doubleValue();
        d3 *= ((Double)cv.b(this, 554438526)).doubleValue();
        for (tvRU tvRU2 : (tvRU[])cv.b(this, -824766599)) {
            d6 += dntE.BU(tvRU2, d * d8, d2 * d8, d3 * d8) * d7;
            d9 += d7;
            d8 *= d4;
            d7 *= d5;
        }
        if (bl) {
            d6 /= d9;
        }
        return d6;
    }

    private static Object BU(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

