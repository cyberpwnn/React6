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

public class Nodd {
    public static void OXeK(Plugin plugin) {
        if (plugin != null && !plugin.isEnabled()) {
            Nodd.xB().enablePlugin(plugin);
        }
    }

    public static void BtwX() {
        Plugin[] arrplugin = Nodd.xB().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            Nodd.OXeK(plugin);
            ++n2;
        }
    }

    public static void YoSa(Plugin plugin) {
        if (plugin != null && plugin.isEnabled()) {
            Nodd.xB().disablePlugin(plugin);
        }
    }

    public static void bPOA() {
        Plugin[] arrplugin = Nodd.xB().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            Nodd.YoSa(plugin);
            ++n2;
        }
    }

    public static String jhSt(Plugin plugin) {
        return Nodd.ssNb(plugin, false);
    }

    public static String ssNb(Plugin plugin, boolean bl) {
        APKB aPKB = plugin.isEnabled() ? (APKB)((Object)cv.e(1489703379)) : (APKB)((Object)cv.e(-314502936));
        Object object = Nodd.xB(Nodd.xB(Nodd.xB(new StringBuilder(), aPKB), plugin.getName()));
        if (bl) {
            object = Nodd.xB(Nodd.xB(Nodd.xB(Nodd.xB(new StringBuilder((String)Nodd.xB(object)), KUXS$dwji.S("\u1270\u8cd6")), Nodd.xB(plugin.getDescription())), KUXS$dwji.S("\u1279")));
        }
        return object;
    }

    public static Plugin Aqbp(String string) {
        Plugin[] arrplugin = Nodd.xB().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            if (Nodd.xB(string, plugin.getName()) != false) {
                return plugin;
            }
            ++n2;
        }
        return null;
    }

    public static List<String> TyVf(boolean bl) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Plugin[] arrplugin = Nodd.xB().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            arrayList.add((String)(bl ? Nodd.xB(plugin.getDescription()) : plugin.getName()));
            ++n2;
        }
        return arrayList;
    }

    public static String KTmF(String string) {
        Plugin plugin = Nodd.Aqbp(string);
        if (plugin != null && plugin.getDescription() != null) {
            return Nodd.xB(plugin.getDescription());
        }
        return null;
    }

    public static String BkpW(Plugin plugin) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = Nodd.xB(plugin.getDescription());
        if (object != null) {
            for (Map.Entry entry : object.entrySet()) {
                if (entry == null) continue;
                arrayList.add((String)entry.getKey());
            }
        }
        if (arrayList.isEmpty()) {
            return YEBy$TyVf.W("\uf269\u1b75\u4a86\u0dba\uc1f2\uea61\u82ad\u8aef\ue3f4\ua81b\uf9b2\u724e\u249c\u7f4c\ud7f1\u31b2\u5058\u8ea6\u9d83\u7f17\u0f81\u0a56\u6a6e");
        }
        return Nodd.xB(new wfPa(arrayList), YEBy$TyVf.W("\uf20b\u1b3a"));
    }

    public static List<String> bXOh(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Plugin[] arrplugin = Nodd.xB().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            Object object = Nodd.xB(plugin.getDescription());
            if (object != null) {
                for (Map.Entry entry : object.entrySet()) {
                    if (Nodd.xB((String)entry.getKey(), string) != false) {
                        arrayList.add(plugin.getName());
                        continue;
                    }
                    for (Map.Entry entry2 : ((Map)entry.getValue()).entrySet()) {
                        if (Nodd.xB((String)entry2.getKey(), YEBy$TyVf.W("\ua4fe\ue74d\uee9f\u0eb6\uc904\u9e47\u8f88")) == false) continue;
                        Object v = entry2.getValue();
                        if (v instanceof String) {
                            if (Nodd.xB((String)v, string) == false) continue;
                            arrayList.add(plugin.getName());
                            continue;
                        }
                        List list = (List)v;
                        for (String string2 : list) {
                            if (Nodd.xB(string2, string) == false) continue;
                            arrayList.add(plugin.getName());
                        }
                    }
                }
            }
            ++n2;
        }
        return arrayList;
    }

    private static void lCdp(Plugin plugin) {
        Nodd.load(plugin.getName());
    }

    public static String LGOT(String string) {
        Object object = Nodd.xB(Nodd.xB(Nodd.xB(Nodd.xB())));
        File[] arrfile = (File[])Nodd.xB(object);
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            File file = arrfile[n2];
            if (Nodd.xB(Nodd.xB(file), KUXS$dwji.S("\u04f7\ub9c8\u7d1a\u06c0")) != false) {
                try {
                    PluginDescriptionFile pluginDescriptionFile = Nodd.xB(Nodd.xB(Nodd.xB())).getPluginDescription(file);
                    if (Nodd.xB(Nodd.xB(pluginDescriptionFile), string) != false) {
                        return Nodd.xB(file);
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

    public static String ssNb(String string, Plugin plugin) {
        Object object = Nodd.xB(plugin.getDataFolder());
        File[] arrfile = (File[])Nodd.xB(object);
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            File file = arrfile[n2];
            if (Nodd.xB(Nodd.xB(file), KUXS$dwji.S("\u127e\u8c94\ubb7d\ud75a")) != false) {
                try {
                    PluginDescriptionFile pluginDescriptionFile = plugin.getPluginLoader().getPluginDescription(file);
                    if (Nodd.xB(Nodd.xB(pluginDescriptionFile), string) != false) {
                        return Nodd.xB(file);
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
        File file = new File(KUXS$dwji.S("\u51cb\u3261\u3f25\ufbf8\uae82\ud8a7\u3ca2"));
        if (Nodd.xB(file) == false) {
            return;
        }
        Object object2 = new File(file, (String)Nodd.xB(Nodd.xB(new StringBuilder((String)Nodd.xB(string)), KUXS$dwji.S("\u5195\u3267\u3f31\ufbed"))));
        if (Nodd.xB(object2) == false) {
            File[] arrfile = (File[])Nodd.xB(file);
            int n = arrfile.length;
            int n2 = 0;
            while (n2 < n) {
                object = arrfile[n2];
                if (Nodd.xB(Nodd.xB(object), KUXS$dwji.S("\u5195\u3267\u3f31\ufbed")) != false) {
                    try {
                        PluginDescriptionFile pluginDescriptionFile = Nodd.xB(Nodd.xB(Nodd.xB())).getPluginDescription((File)object);
                        if (Nodd.xB(Nodd.xB(pluginDescriptionFile), string) != false) {
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
            plugin = Nodd.xB().loadPlugin((File)object2);
        }
        catch (InvalidDescriptionException invalidDescriptionException) {
            object = invalidDescriptionException;
            Nodd.xB(invalidDescriptionException);
            return;
        }
        catch (InvalidPluginException invalidPluginException) {
            object = invalidPluginException;
            Nodd.xB(invalidPluginException);
            return;
        }
        plugin.onLoad();
        Nodd.xB().enablePlugin(plugin);
    }

    public static void nJLQ(Plugin plugin) {
        if (plugin != null) {
            Nodd.vtFs(plugin);
            Nodd.lCdp(plugin);
        }
    }

    public static void dogY() {
        Plugin[] arrplugin = Nodd.xB().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            Nodd.nJLQ(plugin);
            ++n2;
        }
    }

    public static void vtFs(Plugin plugin) {
        Object object;
        Object object2;
        Object object32;
        Object object4;
        String string = plugin.getName();
        Object object5 = Nodd.xB();
        SimpleCommandMap simpleCommandMap = null;
        List list = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        boolean bl = true;
        if (object5 != null) {
            object5.disablePlugin(plugin);
            try {
                object32 = Nodd.xB(Nodd.xB(Nodd.xB()), KUXS$dwji.S("\u8afa\u8c2d\u6b9d\u2a3b\u42f8\u69f7\u2932"));
                Nodd.xB(object32, true);
                list = (List)Nodd.xB(object32, object5);
                object2 = Nodd.xB(Nodd.xB(Nodd.xB()), KUXS$dwji.S("\u8ae6\u8c2e\u6b87\u2a37\u42e4\u69e9\u290f\u8b46\uf471\ucdb3\u8944"));
                Nodd.xB(object2, true);
                map = (Map)Nodd.xB(object2, object5);
                try {
                    object = Nodd.xB(Nodd.xB(Nodd.xB()), KUXS$dwji.S("\u8ae6\u8c28\u6b9b\u2a28\u42f4\u69f7\u2924\u8b55\uf46f"));
                    Nodd.xB(object, true);
                    map3 = (Map)Nodd.xB(object, object5);
                }
                catch (Exception exception) {
                    bl = false;
                }
                object = Nodd.xB(Nodd.xB(Nodd.xB()), KUXS$dwji.S("\u8ae9\u8c2e\u6b85\u2a31\u42f0\u69f7\u2925\u8b6a\uf47d\ucda6"));
                Nodd.xB(object, true);
                simpleCommandMap = (SimpleCommandMap)Nodd.xB(object, object5);
                object4 = Nodd.xB(SimpleCommandMap.class, KUXS$dwji.S("\u8ae1\u8c2f\u6b87\u2a2b\u42ff\u69da\u292e\u8b4a\uf471\ucdb7\u8959\uae70\u2b5a"));
                Nodd.xB(object4, true);
                map2 = (Map)Nodd.xB(object4, simpleCommandMap);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                NoSuchFieldException noSuchFieldException2 = noSuchFieldException;
                Nodd.xB(noSuchFieldException);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                Nodd.xB(illegalAccessException);
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
                    if (Nodd.xB(object4) != plugin) continue;
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
                if (Nodd.xB(object) != plugin) continue;
                Nodd.xB(object, simpleCommandMap);
                object32.remove();
            }
        }
        if ((object32 = Nodd.xB(Nodd.xB(plugin))) instanceof URLClassLoader) {
            try {
                Nodd.xB((URLClassLoader)object32);
            }
            catch (IOException iOException) {
                Nodd.xB(Nodd.xB(Nodd.xB(Nodd.class)), (Level)cv.e(-1270286841), null, iOException);
            }
        }
        Nodd.xB();
    }

    private static Object xB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

