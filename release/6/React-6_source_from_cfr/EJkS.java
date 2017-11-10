/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class EJkS
extends Enum<EJkS> {
    public static final /* enum */ EJkS hQYl;
    public static final /* enum */ EJkS XSKv;
    public static final /* enum */ EJkS ejSm;
    private static final /* synthetic */ EJkS[] owol;

    public static EJkS[] values() {
        return (EJkS[])((EJkS[])yy.p(1341130505)).clone();
    }

    public static EJkS valueOf(String string) {
        return (EJkS)((Object)EJkS.gK(EJkS.class, string));
    }

    private EJkS() {
    }

    static {
        yy.K(1097860882, (Object)new EJkS());
        yy.K(1789200135, (Object)new EJkS());
        yy.K(242550536, (Object)new EJkS());
        yy.K(1341130505, new EJkS[]{(EJkS)((Object)yy.p(1097860882)), (EJkS)((Object)yy.p(1789200135)), (EJkS)((Object)yy.p(242550536))});
    }

    private static Object gK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

