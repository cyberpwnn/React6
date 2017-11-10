/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class XSFr
extends Enum<XSFr> {
    public static final /* enum */ XSFr VoQu;
    public static final /* enum */ XSFr GQcp;
    public static final /* enum */ XSFr BSVh;
    public static final /* enum */ XSFr yKBT;
    public static final /* enum */ XSFr GcGG;
    public static final /* enum */ XSFr DbPS;
    private static final /* synthetic */ XSFr[] cBVF;

    static {
        yy.K(1417537703, (Object)new XSFr(NVIs$JbpD.H("\u9b92\ub112\u101d"), 0));
        yy.K(1683024041, (Object)new XSFr(NVIs$JbpD.H("\u9b99\ub113\u1006\uc7e7\uba9f\uc177\ub89a"), 1));
        yy.K(1029105853, (Object)new XSFr(NVIs$JbpD.H("\u9b88\ub108\u101b\uc7e2\uba94\uc171"), 2));
        yy.K(-414062410, (Object)new XSFr(NVIs$JbpD.H("\u9b88\ub108\u101b\uc7e2\uba94\uc171\ub88b\uc524\uc88f\u7ab2\u653a"), 3));
        yy.K(-68687694, (Object)new XSFr(NVIs$JbpD.H("\u9b9f\ub113\u101c\uc7e9\uba96\uc173"), 4));
        yy.K(578742440, (Object)new XSFr(NVIs$JbpD.H("\u9b97\ub113\u1007\uc7ec"), 5));
        yy.K(731244731, new XSFr[]{(XSFr)((Object)yy.p(1417537703)), (XSFr)((Object)yy.p(1683024041)), (XSFr)((Object)yy.p(1029105853)), (XSFr)((Object)yy.p(-414062410)), (XSFr)((Object)yy.p(-68687694)), (XSFr)((Object)yy.p(578742440))});
    }

    private XSFr(String string2, int n2) {
    }

    public static XSFr[] values() {
        XSFr[] arrxSFr = (XSFr[])yy.p(731244731);
        int n = arrxSFr.length;
        XSFr[] arrxSFr2 = new XSFr[n];
        XSFr.JW(arrxSFr, false, arrxSFr2, false, n);
        return arrxSFr2;
    }

    public static XSFr valueOf(String string) {
        return (XSFr)((Object)XSFr.JW(XSFr.class, string));
    }

    private static Object JW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

