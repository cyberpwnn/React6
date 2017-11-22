/*
 * Decompiled with CFR 0_123.
 */
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class lCky
extends EucK {
    public lCky() {
        super(new StringWriter());
    }

    public String toString() {
        if (((Character)cv.b(this, -349570651)).charValue() == 'd') {
            return lCky.js((Writer)cv.b(this, -1200686684));
        }
        return null;
    }

    private static Object js(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

