/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class biSA
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(KDGY$JAHk.Y("\u07e1\u6e4a\u25b1\u6851\u275f\u54b7\u7732\u9391\u33e2\ud6ca\ufadd\ua740\uc5b4\uc6d3\ucc8c\ua74e\u6c32\udf68\u4a53\u80dd\ue68a\u2895\ub877\u9e4e\ue2c1\u6b2a\ua918"));
        this.setDescription(KDGY$JAHk.Y("\u07e1\u6e4a\u25b1\u6851\u275f\u54b7\u7732\u9391\u33e2\ud6ca\ufadd\ua740\uc5b4\uc6d3\ucc8c\ua74e\u6c32\udf68\u4a53\u80dd\ue68a\u2895\ub877\u9e4e\ue2c1\u6b2a\ua918"));
        this.setID((String)biSA.jN((qSYN)((Object)yy.p(-1485961440))));
        this.setValue(1.0);
        this.mXJp((ydHl)((Object)yy.p(-278730615)), (ydHl)((Object)yy.p(-278730615)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)biSA.jN(this.JAHk()));
    }

    @Override
    public String get() {
        return biSA.jN(biSA.jN(new StringBuilder(NVIs$JbpD.H("\uc75a\u2f3d")), biSA.jN((long)this.getValue())));
    }

    private static Object jN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

