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

public final class DsJQ {
    private DsJQ() {
    }

    public static /* varargs */ Constructor<?> getConstructor(Class<?> class_, Class<?> ... arrclass) throws NoSuchMethodException {
        Class[] arrclass2 = (Class[])DsJQ.vg(arrclass);
        Constructor[] arrconstructor = (Constructor[])DsJQ.vg(class_);
        int n = arrconstructor.length;
        int n2 = 0;
        while (n2 < n) {
            Constructor constructor = arrconstructor[n2];
            if (DsJQ.vg((Class[])DsJQ.vg((Class[])DsJQ.vg(constructor)), arrclass2) != false) {
                return constructor;
            }
            ++n2;
        }
        throw new NoSuchMethodException(YEBy$TyVf.W("\u1af7\u8253\udf16\u5e07\ue72a\ua2a5\u3743\ua47e\ud2aa\uac2a\ubfb4\u12f3\ub555\u9979\uf803\u0c59\u845a\u3303\u6471\u92e8\u8b0b\udd36\ufa0c\uc1ce\u4621\uae32\uccaa\u5e73\u8dc6\ub3c0\u99d1\u759c\u2c1b\uf205\u0fd3\u8a81\ud2f0\uf130\u0234\u5442\ueead\udbd0\uc83d\u2798\udf15\uf96b\ue1e1\u5daf\ud765\uaba3\u5123\ud244\u3af9\ue8fa\u18ee\u14a5\uf8a6\ua1cf\ufe40\u0b4e\u1e9f\ufcbe\u719f\udac2\u2b01\ue444\uf72d\uc46a\u37d8\u8f63\ua602\u6d92\uabd1\ue328\uddfb\u6234\ud57a"));
    }

    public static /* varargs */ Constructor<?> ssNb(String string, DsJQ$DYFV dsJQ$DYFV, Class<?> ... arrclass) throws NoSuchMethodException, ClassNotFoundException {
        return DsJQ.getConstructor(DsJQ.vg(dsJQ$DYFV, string), arrclass);
    }

    public static /* varargs */ Object ssNb(Class<?> class_, Object ... arrobject) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        return DsJQ.vg(DsJQ.getConstructor(class_, (Class[])DsJQ.vg(arrobject)), arrobject);
    }

    public static /* varargs */ Object ssNb(String string, DsJQ$DYFV dsJQ$DYFV, Object ... arrobject) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        return DsJQ.ssNb(DsJQ.vg(dsJQ$DYFV, string), arrobject);
    }

    public static /* varargs */ Method getMethod(Class<?> class_, String string, Class<?> ... arrclass) throws NoSuchMethodException {
        Class[] arrclass2 = (Class[])DsJQ.vg(arrclass);
        Method[] arrmethod = (Method[])DsJQ.vg(class_);
        int n = arrmethod.length;
        int n2 = 0;
        while (n2 < n) {
            Method method = arrmethod[n2];
            if (DsJQ.vg(DsJQ.vg(method), string) != false) {
                if (DsJQ.vg((Class[])DsJQ.vg((Class[])DsJQ.vg(method)), arrclass2) != false) {
                    return method;
                }
            }
            ++n2;
        }
        throw new NoSuchMethodException(KUXS$dwji.S("\u6e91\u2e24\uc709\u5335\u91f5\uce32\uc7d3\u2b0e\u1aa3\uffbd\uf655\ue56d\ue932\u71a0\udde8\u0e38\u2c03\u4bb6\u13a0\ue3d9\u2743\ue30e\u32a7\uae2a\ue416\u82bc\u0f70\u0521\u0770\ude15\uce82\u42a7\ub2b2\uda2d\u0ddd\u04f1\ua2f8\u86e7\u1d64\u369f\u3216\u5d3d\uf858\u20b5\u1986\u34b8\ue0b0\u7cb8\u2463\ud70e\u910c\u50d3\u5e0c\u7cba\u1d81\u326c\ub3b6\u9665\u1592\u897f\u859e\u415c\ue0dd\udcaa\u99db\u0bb7\u9bf7\u4c0c\u4dd0\u0c93\u8420\u8caa\u10be\uec3d\ud481\uef4b\u98e6\u86e6\u91a9\uea4d\u23dc"));
    }

    public static /* varargs */ Method ssNb(String string, DsJQ$DYFV dsJQ$DYFV, String string2, Class<?> ... arrclass) throws NoSuchMethodException, ClassNotFoundException {
        return DsJQ.getMethod(DsJQ.vg(dsJQ$DYFV, string), string2, arrclass);
    }

    public static /* varargs */ Object invokeMethod(Object object, String string, Object ... arrobject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        return DsJQ.vg(DsJQ.getMethod(DsJQ.vg(object), string, (Class[])DsJQ.vg(arrobject)), object, arrobject);
    }

    public static /* varargs */ Object ssNb(Object object, Class<?> class_, String string, Object ... arrobject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        return DsJQ.vg(DsJQ.getMethod(class_, string, (Class[])DsJQ.vg(arrobject)), object, arrobject);
    }

    public static /* varargs */ Object ssNb(Object object, String string, DsJQ$DYFV dsJQ$DYFV, String string2, Object ... arrobject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        return DsJQ.ssNb(object, DsJQ.vg(dsJQ$DYFV, string), string2, arrobject);
    }

    public static Field ssNb(Class<?> class_, boolean bl, String string) throws NoSuchFieldException, SecurityException {
        Object object = bl ? DsJQ.vg(class_, string) : DsJQ.vg(class_, string);
        DsJQ.vg(object, true);
        return object;
    }

    public static Field ssNb(String string, DsJQ$DYFV dsJQ$DYFV, boolean bl, String string2) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
        return DsJQ.ssNb(DsJQ.vg(dsJQ$DYFV, string), bl, string2);
    }

    public static Object ssNb(Object object, Class<?> class_, boolean bl, String string) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        return DsJQ.vg(DsJQ.ssNb(class_, bl, string), object);
    }

    public static Object ssNb(Object object, String string, DsJQ$DYFV dsJQ$DYFV, boolean bl, String string2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
        return DsJQ.ssNb(object, DsJQ.vg(dsJQ$DYFV, string), bl, string2);
    }

    public static Object ssNb(Object object, boolean bl, String string) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        return DsJQ.ssNb(object, DsJQ.vg(object), bl, string);
    }

    public static void ssNb(Object object, Class<?> class_, boolean bl, String string, Object object2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        DsJQ.vg(DsJQ.ssNb(class_, bl, string), object, object2);
    }

    public static void ssNb(Object object, String string, DsJQ$DYFV dsJQ$DYFV, boolean bl, String string2, Object object2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
        DsJQ.ssNb(object, DsJQ.vg(dsJQ$DYFV, string), bl, string2, object2);
    }

    public static void ssNb(Object object, boolean bl, String string, Object object2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        DsJQ.ssNb(object, DsJQ.vg(object), bl, string, object2);
    }

    private static Object vg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

