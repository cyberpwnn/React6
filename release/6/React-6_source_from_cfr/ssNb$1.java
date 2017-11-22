/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.plugin.Plugin;

class ssNb$1
implements Runnable {
    private final /* synthetic */ File tdpC;
    private final /* synthetic */ File PBWX;
    private final /* synthetic */ Plugin hbNa;

    ssNb$1(File file, File file2, Plugin plugin) {
        this.tdpC = file;
        this.PBWX = file2;
        this.hbNa = plugin;
    }

    @Override
    public void run() {
        ssNb$1.Ue(ssNb$1.Ue(), (File)cv.b(this, 35131804));
        ssNb$1.Ue(ssNb$1.Ue(), (File)cv.b(this, -783871586));
        ssNb$1.Ue((Plugin)cv.b(this, 1369510297));
        ssNb$1.Ue((Plugin)cv.b(this, 1369510297));
    }

    private static Object Ue(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

