/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.plugin.Plugin;

public class QMsU {
    private dVMt MJoU;
    private boolean connected;
    private int HMCG;

    public QMsU(dVMt dVMt2) {
        this.MJoU = dVMt2;
        this.connected = false;
    }

    public dVMt dfmS() {
        return (dVMt)cv.b(this, 1772090571);
    }

    public boolean isConnected() {
        return (Boolean)cv.b(this, 538440906);
    }

    public void connect() {
        cv.e(this, 538440906, true);
        cv.V(2034365621, this);
        QMsU.OE(QMsU.OE(), QMsU.OE(), new QMsU$1(this));
        cv.e(this, 1124791476, this.ssNb(0, 0, new QMsU$2(this)));
    }

    private void nBHO() {
        if (!this.isConnected()) {
            this.NxGC((Integer)cv.b(this, 1124791476));
        }
        cv.V(871764466, (Long)cv.e(871764466) + 1);
        QMsU.OE();
        Object object = QMsU.OE(QMsU.OE(QMsU.OE()));
        while (object.hasNext()) {
            XSJd xSJd = (XSJd)object.next();
            xSJd.FFBA();
        }
    }

    public void disconnect() {
        cv.e(this, 538440906, false);
        this.NxGC((Integer)cv.b(this, 1124791476));
        QMsU.OE();
        QMsU.OE(QMsU.OE());
    }

    public int ssNb(int n, Runnable runnable) {
        if (this.isConnected()) {
            return QMsU.OE().scheduleSyncDelayedTask((Plugin)this.dfmS(), runnable, (long)n);
        }
        QMsU.OE(rgig$AWxc.r("\u042f\u4c61\u0dd3\u7f31\udf56\uae16\uaa76\uffcd\u3cae\u1c19\uab0d\ue7ad\u6b93\ub160\u4e2c\u519d\u3c28\u82d0\u5e17\u0b18"));
        return -1;
    }

    public int ssNb(int n, int n2, Runnable runnable) {
        if (this.isConnected()) {
            return QMsU.OE().scheduleSyncRepeatingTask((Plugin)this.dfmS(), runnable, (long)n, (long)n2);
        }
        QMsU.OE(KUXS$dwji.S("\uee14\u502c\ud9c2\uc943\u9e84\ua6a9\u42f7\udf92\u7fd5\ue499\u6843\u0fb7\ucc5a\ub14e\ue723\u8a48\uc692\u55a7\u6db1\u579d\u76d1\u52bb\u5b2e\u6343\u69c5\u8041\u065d\u33b1\u0da6\u0b6c"));
        return -1;
    }

    public void NxGC(int n) {
        QMsU.OE().cancelTask(n);
    }

    static /* synthetic */ void ssNb(QMsU qMsU) {
        qMsU.nBHO();
    }

    private static Object OE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

