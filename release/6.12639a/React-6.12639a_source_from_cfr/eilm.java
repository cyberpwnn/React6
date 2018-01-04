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
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockPhysicsEvent;

public class eilm
extends ggmf {
    private Lhwj<Material> TrLA;
    private int hssN;
    private int YghL;
    private OXoN AitQ;
    private OXoN AGqP;
    private OXoN Gbsu;
    private boolean BeGP;
    private long Koam;
    private long KDnL;
    private Lhwj<Chunk> Djlb;
    private TNku<Chunk, Lhwj<Block>> tesj;
    private TNku<Chunk, Long> EKoI;

    @Override
    public void start() {
        eilm.Ds(this);
        o.v(this, -1772988137, new TNku());
        o.v(this, 44980502, new TNku());
        o.v(this, 579557653, new Lhwj());
        o.v(this, 423123220, 0);
        o.v(this, 1794332947, 0);
        o.v(this, 1922914690, new OXoN(15));
        o.v(this, -651011711, new OXoN(3));
        o.v(this, -479307392, new OXoN(20));
        o.v(this, 900487551, false);
        o.v(this, -2133829250, (long)eilm.Ds());
        o.v(this, 563173757, (long)eilm.Ds());
        o.v(this, 2088065404, new Lhwj());
        eilm.Ds((Lhwj)o.a(this, 2088065404), (Material)o.k(-98346629));
        eilm.Ds((Lhwj)o.a(this, 2088065404), (Material)o.k(-1143252726));
        eilm.Ds((Lhwj)o.a(this, 2088065404), (Material)o.k(-1895999223));
        eilm.Ds((Lhwj)o.a(this, 2088065404), (Material)o.k(1093753096));
    }

    public void TEqA(Chunk chunk) {
        if (this.GPlk(chunk)) {
            this.HeSD(chunk);
            this.KTiK(chunk);
        }
    }

    private void YMXg() {
        Lhwj lhwj = new Lhwj();
        eilm.Ds(lhwj, eilm.Ds((TNku)o.a(this, -1772988137)));
        eilm.Ds(lhwj, (Lhwj)o.a(this, 579557653));
        Object object = eilm.Ds(lhwj);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            this.KTiK(chunk);
        }
    }

    private void KTiK(Chunk chunk) {
        if (!this.GPlk(chunk)) {
            if (eilm.Ds((TNku)o.a(this, -1772988137), chunk) != false) {
                Object object = eilm.Ds((Lhwj)eilm.Ds((TNku)o.a(this, -1772988137), chunk));
                while (object.hasNext()) {
                    Block block = (Block)object.next();
                    eilm.Ds(block);
                }
                eilm.Ds((TNku)o.a(this, -1772988137), chunk);
            }
        }
        if (this.GPlk(chunk)) {
            if (eilm.Ds() >= eilm.Ds((Long)eilm.Ds((TNku)o.a(this, 44980502), chunk))) {
                this.TEqA(chunk);
            }
        }
    }

    public void TEqA(Block block) {
        if (eilm.Ds((TNku)o.a(this, -1772988137), block.getChunk()) == false) {
            eilm.Ds((TNku)o.a(this, -1772988137), block.getChunk(), new Lhwj());
        }
        eilm.Ds((Lhwj)eilm.Ds((TNku)o.a(this, -1772988137), block.getChunk()), block);
    }

    public boolean GPlk(Chunk chunk) {
        return (boolean)eilm.Ds((Lhwj)o.a(this, 579557653), chunk);
    }

    public void ktHX(Chunk chunk) {
        this.yJLS(chunk, 10000);
    }

    public void HeSD(Chunk chunk) {
        if (eilm.Ds((Lhwj)o.a(this, 579557653), chunk) == false) {
            return;
        }
        eilm.Ds((Lhwj)o.a(this, 579557653), chunk);
    }

    public void yJLS(Chunk chunk, long l) {
        if (this.GPlk(chunk)) {
            return;
        }
        eilm.Ds((Lhwj)o.a(this, 579557653), chunk);
        eilm.Ds((TNku)o.a(this, 44980502), chunk, eilm.Ds(eilm.Ds() + l));
    }

    @Override
    public void stop() {
        eilm.Ds(this);
    }

    @Override
    public void tick() {
        this.YMXg();
        eilm.Ds((OXoN)o.a(this, 1922914690), (Integer)o.a(this, 423123220));
        eilm.Ds((OXoN)o.a(this, -651011711), (Integer)o.a(this, 1794332947));
        o.v(this, 423123220, 0);
        o.v(this, 1794332947, 0);
        this.FyEK();
    }

    private void FyEK() {
        if ((Long)o.a(this, 563173757) < (Long)o.a(this, -2133829250)) {
            o.v(this, -2133829250, (long)((Long)o.a(this, 563173757)));
        }
        eilm.Ds((OXoN)o.a(this, -479307392), (Long)o.a(this, 563173757) - (Long)o.a(this, -2133829250));
        o.v(this, 563173757, (long)eilm.Ds());
        o.v(this, -2133829250, (long)((Long)o.a(this, 563173757)));
        o.v(this, 900487551, false);
    }

    private void TWYT() {
        if (!((Boolean)o.a(this, 900487551)).booleanValue()) {
            o.v(this, 900487551, true);
            o.v(this, -2133829250, (long)eilm.Ds());
            return;
        }
        o.v(this, 563173757, (long)eilm.Ds());
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(BlockPhysicsEvent blockPhysicsEvent) {
        if (eilm.Ds((Lhwj)o.a(this, 2088065404), eilm.Ds(blockPhysicsEvent).getType()) != false) {
            if (this.GPlk(eilm.Ds(blockPhysicsEvent).getChunk())) {
                eilm.Ds(blockPhysicsEvent, true);
                this.TEqA((Block)eilm.Ds(blockPhysicsEvent));
                return;
            }
            this.TWYT();
            eilm eilm2 = this;
            o.v(eilm2, 1794332947, (Integer)o.a(eilm2, 1794332947) + 1);
            eilm eilm3 = this;
            o.v(eilm3, 423123220, (Integer)o.a(eilm3, 423123220) + 1);
            eilm.Ds((bXTW)o.a((TEqA)o.k(911295720), -550610684), eilm.Ds(blockPhysicsEvent).getChunk());
        }
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(BlockFromToEvent blockFromToEvent) {
        if (eilm.Ds((Lhwj)o.a(this, 2088065404), eilm.Ds(blockFromToEvent).getType()) != false) {
            if (this.GPlk(eilm.Ds(blockFromToEvent).getChunk())) {
                eilm.Ds(blockFromToEvent, true);
                this.TEqA((Block)eilm.Ds(blockFromToEvent));
            } else {
                this.TWYT();
                eilm eilm2 = this;
                o.v(eilm2, 1794332947, (Integer)o.a(eilm2, 1794332947) + 1);
                eilm eilm3 = this;
                o.v(eilm3, 423123220, (Integer)o.a(eilm3, 423123220) + 1);
                eilm.Ds((bXTW)o.a((TEqA)o.k(911295720), -550610684), eilm.Ds(blockFromToEvent).getChunk());
            }
        }
        if (eilm.Ds((Lhwj)o.a(this, 2088065404), eilm.Ds(blockFromToEvent).getType()) != false) {
            if (this.GPlk(eilm.Ds(blockFromToEvent).getChunk())) {
                eilm.Ds(blockFromToEvent, true);
                this.TEqA((Block)eilm.Ds(blockFromToEvent));
                return;
            }
            this.TWYT();
            eilm eilm4 = this;
            o.v(eilm4, 1794332947, (Integer)o.a(eilm4, 1794332947) + 1);
            eilm eilm5 = this;
            o.v(eilm5, 423123220, (Integer)o.a(eilm5, 423123220) + 1);
            eilm.Ds((bXTW)o.a((TEqA)o.k(911295720), -550610684), eilm.Ds(blockFromToEvent).getChunk());
        }
    }

    public Lhwj<Material> cJUN() {
        return (Lhwj)o.a(this, 2088065404);
    }

    public int mXRj() {
        return (Integer)o.a(this, 423123220);
    }

    public int tKeR() {
        return (Integer)o.a(this, 1794332947);
    }

    public OXoN MSHX() {
        return (OXoN)o.a(this, 1922914690);
    }

    public OXoN WWtP() {
        return (OXoN)o.a(this, -651011711);
    }

    public OXoN bXTW() {
        return (OXoN)o.a(this, -479307392);
    }

    public boolean jxxu() {
        return (Boolean)o.a(this, 900487551);
    }

    public long YLuU() {
        return (Long)o.a(this, -2133829250);
    }

    public long WytI() {
        return (Long)o.a(this, 563173757);
    }

    public Lhwj<Chunk> JkaV() {
        return (Lhwj)o.a(this, 579557653);
    }

    public TNku<Chunk, Lhwj<Block>> HLIY() {
        return (TNku)o.a(this, -1772988137);
    }

    public TNku<Chunk, Long> KwVE() {
        return (TNku)o.a(this, 44980502);
    }

    private static Object Ds(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

