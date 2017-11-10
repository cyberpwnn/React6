/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class wTnx {
    public static String uFRK(String string) {
        Object object = "";
        object = wTnx.jC(wTnx.jC(new StringBuilder((String)wTnx.jC(object)), wTnx.jC(wTnx.jC())));
        object = wTnx.jC(object, BkvY$LhxG.I("\u269f"), wTnx.jC(wTnx.jC(new StringBuilder(BkvY$LhxG.I("\u26d6\uccdf\ufdda")), string)));
        return object;
    }

    private static Object jC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

