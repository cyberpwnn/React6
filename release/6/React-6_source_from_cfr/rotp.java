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

public abstract class rotp
extends Thread
implements Listener {
    private boolean dxcP = true;
    private boolean kBCM = true;
    private boolean Ukvx = true;
    private boolean ohBM = true;
    private boolean wMVG = true;
    private boolean IXTW = false;
    private int XAwx = 0;
    private int sbiY = 0;
    private int FWXQ = 0;
    private int QNfQ = 0;
    private int CVaH = 0;
    private int hjxw = 0;
    private int Qgwt = 0;
    private long OGmN = rotp.hL();

    public rotp() {
        rotp.hL(this);
        this.setName(KDGY$JAHk.Y("\u98a1\ud8de\u995b\u95a2\u7861\ue0d9\uab7b\u229e\u697b\u0cac\ufc69\uaed1\u7c3b\uc2b8\ud182\ub8c0\u76f6\u5b40\u3b7b"));
    }

    @Override
    public void run() {
        while (!rotp.interrupted()) {
            try {
                this.qKGr();
                rotp.hL(50);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        rotp.hL(this);
    }

    public abstract void mXJp(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @EventHandler
    public void mXJp(ChunkLoadEvent chunkLoadEvent) {
        yy.E(this, -811137596, true);
        yy.E(this, -1703410183, true);
        yy.E(this, -1791228478, true);
        yy.E(this, -396687881, true);
        rotp rotp2 = this;
        yy.E(rotp2, -1842870792, (Integer)yy.h(rotp2, -1842870792) + 1);
    }

    @EventHandler
    public void mXJp(ChunkUnloadEvent chunkUnloadEvent) {
        yy.E(this, -811137596, true);
        yy.E(this, -1703410183, true);
        yy.E(this, -1791228478, true);
        yy.E(this, -396687881, true);
        rotp rotp2 = this;
        yy.E(rotp2, -1826748979, (Integer)yy.h(rotp2, -1826748979) + 1);
    }

    @EventHandler
    public void mXJp(EntitySpawnEvent entitySpawnEvent) {
        yy.E(this, -1791228478, true);
    }

    @EventHandler
    public void mXJp(EntityDeathEvent entityDeathEvent) {
        yy.E(this, -1791228478, true);
    }

    @EventHandler
    public void mXJp(PlayerDropItemEvent playerDropItemEvent) {
        yy.E(this, -396687881, true);
    }

    @EventHandler
    public void mXJp(PlayerPickupItemEvent playerPickupItemEvent) {
        yy.E(this, -396687881, true);
    }

    @EventHandler
    public void mXJp(EntityPickupItemEvent entityPickupItemEvent) {
        yy.E(this, -396687881, true);
    }

    @EventHandler
    public void mXJp(BlockPlaceEvent blockPlaceEvent) {
        yy.E(this, -1703410183, true);
    }

    @EventHandler
    public void mXJp(BlockBreakEvent blockBreakEvent) {
        yy.E(this, -1703410183, true);
    }

    private void NVMo() {
        yy.E(this, -519567930, true);
    }

    private void qKGr() {
        block11 : {
            block10 : {
                if (((Boolean)yy.h(this, -811137596)).booleanValue() || ((Boolean)yy.h(this, -396687881)).booleanValue() || ((Boolean)yy.h(this, -1703410183)).booleanValue() || ((Boolean)yy.h(this, -1791228478)).booleanValue()) {
                    yy.E(this, 678823371, true);
                }
                if (((Boolean)yy.h(this, -811137596)).booleanValue()) {
                    this.Jkcx();
                    yy.E(this, -811137596, false);
                    this.NVMo();
                }
                if (((Boolean)yy.h(this, -396687881)).booleanValue()) {
                    this.KLcy();
                    yy.E(this, -396687881, false);
                    this.NVMo();
                }
                if (((Boolean)yy.h(this, -1703410183)).booleanValue()) {
                    this.FNWD();
                    yy.E(this, -1703410183, false);
                    this.NVMo();
                }
                if (((Boolean)yy.h(this, -1791228478)).booleanValue()) {
                    this.myxM();
                    yy.E(this, -1791228478, false);
                    this.NVMo();
                }
                if (((Boolean)yy.h(this, 678823371)).booleanValue()) {
                    this.vkaS();
                    yy.E(this, 678823371, false);
                    this.NVMo();
                }
                if (((Boolean)yy.h(this, -519567930)).booleanValue()) break block10;
                if (rotp.hL() - (Long)yy.h(this, -555743796) <= 1000) break block11;
            }
            this.mXJp((Integer)yy.h(this, 853804481), (Integer)yy.h(this, 1631651274), (Integer)yy.h(this, 1379730879), (Integer)yy.h(this, -1959066176), (Integer)yy.h(this, -1502870763), (Integer)yy.h(this, -1842870792), (Integer)yy.h(this, -1826748979));
            if (rotp.hL() - (Long)yy.h(this, -555743796) > 1000) {
                yy.E(this, -555743796, (long)rotp.hL());
                yy.E(this, -1842870792, 0);
                yy.E(this, -1842870792, 0);
            }
        }
    }

    private void vkaS() {
        yy.E(this, -1502870763, 0);
        Iterator<E> iterator = rotp.hL().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            rotp rotp2 = this;
            yy.E(rotp2, -1502870763, (Integer)yy.h(rotp2, -1502870763) + world.getEntities().size());
        }
    }

    private void myxM() {
        yy.E(this, -1959066176, 0);
        Iterator<E> iterator = rotp.hL().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            rotp rotp2 = this;
            yy.E(rotp2, -1959066176, (Integer)yy.h(rotp2, -1959066176) + world.getLivingEntities().size());
        }
    }

    private void FNWD() {
        yy.E(this, 1379730879, 0);
        Iterator<E> iterator = rotp.hL().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            Chunk[] arrchunk = world.getLoadedChunks();
            int n = arrchunk.length;
            int n2 = 0;
            while (n2 < n) {
                Chunk chunk = arrchunk[n2];
                rotp rotp2 = this;
                yy.E(rotp2, 1379730879, (Integer)yy.h(rotp2, 1379730879) + chunk.getTileEntities().length);
                ++n2;
            }
        }
    }

    private void KLcy() {
        yy.E(this, 1631651274, 0);
        Iterator<E> iterator = rotp.hL().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            rotp rotp2 = this;
            yy.E(rotp2, 1631651274, (Integer)yy.h(rotp2, 1631651274) + world.getEntitiesByClass(Item.class).size());
        }
    }

    private void Jkcx() {
        yy.E(this, 853804481, 0);
        Iterator<E> iterator = rotp.hL().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            rotp rotp2 = this;
            yy.E(rotp2, 853804481, (Integer)yy.h(rotp2, 853804481) + world.getLoadedChunks().length);
        }
    }

    private static Object hL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

