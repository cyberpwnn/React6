/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.event.world.ChunkLoadEvent
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.plugin.Plugin;

public class YLuU
extends ggmf {
    private boolean BeGP;
    private long Koam;
    private long KDnL;
    private OXoN xiqO;
    private TNku<Plugin, Integer> yudl;
    private TNku<Player, Integer> vtkx;
    private int kckb;

    @Override
    public void start() {
        YLuU.Hq(this);
        o.v(this, -1093250188, false);
        o.v(this, 1254708083, (long)YLuU.Hq());
        o.v(this, -1161473182, (long)YLuU.Hq());
        o.v(this, 43930465, new OXoN(30));
        o.v(this, 727143264, new TNku());
        o.v(this, 688542559, new TNku());
        o.v(this, 1660244830, 0);
    }

    private void FyEK() {
        if (!((Boolean)o.a(this, -1093250188)).booleanValue()) {
            YLuU.Hq((OXoN)o.a(this, 43930465), 0.0);
            return;
        }
        if ((Long)o.a(this, -1161473182) < (Long)o.a(this, 1254708083)) {
            o.v(this, 1254708083, (long)((Long)o.a(this, -1161473182)));
        }
        YLuU.Hq((OXoN)o.a(this, 43930465), (Long)o.a(this, -1161473182) - (Long)o.a(this, 1254708083));
        o.v(this, -1093250188, false);
    }

    private void TWYT() {
        if (!((Boolean)o.a(this, -1093250188)).booleanValue()) {
            o.v(this, -1093250188, true);
            o.v(this, 1254708083, (long)YLuU.Hq());
            return;
        }
        o.v(this, -1161473182, (long)YLuU.Hq());
    }

    @Override
    public void stop() {
        YLuU.Hq(this);
    }

    @uFVW
    @Override
    public void tick() {
        this.FyEK();
        if ((Long)o.k(-619556004) % 20 == 0) {
            Player player;
            Object object = YLuU.Hq(YLuU.Hq((TNku)o.a(this, 727143264)));
            while (object.hasNext()) {
                player = (Player)object.next();
                YLuU.Hq((TNku)o.a(this, 727143264), player, YLuU.Hq(YLuU.Hq((Integer)YLuU.Hq((TNku)o.a(this, 727143264), player)) / 2));
                if (YLuU.Hq((Integer)YLuU.Hq((TNku)o.a(this, 727143264), player)) >= 2) continue;
                YLuU.Hq((TNku)o.a(this, 727143264), player);
            }
            object = YLuU.Hq(YLuU.Hq((TNku)o.a(this, 688542559)));
            while (object.hasNext()) {
                player = (Plugin)object.next();
                YLuU.Hq((TNku)o.a(this, 688542559), player, YLuU.Hq(YLuU.Hq((Integer)YLuU.Hq((TNku)o.a(this, 688542559), player)) / 2));
                if (YLuU.Hq((Integer)YLuU.Hq((TNku)o.a(this, 688542559), player)) >= 2) continue;
                YLuU.Hq((TNku)o.a(this, 688542559), player);
            }
            o.v(this, 1660244830, (Integer)o.a(this, 1660244830) / 2);
            if ((Integer)o.a(this, 1660244830) < 2) {
                o.v(this, 1660244830, 2);
            }
        }
    }

    public void yJLS(PlayerQuitEvent playerQuitEvent) {
        YLuU.Hq((TNku)o.a(this, 727143264), YLuU.Hq(playerQuitEvent));
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(ChunkLoadEvent chunkLoadEvent) {
        this.TWYT();
        if (YLuU.Hq(YLuU.Hq(0.1)) != false) {
            YLuU.Hq((Bcie)o.a((TEqA)o.k(911295720), 181950477), new YLuU$1(this, chunkLoadEvent));
        }
    }

    public boolean jxxu() {
        return (Boolean)o.a(this, -1093250188);
    }

    public long YLuU() {
        return (Long)o.a(this, 1254708083);
    }

    public long WytI() {
        return (Long)o.a(this, -1161473182);
    }

    public OXoN SmjV() {
        return (OXoN)o.a(this, 43930465);
    }

    public TNku<Plugin, Integer> FMqm() {
        return (TNku)o.a(this, 688542559);
    }

    public TNku<Player, Integer> MRgD() {
        return (TNku)o.a(this, 727143264);
    }

    public int YMXs() {
        return (Integer)o.a(this, 1660244830);
    }

    static /* synthetic */ TNku yJLS(YLuU yLuU) {
        return (TNku)o.a(yLuU, 727143264);
    }

    static /* synthetic */ int UtIU(YLuU yLuU) {
        return (Integer)o.a(yLuU, 1660244830);
    }

    static /* synthetic */ void yJLS(YLuU yLuU, int n) {
        o.v(yLuU, 1660244830, n);
    }

    static /* synthetic */ TNku biLo(YLuU yLuU) {
        return (TNku)o.a(yLuU, 688542559);
    }

    private static Object Hq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

