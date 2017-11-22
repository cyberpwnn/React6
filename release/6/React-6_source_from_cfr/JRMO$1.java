/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.event.entity.EntitySpawnEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntitySpawnEvent;

class JRMO$1
extends gyID {
    final /* synthetic */ EntitySpawnEvent agAu;
    final /* synthetic */ JRMO FqEs;

    JRMO$1(JRMO jRMO, String string, int n, int n2, EntitySpawnEvent entitySpawnEvent) {
        this.FqEs = jRMO;
        this.agAu = entitySpawnEvent;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if (JRMO$1.XW((EntitySpawnEvent)cv.b(this, -1918307669)).isDead()) {
            this.cancel();
            return;
        }
        JRMO$1.XW((JRMO)cv.b(this, 481882773), (LivingEntity)JRMO$1.XW((EntitySpawnEvent)cv.b(this, -1918307669)));
    }

    private static Object XW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

