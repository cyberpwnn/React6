/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Color
 *  org.bukkit.Location
 *  org.bukkit.block.Block
 *  org.bukkit.block.Hopper
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.block.BlockBurnEvent
 *  org.bukkit.event.block.BlockFadeEvent
 *  org.bukkit.event.block.BlockFormEvent
 *  org.bukkit.event.block.BlockFromToEvent
 *  org.bukkit.event.block.BlockPhysicsEvent
 *  org.bukkit.event.inventory.InventoryMoveItemEvent
 *  org.bukkit.inventory.InventoryHolder
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.Hopper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.InventoryHolder;

public class YMXg
extends ggmf {
    private TNku<Location, Color> bbDs;
    private feCR<Player> cvIc;

    @Override
    public void start() {
        YMXg.NI(this);
        o.v(this, 1464801, new feCR());
        o.v(this, -1710597664, new TNku());
    }

    @Override
    public void stop() {
        YMXg.NI(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void tick() {
        Object object;
        feCR feCR2 = new feCR();
        Object object2 = YMXg.NI(YMXg.NI((JkaV)o.a((TEqA)o.k(911295720), 1104499257)));
        while (object2.hasNext()) {
            object = (Jbjx)object2.next();
            if (YMXg.NI(object) == false) continue;
            YMXg.NI(feCR2, YMXg.NI(object));
        }
        o.v(this, 1464801, feCR2);
        if (YMXg.NI((feCR)o.a(this, 1464801)) != false) {
            return;
        }
        object = YMXg.NI((TNku)o.a(this, -1710597664));
        while (YMXg.NI(object) > 200) {
            object2 = (Location)YMXg.NI(YMXg.NI(object));
            YMXg.NI((TNku)o.a(this, -1710597664), object2, (Color)YMXg.NI(object, object2));
            YMXg.NI(object, object2);
        }
        YMXg.NI((TNku)o.a(this, -1710597664));
        new YMXg$1(this, (TNku)object);
    }

    public boolean VwLY(Player player) {
        if (this.TEqA(player)) {
            if (((Boolean)o.a(YMXg.NI((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), -39497187)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean TEqA(Player player) {
        return (boolean)YMXg.NI((aeiw)((Object)o.k(-1427291024)), player);
    }

    public void KTiK(Player player) {
        if (this.TEqA(player)) {
            o.v(YMXg.NI((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), -39497187, (Boolean)o.a(YMXg.NI((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), -39497187) == false);
            YMXg.NI(player, (Boolean)o.a(YMXg.NI((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), -39497187) != false ? (String)o.k(-1287169558) : (String)o.k(1416911337));
            return;
        }
        if (this.VwLY(player)) {
            o.v(YMXg.NI((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), -39497187, false);
            YMXg.NI(player, (Boolean)o.a(YMXg.NI((JkaV)o.a((TEqA)o.k(911295720), 1104499257), player), -39497187) != false ? (String)o.k(-1287169558) : (String)o.k(1416911337));
            return;
        }
        YMXg.NI(player, (String)o.k(-1332653231));
    }

    @EventHandler
    public void yJLS(BlockPhysicsEvent blockPhysicsEvent) {
        if (YMXg.NI((feCR)o.a(this, 1464801)) > 0) {
            Object object = YMXg.NI(YMXg.NI(YMXg.NI(blockPhysicsEvent).getLocation()), 0.5, 0.5, 0.5);
            YMXg.NI((TNku)o.a(this, -1710597664), object, (Color)o.k(-970106392));
        }
    }

    @EventHandler
    public void yJLS(BlockFromToEvent blockFromToEvent) {
        if (YMXg.NI((feCR)o.a(this, 1464801)) > 0) {
            Object object = YMXg.NI(YMXg.NI(YMXg.NI(blockFromToEvent).getLocation()), 0.5, 0.5, 0.5);
            YMXg.NI((TNku)o.a(this, -1710597664), object, (Color)o.k(-303736345));
        }
    }

    @EventHandler
    public void yJLS(BlockBurnEvent blockBurnEvent) {
        if (YMXg.NI((feCR)o.a(this, 1464801)) > 0) {
            Object object = YMXg.NI(YMXg.NI(YMXg.NI(blockBurnEvent).getLocation()), 0.5, 0.5, 0.5);
            YMXg.NI((TNku)o.a(this, -1710597664), object, (Color)o.k(-151889435));
        }
    }

    @EventHandler
    public void yJLS(BlockFormEvent blockFormEvent) {
        if (YMXg.NI((feCR)o.a(this, 1464801)) > 0) {
            Object object = YMXg.NI(YMXg.NI(YMXg.NI(blockFormEvent).getLocation()), 0.5, 0.5, 0.5);
            YMXg.NI((TNku)o.a(this, -1710597664), object, (Color)o.k(569596387));
        }
    }

    @EventHandler
    public void yJLS(BlockFadeEvent blockFadeEvent) {
        if (YMXg.NI((feCR)o.a(this, 1464801)) > 0) {
            Object object = YMXg.NI(YMXg.NI(YMXg.NI(blockFadeEvent).getLocation()), 0.5, 0.5, 0.5);
            YMXg.NI((TNku)o.a(this, -1710597664), object, (Color)o.k(710564305));
        }
    }

    @EventHandler
    public void yJLS(InventoryMoveItemEvent inventoryMoveItemEvent) {
        if (YMXg.NI((feCR)o.a(this, 1464801)) > 0) {
            Object object = YMXg.NI(inventoryMoveItemEvent);
            Object object2 = YMXg.NI(inventoryMoveItemEvent);
            if (object.getHolder() instanceof Hopper && object2.getHolder() instanceof Hopper) {
                Hopper hopper = (Hopper)object2.getHolder();
                Object object3 = YMXg.NI(YMXg.NI(hopper.getBlock().getLocation()), 0.5, 0.5, 0.5);
                YMXg.NI((TNku)o.a(this, -1710597664), object3, (Color)o.k(1777818062));
            }
        }
    }

    static /* synthetic */ feCR yJLS(YMXg yMXg) {
        return (feCR)o.a(yMXg, 1464801);
    }

    private static Object NI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

