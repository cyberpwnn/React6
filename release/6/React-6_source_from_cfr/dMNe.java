/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class dMNe {
    private double[] MtdI;
    private double jEqq;
    private boolean lUIx;

    public dMNe(int n) {
        this.MtdI = new double[n];
        dMNe.lN((double[])yy.h(this, 103415448), 0.0);
        this.jEqq = 0.0;
        this.lUIx = false;
    }

    public void ssMm(double d) {
        dMNe.lN((double[])yy.h(this, 103415448), d);
        yy.E(this, -299499669, true);
    }

    public double getAverage() {
        if (((Boolean)yy.h(this, -299499669)).booleanValue()) {
            this.vsgc();
            return this.getAverage();
        }
        return (Double)yy.h(this, 1818885996);
    }

    private void vsgc() {
        double d = 0.0;
        for (double d2 : (double[])yy.h(this, 103415448)) {
            d += d2;
        }
        yy.E(this, 1818885996, d / (double)((double[])yy.h(this, 103415448)).length);
        yy.E(this, -299499669, false);
    }

    private static Object lN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

