/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class mXJp {
    private long mXJp;
    private long ksfs;
    private long yJLL;
    private long SnBs;
    private double qdWJ;
    private boolean JRFt;

    public mXJp() {
        this.reset();
        this.JRFt = false;
    }

    public void begin() {
        yy.E(this, -1910243639, true);
        yy.E(this, 1712455378, (long)mXJp.Hh());
        yy.E(this, 56557255, (long)mXJp.Hh());
    }

    public void end() {
        if (!((Boolean)yy.h(this, -1910243639)).booleanValue()) {
            return;
        }
        yy.E(this, -1910243639, false);
        yy.E(this, -886243640, (long)(mXJp.Hh() - (Long)yy.h(this, 1712455378)));
        yy.E(this, 1147076317, (long)(mXJp.Hh() - (Long)yy.h(this, 56557255)));
        yy.E(this, -1986134314, (double)((Long)yy.h(this, -886243640)).longValue() / 1000000.0);
        yy.E(this, -1986134314, (double)((Long)yy.h(this, 1147076317)).longValue() - (Double)yy.h(this, -1986134314) > 1.01 ? (double)((Long)yy.h(this, 1147076317)).longValue() : (Double)yy.h(this, -1986134314));
    }

    public void reset() {
        yy.E(this, -886243640, -1);
        yy.E(this, 1147076317, -1);
        yy.E(this, 1712455378, -1);
        yy.E(this, 56557255, -1);
        yy.E(this, -1986134314, 0.0);
        yy.E(this, -1910243639, false);
    }

    public String mXJp(int n) {
        if ((double)this.qdWJ() < 1000.0) {
            return mXJp.Hh(mXJp.Hh(mXJp.Hh(new StringBuilder(), mXJp.Hh(this.qdWJ())), BkvY$LhxG.I("\uc519\u543f")));
        }
        if (this.SnBs() < 1000.0) {
            return mXJp.Hh(mXJp.Hh(mXJp.Hh(new StringBuilder(), mXJp.Hh(this.SnBs(), n)), BkvY$LhxG.I("\uc51a\u543f")));
        }
        if (this.getSeconds() < 60.0) {
            return mXJp.Hh(mXJp.Hh(mXJp.Hh(new StringBuilder(), mXJp.Hh(this.getSeconds(), n)), BkvY$LhxG.I("\uc504")));
        }
        if (this.ksfs() < 60.0) {
            return mXJp.Hh(mXJp.Hh(mXJp.Hh(new StringBuilder(), mXJp.Hh(this.ksfs(), n)), BkvY$LhxG.I("\uc51a")));
        }
        return mXJp.Hh(mXJp.Hh(mXJp.Hh(new StringBuilder(), mXJp.Hh(this.yJLL(), n)), BkvY$LhxG.I("\uc51f")));
    }

    public double mXJp() {
        return this.SnBs() / 50.0;
    }

    public double getSeconds() {
        return this.SnBs() / 1000.0;
    }

    public double ksfs() {
        return this.getSeconds() / 60.0;
    }

    public double yJLL() {
        return this.ksfs() / 60.0;
    }

    public double SnBs() {
        return (Double)yy.h(this, -1986134314);
    }

    public long qdWJ() {
        return (long)((Double)yy.h(this, -1986134314) * 1000000.0);
    }

    public long JRFt() {
        return (Long)yy.h(this, -886243640);
    }

    public long halY() {
        return (Long)yy.h(this, 1712455378);
    }

    public long getMillis() {
        return (Long)yy.h(this, 1147076317);
    }

    public long ssMm() {
        return (Long)yy.h(this, 56557255);
    }

    public double yIkI() {
        return (Double)yy.h(this, -1986134314);
    }

    public boolean CVAs() {
        return (Boolean)yy.h(this, -1910243639);
    }

    private static Object Hh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

