/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.PluginCommand
 *  org.bukkit.command.SimpleCommandMap
 *  org.bukkit.plugin.InvalidDescriptionException
 *  org.bukkit.plugin.InvalidPluginException
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginDescriptionFile
 *  org.bukkit.plugin.PluginLoader
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.plugin.InvalidDescriptionException;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.RegisteredListener;

public class Pums {
    public static void TEqA(Plugin plugin) {
        if (plugin != null && !plugin.isEnabled()) {
            Pums.PW().enablePlugin(plugin);
        }
    }

    public static void FWXs() {
        Plugin[] arrplugin = Pums.PW().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            Pums.TEqA(plugin);
            ++n2;
        }
    }

    public static void KTiK(Plugin plugin) {
        if (plugin != null && plugin.isEnabled()) {
            Pums.PW().disablePlugin(plugin);
        }
    }

    public static void twPF() {
        Plugin[] arrplugin = Pums.PW().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            Pums.KTiK(plugin);
            ++n2;
        }
    }

    public static String GPlk(Plugin plugin) {
        return Pums.yJLS(plugin, false);
    }

    public static String yJLS(Plugin plugin, boolean bl) {
        psKX psKX2 = plugin.isEnabled() ? (psKX)((Object)o.k(-1868409976)) : (psKX)((Object)o.k(568215020));
        Object object = Pums.PW(Pums.PW(Pums.PW(new StringBuilder(), psKX2), plugin.getName()));
        if (bl) {
            object = Pums.PW(Pums.PW(Pums.PW(Pums.PW(new StringBuilder((String)Pums.PW(object)), nJPf$sILv.G("\uadbe\u8ede")), Pums.PW(plugin.getDescription())), nJPf$sILv.G("\uadb7")));
        }
        return object;
    }

    public static Plugin biRJ(String string) {
        Plugin[] arrplugin = Pums.PW().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            if (Pums.PW(string, plugin.getName()) != false) {
                return plugin;
            }
            ++n2;
        }
        return null;
    }

    public static List<String> IFQY(boolean bl) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Plugin[] arrplugin = Pums.PW().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            arrayList.add((String)(bl ? Pums.PW(plugin.getDescription()) : plugin.getName()));
            ++n2;
        }
        return arrayList;
    }

    public static String jVtl(String string) {
        Plugin plugin = Pums.biRJ(string);
        if (plugin != null && plugin.getDescription() != null) {
            return Pums.PW(plugin.getDescription());
        }
        return null;
    }

    public static String ktHX(Plugin plugin) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = Pums.PW(plugin.getDescription());
        if (object != null) {
            for (Map.Entry entry : object.entrySet()) {
                if (entry == null) continue;
                arrayList.add((String)entry.getKey());
            }
        }
        if (arrayList.isEmpty()) {
            return nJPf$sILv.G("\u1e23\u3256\uf9f8\u5fb0\u6840\ud066\ud8bb\u9676\u2a0a\u5f5b\u5211\ua6f8\u2a15\u9d19\u5b59\uded6\ufebf\u352a\ua6d5\u2a1b\u2686\u75e9\u4a3b");
        }
        return Pums.PW(new feCR(arrayList), nJPf$sILv.G("\u1e41\u3219"));
    }

    public static List<String> bqai(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Plugin[] arrplugin = Pums.PW().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            Object object = Pums.PW(plugin.getDescription());
            if (object != null) {
                for (Map.Entry entry : object.entrySet()) {
                    if (Pums.PW((String)entry.getKey(), string) != false) {
                        arrayList.add(plugin.getName());
                        continue;
                    }
                    for (Map.Entry entry2 : ((Map)entry.getValue()).entrySet()) {
                        if (Pums.PW((String)entry2.getKey(), nJPf$sILv.G("\u6929\u45db\u86c8\u709c\ub560\u579c\uab87")) == false) continue;
                        Object v = entry2.getValue();
                        if (v instanceof String) {
                            if (Pums.PW((String)v, string) == false) continue;
                            arrayList.add(plugin.getName());
                            continue;
                        }
                        List list = (List)v;
                        for (String string2 : list) {
                            if (Pums.PW(string2, string) == false) continue;
                            arrayList.add(plugin.getName());
                        }
                    }
                }
            }
            ++n2;
        }
        return arrayList;
    }

    private static void HeSD(Plugin plugin) {
        Pums.load(plugin.getName());
    }

    public static String AFmj(String string) {
        Object object = Pums.PW(Pums.PW(Pums.PW(Pums.PW())));
        File[] arrfile = (File[])Pums.PW(object);
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            File file = arrfile[n2];
            if (Pums.PW(Pums.PW(file), FMkR$WjFM.a("\u0279\u2a4a\u419e\u6904")) != false) {
                try {
                    PluginDescriptionFile pluginDescriptionFile = Pums.PW(Pums.PW(Pums.PW())).getPluginDescription(file);
                    if (Pums.PW(Pums.PW(pluginDescriptionFile), string) != false) {
                        return Pums.PW(file);
                    }
                }
                catch (InvalidDescriptionException invalidDescriptionException) {
                    // empty catch block
                }
            }
            ++n2;
        }
        return null;
    }

    public static String yJLS(String string, Plugin plugin) {
        Object object = Pums.PW(plugin.getDataFolder());
        File[] arrfile = (File[])Pums.PW(object);
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            File file = arrfile[n2];
            if (Pums.PW(Pums.PW(file), FMkR$WjFM.a("\ub8d7\u590d\u406d\u0144")) != false) {
                try {
                    PluginDescriptionFile pluginDescriptionFile = plugin.getPluginLoader().getPluginDescription(file);
                    if (Pums.PW(Pums.PW(pluginDescriptionFile), string) != false) {
                        return Pums.PW(file);
                    }
                }
                catch (InvalidDescriptionException invalidDescriptionException) {
                    // empty catch block
                }
            }
            ++n2;
        }
        return null;
    }

    public static void load(String string) {
        Object object;
        Plugin plugin = null;
        File file = new File(FMkR$WjFM.a("\uf78c\u50dd\ucd2c\u6896\ucfdf\u490d\ub364"));
        if (Pums.PW(file) == false) {
            return;
        }
        Object object2 = new File(file, (String)Pums.PW(Pums.PW(new StringBuilder((String)Pums.PW(string)), FMkR$WjFM.a("\uf7d2\u50db\ucd38\u6883"))));
        if (Pums.PW(object2) == false) {
            File[] arrfile = (File[])Pums.PW(file);
            int n = arrfile.length;
            int n2 = 0;
            while (n2 < n) {
                object = arrfile[n2];
                if (Pums.PW(Pums.PW(object), FMkR$WjFM.a("\uf7d2\u50db\ucd38\u6883")) != false) {
                    try {
                        PluginDescriptionFile pluginDescriptionFile = Pums.PW(Pums.PW(Pums.PW())).getPluginDescription((File)object);
                        if (Pums.PW(Pums.PW(pluginDescriptionFile), string) != false) {
                            object2 = object;
                            break;
                        }
                    }
                    catch (InvalidDescriptionException invalidDescriptionException) {
                        return;
                    }
                }
                ++n2;
            }
        }
        try {
            plugin = Pums.PW().loadPlugin((File)object2);
        }
        catch (InvalidDescriptionException invalidDescriptionException) {
            object = invalidDescriptionException;
            Pums.PW(invalidDescriptionException);
            return;
        }
        catch (InvalidPluginException invalidPluginException) {
            object = invalidPluginException;
            Pums.PW(invalidPluginException);
            return;
        }
        plugin.onLoad();
        Pums.PW().enablePlugin(plugin);
    }

    public static void Ipep(Plugin plugin) {
        if (plugin != null) {
            Pums.qcvH(plugin);
            Pums.HeSD(plugin);
        }
    }

    public static void KVHP() {
        Plugin[] arrplugin = Pums.PW().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            Pums.Ipep(plugin);
            ++n2;
        }
    }

    public static void qcvH(Plugin plugin) {
        Object object;
        Object object2;
        Object object32;
        Object object4;
        String string = plugin.getName();
        Object object5 = Pums.PW();
        SimpleCommandMap simpleCommandMap = null;
        List list = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        boolean bl = true;
        if (object5 != null) {
            object5.disablePlugin(plugin);
            try {
                object32 = Pums.PW(Pums.PW(Pums.PW()), nJPf$sILv.G("\ue953\ua4b6\u9780\u38ae\uca1c\u505c\ue808"));
                Pums.PW(object32, true);
                list = (List)Pums.PW(object32, object5);
                object2 = Pums.PW(Pums.PW(Pums.PW()), nJPf$sILv.G("\ue94f\ua4b5\u979a\u38a2\uca00\u5042\ue835\ube87\u8fca\ufb94\u4e3a"));
                Pums.PW(object2, true);
                map = (Map)Pums.PW(object2, object5);
                try {
                    object = Pums.PW(Pums.PW(Pums.PW()), nJPf$sILv.G("\ue94f\ua4b3\u9786\u38bd\uca10\u505c\ue81e\ube94\u8fd4"));
                    Pums.PW(object, true);
                    map3 = (Map)Pums.PW(object, object5);
                }
                catch (Exception exception) {
                    bl = false;
                }
                object = Pums.PW(Pums.PW(Pums.PW()), nJPf$sILv.G("\ue940\ua4b5\u9798\u38a4\uca14\u505c\ue81f\ubeab\u8fc6\ufb81"));
                Pums.PW(object, true);
                simpleCommandMap = (SimpleCommandMap)Pums.PW(object, object5);
                object4 = Pums.PW(SimpleCommandMap.class, nJPf$sILv.G("\ue948\ua4b4\u979a\u38be\uca1b\u5071\ue814\ube8b\u8fca\ufb90\u4e27\u2f90\u9dad"));
                Pums.PW(object4, true);
                map2 = (Map)Pums.PW(object4, simpleCommandMap);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                NoSuchFieldException noSuchFieldException2 = noSuchFieldException;
                Pums.PW(noSuchFieldException);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                Pums.PW(illegalAccessException);
                return;
            }
        }
        object5.disablePlugin(plugin);
        if (list != null && list.contains((Object)plugin)) {
            list.remove((Object)plugin);
        }
        if (map != null && map.containsKey(string)) {
            map.remove(string);
        }
        if (map3 != null && bl) {
            for (Object object32 : map3.values()) {
                object = object32.iterator();
                while (object.hasNext()) {
                    object4 = (RegisteredListener)object.next();
                    if (Pums.PW(object4) != plugin) continue;
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
                if (Pums.PW(object) != plugin) continue;
                Pums.PW(object, simpleCommandMap);
                object32.remove();
            }
        }
        if ((object32 = Pums.PW(Pums.PW(plugin))) instanceof URLClassLoader) {
            try {
                Pums.PW((URLClassLoader)object32);
            }
            catch (IOException iOException) {
                Pums.PW(Pums.PW(Pums.PW(Pums.class)), (Level)o.k(-1962067125), null, iOException);
            }
        }
        Pums.PW();
    }

    private static Object PW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

