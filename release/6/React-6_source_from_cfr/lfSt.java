/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class lfSt
extends Thread {
    private long VVFp;
    private long YxbK;
    private long Henx;
    private long VgHd;
    private long WjKg;
    private long lUeV;
    private long WYIg;
    private long JRdG;
    private long USDT;
    private long LXjQ;
    private long VDdo;
    private long qdtG;
    private long ECTi;
    private long EKeR;

    public lfSt() {
        this.setName(NVIs$JbpD.H("\ua388\u1ef4\ucbe5\uf934\u1992\u0488\uf325\u2477\ucea4\u7a62\u53d6\uffda\u5e18\u5d56\u4463\u53af\u6211\u6069\u8105\u8858"));
        this.VVFp = lfSt.fM(lfSt.fM());
        this.Henx = lfSt.fM(lfSt.fM());
        this.YxbK = (Long)yy.h(this, -795802217) - (Long)yy.h(this, -353958504);
        this.VgHd = (Long)yy.h(this, -1783757203);
        this.lUeV = 0;
        this.WYIg = 0;
        this.ECTi = 0;
        this.EKeR = 0;
        this.JRdG = 0;
        this.WjKg = 0;
        this.USDT = lfSt.fM();
        this.LXjQ = 0;
        this.VDdo = 0;
        this.qdtG = 0;
    }

    public abstract void ogLP();

    @Override
    public void run() {
        while (!lfSt.interrupted()) {
            yy.E(this, -795802217, (long)lfSt.fM(lfSt.fM()));
            yy.E(this, -353958504, (long)(lfSt.fM(lfSt.fM()) + ((Long)yy.h(this, -795802217) - lfSt.fM(lfSt.fM()))));
            yy.E(this, -1783757203, (Long)yy.h(this, -795802217) - (Long)yy.h(this, -353958504));
            if ((Long)yy.h(this, -2145712533) == 0) {
                yy.E(this, -2145712533, (long)((Long)yy.h(this, -1783757203)));
            }
            if ((Long)yy.h(this, -1783757203) >= (Long)yy.h(this, 1180501612)) {
                lfSt lfSt2 = this;
                yy.E(lfSt2, -1803549087, (Long)yy.h(lfSt2, -1803549087) + ((Long)yy.h(this, -1783757203) - (Long)yy.h(this, 1180501612)));
                lfSt lfSt3 = this;
                yy.E(lfSt3, 269026922, (Long)yy.h(lfSt3, 269026922) + ((Long)yy.h(this, -1783757203) - (Long)yy.h(this, 1180501612)));
            } else {
                yy.E(this, -172947873, (Long)yy.h(this, 1180501612) - (Long)yy.h(this, -1783757203));
                yy.E(this, -2145712533, (long)((Long)yy.h(this, -1783757203)));
                yy.E(this, -1803549087, 0);
            }
            yy.E(this, 1180501612, (long)((Long)yy.h(this, -1783757203)));
            if (lfSt.fM() - (Long)yy.h(this, -1395784096) >= 50) {
                yy.E(this, -1395784096, (long)lfSt.fM());
                yy.E(this, -1788738123, (long)((Long)yy.h(this, -1803549087)));
                yy.E(this, -1557330514, (long)((Long)yy.h(this, -172947873)));
                yy.E(this, 7275956, (long)lfSt.fM(0, (Long)yy.h(this, -1788738123) - (Long)yy.h(this, -1557330514)));
                yy.E(this, 1387136425, (Long)yy.h(this, 269026922) * 20);
                yy.E(this, 269026922, 0);
                this.ogLP();
            }
            try {
                lfSt.fM(1);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                lfSt.fM(interruptedException);
            }
        }
    }

    public long dgKn() {
        return (Long)yy.h(this, -353958504);
    }

    public long getMemoryUsed() {
        return (Long)yy.h(this, -1783757203);
    }

    public long BIyH() {
        return (Long)yy.h(this, -795802217);
    }

    public long qmRN() {
        return (Long)yy.h(this, 1180501612);
    }

    public long GkJR() {
        return (Long)yy.h(this, -2145712533);
    }

    public long getAllocated() {
        return (Long)yy.h(this, -1803549087);
    }

    public long Ukac() {
        return (Long)yy.h(this, -172947873);
    }

    public long wTnx() {
        return (Long)yy.h(this, -248248921);
    }

    public long RQVi() {
        return (Long)yy.h(this, -1395784096);
    }

    public long xGQd() {
        return (Long)yy.h(this, -1788738123);
    }

    public long cAfA() {
        return (Long)yy.h(this, -1557330514);
    }

    public long Jsrc() {
        return (Long)yy.h(this, 7275956);
    }

    public long XAel() {
        return (Long)yy.h(this, 269026922);
    }

    public long Gryi() {
        return (Long)yy.h(this, 1387136425);
    }

    private static Object fM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

