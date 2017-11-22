/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class OikN
extends Enum<OikN> {
    public static final /* enum */ OikN jWgW;
    public static final /* enum */ OikN OGxH;
    public static final /* enum */ OikN LaRg;
    private static final /* synthetic */ OikN[] qBiS;

    public static OikN[] values() {
        return (OikN[])((OikN[])cv.e(1548226641)).clone();
    }

    public static OikN valueOf(String string) {
        return (OikN)((Object)OikN.El(OikN.class, string));
    }

    private OikN() {
    }

    public boolean ssNb(HCSq hCSq) {
        if (OikN.El(hCSq, (HCSq)((Object)cv.e(1020727400))) != false) {
            switch (((int[])cv.e(-797241238))[this.ordinal()]) {
                case 1: {
                    return true;
                }
                case 2: {
                    return true;
                }
                case 3: {
                    return false;
                }
            }
        }
        switch (((int[])cv.e(-797241238))[this.ordinal()]) {
            case 1: {
                return true;
            }
            case 2: {
                return false;
            }
            case 3: {
                return true;
            }
        }
        return false;
    }

    static {
        cv.V(-1014689706, (Object)new OikN());
        cv.V(979963991, (Object)new OikN());
        cv.V(-428666795, (Object)new OikN());
        cv.V(1548226641, new OikN[]{(OikN)((Object)cv.e(-1014689706)), (OikN)((Object)cv.e(979963991)), (OikN)((Object)cv.e(-428666795))});
    }

    private static Object El(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

