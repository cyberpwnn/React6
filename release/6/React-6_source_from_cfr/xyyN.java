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

public final class xyyN {
    private xyyN() {
    }

    public static /* varargs */ Constructor<?> getConstructor(Class<?> class_, Class<?> ... arrclass) throws NoSuchMethodException {
        Class[] arrclass2 = (Class[])xyyN.Xw(arrclass);
        Constructor[] arrconstructor = (Constructor[])xyyN.Xw(class_);
        int n = arrconstructor.length;
        int n2 = 0;
        while (n2 < n) {
            Constructor constructor = arrconstructor[n2];
            if (xyyN.Xw((Class[])xyyN.Xw((Class[])xyyN.Xw(constructor)), arrclass2) != false) {
                return constructor;
            }
            ++n2;
        }
        throw new NoSuchMethodException(NVIs$JbpD.H("\ue37d\u2438\u9bf5\u14a0\u3d63\u0e04\u26bb\u8370\u54b0\ue2fd\u7612\u4f11\ub51a\u64bc\u7d86\u3915\u2343\udd0c\u2394\u3833\u3dcb\uf60c\u58b6\u6ec7\u203b\u8759\ub010\u8839\u9c0a\u819e\ua10d\u2a62\u1772\u6294\u0a23\u0d69\u63d8\u1d72\u9c28\u2f96\u5c68\u9087\u818e\ua321\u18e9\ud51d\u06bb\u908e\u5a0c\ucbb7\u30a9\ua52f\uc19f\u14b7\ubb2a\ueae3\u3fcb\ue4da\u36b0\u5fc9\u21b8\u4d3a\ufa4a\ufa19\u3b6d\u457c\uf22f\u3384\uec18\u4a00\u50a9\uc397\u4931\u822b\u927a\u153e\u5e2a"));
    }

    public static /* varargs */ Constructor<?> mXJp(String string, xyyN$ksfs xyyN$ksfs, Class<?> ... arrclass) throws NoSuchMethodException, ClassNotFoundException {
        return xyyN.getConstructor(xyyN.Xw(xyyN$ksfs, string), arrclass);
    }

    public static /* varargs */ Object mXJp(Class<?> class_, Object ... arrobject) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        return xyyN.Xw(xyyN.getConstructor(class_, (Class[])xyyN.Xw(arrobject)), arrobject);
    }

    public static /* varargs */ Object mXJp(String string, xyyN$ksfs xyyN$ksfs, Object ... arrobject) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        return xyyN.mXJp(xyyN.Xw(xyyN$ksfs, string), arrobject);
    }

    public static /* varargs */ Method getMethod(Class<?> class_, String string, Class<?> ... arrclass) throws NoSuchMethodException {
        Class[] arrclass2 = (Class[])xyyN.Xw(arrclass);
        Method[] arrmethod = (Method[])xyyN.Xw(class_);
        int n = arrmethod.length;
        int n2 = 0;
        while (n2 < n) {
            Method method = arrmethod[n2];
            if (xyyN.Xw(xyyN.Xw(method), string) != false) {
                if (xyyN.Xw((Class[])xyyN.Xw((Class[])xyyN.Xw(method)), arrclass2) != false) {
                    return method;
                }
            }
            ++n2;
        }
        throw new NoSuchMethodException(KDGY$JAHk.Y("\u126d\u659b\u49d8\u090b\u4eee\u83ed\u50c5\u72a1\uf9e2\uac64\ua634\ud949\u6bdf\u747f\ue97f\uf13f\u7c01\u22e2\u0da5\u7183\uc15e\u428e\uda91\u72fe\uded3\ufd0b\ud2dd\u8043\u5c05\u70e9\uc160\u54b0\u4b0a\u60ef\ubbdd\u1fa0\u8546\u3f45\uee79\u1ba9\ub098\u3ae0\u4d10\u464d\u492f\ud2ba\u030d\udedc\u76b7\u5343\ue2d1\uda97\u4f74\u9976\uf5c9\u1718\u514d\u0186\u93ce\uca19\uc433\u07b1\ud95a\ue8db\ua50e\ud82e\u5c5b\ub544\u0523\ub2c6\ubc66\u82e7\ue530\u4a9c\ucec9\u97d1\u4ed7\u5e7d\ucfbb\ub1a5\uba39"));
    }

    public static /* varargs */ Method mXJp(String string, xyyN$ksfs xyyN$ksfs, String string2, Class<?> ... arrclass) throws NoSuchMethodException, ClassNotFoundException {
        return xyyN.getMethod(xyyN.Xw(xyyN$ksfs, string), string2, arrclass);
    }

    public static /* varargs */ Object invokeMethod(Object object, String string, Object ... arrobject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        return xyyN.Xw(xyyN.getMethod(xyyN.Xw(object), string, (Class[])xyyN.Xw(arrobject)), object, arrobject);
    }

    public static /* varargs */ Object mXJp(Object object, Class<?> class_, String string, Object ... arrobject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        return xyyN.Xw(xyyN.getMethod(class_, string, (Class[])xyyN.Xw(arrobject)), object, arrobject);
    }

    public static /* varargs */ Object mXJp(Object object, String string, xyyN$ksfs xyyN$ksfs, String string2, Object ... arrobject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        return xyyN.mXJp(object, xyyN.Xw(xyyN$ksfs, string), string2, arrobject);
    }

    public static Field mXJp(Class<?> class_, boolean bl, String string) throws NoSuchFieldException, SecurityException {
        Object object = bl ? xyyN.Xw(class_, string) : xyyN.Xw(class_, string);
        xyyN.Xw(object, true);
        return object;
    }

    public static Field mXJp(String string, xyyN$ksfs xyyN$ksfs, boolean bl, String string2) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
        return xyyN.mXJp(xyyN.Xw(xyyN$ksfs, string), bl, string2);
    }

    public static Object mXJp(Object object, Class<?> class_, boolean bl, String string) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        return xyyN.Xw(xyyN.mXJp(class_, bl, string), object);
    }

    public static Object mXJp(Object object, String string, xyyN$ksfs xyyN$ksfs, boolean bl, String string2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
        return xyyN.mXJp(object, xyyN.Xw(xyyN$ksfs, string), bl, string2);
    }

    public static Object mXJp(Object object, boolean bl, String string) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        return xyyN.mXJp(object, xyyN.Xw(object), bl, string);
    }

    public static void mXJp(Object object, Class<?> class_, boolean bl, String string, Object object2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        xyyN.Xw(xyyN.mXJp(class_, bl, string), object, object2);
    }

    public static void mXJp(Object object, String string, xyyN$ksfs xyyN$ksfs, boolean bl, String string2, Object object2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
        xyyN.mXJp(object, xyyN.Xw(xyyN$ksfs, string), bl, string2, object2);
    }

    public static void mXJp(Object object, boolean bl, String string, Object object2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        xyyN.mXJp(object, xyyN.Xw(object), bl, string, object2);
    }

    private static Object Xw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

