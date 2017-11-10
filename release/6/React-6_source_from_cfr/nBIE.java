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

public class nBIE {
    public static void SnBs(Plugin plugin) {
        if (plugin != null && !plugin.isEnabled()) {
            nBIE.ZO().enablePlugin(plugin);
        }
    }

    public static void ejUT() {
        Plugin[] arrplugin = nBIE.ZO().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            nBIE.SnBs(plugin);
            ++n2;
        }
    }

    public static void qdWJ(Plugin plugin) {
        if (plugin != null && plugin.isEnabled()) {
            nBIE.ZO().disablePlugin(plugin);
        }
    }

    public static void BlcL() {
        Plugin[] arrplugin = nBIE.ZO().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            nBIE.qdWJ(plugin);
            ++n2;
        }
    }

    public static String JRFt(Plugin plugin) {
        return nBIE.mXJp(plugin, false);
    }

    public static String mXJp(Plugin plugin, boolean bl) {
        ydHl ydHl2 = plugin.isEnabled() ? (ydHl)((Object)yy.p(1274341524)) : (ydHl)((Object)yy.p(-329382161));
        Object object = nBIE.ZO(nBIE.ZO(nBIE.ZO(new StringBuilder(), ydHl2), plugin.getName()));
        if (bl) {
            object = nBIE.ZO(nBIE.ZO(nBIE.ZO(nBIE.ZO(new StringBuilder((String)nBIE.ZO(object)), NVIs$JbpD.H("\u3c74\u9632")), nBIE.ZO(plugin.getDescription())), NVIs$JbpD.H("\u3c7d")));
        }
        return object;
    }

    public static Plugin erWK(String string) {
        Plugin[] arrplugin = nBIE.ZO().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            if (nBIE.ZO(string, plugin.getName()) != false) {
                return plugin;
            }
            ++n2;
        }
        return null;
    }

    public static List<String> yIkA(boolean bl) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Plugin[] arrplugin = nBIE.ZO().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            arrayList.add((String)(bl ? nBIE.ZO(plugin.getDescription()) : plugin.getName()));
            ++n2;
        }
        return arrayList;
    }

    public static String MIoJ(String string) {
        Plugin plugin = nBIE.erWK(string);
        if (plugin != null && plugin.getDescription() != null) {
            return nBIE.ZO(plugin.getDescription());
        }
        return null;
    }

    public static String halY(Plugin plugin) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = nBIE.ZO(plugin.getDescription());
        if (object != null) {
            for (Map.Entry entry : object.entrySet()) {
                if (entry == null) continue;
                arrayList.add((String)entry.getKey());
            }
        }
        if (arrayList.isEmpty()) {
            return NVIs$JbpD.H("\u6fa2\ueb84\u818b\u2ce4\u3b01\ud628\u663c\ua940\ube3f\u7d89\ue89e\u4d92\uf3c6\u6c95\u0f24\u5e55\u676a\u9198\u2615\u4691\u0c96\ud9ad\uea1f");
        }
        return nBIE.ZO(new PBUD(arrayList), NVIs$JbpD.H("\u6fc0\uebcb"));
    }

    public static List<String> VvmI(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Plugin[] arrplugin = nBIE.ZO().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            Object object = nBIE.ZO(plugin.getDescription());
            if (object != null) {
                for (Map.Entry entry : object.entrySet()) {
                    if (nBIE.ZO((String)entry.getKey(), string) != false) {
                        arrayList.add(plugin.getName());
                        continue;
                    }
                    for (Map.Entry entry2 : ((Map)entry.getValue()).entrySet()) {
                        if (nBIE.ZO((String)entry2.getKey(), BkvY$LhxG.I("\u8f69\u0931\u19d9\ueea2\u796b\ub5d4\ue92c")) == false) continue;
                        Object v = entry2.getValue();
                        if (v instanceof String) {
                            if (nBIE.ZO((String)v, string) == false) continue;
                            arrayList.add(plugin.getName());
                            continue;
                        }
                        List list = (List)v;
                        for (String string2 : list) {
                            if (nBIE.ZO(string2, string) == false) continue;
                            arrayList.add(plugin.getName());
                        }
                    }
                }
            }
            ++n2;
        }
        return arrayList;
    }

    private static void ssMm(Plugin plugin) {
        nBIE.load(plugin.getName());
    }

    public static String VfLY(String string) {
        Object object = nBIE.ZO(nBIE.ZO(nBIE.ZO(nBIE.ZO())));
        File[] arrfile = (File[])nBIE.ZO(object);
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            File file = arrfile[n2];
            if (nBIE.ZO(nBIE.ZO(file), BkvY$LhxG.I("\u2d67\ue899\ua391\u533f")) != false) {
                try {
                    PluginDescriptionFile pluginDescriptionFile = nBIE.ZO(nBIE.ZO(nBIE.ZO())).getPluginDescription(file);
                    if (nBIE.ZO(nBIE.ZO(pluginDescriptionFile), string) != false) {
                        return nBIE.ZO(file);
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

    public static String mXJp(String string, Plugin plugin) {
        Object object = nBIE.ZO(plugin.getDataFolder());
        File[] arrfile = (File[])nBIE.ZO(object);
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            File file = arrfile[n2];
            if (nBIE.ZO(nBIE.ZO(file), NVIs$JbpD.H("\u3c7a\u9670\u0e3c\u1a36")) != false) {
                try {
                    PluginDescriptionFile pluginDescriptionFile = plugin.getPluginLoader().getPluginDescription(file);
                    if (nBIE.ZO(nBIE.ZO(pluginDescriptionFile), string) != false) {
                        return nBIE.ZO(file);
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
        File file = new File(KDGY$JAHk.Y("\u49c2\uffda\u179d\u665e\u0f1c\u0dcd\u7190"));
        if (nBIE.ZO(file) == false) {
            return;
        }
        Object object2 = new File(file, (String)nBIE.ZO(nBIE.ZO(new StringBuilder((String)nBIE.ZO(string)), KDGY$JAHk.Y("\u499c\uffdc\u1789\u664b"))));
        if (nBIE.ZO(object2) == false) {
            File[] arrfile = (File[])nBIE.ZO(file);
            int n = arrfile.length;
            int n2 = 0;
            while (n2 < n) {
                object = arrfile[n2];
                if (nBIE.ZO(nBIE.ZO(object), KDGY$JAHk.Y("\u499c\uffdc\u1789\u664b")) != false) {
                    try {
                        PluginDescriptionFile pluginDescriptionFile = nBIE.ZO(nBIE.ZO(nBIE.ZO())).getPluginDescription((File)object);
                        if (nBIE.ZO(nBIE.ZO(pluginDescriptionFile), string) != false) {
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
            plugin = nBIE.ZO().loadPlugin((File)object2);
        }
        catch (InvalidDescriptionException invalidDescriptionException) {
            object = invalidDescriptionException;
            nBIE.ZO(invalidDescriptionException);
            return;
        }
        catch (InvalidPluginException invalidPluginException) {
            object = invalidPluginException;
            nBIE.ZO(invalidPluginException);
            return;
        }
        plugin.onLoad();
        nBIE.ZO().enablePlugin(plugin);
    }

    public static void yIkI(Plugin plugin) {
        if (plugin != null) {
            nBIE.CVAs(plugin);
            nBIE.ssMm(plugin);
        }
    }

    public static void hjnK() {
        Plugin[] arrplugin = nBIE.ZO().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            nBIE.yIkI(plugin);
            ++n2;
        }
    }

    public static void CVAs(Plugin plugin) {
        Object object;
        Object object2;
        Object object32;
        Object object4;
        String string = plugin.getName();
        Object object5 = nBIE.ZO();
        SimpleCommandMap simpleCommandMap = null;
        List list = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        boolean bl = true;
        if (object5 != null) {
            object5.disablePlugin(plugin);
            try {
                object32 = nBIE.ZO(nBIE.ZO(nBIE.ZO()), BkvY$LhxG.I("\u0aca\ue0b5\u1785\u4270\u3074\u5302\u711d"));
                nBIE.ZO(object32, true);
                list = (List)nBIE.ZO(object32, object5);
                object2 = nBIE.ZO(nBIE.ZO(nBIE.ZO()), BkvY$LhxG.I("\u0ad6\ue0b6\u179f\u427c\u3068\u531c\u7120\uce64\uf032\u6c3a\u8447"));
                nBIE.ZO(object2, true);
                map = (Map)nBIE.ZO(object2, object5);
                try {
                    object = nBIE.ZO(nBIE.ZO(nBIE.ZO()), BkvY$LhxG.I("\u0ad6\ue0b0\u1783\u4263\u3078\u5302\u710b\uce77\uf02c"));
                    nBIE.ZO(object, true);
                    map3 = (Map)nBIE.ZO(object, object5);
                }
                catch (Exception exception) {
                    bl = false;
                }
                object = nBIE.ZO(nBIE.ZO(nBIE.ZO()), BkvY$LhxG.I("\u0ad9\ue0b6\u179d\u427a\u307c\u5302\u710a\uce48\uf03e\u6c2f"));
                nBIE.ZO(object, true);
                simpleCommandMap = (SimpleCommandMap)nBIE.ZO(object, object5);
                object4 = nBIE.ZO(SimpleCommandMap.class, BkvY$LhxG.I("\u0ad1\ue0b7\u179f\u4260\u3073\u532f\u7101\uce68\uf032\u6c3e\u845a\u1141\u826a"));
                nBIE.ZO(object4, true);
                map2 = (Map)nBIE.ZO(object4, simpleCommandMap);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                NoSuchFieldException noSuchFieldException2 = noSuchFieldException;
                nBIE.ZO(noSuchFieldException);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                nBIE.ZO(illegalAccessException);
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
                    if (nBIE.ZO(object4) != plugin) continue;
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
                if (nBIE.ZO(object) != plugin) continue;
                nBIE.ZO(object, simpleCommandMap);
                object32.remove();
            }
        }
        if ((object32 = nBIE.ZO(nBIE.ZO(plugin))) instanceof URLClassLoader) {
            try {
                nBIE.ZO((URLClassLoader)object32);
            }
            catch (IOException iOException) {
                nBIE.ZO(nBIE.ZO(nBIE.ZO(nBIE.class)), (Level)yy.p(1432158781), null, iOException);
            }
        }
        nBIE.ZO();
    }

    private static Object ZO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

