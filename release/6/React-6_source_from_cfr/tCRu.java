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

public class tCRu
extends jqQR {
    private ktOu<World, mXMK<Chunk, HuvK>> sbdE = new ktOu();
    private int PvRY = 0;
    private int EurP = 0;

    public boolean enabled() {
        return (Boolean)cv.e(1030754657);
    }

    public void DYFV(World world) {
        if (!this.enabled()) {
            return;
        }
        if (tCRu.SR((ktOu)cv.b(this, -80736248), world) != false) {
            Object object = tCRu.SR(((mXMK)tCRu.SR((ktOu)cv.b(this, -80736248), world)).rwyd());
            while (object.hasNext()) {
                Chunk chunk = (Chunk)object.next();
                this.YoSa(chunk);
            }
        }
        tCRu.SR((ktOu)cv.b(this, -80736248), world);
    }

    public void OXeK(Chunk chunk) {
        if (!this.enabled()) {
            return;
        }
        this.IWSm(chunk.getWorld());
        if (tCRu.SR((ktOu)cv.b(this, -80736248), chunk.getWorld()) != false) {
            for (Entity entity : chunk.getEntities()) {
                this.vtFs(entity);
            }
        }
    }

    public void vtFs(Entity entity) {
        if (!this.enabled()) {
            return;
        }
        this.IWSm(entity.getWorld());
        if (entity instanceof Player) {
            return;
        }
        HuvK huvK = entity instanceof Item ? new aCiR((Item)entity) : (entity instanceof Sheep ? new WiQN((Sheep)entity) : (entity instanceof Ageable ? new RkCQ((Ageable)entity) : (entity instanceof LivingEntity ? new YDcD((LivingEntity)entity) : new HuvK(entity))));
        if (tCRu.SR((ktOu)cv.b(this, -80736248), entity.getWorld()) == false) {
            tCRu.SR((ktOu)cv.b(this, -80736248), entity.getWorld(), new YEBy());
        }
        ((mXMK)tCRu.SR((ktOu)cv.b(this, -80736248), entity.getWorld())).put(tCRu.SR(entity.getLocation()), huvK);
    }

    public boolean ssNb(UUID uUID, Chunk chunk) {
        for (Entity entity : chunk.getEntities()) {
            if (tCRu.SR(entity.getUniqueId(), uUID) == false) continue;
            return true;
        }
        return false;
    }

    public int YoSa(Chunk chunk) {
        int n = 0;
        if (!this.enabled()) {
            return 0;
        }
        if (tCRu.SR((ktOu)cv.b(this, -80736248), chunk.getWorld()) != false) {
            if (((mXMK)tCRu.SR((ktOu)cv.b(this, -80736248), chunk.getWorld())).IWSm(chunk)) {
                if (tCRu.SR(((mXMK)tCRu.SR((ktOu)cv.b(this, -80736248), chunk.getWorld())).ssNb(chunk)) != false) {
                    return 0;
                }
                QyFw qyFw = ((mXMK)tCRu.SR((ktOu)cv.b(this, -80736248), chunk.getWorld())).ssNb(chunk);
                QyFw qyFw2 = new QyFw();
                ((mXMK)tCRu.SR((ktOu)cv.b(this, -80736248), chunk.getWorld())).DYFV(chunk);
                Object object = tCRu.SR(qyFw);
                while (object.hasNext()) {
                    HuvK huvK = (HuvK)object.next();
                    if (tCRu.SR(qyFw2, tCRu.SR(huvK)) != false) continue;
                    EntityType entityType = ((EntityType[])tCRu.SR())[tCRu.SR(huvK)];
                    Location location = chunk.getBlock(0, 0, 0).getLocation();
                    Entity entity = tCRu.SR(entityType, (EntityType)cv.e(-674426503)) != false ? chunk.getWorld().dropItem(location, new ItemStack((Material)cv.e(-1385360907))) : chunk.getWorld().spawnEntity(location, entityType);
                    tCRu.SR(huvK, entity);
                    tCRu.SR(qyFw2, tCRu.SR(huvK));
                    ++n;
                }
            }
        }
        return n;
    }

    public void IWSm(World world) {
        if (tCRu.SR((ktOu)cv.b(this, -80736248), world) == false) {
            tCRu.SR((ktOu)cv.b(this, -80736248), world, new YEBy());
        }
    }

    @EventHandler
    public void ssNb(WorldLoadEvent worldLoadEvent) {
        if (!this.enabled()) {
            return;
        }
        this.IWSm((World)tCRu.SR(worldLoadEvent));
    }

    @EventHandler
    public void ssNb(ChunkUnloadEvent chunkUnloadEvent) {
        if (!this.enabled()) {
            return;
        }
        this.YoSa((Chunk)tCRu.SR(chunkUnloadEvent));
    }

    @EventHandler
    public void ssNb(WorldUnloadEvent worldUnloadEvent) {
        if (!this.enabled()) {
            return;
        }
        this.DYFV((World)tCRu.SR(worldUnloadEvent));
        tCRu.SR((ktOu)cv.b(this, -80736248), tCRu.SR(worldUnloadEvent));
    }

    @Override
    public void start() {
        tCRu.SR(this);
    }

    @Override
    public void stop() {
        tCRu.SR(this);
    }

    public boolean jhSt(Chunk chunk) {
        if (tCRu.SR((ktOu)cv.b(this, -80736248), chunk.getWorld()) != false) {
            if (((mXMK)tCRu.SR((ktOu)cv.b(this, -80736248), chunk.getWorld())).IWSm(chunk)) {
                return true;
            }
        }
        return false;
    }

    @EventHandler
    public void ssNb(EntitySpawnEvent entitySpawnEvent) {
        if (!this.enabled()) {
            return;
        }
        if (this.jhSt((Chunk)tCRu.SR(tCRu.SR(entitySpawnEvent)))) {
            tCRu.SR(entitySpawnEvent, true);
        }
    }

    @Override
    public void tick() {
        if (!this.enabled()) {
            return;
        }
        if ((Long)cv.e(871764466) % (long)((Integer)cv.e(234623352)).intValue() == 0) {
            Object object;
            Object object2;
            Chunk chunk;
            jyXs jyXs2 = new jyXs();
            tCRu.SR(jyXs2);
            Iterator iterator = tCRu.SR().iterator();
            while (iterator.hasNext()) {
                object2 = (Player)iterator.next();
                object = tCRu.SR(tCRu.SR(tCRu.SR(object2.getLocation()), (Integer)cv.e(-116387399)));
                while (object.hasNext()) {
                    chunk = (Chunk)object.next();
                    tCRu.SR(chunk);
                    tCRu.SR(tCRu.SR(jyXs2), chunk);
                }
            }
            iterator = tCRu.SR(tCRu.SR(jyXs2));
            while (iterator.hasNext()) {
                object2 = iterator.next();
                for (int i = 0; i < ((Chunk)object2).getEntities().length; ++i) {
                    chunk = ((Chunk)object2).getEntities()[i];
                    if (chunk == null || chunk instanceof Player || chunk.isDead()) continue;
                    tCRu.SR(chunk);
                    tCRu.SR(chunk);
                }
            }
            cv.e(this, 343339704, 0);
            cv.e(this, -1319046469, 0);
            iterator = tCRu.SR().iterator();
            while (iterator.hasNext()) {
                object2 = (World)iterator.next();
                if (tCRu.SR((ktOu)cv.b(this, -80736248), object2) == false) continue;
                object = tCRu.SR(((mXMK)tCRu.SR((ktOu)cv.b(this, -80736248), object2)).rwyd());
                while (object.hasNext()) {
                    chunk = (Chunk)object.next();
                    Object object3 = tCRu.SR(((mXMK)tCRu.SR((ktOu)cv.b(this, -80736248), object2)).ssNb(chunk));
                    while (object3.hasNext()) {
                        HuvK huvK = (HuvK)object3.next();
                        if (huvK instanceof aCiR) {
                            tCRu tCRu2 = this;
                            cv.e(tCRu2, 343339704, (Integer)cv.b(tCRu2, 343339704) + 1);
                            continue;
                        }
                        tCRu tCRu3 = this;
                        cv.e(tCRu3, -1319046469, (Integer)cv.b(tCRu3, -1319046469) + 1);
                    }
                }
            }
        }
    }

    public ktOu<World, mXMK<Chunk, HuvK>> kAFo() {
        return (ktOu)cv.b(this, -80736248);
    }

    public int tvSr() {
        return (Integer)cv.b(this, -1319046469);
    }

    public int VfMm() {
        return (Integer)cv.b(this, 343339704);
    }

    public int fcyq() {
        return (int)tCRu.SR((Integer)cv.b(this, -1319046469) + (Integer)cv.b(this, 343339704));
    }

    private static Object SR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

