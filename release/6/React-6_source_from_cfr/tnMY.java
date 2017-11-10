/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class tnMY
extends Enum<tnMY> {
    public static final /* enum */ tnMY eQwA;
    public static final /* enum */ tnMY BwFW;
    public static final /* enum */ tnMY KEkk;
    public static final /* enum */ tnMY iodi;
    public static final /* enum */ tnMY MnUs;
    private static final /* synthetic */ tnMY[] RdRE;

    static {
        yy.K(-2089942431, (Object)new tnMY(NVIs$JbpD.H("\ub6e0\u5218\ub891\u5fca\u8cf2"), 0));
        yy.K(-1443167638, (Object)new tnMY(NVIs$JbpD.H("\ub6f6\u5202\ub891\u5fda\u8cea\u70f3"), 1));
        yy.K(523567711, (Object)new tnMY(NVIs$JbpD.H("\ub6f7\u5205\ub883\u5fd9\u8ce4\u70fa\ufd8e"), 2));
        yy.K(561316448, (Object)new tnMY(NVIs$JbpD.H("\ub6e0\u5218\ub89f\u5fc8"), 3));
        yy.K(1959068085, (Object)new tnMY(NVIs$JbpD.H("\ub6e1\u5219\ub89e\u5fd6\u8cef\u70f8\ufd8c"), 4));
        yy.K(-1655963218, new tnMY[]{(tnMY)((Object)yy.p(-2089942431)), (tnMY)((Object)yy.p(-1443167638)), (tnMY)((Object)yy.p(523567711)), (tnMY)((Object)yy.p(561316448)), (tnMY)((Object)yy.p(1959068085))});
    }

    private tnMY(String string2, int n2) {
    }

    public static tnMY[] values() {
        tnMY[] arrtnMY = (tnMY[])yy.p(-1655963218);
        int n = arrtnMY.length;
        tnMY[] arrtnMY2 = new tnMY[n];
        tnMY.Ff(arrtnMY, false, arrtnMY2, false, n);
        return arrtnMY2;
    }

    public static tnMY valueOf(String string) {
        return (tnMY)((Object)tnMY.Ff(tnMY.class, string));
    }

    private static Object Ff(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

