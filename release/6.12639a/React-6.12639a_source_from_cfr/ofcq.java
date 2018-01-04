/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Random;

public class ofcq
extends HCPo {
    private double bHKx = 1.0;

    public ofcq(long l, int n) {
        this(new Random(l), n);
    }

    public ofcq(Random random, int n) {
        super(ofcq.yJLS(random, n));
    }

    @Override
    public void setScale(double d) {
        super.setScale(d);
        this.setWScale(d);
    }

    public double getWScale() {
        return (Double)o.a(this, 95179399);
    }

    public void setWScale(double d) {
        o.v(this, 95179399, d);
    }

    public double noise(double d, double d2, double d3, double d4, double d5, double d6) {
        return this.noise(d, d2, d3, d4, d5, d6, false);
    }

    public double noise(double d, double d2, double d3, double d4, double d5, double d6, boolean bl) {
        double d7 = 0.0;
        double d8 = 1.0;
        double d9 = 1.0;
        double d10 = 0.0;
        d *= ((Double)o.a(this, -614968698)).doubleValue();
        d2 *= ((Double)o.a(this, 312234629)).doubleValue();
        d3 *= ((Double)o.a(this, 92557956)).doubleValue();
        d4 *= ((Double)o.a(this, 95179399)).doubleValue();
        qlgl[] arrqlgl = (qlgl[])o.a(this, 1860915843);
        int n = arrqlgl.length;
        int n2 = 0;
        while (n2 < n) {
            qlgl qlgl2 = arrqlgl[n2];
            d7 += ofcq.Tg((CEEt)qlgl2, d * d9, d2 * d9, d3 * d9, d4 * d9) * d8;
            d10 += d8;
            d9 *= d5;
            d8 *= d6;
            ++n2;
        }
        if (bl) {
            d7 /= d10;
        }
        return d7;
    }

    private static qlgl[] yJLS(Random random, int n) {
        qlgl[] arrqlgl = new qlgl[n];
        int n2 = 0;
        while (n2 < n) {
            arrqlgl[n2] = new CEEt(random);
            ++n2;
        }
        return arrqlgl;
    }

    private static Object Tg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

