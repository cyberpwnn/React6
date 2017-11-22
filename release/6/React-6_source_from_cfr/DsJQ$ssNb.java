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

public final class DsJQ$ssNb
extends Enum<DsJQ$ssNb> {
    public static final /* enum */ DsJQ$ssNb tETj;
    public static final /* enum */ DsJQ$ssNb cmwj;
    public static final /* enum */ DsJQ$ssNb IQLY;
    public static final /* enum */ DsJQ$ssNb FGax;
    public static final /* enum */ DsJQ$ssNb nfFw;
    public static final /* enum */ DsJQ$ssNb hAqb;
    public static final /* enum */ DsJQ$ssNb bABY;
    public static final /* enum */ DsJQ$ssNb xAAA;
    private static final Map<Class<?>, DsJQ$ssNb> yfEp;
    private final Class<?> EwbS;
    private final Class<?> bkSu;
    private static final /* synthetic */ DsJQ$ssNb[] QrTV;

    static {
        cv.V(111212747, (Object)new DsJQ$ssNb((Class)cv.e(-1532234577), Byte.class));
        cv.V(1800796341, (Object)new DsJQ$ssNb((Class)cv.e(1732180170), Short.class));
        cv.V(-1072826188, (Object)new DsJQ$ssNb((Class)cv.e(1035866500), Integer.class));
        cv.V(-1430390601, (Object)new DsJQ$ssNb((Class)cv.e(803410317), Long.class));
        cv.V(-1788806991, (Object)new DsJQ$ssNb((Class)cv.e(-2070021962), Character.class));
        cv.V(-626067277, (Object)new DsJQ$ssNb((Class)cv.e(-1379731280), Float.class));
        cv.V(-1894451022, (Object)new DsJQ$ssNb((Class)cv.e(-452783744), Double.class));
        cv.V(1213593788, (Object)new DsJQ$ssNb((Class)cv.e(-718079811), Boolean.class));
        cv.V(-956106561, new DsJQ$ssNb[]{(DsJQ$ssNb)((Object)cv.e(111212747)), (DsJQ$ssNb)((Object)cv.e(1800796341)), (DsJQ$ssNb)((Object)cv.e(-1072826188)), (DsJQ$ssNb)((Object)cv.e(-1430390601)), (DsJQ$ssNb)((Object)cv.e(-1788806991)), (DsJQ$ssNb)((Object)cv.e(-626067277)), (DsJQ$ssNb)((Object)cv.e(-1894451022)), (DsJQ$ssNb)((Object)cv.e(1213593788))});
        cv.V(-750389058, new HashMap());
        DsJQ$ssNb[] arrdsJQ$ssNb = DsJQ$ssNb.values();
        int n = arrdsJQ$ssNb.length;
        int n2 = 0;
        while (n2 < n) {
            DsJQ$ssNb dsJQ$ssNb = arrdsJQ$ssNb[n2];
            ((Map)cv.e(-750389058)).put((Class)cv.b((Object)dsJQ$ssNb, -1234372423), dsJQ$ssNb);
            ((Map)cv.e(-750389058)).put((Class)cv.b((Object)dsJQ$ssNb, 1283258488), dsJQ$ssNb);
            ++n2;
        }
    }

    private DsJQ$ssNb(Class<?> class_, Class<?> class_2) {
        this.EwbS = class_;
        this.bkSu = class_2;
    }

    public Class<?> Vwai() {
        return (Class)cv.b((Object)this, -1234372423);
    }

    public Class<?> tnWQ() {
        return (Class)cv.b((Object)this, 1283258488);
    }

    public static DsJQ$ssNb DYFV(Class<?> class_) {
        return (DsJQ$ssNb)((Object)((Map)cv.e(-750389058)).get(class_));
    }

    public static Class<?> IWSm(Class<?> class_) {
        DsJQ$ssNb dsJQ$ssNb = DsJQ$ssNb.DYFV(class_);
        if (dsJQ$ssNb == null) {
            return class_;
        }
        return dsJQ$ssNb.Vwai();
    }

    public static Class<?> OXeK(Class<?> class_) {
        DsJQ$ssNb dsJQ$ssNb = DsJQ$ssNb.DYFV(class_);
        if (dsJQ$ssNb == null) {
            return class_;
        }
        return dsJQ$ssNb.tnWQ();
    }

    public static Class<?>[] ssNb(Class<?>[] arrclass) {
        int n = arrclass == null ? 0 : arrclass.length;
        Class[] arrclass2 = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass2[n2] = DsJQ$ssNb.IWSm(arrclass[n2]);
            ++n2;
        }
        return arrclass2;
    }

    public static Class<?>[] DYFV(Class<?>[] arrclass) {
        int n = arrclass == null ? 0 : arrclass.length;
        Class[] arrclass2 = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass2[n2] = DsJQ$ssNb.OXeK(arrclass[n2]);
            ++n2;
        }
        return arrclass2;
    }

    public static Class<?>[] DYFV(Object[] arrobject) {
        int n = arrobject == null ? 0 : arrobject.length;
        Class[] arrclass = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass[n2] = DsJQ$ssNb.IWSm(DsJQ$ssNb.KA(arrobject[n2]));
            ++n2;
        }
        return arrclass;
    }

    public static Class<?>[] IWSm(Object[] arrobject) {
        int n = arrobject == null ? 0 : arrobject.length;
        Class[] arrclass = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass[n2] = DsJQ$ssNb.OXeK(DsJQ$ssNb.KA(arrobject[n2]));
            ++n2;
        }
        return arrclass;
    }

    public static boolean ssNb(Class<?>[] arrclass, Class<?>[] arrclass2) {
        if (arrclass == null || arrclass2 == null || arrclass.length != arrclass2.length) {
            return false;
        }
        int n = 0;
        while (n < arrclass.length) {
            Class class_ = arrclass[n];
            Class class_2 = arrclass2[n];
            if (DsJQ$ssNb.KA(class_, class_2) == false) {
                if (DsJQ$ssNb.KA(class_, class_2) == false) {
                    return false;
                }
            }
            ++n;
        }
        return true;
    }

    public static DsJQ$ssNb[] values() {
        DsJQ$ssNb[] arrdsJQ$ssNb = (DsJQ$ssNb[])cv.e(-956106561);
        int n = arrdsJQ$ssNb.length;
        DsJQ$ssNb[] arrdsJQ$ssNb2 = new DsJQ$ssNb[n];
        DsJQ$ssNb.KA(arrdsJQ$ssNb, false, arrdsJQ$ssNb2, false, n);
        return arrdsJQ$ssNb2;
    }

    public static DsJQ$ssNb valueOf(String string) {
        return (DsJQ$ssNb)((Object)DsJQ$ssNb.KA(DsJQ$ssNb.class, string));
    }

    private static Object KA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

