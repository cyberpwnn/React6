/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.plugin.Plugin;

class Bcie$3
extends CxNA {
    final /* synthetic */ Bcie WQFh;
    private final /* synthetic */ Thread FyiI;
    private final /* synthetic */ XAcv uGYu;

    Bcie$3(Bcie bcie, Thread thread, XAcv xAcv) {
        this.WQFh = bcie;
        this.FyiI = thread;
        this.uGYu = xAcv;
    }

    @Override
    public void run() {
        StackTraceElement[] arrstackTraceElement = (StackTraceElement[])Bcie$3.nF((Thread)o.a(this, -556050736));
        Plugin plugin = null;
        feCR feCR2 = new feCR();
        StackTraceElement[] arrstackTraceElement2 = arrstackTraceElement;
        int n = arrstackTraceElement2.length;
        int n2 = 0;
        while (n2 < n) {
            StackTraceElement stackTraceElement = arrstackTraceElement2[n2];
            Object object = Bcie$3.nF(Bcie$3.nF(Bcie$3.nF(stackTraceElement)));
            while (object.hasNext()) {
                Plugin plugin2 = (Plugin)object.next();
                if (Bcie$3.nF(plugin2, Bcie$3.nF(Bcie$3.nF())) != false) continue;
                Bcie$3.nF(feCR2, plugin2);
            }
            ++n2;
        }
        if (Bcie$3.nF(feCR2) == false) {
            plugin = (Plugin)Bcie$3.nF(feCR2);
        }
        Bcie$3.nF((XAcv)o.a(this, 1225545421), plugin);
    }

    private static Object nF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

