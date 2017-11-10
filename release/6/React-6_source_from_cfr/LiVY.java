/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class LiVY {
    protected static UlAU FNaF;
    private static PBUD<wncc> nmFf;
    private static PBUD<wncc> Cfye;
    private static BIwj SnXt;
    private static YMXK ivfy;
    private static Thread cdVQ;

    static {
        yy.K(-438434189, null);
        yy.K(-25361650, new PBUD());
        yy.K(979239699, new PBUD());
        LiVY.startup();
    }

    public static void mXJp(Listener listener) {
        LiVY.Ys().getPluginManager().registerEvents(listener, (Plugin)LiVY.Ys(LiVY.Ahus()));
    }

    public static void unregister(Listener listener) {
        LiVY.Ys(listener);
    }

    public static File WNxt(String string) {
        return new File((File)LiVY.Ys(LiVY.Ys(LiVY.Ahus())), string);
    }

    public static File aCmQ() {
        return LiVY.Ys(LiVY.Ys(LiVY.Ahus()));
    }

    public static File XJTi() {
        Object object = LiVY.Ys(LiVY.Ys(LiVY.Ys(LiVY.Ahus())));
        Object object2 = LiVY.Ys(LiVY.Ys(LiVY.Ys(LiVY.Ahus())));
        return new File((File)object, (String)object2);
    }

    public static File yJLL(Plugin plugin) {
        Object object = LiVY.Ys(plugin.getDataFolder());
        Object object2 = LiVY.Ys(plugin.getName(), plugin);
        return new File((File)object, (String)object2);
    }

    private static void startup() {
        BIwj bIwj = new BIwj();
        yy.K(-87489763, bIwj);
        LiVY.mXJp(bIwj);
        YMXK yMXK = new YMXK();
        yy.K(-368180458, yMXK);
        LiVY.mXJp(yMXK);
    }

    public static Thread YMXK() {
        return (Thread)yy.p(-1854143717);
    }

    public static PBUD<wncc> eimG() {
        return (PBUD)yy.p(-25361650);
    }

    public static PBUD<wncc> xWpV() {
        return (PBUD)yy.p(979239699);
    }

    public static void mXJp(wncc wncc2) {
        if (LiVY.Ys(LiVY.Ys(wncc2), bqhA.class) != false) {
            LiVY.Ys((PBUD)yy.p(979239699), wncc2);
            return;
        }
        LiVY.Ys((PBUD)yy.p(-25361650), wncc2);
    }

    public static void ksfs(wncc wncc2) {
        if (LiVY.Ys(LiVY.Ys(wncc2), bqhA.class) != false) {
            LiVY.Ys((PBUD)yy.p(979239699), wncc2);
            return;
        }
        LiVY.Ys((PBUD)yy.p(-25361650), wncc2);
    }

    public static UlAU mXJp(upkX upkX2) {
        if (LiVY.isMainThread()) {
            yy.K(-1854143717, LiVY.Ys());
        }
        return new UlAU(upkX2);
    }

    public static boolean isMainThread() {
        return (boolean)LiVY.Ys();
    }

    protected static void NVIs() {
        yy.K(-438434189, null);
    }

    public static boolean HBur() {
        if (LiVY.Ahus() != null) {
            if (LiVY.Ys(LiVY.Ahus()) != false) {
                return true;
            }
        }
        return false;
    }

    public static UlAU Ahus() {
        return (UlAU)yy.p(-438434189);
    }

    public static BIwj xGPN() {
        return (BIwj)yy.p(-87489763);
    }

    public static YMXK hruU() {
        return (YMXK)yy.p(-368180458);
    }

    private static Object Ys(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

