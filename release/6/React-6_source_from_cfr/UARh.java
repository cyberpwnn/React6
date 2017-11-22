/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.World
 *  org.bukkit.block.BlockState
 *  org.bukkit.entity.Item
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.BlockBreakEvent
 *  org.bukkit.event.block.BlockPlaceEvent
 *  org.bukkit.event.entity.EntityDeathEvent
 *  org.bukkit.event.entity.EntityPickupItemEvent
 *  org.bukkit.event.entity.EntitySpawnEvent
 *  org.bukkit.event.player.PlayerDropItemEvent
 *  org.bukkit.event.player.PlayerPickupItemEvent
 *  org.bukkit.event.world.ChunkLoadEvent
 *  org.bukkit.event.world.ChunkUnloadEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkUnloadEvent;

public abstract class UARh
extends Thread
implements Listener {
    private boolean oFFx = true;
    private boolean lDnD = true;
    private boolean msEn = true;
    private boolean hbtg = true;
    private boolean jqkp = true;
    private boolean KEPs = false;
    private int giAG = 0;
    private int LGom = 0;
    private int DjmB = 0;
    private int KfpS = 0;
    private int NhJL = 0;
    private int XeEo = 0;
    private int CFHE = 0;
    private long QFEs = UARh.zz();

    public UARh() {
        UARh.zz(this);
        this.setName(YEBy$TyVf.W("\u00a9\uacb1\u7cec\ua5a8\ua656\u16db\u0ca2\u69f9\uf52a\ucac2\u0e87\u278a\u75f1\u3e80\u6604\uef3f\u2a3e\u6f0b\u42aa"));
    }

    @Override
    public void run() {
        while (!UARh.interrupted()) {
            try {
                this.avmQ();
                UARh.zz(50);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        UARh.zz(this);
    }

    public abstract void ssNb(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @EventHandler
    public void ssNb(ChunkLoadEvent chunkLoadEvent) {
        cv.e(this, -1396247325, true);
        cv.e(this, 469759202, true);
        cv.e(this, 1726805229, true);
        cv.e(this, -24709908, true);
        UARh uARh = this;
        cv.e(uARh, -304089873, (Integer)cv.b(uARh, -304089873) + 1);
    }

    @EventHandler
    public void ssNb(ChunkUnloadEvent chunkUnloadEvent) {
        cv.e(this, -1396247325, true);
        cv.e(this, 469759202, true);
        cv.e(this, 1726805229, true);
        cv.e(this, -24709908, true);
        UARh uARh = this;
        cv.e(uARh, -1218841362, (Integer)cv.b(uARh, -1218841362) + 1);
    }

    @EventHandler
    public void ssNb(EntitySpawnEvent entitySpawnEvent) {
        cv.e(this, 1726805229, true);
    }

    @EventHandler
    public void ssNb(EntityDeathEvent entityDeathEvent) {
        cv.e(this, 1726805229, true);
    }

    @EventHandler
    public void ssNb(PlayerDropItemEvent playerDropItemEvent) {
        cv.e(this, -24709908, true);
    }

    @EventHandler
    public void ssNb(PlayerPickupItemEvent playerPickupItemEvent) {
        cv.e(this, -24709908, true);
    }

    @EventHandler
    public void ssNb(EntityPickupItemEvent entityPickupItemEvent) {
        cv.e(this, -24709908, true);
    }

    @EventHandler
    public void ssNb(BlockPlaceEvent blockPlaceEvent) {
        cv.e(this, 469759202, true);
    }

    @EventHandler
    public void ssNb(BlockBreakEvent blockBreakEvent) {
        cv.e(this, 469759202, true);
    }

    private void wevr() {
        cv.e(this, 777843945, true);
    }

    private void avmQ() {
        block11 : {
            block10 : {
                if (((Boolean)cv.b(this, -1396247325)).booleanValue() || ((Boolean)cv.b(this, -24709908)).booleanValue() || ((Boolean)cv.b(this, 469759202)).booleanValue() || ((Boolean)cv.b(this, 1726805229)).booleanValue()) {
                    cv.e(this, -34605848, true);
                }
                if (((Boolean)cv.b(this, -1396247325)).booleanValue()) {
                    this.rEii();
                    cv.e(this, -1396247325, false);
                    this.wevr();
                }
                if (((Boolean)cv.b(this, -24709908)).booleanValue()) {
                    this.piwO();
                    cv.e(this, -24709908, false);
                    this.wevr();
                }
                if (((Boolean)cv.b(this, 469759202)).booleanValue()) {
                    this.jyhK();
                    cv.e(this, 469759202, false);
                    this.wevr();
                }
                if (((Boolean)cv.b(this, 1726805229)).booleanValue()) {
                    this.WFya();
                    cv.e(this, 1726805229, false);
                    this.wevr();
                }
                if (((Boolean)cv.b(this, -34605848)).booleanValue()) {
                    this.DQFV();
                    cv.e(this, -34605848, false);
                    this.wevr();
                }
                if (((Boolean)cv.b(this, 777843945)).booleanValue()) break block10;
                if (UARh.zz() - (Long)cv.b(this, 1419703531) <= 1000) break block11;
            }
            this.ssNb((Integer)cv.b(this, -1472334614), (Integer)cv.b(this, -1166740267), (Integer)cv.b(this, 370472148), (Integer)cv.b(this, 904918231), (Integer)cv.b(this, -2090928938), (Integer)cv.b(this, -304089873), (Integer)cv.b(this, -1218841362));
            if (UARh.zz() - (Long)cv.b(this, 1419703531) > 1000) {
                cv.e(this, 1419703531, (long)UARh.zz());
                cv.e(this, -304089873, 0);
                cv.e(this, -304089873, 0);
            }
        }
    }

    private void DQFV() {
        cv.e(this, -2090928938, 0);
        Iterator<E> iterator = UARh.zz().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            UARh uARh = this;
            cv.e(uARh, -2090928938, (Integer)cv.b(uARh, -2090928938) + world.getEntities().size());
        }
    }

    private void WFya() {
        cv.e(this, 904918231, 0);
        Iterator<E> iterator = UARh.zz().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            UARh uARh = this;
            cv.e(uARh, 904918231, (Integer)cv.b(uARh, 904918231) + world.getLivingEntities().size());
        }
    }

    private void jyhK() {
        cv.e(this, 370472148, 0);
        Iterator<E> iterator = UARh.zz().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            Chunk[] arrchunk = world.getLoadedChunks();
            int n = arrchunk.length;
            int n2 = 0;
            while (n2 < n) {
                Chunk chunk = arrchunk[n2];
                UARh uARh = this;
                cv.e(uARh, 370472148, (Integer)cv.b(uARh, 370472148) + chunk.getTileEntities().length);
                ++n2;
            }
        }
    }

    private void piwO() {
        cv.e(this, -1166740267, 0);
        Iterator<E> iterator = UARh.zz().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            UARh uARh = this;
            cv.e(uARh, -1166740267, (Integer)cv.b(uARh, -1166740267) + world.getEntitiesByClass(Item.class).size());
        }
    }

    private void rEii() {
        cv.e(this, -1472334614, 0);
        Iterator<E> iterator = UARh.zz().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            UARh uARh = this;
            cv.e(uARh, -1472334614, (Integer)cv.b(uARh, -1472334614) + world.getLoadedChunks().length);
        }
    }

    private static Object zz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

