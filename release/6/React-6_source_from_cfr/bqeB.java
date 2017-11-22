/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class bqeB {
    private double[] sAGp;
    private double DYbo;
    private boolean uqac;

    public bqeB(int n) {
        this.sAGp = new double[n];
        bqeB.FP((double[])cv.b(this, -460850837), 0.0);
        this.DYbo = 0.0;
        this.uqac = false;
    }

    public void hHYn(double d) {
        bqeB.FP((double[])cv.b(this, -460850837), d);
        cv.e(this, 1379334484, true);
    }

    public double getAverage() {
        if (((Boolean)cv.b(this, 1379334484)).booleanValue()) {
            this.bywp();
            return this.getAverage();
        }
        return (Double)cv.b(this, 1341913431);
    }

    private void bywp() {
        double d = 0.0;
        for (double d2 : (double[])cv.b(this, -460850837)) {
            d += d2;
        }
        cv.e(this, 1341913431, d / (double)((double[])cv.b(this, -460850837)).length);
        cv.e(this, 1379334484, false);
    }

    private static Object FP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

