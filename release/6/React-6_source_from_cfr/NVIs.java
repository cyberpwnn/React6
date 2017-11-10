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

public class NVIs {
    public static NVIs$mXJp RIGg() {
        if (NVIs.MR(NVIs.MR(), NVIs$JbpD.H("\uaed1\u8d5a\uf541\ub7ae")) != false) {
            return (NVIs$mXJp)((Object)yy.p(342230600));
        }
        if (NVIs.MR(NVIs.MR(), NVIs$JbpD.H("\uaed1\u8d5a\uf541\ub7ad")) != false) {
            return (NVIs$mXJp)((Object)yy.p(-901380522));
        }
        if (NVIs.MR(NVIs.MR(), NVIs$JbpD.H("\uaed1\u8d5a\uf541\ub7af")) != false) {
            return (NVIs$mXJp)((Object)yy.p(-2071001507));
        }
        if (NVIs.MR(NVIs.MR(), NVIs$JbpD.H("\uaed1\u8d5a\uf549")) != false) {
            return (NVIs$mXJp)((Object)yy.p(-221903289));
        }
        if (NVIs.MR(NVIs.MR(), NVIs$JbpD.H("\uaed1\u8d5a\uf548")) != false) {
            return (NVIs$mXJp)((Object)yy.p(-1583479214));
        }
        return (NVIs$mXJp)((Object)yy.p(-1459616183));
    }

    public static void mXJp(Player player, Integer n, Integer n2, Integer n3, String string, String string2) {
        if (NVIs.MR(NVIs.RIGg(), (NVIs$mXJp)((Object)yy.p(-1459616183))) != false) {
            return;
        }
        try {
            NVIs.MR(player, n, n2, n3, string, string2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void yIkA(Player player) {
        if (NVIs.MR(NVIs.RIGg(), (NVIs$mXJp)((Object)yy.p(-1459616183))) != false) {
            return;
        }
        try {
            NVIs.MR(player, NVIs.MR(20), NVIs.MR(20), NVIs.MR(10), BkvY$LhxG.I("\u3e6f"), BkvY$LhxG.I("\u3e6f"));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void mXJp(Player player, String string) {
        if (NVIs.MR(NVIs.RIGg(), (NVIs$mXJp)((Object)yy.p(-1459616183))) != false) {
            return;
        }
        try {
            NVIs.MR(player, string);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            NVIs.MR(exception);
            return;
        }
    }

    private static Object MR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

