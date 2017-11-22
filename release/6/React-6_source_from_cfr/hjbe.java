/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class hjbe
extends Thread {
    private Queue<dMUO> Daqe = new ConcurrentLinkedQueue<dMUO>();
    private Pubc vkqV;

    public hjbe(String string, int n) {
        this.vkqV = new Pubc(n);
        this.setPriority(1);
        this.setName((String)hjbe.Xo(hjbe.Xo(hjbe.Xo(hjbe.Xo(new StringBuilder(rgig$AWxc.r("\ufe45\u4e67\ub8db\ud523\u7a7f\u4d47")), string), rgig$AWxc.r("\ufe36")), n)));
    }

    @Override
    public void run() {
        while (!hjbe.interrupted()) {
            try {
                Object object = 0.0;
                double d = 0.0;
                Object object2 = 0.0;
                Object object3 = hjbe.Xo();
                hjbe.Xo((Pubc)cv.b(this, -1565591111), true);
                hjbe.Xo((Pubc)cv.b(this, -1565591111), ((Queue)cv.b(this, 294451579)).size());
                this.execute();
                object = (Object)(hjbe.Xo() - object3) / 1000000.0;
                d = 50.0 - object < 0.0 ? 0.0 : 50.0 - object;
                object2 = object + d;
                hjbe.Xo((Pubc)cv.b(this, -1565591111), false);
                this.vtFs(d);
                hjbe.Xo((Pubc)cv.b(this, -1565591111), 20.0 - (1.0 - 50.0 / object2) * 20.0);
                hjbe.Xo((Pubc)cv.b(this, -1565591111), hjbe.Xo((Pubc)cv.b(this, -1565591111)) < 0.0 ? 0.0 : (Object)hjbe.Xo((Pubc)cv.b(this, -1565591111)));
                hjbe.Xo((Pubc)cv.b(this, -1565591111), 1.0 - hjbe.Xo((Pubc)cv.b(this, -1565591111)) / 20.0);
                hjbe.Xo((Pubc)cv.b(this, -1565591111), hjbe.Xo((Pubc)cv.b(this, -1565591111)) + 1);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private void vtFs(double d) throws InterruptedException {
        if (hjbe.Xo((Pubc)cv.b(this, -1565591111)) >= (Long)cv.e(871764466)) {
            hjbe.Xo((long)d);
        }
    }

    private void IWSm(dMUO dMUO2) {
        try {
            hjbe.Xo(dMUO2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            hjbe.Xo(exception);
            return;
        }
    }

    private void execute() {
        while (!((Queue)cv.b(this, 294451579)).isEmpty()) {
            if (hjbe.interrupted()) {
                return;
            }
            this.IWSm((dMUO)((Queue)cv.b(this, 294451579)).poll());
        }
    }

    public void DYFV(dMUO dMUO2) {
        ((Queue)cv.b(this, 294451579)).offer(dMUO2);
    }

    public Queue<dMUO> HdyI() {
        return (Queue)cv.b(this, 294451579);
    }

    public Pubc TOKE() {
        return (Pubc)cv.b(this, -1565591111);
    }

    private static Object Xo(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

