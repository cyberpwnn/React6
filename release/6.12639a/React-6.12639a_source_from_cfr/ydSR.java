/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.ConsoleCommandSender
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.ConsoleCommandSender;

public class ydSR {
    private static feCR<String> drBn;
    private static boolean uPmu;
    private static int kdsc;

    static {
        o.w(-1213318372, new feCR());
        o.w(633289499, false);
        o.w(-1268171990, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void flush() {
        while (ydSR.lS((feCR)o.k(-1213318372)) == false) {
            ydSR.lS().getConsoleSender().sendMessage((String)ydSR.lS((feCR)o.k(-1213318372)));
        }
    }

    private static void VwLY(String string, String string2) {
        Object object = ydSR.lS(ydSR.lS(new StringBuilder(mrFx$WjFM.d("\u3c9a\u472c\u6bce\u5fd0\u0f90\u336a\ue711")), string2));
        if (ydSR.lS() != false) {
            ydSR.lS().getConsoleSender().sendMessage((String)object);
            return;
        }
        ydSR.lS((feCR)o.k(-1213318372), ydSR.lS(ydSR.lS(ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u3c93\u4708\u6bfc\u5fea\u0faa\u3313\ue76c\u6e9c")), (psKX)((Object)o.k(-1880078855))), object)));
    }

    public static void UtIU(Object object, String string) {
        ydSR.cKHH();
        if (!((Boolean)o.k(633289499)).booleanValue()) {
            return;
        }
        ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1118678018))), nJPf$sILv.G("\u9b61\u0e3a\u470c\ue04b\ua23b"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), string)));
    }

    public static void biLo(Object object, String string) {
        ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1868409976))), nJPf$sILv.G("\ud67c\u1d9c\u7ac6\u0e24\u09e4"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), string)));
    }

    private static void cKHH() {
        if ((Integer)o.k(-1268171990) == 0) {
            o.w(633289499, (boolean)ydSR.lS(new File(mrFx$WjFM.d("\ue8d5\ue18f\u8e5b\uf8b6\ufc3d\u1d77"))));
        }
        int n = (Integer)o.k(-1268171990) + 1;
        o.w(-1268171990, n);
        if (n > 20) {
            o.w(-1268171990, 0);
        }
    }

    public static void VwLY(Object object, String string) {
        ydSR.cKHH();
        if (((Boolean)o.k(633289499)).booleanValue()) {
            ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u3c9a\u472c\u6bce\u5fd0\u0f90"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), string)));
        }
    }

    public static void TEqA(Object object, String string) {
        ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(568215020))), mrFx$WjFM.d("\u5c3d\udde8\u8894\u0449\uf921"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(2144817739))), string)));
    }

    public static void KTiK(Object object, String string) {
        ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(568215020))), nJPf$sILv.G("\u7ba8\u8330\u31e0\ue36f\u7d32"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(568215020))), string)));
    }

    public static void aeiw(String string) {
        ydSR.cKHH();
        if (!((Boolean)o.k(633289499)).booleanValue()) {
            return;
        }
        if (ydSR.lS() == false) {
            ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1118678018))), mrFx$WjFM.d("\u989c\u4c84\ubdeb\u9fb7\ue5f8"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), string)));
            return;
        }
        ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1118678018))), mrFx$WjFM.d("\u989c\u4c84\ubdeb\u9fb7\ue5f8"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), string)));
    }

    public static void TOGS(String string) {
        if (ydSR.lS() == false) {
            ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1868409976))), FMkR$WjFM.a("\u8eaa\u1224\u6b9b\u720b\ud2a6"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), string)));
            return;
        }
        ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1868409976))), FMkR$WjFM.a("\u8eaa\u1224\u6b9b\u720b\ud2a6"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), string)));
    }

    public static void TFUi(String string) {
        ydSR.cKHH();
        if (!((Boolean)o.k(633289499)).booleanValue()) {
            return;
        }
        if (ydSR.lS() == false) {
            ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u04df\u1e7c\u4dfd\u6a37\u4502"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), string)));
            return;
        }
        ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u04df\u1e7c\u4dfd\u6a37\u4502"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), string)));
    }

    public static void nJPf(String string) {
        if (ydSR.lS() == false) {
            ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(568215020))), nJPf$sILv.G("\ud76e\ue66d\ud59f\uc984\u2767"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(2144817739))), string)));
            return;
        }
        ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(568215020))), nJPf$sILv.G("\ud76e\ue66d\ud59f\uc984\u2767"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(2144817739))), string)));
    }

    public static void miQG(String string) {
        if (ydSR.lS() == false) {
            ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(568215020))), FMkR$WjFM.a("\u164b\uf002\u5e1e\u07fd\uac71"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(568215020))), string)));
            return;
        }
        ydSR.VwLY((String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(568215020))), FMkR$WjFM.a("\u164b\uf002\u5e1e\u07fd\uac71"))), (String)ydSR.lS(ydSR.lS(ydSR.lS(new StringBuilder(), (psKX)((Object)o.k(568215020))), string)));
    }

    private static Object lS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

