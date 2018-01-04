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

public class FMqm
extends ggmf {
    private feCR<gMkO> sssO = new feCR();

    @Override
    public void start() {
        FMqm.Xe(this);
    }

    @Override
    public void stop() {
        FMqm.Xe(this);
    }

    @Override
    public void tick() {
        if (!((Boolean)o.k(717183219)).booleanValue()) {
            FMqm.Xe((feCR)o.a(this, 356210989));
            return;
        }
        Object object = FMqm.Xe(FMqm.Xe((feCR)o.a(this, 356210989)));
        while (object.hasNext()) {
            gMkO gMkO2 = (gMkO)object.next();
            FMqm.Xe(gMkO2);
            if (!FMqm.Xe(gMkO2).isDead()) continue;
            FMqm.Xe((feCR)o.a(this, 356210989), gMkO2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void KTiK(feCR<LivingEntity> var1_1) {
        block8 : {
            if (!((Boolean)o.k(717183219)).booleanValue()) {
                return;
            }
            if ((Integer)o.k(-154773268) < (Integer)o.k(-952346398)) {
                o.w(-154773268, (Integer)o.k(-952346398) + 2);
            }
            if (FMqm.Xe((JIWX)o.k(180045077)) != false) ** GOTO lbl26
            while (((LivingEntity)FMqm.Xe(var1_1)).getMaxHealth() * (Object)FMqm.Xe(var1_1) > (double)((Integer)o.k(1555518140)).intValue()) {
                FMqm.Xe(var1_1);
            }
            while (FMqm.Xe(var1_1) > (Integer)o.k(-154773268)) {
                FMqm.Xe(var1_1);
            }
            break block8;
lbl-1000: // 1 sources:
            {
                FMqm.Xe(var1_1);
lbl26: // 2 sources:
                ** while (((LivingEntity)FMqm.Xe(var1_1)).getAttribute((Attribute)((Attribute)o.k((int)-1458548035))).getDefaultValue() * (Object)FMqm.Xe(var1_1) > (double)((Integer)o.k((int)1555518140)).intValue())
            }
lbl27: // 2 sources:
            while (FMqm.Xe(var1_1) > (Integer)o.k(-154773268)) {
                FMqm.Xe(var1_1);
            }
        }
        if (FMqm.Xe(var1_1) < (Integer)o.k(-952346398)) {
            return;
        }
        var2_2 = (LivingEntity)FMqm.Xe(var1_1);
        var4_3 = FMqm.Xe(FMqm.Xe(var1_1));
        while (var4_3.hasNext()) {
            var3_4 = (LivingEntity)var4_3.next();
            if (FMqm.Xe(var3_4, var2_2) != false) continue;
            var3_4.remove();
        }
        var3_4 = new gMkO(var2_2, (int)FMqm.Xe(var1_1));
        FMqm.Xe((feCR)o.a(this, 356210989), var3_4);
    }

    public boolean biLo(LivingEntity livingEntity) {
        if (!((Boolean)o.k(717183219)).booleanValue()) {
            return false;
        }
        if (this.VwLY(livingEntity) != null) {
            return true;
        }
        return false;
    }

    public gMkO VwLY(LivingEntity livingEntity) {
        if (!((Boolean)o.k(717183219)).booleanValue()) {
            return null;
        }
        Object object = FMqm.Xe((feCR)o.a(this, 356210989));
        while (object.hasNext()) {
            gMkO gMkO2 = (gMkO)object.next();
            if (FMqm.Xe(gMkO2).getEntityId() != livingEntity.getEntityId()) continue;
            return gMkO2;
        }
        return null;
    }

    @EventHandler
    public void yJLS(EntityDamageEvent entityDamageEvent) {
        if (!((Boolean)o.k(717183219)).booleanValue()) {
            return;
        }
        if (FMqm.Xe(entityDamageEvent) instanceof LivingEntity) {
            if (this.biLo((LivingEntity)FMqm.Xe(entityDamageEvent))) {
                gMkO gMkO2 = this.VwLY((LivingEntity)FMqm.Xe(entityDamageEvent));
                FMqm.Xe(gMkO2);
                if (FMqm.Xe(gMkO2) <= true) {
                    FMqm.Xe((feCR)o.a(this, 356210989), gMkO2);
                }
            }
        }
    }

    public void yJLS(gMkO gMkO2, gMkO gMkO3) {
        Object object = FMqm.Xe(gMkO2);
        if (object * (Object)(FMqm.Xe(gMkO2) + FMqm.Xe(gMkO3)) > (double)((Integer)o.k(1555518140)).intValue()) {
            return;
        }
        FMqm.Xe((feCR)o.a(this, 356210989), gMkO2);
        FMqm.Xe((feCR)o.a(this, 356210989), gMkO3);
        gMkO gMkO4 = new gMkO((LivingEntity)FMqm.Xe(gMkO2), (int)(FMqm.Xe(gMkO2) + FMqm.Xe(gMkO3)));
        FMqm.Xe(gMkO4);
        FMqm.Xe(gMkO4, FMqm.Xe(gMkO2).getHealth() + FMqm.Xe(gMkO3).getHealth());
        FMqm.Xe(gMkO3).remove();
        FMqm.Xe(gMkO4);
        FMqm.Xe((feCR)o.a(this, 356210989), gMkO4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void TEqA(LivingEntity livingEntity) {
        if (!((Boolean)o.k(717183219)).booleanValue()) {
            return;
        }
        if (livingEntity.isDead()) {
            return;
        }
        fvLG fvLG2 = new fvLG((Location)FMqm.Xe(livingEntity.getLocation()), (Integer)FMqm.Xe((Integer)o.k(-193111839)));
        feCR<LivingEntity> feCR2 = new feCR<LivingEntity>();
        feCR feCR3 = new feCR();
        if (!livingEntity.isDead() && !this.biLo(livingEntity)) {
            FMqm.Xe(feCR2, livingEntity);
        }
        if (!livingEntity.isDead() && this.biLo(livingEntity)) {
            FMqm.Xe(feCR3, this.VwLY(livingEntity));
        }
        Entity[] arrentity = (Entity[])FMqm.Xe(fvLG2, livingEntity.getType());
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (FMqm.Xe(entity, livingEntity) == false) {
                if (!entity.isDead() && !this.biLo((LivingEntity)entity)) {
                    FMqm.Xe(feCR2, (LivingEntity)entity);
                }
                if (!entity.isDead() && this.biLo((LivingEntity)entity)) {
                    FMqm.Xe(feCR3, this.VwLY((LivingEntity)entity));
                }
            }
            ++n2;
        }
        while (FMqm.Xe(feCR3) >= 2) {
            this.yJLS((gMkO)FMqm.Xe(feCR3), (gMkO)FMqm.Xe(feCR3));
        }
        if (FMqm.Xe(feCR2) >= (Integer)o.k(-952346398)) {
            this.KTiK(feCR2);
        }
    }

    @EventHandler
    public void yJLS(EntitySpawnEvent entitySpawnEvent) {
        if (!((Boolean)o.k(717183219)).booleanValue()) {
            return;
        }
        if (FMqm.Xe(entitySpawnEvent) instanceof LivingEntity) {
            new FMqm$1(this, mrFx$WjFM.d("\u4874\ua864\u10a1\uc5fe\uf39e\uaec3\u40c5\u2bb7\uc2e4\uf8a6\ucfc1\u38fc"), 1, 5, entitySpawnEvent);
        }
    }

    private static Object Xe(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

