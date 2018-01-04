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

public class WiUt
extends ggmf {
    private Lhwj<Material> TrLA;
    private Lhwj<Chunk> Djlb;
    private TNku<Chunk, Lhwj<Block>> tesj;
    private TNku<Chunk, Long> EKoI;
    private int lVNi;
    private int AafH;
    private OXoN xrbm;
    private OXoN qead;
    private OXoN IrQI;
    private boolean BeGP;
    private long Koam;
    private long KDnL;

    @Override
    public void start() {
        WiUt.ED(this);
        o.v(this, 1519277597, new TNku());
        o.v(this, -79604196, new TNku());
        o.v(this, 235755035, new Lhwj());
        o.v(this, 1969378858, new Lhwj());
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(-636594647));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(1056003624));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(-427272665));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(2065126950));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(-1001040347));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(-1260890588));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(-2043390429));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(1100961298));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(2046907921));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(225138192));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(256529935));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(582702606));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(-1734846963));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(1538872844));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(-450013685));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(430593562));
        WiUt.ED((Lhwj)o.a(this, 1969378858), (Material)o.k(-1861331431));
        o.v(this, -1118939624, 0);
        o.v(this, 1045845527, 0);
        o.v(this, -1033939434, new OXoN(15));
        o.v(this, -231516651, new OXoN(3));
        o.v(this, -1260562924, new OXoN(20));
        o.v(this, -1688447469, false);
        o.v(this, 89806466, (long)WiUt.ED());
        o.v(this, -886745471, (long)WiUt.ED());
    }

    @Override
    public void stop() {
        WiUt.ED(this);
        Object object = WiUt.ED(new feCR((Lhwj)o.a(this, 235755035)));
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            this.TEqA(chunk);
        }
    }

    public void TEqA(Chunk chunk) {
        if (this.GPlk(chunk)) {
            this.HeSD(chunk);
            this.KTiK(chunk);
        }
    }

    @Override
    public void tick() {
        this.YMXg();
        WiUt.ED((OXoN)o.a(this, -1033939434), (Integer)o.a(this, -1118939624));
        WiUt.ED((OXoN)o.a(this, -231516651), (Integer)o.a(this, 1045845527));
        o.v(this, -1118939624, 0);
        o.v(this, 1045845527, 0);
        this.FyEK();
    }

    private void YMXg() {
        Lhwj lhwj = new Lhwj();
        WiUt.ED(lhwj, WiUt.ED((TNku)o.a(this, 1519277597)));
        WiUt.ED(lhwj, (Lhwj)o.a(this, 235755035));
        Object object = WiUt.ED(lhwj);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            this.KTiK(chunk);
        }
    }

    private void KTiK(Chunk chunk) {
        if (!this.GPlk(chunk)) {
            if (WiUt.ED((TNku)o.a(this, 1519277597), chunk) != false) {
                Object object = WiUt.ED((Lhwj)WiUt.ED((TNku)o.a(this, 1519277597), chunk));
                while (object.hasNext()) {
                    Block block = (Block)object.next();
                    WiUt.ED(block);
                }
                WiUt.ED((TNku)o.a(this, 1519277597), chunk);
            }
        }
        if (this.GPlk(chunk)) {
            if (WiUt.ED() >= WiUt.ED((Long)WiUt.ED((TNku)o.a(this, -79604196), chunk))) {
                this.TEqA(chunk);
            }
        }
    }

    public void TEqA(Block block) {
        if (WiUt.ED((TNku)o.a(this, 1519277597), block.getChunk()) == false) {
            WiUt.ED((TNku)o.a(this, 1519277597), block.getChunk(), new Lhwj());
        }
        WiUt.ED((Lhwj)WiUt.ED((TNku)o.a(this, 1519277597), block.getChunk()), block);
    }

    public boolean GPlk(Chunk chunk) {
        return (boolean)WiUt.ED((Lhwj)o.a(this, 235755035), chunk);
    }

    public void ktHX(Chunk chunk) {
        this.yJLS(chunk, 10000);
    }

    private void FyEK() {
        if ((Long)o.a(this, -886745471) < (Long)o.a(this, 89806466)) {
            o.v(this, 89806466, (long)((Long)o.a(this, -886745471)));
        }
        WiUt.ED((OXoN)o.a(this, -1260562924), (Long)o.a(this, -886745471) - (Long)o.a(this, 89806466));
        o.v(this, -1688447469, false);
    }

    private void TWYT() {
        if (!((Boolean)o.a(this, -1688447469)).booleanValue()) {
            o.v(this, -1688447469, true);
            o.v(this, 89806466, (long)WiUt.ED());
            return;
        }
        o.v(this, -886745471, (long)WiUt.ED());
    }

    public void HeSD(Chunk chunk) {
        if (WiUt.ED((Lhwj)o.a(this, 235755035), chunk) == false) {
            return;
        }
        WiUt.ED((Lhwj)o.a(this, 235755035), chunk);
    }

    public void yJLS(Chunk chunk, long l) {
        if (this.GPlk(chunk)) {
            return;
        }
        WiUt.ED((Lhwj)o.a(this, 235755035), chunk);
        WiUt.ED((TNku)o.a(this, -79604196), chunk, WiUt.ED(WiUt.ED() + l));
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(ChunkUnloadEvent chunkUnloadEvent) {
        this.TEqA((Chunk)WiUt.ED(chunkUnloadEvent));
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(BlockPhysicsEvent blockPhysicsEvent) {
        if (WiUt.ED((Lhwj)o.a(this, 1969378858), WiUt.ED(blockPhysicsEvent)) != false) {
            this.TWYT();
            WiUt.ED((bXTW)o.a((TEqA)o.k(911295720), -550610684), WiUt.ED(blockPhysicsEvent).getChunk());
            WiUt wiUt = this;
            o.v(wiUt, 1045845527, (Integer)o.a(wiUt, 1045845527) + 1);
            WiUt wiUt2 = this;
            o.v(wiUt2, -1118939624, (Integer)o.a(wiUt2, -1118939624) + 1);
            if (this.GPlk(WiUt.ED(blockPhysicsEvent).getChunk())) {
                this.TEqA((Block)WiUt.ED(blockPhysicsEvent));
                WiUt.ED(blockPhysicsEvent, true);
            }
        }
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(BlockFromToEvent blockFromToEvent) {
        if (WiUt.ED((Lhwj)o.a(this, 1969378858), WiUt.ED(blockFromToEvent).getType()) != false) {
            this.TWYT();
            WiUt.ED((bXTW)o.a((TEqA)o.k(911295720), -550610684), WiUt.ED(blockFromToEvent).getChunk());
            WiUt wiUt = this;
            o.v(wiUt, 1045845527, (Integer)o.a(wiUt, 1045845527) + 1);
            WiUt wiUt2 = this;
            o.v(wiUt2, -1118939624, (Integer)o.a(wiUt2, -1118939624) + 1);
            if (this.GPlk(WiUt.ED(blockFromToEvent).getChunk())) {
                this.TEqA((Block)WiUt.ED(blockFromToEvent));
                WiUt.ED(blockFromToEvent, true);
            }
        }
    }

    public Lhwj<Material> cJUN() {
        return (Lhwj)o.a(this, 1969378858);
    }

    public Lhwj<Chunk> JkaV() {
        return (Lhwj)o.a(this, 235755035);
    }

    public TNku<Chunk, Lhwj<Block>> HLIY() {
        return (TNku)o.a(this, 1519277597);
    }

    public TNku<Chunk, Long> KwVE() {
        return (TNku)o.a(this, -79604196);
    }

    public int yJSB() {
        return (Integer)o.a(this, -1118939624);
    }

    public int OYNC() {
        return (Integer)o.a(this, 1045845527);
    }

    public OXoN GbVu() {
        return (OXoN)o.a(this, -1033939434);
    }

    public OXoN EKRM() {
        return (OXoN)o.a(this, -231516651);
    }

    public OXoN MtlJ() {
        return (OXoN)o.a(this, -1260562924);
    }

    public boolean jxxu() {
        return (Boolean)o.a(this, -1688447469);
    }

    public long YLuU() {
        return (Long)o.a(this, 89806466);
    }

    public long WytI() {
        return (Long)o.a(this, -886745471);
    }

    private static Object ED(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

