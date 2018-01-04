/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.block.BlockState
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.inventory.InventoryMoveItemEvent
 *  org.bukkit.inventory.InventoryHolder
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.InventoryHolder;

public class mXRj
extends ggmf {
    private Lhwj<Material> TrLA;
    private int gXBm;
    private int GATg;
    private OXoN dWIX;
    private OXoN wVPI;
    private OXoN MSfu;
    private boolean BeGP;
    private long Koam;
    private long KDnL;
    private Lhwj<Chunk> Djlb;
    private TNku<Chunk, Lhwj<Block>> tesj;
    private TNku<Chunk, Long> EKoI;

    @Override
    public void start() {
        mXRj.Sq(this);
        o.v(this, 607869380, new TNku());
        o.v(this, 1053186499, new TNku());
        o.v(this, 1779587506, new Lhwj());
        o.v(this, -627091023, 0);
        o.v(this, -1850123856, 0);
        o.v(this, 1819040175, new OXoN(15));
        o.v(this, 572742062, new OXoN(3));
        o.v(this, 1394366893, new OXoN(20));
        o.v(this, 972183980, false);
        o.v(this, -1903470165, (long)mXRj.Sq());
        o.v(this, 1770871226, (long)mXRj.Sq());
        o.v(this, 475027897, new Lhwj());
        mXRj.Sq((Lhwj)o.a(this, 475027897), (Material)o.k(-123776091));
    }

    public void TEqA(Chunk chunk) {
        if (this.GPlk(chunk)) {
            this.HeSD(chunk);
            this.KTiK(chunk);
        }
    }

    private void YMXg() {
        Lhwj lhwj = new Lhwj();
        mXRj.Sq(lhwj, mXRj.Sq((TNku)o.a(this, 607869380)));
        mXRj.Sq(lhwj, (Lhwj)o.a(this, 1779587506));
        Object object = mXRj.Sq(lhwj);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            this.KTiK(chunk);
        }
    }

    private void KTiK(Chunk chunk) {
        if (!this.GPlk(chunk)) {
            if (mXRj.Sq((TNku)o.a(this, 607869380), chunk) != false) {
                Object object = mXRj.Sq((Lhwj)mXRj.Sq((TNku)o.a(this, 607869380), chunk));
                while (object.hasNext()) {
                    Block block = (Block)object.next();
                    mXRj.Sq(block);
                }
                mXRj.Sq((TNku)o.a(this, 607869380), chunk);
            }
        }
        if (this.GPlk(chunk)) {
            if (mXRj.Sq() >= mXRj.Sq((Long)mXRj.Sq((TNku)o.a(this, 1053186499), chunk))) {
                this.TEqA(chunk);
            }
        }
    }

    public void TEqA(Block block) {
        if (mXRj.Sq((TNku)o.a(this, 607869380), block.getChunk()) == false) {
            mXRj.Sq((TNku)o.a(this, 607869380), block.getChunk(), new Lhwj());
        }
        mXRj.Sq((Lhwj)mXRj.Sq((TNku)o.a(this, 607869380), block.getChunk()), block);
    }

    public boolean GPlk(Chunk chunk) {
        return (boolean)mXRj.Sq((Lhwj)o.a(this, 1779587506), chunk);
    }

    public void ktHX(Chunk chunk) {
        this.yJLS(chunk, 10000);
    }

    public void HeSD(Chunk chunk) {
        if (mXRj.Sq((Lhwj)o.a(this, 1779587506), chunk) == false) {
            return;
        }
        mXRj.Sq((Lhwj)o.a(this, 1779587506), chunk);
    }

    public void yJLS(Chunk chunk, long l) {
        if (this.GPlk(chunk)) {
            return;
        }
        mXRj.Sq((Lhwj)o.a(this, 1779587506), chunk);
        mXRj.Sq((TNku)o.a(this, 1053186499), chunk, mXRj.Sq(mXRj.Sq() + l));
    }

    @Override
    public void stop() {
        mXRj.Sq(this);
    }

    @Override
    public void tick() {
        this.YMXg();
        mXRj.Sq((OXoN)o.a(this, 1819040175), (Integer)o.a(this, -627091023));
        mXRj.Sq((OXoN)o.a(this, 572742062), (Integer)o.a(this, -1850123856));
        o.v(this, -627091023, 0);
        o.v(this, -1850123856, 0);
        this.FyEK();
    }

    private void FyEK() {
        if ((Long)o.a(this, 1770871226) < (Long)o.a(this, -1903470165)) {
            o.v(this, -1903470165, (long)((Long)o.a(this, 1770871226)));
        }
        mXRj.Sq((OXoN)o.a(this, 1394366893), (Long)o.a(this, 1770871226) - (Long)o.a(this, -1903470165));
        o.v(this, 1770871226, (long)mXRj.Sq());
        o.v(this, -1903470165, (long)((Long)o.a(this, 1770871226)));
        o.v(this, 972183980, false);
    }

    private void TWYT() {
        if (!((Boolean)o.a(this, 972183980)).booleanValue()) {
            o.v(this, 972183980, true);
            o.v(this, -1903470165, (long)mXRj.Sq());
            return;
        }
        o.v(this, 1770871226, (long)mXRj.Sq());
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(InventoryMoveItemEvent inventoryMoveItemEvent) {
        if (mXRj.Sq(inventoryMoveItemEvent).getHolder() instanceof BlockState) {
            if (mXRj.Sq((Lhwj)o.a(this, 475027897), ((BlockState)mXRj.Sq(inventoryMoveItemEvent).getHolder()).getBlock().getType()) != false) {
                if (this.GPlk(((BlockState)mXRj.Sq(inventoryMoveItemEvent).getHolder()).getBlock().getChunk())) {
                    this.TEqA(((BlockState)mXRj.Sq(inventoryMoveItemEvent).getHolder()).getBlock());
                    mXRj.Sq(inventoryMoveItemEvent, true);
                    return;
                }
                this.TWYT();
                mXRj mXRj2 = this;
                o.v(mXRj2, -1850123856, (Integer)o.a(mXRj2, -1850123856) + 1);
                mXRj mXRj3 = this;
                o.v(mXRj3, -627091023, (Integer)o.a(mXRj3, -627091023) + 1);
                mXRj.Sq((bXTW)o.a((TEqA)o.k(911295720), -550610684), ((BlockState)mXRj.Sq(inventoryMoveItemEvent).getHolder()).getBlock().getChunk());
            }
        }
    }

    public Lhwj<Material> cJUN() {
        return (Lhwj)o.a(this, 475027897);
    }

    public int mXRj() {
        return (Integer)o.a(this, -627091023);
    }

    public int tKeR() {
        return (Integer)o.a(this, -1850123856);
    }

    public OXoN rMpA() {
        return (OXoN)o.a(this, 1819040175);
    }

    public OXoN FWER() {
        return (OXoN)o.a(this, 572742062);
    }

    public OXoN dDgX() {
        return (OXoN)o.a(this, 1394366893);
    }

    public boolean jxxu() {
        return (Boolean)o.a(this, 972183980);
    }

    public long YLuU() {
        return (Long)o.a(this, -1903470165);
    }

    public long WytI() {
        return (Long)o.a(this, 1770871226);
    }

    public Lhwj<Chunk> JkaV() {
        return (Lhwj)o.a(this, 1779587506);
    }

    public TNku<Chunk, Lhwj<Block>> HLIY() {
        return (TNku)o.a(this, 607869380);
    }

    public TNku<Chunk, Long> KwVE() {
        return (TNku)o.a(this, 1053186499);
    }

    private static Object Sq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

