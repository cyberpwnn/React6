/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class OikN$1 {
    static final /* synthetic */ int[] Vnoo;

    static {
        cv.V(-797241238, new int[((OikN[])OikN$1.Fq()).length]);
        try {
            ((int[])cv.e((int)-797241238))[OikN$1.Fq((OikN)cv.e((int)-428666795))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ((int[])cv.e((int)-797241238))[OikN$1.Fq((OikN)cv.e((int)979963991))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ((int[])cv.e((int)-797241238))[OikN$1.Fq((OikN)cv.e((int)-1014689706))] = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }

    private static Object Fq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

