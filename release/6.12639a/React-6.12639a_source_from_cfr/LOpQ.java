/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class LOpQ {
    private double KyYY = 0.0;
    private double max;

    public LOpQ(double d) {
        this.max = d;
    }

    public LOpQ GkCK(double d) {
        o.v(this, -1077723827, d);
        this.jhjy();
        return this;
    }

    public LOpQ Ywen(double d) {
        LOpQ lOpQ = this;
        o.v(lOpQ, -1077723827, (Double)o.a(lOpQ, -1077723827) + d);
        this.jhjy();
        return this;
    }

    public LOpQ UAGQ(double d) {
        LOpQ lOpQ = this;
        o.v(lOpQ, -1077723827, (Double)o.a(lOpQ, -1077723827) - d);
        this.jhjy();
        return this;
    }

    public double get() {
        return (Double)o.a(this, -1077723827);
    }

    public void jhjy() {
        if ((Double)o.a(this, -1077723827) < 0.0) {
            o.v(this, -1077723827, (Double)o.a(this, 141573452) - (Object)(LOpQ.mc((Double)o.a(this, -1077723827)) > (Double)o.a(this, 141573452) ? ((Double)o.a(this, 141573452)).doubleValue() : (Object)LOpQ.mc((Double)o.a(this, -1077723827))));
        }
        LOpQ lOpQ = this;
        o.v(lOpQ, -1077723827, (Double)o.a(lOpQ, -1077723827) % (Double)o.a(this, 141573452));
    }

    private static Object mc(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

