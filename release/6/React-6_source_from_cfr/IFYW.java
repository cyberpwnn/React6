/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.entity.Ageable
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Item
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.entity.Player
 *  org.bukkit.entity.Sheep
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.entity.EntitySpawnEvent
 *  org.bukkit.event.world.ChunkUnloadEvent
 *  org.bukkit.event.world.WorldLoadEvent
 *  org.bukkit.event.world.WorldUnloadEvent
 *  org.bukkit.inventory.ItemStack
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.UUID;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldUnloadEvent;
import org.bukkit.inventory.ItemStack;

public class IFYW
extends qloI {
    private aKuV<World, AXPu<Chunk, lekR>> xPOH = new aKuV();
    private int HTfE = 0;
    private int axAQ = 0;

    public boolean enabled() {
        return (Boolean)yy.p(9890938);
    }

    public void ksfs(World world) {
        if (!this.enabled()) {
            return;
        }
        if (IFYW.VR((aKuV)yy.h(this, 1065937846), world) != false) {
            Object object = IFYW.VR(((AXPu)IFYW.VR((aKuV)yy.h(this, 1065937846), world)).inDC());
            while (object.hasNext()) {
                Chunk chunk = (Chunk)object.next();
                this.qdWJ(chunk);
            }
        }
        IFYW.VR((aKuV)yy.h(this, 1065937846), world);
    }

    public void SnBs(Chunk chunk) {
        if (!this.enabled()) {
            return;
        }
        this.yJLL(chunk.getWorld());
        if (IFYW.VR((aKuV)yy.h(this, 1065937846), chunk.getWorld()) != false) {
            for (Entity entity : chunk.getEntities()) {
                this.CVAs(entity);
            }
        }
    }

    public void CVAs(Entity entity) {
        if (!this.enabled()) {
            return;
        }
        this.yJLL(entity.getWorld());
        if (entity instanceof Player) {
            return;
        }
        lekR lekR2 = entity instanceof Item ? new bWml((Item)entity) : (entity instanceof Sheep ? new JAHk((Sheep)entity) : (entity instanceof Ageable ? new VCjX((Ageable)entity) : (entity instanceof LivingEntity ? new WqbE((LivingEntity)entity) : new lekR(entity))));
        if (IFYW.VR((aKuV)yy.h(this, 1065937846), entity.getWorld()) == false) {
            IFYW.VR((aKuV)yy.h(this, 1065937846), entity.getWorld(), new hbQB());
        }
        ((AXPu)IFYW.VR((aKuV)yy.h(this, 1065937846), entity.getWorld())).put(IFYW.VR(entity.getLocation()), lekR2);
    }

    public boolean mXJp(UUID uUID, Chunk chunk) {
        for (Entity entity : chunk.getEntities()) {
            if (IFYW.VR(entity.getUniqueId(), uUID) == false) continue;
            return true;
        }
        return false;
    }

    public int qdWJ(Chunk chunk) {
        int n = 0;
        if (!this.enabled()) {
            return 0;
        }
        if (IFYW.VR((aKuV)yy.h(this, 1065937846), chunk.getWorld()) != false) {
            if (((AXPu)IFYW.VR((aKuV)yy.h(this, 1065937846), chunk.getWorld())).gois(chunk)) {
                if (IFYW.VR(((AXPu)IFYW.VR((aKuV)yy.h(this, 1065937846), chunk.getWorld())).SnAm(chunk)) != false) {
                    return 0;
                }
                hGxw hGxw2 = ((AXPu)IFYW.VR((aKuV)yy.h(this, 1065937846), chunk.getWorld())).SnAm(chunk);
                hGxw hGxw3 = new hGxw();
                ((AXPu)IFYW.VR((aKuV)yy.h(this, 1065937846), chunk.getWorld())).SBla(chunk);
                Object object = IFYW.VR(hGxw2);
                while (object.hasNext()) {
                    lekR lekR2 = (lekR)object.next();
                    if (IFYW.VR(hGxw3, IFYW.VR(lekR2)) != false) continue;
                    EntityType entityType = ((EntityType[])IFYW.VR())[IFYW.VR(lekR2)];
                    Location location = chunk.getBlock(0, 0, 0).getLocation();
                    Entity entity = IFYW.VR(entityType, (EntityType)yy.p(737668174)) != false ? chunk.getWorld().dropItem(location, new ItemStack((Material)yy.p(-1843205199))) : chunk.getWorld().spawnEntity(location, entityType);
                    IFYW.VR(lekR2, entity);
                    IFYW.VR(hGxw3, IFYW.VR(lekR2));
                    ++n;
                }
            }
        }
        return n;
    }

    public void yJLL(World world) {
        if (IFYW.VR((aKuV)yy.h(this, 1065937846), world) == false) {
            IFYW.VR((aKuV)yy.h(this, 1065937846), world, new hbQB());
        }
    }

    @EventHandler
    public void mXJp(WorldLoadEvent worldLoadEvent) {
        if (!this.enabled()) {
            return;
        }
        this.yJLL((World)IFYW.VR(worldLoadEvent));
    }

    @EventHandler
    public void mXJp(ChunkUnloadEvent chunkUnloadEvent) {
        if (!this.enabled()) {
            return;
        }
        this.qdWJ((Chunk)IFYW.VR(chunkUnloadEvent));
    }

    @EventHandler
    public void mXJp(WorldUnloadEvent worldUnloadEvent) {
        if (!this.enabled()) {
            return;
        }
        this.ksfs((World)IFYW.VR(worldUnloadEvent));
        IFYW.VR((aKuV)yy.h(this, 1065937846), IFYW.VR(worldUnloadEvent));
    }

    @Override
    public void start() {
        IFYW.VR(this);
    }

    @Override
    public void stop() {
        IFYW.VR(this);
    }

    public boolean JRFt(Chunk chunk) {
        if (IFYW.VR((aKuV)yy.h(this, 1065937846), chunk.getWorld()) != false) {
            if (((AXPu)IFYW.VR((aKuV)yy.h(this, 1065937846), chunk.getWorld())).gois(chunk)) {
                return true;
            }
        }
        return false;
    }

    @EventHandler
    public void mXJp(EntitySpawnEvent entitySpawnEvent) {
        if (!this.enabled()) {
            return;
        }
        if (this.JRFt((Chunk)IFYW.VR(IFYW.VR(entitySpawnEvent)))) {
            IFYW.VR(entitySpawnEvent, true);
        }
    }

    @Override
    public void tick() {
        if (!this.enabled()) {
            return;
        }
        if ((Long)yy.p(291695492) % (long)((Integer)yy.p(2037574759)).intValue() == 0) {
            Object object;
            Object object2;
            Chunk chunk;
            Hdte hdte = new Hdte();
            IFYW.VR(hdte);
            Iterator iterator = IFYW.VR().iterator();
            while (iterator.hasNext()) {
                object2 = (Player)iterator.next();
                object = IFYW.VR(IFYW.VR(IFYW.VR(object2.getLocation()), (Integer)yy.p(-734598030)));
                while (object.hasNext()) {
                    chunk = (Chunk)object.next();
                    IFYW.VR(chunk);
                    IFYW.VR(IFYW.VR(hdte), chunk);
                }
            }
            iterator = IFYW.VR(IFYW.VR(hdte));
            while (iterator.hasNext()) {
                object2 = iterator.next();
                for (int i = 0; i < ((Chunk)object2).getEntities().length; ++i) {
                    chunk = ((Chunk)object2).getEntities()[i];
                    if (chunk == null || chunk instanceof Player || chunk.isDead()) continue;
                    IFYW.VR(chunk);
                    IFYW.VR(chunk);
                }
            }
            yy.E(this, 196078470, 0);
            yy.E(this, 821685131, 0);
            iterator = IFYW.VR().iterator();
            while (iterator.hasNext()) {
                object2 = (World)iterator.next();
                if (IFYW.VR((aKuV)yy.h(this, 1065937846), object2) == false) continue;
                object = IFYW.VR(((AXPu)IFYW.VR((aKuV)yy.h(this, 1065937846), object2)).inDC());
                while (object.hasNext()) {
                    chunk = (Chunk)object.next();
                    Object object3 = IFYW.VR(((AXPu)IFYW.VR((aKuV)yy.h(this, 1065937846), object2)).SnAm(chunk));
                    while (object3.hasNext()) {
                        lekR lekR2 = (lekR)object3.next();
                        if (lekR2 instanceof bWml) {
                            IFYW iFYW = this;
                            yy.E(iFYW, 196078470, (Integer)yy.h(iFYW, 196078470) + 1);
                            continue;
                        }
                        IFYW iFYW = this;
                        yy.E(iFYW, 821685131, (Integer)yy.h(iFYW, 821685131) + 1);
                    }
                }
            }
        }
    }

    public aKuV<World, AXPu<Chunk, lekR>> YfkF() {
        return (aKuV)yy.h(this, 1065937846);
    }

    public int UlAU() {
        return (Integer)yy.h(this, 821685131);
    }

    public int LiVY() {
        return (Integer)yy.h(this, 196078470);
    }

    public int nSEv() {
        return (int)IFYW.VR((Integer)yy.h(this, 821685131) + (Integer)yy.h(this, 196078470));
    }

    private static Object VR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

