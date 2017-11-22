/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class WaKm
extends Thread {
    private double VDna;
    private double IOkM;
    private KeoU apBu;
    private KeoU HLgq;
    private boolean MujW;
    private Thread.State LPdR;
    private double xGob;
    private double RbvW;
    private long rhQD;
    private boolean BJsu;
    private StackTraceElement[] lwrO;

    public WaKm() {
        this.setName(rgig$AWxc.r("\ucd3f\u1d84\u29c9\u4378\uc873\ud2bc\ucd5f\uba31\u063f\uc470\uf25c\u9ecd\uf5f1\uba9f\u8a79\u7ac6\u4077\u0e34"));
        this.apBu = new KeoU();
        WaKm.bl((KeoU)cv.b(this, 1920988977));
        this.HLgq = new KeoU();
        WaKm.bl((KeoU)cv.b(this, -954730704));
        this.xGob = 0.0;
        this.VDna = 0.0;
        this.BJsu = false;
        this.RbvW = 0.0;
        this.MujW = false;
        this.LPdR = (Thread.State)((Object)cv.e(349370163));
        this.rhQD = WaKm.bl();
        this.lwrO = null;
        this.BJsu = false;
    }

    public abstract void ktXM();

    public abstract void IFas();

    @Override
    public void run() {
        while (!WaKm.interrupted()) {
            if (WaKm.bl() != null) {
                this.ssNb((Thread.State)((Object)WaKm.bl(WaKm.bl())));
            }
            if (((Boolean)cv.b(this, -462293188)).booleanValue()) {
                WaKm.bl((KeoU)cv.b(this, 1920988977));
                cv.e(this, 1247737663, (double)WaKm.bl((KeoU)cv.b(this, 1920988977)));
                cv.e(this, 1050539838, (double)WaKm.bl(1000.0 / (Double)cv.b(this, 1247737663), 0.0, 20.0));
                WaKm.bl((KeoU)cv.b(this, 1920988977));
                WaKm.bl((KeoU)cv.b(this, 1920988977));
                cv.e(this, -462293188, false);
                cv.e(this, 1842476857, (Double)cv.b(this, 1842476857) == 0.0 ? ((Double)cv.b(this, -895617800)).doubleValue() : ((Double)cv.b(this, 1842476857)).doubleValue());
                cv.e(this, -895617800, (Double)cv.b(this, 1842476857) > 0.0 ? ((Double)cv.b(this, 1842476857)).doubleValue() : ((Double)cv.b(this, -895617800)).doubleValue());
                this.ktXM();
                cv.e(this, 1842476857, 0.0);
                cv.e(this, -145230597, (long)WaKm.bl());
                cv.e(this, -103222022, false);
                cv.e(this, 1316549861, null);
            } else if (WaKm.bl() - (Long)cv.b(this, -145230597) > 900) {
                boolean bl = (Boolean)cv.b(this, -103222022) == false;
                cv.e(this, -103222022, true);
                cv.e(this, 1050539838, (double)(- WaKm.bl() - (Long)cv.b(this, -145230597)));
                cv.e(this, 1247737663, (double)(WaKm.bl() - (Long)cv.b(this, -145230597)));
                if (bl) {
                    cv.e(this, 1316549861, (StackTraceElement[])cv.b(this, 1316549861) == null ? (StackTraceElement[])WaKm.bl(WaKm.bl()) : (StackTraceElement[])cv.b(this, 1316549861));
                    this.IFas();
                }
                this.ktXM();
            }
            try {
                WaKm.bl(1);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
    }

    private void ssNb(Thread.State state) {
        if (WaKm.bl(state, (Thread.State)((Object)cv.b(this, 1926100199))) != false) {
            return;
        }
        if (WaKm.bl(state, (Thread.State)((Object)cv.e(1328018657))) != false) {
            return;
        }
        if (WaKm.bl(state, (Thread.State)((Object)cv.e(1617229024))) == false) {
            if (WaKm.bl(state, (Thread.State)((Object)cv.e(349370163))) == false) {
                return;
            }
        }
        if (WaKm.bl((Thread.State)((Object)cv.b(this, 1926100199)), (Thread.State)((Object)cv.e(349370163))) != false) {
            if (WaKm.bl(state, (Thread.State)((Object)cv.e(1617229024))) != false) {
                WaKm.bl((KeoU)cv.b(this, -954730704));
                WaKm waKm = this;
                cv.e(waKm, 1842476857, (Double)cv.b(waKm, 1842476857) + WaKm.bl((KeoU)cv.b(this, -954730704)));
                WaKm.bl((KeoU)cv.b(this, -954730704));
            }
        }
        if (WaKm.bl((Thread.State)((Object)cv.b(this, 1926100199)), (Thread.State)((Object)cv.e(1617229024))) != false) {
            if (WaKm.bl(state, (Thread.State)((Object)cv.e(349370163))) != false) {
                WaKm.bl((KeoU)cv.b(this, -954730704));
            }
        }
        cv.e(this, 1926100199, (Object)((Object)state));
    }

    public double qBdN() {
        return (Double)cv.b(this, 1247737663);
    }

    public double mrMJ() {
        return (Double)cv.b(this, 1050539838);
    }

    public KeoU bPKY() {
        return (KeoU)cv.b(this, 1920988977);
    }

    public boolean CpFK() {
        return (Boolean)cv.b(this, -462293188);
    }

    public void imom() {
        cv.e(this, -462293188, true);
    }

    public KeoU DrhM() {
        return (KeoU)cv.b(this, -954730704);
    }

    public Thread.State PKWY() {
        return (Thread.State)((Object)cv.b(this, 1926100199));
    }

    public double GtBM() {
        return (Double)cv.b(this, 1842476857);
    }

    public double nuPQ() {
        return (Double)cv.b(this, -895617800);
    }

    public long GIDW() {
        return (Long)cv.b(this, -145230597);
    }

    public boolean isFrozen() {
        return (Boolean)cv.b(this, -103222022);
    }

    public StackTraceElement[] OGsT() {
        return (StackTraceElement[])cv.b(this, 1316549861);
    }

    private static Object bl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

