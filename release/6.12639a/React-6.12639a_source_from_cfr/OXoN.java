/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class OXoN {
    private double[] hQwl;
    private double lVTL;
    private boolean ArkH;

    public OXoN(int n) {
        this.hQwl = new double[n];
        OXoN.yn((double[])o.a(this, 556678662), 0.0);
        this.lVTL = 0.0;
        this.ArkH = false;
    }

    public void IFQY(double d) {
        OXoN.yn((double[])o.a(this, 556678662), d);
        o.v(this, 373964291, true);
    }

    public double getAverage() {
        if (((Boolean)o.a(this, 373964291)).booleanValue()) {
            this.vbpD();
            return this.getAverage();
        }
        return (Double)o.a(this, -281526542);
    }

    private void vbpD() {
        double d = 0.0;
        double[] arrd = (double[])o.a(this, 556678662);
        int n = arrd.length;
        int n2 = 0;
        while (n2 < n) {
            double d2 = arrd[n2];
            d += d2;
            ++n2;
        }
        o.v(this, -281526542, d / (double)((double[])o.a(this, 556678662)).length);
        o.v(this, 373964291, false);
    }

    private static Object yn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

