/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class xFjc$1 {
    static final /* synthetic */ int[] HLTG;

    static {
        yy.K(1772357273, new int[((xFjc[])xFjc$1.XT()).length]);
        try {
            ((int[])yy.p((int)1772357273))[xFjc$1.XT((xFjc)yy.p((int)936183650))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ((int[])yy.p((int)1772357273))[xFjc$1.XT((xFjc)yy.p((int)-665909608))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ((int[])yy.p((int)1772357273))[xFjc$1.XT((xFjc)yy.p((int)1640499053))] = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }

    private static Object XT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

