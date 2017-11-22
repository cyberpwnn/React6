/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class JbuU$vtFs
extends Enum<JbuU$vtFs> {
    public static final /* enum */ JbuU$vtFs JKYC;
    public static final /* enum */ JbuU$vtFs RlbT;
    public static final /* enum */ JbuU$vtFs yLNn;
    public static final /* enum */ JbuU$vtFs YXDj;
    private static final /* synthetic */ JbuU$vtFs[] fTwl;

    static {
        cv.V(1466169230, (Object)new JbuU$vtFs(KUXS$dwji.S("\u8739\u8d23\u18e9\uc4ad\uf5a2\u5b3b\u8275\ua825\u772e\u84fb\u3d68\u2db2\u2acb\ud8ee"), 0));
        cv.V(1009973129, (Object)new JbuU$vtFs(KUXS$dwji.S("\u8739\u8d23\u18e9\uc4ad\uf5a2\u5b3b\u8275\ua825\u772e\u84e8\u3d68\u2db2\u2acf"), 1));
        cv.V(-1428490360, (Object)new JbuU$vtFs(KUXS$dwji.S("\u872f\u8d2f\u18ea\uc4bd\uf5a8\u5b3d\u8279\ua839\u773f\u84ed\u3d65"), 2));
        cv.V(206763915, (Object)new JbuU$vtFs(KUXS$dwji.S("\u8728\u8d29\u18f4\uc4b7\uf5b9\u5b28\u8272\ua83a\u7734"), 3));
        cv.V(947124106, new JbuU$vtFs[]{(JbuU$vtFs)((Object)cv.e(1466169230)), (JbuU$vtFs)((Object)cv.e(1009973129)), (JbuU$vtFs)((Object)cv.e(-1428490360)), (JbuU$vtFs)((Object)cv.e(206763915))});
    }

    private JbuU$vtFs(String string2, int n2) {
    }

    public static JbuU$vtFs[] values() {
        JbuU$vtFs[] arrjbuU$vtFs = (JbuU$vtFs[])cv.e(947124106);
        int n = arrjbuU$vtFs.length;
        JbuU$vtFs[] arrjbuU$vtFs2 = new JbuU$vtFs[n];
        JbuU$vtFs.Zg(arrjbuU$vtFs, false, arrjbuU$vtFs2, false, n);
        return arrjbuU$vtFs2;
    }

    public static JbuU$vtFs valueOf(String string) {
        return (JbuU$vtFs)((Object)JbuU$vtFs.Zg(JbuU$vtFs.class, string));
    }

    private static Object Zg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

