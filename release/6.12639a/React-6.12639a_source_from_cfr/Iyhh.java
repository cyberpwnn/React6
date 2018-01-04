/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class Iyhh
extends Thread {
    private double SEMt;
    private double CiFb;
    private MRfD jiuI;
    private MRfD JJvW;
    private boolean tVPl;
    private Thread.State qCvC;
    private double vuiE;
    private double opsl;
    private long KDnL;
    private boolean TYRN;
    private StackTraceElement[] XvcK;
    private double BmrV = 0.0;

    public Iyhh() {
        this.setName(nJPf$sILv.G("\u0d4a\u6474\u2368\uaad3\u8b20\u3ef6\uc3f5\u80ab\u4e70\u6e72\u5209\ub9eb\u35bf\ud1dd\uf20e\udf76\u982b\u6cc4"));
        this.jiuI = new MRfD();
        Iyhh.bC((MRfD)o.a(this, -1266856850));
        this.JJvW = new MRfD();
        Iyhh.bC((MRfD)o.a(this, 1718570093));
        this.vuiE = 0.0;
        this.SEMt = 0.0;
        this.TYRN = false;
        this.opsl = 0.0;
        this.tVPl = false;
        this.qCvC = (Thread.State)((Object)o.k(-1781314452));
        this.KDnL = Iyhh.bC();
        this.XvcK = null;
        this.TYRN = false;
    }

    public abstract void tKvO();

    public abstract void GcIT();

    @Override
    public void run() {
        while (!Iyhh.interrupted()) {
            if (Iyhh.interrupted()) {
                return;
            }
            if (Iyhh.bC() != null) {
                this.yJLS((Thread.State)((Object)Iyhh.bC(Iyhh.bC())));
            }
            if (Iyhh.interrupted()) {
                return;
            }
            if (((Boolean)o.a(this, 177294457)).booleanValue()) {
                Iyhh.bC((MRfD)o.a(this, -1266856850));
                o.v(this, 945441912, (double)Iyhh.bC((MRfD)o.a(this, -1266856850)));
                o.v(this, 934366326, (double)Iyhh.bC(1000.0 / (((Double)o.a(this, -543011721) + (Double)o.a(this, 945441912)) / 2.0), 0.0, 20.0));
                o.v(this, -543011721, (double)((Double)o.a(this, 945441912)));
                Iyhh.bC((MRfD)o.a(this, -1266856850));
                Iyhh.bC((MRfD)o.a(this, -1266856850));
                o.v(this, 177294457, false);
                o.v(this, 121326709, (Double)o.a(this, 121326709) == 0.0 ? ((Double)o.a(this, -718517132)).doubleValue() : ((Double)o.a(this, 121326709)).doubleValue());
                o.v(this, -718517132, (Double)o.a(this, 121326709) > 0.0 ? ((Double)o.a(this, 121326709)).doubleValue() : ((Double)o.a(this, -718517132)).doubleValue());
                this.tKvO();
                o.v(this, 121326709, 0.0);
                o.v(this, -1121301389, (long)Iyhh.bC());
                o.v(this, 1069239394, false);
                o.v(this, -2086712223, null);
            } else if (Iyhh.bC() - (Long)o.a(this, -1121301389) > 900) {
                boolean bl = (Boolean)o.a(this, 1069239394) == false;
                o.v(this, 1069239394, true);
                o.v(this, 934366326, (double)(- Iyhh.bC() - (Long)o.a(this, -1121301389)));
                o.v(this, 945441912, (double)(Iyhh.bC() - (Long)o.a(this, -1121301389)));
                if (bl) {
                    try {
                        o.v(this, -2086712223, (StackTraceElement[])o.a(this, -2086712223) == null ? (StackTraceElement[])Iyhh.bC(Iyhh.bC()) : (StackTraceElement[])o.a(this, -2086712223));
                        this.GcIT();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                this.tKvO();
            }
            try {
                Iyhh.bC(1);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
    }

    private void yJLS(Thread.State state) {
        if (Iyhh.bC(state, (Thread.State)((Object)o.a(this, -1355592608))) != false) {
            return;
        }
        if (Iyhh.bC(state, (Thread.State)((Object)o.k(-282506146))) != false) {
            return;
        }
        if (Iyhh.bC(state, (Thread.State)((Object)o.k(-1338291107))) == false) {
            if (Iyhh.bC(state, (Thread.State)((Object)o.k(-1781314452))) == false) {
                return;
            }
        }
        if (Iyhh.bC((Thread.State)((Object)o.a(this, -1355592608)), (Thread.State)((Object)o.k(-1781314452))) != false) {
            if (Iyhh.bC(state, (Thread.State)((Object)o.k(-1338291107))) != false) {
                Iyhh.bC((MRfD)o.a(this, 1718570093));
                Iyhh iyhh = this;
                o.v(iyhh, 121326709, (Double)o.a(iyhh, 121326709) + Iyhh.bC((MRfD)o.a(this, 1718570093)));
                Iyhh.bC((MRfD)o.a(this, 1718570093));
            }
        }
        if (Iyhh.bC((Thread.State)((Object)o.a(this, -1355592608)), (Thread.State)((Object)o.k(-1338291107))) != false) {
            if (Iyhh.bC(state, (Thread.State)((Object)o.k(-1781314452))) != false) {
                Iyhh.bC((MRfD)o.a(this, 1718570093));
            }
        }
        o.v(this, -1355592608, (Object)((Object)state));
    }

    public double QODG() {
        return (Double)o.a(this, 945441912);
    }

    public double EBnx() {
        return (Double)o.a(this, 934366326);
    }

    public MRfD dUxm() {
        return (MRfD)o.a(this, -1266856850);
    }

    public boolean hsgt() {
        return (Boolean)o.a(this, 177294457);
    }

    public void Utag() {
        o.v(this, 177294457, true);
    }

    public MRfD CMjR() {
        return (MRfD)o.a(this, 1718570093);
    }

    public Thread.State RcHn() {
        return (Thread.State)((Object)o.a(this, -1355592608));
    }

    public double PBoS() {
        return (Double)o.a(this, 121326709);
    }

    public double pGyb() {
        return (Double)o.a(this, -718517132);
    }

    public long WytI() {
        return (Long)o.a(this, -1121301389);
    }

    public boolean isFrozen() {
        return (Boolean)o.a(this, 1069239394);
    }

    public StackTraceElement[] Hvlr() {
        return (StackTraceElement[])o.a(this, -2086712223);
    }

    private static Object bC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

