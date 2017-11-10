/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;

class inDC$4
extends halY {
    final /* synthetic */ Chunk bFtu;
    final /* synthetic */ Runnable oDkQ;
    final /* synthetic */ inDC YpAW;

    inDC$4(inDC inDC2, Chunk chunk, Runnable runnable) {
        this.YpAW = inDC2;
        this.bFtu = chunk;
        this.oDkQ = runnable;
    }

    @Override
    public void run() {
        if (((Chunk)yy.h(this, 2008017475)).unload()) {
            inDC$4.Tk((inDC)yy.h(this, 1462430276), inDC$4.Tk());
            ((Runnable)yy.h(this, -1019221383)).run();
        }
    }

    private static Object Tk(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

