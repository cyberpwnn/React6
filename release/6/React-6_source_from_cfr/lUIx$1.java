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

final class lUIx$1
implements Runnable {
    final /* synthetic */ File avqL;
    final /* synthetic */ File CDfF;
    final /* synthetic */ Plugin HSvh;

    lUIx$1(File file, File file2, Plugin plugin) {
        this.avqL = file;
        this.CDfF = file2;
        this.HSvh = plugin;
    }

    @Override
    public void run() {
        lUIx$1.lj(lUIx$1.lj(), (File)yy.h(this, -1304500001));
        lUIx$1.lj(lUIx$1.lj(), (File)yy.h(this, -750588875));
        lUIx$1.lj((Plugin)yy.h(this, -97981394));
        lUIx$1.lj((Plugin)yy.h(this, -97981394));
    }

    private static Object lj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

