/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.PluginCommand
 *  org.bukkit.command.SimpleCommandMap
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.RegisteredListener
 */
import java.io.File;
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.URLClassLoader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredListener;

public class TFUi
extends Thread {
    private Plugin plugin;
    private File LjJH;
    private Runnable VDbF;

    public TFUi(Plugin plugin, File file, Runnable runnable) {
        this.plugin = plugin;
        this.LjJH = file;
        this.VDbF = runnable;
    }

    @Override
    public void run() {
        Object object;
        Object object2;
        Object object32;
        Object object4;
        File file = ((Plugin)o.a(this, -635747235)).getDataFolder();
        String string = ((Plugin)o.a(this, -635747235)).getName();
        Object object5 = TFUi.hp();
        SimpleCommandMap simpleCommandMap = null;
        List list = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        boolean bl = true;
        if (object5 != null) {
            object5.disablePlugin((Plugin)o.a(this, -635747235));
            try {
                object32 = TFUi.hp(TFUi.hp(TFUi.hp()), nJPf$sILv.G("\u0175\u843a\u7975\uea0a\u3385\ub198\u617e"));
                TFUi.hp(object32, true);
                list = (List)TFUi.hp(object32, object5);
                object2 = TFUi.hp(TFUi.hp(TFUi.hp()), nJPf$sILv.G("\u0169\u8439\u796f\uea06\u3399\ub186\u6143\u5db5\u0313\u49e1\u0450"));
                TFUi.hp(object2, true);
                map = (Map)TFUi.hp(object2, object5);
                try {
                    object = TFUi.hp(TFUi.hp(TFUi.hp()), nJPf$sILv.G("\u0169\u843f\u7973\uea19\u3389\ub198\u6168\u5da6\u030d"));
                    TFUi.hp(object, true);
                    map3 = (Map)TFUi.hp(object, object5);
                }
                catch (Exception exception) {
                    bl = false;
                }
                object = TFUi.hp(TFUi.hp(TFUi.hp()), nJPf$sILv.G("\u0166\u8439\u796d\uea00\u338d\ub198\u6169\u5d99\u031f\u49f4"));
                TFUi.hp(object, true);
                simpleCommandMap = (SimpleCommandMap)TFUi.hp(object, object5);
                object4 = TFUi.hp(SimpleCommandMap.class, nJPf$sILv.G("\u016e\u8438\u796f\uea1a\u3382\ub1b5\u6162\u5db9\u0313\u49e5\u044d\u2b79\u00ac"));
                TFUi.hp(object4, true);
                map2 = (Map)TFUi.hp(object4, simpleCommandMap);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                NoSuchFieldException noSuchFieldException2 = noSuchFieldException;
                TFUi.hp(noSuchFieldException);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                TFUi.hp(illegalAccessException);
                return;
            }
        }
        object5.disablePlugin((Plugin)o.a(this, -635747235));
        if (list != null && list.contains((Object)((Plugin)o.a(this, -635747235)))) {
            list.remove((Object)((Plugin)o.a(this, -635747235)));
        }
        if (map != null && map.containsKey(string)) {
            map.remove(string);
        }
        if (map3 != null && bl) {
            for (Object object32 : map3.values()) {
                object = object32.iterator();
                while (object.hasNext()) {
                    object4 = (RegisteredListener)object.next();
                    if (TFUi.hp(object4) != (Plugin)o.a(this, -635747235)) continue;
                    object.remove();
                }
            }
        }
        if (simpleCommandMap != null) {
            object32 = map2.entrySet().iterator();
            while (object32.hasNext()) {
                object2 = (Map.Entry)object32.next();
                if (!(object2.getValue() instanceof PluginCommand)) continue;
                object = (PluginCommand)object2.getValue();
                if (TFUi.hp(object) != (Plugin)o.a(this, -635747235)) continue;
                TFUi.hp(object, simpleCommandMap);
                object32.remove();
            }
        }
        if ((object32 = TFUi.hp(TFUi.hp((Plugin)o.a(this, -635747235)))) instanceof URLClassLoader) {
            try {
                TFUi.hp((URLClassLoader)object32);
            }
            catch (IOException iOException) {
                object2 = iOException;
                TFUi.hp(iOException);
            }
        }
        TFUi.hp();
        TFUi.hp((File)o.a(this, -155302832));
        if (TFUi.hp(file) != false) {
            this.yJLS(file);
        }
        ((Runnable)o.a(this, 1534346317)).run();
    }

    private void yJLS(File file) {
        if (TFUi.hp(file) != false) {
            File[] arrfile = (File[])TFUi.hp(file);
            int n = arrfile.length;
            int n2 = 0;
            while (n2 < n) {
                File file2 = arrfile[n2];
                this.yJLS(file2);
                ++n2;
            }
            TFUi.hp(file);
            return;
        }
        TFUi.hp(file);
    }

    private static Object hp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

