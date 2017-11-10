/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class bFtu {
    private YpAW lNXF;
    private YpAW XvbN;

    public bFtu(YpAW ypAW, YpAW ypAW2) {
        this.lNXF = ypAW;
        this.XvbN = ypAW2;
    }

    public YpAW BdRR() {
        return (YpAW)((Object)yy.h(this, -2127494540));
    }

    public YpAW PlyU() {
        return (YpAW)((Object)yy.h(this, -959577495));
    }

    public boolean yJLL(YpAW ypAW) {
        if (bFtu.RR(ypAW) >= bFtu.RR((YpAW)((Object)yy.h(this, -2127494540)))) {
            if (bFtu.RR(ypAW) <= bFtu.RR((YpAW)((Object)yy.h(this, -959577495)))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return bFtu.RR(bFtu.RR(bFtu.RR(new StringBuilder((String)bFtu.RR(bFtu.RR((YpAW)((Object)yy.h(this, -2127494540))))), BkvY$LhxG.I("\u3f27\u5bce\ub066")), bFtu.RR((YpAW)((Object)yy.h(this, -959577495)))));
    }

    private static Object RR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

