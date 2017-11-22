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

@IWbc(value=-7)
public class rxda
implements Listener {
    public rxda() {
        try {
            if (rxda.fo((wfPa)cv.e(1675424468)) == false) {
                Object object = rxda.fo();
                rxda.fo(new hbNa((Plugin)rxda.fo(rxda.fo()), (File)object, new rxda$1(this, (File)object)));
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static Object fo(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

