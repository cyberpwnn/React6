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

class yJLS$1
implements Runnable {
    private final /* synthetic */ File KwVE;
    private final /* synthetic */ File oxLO;
    private final /* synthetic */ Plugin WiUt;

    yJLS$1(File file, File file2, Plugin plugin) {
        this.KwVE = file;
        this.oxLO = file2;
        this.WiUt = plugin;
    }

    @Override
    public void run() {
        yJLS$1.Lr(yJLS$1.Lr(), (File)o.a(this, -1685366661));
        yJLS$1.Lr(yJLS$1.Lr(), (File)o.a(this, 1999853577));
        yJLS$1.Lr((Plugin)o.a(this, -717006840));
        yJLS$1.Lr((Plugin)o.a(this, -717006840));
    }

    private static Object Lr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

