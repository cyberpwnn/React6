/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;

public class CgHM
extends UtLV {
    public CgHM() {
        super(Long.class, (yuDM)((Object)o.k(1956463743)));
    }

    public void set(Long l) {
        CgHM.qK(this.IFSe());
        CgHM.qK(this.IFSe(), l);
    }

    public long get() {
        if (CgHM.qK(this.IFSe()) != false) {
            return 10000;
        }
        return (long)CgHM.qK((Long)CgHM.qK(this.IFSe()).next());
    }

    @Override
    public int KTiK(CommandSender commandSender, String string) throws JYyP {
        Object object = 10000;
        double d = 1.0;
        String string2 = "";
        if (CgHM.qK(CgHM.qK(string), mrFx$WjFM.d("\u7196\u132f")) != false) {
            d = 1.0;
            string2 = mrFx$WjFM.d("\u7196\u132f");
        } else if (CgHM.qK(CgHM.qK(string), mrFx$WjFM.d("\u718f")) != false) {
            d = 50.0;
            string2 = mrFx$WjFM.d("\u718f");
        } else if (CgHM.qK(CgHM.qK(string), mrFx$WjFM.d("\u7188")) != false) {
            d = 1000.0;
            string2 = mrFx$WjFM.d("\u7188");
        } else if (CgHM.qK(CgHM.qK(string), mrFx$WjFM.d("\u7196")) != false) {
            d = 60000.0;
            string2 = mrFx$WjFM.d("\u7196");
        } else if (CgHM.qK(CgHM.qK(string), mrFx$WjFM.d("\u7193")) != false) {
            d = 3600000.0;
            string2 = mrFx$WjFM.d("\u7193");
        } else if (CgHM.qK(CgHM.qK(string), mrFx$WjFM.d("\u719f")) != false) {
            d = 8.64E7;
            string2 = mrFx$WjFM.d("\u719f");
        }
        Object object2 = CgHM.qK(CgHM.qK(CgHM.qK(string), false, CgHM.qK(string) - CgHM.qK(string2)));
        try {
            Object object3 = CgHM.qK(CgHM.qK(object2));
            object = object3 * d;
        }
        catch (NumberFormatException numberFormatException) {
            throw new JYyP((String)CgHM.qK(CgHM.qK(CgHM.qK(CgHM.qK(new StringBuilder(mrFx$WjFM.d("\u71ae\u1332\ubc77\ub96b\ud958\u15e1\u0d64\u3374\u4449\uacf1\u7af7\u4de4\u3053\u0d93\ua0a1\uae42\u1178")), string), mrFx$WjFM.d("\u71db\u133a\ubc79\ub97b\ud914\u15ea\u0d31\u336d\u4444\uacb4\u7af5\u4da5")), object2)));
        }
        this.set((Long)CgHM.qK(object));
        return 0;
    }

    @Override
    public String getName() {
        return nJPf$sILv.G("\u615c\u716d\ua909\u45a8");
    }

    private static Object qK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

