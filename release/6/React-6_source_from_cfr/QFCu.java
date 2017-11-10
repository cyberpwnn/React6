/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class QFCu
implements FNTl,
hruU {
    private int id;
    private String name;
    private boolean GQgb;
    private double DrrM;
    private double IWmq;
    private double IrBO;
    private boolean completed;
    private mXJp agEX;
    private mXJp ymJE;
    protected int bXed;

    public QFCu(String string) {
        this.SnBs(string, false);
        QFCu.kO((mXJp)yy.h(this, 1058342465));
        this.id = QFCu.kO(QFCu.kO(), false, new QFCu$1(this));
    }

    public QFCu(String string, int n) {
        this.SnBs(string, true);
        QFCu.kO((mXJp)yy.h(this, 1058342465));
        this.id = QFCu.kO(QFCu.kO(), false, n, new QFCu$2(this));
    }

    public QFCu(String string, int n, int n2) {
        this.SnBs(string, true);
        QFCu.kO((mXJp)yy.h(this, 1058342465));
        this.id = QFCu.kO(QFCu.kO(), false, n, new QFCu$3(this, n2));
    }

    private void SnBs(String string, boolean bl) {
        yy.E(this, 1058342465, new mXJp());
        yy.E(this, 1297679936, new mXJp());
        yy.E(this, -1538980459, bl);
        yy.E(this, -230095474, string);
        yy.E(this, 1903691155, false);
        yy.E(this, 1181681044, 0.0);
        yy.E(this, 1554580873, 0.0);
        yy.E(this, -203946606, 0.0);
        yy.E(this, 456132215, 0);
    }

    @Override
    public void cancel() {
        QFCu.kO(QFCu.kO(), (Integer)yy.h(this, 578225543));
        yy.E(this, 1903691155, true);
        QFCu.kO((mXJp)yy.h(this, 1058342465));
        QFCu qFCu = this;
        yy.E(qFCu, 1554580873, (Double)yy.h(qFCu, 1554580873) + QFCu.kO((mXJp)yy.h(this, 1058342465)));
        QFCu.kO((mXJp)yy.h(this, 1058342465));
        QFCu.kO((mXJp)yy.h(this, 1297679936));
    }

    @Override
    public int getId() {
        return (Integer)yy.h(this, 578225543);
    }

    @Override
    public boolean dgLy() {
        return (Boolean)yy.h(this, -1538980459);
    }

    @Override
    public String getName() {
        return (String)yy.h(this, -230095474);
    }

    @Override
    public double yBDs() {
        return (Double)yy.h(this, 1181681044);
    }

    @Override
    public boolean tBtv() {
        return (Boolean)yy.h(this, 1903691155);
    }

    @Override
    public double Xchh() {
        return (Double)yy.h(this, -203946606);
    }

    @Override
    public double fvDH() {
        return (Double)yy.h(this, 1554580873);
    }

    static /* synthetic */ mXJp mXJp(QFCu qFCu) {
        return (mXJp)yy.h(qFCu, 1297679936);
    }

    static /* synthetic */ void mXJp(QFCu qFCu, boolean bl) {
        yy.E(qFCu, 1903691155, bl);
    }

    static /* synthetic */ mXJp ksfs(QFCu qFCu) {
        return (mXJp)yy.h(qFCu, 1058342465);
    }

    static /* synthetic */ void mXJp(QFCu qFCu, double d) {
        yy.E(qFCu, 1554580873, d);
    }

    static /* synthetic */ void ksfs(QFCu qFCu, double d) {
        yy.E(qFCu, 1181681044, d);
    }

    static /* synthetic */ double yJLL(QFCu qFCu) {
        return (Double)yy.h(qFCu, 1554580873);
    }

    static /* synthetic */ void yJLL(QFCu qFCu, double d) {
        yy.E(qFCu, -203946606, d);
    }

    static /* synthetic */ double SnBs(QFCu qFCu) {
        return (Double)yy.h(qFCu, -203946606);
    }

    static /* synthetic */ double qdWJ(QFCu qFCu) {
        return (Double)yy.h(qFCu, 1181681044);
    }

    private static Object kO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

