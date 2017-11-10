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

public abstract class SnBs {
    private JRFt yIkI;
    private PBUD<qdWJ> CVAs;
    private int qAsQ;
    private int gUxV;
    private Queue<yJLL> yIkA;
    private String key;
    private yIkI qArm;
    private static /* synthetic */ int[] Fomb;

    public void mXJp(yJLL yJLL2) {
        ((Queue)yy.h(this, -925237382)).offer(yJLL2);
    }

    public abstract long qAsQ();

    public void gUxV() {
        Object object = SnBs.CV();
        while (!((Queue)yy.h(this, -925237382)).isEmpty()) {
            SnBs.CV((yJLL)((Queue)yy.h(this, -925237382)).poll());
            reference var3_2 = SnBs.CV() - object;
            if (var3_2 > this.qAsQ()) break;
        }
    }

    public SnBs(String string, int n, JRFt jRFt) {
        this(n, jRFt);
        this.key = string;
    }

    public SnBs(int n, JRFt jRFt) {
        if (n <= 0) {
            n = 1;
        }
        if (n > 4) {
            SnBs.CV((PrintStream)yy.p(-1742338412), BkvY$LhxG.I("\uf35f\u15d6\u02a9\u3bf7\u832b\u0c78\u506d\u18b0\ua8c1\ub61a\u7778\u944d\u057a\uc26b\u7a89\u53f9\u92da\ue400\udab1\uca21\ua1f1\u1d12\ud42d\u8d77\u78a8\ufe4d\ue864\uf00a\u560f\ud32b\uf1d9\u48ce\u76a2\u9025\u5641\u3c4d\u6d19\u43ad\u0376"));
        }
        this.CVAs = new PBUD<T>();
        this.gUxV = n;
        this.qAsQ = 0;
        this.yIkI = jRFt;
        this.key = BkvY$LhxG.I("\uf35f\u15f8\u0289\u3bd2\u8307\u0c44\u500a\u18de\ua889\ub620\u7754\u946b\u0556");
        this.qArm = new yIkI(-1);
        this.yIkA = new ConcurrentLinkedQueue<yJLL>();
    }

    public long yIkA() {
        Object object = SnBs.CV();
        while (this.qArm() != 0) {
            try {
                SnBs.CV(1);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return (long)(SnBs.CV() - object);
    }

    public void start() {
        this.ksfs((Integer)yy.h(this, 1893400389));
    }

    public void shutdown() {
        Object object = SnBs.CV((PBUD)yy.h(this, 169475902));
        while (object.hasNext()) {
            qdWJ qdWJ2 = (qdWJ)object.next();
            SnBs.CV(qdWJ2);
        }
    }

    public SnBs(int n) {
        this(n, (JRFt)((Object)yy.p(-181213024)));
    }

    public void ksfs(yJLL yJLL2) {
        SnBs.CV(this.SnAm(), yJLL2);
    }

    public int getSize() {
        return (int)SnBs.CV((PBUD)yy.h(this, 169475902));
    }

    public int qArm() {
        int n = 0;
        qdWJ[] arrqdWJ = this.Fomb();
        int n2 = arrqdWJ.length;
        int n3 = 0;
        while (n3 < n2) {
            qdWJ qdWJ2 = arrqdWJ[n3];
            n += SnBs.CV(qdWJ2).size();
            ++n3;
        }
        return n;
    }

    public qdWJ[] Fomb() {
        return (qdWJ[])((Object[])SnBs.CV((PBUD)yy.h(this, 169475902), new qdWJ[SnBs.CV((PBUD)yy.h(this, 169475902))]));
    }

    private void Ralc() {
        try {
            if (SnBs.CV((PBUD)yy.h(this, 169475902)) != false) {
                return;
            }
            double d = 0.0;
            int n = 0;
            double d2 = 0.0;
            Object object = SnBs.CV(SnBs.CV((PBUD)yy.h(this, 169475902)));
            while (object.hasNext()) {
                qdWJ qdWJ2 = (qdWJ)object.next();
                d += SnBs.CV(SnBs.CV(qdWJ2));
                n += SnBs.CV(qdWJ2).size();
                d2 += SnBs.CV(SnBs.CV(qdWJ2));
            }
            SnBs.CV(this.PBUD(), d /= (Object)SnBs.CV((PBUD)yy.h(this, 169475902)));
            SnBs.CV(this.PBUD(), n);
            SnBs.CV(this.PBUD(), d2 /= (Object)SnBs.CV((PBUD)yy.h(this, 169475902)));
            return;
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            return;
        }
    }

    private qdWJ SnAm() {
        this.Ralc();
        if (SnBs.CV((PBUD)yy.h(this, 169475902)) == true) {
            return (qdWJ)SnBs.CV((PBUD)yy.h(this, 169475902), false);
        }
        Object object = 0;
        switch (SnBs.ePQp()[SnBs.CV((JRFt)((Object)yy.h(this, -1808203956)))]) {
            case 1: {
                yy.E(this, -271384758, (Integer)yy.h(this, -271384758) > SnBs.CV((PBUD)yy.h(this, 169475902)) - true ? 0 : (Integer)yy.h(this, -271384758) + 1);
                object = (Integer)yy.h(this, -271384758);
            }
            case 2: {
                int n = Integer.MAX_VALUE;
                Object object2 = SnBs.CV((PBUD)yy.h(this, 169475902));
                while (object2.hasNext()) {
                    qdWJ qdWJ2 = (qdWJ)object2.next();
                    int n2 = SnBs.CV(qdWJ2).size();
                    if (n2 >= n) continue;
                    n = n2;
                    object = SnBs.CV(SnBs.CV(qdWJ2));
                }
                break block0;
            }
        }
        return (qdWJ)SnBs.CV((PBUD)yy.h(this, 169475902), object);
    }

    private void ksfs(int n) {
        int n2 = 0;
        while (n2 < n) {
            qdWJ qdWJ2 = new qdWJ((String)yy.h(this, -1061159104), n2);
            SnBs.CV(qdWJ2);
            SnBs.CV((PBUD)yy.h(this, 169475902), qdWJ2);
            ++n2;
        }
    }

    public JRFt SBla() {
        return (JRFt)((Object)yy.h(this, -1808203956));
    }

    public int gois() {
        return (Integer)yy.h(this, -271384758);
    }

    public int getThreadCount() {
        return (Integer)yy.h(this, 1893400389);
    }

    public Queue<yJLL> JjvV() {
        return (Queue)yy.h(this, -925237382);
    }

    public String getKey() {
        return (String)yy.h(this, -1061159104);
    }

    public yIkI PBUD() {
        return (yIkI)yy.h(this, 546504334);
    }

    static /* synthetic */ int[] ePQp() {
        int[] arrn;
        int[] arrn2 = (int[])yy.p(-1757479277);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((JRFt[])SnBs.CV()).length];
        try {
            arrn[SnBs.CV((JRFt)yy.p((int)-181213024))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[SnBs.CV((JRFt)yy.p((int)-1315176823))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        yy.K(-1757479277, arrn3);
        return arrn3;
    }

    private static Object CV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

