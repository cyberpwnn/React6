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

public class rMoL
extends Thread {
    private Queue<mFpP> FiGV = new ConcurrentLinkedQueue<mFpP>();
    private cBEB gXBs;

    public rMoL(String string, int n) {
        this.gXBs = new cBEB(n);
        this.setPriority(1);
        this.setName((String)rMoL.Yu(rMoL.Yu(rMoL.Yu(rMoL.Yu(new StringBuilder(nJPf$sILv.G("\uf8c8\u0c7c\u0d87\u9577\u96d4\u9b28")), string), nJPf$sILv.G("\uf8bb")), n)));
    }

    @Override
    public void run() {
        while (!rMoL.interrupted()) {
            try {
                Object object = 0.0;
                double d = 0.0;
                Object object2 = 0.0;
                Object object3 = rMoL.Yu();
                rMoL.Yu((cBEB)o.a(this, 1588870680), true);
                rMoL.Yu((cBEB)o.a(this, 1588870680), ((Queue)o.a(this, 1800289814)).size());
                this.execute();
                object = (Object)(rMoL.Yu() - object3) / 1000000.0;
                d = 50.0 - object < 0.0 ? 0.0 : 50.0 - object;
                object2 = object + d;
                rMoL.Yu((cBEB)o.a(this, 1588870680), false);
                this.Ipep(d);
                rMoL.Yu((cBEB)o.a(this, 1588870680), 20.0 - (1.0 - 50.0 / object2) * 20.0);
                rMoL.Yu((cBEB)o.a(this, 1588870680), rMoL.Yu((cBEB)o.a(this, 1588870680)) < 0.0 ? 0.0 : (Object)rMoL.Yu((cBEB)o.a(this, 1588870680)));
                rMoL.Yu((cBEB)o.a(this, 1588870680), 1.0 - rMoL.Yu((cBEB)o.a(this, 1588870680)) / 20.0);
                rMoL.Yu((cBEB)o.a(this, 1588870680), rMoL.Yu((cBEB)o.a(this, 1588870680)) + 1);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private void Ipep(double d) throws InterruptedException {
        if (rMoL.Yu((cBEB)o.a(this, 1588870680)) >= (Long)o.k(-619556004)) {
            rMoL.Yu((long)d);
        }
    }

    private void biLo(mFpP mFpP2) {
        try {
            rMoL.Yu(mFpP2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            rMoL.Yu(exception);
            return;
        }
    }

    private void execute() {
        while (!((Queue)o.a(this, 1800289814)).isEmpty()) {
            if (rMoL.interrupted()) {
                return;
            }
            this.biLo((mFpP)((Queue)o.a(this, 1800289814)).poll());
        }
    }

    public void UtIU(mFpP mFpP2) {
        ((Queue)o.a(this, 1800289814)).offer(mFpP2);
    }

    public Queue<mFpP> EBcM() {
        return (Queue)o.a(this, 1800289814);
    }

    public cBEB ogNr() {
        return (cBEB)o.a(this, 1588870680);
    }

    private static Object Yu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

