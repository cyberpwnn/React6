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

public class JRMO
extends jqQR {
    private wfPa<UbkT> vIhv = new wfPa();

    @Override
    public void start() {
        JRMO.cC(this);
    }

    @Override
    public void stop() {
        JRMO.cC(this);
    }

    @Override
    public void tick() {
        if (!((Boolean)cv.e(1575358831)).booleanValue()) {
            JRMO.cC((wfPa)cv.b(this, 699986583));
            return;
        }
        Object object = JRMO.cC(JRMO.cC((wfPa)cv.b(this, 699986583)));
        while (object.hasNext()) {
            UbkT ubkT = (UbkT)object.next();
            JRMO.cC(ubkT);
            if (!JRMO.cC(ubkT).isDead()) continue;
            JRMO.cC((wfPa)cv.b(this, 699986583), ubkT);
        }
    }

    public void YoSa(wfPa<LivingEntity> wfPa2) {
        if (!((Boolean)cv.e(1575358831)).booleanValue()) {
            return;
        }
        do {
            if (((LivingEntity)JRMO.cC(wfPa2)).getAttribute((Attribute)cv.e(-1120989046)).getDefaultValue() * (Object)JRMO.cC(wfPa2) <= (double)((Integer)cv.e(1402867829)).intValue()) break;
            JRMO.cC(wfPa2);
        } while (true);
        if (JRMO.cC(wfPa2) < (Integer)cv.e(367333742)) {
            return;
        }
        LivingEntity livingEntity = (LivingEntity)JRMO.cC(wfPa2);
        Object object = JRMO.cC(JRMO.cC(wfPa2));
        while (object.hasNext()) {
            LivingEntity livingEntity2 = (LivingEntity)object.next();
            if (JRMO.cC(livingEntity2, livingEntity) != false) continue;
            livingEntity2.remove();
        }
        object = new UbkT(livingEntity, (int)JRMO.cC(wfPa2));
        JRMO.cC((wfPa)cv.b(this, 699986583), object);
    }

    public boolean DYFV(LivingEntity livingEntity) {
        if (!((Boolean)cv.e(1575358831)).booleanValue()) {
            return false;
        }
        if (this.IWSm(livingEntity) != null) {
            return true;
        }
        return false;
    }

    public UbkT IWSm(LivingEntity livingEntity) {
        if (!((Boolean)cv.e(1575358831)).booleanValue()) {
            return null;
        }
        Object object = JRMO.cC((wfPa)cv.b(this, 699986583));
        while (object.hasNext()) {
            UbkT ubkT = (UbkT)object.next();
            if (JRMO.cC(ubkT).getEntityId() != livingEntity.getEntityId()) continue;
            return ubkT;
        }
        return null;
    }

    @EventHandler
    public void ssNb(EntityDamageEvent entityDamageEvent) {
        if (!((Boolean)cv.e(1575358831)).booleanValue()) {
            return;
        }
        if (JRMO.cC(entityDamageEvent) instanceof LivingEntity) {
            if (this.DYFV((LivingEntity)JRMO.cC(entityDamageEvent))) {
                UbkT ubkT = this.IWSm((LivingEntity)JRMO.cC(entityDamageEvent));
                JRMO.cC(ubkT);
                if (JRMO.cC(ubkT) <= true) {
                    JRMO.cC((wfPa)cv.b(this, 699986583), ubkT);
                }
            }
        }
    }

    public void ssNb(UbkT ubkT, UbkT ubkT2) {
        Object object = JRMO.cC(ubkT);
        if (object * (Object)(JRMO.cC(ubkT) + JRMO.cC(ubkT2)) > (double)((Integer)cv.e(1402867829)).intValue()) {
            return;
        }
        JRMO.cC((wfPa)cv.b(this, 699986583), ubkT);
        JRMO.cC((wfPa)cv.b(this, 699986583), ubkT2);
        UbkT ubkT3 = new UbkT((LivingEntity)JRMO.cC(ubkT), (int)(JRMO.cC(ubkT) + JRMO.cC(ubkT2)));
        JRMO.cC(ubkT3);
        JRMO.cC(ubkT3, JRMO.cC(ubkT).getHealth() + JRMO.cC(ubkT2).getHealth());
        JRMO.cC(ubkT2).remove();
        JRMO.cC(ubkT3);
        JRMO.cC((wfPa)cv.b(this, 699986583), ubkT3);
    }

    public void OXeK(LivingEntity livingEntity) {
        if (!((Boolean)cv.e(1575358831)).booleanValue()) {
            return;
        }
        if (livingEntity.isDead()) {
            return;
        }
        gVhV gVhV2 = new gVhV((Location)JRMO.cC(livingEntity.getLocation()), (Integer)JRMO.cC((Integer)cv.e(560271721)));
        wfPa<LivingEntity> wfPa2 = new wfPa<LivingEntity>();
        wfPa wfPa3 = new wfPa();
        if (!livingEntity.isDead() && !this.DYFV(livingEntity)) {
            JRMO.cC(wfPa2, livingEntity);
        }
        if (!livingEntity.isDead() && this.DYFV(livingEntity)) {
            JRMO.cC(wfPa3, this.IWSm(livingEntity));
        }
        for (Entity entity : (Entity[])JRMO.cC(gVhV2, livingEntity.getType())) {
            if (JRMO.cC(entity, livingEntity) != false) continue;
            if (!entity.isDead() && !this.DYFV((LivingEntity)entity)) {
                JRMO.cC(wfPa2, (LivingEntity)entity);
            }
            if (entity.isDead() || !this.DYFV((LivingEntity)entity)) continue;
            JRMO.cC(wfPa3, this.IWSm((LivingEntity)entity));
        }
        do {
            if (JRMO.cC(wfPa3) < 2) break;
            this.ssNb((UbkT)JRMO.cC(wfPa3), (UbkT)JRMO.cC(wfPa3));
        } while (true);
        if (JRMO.cC(wfPa2) >= (Integer)cv.e(367333742)) {
            this.YoSa(wfPa2);
        }
    }

    @EventHandler
    public void ssNb(EntitySpawnEvent entitySpawnEvent) {
        if (!((Boolean)cv.e(1575358831)).booleanValue()) {
            return;
        }
        if (JRMO.cC(entitySpawnEvent) instanceof LivingEntity) {
            new JRMO$1(this, YEBy$TyVf.W("\u4e36\u02a0\u17e7\uc836\u31fc\uf895\u6929\u2378\u675e\ub910\u8511\u54a2"), 1, 5, entitySpawnEvent);
        }
    }

    private static Object cC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

