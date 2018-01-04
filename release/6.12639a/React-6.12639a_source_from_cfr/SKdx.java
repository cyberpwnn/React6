/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SKdx {
    public static <T> T yJLS(Object object, Class<T> class_) {
        Field[] arrfield = (Field[])SKdx.Cf(SKdx.Cf(object));
        int n = arrfield.length;
        int n2 = 0;
        while (n2 < n) {
            Field field = arrfield[n2];
            if (SKdx.Cf(class_, SKdx.Cf(field)) != false) {
                return SKdx.yJLS(object, field, class_);
            }
            ++n2;
        }
        return null;
    }

    public static <T> T yJLS(Object object, String string, Class<T> class_) {
        return SKdx.yJLS(object, SKdx.Cf(object), string, class_);
    }

    public static <T> T yJLS(Object object, Class<?> class_, String string, Class<T> class_2) {
        Field[] arrfield = (Field[])SKdx.Cf(class_);
        int n = arrfield.length;
        int n2 = 0;
        while (n2 < n) {
            Field field = arrfield[n2];
            if (SKdx.Cf(string, SKdx.Cf(field)) != false) {
                return SKdx.yJLS(object, field, class_2);
            }
            ++n2;
        }
        throw new IllegalArgumentException((String)SKdx.Cf(SKdx.Cf(new StringBuilder(mrFx$WjFM.d("\ua42b\ua633\u29da\udb1e\ubdc0\uca6a\ue858\ucb85\ub202\u2b6f")), string)));
    }

    public static void yJLS(Field field) {
        try {
            SKdx.Cf(field, true);
            Object object = SKdx.Cf(Field.class, FMkR$WjFM.a("\u64be\ufc0f\uf7fd\ub8a1\ufc4b\u322f\u27b5\u520f\ud376"));
            SKdx.Cf(object, true);
            SKdx.Cf(object, field, SKdx.Cf(field) & -17);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            IllegalAccessException illegalAccessException2 = illegalAccessException;
            SKdx.Cf(illegalAccessException);
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            NoSuchFieldException noSuchFieldException2 = noSuchFieldException;
            SKdx.Cf(noSuchFieldException);
            return;
        }
    }

    public static void yJLS(String string, Class<?> class_, Object object) {
        try {
            Object object2 = SKdx.Cf(class_, string);
            SKdx.yJLS((Field)object2);
            SKdx.Cf(object2, null, object);
            return;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            ReflectiveOperationException reflectiveOperationException2 = reflectiveOperationException;
            SKdx.Cf(reflectiveOperationException);
            return;
        }
    }

    public static <T> T yJLS(Object object, Field field, Class<T> class_) {
        try {
            SKdx.Cf(field, true);
            return (T)SKdx.Cf(class_, SKdx.Cf(field, object));
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            ReflectiveOperationException reflectiveOperationException2 = reflectiveOperationException;
            SKdx.Cf(reflectiveOperationException);
            return null;
        }
    }

    private static Object Cf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

