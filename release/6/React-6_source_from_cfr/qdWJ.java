/*
 * Decompiled with CFR 0_123.
 */
import java.io.PrintStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class qdWJ
extends Thread {
    private Queue<yJLL> Ralc = new ConcurrentLinkedQueue<yJLL>();
    private yIkI qArm;

    public qdWJ(String string, int n) {
        this.qArm = new yIkI(n);
        this.setPriority(10);
        this.setName((String)qdWJ.VE(qdWJ.VE(qdWJ.VE(qdWJ.VE(new StringBuilder(NVIs$JbpD.H("\u1e1d\ue863\u639f\uddfc\u68b8\uffe4")), string), NVIs$JbpD.H("\u1e6e")), n)));
    }

    @Override
    public void run() {
        while (!qdWJ.interrupted()) {
            try {
                Object object = 0.0;
                double d = 0.0;
                Object object2 = 0.0;
                Object object3 = qdWJ.VE();
                qdWJ.VE((yIkI)yy.h(this, -510460281), true);
                qdWJ.VE((yIkI)yy.h(this, -510460281), ((Queue)yy.h(this, 1582825117)).size());
                this.execute();
                object = (Object)(qdWJ.VE() - object3) / 1000000.0;
                d = 50.0 - object < 0.0 ? 0.0 : 50.0 - object;
                object2 = object + d;
                qdWJ.VE((yIkI)yy.h(this, -510460281), false);
                this.mXJp(d);
                qdWJ.VE((yIkI)yy.h(this, -510460281), 20.0 - (1.0 - 50.0 / object2) * 20.0);
                qdWJ.VE((yIkI)yy.h(this, -510460281), qdWJ.VE((yIkI)yy.h(this, -510460281)) < 0.0 ? 0.0 : (Object)qdWJ.VE((yIkI)yy.h(this, -510460281)));
                qdWJ.VE((yIkI)yy.h(this, -510460281), 1.0 - qdWJ.VE((yIkI)yy.h(this, -510460281)) / 20.0);
                qdWJ.VE((yIkI)yy.h(this, -510460281), qdWJ.VE((yIkI)yy.h(this, -510460281)) + 1);
            }
            catch (InterruptedException interruptedException) {
                qdWJ.VE((PrintStream)yy.p(-1742338412), qdWJ.VE(qdWJ.VE(new StringBuilder(KDGY$JAHk.Y("\u59b9\ufeec\u482f\u8e3d\u1fa1\u3b94\u1a94\u3eff\ube74\u02ec\u6023\ucc0e\u2739\ua6b0")), this.getName())));
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                qdWJ.VE(exception);
            }
        }
    }

    private void mXJp(double d) throws InterruptedException {
        if (qdWJ.VE((yIkI)yy.h(this, -510460281)) >= (Long)yy.p(291695492)) {
            qdWJ.VE((long)d);
        }
    }

    private void yJLL(yJLL yJLL2) {
        try {
            qdWJ.VE(yJLL2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            qdWJ.VE(exception);
            return;
        }
    }

    private void execute() {
        while (!((Queue)yy.h(this, 1582825117)).isEmpty()) {
            if (qdWJ.interrupted()) {
                qdWJ.VE((PrintStream)yy.p(-1742338412), qdWJ.VE(qdWJ.VE(qdWJ.VE(new StringBuilder(NVIs$JbpD.H("\u74c5\u0e01\u6d3d\u35be\u27ee\u261f\u6e16\u4a7c\uc226\u3696\u322f\u5628\u7ebc\u2f58\ufbaa\udf24")), qdWJ.VE((yIkI)yy.h(this, -510460281))), NVIs$JbpD.H("\u74b5\u0e29\u6d21\u35ab\u27e7\u2601\u6e01\u4a65\uc276\u36b6\u3222\u563e\u7ef9\u2f54\ufba7\udf60\u50a6\u5658\u924a\u1295\u7ae2\u72eb\u6d24\u45cf\ud817\u9d78"))));
                return;
            }
            this.yJLL((yJLL)((Queue)yy.h(this, 1582825117)).poll());
        }
    }

    public void ksfs(yJLL yJLL2) {
        ((Queue)yy.h(this, 1582825117)).offer(yJLL2);
    }

    public Queue<yJLL> aKuV() {
        return (Queue)yy.h(this, 1582825117);
    }

    public yIkI KDGY() {
        return (yIkI)yy.h(this, -510460281);
    }

    private static Object VE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

