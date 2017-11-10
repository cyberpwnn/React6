/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class OGmN$CVAs
extends Enum<OGmN$CVAs> {
    public static final /* enum */ OGmN$CVAs XnNw;
    public static final /* enum */ OGmN$CVAs SDlK;
    public static final /* enum */ OGmN$CVAs ecRj;
    public static final /* enum */ OGmN$CVAs XLKj;
    private static final /* synthetic */ OGmN$CVAs[] uXnS;

    static {
        yy.K(-409205578, (Object)new OGmN$CVAs(NVIs$JbpD.H("\uadfb\u0716\u92a6\uc4d5\u76c4\u3d92\u37c3\u387a\ue0b5\u9d3d\ua23b\ud197\u74ad\ubf66"), 0));
        yy.K(-409926469, (Object)new OGmN$CVAs(NVIs$JbpD.H("\uadfb\u0716\u92a6\uc4d5\u76c4\u3d92\u37c3\u387a\ue0b5\u9d2e\ua23b\ud197\u74a9"), 1));
        yy.K(-1699871556, (Object)new OGmN$CVAs(NVIs$JbpD.H("\uaded\u071a\u92a5\uc4c5\u76ce\u3d94\u37cf\u3866\ue0a4\u9d2b\ua236"), 2));
        yy.K(176030897, (Object)new OGmN$CVAs(NVIs$JbpD.H("\uadea\u071c\u92bb\uc4cf\u76df\u3d81\u37c4\u3865\ue0af"), 3));
        yy.K(-1064434502, new OGmN$CVAs[]{(OGmN$CVAs)((Object)yy.p(-409205578)), (OGmN$CVAs)((Object)yy.p(-409926469)), (OGmN$CVAs)((Object)yy.p(-1699871556)), (OGmN$CVAs)((Object)yy.p(176030897))});
    }

    private OGmN$CVAs(String string2, int n2) {
    }

    public static OGmN$CVAs[] values() {
        OGmN$CVAs[] arroGmN$CVAs = (OGmN$CVAs[])yy.p(-1064434502);
        int n = arroGmN$CVAs.length;
        OGmN$CVAs[] arroGmN$CVAs2 = new OGmN$CVAs[n];
        OGmN$CVAs.GH(arroGmN$CVAs, false, arroGmN$CVAs2, false, n);
        return arroGmN$CVAs2;
    }

    public static OGmN$CVAs valueOf(String string) {
        return (OGmN$CVAs)((Object)OGmN$CVAs.GH(OGmN$CVAs.class, string));
    }

    private static Object GH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

