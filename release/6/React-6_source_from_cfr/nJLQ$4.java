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

class nJLQ$4
extends vIXT {
    final /* synthetic */ Chunk KMEw;
    final /* synthetic */ Runnable dVMt;
    final /* synthetic */ nJLQ kkcI;

    nJLQ$4(nJLQ nJLQ2, Chunk chunk, Runnable runnable) {
        this.kkcI = nJLQ2;
        this.KMEw = chunk;
        this.dVMt = runnable;
    }

    @Override
    public void run() {
        if (((Chunk)cv.b(this, -372240660)).unload()) {
            nJLQ$4.PS((nJLQ)cv.b(this, 1345785583), nJLQ$4.PS());
            ((Runnable)cv.b(this, -1088811282)).run();
        }
    }

    private static Object PS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

