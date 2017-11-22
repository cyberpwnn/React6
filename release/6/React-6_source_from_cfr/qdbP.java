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

public class qdbP {
    public static qdbP$ssNb wevJ() {
        if (qdbP.sx(qdbP.sx(), YEBy$TyVf.W("\u74be\u5270\u4042\u9d78")) != false) {
            return (qdbP$ssNb)((Object)cv.e(1374942352));
        }
        if (qdbP.sx(qdbP.sx(), YEBy$TyVf.W("\u74be\u5270\u4042\u9d7b")) != false) {
            return (qdbP$ssNb)((Object)cv.e(-1418464110));
        }
        if (qdbP.sx(qdbP.sx(), YEBy$TyVf.W("\u74be\u5270\u4042\u9d79")) != false) {
            return (qdbP$ssNb)((Object)cv.e(-677448557));
        }
        if (qdbP.sx(qdbP.sx(), YEBy$TyVf.W("\u74be\u5270\u404a")) != false) {
            return (qdbP$ssNb)((Object)cv.e(-360713071));
        }
        if (qdbP.sx(qdbP.sx(), YEBy$TyVf.W("\u74be\u5270\u404b")) != false) {
            return (qdbP$ssNb)((Object)cv.e(1706030230));
        }
        return (qdbP$ssNb)((Object)cv.e(-1824131945));
    }

    public static void ssNb(Player player, Integer n, Integer n2, Integer n3, String string, String string2) {
        if (qdbP.sx(qdbP.wevJ(), (qdbP$ssNb)((Object)cv.e(-1824131945))) != false) {
            return;
        }
        try {
            qdbP.sx(player, n, n2, n3, string, string2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void LGKl(Player player) {
        if (qdbP.sx(qdbP.wevJ(), (qdbP$ssNb)((Object)cv.e(-1824131945))) != false) {
            return;
        }
        try {
            qdbP.sx(player, qdbP.sx(20), qdbP.sx(20), qdbP.sx(10), KUXS$dwji.S("\u4c4e"), KUXS$dwji.S("\u4c4e"));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void ssNb(Player player, String string) {
        if (qdbP.sx(qdbP.wevJ(), (qdbP$ssNb)((Object)cv.e(-1824131945))) != false) {
            return;
        }
        try {
            qdbP.sx(player, string);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            qdbP.sx(exception);
            return;
        }
    }

    private static Object sx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

