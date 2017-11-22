/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.block.BlockFromToEvent
 *  org.bukkit.event.block.BlockPhysicsEvent
 *  org.bukkit.event.world.ChunkUnloadEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Set;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.world.ChunkUnloadEvent;

public class TOJM
extends jqQR {
    private QyFw<Material> GcEw;
    private QyFw<Chunk> Vwau;
    private ktOu<Chunk, QyFw<Block>> cmJN;
    private ktOu<Chunk, Long> Svko;
    private int VfdN;
    private int TiNm;
    private bqeB KoUa;
    private bqeB mrUv;
    private bqeB kIkt;
    private boolean JIlF;
    private long maRM;
    private long rhQD;

    @Override
    public void start() {
        TOJM.dh(this);
        cv.e(this, 1660941634, new ktOu());
        cv.e(this, -1061882547, new ktOu());
        cv.e(this, 1597437260, new QyFw());
        cv.e(this, 1230370127, new QyFw());
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(1827140942));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(612037961));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(-1712458424));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(-867437237));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(651883850));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(1297478965));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(-1391397580));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(2020930871));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(596309302));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(-828705487));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(-757009104));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(312866099));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(1769600306));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(1653667133));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(-1510804164));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(518190399));
        TOJM.dh((QyFw)cv.b(this, 1230370127), (Material)cv.e(-290917058));
        cv.e(this, 1649866041, 0);
        cv.e(this, -1031081224, 0);
        cv.e(this, 2074407675, new bqeB(15));
        cv.e(this, -806620422, new bqeB(3));
        cv.e(this, -1546521883, new bqeB(20));
        cv.e(this, -2097745180, false);
        cv.e(this, -119409945, (long)TOJM.dh());
        cv.e(this, -757337370, (long)TOJM.dh());
    }

    @Override
    public void stop() {
        TOJM.dh(this);
        Object object = TOJM.dh(new wfPa((QyFw)cv.b(this, 1597437260)));
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            this.nJLQ(chunk);
        }
    }

    public void nJLQ(Chunk chunk) {
        if (this.EmLA(chunk)) {
            this.TyVf(chunk);
            this.vtFs(chunk);
        }
    }

    @Override
    public void tick() {
        this.YoWX();
        TOJM.dh((bqeB)cv.b(this, 2074407675), (Integer)cv.b(this, 1649866041));
        TOJM.dh((bqeB)cv.b(this, -806620422), (Integer)cv.b(this, -1031081224));
        cv.e(this, 1649866041, 0);
        cv.e(this, -1031081224, 0);
        this.wfLE();
    }

    private void YoWX() {
        QyFw qyFw = new QyFw();
        TOJM.dh(qyFw, TOJM.dh((ktOu)cv.b(this, 1660941634)));
        TOJM.dh(qyFw, (QyFw)cv.b(this, 1597437260));
        Object object = TOJM.dh(qyFw);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            this.vtFs(chunk);
        }
    }

    private void vtFs(Chunk chunk) {
        if (!this.EmLA(chunk)) {
            if (TOJM.dh((ktOu)cv.b(this, 1660941634), chunk) != false) {
                Object object = TOJM.dh((QyFw)TOJM.dh((ktOu)cv.b(this, 1660941634), chunk));
                while (object.hasNext()) {
                    Block block = (Block)object.next();
                    TOJM.dh(block);
                }
                TOJM.dh((ktOu)cv.b(this, 1660941634), chunk);
            }
        }
        if (this.EmLA(chunk)) {
            if (TOJM.dh() >= TOJM.dh((Long)TOJM.dh((ktOu)cv.b(this, -1061882547), chunk))) {
                this.nJLQ(chunk);
            }
        }
    }

    public void IWSm(Block block) {
        if (TOJM.dh((ktOu)cv.b(this, 1660941634), block.getChunk()) == false) {
            TOJM.dh((ktOu)cv.b(this, 1660941634), block.getChunk(), new QyFw());
        }
        TOJM.dh((QyFw)TOJM.dh((ktOu)cv.b(this, 1660941634), block.getChunk()), block);
    }

    public boolean EmLA(Chunk chunk) {
        return (boolean)TOJM.dh((QyFw)cv.b(this, 1597437260), chunk);
    }

    public void WGJn(Chunk chunk) {
        this.ssNb(chunk, 10000);
    }

    private void wfLE() {
        if ((Long)cv.b(this, -757337370) < (Long)cv.b(this, -119409945)) {
            cv.e(this, -119409945, (long)((Long)cv.b(this, -757337370)));
        }
        TOJM.dh((bqeB)cv.b(this, -1546521883), (Long)cv.b(this, -757337370) - (Long)cv.b(this, -119409945));
        cv.e(this, -2097745180, false);
    }

    private void yuFb() {
        if (!((Boolean)cv.b(this, -2097745180)).booleanValue()) {
            cv.e(this, -2097745180, true);
            cv.e(this, -119409945, (long)TOJM.dh());
            return;
        }
        cv.e(this, -757337370, (long)TOJM.dh());
    }

    public void TyVf(Chunk chunk) {
        if (TOJM.dh((QyFw)cv.b(this, 1597437260), chunk) == false) {
            return;
        }
        TOJM.dh((QyFw)cv.b(this, 1597437260), chunk);
        new TOJM$1(this, chunk);
    }

    public void ssNb(Chunk chunk, long l) {
        if (this.EmLA(chunk)) {
            return;
        }
        TOJM.dh((QyFw)cv.b(this, 1597437260), chunk);
        TOJM.dh((ktOu)cv.b(this, -1061882547), chunk, TOJM.dh(TOJM.dh() + l));
        new TOJM$2(this, chunk, l);
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void ssNb(ChunkUnloadEvent chunkUnloadEvent) {
        this.nJLQ((Chunk)TOJM.dh(chunkUnloadEvent));
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void ssNb(BlockPhysicsEvent blockPhysicsEvent) {
        if (TOJM.dh((QyFw)cv.b(this, 1230370127), TOJM.dh(blockPhysicsEvent)) != false) {
            this.yuFb();
            TOJM.dh((YUgh)cv.b((YoSa)cv.e(239341894), -2047282554), TOJM.dh(blockPhysicsEvent).getChunk());
            TOJM tOJM = this;
            cv.e(tOJM, -1031081224, (Integer)cv.b(tOJM, -1031081224) + 1);
            TOJM tOJM2 = this;
            cv.e(tOJM2, 1649866041, (Integer)cv.b(tOJM2, 1649866041) + 1);
            if (this.EmLA(TOJM.dh(blockPhysicsEvent).getChunk())) {
                this.IWSm((Block)TOJM.dh(blockPhysicsEvent));
                TOJM.dh(blockPhysicsEvent, true);
            }
        }
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void ssNb(BlockFromToEvent blockFromToEvent) {
        if (TOJM.dh((QyFw)cv.b(this, 1230370127), TOJM.dh(blockFromToEvent).getType()) != false) {
            this.yuFb();
            TOJM.dh((YUgh)cv.b((YoSa)cv.e(239341894), -2047282554), TOJM.dh(blockFromToEvent).getChunk());
            TOJM tOJM = this;
            cv.e(tOJM, -1031081224, (Integer)cv.b(tOJM, -1031081224) + 1);
            TOJM tOJM2 = this;
            cv.e(tOJM2, 1649866041, (Integer)cv.b(tOJM2, 1649866041) + 1);
            if (this.EmLA(TOJM.dh(blockFromToEvent).getChunk())) {
                this.IWSm((Block)TOJM.dh(blockFromToEvent));
                TOJM.dh(blockFromToEvent, true);
            }
        }
    }

    public QyFw<Material> wDLU() {
        return (QyFw)cv.b(this, 1230370127);
    }

    public QyFw<Chunk> YUgh() {
        return (QyFw)cv.b(this, 1597437260);
    }

    public ktOu<Chunk, QyFw<Block>> YDey() {
        return (ktOu)cv.b(this, 1660941634);
    }

    public ktOu<Chunk, Long> tLCm() {
        return (ktOu)cv.b(this, -1061882547);
    }

    public int KeoU() {
        return (Integer)cv.b(this, 1649866041);
    }

    public int dDce() {
        return (Integer)cv.b(this, -1031081224);
    }

    public bqeB dMUO() {
        return (bqeB)cv.b(this, 2074407675);
    }

    public bqeB SuxL() {
        return (bqeB)cv.b(this, -806620422);
    }

    public bqeB hjbe() {
        return (bqeB)cv.b(this, -1546521883);
    }

    public boolean tKcS() {
        return (Boolean)cv.b(this, -2097745180);
    }

    public long XthG() {
        return (Long)cv.b(this, -119409945);
    }

    public long GIDW() {
        return (Long)cv.b(this, -757337370);
    }

    private static Object dh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

