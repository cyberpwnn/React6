/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class MRfD {
    private long nTFp;
    private long SnkQ;
    private long FOTR;
    private long HoLi;
    private double sIdK;
    private boolean bbFJ;

    public MRfD() {
        this.reset();
        this.bbFJ = false;
    }

    public void begin() {
        o.v(this, -1669906734, true);
        o.v(this, -703643951, (long)MRfD.bL());
        o.v(this, 921910992, (long)MRfD.bL());
    }

    public void end() {
        if (!((Boolean)o.a(this, -1669906734)).booleanValue()) {
            return;
        }
        o.v(this, -1669906734, false);
        o.v(this, -1668399409, (long)(MRfD.bL() - (Long)o.a(this, -703643951)));
        o.v(this, -1359724850, (long)(MRfD.bL() - (Long)o.a(this, 921910992)));
        o.v(this, 222641869, (double)((Long)o.a(this, -1668399409)).longValue() / 1000000.0);
        o.v(this, 222641869, (double)((Long)o.a(this, -1359724850)).longValue() - (Double)o.a(this, 222641869) > 1.01 ? (double)((Long)o.a(this, -1359724850)).longValue() : (Double)o.a(this, 222641869));
    }

    public void reset() {
        o.v(this, -1668399409, -1);
        o.v(this, -1359724850, -1);
        o.v(this, -703643951, -1);
        o.v(this, 921910992, -1);
        o.v(this, 222641869, 0.0);
        o.v(this, -1669906734, false);
    }

    public String xykf(int n) {
        if ((double)this.Elru() < 1000.0) {
            return MRfD.bL(MRfD.bL(new StringBuilder((String)MRfD.bL(MRfD.bL(this.Elru()))), mrFx$WjFM.d("\ub70f\u6d48")));
        }
        if (this.rFBK() < 1000.0) {
            return MRfD.bL(MRfD.bL(new StringBuilder((String)MRfD.bL(MRfD.bL(this.rFBK(), n))), mrFx$WjFM.d("\ub70c\u6d48")));
        }
        if (this.getSeconds() < 60.0) {
            return MRfD.bL(MRfD.bL(new StringBuilder((String)MRfD.bL(MRfD.bL(this.getSeconds(), n))), mrFx$WjFM.d("\ub712")));
        }
        if (this.LrIE() < 60.0) {
            return MRfD.bL(MRfD.bL(new StringBuilder((String)MRfD.bL(MRfD.bL(this.LrIE(), n))), mrFx$WjFM.d("\ub70c")));
        }
        return MRfD.bL(MRfD.bL(new StringBuilder((String)MRfD.bL(MRfD.bL(this.PeBo(), n))), mrFx$WjFM.d("\ub709")));
    }

    public double xXTE() {
        return this.rFBK() / 50.0;
    }

    public double getSeconds() {
        return this.rFBK() / 1000.0;
    }

    public double LrIE() {
        return this.getSeconds() / 60.0;
    }

    public double PeBo() {
        return this.LrIE() / 60.0;
    }

    public double rFBK() {
        return (Double)o.a(this, 222641869);
    }

    public long Elru() {
        return (long)((Double)o.a(this, 222641869) * 1000000.0);
    }

    public long sQUP() {
        return (Long)o.a(this, -1668399409);
    }

    public long yBDo() {
        return (Long)o.a(this, -703643951);
    }

    public long getMillis() {
        return (Long)o.a(this, -1359724850);
    }

    public long vtQM() {
        return (Long)o.a(this, 921910992);
    }

    public double JcRF() {
        return (Double)o.a(this, 222641869);
    }

    public boolean IqPU() {
        return (Boolean)o.a(this, -1669906734);
    }

    private static Object bL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

