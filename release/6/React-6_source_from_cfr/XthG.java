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

public class XthG
extends jqQR {
    private QyFw<Material> GcEw;
    private int GHsC;
    private int WrUT;
    private bqeB LYCf;
    private bqeB oETd;
    private bqeB YpKG;
    private boolean JIlF;
    private long maRM;
    private long rhQD;
    private QyFw<Chunk> Vwau;
    private ktOu<Chunk, QyFw<Block>> cmJN;
    private ktOu<Chunk, Long> Svko;

    @Override
    public void start() {
        XthG.nY(this);
        cv.e(this, -1631980969, new ktOu());
        cv.e(this, -1425542570, new ktOu());
        cv.e(this, 2007233105, new QyFw());
        cv.e(this, 267448912, 0);
        cv.e(this, -1634799021, 0);
        cv.e(this, 607384146, new bqeB(15));
        cv.e(this, -589630883, new bqeB(3));
        cv.e(this, 2062742108, new bqeB(20));
        cv.e(this, 1439298143, false);
        cv.e(this, 954724953, (long)XthG.nY());
        cv.e(this, 2027745944, (long)XthG.nY());
        cv.e(this, -904662373, new QyFw());
        XthG.nY((QyFw)cv.b(this, -904662373), (Material)cv.e(496759450));
    }

    public void nJLQ(Chunk chunk) {
        if (this.EmLA(chunk)) {
            this.TyVf(chunk);
            this.vtFs(chunk);
        }
    }

    private void YoWX() {
        QyFw qyFw = new QyFw();
        XthG.nY(qyFw, XthG.nY((ktOu)cv.b(this, -1631980969)));
        XthG.nY(qyFw, (QyFw)cv.b(this, 2007233105));
        Object object = XthG.nY(qyFw);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            this.vtFs(chunk);
        }
    }

    private void vtFs(Chunk chunk) {
        if (!this.EmLA(chunk)) {
            if (XthG.nY((ktOu)cv.b(this, -1631980969), chunk) != false) {
                Object object = XthG.nY((QyFw)XthG.nY((ktOu)cv.b(this, -1631980969), chunk));
                while (object.hasNext()) {
                    Block block = (Block)object.next();
                    XthG.nY(block);
                }
                XthG.nY((ktOu)cv.b(this, -1631980969), chunk);
            }
        }
        if (this.EmLA(chunk)) {
            if (XthG.nY() >= XthG.nY((Long)XthG.nY((ktOu)cv.b(this, -1425542570), chunk))) {
                this.nJLQ(chunk);
            }
        }
    }

    public void IWSm(Block block) {
        if (XthG.nY((ktOu)cv.b(this, -1631980969), block.getChunk()) == false) {
            XthG.nY((ktOu)cv.b(this, -1631980969), block.getChunk(), new QyFw());
        }
        XthG.nY((QyFw)XthG.nY((ktOu)cv.b(this, -1631980969), block.getChunk()), block);
    }

    public boolean EmLA(Chunk chunk) {
        return (boolean)XthG.nY((QyFw)cv.b(this, 2007233105), chunk);
    }

    public void WGJn(Chunk chunk) {
        this.ssNb(chunk, 10000);
    }

    public void TyVf(Chunk chunk) {
        if (XthG.nY((QyFw)cv.b(this, 2007233105), chunk) == false) {
            return;
        }
        XthG.nY((QyFw)cv.b(this, 2007233105), chunk);
        new XthG$1(this, chunk);
    }

    public void ssNb(Chunk chunk, long l) {
        if (this.EmLA(chunk)) {
            return;
        }
        XthG.nY((QyFw)cv.b(this, 2007233105), chunk);
        XthG.nY((ktOu)cv.b(this, -1425542570), chunk, XthG.nY(XthG.nY() + l));
        new XthG$2(this, chunk, l);
    }

    @Override
    public void stop() {
        XthG.nY(this);
    }

    @Override
    public void tick() {
        this.YoWX();
        XthG.nY((bqeB)cv.b(this, 607384146), (Integer)cv.b(this, 267448912));
        XthG.nY((bqeB)cv.b(this, -589630883), (Integer)cv.b(this, -1634799021));
        cv.e(this, 267448912, 0);
        cv.e(this, -1634799021, 0);
        this.wfLE();
    }

    private void wfLE() {
        if ((Long)cv.b(this, 2027745944) < (Long)cv.b(this, 954724953)) {
            cv.e(this, 954724953, (long)((Long)cv.b(this, 2027745944)));
        }
        XthG.nY((bqeB)cv.b(this, 2062742108), (Long)cv.b(this, 2027745944) - (Long)cv.b(this, 954724953));
        cv.e(this, 2027745944, (long)XthG.nY());
        cv.e(this, 954724953, (long)((Long)cv.b(this, 2027745944)));
        cv.e(this, 1439298143, false);
    }

    private void yuFb() {
        if (!((Boolean)cv.b(this, 1439298143)).booleanValue()) {
            cv.e(this, 1439298143, true);
            cv.e(this, 954724953, (long)XthG.nY());
            return;
        }
        cv.e(this, 2027745944, (long)XthG.nY());
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void ssNb(InventoryMoveItemEvent inventoryMoveItemEvent) {
        if (XthG.nY(inventoryMoveItemEvent).getHolder() instanceof BlockState) {
            if (XthG.nY((QyFw)cv.b(this, -904662373), ((BlockState)XthG.nY(inventoryMoveItemEvent).getHolder()).getBlock().getType()) != false) {
                if (this.EmLA(((BlockState)XthG.nY(inventoryMoveItemEvent).getHolder()).getBlock().getChunk())) {
                    this.IWSm(((BlockState)XthG.nY(inventoryMoveItemEvent).getHolder()).getBlock());
                    XthG.nY(inventoryMoveItemEvent, true);
                    return;
                }
                this.yuFb();
                XthG xthG = this;
                cv.e(xthG, -1634799021, (Integer)cv.b(xthG, -1634799021) + 1);
                XthG xthG2 = this;
                cv.e(xthG2, 267448912, (Integer)cv.b(xthG2, 267448912) + 1);
                XthG.nY((YUgh)cv.b((YoSa)cv.e(239341894), -2047282554), ((BlockState)XthG.nY(inventoryMoveItemEvent).getHolder()).getBlock().getChunk());
            }
        }
    }

    public QyFw<Material> wDLU() {
        return (QyFw)cv.b(this, -904662373);
    }

    public int EvBS() {
        return (Integer)cv.b(this, 267448912);
    }

    public int tCRu() {
        return (Integer)cv.b(this, -1634799021);
    }

    public bqeB cAai() {
        return (bqeB)cv.b(this, 607384146);
    }

    public bqeB JRMO() {
        return (bqeB)cv.b(this, -589630883);
    }

    public bqeB WFpH() {
        return (bqeB)cv.b(this, 2062742108);
    }

    public boolean tKcS() {
        return (Boolean)cv.b(this, 1439298143);
    }

    public long XthG() {
        return (Long)cv.b(this, 954724953);
    }

    public long GIDW() {
        return (Long)cv.b(this, 2027745944);
    }

    public QyFw<Chunk> YUgh() {
        return (QyFw)cv.b(this, 2007233105);
    }

    public ktOu<Chunk, QyFw<Block>> YDey() {
        return (ktOu)cv.b(this, -1631980969);
    }

    public ktOu<Chunk, Long> tLCm() {
        return (ktOu)cv.b(this, -1425542570);
    }

    private static Object nY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

