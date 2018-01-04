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

public final class NgWw$yJLS
extends Enum<NgWw$yJLS> {
    public static final /* enum */ NgWw$yJLS veiQ;
    public static final /* enum */ NgWw$yJLS pBTt;
    public static final /* enum */ NgWw$yJLS dquu;
    public static final /* enum */ NgWw$yJLS cVBY;
    public static final /* enum */ NgWw$yJLS hSoX;
    public static final /* enum */ NgWw$yJLS LlQq;
    public static final /* enum */ NgWw$yJLS mJNE;
    public static final /* enum */ NgWw$yJLS kCfe;
    private static final Map<Class<?>, NgWw$yJLS> PDxg;
    private final Class<?> cUaV;
    private final Class<?> hurF;
    private static final /* synthetic */ NgWw$yJLS[] FPms;

    static {
        o.w(674251023, (Object)new NgWw$yJLS((Class)o.k(858869048), Byte.class));
        o.w(1994735885, (Object)new NgWw$yJLS((Class)o.k(574308622), Short.class));
        o.w(1787379980, (Object)new NgWw$yJLS((Class)o.k(836130996), Integer.class));
        o.w(2054635787, (Object)new NgWw$yJLS((Class)o.k(-567650146), Long.class));
        o.w(68305177, (Object)new NgWw$yJLS((Class)o.k(-1099349734), Character.class));
        o.w(1852981527, (Object)new NgWw$yJLS((Class)o.k(1956004120), Float.class));
        o.w(552878358, (Object)new NgWw$yJLS((Class)o.k(538073249), Double.class));
        o.w(858145044, (Object)new NgWw$yJLS((Class)o.k(-556515051), Boolean.class));
        o.w(-564903661, new NgWw$yJLS[]{(NgWw$yJLS)((Object)o.k(674251023)), (NgWw$yJLS)((Object)o.k(1994735885)), (NgWw$yJLS)((Object)o.k(1787379980)), (NgWw$yJLS)((Object)o.k(2054635787)), (NgWw$yJLS)((Object)o.k(68305177)), (NgWw$yJLS)((Object)o.k(1852981527)), (NgWw$yJLS)((Object)o.k(552878358)), (NgWw$yJLS)((Object)o.k(858145044))});
        o.w(-678608510, new HashMap());
        NgWw$yJLS[] arrngWw$yJLS = NgWw$yJLS.values();
        int n = arrngWw$yJLS.length;
        int n2 = 0;
        while (n2 < n) {
            NgWw$yJLS ngWw$yJLS = arrngWw$yJLS[n2];
            ((Map)o.k(-678608510)).put((Class)o.a((Object)ngWw$yJLS, 983974273), ngWw$yJLS);
            ((Map)o.k(-678608510)).put((Class)o.a((Object)ngWw$yJLS, -1504296576), ngWw$yJLS);
            ++n2;
        }
    }

    private NgWw$yJLS(Class<?> class_, Class<?> class_2) {
        this.cUaV = class_;
        this.hurF = class_2;
    }

    public Class<?> UReO() {
        return (Class)o.a((Object)this, 983974273);
    }

    public Class<?> CWBj() {
        return (Class)o.a((Object)this, -1504296576);
    }

    public static NgWw$yJLS UtIU(Class<?> class_) {
        return (NgWw$yJLS)((Object)((Map)o.k(-678608510)).get(class_));
    }

    public static Class<?> biLo(Class<?> class_) {
        NgWw$yJLS ngWw$yJLS = NgWw$yJLS.UtIU(class_);
        if (ngWw$yJLS == null) {
            return class_;
        }
        return ngWw$yJLS.UReO();
    }

    public static Class<?> VwLY(Class<?> class_) {
        NgWw$yJLS ngWw$yJLS = NgWw$yJLS.UtIU(class_);
        if (ngWw$yJLS == null) {
            return class_;
        }
        return ngWw$yJLS.CWBj();
    }

    public static Class<?>[] yJLS(Class<?>[] arrclass) {
        int n = arrclass == null ? 0 : arrclass.length;
        Class[] arrclass2 = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass2[n2] = NgWw$yJLS.biLo(arrclass[n2]);
            ++n2;
        }
        return arrclass2;
    }

    public static Class<?>[] UtIU(Class<?>[] arrclass) {
        int n = arrclass == null ? 0 : arrclass.length;
        Class[] arrclass2 = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass2[n2] = NgWw$yJLS.VwLY(arrclass[n2]);
            ++n2;
        }
        return arrclass2;
    }

    public static Class<?>[] UtIU(Object[] arrobject) {
        int n = arrobject == null ? 0 : arrobject.length;
        Class[] arrclass = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass[n2] = NgWw$yJLS.biLo(NgWw$yJLS.Ev(arrobject[n2]));
            ++n2;
        }
        return arrclass;
    }

    public static Class<?>[] biLo(Object[] arrobject) {
        int n = arrobject == null ? 0 : arrobject.length;
        Class[] arrclass = new Class[n];
        int n2 = 0;
        while (n2 < n) {
            arrclass[n2] = NgWw$yJLS.VwLY(NgWw$yJLS.Ev(arrobject[n2]));
            ++n2;
        }
        return arrclass;
    }

    public static boolean yJLS(Class<?>[] arrclass, Class<?>[] arrclass2) {
        if (arrclass == null || arrclass2 == null || arrclass.length != arrclass2.length) {
            return false;
        }
        int n = 0;
        while (n < arrclass.length) {
            Class class_ = arrclass[n];
            Class class_2 = arrclass2[n];
            if (NgWw$yJLS.Ev(class_, class_2) == false) {
                if (NgWw$yJLS.Ev(class_, class_2) == false) {
                    return false;
                }
            }
            ++n;
        }
        return true;
    }

    public static NgWw$yJLS[] values() {
        NgWw$yJLS[] arrngWw$yJLS = (NgWw$yJLS[])o.k(-564903661);
        int n = arrngWw$yJLS.length;
        NgWw$yJLS[] arrngWw$yJLS2 = new NgWw$yJLS[n];
        NgWw$yJLS.Ev(arrngWw$yJLS, false, arrngWw$yJLS2, false, n);
        return arrngWw$yJLS2;
    }

    public static NgWw$yJLS valueOf(String string) {
        return (NgWw$yJLS)((Object)NgWw$yJLS.Ev(NgWw$yJLS.class, string));
    }

    private static Object Ev(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

