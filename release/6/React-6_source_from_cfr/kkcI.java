/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class kkcI
implements UtUW {
    @Override
    public void ssNb(QFEs qFEs, File file) {
        try {
            kkcI.bu(kkcI.bu(qFEs), file);
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            kkcI.bu(iOException);
            return;
        }
    }

    private static Object bu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

