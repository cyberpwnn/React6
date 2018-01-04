/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class Cfqo
extends Enum<Cfqo> {
    public static final /* enum */ Cfqo YyYB;
    public static final /* enum */ Cfqo AkDu;
    public static final /* enum */ Cfqo psiW;
    public static final /* enum */ Cfqo HLsV;
    public static final /* enum */ Cfqo HgFl;
    private static final /* synthetic */ Cfqo[] WPnU;

    public static Cfqo[] values() {
        return (Cfqo[])((Cfqo[])o.k(-866038742)).clone();
    }

    public static Cfqo valueOf(String string) {
        return (Cfqo)((Object)Cfqo.XA(Cfqo.class, string));
    }

    private Cfqo() {
    }

    static {
        o.w(477187113, (Object)new Cfqo());
        o.w(1306348584, (Object)new Cfqo());
        o.w(339102759, (Object)new Cfqo());
        o.w(-1632482266, (Object)new Cfqo());
        o.w(236801061, (Object)new Cfqo());
        o.w(-866038742, new Cfqo[]{(Cfqo)((Object)o.k(477187113)), (Cfqo)((Object)o.k(1306348584)), (Cfqo)((Object)o.k(339102759)), (Cfqo)((Object)o.k(-1632482266)), (Cfqo)((Object)o.k(236801061))});
    }

    private static Object XA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

