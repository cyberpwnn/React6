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
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkUnloadEvent;

public abstract class xPJu
extends Thread
implements Listener {
    private boolean stoU = true;
    private boolean DlJT = true;
    private boolean FrPY = true;
    private boolean wxjk = true;
    private boolean LHlf = true;
    private boolean vlvb = false;
    private int hSJa = 0;
    private int BvbY = 0;
    private int yLKF = 0;
    private int lVfA = 0;
    private int VFFr = 0;
    private int wowN = 0;
    private int FOhw = 0;
    private long LOqF = xPJu.sc();

    public xPJu() {
        xPJu.sc(this);
        this.setName(FMkR$WjFM.a("\uc097\u3e16\u3960\u255b\u7eb1\u8e7c\u1b21\ub4a8\uc791\u0956\u140e\u1227\uc59c\ubfee\u2601\u5805\ufac5\ua61e\uef29"));
    }

    @Override
    public void run() {
        while (!xPJu.interrupted()) {
            try {
                this.IgvC();
                xPJu.sc(50);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (!xPJu.interrupted()) continue;
            return;
        }
        xPJu.sc(this);
    }

    public abstract void yJLS(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @EventHandler
    public void UtIU(ChunkLoadEvent chunkLoadEvent) {
        o.v(this, 1837976668, true);
        o.v(this, 2045594715, true);
        o.v(this, 225201258, true);
        o.v(this, -1757393815, true);
        xPJu xPJu2 = this;
        o.v(xPJu2, -947631000, (Integer)o.a(xPJu2, -947631000) + 1);
    }

    @EventHandler
    public void yJLS(ChunkUnloadEvent chunkUnloadEvent) {
        o.v(this, 1837976668, true);
        o.v(this, 2045594715, true);
        o.v(this, 225201258, true);
        o.v(this, -1757393815, true);
        xPJu xPJu2 = this;
        o.v(xPJu2, -206615449, (Integer)o.a(xPJu2, -206615449) + 1);
    }

    @EventHandler
    public void yJLS(EntitySpawnEvent entitySpawnEvent) {
        o.v(this, 225201258, true);
    }

    @EventHandler
    public void yJLS(EntityDeathEvent entityDeathEvent) {
        o.v(this, 225201258, true);
    }

    @EventHandler
    public void yJLS(PlayerDropItemEvent playerDropItemEvent) {
        o.v(this, -1757393815, true);
    }

    @EventHandler
    public void yJLS(PlayerPickupItemEvent playerPickupItemEvent) {
        o.v(this, -1757393815, true);
    }

    @EventHandler
    public void yJLS(BlockPlaceEvent blockPlaceEvent) {
        o.v(this, 2045594715, true);
    }

    @EventHandler
    public void yJLS(BlockBreakEvent blockBreakEvent) {
        o.v(this, 2045594715, true);
    }

    private void uNxm() {
        o.v(this, -1430762394, true);
    }

    private void IgvC() {
        block11 : {
            block10 : {
                if (((Boolean)o.a(this, 1837976668)).booleanValue() || ((Boolean)o.a(this, -1757393815)).booleanValue() || ((Boolean)o.a(this, 2045594715)).booleanValue() || ((Boolean)o.a(this, 225201258)).booleanValue()) {
                    o.v(this, -2146218907, true);
                }
                if (((Boolean)o.a(this, 1837976668)).booleanValue()) {
                    this.TXMa();
                    o.v(this, 1837976668, false);
                    this.uNxm();
                }
                if (((Boolean)o.a(this, -1757393815)).booleanValue()) {
                    this.YEYc();
                    o.v(this, -1757393815, false);
                    this.uNxm();
                }
                if (((Boolean)o.a(this, 2045594715)).booleanValue()) {
                    this.WPTp();
                    o.v(this, 2045594715, false);
                    this.uNxm();
                }
                if (((Boolean)o.a(this, 225201258)).booleanValue()) {
                    this.hkXA();
                    o.v(this, 225201258, false);
                    this.uNxm();
                }
                if (((Boolean)o.a(this, -2146218907)).booleanValue()) {
                    this.XBWB();
                    o.v(this, -2146218907, false);
                    this.uNxm();
                }
                if (((Boolean)o.a(this, -1430762394)).booleanValue()) break block10;
                if (xPJu.sc() - (Long)o.a(this, -1771287452) <= 1000) break block11;
            }
            this.yJLS((Integer)o.a(this, -1097839517), (Integer)o.a(this, -1081652142), (Integer)o.a(this, 2125483089), (Integer)o.a(this, -690336688), (Integer)o.a(this, 683363407), (Integer)o.a(this, -947631000), (Integer)o.a(this, -206615449));
            if (xPJu.sc() - (Long)o.a(this, -1771287452) > 1000) {
                o.v(this, -1771287452, (long)xPJu.sc());
                o.v(this, -947631000, 0);
                o.v(this, -947631000, 0);
            }
        }
    }

    private void XBWB() {
        o.v(this, 683363407, 0);
        Iterator<E> iterator = xPJu.sc().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            xPJu xPJu2 = this;
            o.v(xPJu2, 683363407, (Integer)o.a(xPJu2, 683363407) + world.getEntities().size());
        }
    }

    private void hkXA() {
        o.v(this, -690336688, 0);
        Iterator<E> iterator = xPJu.sc().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            xPJu xPJu2 = this;
            o.v(xPJu2, -690336688, (Integer)o.a(xPJu2, -690336688) + world.getLivingEntities().size());
        }
    }

    private void WPTp() {
        o.v(this, 2125483089, 0);
        Iterator<E> iterator = xPJu.sc().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            Chunk[] arrchunk = world.getLoadedChunks();
            int n = arrchunk.length;
            int n2 = 0;
            while (n2 < n) {
                Chunk chunk = arrchunk[n2];
                xPJu xPJu2 = this;
                o.v(xPJu2, 2125483089, (Integer)o.a(xPJu2, 2125483089) + chunk.getTileEntities().length);
                ++n2;
            }
        }
    }

    private void YEYc() {
        o.v(this, -1081652142, 0);
        Iterator<E> iterator = xPJu.sc().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            xPJu xPJu2 = this;
            o.v(xPJu2, -1081652142, (Integer)o.a(xPJu2, -1081652142) + world.getEntitiesByClass(Item.class).size());
        }
    }

    private void TXMa() {
        o.v(this, -1097839517, 0);
        Iterator<E> iterator = xPJu.sc().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            xPJu xPJu2 = this;
            o.v(xPJu2, -1097839517, (Integer)o.a(xPJu2, -1097839517) + world.getLoadedChunks().length);
        }
    }

    private static Object sc(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

