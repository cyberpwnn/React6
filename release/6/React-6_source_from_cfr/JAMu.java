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

public class JAMu
implements oUhC {
    @Override
    public void mXJp(JbpD jbpD, File file) {
        try {
            JAMu.uH(JAMu.uH(jbpD), file);
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            JAMu.uH(iOException);
            return;
        }
    }

    private static Object uH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

