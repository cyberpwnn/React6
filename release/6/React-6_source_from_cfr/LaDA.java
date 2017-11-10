/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class LaDA
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(KDGY$JAHk.Y("\ueaf8\u378f\ud085\u0542\u2bdb"));
        this.setDescription(KDGY$JAHk.Y("\ueaf8\u3789\ud09d\u0546\u2bc4\u7644\u7ca2\ua42f\u687d\u898f\u802e"));
        this.setID((String)LaDA.HY((qSYN)((Object)yy.p(-595392644))));
        this.setValue(0.0);
        this.mXJp((ydHl)((Object)yy.p(-1388378419)), (ydHl)((Object)yy.p(-1388378419)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)LaDA.HY(this.JAHk()));
    }

    @Override
    public String get() {
        return LaDA.HY(LaDA.HY(new StringBuilder(KDGY$JAHk.Y("\ufed4")), LaDA.HY((int)this.getValue())));
    }

    private static Object HY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

