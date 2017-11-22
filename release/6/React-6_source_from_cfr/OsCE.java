/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class OsCE {
    private QyID fLFU;
    private String[] eIBs;
    private String gFXK;

    public /* varargs */ OsCE(QyID qyID, String ... arrstring) {
        this.eIBs = arrstring;
        this.fLFU = qyID;
        this.gFXK = OsCE.aF(qyID, OsCE.aF(qyID), arrstring);
    }

    public String toString() {
        return (String)cv.b(this, 65532795);
    }

    public QyID QFEs() {
        return (QyID)((Object)cv.b(this, -1437076614));
    }

    public String[] YEMO() {
        return (String[])cv.b(this, -643697819);
    }

    public String BAjC() {
        return (String)cv.b(this, 65532795);
    }

    private static Object aF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

