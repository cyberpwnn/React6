/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class HCPo {
    protected final qlgl[] xGca;
    protected double xScale = 1.0;
    protected double yScale = 1.0;
    protected double zScale = 1.0;

    protected HCPo(qlgl[] arrqlgl) {
        this.xGca = arrqlgl;
    }

    public void setScale(double d) {
        this.setXScale(d);
        this.setYScale(d);
        this.setZScale(d);
    }

    public double getXScale() {
        return (Double)o.a(this, 282412441);
    }

    public void setXScale(double d) {
        o.v(this, 282412441, d);
    }

    public double getYScale() {
        return (Double)o.a(this, -1241365096);
    }

    public void setYScale(double d) {
        o.v(this, -1241365096, d);
    }

    public double getZScale() {
        return (Double)o.a(this, 22627735);
    }

    public void setZScale(double d) {
        o.v(this, 22627735, d);
    }

    public qlgl[] OihG() {
        return (qlgl[])((qlgl[])o.a(this, 380913046)).clone();
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
        d *= ((Double)o.a(this, 282412441)).doubleValue();
        d2 *= ((Double)o.a(this, -1241365096)).doubleValue();
        d3 *= ((Double)o.a(this, 22627735)).doubleValue();
        qlgl[] arrqlgl = (qlgl[])o.a(this, 380913046);
        int n = arrqlgl.length;
        int n2 = 0;
        while (n2 < n) {
            qlgl qlgl2 = arrqlgl[n2];
            d6 += HCPo.Zn(qlgl2, d * d8, d2 * d8, d3 * d8) * d7;
            d9 += d7;
            d8 *= d4;
            d7 *= d5;
            ++n2;
        }
        if (bl) {
            d6 /= d9;
        }
        return d6;
    }

    private static Object Zn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

