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

class ePUd$5
extends halY {
    final /* synthetic */ Entity vcRa;
    final /* synthetic */ Ralc xyyN;
    final /* synthetic */ int rNTr;
    final /* synthetic */ Chunk bFtu;
    final /* synthetic */ Runnable oDkQ;
    final /* synthetic */ ePUd cBHm;

    ePUd$5(ePUd ePUd2, Entity entity, Ralc ralc, int n, Chunk chunk, Runnable runnable) {
        this.cBHm = ePUd2;
        this.vcRa = entity;
        this.xyyN = ralc;
        this.rNTr = n;
        this.bFtu = chunk;
        this.oDkQ = runnable;
    }

    @Override
    public void run() {
        ePUd$5.QB((Entity)yy.h(this, 530049425));
        ePUd$5.QB((Ralc)yy.h(this, -1447171697), true);
        if ((Integer)yy.h(this, -71280) == ((Chunk)yy.h(this, 6875749)).getEntities().length - 1) {
            ePUd$5.QB((ePUd)yy.h(this, -1281824162), ePUd$5.QB((Ralc)yy.h(this, -1447171697)));
            ((Runnable)yy.h(this, -1308693916)).run();
        }
    }

    private static Object QB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

