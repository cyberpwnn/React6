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

public class jErH
extends mhmm {
    public jErH() {
        super(new StringWriter());
    }

    public String toString() {
        if (((Character)yy.h(this, -552272042)).charValue() == 'd') {
            return jErH.dm((Writer)yy.h(this, 1040908123));
        }
        return null;
    }

    private static Object dm(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

