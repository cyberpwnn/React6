/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class GHiL
extends Enum<GHiL> {
    public static final /* enum */ GHiL Xlqt;
    public static final /* enum */ GHiL JchQ;
    public static final /* enum */ GHiL hsns;
    public static final /* enum */ GHiL prvK;
    public static final /* enum */ GHiL ieqG;
    public static final /* enum */ GHiL CWFN;
    private static final /* synthetic */ GHiL[] jytv;

    static {
        cv.V(2053829153, (Object)new GHiL(rgig$AWxc.r("\ucba4\u52b9\u2cd6"), 0));
        cv.V(-1670712793, (Object)new GHiL(rgig$AWxc.r("\ucbaf\u52b8\u2ccd\u0cb5\ufe45\ue59f\uc1e4"), 1));
        cv.V(28504611, (Object)new GHiL(rgig$AWxc.r("\ucbbe\u52a3\u2cd0\u0cb0\ufe4e\ue599"), 2));
        cv.V(1236529698, (Object)new GHiL(rgig$AWxc.r("\ucbbe\u52a3\u2cd0\u0cb0\ufe4e\ue599\uc1f5\u300e\u702f\uba0c\u6b74"), 3));
        cv.V(23917094, (Object)new GHiL(rgig$AWxc.r("\ucba9\u52b8\u2cd7\u0cbb\ufe4c\ue59b"), 4));
        cv.V(-694685152, (Object)new GHiL(rgig$AWxc.r("\ucba1\u52b8\u2ccc\u0cbe"), 5));
        cv.V(-221449683, new GHiL[]{(GHiL)((Object)cv.e(2053829153)), (GHiL)((Object)cv.e(-1670712793)), (GHiL)((Object)cv.e(28504611)), (GHiL)((Object)cv.e(1236529698)), (GHiL)((Object)cv.e(23917094)), (GHiL)((Object)cv.e(-694685152))});
    }

    private GHiL(String string2, int n2) {
    }

    public static GHiL[] values() {
        GHiL[] arrgHiL = (GHiL[])cv.e(-221449683);
        int n = arrgHiL.length;
        GHiL[] arrgHiL2 = new GHiL[n];
        GHiL.NC(arrgHiL, false, arrgHiL2, false, n);
        return arrgHiL2;
    }

    public static GHiL valueOf(String string) {
        return (GHiL)((Object)GHiL.NC(GHiL.class, string));
    }

    private static Object NC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

