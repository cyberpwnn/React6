/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Random;

public class YnwU
extends dntE {
    private double ifEk = 1.0;

    public YnwU(long l, int n) {
        this(new Random(l), n);
    }

    public YnwU(Random random, int n) {
        super(YnwU.ssNb(random, n));
    }

    @Override
    public void setScale(double d) {
        super.setScale(d);
        this.setWScale(d);
    }

    public double getWScale() {
        return (Double)cv.b(this, 465834124);
    }

    public void setWScale(double d) {
        cv.e(this, 465834124, d);
    }

    public double noise(double d, double d2, double d3, double d4, double d5, double d6) {
        return this.noise(d, d2, d3, d4, d5, d6, false);
    }

    public double noise(double d, double d2, double d3, double d4, double d5, double d6, boolean bl) {
        double d7 = 0.0;
        double d8 = 1.0;
        double d9 = 1.0;
        double d10 = 0.0;
        d *= ((Double)cv.b(this, 978653327)).doubleValue();
        d2 *= ((Double)cv.b(this, 443551886)).doubleValue();
        d3 *= ((Double)cv.b(this, -2026237815)).doubleValue();
        d4 *= ((Double)cv.b(this, 465834124)).doubleValue();
        for (tvRU tvRU2 : (tvRU[])cv.b(this, 812847240)) {
            d7 += YnwU.FK((iSqp)tvRU2, d * d9, d2 * d9, d3 * d9, d4 * d9) * d8;
            d10 += d8;
            d9 *= d5;
            d8 *= d6;
        }
        if (bl) {
            d7 /= d10;
        }
        return d7;
    }

    private static tvRU[] ssNb(Random random, int n) {
        tvRU[] arrtvRU = new tvRU[n];
        for (int i = 0; i < n; ++i) {
            arrtvRU[i] = new iSqp(random);
        }
        return arrtvRU;
    }

    private static Object FK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

