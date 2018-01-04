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

public class XAhy
extends GYkP {
    public XAhy() {
        super(new StringWriter());
    }

    public String toString() {
        if (((Character)o.a(this, -272023467)).charValue() == 'd') {
            return XAhy.vM((Writer)o.a(this, -1944174508));
        }
        return null;
    }

    private static Object vM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

