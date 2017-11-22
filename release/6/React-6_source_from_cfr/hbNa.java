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
import java.util.SortedSet;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredListener;

public class hbNa
extends Thread {
    private Plugin plugin;
    private File aeww;
    private Runnable TNqe;

    public hbNa(Plugin plugin, File file, Runnable runnable) {
        this.plugin = plugin;
        this.aeww = file;
        this.TNqe = runnable;
    }

    @Override
    public void run() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        File file = ((Plugin)cv.b(this, -2025648569)).getDataFolder();
        String string = ((Plugin)cv.b(this, -2025648569)).getName();
        Object object5 = hbNa.pW();
        SimpleCommandMap simpleCommandMap = null;
        List list = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        boolean bl = true;
        if (object5 != null) {
            object5.disablePlugin((Plugin)cv.b(this, -2025648569));
            try {
                object3 = hbNa.pW(hbNa.pW(hbNa.pW()), KUXS$dwji.S("\u8dcd\u6a4e\u362e\u590c\ubdbf\u8230\u3f51"));
                hbNa.pW(object3, true);
                list = (List)hbNa.pW(object3, object5);
                object2 = hbNa.pW(hbNa.pW(hbNa.pW()), KUXS$dwji.S("\u8dd1\u6a4d\u3634\u5900\ubda3\u822e\u3f6c\u5c09\u2dc5\u43cd\ud712"));
                hbNa.pW(object2, true);
                map = (Map)hbNa.pW(object2, object5);
                try {
                    object = hbNa.pW(hbNa.pW(hbNa.pW()), KUXS$dwji.S("\u8dd1\u6a4b\u3628\u591f\ubdb3\u8230\u3f47\u5c1a\u2ddb"));
                    hbNa.pW(object, true);
                    map3 = (Map)hbNa.pW(object, object5);
                }
                catch (Exception exception) {
                    bl = false;
                }
                object = hbNa.pW(hbNa.pW(hbNa.pW()), KUXS$dwji.S("\u8dde\u6a4d\u3636\u5906\ubdb7\u8230\u3f46\u5c25\u2dc9\u43d8"));
                hbNa.pW(object, true);
                simpleCommandMap = (SimpleCommandMap)hbNa.pW(object, object5);
                object4 = hbNa.pW(SimpleCommandMap.class, KUXS$dwji.S("\u8dd6\u6a4c\u3634\u591c\ubdb8\u821d\u3f4d\u5c05\u2dc5\u43c9\ud70f\udbc1\u6ebd"));
                hbNa.pW(object4, true);
                map2 = (Map)hbNa.pW(object4, simpleCommandMap);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                NoSuchFieldException noSuchFieldException2 = noSuchFieldException;
                hbNa.pW(noSuchFieldException);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                hbNa.pW(illegalAccessException);
                return;
            }
        }
        object5.disablePlugin((Plugin)cv.b(this, -2025648569));
        if (list != null && list.contains((Object)((Plugin)cv.b(this, -2025648569)))) {
            list.remove((Object)((Plugin)cv.b(this, -2025648569)));
        }
        if (map != null && map.containsKey(string)) {
            map.remove(string);
        }
        if (map3 != null && bl) {
            object3 = map3.values().iterator();
            while (object3.hasNext()) {
                object2 = (SortedSet)object3.next();
                object = object2.iterator();
                while (object.hasNext()) {
                    object4 = (RegisteredListener)object.next();
                    if (hbNa.pW(object4) != (Plugin)cv.b(this, -2025648569)) continue;
                    object.remove();
                }
            }
        }
        if (simpleCommandMap != null) {
            object3 = map2.entrySet().iterator();
            while (object3.hasNext()) {
                object2 = (Map.Entry)object3.next();
                if (!(object2.getValue() instanceof PluginCommand)) continue;
                object = (PluginCommand)object2.getValue();
                if (hbNa.pW(object) != (Plugin)cv.b(this, -2025648569)) continue;
                hbNa.pW(object, simpleCommandMap);
                object3.remove();
            }
        }
        if ((object3 = hbNa.pW(hbNa.pW((Plugin)cv.b(this, -2025648569)))) instanceof URLClassLoader) {
            try {
                hbNa.pW((URLClassLoader)object3);
            }
            catch (IOException iOException) {
                object2 = iOException;
                hbNa.pW(iOException);
            }
        }
        hbNa.pW();
        hbNa.pW((File)cv.b(this, 1245711924));
        if (hbNa.pW(file) != false) {
            this.ssNb(file);
        }
        ((Runnable)cv.b(this, 1860439601)).run();
    }

    private void ssNb(File file) {
        if (hbNa.pW(file) != false) {
            for (File file2 : (File[])hbNa.pW(file)) {
                this.ssNb(file2);
            }
            hbNa.pW(file);
            return;
        }
        hbNa.pW(file);
    }

    private static Object pW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

