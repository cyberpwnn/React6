/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class VwLY {
    private static final String TpxX = mrFx$WjFM.d("\u2391\uf139\u25fd\u8968\u9ab0\u1d52\ua9cf\u83ca\u8192\ufb12");
    public static final ResourceBundle QWNe;
    public static ResourceBundle EeMj;

    static {
        Object object = VwLY.vP(mrFx$WjFM.d("\u2391\uf139\u25fd\u8968\u9ab0\u1d52\ua9cf\u83ca\u8192\ufb12"));
        o.w(-110929521, object);
        o.w(-1137288818, object);
    }

    private VwLY() {
    }

    public static String getString(String string) {
        try {
            return VwLY.vP((ResourceBundle)o.k(-1137288818), string);
        }
        catch (MissingResourceException missingResourceException) {
            try {
                return VwLY.vP((ResourceBundle)o.k(-110929521), string);
            }
            catch (MissingResourceException missingResourceException2) {
                return VwLY.vP(VwLY.vP(VwLY.vP(new StringBuilder(nJPf$sILv.G("\u2fa1")), string), 33));
            }
        }
    }

    private static Object vP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

