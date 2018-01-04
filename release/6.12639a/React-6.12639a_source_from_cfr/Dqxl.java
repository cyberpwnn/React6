/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class Dqxl
extends Enum<Dqxl> {
    public static final /* enum */ Dqxl CNIo;
    public static final /* enum */ Dqxl TymD;
    public static final /* enum */ Dqxl sQaC;
    public static final /* enum */ Dqxl PCLi;
    public static final /* enum */ Dqxl JlOg;
    public static final /* enum */ Dqxl hcCr;
    public static final /* enum */ Dqxl xjAr;
    public static final /* enum */ Dqxl woPC;
    private String Edom;
    private static final /* synthetic */ Dqxl[] PTOC;

    static {
        o.w(-494189108, (Object)new Dqxl(FMkR$WjFM.a("\u3da5\ua30e\u69ce\ub4ee\u4db3\u1e79\ub5f2\u29ff\u0518\uc8c8"), 0, FMkR$WjFM.a("\u3da5\ua32e\u69ee\ub4ce\u4d93\u1e06\ub5f2\u29df\u0538\uc8e8")));
        o.w(1438664139, (Object)new Dqxl(FMkR$WjFM.a("\u3da6\ua307\u69c8\ub4e5\u4dad\u1e75\ub5ed\u29fc\u0500"), 1, FMkR$WjFM.a("\u3da6\ua327\u69e8\ub4c5\u4dd2\u1e75\ub5cd\u29dc\u0520")));
        o.w(2119452122, (Object)new Dqxl(FMkR$WjFM.a("\u3da3\ua30e\u69d5\ub4eb"), 2, FMkR$WjFM.a("\u3da3\ua32e\u69f5\ub4cb")));
        o.w(-961722919, (Object)new Dqxl(FMkR$WjFM.a("\u3db1\ua314\u69df\ub4ee\u4db3\u1e61\ub5e4"), 3, FMkR$WjFM.a("\u3db1\ua334\u69ff\ub4ce\u4d93\u1e41\ub5c4")));
        o.w(-992918056, (Object)new Dqxl(FMkR$WjFM.a("\u3db7\ua30d\u69d5\ub4f8"), 4, FMkR$WjFM.a("\u3db7\ua32d\u69f5\ub4d8")));
        o.w(1642087895, (Object)new Dqxl(FMkR$WjFM.a("\u3db6\ua303\u69c9\ub4e8"), 5, FMkR$WjFM.a("\u3db6\ua323\u69e9\ub4c8")));
        o.w(-783596074, (Object)new Dqxl(FMkR$WjFM.a("\u3da6\ua307\u69c8\ub4e5\u4dad\u1e60\ub5e0\u29e0\u0503"), 6, FMkR$WjFM.a("\u3da6\ua327\u69e8\ub4c5\u4dd2\u1e60\ub5c0\u29c0\u0523")));
        o.w(-830257707, (Object)new Dqxl(FMkR$WjFM.a("\u3da5\ua30e\u69ce\ub4ee\u4db3\u1e79\ub5e7\u29f2\u0504\uc8cb"), 7, FMkR$WjFM.a("\u3da5\ua32e\u69ee\ub4ce\u4d93\u1e06\ub5e7\u29d2\u0524\uc8eb")));
        o.w(-696695340, new Dqxl[]{(Dqxl)((Object)o.k(-494189108)), (Dqxl)((Object)o.k(1438664139)), (Dqxl)((Object)o.k(2119452122)), (Dqxl)((Object)o.k(-961722919)), (Dqxl)((Object)o.k(-992918056)), (Dqxl)((Object)o.k(1642087895)), (Dqxl)((Object)o.k(-783596074)), (Dqxl)((Object)o.k(-830257707))});
    }

    private Dqxl(String string2, int n2, String string3) {
        this.Edom = string2;
    }

    public String toString() {
        return (String)o.a((Object)this, -754367021);
    }

    public static String yJLS(int n) {
        if (n > 2000) {
            return ((Dqxl)((Object)o.k(-830257707))).toString();
        }
        if (n > 1700) {
            return ((Dqxl)((Object)o.k(-783596074))).toString();
        }
        if (n > 1500) {
            return ((Dqxl)((Object)o.k(1642087895))).toString();
        }
        if (n > 1350) {
            return ((Dqxl)((Object)o.k(-992918056))).toString();
        }
        if (n > 1100) {
            return ((Dqxl)((Object)o.k(-961722919))).toString();
        }
        if (n > 800) {
            return ((Dqxl)((Object)o.k(2119452122))).toString();
        }
        if (n > 100) {
            return ((Dqxl)((Object)o.k(1438664139))).toString();
        }
        return ((Dqxl)((Object)o.k(-494189108))).toString();
    }

    public static Dqxl[] values() {
        Dqxl[] arrdqxl = (Dqxl[])o.k(-696695340);
        int n = arrdqxl.length;
        Dqxl[] arrdqxl2 = new Dqxl[n];
        Dqxl.LC(arrdqxl, false, arrdqxl2, false, n);
        return arrdqxl2;
    }

    public static Dqxl valueOf(String string) {
        return (Dqxl)((Object)Dqxl.LC(Dqxl.class, string));
    }

    private static Object LC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

