/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class NgWw {
    private NgWw() {
    }

    public static /* varargs */ Constructor<?> getConstructor(Class<?> class_, Class<?> ... arrclass) throws NoSuchMethodException {
        Class[] arrclass2 = (Class[])NgWw.iy(arrclass);
        Constructor[] arrconstructor = (Constructor[])NgWw.iy(class_);
        int n = arrconstructor.length;
        int n2 = 0;
        while (n2 < n) {
            Constructor constructor = arrconstructor[n2];
            if (NgWw.iy((Class[])NgWw.iy((Class[])NgWw.iy(constructor)), arrclass2) != false) {
                return constructor;
            }
            ++n2;
        }
        throw new NoSuchMethodException(FMkR$WjFM.a("\u93af\ube3a\u0b33\u2462\ude98\u0222\u2e36\u9af3\u028d\u07f2\u1918\uf9b4\ubb9a\ucb92\u7e83\u1888\u68f3\u40c4\u1d0b\ub288\u5954\u9a64\udfdd\u34b0\ud54b\udbac\u3456\u37a3\udb34\ua60e\ua1e8\u712b\ub9da\u091f\u33ed\u3910\u6d7a\ub70e\u50da\udd3c\u6cf4\u2506\ua3fe\ufabc\u1a5e\u8025\u7ce5\u079e\u8fcb\u9f14\uc84c\ued80\u5e6b\u3e55\u669d\u0fc2\ua734\u80cb\u9196\u1595\u41b8\uaf1a\u84c6\u27ec\ubf66\u6358\u57e8\u2e51\u96f4\uc2ae\u5fcd\ueda3\uab4d\ud88c\u0641\u4ff4\u2e2c"));
    }

    public static /* varargs */ Constructor<?> yJLS(String string, NgWw$UtIU ngWw$UtIU, Class<?> ... arrclass) throws NoSuchMethodException, ClassNotFoundException {
        return NgWw.getConstructor(NgWw.iy(ngWw$UtIU, string), arrclass);
    }

    public static /* varargs */ Object yJLS(Class<?> class_, Object ... arrobject) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        return NgWw.iy(NgWw.getConstructor(class_, (Class[])NgWw.iy(arrobject)), arrobject);
    }

    public static /* varargs */ Object yJLS(String string, NgWw$UtIU ngWw$UtIU, Object ... arrobject) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        return NgWw.yJLS(NgWw.iy(ngWw$UtIU, string), arrobject);
    }

    public static /* varargs */ Method getMethod(Class<?> class_, String string, Class<?> ... arrclass) throws NoSuchMethodException {
        Class[] arrclass2 = (Class[])NgWw.iy(arrclass);
        Method[] arrmethod = (Method[])NgWw.iy(class_);
        int n = arrmethod.length;
        int n2 = 0;
        while (n2 < n) {
            Method method = arrmethod[n2];
            if (NgWw.iy(NgWw.iy(method), string) != false) {
                if (NgWw.iy((Class[])NgWw.iy((Class[])NgWw.iy(method)), arrclass2) != false) {
                    return method;
                }
            }
            ++n2;
        }
        throw new NoSuchMethodException(mrFx$WjFM.d("\ue402\uece9\u70cd\u8ba2\u1a81\u0f53\u4f5a\ue16b\uefb4\u0be2\u617c\u8b4c\ub09a\u017c\u60d5\ua88f\uff48\u1b07\u05a6\uc65b\u32bf\uaf15\u9010\u3614\u1a95\u59e2\u7976\ud592\ud4b6\u43c0\uc682\ucf9e\u86d4\u90e4\u68ff\ua72e\ucf01\uf11b\u8bf8\uc1b3\uf87b\ua3f0\u0e6b\u73c5\u22c8\uc37c\u3a20\u010a\u2cf2\u9043\u3f92\ubd36\u04bf\ucdf2\uc043\u3ac9\ucc30\ud9a1\u0a79\u86f2\ua54f\ufda7\u59da\udfd4\ue068\u66f1\u5132\u8132\u32b7\u14e7\u8892\ue763\ud5fc\ufbad\u0edb\u2806\u26d0\ud649\u7f23\ubce2\u535d"));
    }

    public static /* varargs */ Method yJLS(String string, NgWw$UtIU ngWw$UtIU, String string2, Class<?> ... arrclass) throws NoSuchMethodException, ClassNotFoundException {
        return NgWw.getMethod(NgWw.iy(ngWw$UtIU, string), string2, arrclass);
    }

    public static /* varargs */ Object invokeMethod(Object object, String string, Object ... arrobject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        return NgWw.iy(NgWw.getMethod(NgWw.iy(object), string, (Class[])NgWw.iy(arrobject)), object, arrobject);
    }

    public static /* varargs */ Object yJLS(Object object, Class<?> class_, String string, Object ... arrobject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        return NgWw.iy(NgWw.getMethod(class_, string, (Class[])NgWw.iy(arrobject)), object, arrobject);
    }

    public static /* varargs */ Object yJLS(Object object, String string, NgWw$UtIU ngWw$UtIU, String string2, Object ... arrobject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        return NgWw.yJLS(object, NgWw.iy(ngWw$UtIU, string), string2, arrobject);
    }

    public static Field yJLS(Class<?> class_, boolean bl, String string) throws NoSuchFieldException, SecurityException {
        Object object = bl ? NgWw.iy(class_, string) : NgWw.iy(class_, string);
        NgWw.iy(object, true);
        return object;
    }

    public static Field yJLS(String string, NgWw$UtIU ngWw$UtIU, boolean bl, String string2) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
        return NgWw.yJLS(NgWw.iy(ngWw$UtIU, string), bl, string2);
    }

    public static Object yJLS(Object object, Class<?> class_, boolean bl, String string) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        return NgWw.iy(NgWw.yJLS(class_, bl, string), object);
    }

    public static Object yJLS(Object object, String string, NgWw$UtIU ngWw$UtIU, boolean bl, String string2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
        return NgWw.yJLS(object, NgWw.iy(ngWw$UtIU, string), bl, string2);
    }

    public static Object yJLS(Object object, boolean bl, String string) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        return NgWw.yJLS(object, NgWw.iy(object), bl, string);
    }

    public static void yJLS(Object object, Class<?> class_, boolean bl, String string, Object object2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        NgWw.iy(NgWw.yJLS(class_, bl, string), object, object2);
    }

    public static void yJLS(Object object, String string, NgWw$UtIU ngWw$UtIU, boolean bl, String string2, Object object2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
        NgWw.yJLS(object, NgWw.iy(ngWw$UtIU, string), bl, string2, object2);
    }

    public static void yJLS(Object object, boolean bl, String string, Object object2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        NgWw.yJLS(object, NgWw.iy(object), bl, string, object2);
    }

    private static Object iy(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

