/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;

class vtFs$5
extends vIXT {
    final /* synthetic */ Entity jqQR;
    final /* synthetic */ TFYr Whxy;
    final /* synthetic */ int wLbX;
    final /* synthetic */ Chunk KMEw;
    final /* synthetic */ Runnable dVMt;
    final /* synthetic */ vtFs fKRe;

    vtFs$5(vtFs vtFs2, Entity entity, TFYr tFYr, int n, Chunk chunk, Runnable runnable) {
        this.fKRe = vtFs2;
        this.jqQR = entity;
        this.Whxy = tFYr;
        this.wLbX = n;
        this.KMEw = chunk;
        this.dVMt = runnable;
    }

    @Override
    public void run() {
        vtFs$5.LV((Entity)cv.b(this, 1168249094));
        vtFs$5.LV((TFYr)cv.b(this, 490737920), true);
        if ((Integer)cv.b(this, -1656221437) == ((Chunk)cv.b(this, -323546878)).getEntities().length - 1) {
            vtFs$5.LV((vtFs)cv.b(this, -2098327283), vtFs$5.LV((TFYr)cv.b(this, 490737920)));
            ((Runnable)cv.b(this, -1508830961)).run();
        }
    }

    private static Object LV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

