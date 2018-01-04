/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;

public class JQxi {
    public static JQxi$yJLS ofuG() {
        if (JQxi.jl(JQxi.jl(), FMkR$WjFM.a("\ufaca\ufa53\u83dc\u00c0")) != false) {
            return (JQxi$yJLS)((Object)o.k(-883077859));
        }
        if (JQxi.jl(JQxi.jl(), FMkR$WjFM.a("\ufaca\ufa53\u83dc\u00c3")) != false) {
            return (JQxi$yJLS)((Object)o.k(1036012827));
        }
        if (JQxi.jl(JQxi.jl(), FMkR$WjFM.a("\ufaca\ufa53\u83dc\u00c1")) != false) {
            return (JQxi$yJLS)((Object)o.k(1296125212));
        }
        if (JQxi.jl(JQxi.jl(), FMkR$WjFM.a("\ufaca\ufa53\u83d4")) != false) {
            return (JQxi$yJLS)((Object)o.k(-1253487330));
        }
        if (JQxi.jl(JQxi.jl(), FMkR$WjFM.a("\ufaca\ufa53\u83d5")) != false) {
            return (JQxi$yJLS)((Object)o.k(-1865134817));
        }
        return (JQxi$yJLS)((Object)o.k(-299348704));
    }

    public static void yJLS(Player player, Integer n, Integer n2, Integer n3, String string, String string2) {
        if (JQxi.jl(JQxi.ofuG(), (JQxi$yJLS)((Object)o.k(-299348704))) != false) {
            return;
        }
        try {
            JQxi.jl(player, n, n2, n3, string, string2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void IEpg(Player player) {
        if (JQxi.jl(JQxi.ofuG(), (JQxi$yJLS)((Object)o.k(-299348704))) != false) {
            return;
        }
        try {
            JQxi.jl(player, JQxi.jl(20), JQxi.jl(20), JQxi.jl(10), nJPf$sILv.G("\u5b99"), nJPf$sILv.G("\u5b99"));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void yJLS(Player player, String string) {
        if (JQxi.jl(JQxi.ofuG(), (JQxi$yJLS)((Object)o.k(-299348704))) != false) {
            return;
        }
        try {
            JQxi.jl(player, string);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            JQxi.jl(exception);
            return;
        }
    }

    private static Object jl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

