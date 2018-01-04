/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

@BtuM(value=-7)
public class wvyx
implements Listener {
    public wvyx() {
        try {
            if (wvyx.ra((feCR)o.k(1787909858)) == false) {
                Object object = wvyx.ra();
                wvyx.ra(new TFUi((Plugin)wvyx.ra(wvyx.ra()), (File)object, new wvyx$1(this, (File)object)));
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static Object ra(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

