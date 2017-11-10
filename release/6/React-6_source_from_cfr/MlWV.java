/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class MlWV
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(BkvY$LhxG.I("\u50b7\u25a9\uc4b6\u860e\u2d18\u98a5\u69a5\u988d\u586e\u9020\uace0\u0e86\u95a4\ua32e\u4c73\udf3d"));
        this.setDescription(BkvY$LhxG.I("\u50b7\u25a9\uc4b6\u860e\u2d18\u98a5\u69a5\u988d\u586e\u9020\uace0\u0e86\u95a4\ua32e\u4c73\udf3d"));
        this.setID((String)MlWV.hb((qSYN)((Object)yy.p(789907242))));
        this.setValue(1.0);
        this.mXJp((ydHl)((Object)yy.p(-278730615)), (ydHl)((Object)yy.p(-278730615)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)MlWV.hb(this.JAHk()));
    }

    @Override
    public String get() {
        return MlWV.hb((long)this.getValue());
    }

    private static Object hb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

