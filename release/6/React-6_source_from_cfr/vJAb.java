/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public final class vJAb
extends Enum<vJAb> {
    public static final /* enum */ vJAb ynAL;
    public static final /* enum */ vJAb XTPd;
    public static final /* enum */ vJAb OtJd;
    public static final /* enum */ vJAb MvTc;
    public static final /* enum */ vJAb FiPL;
    private String name;
    private static final /* synthetic */ vJAb[] ELYq;

    static {
        cv.V(-572983633, (Object)new vJAb(YEBy$TyVf.W("\u0bfd\u32c4\u6dd5\u3d33\uf5bc"), 0, YEBy$TyVf.W("\u0bfd\u32e4\u6df5\u3d13\uf59c")));
        cv.V(-2000423250, (Object)new vJAb(YEBy$TyVf.W("\u0bed\u32c4\u6dd7\u3d3a"), 1, YEBy$TyVf.W("\u0bed\u32e4\u6df3\u3d0b\uf5a9\u9198\u2356\uf500\ueb12\u2b76\u88b0\ubdda\u564e\u0987\uc560\ued9e\u66d2\uc52b")));
        cv.V(906557097, (Object)new vJAb(YEBy$TyVf.W("\u0bfc\u32ca\u6dd2\u3d33\uf5ac\u91ae\u236b\uf527\ueb25"), 2, YEBy$TyVf.W("\u0bfc\u32ea\u6df2\u3d13\uf58c\u91ae\u234b\uf507\ueb05")));
        cv.V(-784730456, (Object)new vJAb(YEBy$TyVf.W("\u0bfb\u32d7\u6dcf\u3d2b\uf5a7\u91a7\u2366\uf52c"), 3, YEBy$TyVf.W("\u0bfb\u32f7\u6def\u3d0b\uf587\u9188\u2340\uf502\ueb3d\u2b48\u88bd")));
        cv.V(1228011179, (Object)new vJAb(YEBy$TyVf.W("\u0be8\u32cc\u6dd4\u3d36\uf5b2\u91ae\u2361\uf53d"), 4, YEBy$TyVf.W("\u0be8\u32ec\u6df4\u3d16\uf592\u918e\u2341\uf51d")));
        cv.V(-578423126, new vJAb[]{(vJAb)((Object)cv.e(-572983633)), (vJAb)((Object)cv.e(-2000423250)), (vJAb)((Object)cv.e(906557097)), (vJAb)((Object)cv.e(-784730456)), (vJAb)((Object)cv.e(1228011179))});
    }

    private vJAb(String string2, int n2, String string3) {
        this.name = string2;
    }

    public boolean exists() {
        if (vJAb.et().getPluginManager().getPlugin((String)cv.b((Object)this, 181401237)) != null) {
            return true;
        }
        return false;
    }

    public static vJAb[] values() {
        vJAb[] arrvJAb = (vJAb[])cv.e(-578423126);
        int n = arrvJAb.length;
        vJAb[] arrvJAb2 = new vJAb[n];
        vJAb.et(arrvJAb, false, arrvJAb2, false, n);
        return arrvJAb2;
    }

    public static vJAb valueOf(String string) {
        return (vJAb)((Object)vJAb.et(vJAb.class, string));
    }

    private static Object et(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

