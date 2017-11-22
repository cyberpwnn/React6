/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class kstv {
    private double NqGg = 0.0;
    private double max;

    public kstv(double d) {
        this.max = d;
    }

    public kstv nImU(double d) {
        cv.e(this, 849373, d);
        this.Rsag();
        return this;
    }

    public kstv KwOT(double d) {
        kstv kstv2 = this;
        cv.e(kstv2, 849373, (Double)cv.b(kstv2, 849373) + d);
        this.Rsag();
        return this;
    }

    public kstv KUKx(double d) {
        kstv kstv2 = this;
        cv.e(kstv2, 849373, (Double)cv.b(kstv2, 849373) - d);
        this.Rsag();
        return this;
    }

    public double get() {
        return (Double)cv.b(this, 849373);
    }

    public void Rsag() {
        if ((Double)cv.b(this, 849373) < 0.0) {
            cv.e(this, 849373, (Double)cv.b(this, 660403676) - (Object)(kstv.PZ((Double)cv.b(this, 849373)) > (Double)cv.b(this, 660403676) ? ((Double)cv.b(this, 660403676)).doubleValue() : (Object)kstv.PZ((Double)cv.b(this, 849373))));
        }
        kstv kstv2 = this;
        cv.e(kstv2, 849373, (Double)cv.b(kstv2, 849373) % (Double)cv.b(this, 660403676));
    }

    private static Object PZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

