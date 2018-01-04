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

public class klJY
implements NDol {
    @Override
    public void yJLS(Mtpq mtpq, File file) {
        try {
            klJY.Cl(klJY.Cl(mtpq), file);
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            klJY.Cl(iOException);
            return;
        }
    }

    private static Object Cl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

