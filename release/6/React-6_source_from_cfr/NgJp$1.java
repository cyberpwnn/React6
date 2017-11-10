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

class NgJp$1
extends QFCu {
    final /* synthetic */ EntitySpawnEvent skRu;
    final /* synthetic */ NgJp YEUP;

    NgJp$1(NgJp ngJp, String string, int n, int n2, EntitySpawnEvent entitySpawnEvent) {
        this.YEUP = ngJp;
        this.skRu = entitySpawnEvent;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if (NgJp$1.yh((EntitySpawnEvent)yy.h(this, 938601435)).isDead()) {
            this.cancel();
            return;
        }
        NgJp$1.yh((NgJp)yy.h(this, -1275270191), (LivingEntity)NgJp$1.yh((EntitySpawnEvent)yy.h(this, 938601435)));
    }

    private static Object yh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

