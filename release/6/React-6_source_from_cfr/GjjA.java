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

public class GjjA {
    protected static QMsU wUhb;
    private static wfPa<XSJd> GtRr;
    private static wfPa<XSJd> gExy;
    private static kbqG UuKe;
    private static dfmS pQSt;
    private static Thread lxMF;

    static {
        cv.V(2034365621, null);
        cv.V(-1551174447, new wfPa());
        cv.V(-253168432, new wfPa());
        GjjA.startup();
    }

    public static void ssNb(Listener listener) {
        GjjA.bB().getPluginManager().registerEvents(listener, (Plugin)GjjA.bB(GjjA.kkap()));
    }

    public static void unregister(Listener listener) {
        GjjA.bB(listener);
    }

    public static File KUKx(String string) {
        return new File((File)GjjA.bB(GjjA.bB(GjjA.kkap())), string);
    }

    public static File WaHe() {
        return GjjA.bB(GjjA.bB(GjjA.kkap()));
    }

    public static File qdbP() {
        Object object = GjjA.bB(GjjA.bB(GjjA.bB(GjjA.kkap())));
        Object object2 = GjjA.bB(GjjA.bB(GjjA.bB(GjjA.kkap())));
        return new File((File)object, (String)object2);
    }

    public static File IWSm(Plugin plugin) {
        Object object = GjjA.bB(plugin.getDataFolder());
        Object object2 = GjjA.bB(plugin.getName(), plugin);
        return new File((File)object, (String)object2);
    }

    private static void startup() {
        kbqG kbqG2 = new kbqG();
        cv.V(-250284833, kbqG2);
        GjjA.ssNb(kbqG2);
        dfmS dfmS2 = new dfmS();
        cv.V(-1901267746, dfmS2);
        GjjA.ssNb(dfmS2);
    }

    public static Thread NUlw() {
        return (Thread)cv.e(-1243351847);
    }

    public static wfPa<XSJd> lTrT() {
        return (wfPa)cv.e(-1551174447);
    }

    public static wfPa<XSJd> GkMB() {
        return (wfPa)cv.e(-253168432);
    }

    public static void ssNb(XSJd xSJd) {
        if (GjjA.bB(GjjA.bB(xSJd), lDTo.class) != false) {
            GjjA.bB((wfPa)cv.e(-253168432), xSJd);
            return;
        }
        GjjA.bB((wfPa)cv.e(-1551174447), xSJd);
    }

    public static void DYFV(XSJd xSJd) {
        if (GjjA.bB(GjjA.bB(xSJd), lDTo.class) != false) {
            GjjA.bB((wfPa)cv.e(-253168432), xSJd);
            return;
        }
        GjjA.bB((wfPa)cv.e(-1551174447), xSJd);
    }

    public static QMsU ssNb(dVMt dVMt2) {
        if (GjjA.isMainThread()) {
            cv.V(-1243351847, GjjA.bB());
        }
        return new QMsU(dVMt2);
    }

    public static boolean isMainThread() {
        return (boolean)GjjA.bB();
    }

    protected static void aMCk() {
        cv.V(2034365621, null);
    }

    public static boolean XSJd() {
        if (GjjA.kkap() != null) {
            if (GjjA.bB(GjjA.kkap()) != false) {
                return true;
            }
        }
        return false;
    }

    public static QMsU kkap() {
        return (QMsU)cv.e(2034365621);
    }

    public static kbqG gyID() {
        return (kbqG)cv.e(-250284833);
    }

    public static dfmS kbqG() {
        return (dfmS)cv.e(-1901267746);
    }

    private static Object bB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

