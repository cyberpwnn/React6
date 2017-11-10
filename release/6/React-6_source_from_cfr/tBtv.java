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

public final class tBtv
extends Enum<tBtv> {
    public static final /* enum */ tBtv dVmK;
    public static final /* enum */ tBtv hlIu;
    public static final /* enum */ tBtv oWKt;
    public static final /* enum */ tBtv IOnN;
    public static final /* enum */ tBtv nukY;
    private String name;
    private static final /* synthetic */ tBtv[] WjYI;

    static {
        yy.K(-942209025, (Object)new tBtv(KDGY$JAHk.Y("\uae0c\ub906\ud2d3\u704d\ua3c6"), 0, KDGY$JAHk.Y("\uae0c\ub926\ud2f3\u706d\ua3e6")));
        yy.K(-982120448, (Object)new tBtv(KDGY$JAHk.Y("\uae1c\ub906\ud2d1\u7044"), 1, KDGY$JAHk.Y("\uae1c\ub926\ud2f5\u7075\ua3d3\ub0dd\u778d\ua596\u6d21\u08cd\u0d6f\u8c99\u9b54\ud5d8\u72ef\u4289\ua617\u914d")));
        yy.K(-250214315, (Object)new tBtv(KDGY$JAHk.Y("\uae0d\ub908\ud2d4\u704d\ua3d6\ub0eb\u77b0\ua5b1\u6d16"), 2, KDGY$JAHk.Y("\uae0d\ub928\ud2f4\u706d\ua3f6\ub0eb\u7790\ua591\u6d36")));
        yy.K(-636811186, (Object)new tBtv(KDGY$JAHk.Y("\uae0a\ub915\ud2c9\u7055\ua3dd\ub0e2\u77bd\ua5ba"), 3, KDGY$JAHk.Y("\uae0a\ub935\ud2e9\u7075\ua3fd\ub0cd\u779b\ua594\u6d0e\u08f3\u0d62")));
        yy.K(-399767469, (Object)new tBtv(KDGY$JAHk.Y("\uae19\ub90e\ud2d2\u7048\ua3c8\ub0eb\u77ba\ua5ab"), 4, KDGY$JAHk.Y("\uae19\ub92e\ud2f2\u7068\ua3e8\ub0cb\u779a\ua58b")));
        yy.K(-520615852, new tBtv[]{(tBtv)((Object)yy.p(-942209025)), (tBtv)((Object)yy.p(-982120448)), (tBtv)((Object)yy.p(-250214315)), (tBtv)((Object)yy.p(-636811186)), (tBtv)((Object)yy.p(-399767469))});
    }

    private tBtv(String string2, int n2, String string3) {
        this.name = string2;
    }

    public boolean exists() {
        if (tBtv.la().getPluginManager().getPlugin((String)yy.h((Object)this, -849672119)) != null) {
            return true;
        }
        return false;
    }

    public static tBtv[] values() {
        tBtv[] arrtBtv = (tBtv[])yy.p(-520615852);
        int n = arrtBtv.length;
        tBtv[] arrtBtv2 = new tBtv[n];
        tBtv.la(arrtBtv, false, arrtBtv2, false, n);
        return arrtBtv2;
    }

    public static tBtv valueOf(String string) {
        return (tBtv)((Object)tBtv.la(tBtv.class, string));
    }

    private static Object la(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

