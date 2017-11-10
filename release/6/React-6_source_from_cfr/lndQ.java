/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class lndQ {
    private int number = 0;
    private int max;

    public lndQ(int n) {
        this.max = n;
    }

    public lndQ ePUd(int n) {
        yy.E(this, 1414857956, n);
        this.KUXe();
        return this;
    }

    public lndQ TEsR(int n) {
        lndQ lndQ2 = this;
        yy.E(lndQ2, 1414857956, (Integer)yy.h(lndQ2, 1414857956) + n);
        this.KUXe();
        return this;
    }

    public lndQ Ynto(int n) {
        lndQ lndQ2 = this;
        yy.E(lndQ2, 1414857956, (Integer)yy.h(lndQ2, 1414857956) - n);
        this.KUXe();
        return this;
    }

    public int get() {
        return (Integer)yy.h(this, 1414857956);
    }

    public void KUXe() {
        if ((Integer)yy.h(this, 1414857956) < 0) {
            yy.E(this, 1414857956, (Integer)yy.h(this, -468973543) - (Object)(lndQ.Ms((Integer)yy.h(this, 1414857956)) > (Integer)yy.h(this, -468973543) ? ((Integer)yy.h(this, -468973543)).intValue() : (Object)lndQ.Ms((Integer)yy.h(this, 1414857956))));
        }
        lndQ lndQ2 = this;
        yy.E(lndQ2, 1414857956, (Integer)yy.h(lndQ2, 1414857956) % (Integer)yy.h(this, -468973543));
    }

    public int getMax() {
        return (Integer)yy.h(this, -468973543);
    }

    public void uFRK(int n) {
        yy.E(this, -468973543, n);
        this.KUXe();
    }

    private static Object Ms(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

