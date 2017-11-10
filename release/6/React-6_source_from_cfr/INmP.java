/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class INmP
extends Thread {
    private double MJls;
    private double JdGm;
    private mXJp KVJF;
    private mXJp WYKv;
    private boolean Jkwa;
    private Thread.State sQkJ;
    private double mOyR;
    private double GRNN;
    private long kcek;

    public INmP() {
        this.setName(KDGY$JAHk.Y("\u3cf7\ue88c\u7f67\ua822\uf1fe\u5310\u4aec\u73c0\u0bc9\u4170\u231e\u4547\u7553\u9072\u6702\uedf2\ue91b\ub955"));
        this.KVJF = new mXJp();
        INmP.Nq((mXJp)yy.h(this, 1975387625));
        this.WYKv = new mXJp();
        INmP.Nq((mXJp)yy.h(this, -6158862));
        this.mOyR = 0.0;
        this.MJls = 0.0;
        this.GRNN = 0.0;
        this.Jkwa = false;
        this.sQkJ = (Thread.State)((Object)yy.p(-1976433177));
        this.kcek = INmP.Nq();
    }

    public abstract void qdcE();

    @Override
    public void run() {
        while (!INmP.interrupted()) {
            if (INmP.Nq() != null) {
                this.mXJp((Thread.State)((Object)INmP.Nq(INmP.Nq())));
            }
            if (((Boolean)yy.h(this, -1036057098)).booleanValue()) {
                INmP.Nq((mXJp)yy.h(this, 1975387625));
                yy.E(this, 1186792955, (double)INmP.Nq((mXJp)yy.h(this, 1975387625)));
                yy.E(this, -1845623300, (double)INmP.Nq(1000.0 / (Double)yy.h(this, 1186792955), 0.0, 20.0));
                INmP.Nq((mXJp)yy.h(this, 1975387625));
                INmP.Nq((mXJp)yy.h(this, 1975387625));
                yy.E(this, -1036057098, false);
                yy.E(this, 24446449, (Double)yy.h(this, 24446449) == 0.0 ? ((Double)yy.h(this, 2071922170)).doubleValue() : ((Double)yy.h(this, 24446449)).doubleValue());
                yy.E(this, 2071922170, (Double)yy.h(this, 24446449) > 0.0 ? ((Double)yy.h(this, 24446449)).doubleValue() : ((Double)yy.h(this, 2071922170)).doubleValue());
                this.qdcE();
                yy.E(this, 24446449, 0.0);
                yy.E(this, -418707985, (long)INmP.Nq());
            } else if (INmP.Nq() - (Long)yy.h(this, -418707985) > 300) {
                yy.E(this, -1845623300, (double)(- INmP.Nq() - (Long)yy.h(this, -418707985)));
                yy.E(this, 1186792955, (double)(INmP.Nq() - (Long)yy.h(this, -418707985)));
                this.qdcE();
            }
            try {
                INmP.Nq(1);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                INmP.Nq(interruptedException);
            }
        }
    }

    private void mXJp(Thread.State state) {
        if (INmP.Nq(state, (Thread.State)((Object)yy.h(this, -191101456))) != false) {
            return;
        }
        if (INmP.Nq(state, (Thread.State)((Object)yy.p(-637008450))) != false) {
            return;
        }
        if (INmP.Nq(state, (Thread.State)((Object)yy.p(-483457597))) == false) {
            if (INmP.Nq(state, (Thread.State)((Object)yy.p(-1976433177))) == false) {
                return;
            }
        }
        if (INmP.Nq((Thread.State)((Object)yy.h(this, -191101456)), (Thread.State)((Object)yy.p(-1976433177))) != false) {
            if (INmP.Nq(state, (Thread.State)((Object)yy.p(-483457597))) != false) {
                INmP.Nq((mXJp)yy.h(this, -6158862));
                INmP iNmP = this;
                yy.E(iNmP, 24446449, (Double)yy.h(iNmP, 24446449) + INmP.Nq((mXJp)yy.h(this, -6158862)));
                INmP.Nq((mXJp)yy.h(this, -6158862));
            }
        }
        if (INmP.Nq((Thread.State)((Object)yy.h(this, -191101456)), (Thread.State)((Object)yy.p(-483457597))) != false) {
            if (INmP.Nq(state, (Thread.State)((Object)yy.p(-1976433177))) != false) {
                INmP.Nq((mXJp)yy.h(this, -6158862));
            }
        }
        yy.E(this, -191101456, (Object)((Object)state));
    }

    public double DrcY() {
        return (Double)yy.h(this, 1186792955);
    }

    public double jqQA() {
        return (Double)yy.h(this, -1845623300);
    }

    public mXJp tLId() {
        return (mXJp)yy.h(this, 1975387625);
    }

    public boolean rxfr() {
        return (Boolean)yy.h(this, -1036057098);
    }

    public void dUlA() {
        yy.E(this, -1036057098, true);
    }

    public mXJp DGnt() {
        return (mXJp)yy.h(this, -6158862);
    }

    public Thread.State WaIA() {
        return (Thread.State)((Object)yy.h(this, -191101456));
    }

    public double myyE() {
        return (Double)yy.h(this, 24446449);
    }

    private static Object Nq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

