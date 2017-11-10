/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class qllW
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(NVIs$JbpD.H("\u97ee\uaf96\u2a2f\u5e5f\uabe2\u9da0"));
        this.setDescription(NVIs$JbpD.H("\u97f9\uaf91\u2a2e\u5e50\uabe5\u9df3\u3f32\u6294\u8c14\ua49f\u66b1\u3338\uf0c8\u029c\u75bf\u717b\u85ae\u8031\u485f"));
        this.setID((String)qllW.xo((qSYN)((Object)yy.p(-1433401490))));
        this.setValue(1.0);
        this.mXJp((ydHl)((Object)yy.p(-329382161)), (ydHl)((Object)yy.p(-329382161)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)qllW.xo(this.JAHk()));
    }

    @Override
    public String get() {
        return qllW.xo(qllW.xo(qllW.xo(new StringBuilder(), qllW.xo((int)this.getValue())), NVIs$JbpD.H("\u5531")));
    }

    private static Object xo(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

