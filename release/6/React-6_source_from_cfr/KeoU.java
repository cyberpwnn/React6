/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class KeoU {
    private long vkmt;
    private long UIlb;
    private long gxtb;
    private long yuXD;
    private double WPTV;
    private boolean GHuK;

    public KeoU() {
        this.reset();
        this.GHuK = false;
    }

    public void begin() {
        cv.e(this, -1057621634, true);
        cv.e(this, -539625095, (long)KeoU.ux());
        cv.e(this, 133560376, (long)KeoU.ux());
    }

    public void end() {
        if (!((Boolean)cv.b(this, -1057621634)).booleanValue()) {
            return;
        }
        cv.e(this, -1057621634, false);
        cv.e(this, 222361659, (long)(KeoU.ux() - (Long)cv.b(this, -539625095)));
        cv.e(this, 1415837754, (long)(KeoU.ux() - (Long)cv.b(this, 133560376)));
        cv.e(this, -315230171, (double)((Long)cv.b(this, 222361659)).longValue() / 1000000.0);
        cv.e(this, -315230171, (double)((Long)cv.b(this, 1415837754)).longValue() - (Double)cv.b(this, -315230171) > 1.01 ? (double)((Long)cv.b(this, 1415837754)).longValue() : (Double)cv.b(this, -315230171));
    }

    public void reset() {
        cv.e(this, 222361659, -1);
        cv.e(this, 1415837754, -1);
        cv.e(this, -539625095, -1);
        cv.e(this, 133560376, -1);
        cv.e(this, -315230171, 0.0);
        cv.e(this, -1057621634, false);
    }

    public String ykmX(int n) {
        if ((double)this.tdxF() < 1000.0) {
            return KeoU.ux(KeoU.ux(KeoU.ux(new StringBuilder(), KeoU.ux(this.tdxF())), YEBy$TyVf.W("\uba96\u97a2")));
        }
        if (this.hYdh() < 1000.0) {
            return KeoU.ux(KeoU.ux(KeoU.ux(new StringBuilder(), KeoU.ux(this.hYdh(), n)), YEBy$TyVf.W("\uba95\u97a2")));
        }
        if (this.getSeconds() < 60.0) {
            return KeoU.ux(KeoU.ux(KeoU.ux(new StringBuilder(), KeoU.ux(this.getSeconds(), n)), YEBy$TyVf.W("\uba8b")));
        }
        if (this.BBFe() < 60.0) {
            return KeoU.ux(KeoU.ux(KeoU.ux(new StringBuilder(), KeoU.ux(this.BBFe(), n)), YEBy$TyVf.W("\uba95")));
        }
        return KeoU.ux(KeoU.ux(KeoU.ux(new StringBuilder(), KeoU.ux(this.xqeH(), n)), YEBy$TyVf.W("\uba90")));
    }

    public double Pubc() {
        return this.hYdh() / 50.0;
    }

    public double getSeconds() {
        return this.hYdh() / 1000.0;
    }

    public double BBFe() {
        return this.getSeconds() / 60.0;
    }

    public double xqeH() {
        return this.BBFe() / 60.0;
    }

    public double hYdh() {
        return (Double)cv.b(this, -315230171);
    }

    public long tdxF() {
        return (long)((Double)cv.b(this, -315230171) * 1000000.0);
    }

    public long clWu() {
        return (Long)cv.b(this, 222361659);
    }

    public long dMWs() {
        return (Long)cv.b(this, -539625095);
    }

    public long getMillis() {
        return (Long)cv.b(this, 1415837754);
    }

    public long TFYr() {
        return (Long)cv.b(this, 133560376);
    }

    public double ccgJ() {
        return (Double)cv.b(this, -315230171);
    }

    public boolean GYgG() {
        return (Boolean)cv.b(this, -1057621634);
    }

    private static Object ux(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

