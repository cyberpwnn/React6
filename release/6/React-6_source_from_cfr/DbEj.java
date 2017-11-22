/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class DbEj
extends Thread {
    private long ylsl;
    private long Rbss;
    private long hstO;
    private long ooxG;
    private long YEek;
    private long oxiO;
    private long NWHx;
    private long kIyJ;
    private long mXop;
    private long LGpq;
    private long PLMk;
    private long SoJF;
    private long iLcQ;
    private long vRiD;

    public DbEj() {
        this.setName(KUXS$dwji.S("\uef85\ufb84\u95d2\udcfa\uf022\uc90e\ua46c\u65ad\u6fb1\uf077\uf604\ube3e\uae58\uedcd\u87b7\ubaad\ua650\u9216\u7705\u518e"));
        this.ylsl = DbEj.WV(DbEj.WV());
        this.hstO = DbEj.WV(DbEj.WV());
        this.Rbss = (Long)cv.b(this, -188615545) - (Long)cv.b(this, 731640966);
        this.ooxG = (Long)cv.b(this, 317256833);
        this.oxiO = 0;
        this.NWHx = 0;
        this.iLcQ = 0;
        this.vRiD = 0;
        this.kIyJ = 0;
        this.YEek = 0;
        this.mXop = DbEj.WV();
        this.LGpq = 0;
        this.PLMk = 0;
        this.SoJF = 0;
    }

    public abstract void BSOO();

    @Override
    public void run() {
        while (!DbEj.interrupted()) {
            cv.e(this, -188615545, (long)DbEj.WV(DbEj.WV()));
            cv.e(this, 731640966, (long)(DbEj.WV(DbEj.WV()) + ((Long)cv.b(this, -188615545) - DbEj.WV(DbEj.WV()))));
            cv.e(this, 317256833, (Long)cv.b(this, -188615545) - (Long)cv.b(this, 731640966));
            if ((Long)cv.b(this, -1230179197) == 0) {
                cv.e(this, -1230179197, (long)((Long)cv.b(this, 317256833)));
            }
            if ((Long)cv.b(this, 317256833) >= (Long)cv.b(this, -1927285630)) {
                DbEj dbEj = this;
                cv.e(dbEj, -2028145523, (Long)cv.b(dbEj, -2028145523) + ((Long)cv.b(this, 317256833) - (Long)cv.b(this, -1927285630)));
                DbEj dbEj2 = this;
                cv.e(dbEj2, 404419724, (Long)cv.b(dbEj2, 404419724) + ((Long)cv.b(this, 317256833) - (Long)cv.b(this, -1927285630)));
            } else {
                cv.e(this, 1364325519, (Long)cv.b(this, -1927285630) - (Long)cv.b(this, 317256833));
                cv.e(this, -1230179197, (long)((Long)cv.b(this, 317256833)));
                cv.e(this, -2028145523, 0);
            }
            cv.e(this, -1927285630, (long)((Long)cv.b(this, 317256833)));
            if (DbEj.WV() - (Long)cv.b(this, 2044261518) >= 50) {
                cv.e(this, 2044261518, (long)DbEj.WV());
                cv.e(this, -859442039, (long)((Long)cv.b(this, -2028145523)));
                cv.e(this, 2069492872, (long)((Long)cv.b(this, 1364325519)));
                cv.e(this, 225637514, (long)DbEj.WV(0, (Long)cv.b(this, -859442039) - (Long)cv.b(this, 2069492872)));
                cv.e(this, -1978600331, (Long)cv.b(this, 404419724) * 20);
                cv.e(this, 404419724, 0);
                this.BSOO();
            }
            try {
                DbEj.WV(1);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
    }

    public long IWad() {
        return (Long)cv.b(this, 731640966);
    }

    public long getMemoryUsed() {
        return (Long)cv.b(this, 317256833);
    }

    public long miYd() {
        return (Long)cv.b(this, -188615545);
    }

    public long ETFk() {
        return (Long)cv.b(this, -1927285630);
    }

    public long QWIV() {
        return (Long)cv.b(this, -1230179197);
    }

    public long getAllocated() {
        return (Long)cv.b(this, -2028145523);
    }

    public long lTsr() {
        return (Long)cv.b(this, 1364325519);
    }

    public long gowu() {
        return (Long)cv.b(this, -854002572);
    }

    public long MBKs() {
        return (Long)cv.b(this, 2044261518);
    }

    public long UIbl() {
        return (Long)cv.b(this, -859442039);
    }

    public long hQYY() {
        return (Long)cv.b(this, 2069492872);
    }

    public long JbuU() {
        return (Long)cv.b(this, 225637514);
    }

    public long RkNM() {
        return (Long)cv.b(this, 404419724);
    }

    public long vJEF() {
        return (Long)cv.b(this, -1978600331);
    }

    private static Object WV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

