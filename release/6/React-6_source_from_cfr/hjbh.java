/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class hjbh
extends Enum<hjbh> {
    public static final /* enum */ hjbh QgwU;
    public static final /* enum */ hjbh psQT;
    private static final /* synthetic */ hjbh[] TiQM;

    static {
        cv.V(-1841761742, (Object)new hjbh(YEBy$TyVf.W("\u1b2c\uc797\u8071\u0c6c\u761b\ueeb5\u9d5c\ud1fa\ufb78\ud704\ufb4d"), 0));
        cv.V(-324798018, (Object)new hjbh(YEBy$TyVf.W("\u1b2d\uc795\u8065\u0c6e\u7613\ueeaf\u9d5d\ud1e1"), 1));
        cv.V(1677392231, new hjbh[]{(hjbh)((Object)cv.e(-1841761742)), (hjbh)((Object)cv.e(-324798018))});
    }

    private hjbh(String string2, int n2) {
    }

    public static hjbh[] values() {
        hjbh[] arrhjbh = (hjbh[])cv.e(1677392231);
        int n = arrhjbh.length;
        hjbh[] arrhjbh2 = new hjbh[n];
        hjbh.Mv(arrhjbh, false, arrhjbh2, false, n);
        return arrhjbh2;
    }

    public static hjbh valueOf(String string) {
        return (hjbh)((Object)hjbh.Mv(hjbh.class, string));
    }

    private static Object Mv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

