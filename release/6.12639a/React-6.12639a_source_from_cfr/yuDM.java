/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class yuDM
extends Enum<yuDM> {
    public static final /* enum */ yuDM XJoL;
    public static final /* enum */ yuDM EmlK;
    private static final /* synthetic */ yuDM[] vAch;

    static {
        o.w(679629488, (Object)new yuDM(mrFx$WjFM.d("\ue5d7\uaf33\ud6e9\u6c7f\ubace\ud974\ud003\u506f\udb4d"), 0));
        o.w(1956463743, (Object)new yuDM(mrFx$WjFM.d("\ue5c2\uaf37\ud6e1\u6c68\ubac0\ud974\ud003\u506f\udb4d"), 1));
        o.w(-881372497, new yuDM[]{(yuDM)((Object)o.k(679629488)), (yuDM)((Object)o.k(1956463743))});
    }

    private yuDM(String string2, int n2) {
    }

    public static yuDM[] values() {
        yuDM[] arryuDM = (yuDM[])o.k(-881372497);
        int n = arryuDM.length;
        yuDM[] arryuDM2 = new yuDM[n];
        yuDM.aE(arryuDM, false, arryuDM2, false, n);
        return arryuDM2;
    }

    public static yuDM valueOf(String string) {
        return (yuDM)((Object)yuDM.aE(yuDM.class, string));
    }

    private static Object aE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

