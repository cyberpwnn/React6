/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class yIkI {
    private double ePQp;
    private int aKuV;
    private boolean KDGY;
    private double hGxw;
    private dMNe eYCP;
    private long PBUD;
    private final int id;

    public yIkI(int n) {
        this.id = n;
        this.hGxw = 0.0;
        this.ePQp = 0.0;
        this.aKuV = 0;
        this.KDGY = false;
        this.eYCP = new dMNe(20);
        this.PBUD = (Long)yy.p(291695492);
    }

    public double hGxw() {
        return (Double)yy.h(this, -1117520027);
    }

    public void ksfs(double d) {
        yy.E(this, -1117520027, d);
        yIkI.rC((dMNe)yy.h(this, -66584738), d);
    }

    public int eYCP() {
        return (Integer)yy.h(this, -1475346589);
    }

    public void yJLL(int n) {
        yy.E(this, -1475346589, n);
    }

    public boolean dMNe() {
        return (Boolean)yy.h(this, 963903332);
    }

    public void mXJp(boolean bl) {
        yy.E(this, 963903332, bl);
    }

    public double jVod() {
        return (Double)yy.h(this, -438763879);
    }

    public void yJLL(double d) {
        yy.E(this, -438763879, d);
    }

    public double wnXH() {
        return (double)yIkI.rC((dMNe)yy.h(this, -66584738));
    }

    public long getTick() {
        return (Long)yy.h(this, -473563294);
    }

    public void setTick(long l) {
        yy.E(this, -473563294, l);
    }

    public long qKCn() {
        return (Long)yy.p(291695492) - this.getTick();
    }

    public int getId() {
        return (Integer)yy.h(this, -277545321);
    }

    private static Object rC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

