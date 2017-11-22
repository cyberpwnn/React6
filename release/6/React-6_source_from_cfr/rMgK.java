/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class rMgK
extends Enum<rMgK> {
    public static final /* enum */ rMgK FhLM;
    public static final /* enum */ rMgK psDx;
    private static final /* synthetic */ rMgK[] DbEj;

    public static rMgK[] values() {
        return (rMgK[])((rMgK[])cv.e(1883115414)).clone();
    }

    public static rMgK valueOf(String string) {
        return (rMgK)((Object)rMgK.bN(rMgK.class, string));
    }

    private rMgK() {
    }

    static {
        cv.V(1552289681, (Object)new rMgK());
        cv.V(-167440496, (Object)new rMgK());
        cv.V(1883115414, new rMgK[]{(rMgK)((Object)cv.e(1552289681)), (rMgK)((Object)cv.e(-167440496))});
    }

    private static Object bN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

