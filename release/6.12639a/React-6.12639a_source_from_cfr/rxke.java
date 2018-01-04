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

public class rxke {
    protected static fTHU suFj;
    private static feCR<qSgW> iEFK;
    private static feCR<qSgW> mQRT;
    private static EeKu aWBD;
    private static sILv nCTD;
    private static Thread gaBq;

    static {
        o.w(-1384559341, null);
        o.w(-1430500274, new feCR());
        o.w(2017741901, new feCR());
        rxke.startup();
    }

    public static void yJLS(Listener listener) {
        rxke.AE().getPluginManager().registerEvents(listener, (Plugin)rxke.AE(rxke.EBjP()));
    }

    public static void unregister(Listener listener) {
        rxke.AE(listener);
    }

    public static File IgvC(String string) {
        return new File((File)rxke.AE(rxke.AE(rxke.EBjP())), string);
    }

    public static File LOqF() {
        return rxke.AE(rxke.AE(rxke.EBjP()));
    }

    public static File opGo() {
        Object object = rxke.AE(rxke.AE(rxke.AE(rxke.EBjP())));
        Object object2 = rxke.AE(rxke.AE(rxke.AE(rxke.EBjP())));
        return new File((File)object, (String)object2);
    }

    public static File VwLY(Plugin plugin) {
        Object object = rxke.AE(plugin.getDataFolder());
        Object object2 = rxke.AE(plugin.getName(), plugin);
        return new File((File)object, (String)object2);
    }

    private static void startup() {
        EeKu eeKu = new EeKu();
        o.w(1923501145, eeKu);
        rxke.yJLS(eeKu);
        sILv sILv2 = new sILv();
        o.w(484068440, sILv2);
        rxke.yJLS(sILv2);
    }

    public static Thread DbLk() {
        return (Thread)o.k(134827095);
    }

    public static feCR<qSgW> GQbv() {
        return (feCR)o.k(-1430500274);
    }

    public static feCR<qSgW> rxpT() {
        return (feCR)o.k(2017741901);
    }

    public static void yJLS(qSgW qSgW2) {
        if (rxke.AE(rxke.AE(qSgW2), tvby.class) != false) {
            rxke.AE((feCR)o.k(2017741901), qSgW2);
            return;
        }
        rxke.AE((feCR)o.k(-1430500274), qSgW2);
    }

    public static void UtIU(qSgW qSgW2) {
        if (rxke.AE(rxke.AE(qSgW2), tvby.class) != false) {
            rxke.AE((feCR)o.k(2017741901), qSgW2);
            return;
        }
        rxke.AE((feCR)o.k(-1430500274), qSgW2);
    }

    public static fTHU yJLS(NxWm nxWm) {
        if (rxke.isMainThread()) {
            o.w(134827095, rxke.AE());
        }
        return new fTHU(nxWm);
    }

    public static boolean isMainThread() {
        return (boolean)rxke.AE();
    }

    protected static void uqWq() {
        o.w(-1384559341, null);
    }

    public static boolean Ipxq() {
        if (rxke.EBjP() != null) {
            if (rxke.AE(rxke.EBjP()) != false) {
                return true;
            }
        }
        return false;
    }

    public static fTHU EBjP() {
        return (fTHU)o.k(-1384559341);
    }

    public static EeKu OrkN() {
        return (EeKu)o.k(1923501145);
    }

    public static sILv kQxI() {
        return (sILv)o.k(484068440);
    }

    private static Object AE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

