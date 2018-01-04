/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Event
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.inventory.PlayerInventory
 *  org.bukkit.plugin.PluginManager
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;

public class MRgD
extends ggmf {
    private TNku<Player, Integer> hAPS;

    @Override
    public void start() {
        MRgD.CL(this);
        o.v(this, 2107398434, new TNku());
        Iterator iterator = MRgD.CL().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            MRgD.CL((TNku)o.a(this, 2107398434), player, MRgD.CL(player.getInventory().getHeldItemSlot()));
        }
    }

    @Override
    public void stop() {
        MRgD.CL(this);
    }

    @Override
    public void tick() {
        Object object = MRgD.CL(MRgD.CL((TNku)o.a(this, 2107398434)));
        while (object.hasNext()) {
            Player player = (Player)object.next();
            Object object2 = MRgD.CL((Integer)MRgD.CL((TNku)o.a(this, 2107398434), player));
            int n = player.getInventory().getHeldItemSlot();
            Object object3 = MRgD.CL(object2 - n);
            if (object2 == n) continue;
            YMWq yMWq = null;
            if (object2 < 3 && n > 6) {
                yMWq = (YMWq)((Object)o.k(1175935264));
                object3 = true;
            } else if (n < 3 && object2 > 6) {
                yMWq = (YMWq)((Object)o.k(-1421387489));
                object3 = true;
            } else if (object2 > n) {
                yMWq = (YMWq)((Object)o.k(1175935264));
            } else if (object2 < n) {
                yMWq = (YMWq)((Object)o.k(-1421387489));
            }
            if (yMWq == null) continue;
            wClQ wClQ2 = new wClQ(player, yMWq, (int)object3);
            MRgD.CL().getPluginManager().callEvent((Event)wClQ2);
            if (MRgD.CL(wClQ2) != false) {
                player.getInventory().setHeldItemSlot((int)object2);
            }
            MRgD.CL((TNku)o.a(this, 2107398434), player, MRgD.CL(player.getInventory().getHeldItemSlot()));
        }
    }

    @EventHandler
    public void yJLS(PlayerJoinEvent playerJoinEvent) {
        MRgD.CL((TNku)o.a(this, 2107398434), MRgD.CL(playerJoinEvent), MRgD.CL(MRgD.CL(playerJoinEvent).getInventory().getHeldItemSlot()));
    }

    @EventHandler
    public void yJLS(PlayerQuitEvent playerQuitEvent) {
        MRgD.CL((TNku)o.a(this, 2107398434), MRgD.CL(playerQuitEvent));
    }

    private static Object CL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

