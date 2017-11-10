/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class GbYt {
    private double SoNN = 0.0;
    private double max;

    public GbYt(double d) {
        this.max = d;
    }

    public GbYt HdqI(double d) {
        yy.E(this, 820512795, d);
        this.KUXe();
        return this;
    }

    public GbYt vHqM(double d) {
        GbYt gbYt = this;
        yy.E(gbYt, 820512795, (Double)yy.h(gbYt, 820512795) + d);
        this.KUXe();
        return this;
    }

    public GbYt Bkpl(double d) {
        GbYt gbYt = this;
        yy.E(gbYt, 820512795, (Double)yy.h(gbYt, 820512795) - d);
        this.KUXe();
        return this;
    }

    public double get() {
        return (Double)yy.h(this, 820512795);
    }

    public void KUXe() {
        if ((Double)yy.h(this, 820512795) < 0.0) {
            yy.E(this, 820512795, (Double)yy.h(this, -586741732) - (Object)(GbYt.Ni((Double)yy.h(this, 820512795)) > (Double)yy.h(this, -586741732) ? ((Double)yy.h(this, -586741732)).doubleValue() : (Object)GbYt.Ni((Double)yy.h(this, 820512795))));
        }
        GbYt gbYt = this;
        yy.E(gbYt, 820512795, (Double)yy.h(gbYt, 820512795) % (Double)yy.h(this, -586741732));
    }

    private static Object Ni(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

