/*
 * Decompiled with CFR 0_123.
 */
import java.io.PrintStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.ConcurrentModificationException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class Lqeo {
    private gxcp Kfsk;
    private feCR<rMoL> FXEc;
    private int HCwl;
    private int QygV;
    private Queue<mFpP> AQHG;
    private String key;
    private cBEB gXBs;
    private static /* synthetic */ int[] xbDd;

    public void yJLS(mFpP mFpP2) {
        ((Queue)o.a(this, -1274003937)).offer(mFpP2);
    }

    public abstract long Xtjf();

    public void fvCU() {
        Object object = Lqeo.kJ();
        int n = 0;
        int n2 = ((Queue)o.a(this, -1274003937)).size();
        while (!((Queue)o.a(this, -1274003937)).isEmpty()) {
            ++n;
            Lqeo.kJ((mFpP)((Queue)o.a(this, -1274003937)).poll());
            reference var5_4 = Lqeo.kJ() - object;
            if (var5_4 > this.Xtjf()) break;
        }
        if (n >= n2) {
            ((Queue)o.a(this, -1274003937)).clear();
        }
    }

    public Lqeo(String string, int n, gxcp gxcp2) {
        this(n, gxcp2);
        this.key = string;
    }

    public Lqeo(int n, gxcp gxcp2) {
        if (n <= 0) {
            n = 1;
        }
        if (n > 4) {
            Lqeo.kJ((PrintStream)o.k(-1536601438), FMkR$WjFM.a("\u4a46\u2bb6\ud09d\u407a\u5cf4\u25d3\u68cb\u4406\ue01f\u4ed3\uaa55\u6cfa\uc559\u314f\uef57\ud33e\u6600\ud55f\uf978\u6696\u9466\u4d94\ub2ea\u6e1e\ue2f7\u6730\u1a82\uea25\ue985\uef6d\uec65\uc383\u9d1d\u3719\u7fc5\u7f6e\ub91f\u517f\u201d"));
        }
        this.FXEc = new feCR<T>();
        this.QygV = n;
        this.HCwl = 0;
        this.Kfsk = gxcp2;
        this.key = FMkR$WjFM.a("\u4a46\u2b98\ud0bd\u405f\u5cd8\u25ef\u68ac\u4468\ue057\u4ee9\uaa79\u6cdc\uc575");
        this.gXBs = new cBEB(-1);
        this.AQHG = new ConcurrentLinkedQueue<mFpP>();
    }

    public long mGQw() {
        Object object = Lqeo.kJ();
        while (this.xqdv() > 0) {
            try {
                Lqeo.kJ(1);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return (long)(Lqeo.kJ() - object);
    }

    public int xqdv() {
        int n = this.VLbG();
        Object object = Lqeo.kJ((feCR)o.a(this, -806470115));
        while (object.hasNext()) {
            rMoL rMoL2 = (rMoL)object.next();
            n += Lqeo.kJ(rMoL2).size();
        }
        return n;
    }

    public void start() {
        this.IFQY((Integer)o.a(this, 419577371));
    }

    public void shutdown() {
        Object object = Lqeo.kJ((feCR)o.a(this, -806470115));
        while (object.hasNext()) {
            rMoL rMoL2 = (rMoL)object.next();
            Lqeo.kJ(rMoL2);
        }
    }

    public Lqeo(int n) {
        this(n, (gxcp)((Object)o.k(-2042803064)));
    }

    public void UtIU(mFpP mFpP2) {
        Lqeo.kJ(this.Cwnv(), mFpP2);
    }

    public int getSize() {
        return (int)Lqeo.kJ((feCR)o.a(this, -806470115));
    }

    public int VLbG() {
        int n = 0;
        rMoL[] arrrMoL = this.MAfd();
        int n2 = arrrMoL.length;
        int n3 = 0;
        while (n3 < n2) {
            rMoL rMoL2 = arrrMoL[n3];
            n += Lqeo.kJ(rMoL2).size();
            ++n3;
        }
        return n;
    }

    public rMoL[] MAfd() {
        return (rMoL[])((Object[])Lqeo.kJ((feCR)o.a(this, -806470115), new rMoL[Lqeo.kJ((feCR)o.a(this, -806470115))]));
    }

    private void JcRS() {
        try {
            if (Lqeo.kJ((feCR)o.a(this, -806470115)) != false) {
                return;
            }
            double d = 0.0;
            int n = 0;
            double d2 = 0.0;
            Object object = Lqeo.kJ(Lqeo.kJ((feCR)o.a(this, -806470115)));
            while (object.hasNext()) {
                rMoL rMoL2 = (rMoL)object.next();
                d += Lqeo.kJ(Lqeo.kJ(rMoL2));
                n += Lqeo.kJ(rMoL2).size();
                d2 += Lqeo.kJ(Lqeo.kJ(rMoL2));
            }
            Lqeo.kJ(this.FVgY(), d /= (Object)Lqeo.kJ((feCR)o.a(this, -806470115)));
            Lqeo.kJ(this.FVgY(), n);
            Lqeo.kJ(this.FVgY(), d2 /= (Object)Lqeo.kJ((feCR)o.a(this, -806470115)));
            return;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            return;
        }
    }

    private rMoL Cwnv() {
        this.JcRS();
        if (Lqeo.kJ((feCR)o.a(this, -806470115)) == true) {
            return (rMoL)Lqeo.kJ((feCR)o.a(this, -806470115), false);
        }
        Object object = 0;
        switch (Lqeo.mrIy()[Lqeo.kJ((gxcp)((Object)o.a(this, -800702958)))]) {
            case 1: {
                o.v(this, 1039875600, (Integer)o.a(this, 1039875600) > Lqeo.kJ((feCR)o.a(this, -806470115)) - true ? 0 : (Integer)o.a(this, 1039875600) + 1);
                object = (Integer)o.a(this, 1039875600);
            }
            case 2: {
                int n = Integer.MAX_VALUE;
                Object object2 = Lqeo.kJ((feCR)o.a(this, -806470115));
                while (object2.hasNext()) {
                    rMoL rMoL2 = (rMoL)object2.next();
                    int n2 = Lqeo.kJ(rMoL2).size();
                    if (n2 >= n) continue;
                    n = n2;
                    object = Lqeo.kJ(Lqeo.kJ(rMoL2));
                }
                break block0;
            }
        }
        return (rMoL)Lqeo.kJ((feCR)o.a(this, -806470115), object);
    }

    private void IFQY(int n) {
        int n2 = 0;
        while (n2 < n) {
            rMoL rMoL2 = new rMoL((String)o.a(this, -311345650), n2);
            Lqeo.kJ(rMoL2);
            Lqeo.kJ((feCR)o.a(this, -806470115), rMoL2);
            ++n2;
        }
    }

    public gxcp Yfkr() {
        return (gxcp)((Object)o.a(this, -800702958));
    }

    public int ntkx() {
        return (Integer)o.a(this, 1039875600);
    }

    public int getThreadCount() {
        return (Integer)o.a(this, 419577371);
    }

    public Queue<mFpP> xyxr() {
        return (Queue)o.a(this, -1274003937);
    }

    public String getKey() {
        return (String)o.a(this, -311345650);
    }

    public cBEB FVgY() {
        return (cBEB)o.a(this, -717144564);
    }

    static /* synthetic */ int[] mrIy() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(-1676329461);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((gxcp[])Lqeo.kJ()).length];
        try {
            arrn[Lqeo.kJ((gxcp)o.k((int)-2042803064))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[Lqeo.kJ((gxcp)o.k((int)1437613593))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(-1676329461, arrn3);
        return arrn3;
    }

    private static Object kJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

