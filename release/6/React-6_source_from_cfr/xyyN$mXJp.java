/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class xyyN$mXJp
extends Enum<xyyN$mXJp> {
    public static final /* enum */ xyyN$mXJp SwsO;
    public static final /* enum */ xyyN$mXJp GuQn;
    public static final /* enum */ xyyN$mXJp MnQx;
    public static final /* enum */ xyyN$mXJp Rtox;
    public static final /* enum */ xyyN$mXJp IjWE;
    public static final /* enum */ xyyN$mXJp EMIO;
    public static final /* enum */ xyyN$mXJp xHhp;
    public static final /* enum */ xyyN$mXJp TGrV;
    private static final Map<Class<?>, xyyN$mXJp> mkMQ;
    private final Class<?> ELgs;
    private final Class<?> NqUc;
    private static final /* synthetic */ xyyN$mXJp[] UJtq;

    static {
        yy.K(586023486, (Object)new xyyN$mXJp((Class)yy.p(-2009201151), Byte.class));
        yy.K(-1796865468, (Object)new xyyN$mXJp((Class)yy.p(-216792509), Short.class));
        yy.K(-343342471, (Object)new xyyN$mXJp((Class)yy.p(-281088989), Integer.class));
        yy.K(-277020094, (Object)new xyyN$mXJp((Class)yy.p(576318502), Long.class));
        yy.K(1266156152, (Object)new xyyN$mXJp((Class)yy.p(1282998903), Character.class));
        yy.K(-914750906, (Object)new xyyN$mXJp((Class)yy.p(-1058143667), Float.class));
        yy.K(-919666101, (Object)new xyyN$mXJp((Class)yy.p(1493167191), Double.class));
        yy.K(1510343233, (Object)new xyyN$mXJp((Class)yy.p(107676236), Boolean.class));
        yy.K(900268618, new xyyN$mXJp[]{(xyyN$mXJp)((Object)yy.p(586023486)), (xyyN$mXJp)((Object)yy.p(-1796865468)), (xyyN$mXJp)((Object)yy.p(-343342471)), (xyyN$mXJp)((Object)yy.p(-277020094)), (xyyN$mXJp)((Object)yy.p(1266156152)), (xyyN$mXJp)((Object)yy.p(-914750906)), (xyyN$mXJp)((Object)yy.p(-919666101)), (xyyN$mXJp)((Object)yy.p(1510343233))});
        yy.K(-570424769, new HashMap());
        xyyN$mXJp[] arrxyyN$mXJp = xyyN$mXJp.values();
        int n = arrxyyN$mXJp.length;
        int n2 = 0;
        while (n2 < n) {
            xyyN$mXJp xyyN$mXJp = arrxyyN$mXJp[n2];
            ((Map)yy.p(-570424769)).put((Class)yy.h((Object)xyyN$mXJp, -1509621184), xyyN$mXJp);
            ((Map)yy.p(-570424769)).put((Class)yy.h((Object)xyyN$mXJp, -296746603), xyyN$mXJp);
            ++n2;
        }
    }

    private xyyN$mXJp(Class<?> class_, Class<?> class_2) {
        this.ELgs = class_;
        this.NqUc = class_2;
    }

    public Class<?> jpwO() {
        return (Class)yy.h((Object)this, -1509621184);
    }

    public Class<?> NVVB() {
        return (Class)yy.h((Object)this, -296746603);
    }

    public static xyyN$mXJp ksfs(Class<?> class_) {
        return (xyyN$mXJp)((Object)((Map)yy.p(-570424769)).get(class_));
    }

    public static Class<?> yJLL(Class<?> class_) {
        xyyN$mXJp xyyN$mXJp = xyyN$mXJp.ksfs(class_);
        if (xyyN$mXJp == null) {
            return class_;
        }
        return xyyN$mXJp.jpwO();
    }

    public static Class<?> SnBs(Class<?> class_) {
        xyyN$mXJp xyyN$mXJp = xyyN$mXJp.ksfs(class_);
        if (xyyN$mXJp == null) {
            return class_;
        }
        return xyyN$mXJp.NVVB();
    }

    public static Class<?>[] mXJp(Class<?>[] arrclass) {
        int n = arrclass == null ? 0 : arrclass.length;
        Class[] arrclass2 = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass2[n2] = xyyN$mXJp.yJLL(arrclass[n2]);
            ++n2;
        }
        return arrclass2;
    }

    public static Class<?>[] ksfs(Class<?>[] arrclass) {
        int n = arrclass == null ? 0 : arrclass.length;
        Class[] arrclass2 = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass2[n2] = xyyN$mXJp.SnBs(arrclass[n2]);
            ++n2;
        }
        return arrclass2;
    }

    public static Class<?>[] ksfs(Object[] arrobject) {
        int n = arrobject == null ? 0 : arrobject.length;
        Class[] arrclass = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass[n2] = xyyN$mXJp.yJLL(xyyN$mXJp.xv(arrobject[n2]));
            ++n2;
        }
        return arrclass;
    }

    public static Class<?>[] yJLL(Object[] arrobject) {
        int n = arrobject == null ? 0 : arrobject.length;
        Class[] arrclass = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass[n2] = xyyN$mXJp.SnBs(xyyN$mXJp.xv(arrobject[n2]));
            ++n2;
        }
        return arrclass;
    }

    public static boolean mXJp(Class<?>[] arrclass, Class<?>[] arrclass2) {
        if (arrclass == null || arrclass2 == null || arrclass.length != arrclass2.length) {
            return false;
        }
        int n = 0;
        while (n < arrclass.length) {
            Class class_ = arrclass[n];
            Class class_2 = arrclass2[n];
            if (xyyN$mXJp.xv(class_, class_2) == false) {
                if (xyyN$mXJp.xv(class_, class_2) == false) {
                    return false;
                }
            }
            ++n;
        }
        return true;
    }

    public static xyyN$mXJp[] values() {
        xyyN$mXJp[] arrxyyN$mXJp = (xyyN$mXJp[])yy.p(900268618);
        int n = arrxyyN$mXJp.length;
        xyyN$mXJp[] arrxyyN$mXJp2 = new xyyN$mXJp[n];
        xyyN$mXJp.xv(arrxyyN$mXJp, false, arrxyyN$mXJp2, false, n);
        return arrxyyN$mXJp2;
    }

    public static xyyN$mXJp valueOf(String string) {
        return (xyyN$mXJp)((Object)xyyN$mXJp.xv(xyyN$mXJp.class, string));
    }

    private static Object xv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

