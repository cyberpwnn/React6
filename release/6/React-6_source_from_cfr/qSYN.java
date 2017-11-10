/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class qSYN
extends Enum<qSYN> {
    public static final /* enum */ qSYN CVRb;
    public static final /* enum */ qSYN UJGJ;
    public static final /* enum */ qSYN rVgx;
    public static final /* enum */ qSYN qCDb;
    public static final /* enum */ qSYN cAju;
    public static final /* enum */ qSYN PJvK;
    public static final /* enum */ qSYN vlGM;
    public static final /* enum */ qSYN ejUT;
    public static final /* enum */ qSYN BlcL;
    public static final /* enum */ qSYN hjnK;
    public static final /* enum */ qSYN UcVo;
    public static final /* enum */ qSYN ccoN;
    public static final /* enum */ qSYN erfT;
    public static final /* enum */ qSYN ETIQ;
    private String qluD;
    private static final /* synthetic */ qSYN[] Aqoe;

    public static qSYN[] values() {
        return (qSYN[])((qSYN[])yy.p(1999177551)).clone();
    }

    public static qSYN valueOf(String string) {
        return (qSYN)((Object)qSYN.VR(qSYN.class, string));
    }

    private qSYN(String string2) {
        try {
            this.qluD = string2;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public String hHaT() {
        return (String)yy.h((Object)this, -467728560);
    }

    static {
        yy.K(1606551326, (Object)new qSYN((String)yy.p(-231274715)));
        yy.K(155911972, (Object)new qSYN((String)yy.p(326436643)));
        yy.K(-1720121566, (Object)new qSYN((String)yy.p(-846067879)));
        yy.K(-1501100200, (Object)new qSYN((String)yy.p(1218905943)));
        yy.K(1732314918, (Object)new qSYN((String)yy.p(-723843283)));
        yy.K(878053164, (Object)new qSYN((String)yy.p(5900075)));
        yy.K(789907242, (Object)new qSYN((String)yy.p(-57342175)));
        yy.K(-1485961440, (Object)new qSYN((String)yy.p(-1059977441)));
        yy.K(-1433401490, (Object)new qSYN((String)yy.p(853935989)));
        yy.K(-1588983948, (Object)new qSYN((String)yy.p(-1078065293)));
        yy.K(-1372846222, (Object)new qSYN((String)yy.p(441124713)));
        yy.K(-1890449560, (Object)new qSYN((String)yy.p(460130151)));
        yy.K(1479542646, (Object)new qSYN((String)yy.p(-1509750915)));
        yy.K(-595392644, (Object)new qSYN((String)yy.p(-293533829)));
        yy.K(1999177551, new qSYN[]{(qSYN)((Object)yy.p(1606551326)), (qSYN)((Object)yy.p(155911972)), (qSYN)((Object)yy.p(-1720121566)), (qSYN)((Object)yy.p(-1501100200)), (qSYN)((Object)yy.p(1732314918)), (qSYN)((Object)yy.p(878053164)), (qSYN)((Object)yy.p(789907242)), (qSYN)((Object)yy.p(-1485961440)), (qSYN)((Object)yy.p(-1433401490)), (qSYN)((Object)yy.p(-1588983948)), (qSYN)((Object)yy.p(-1372846222)), (qSYN)((Object)yy.p(-1890449560)), (qSYN)((Object)yy.p(1479542646)), (qSYN)((Object)yy.p(-595392644))});
    }

    private static Object VR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

