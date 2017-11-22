/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class yBLM {
    private vswA jbKe;
    private vswA XLUn;

    public yBLM(vswA vswA2, vswA vswA3) {
        this.jbKe = vswA2;
        this.XLUn = vswA3;
    }

    public vswA EurP() {
        return (vswA)((Object)cv.b(this, 148371652));
    }

    public vswA KgBy() {
        return (vswA)((Object)cv.b(this, 143718599));
    }

    public boolean IWSm(vswA vswA2) {
        if (yBLM.gQ(vswA2) >= yBLM.gQ((vswA)((Object)cv.b(this, 148371652)))) {
            if (yBLM.gQ(vswA2) <= yBLM.gQ((vswA)((Object)cv.b(this, 143718599)))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return yBLM.gQ(yBLM.gQ(yBLM.gQ(new StringBuilder((String)yBLM.gQ(yBLM.gQ((vswA)((Object)cv.b(this, 148371652))))), KUXS$dwji.S("\u7884\u7dc1\u5da9")), yBLM.gQ((vswA)((Object)cv.b(this, 143718599)))));
    }

    private static Object gQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

