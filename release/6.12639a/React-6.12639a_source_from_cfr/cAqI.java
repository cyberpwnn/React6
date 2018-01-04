/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class cAqI
extends Enum<cAqI> {
    public static final /* enum */ cAqI nfMO;
    public static final /* enum */ cAqI lWVI;
    public static final /* enum */ cAqI aVuB;
    private static final /* synthetic */ cAqI[] VWVn;

    static {
        o.w(676936464, (Object)new cAqI(mrFx$WjFM.d("\u3d57"), 0));
        o.w(-714065138, (Object)new cAqI(mrFx$WjFM.d("\u3d56"), 1));
        o.w(1399995148, (Object)new cAqI(mrFx$WjFM.d("\u3d55"), 2));
        o.w(-354927861, new cAqI[]{(cAqI)((Object)o.k(676936464)), (cAqI)((Object)o.k(-714065138)), (cAqI)((Object)o.k(1399995148))});
    }

    private cAqI(String string2, int n2) {
    }

    public static cAqI[] values() {
        cAqI[] arrcAqI = (cAqI[])o.k(-354927861);
        int n = arrcAqI.length;
        cAqI[] arrcAqI2 = new cAqI[n];
        cAqI.Hr(arrcAqI, false, arrcAqI2, false, n);
        return arrcAqI2;
    }

    public static cAqI valueOf(String string) {
        return (cAqI)((Object)cAqI.Hr(cAqI.class, string));
    }

    private static Object Hr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

