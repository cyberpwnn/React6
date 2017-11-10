/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.attribute.Attribute
 *  org.bukkit.attribute.AttributeInstance
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.entity.EntityDamageEvent
 *  org.bukkit.event.entity.EntitySpawnEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class NgJp
extends qloI {
    private PBUD<qKGr> XBRM = new PBUD();

    @Override
    public void start() {
        NgJp.bV(this);
    }

    @Override
    public void stop() {
        NgJp.bV(this);
    }

    @Override
    public void tick() {
        if (!((Boolean)yy.p(-587469756)).booleanValue()) {
            NgJp.bV((PBUD)yy.h(this, 2030103503));
            return;
        }
        Object object = NgJp.bV(NgJp.bV((PBUD)yy.h(this, 2030103503)));
        while (object.hasNext()) {
            qKGr qKGr2 = (qKGr)object.next();
            NgJp.bV(qKGr2);
            if (!NgJp.bV(qKGr2).isDead()) continue;
            NgJp.bV((PBUD)yy.h(this, 2030103503), qKGr2);
        }
    }

    public void SnBs(PBUD<LivingEntity> pBUD) {
        if (!((Boolean)yy.p(-587469756)).booleanValue()) {
            return;
        }
        do {
            if (((LivingEntity)NgJp.bV(pBUD)).getAttribute((Attribute)yy.p(690489196)).getDefaultValue() * (Object)NgJp.bV(pBUD) <= (double)((Integer)yy.p(-518322335)).intValue()) break;
            NgJp.bV(pBUD);
        } while (true);
        if (NgJp.bV(pBUD) < (Integer)yy.p(2106518649)) {
            return;
        }
        LivingEntity livingEntity = (LivingEntity)NgJp.bV(pBUD);
        Object object = NgJp.bV(NgJp.bV(pBUD));
        while (object.hasNext()) {
            LivingEntity livingEntity2 = (LivingEntity)object.next();
            if (NgJp.bV(livingEntity2, livingEntity) != false) continue;
            livingEntity2.remove();
        }
        object = new qKGr(livingEntity, (int)NgJp.bV(pBUD));
        NgJp.bV((PBUD)yy.h(this, 2030103503), object);
    }

    public boolean ksfs(LivingEntity livingEntity) {
        if (!((Boolean)yy.p(-587469756)).booleanValue()) {
            return false;
        }
        if (this.yJLL(livingEntity) != null) {
            return true;
        }
        return false;
    }

    public qKGr yJLL(LivingEntity livingEntity) {
        if (!((Boolean)yy.p(-587469756)).booleanValue()) {
            return null;
        }
        Object object = NgJp.bV((PBUD)yy.h(this, 2030103503));
        while (object.hasNext()) {
            qKGr qKGr2 = (qKGr)object.next();
            if (NgJp.bV(qKGr2).getEntityId() != livingEntity.getEntityId()) continue;
            return qKGr2;
        }
        return null;
    }

    @EventHandler
    public void mXJp(EntityDamageEvent entityDamageEvent) {
        if (!((Boolean)yy.p(-587469756)).booleanValue()) {
            return;
        }
        if (NgJp.bV(entityDamageEvent) instanceof LivingEntity) {
            if (this.ksfs((LivingEntity)NgJp.bV(entityDamageEvent))) {
                qKGr qKGr2 = this.yJLL((LivingEntity)NgJp.bV(entityDamageEvent));
                NgJp.bV(qKGr2);
                if (NgJp.bV(qKGr2) <= true) {
                    NgJp.bV((PBUD)yy.h(this, 2030103503), qKGr2);
                }
            }
        }
    }

    public void mXJp(qKGr qKGr2, qKGr qKGr3) {
        Object object = NgJp.bV(qKGr2);
        if (object * (Object)(NgJp.bV(qKGr2) + NgJp.bV(qKGr3)) > (double)((Integer)yy.p(-518322335)).intValue()) {
            return;
        }
        NgJp.bV((PBUD)yy.h(this, 2030103503), qKGr2);
        NgJp.bV((PBUD)yy.h(this, 2030103503), qKGr3);
        qKGr qKGr4 = new qKGr((LivingEntity)NgJp.bV(qKGr2), (int)(NgJp.bV(qKGr2) + NgJp.bV(qKGr3)));
        NgJp.bV(qKGr4);
        NgJp.bV(qKGr4, NgJp.bV(qKGr2).getHealth() + NgJp.bV(qKGr3).getHealth());
        NgJp.bV(qKGr3).remove();
        NgJp.bV(qKGr4);
        NgJp.bV((PBUD)yy.h(this, 2030103503), qKGr4);
    }

    public void SnBs(LivingEntity livingEntity) {
        if (!((Boolean)yy.p(-587469756)).booleanValue()) {
            return;
        }
        RIGg rIGg = new RIGg(livingEntity.getLocation(), (Integer)NgJp.bV((Integer)yy.p(-921441214)));
        PBUD<LivingEntity> pBUD = new PBUD<LivingEntity>();
        PBUD pBUD2 = new PBUD();
        if (!livingEntity.isDead() && !this.ksfs(livingEntity)) {
            NgJp.bV(pBUD, livingEntity);
        }
        if (!livingEntity.isDead() && this.ksfs(livingEntity)) {
            NgJp.bV(pBUD2, this.yJLL(livingEntity));
        }
        for (Entity entity : (Entity[])NgJp.bV(rIGg, livingEntity.getType())) {
            if (NgJp.bV(entity, livingEntity) != false) continue;
            if (!entity.isDead() && !this.ksfs((LivingEntity)entity)) {
                NgJp.bV(pBUD, (LivingEntity)entity);
            }
            if (entity.isDead() || !this.ksfs((LivingEntity)entity)) continue;
            NgJp.bV(pBUD2, this.yJLL((LivingEntity)entity));
        }
        do {
            if (NgJp.bV(pBUD2) < 2) break;
            this.mXJp((qKGr)NgJp.bV(pBUD2), (qKGr)NgJp.bV(pBUD2));
        } while (true);
        if (NgJp.bV(pBUD) >= (Integer)yy.p(2106518649)) {
            this.SnBs(pBUD);
        }
    }

    @EventHandler
    public void mXJp(EntitySpawnEvent entitySpawnEvent) {
        if (!((Boolean)yy.p(-587469756)).booleanValue()) {
            return;
        }
        if (NgJp.bV(entitySpawnEvent) instanceof LivingEntity) {
            new NgJp$1(this, NVIs$JbpD.H("\u7967\u8e0f\u5964\u651e\uf063\u5726\u5fb0\u75e1\u2254\ue0dc\ub83a\u2533"), 1, 5, entitySpawnEvent);
        }
    }

    private static Object bV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

