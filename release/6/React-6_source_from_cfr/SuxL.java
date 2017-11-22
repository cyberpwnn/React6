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

public abstract class SuxL {
    private hjbh UlQL;
    private wfPa<hjbe> FFRq;
    private int VDcA;
    private int lwep;
    private Queue<dMUO> vdBG;
    private String key;
    private Pubc vkqV;
    private static /* synthetic */ int[] VUcj;

    public void ssNb(dMUO dMUO2) {
        ((Queue)cv.b(this, -195036736)).offer(dMUO2);
    }

    public abstract long FNTA();

    public void aUPw() {
        Object object = SuxL.fx();
        int n = 0;
        int n2 = ((Queue)cv.b(this, -195036736)).size();
        while (!((Queue)cv.b(this, -195036736)).isEmpty()) {
            ++n;
            SuxL.fx((dMUO)((Queue)cv.b(this, -195036736)).poll());
            reference var5_4 = SuxL.fx() - object;
            if (var5_4 > this.FNTA()) break;
        }
        if (n >= n2) {
            ((Queue)cv.b(this, -195036736)).clear();
        }
    }

    public SuxL(String string, int n, hjbh hjbh2) {
        this(n, hjbh2);
        this.key = string;
    }

    public SuxL(int n, hjbh hjbh2) {
        if (n <= 0) {
            n = 1;
        }
        if (n > 4) {
            SuxL.fx((PrintStream)cv.e(363401407), KUXS$dwji.S("\u2564\ue15a\u71f8\ue462\ue76e\u7610\u062f\u7b2b\u78f5\u11ee\u542a\ud94d\u4ae8\ufc62\u2248\u5ed1\ua3e6\ue2ac\u9538\ua557\u734a\u154a\ua55f\ucf00\ube30\u1b95\uc2a3\u5fd3\ud92d\u6670\uf07c\u5186\u3939\u2cd7\u07de\u596c\ucf89\ub567\u424b"));
        }
        this.FFRq = new wfPa<T>();
        this.lwep = n;
        this.VDcA = 0;
        this.UlQL = hjbh2;
        this.key = KUXS$dwji.S("\u2564\ue174\u71d8\ue447\ue742\u762c\u0648\u7b45\u78bd\u11d4\u5406\ud96b\u4ac4");
        this.vkqV = new Pubc(-1);
        this.vdBG = new ConcurrentLinkedQueue<dMUO>();
    }

    public long wfPa() {
        Object object = SuxL.fx();
        while (this.EvEN() > 0) {
            try {
                SuxL.fx(1);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return (long)(SuxL.fx() - object);
    }

    public int EvEN() {
        int n = this.ktOu();
        Object object = SuxL.fx((wfPa)cv.b(this, -2079983166));
        while (object.hasNext()) {
            hjbe hjbe2 = (hjbe)object.next();
            n += SuxL.fx(hjbe2).size();
        }
        return n;
    }

    public void start() {
        this.rwyd((Integer)cv.b(this, 732232140));
    }

    public void shutdown() {
        Object object = SuxL.fx((wfPa)cv.b(this, -2079983166));
        while (object.hasNext()) {
            hjbe hjbe2 = (hjbe)object.next();
            SuxL.fx(hjbe2);
        }
    }

    public SuxL(int n) {
        this(n, (hjbh)((Object)cv.e(-1841761742)));
    }

    public void DYFV(dMUO dMUO2) {
        SuxL.fx(this.Iplh(), dMUO2);
    }

    public int getSize() {
        return (int)SuxL.fx((wfPa)cv.b(this, -2079983166));
    }

    public int ktOu() {
        int n = 0;
        hjbe[] arrhjbe = this.FNSj();
        int n2 = arrhjbe.length;
        int n3 = 0;
        while (n3 < n2) {
            hjbe hjbe2 = arrhjbe[n3];
            n += SuxL.fx(hjbe2).size();
            ++n3;
        }
        return n;
    }

    public hjbe[] FNSj() {
        return (hjbe[])((Object[])SuxL.fx((wfPa)cv.b(this, -2079983166), new hjbe[SuxL.fx((wfPa)cv.b(this, -2079983166))]));
    }

    private void QyFw() {
        try {
            if (SuxL.fx((wfPa)cv.b(this, -2079983166)) != false) {
                return;
            }
            double d = 0.0;
            int n = 0;
            double d2 = 0.0;
            Object object = SuxL.fx(SuxL.fx((wfPa)cv.b(this, -2079983166)));
            while (object.hasNext()) {
                hjbe hjbe2 = (hjbe)object.next();
                d += SuxL.fx(SuxL.fx(hjbe2));
                n += SuxL.fx(hjbe2).size();
                d2 += SuxL.fx(SuxL.fx(hjbe2));
            }
            SuxL.fx(this.VUOs(), d /= (Object)SuxL.fx((wfPa)cv.b(this, -2079983166)));
            SuxL.fx(this.VUOs(), n);
            SuxL.fx(this.VUOs(), d2 /= (Object)SuxL.fx((wfPa)cv.b(this, -2079983166)));
            return;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            return;
        }
    }

    private hjbe Iplh() {
        this.QyFw();
        if (SuxL.fx((wfPa)cv.b(this, -2079983166)) == true) {
            return (hjbe)SuxL.fx((wfPa)cv.b(this, -2079983166), false);
        }
        Object object = 0;
        switch (SuxL.VCnE()[SuxL.fx((hjbh)((Object)cv.b(this, -622134857)))]) {
            case 1: {
                cv.e(this, 721353137, (Integer)cv.b(this, 721353137) > SuxL.fx((wfPa)cv.b(this, -2079983166)) - true ? 0 : (Integer)cv.b(this, 721353137) + 1);
                object = (Integer)cv.b(this, 721353137);
            }
            case 2: {
                int n = Integer.MAX_VALUE;
                Object object2 = SuxL.fx((wfPa)cv.b(this, -2079983166));
                while (object2.hasNext()) {
                    hjbe hjbe2 = (hjbe)object2.next();
                    int n2 = SuxL.fx(hjbe2).size();
                    if (n2 >= n) continue;
                    n = n2;
                    object = SuxL.fx(SuxL.fx(hjbe2));
                }
                break block0;
            }
        }
        return (hjbe)SuxL.fx((wfPa)cv.b(this, -2079983166), object);
    }

    private void rwyd(int n) {
        int n2 = 0;
        while (n2 < n) {
            hjbe hjbe2 = new hjbe((String)cv.b(this, -548931149), n2);
            SuxL.fx(hjbe2);
            SuxL.fx((wfPa)cv.b(this, -2079983166), hjbe2);
            ++n2;
        }
    }

    public hjbh bqeB() {
        return (hjbh)((Object)cv.b(this, -622134857));
    }

    public int BIwL() {
        return (Integer)cv.b(this, 721353137);
    }

    public int getThreadCount() {
        return (Integer)cv.b(this, 732232140);
    }

    public Queue<dMUO> KwTH() {
        return (Queue)cv.b(this, -195036736);
    }

    public String getKey() {
        return (String)cv.b(this, -548931149);
    }

    public Pubc VUOs() {
        return (Pubc)cv.b(this, -282658371);
    }

    static /* synthetic */ int[] VCnE() {
        int[] arrn;
        int[] arrn2 = (int[])cv.e(-686884420);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((hjbh[])SuxL.fx()).length];
        try {
            arrn[SuxL.fx((hjbh)cv.e((int)-1841761742))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[SuxL.fx((hjbh)cv.e((int)-324798018))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        cv.V(-686884420, arrn3);
        return arrn3;
    }

    private static Object fx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

