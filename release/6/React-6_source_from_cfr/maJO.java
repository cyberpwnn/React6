/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class maJO
extends Enum<maJO> {
    public static final /* enum */ maJO OQhj;
    public static final /* enum */ maJO iwfj;
    public static final /* enum */ maJO xPmi;
    private static final /* synthetic */ maJO[] NqJM;

    static {
        cv.V(-495126889, (Object)new maJO(KUXS$dwji.S("\u3110"), 0));
        cv.V(-1337395567, (Object)new maJO(KUXS$dwji.S("\u3111"), 1));
        cv.V(-2022902125, (Object)new maJO(KUXS$dwji.S("\u3112"), 2));
        cv.V(-1736706414, new maJO[]{(maJO)((Object)cv.e(-495126889)), (maJO)((Object)cv.e(-1337395567)), (maJO)((Object)cv.e(-2022902125))});
    }

    private maJO(String string2, int n2) {
    }

    public static maJO[] values() {
        maJO[] arrmaJO = (maJO[])cv.e(-1736706414);
        int n = arrmaJO.length;
        maJO[] arrmaJO2 = new maJO[n];
        maJO.um(arrmaJO, false, arrmaJO2, false, n);
        return arrmaJO2;
    }

    public static maJO valueOf(String string) {
        return (maJO)((Object)maJO.um(maJO.class, string));
    }

    private static Object um(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

