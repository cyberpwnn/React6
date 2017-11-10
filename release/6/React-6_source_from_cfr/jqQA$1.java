/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.util.Vector;

class jqQA$1
extends ePQp<Vector, Vector> {
    private final /* synthetic */ Vector stqH;

    jqQA$1(Vector vector) {
        this.stqH = vector;
    }

    public Vector gUxV(Vector vector) {
        return jqQA$1.GE(vector, (Vector)yy.h(this, -513867344));
    }

    @Override
    public /* synthetic */ Object ksfs(Object object) {
        return this.gUxV((Vector)object);
    }

    private static Object GE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

