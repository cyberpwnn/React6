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

class FMqm$1
extends JJHM {
    final /* synthetic */ FMqm gybJ;
    private final /* synthetic */ EntitySpawnEvent fmmb;

    FMqm$1(FMqm fMqm, String string, int n, int n2, EntitySpawnEvent entitySpawnEvent) {
        this.gybJ = fMqm;
        this.fmmb = entitySpawnEvent;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if (FMqm$1.qI((EntitySpawnEvent)o.a(this, -1163765455)).isDead()) {
            this.cancel();
            return;
        }
        FMqm$1.qI((FMqm)o.a(this, -685876945), (LivingEntity)FMqm$1.qI((EntitySpawnEvent)o.a(this, -1163765455)));
    }

    private static Object qI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

