/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class vtKx
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(KDGY$JAHk.Y("\u02b9\ua144\u69c3\u59db\u9c4d\u13b0\ued92\u6ce0\u22c8\u7428\u96ff"));
        this.setDescription(KDGY$JAHk.Y("\u02a1\ua152\u69cb\u59d0\u9c1f\u1384\uedd7\u6cee\u22d2\u7428\u96f4\u1ea7\u03d6\ud91b\ude09\ub484\u821b\u1d69\uf43d\u60aa\uf124"));
        this.setID((String)vtKx.Aq((qSYN)((Object)yy.p(-1501100200))));
        this.setValue(1.0);
        this.mXJp((ydHl)((Object)yy.p(-278730615)), (ydHl)((Object)yy.p(-278730615)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)vtKx.Aq(this.JAHk()));
    }

    @Override
    public String get() {
        return vtKx.Aq((long)this.getValue());
    }

    private static Object Aq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

