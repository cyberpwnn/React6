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

public class tKcS
extends jqQR {
    private ktOu<Location, Color> tnWQ;
    private wfPa<Player> Oajx;

    @Override
    public void start() {
        tKcS.wY(this);
        cv.e(this, -1567624515, new wfPa());
        cv.e(this, -13307204, new ktOu());
    }

    @Override
    public void stop() {
        tKcS.wY(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void tick() {
        Object object;
        wfPa wfPa2 = new wfPa();
        Object object2 = tKcS.wY(tKcS.wY((YDey)cv.b((YoSa)cv.e(239341894), 240906943)));
        while (object2.hasNext()) {
            object = (bXOh)object2.next();
            if (tKcS.wY(object) == false) continue;
            tKcS.wY(wfPa2, tKcS.wY(object));
        }
        cv.e(this, -1567624515, wfPa2);
        object = tKcS.wY((ktOu)cv.b(this, -13307204));
        while (tKcS.wY(object) > 200) {
            object2 = (Location)tKcS.wY(tKcS.wY(object));
            tKcS.wY((ktOu)cv.b(this, -13307204), object2, (Color)tKcS.wY(object, object2));
            tKcS.wY(object, object2);
        }
        tKcS.wY((ktOu)cv.b(this, -13307204));
        new tKcS$1(this, (ktOu)object);
    }

    public boolean IWSm(Player player) {
        if (this.OXeK(player)) {
            if (((Boolean)cv.b(tKcS.wY((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player), 761401303)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean OXeK(Player player) {
        return (boolean)tKcS.wY((tdpC)((Object)cv.e(571280913)), player);
    }

    public void YoSa(Player player) {
        if (this.OXeK(player)) {
            cv.e(tKcS.wY((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player), 761401303, (Boolean)cv.b(tKcS.wY((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player), 761401303) == false);
            tKcS.wY(player, (Boolean)cv.b(tKcS.wY((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player), 761401303) != false ? (String)cv.e(1829499493) : (String)cv.e(1784083044));
            return;
        }
        if (this.IWSm(player)) {
            cv.e(tKcS.wY((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player), 761401303, false);
            tKcS.wY(player, (Boolean)cv.b(tKcS.wY((YDey)cv.b((YoSa)cv.e(239341894), 240906943), player), 761401303) != false ? (String)cv.e(1829499493) : (String)cv.e(1784083044));
            return;
        }
        tKcS.wY(player, (String)cv.e(733352431));
    }

    @EventHandler
    public void ssNb(BlockPhysicsEvent blockPhysicsEvent) {
        if (tKcS.wY((wfPa)cv.b(this, -1567624515)) > 0) {
            Object object = tKcS.wY(tKcS.wY(tKcS.wY(blockPhysicsEvent).getLocation()), 0.5, 0.5, 0.5);
            tKcS.wY((ktOu)cv.b(this, -13307204), object, (Color)cv.e(914813542));
        }
    }

    @EventHandler
    public void ssNb(BlockFromToEvent blockFromToEvent) {
        if (tKcS.wY((wfPa)cv.b(this, -1567624515)) > 0) {
            Object object = tKcS.wY(tKcS.wY(tKcS.wY(blockFromToEvent).getLocation()), 0.5, 0.5, 0.5);
            tKcS.wY((ktOu)cv.b(this, -13307204), object, (Color)cv.e(1314583136));
        }
    }

    @EventHandler
    public void ssNb(BlockBurnEvent blockBurnEvent) {
        if (tKcS.wY((wfPa)cv.b(this, -1567624515)) > 0) {
            Object object = tKcS.wY(tKcS.wY(tKcS.wY(blockBurnEvent).getLocation()), 0.5, 0.5, 0.5);
            tKcS.wY((ktOu)cv.b(this, -13307204), object, (Color)cv.e(-459279774));
        }
    }

    @EventHandler
    public void ssNb(BlockFormEvent blockFormEvent) {
        if (tKcS.wY((wfPa)cv.b(this, -1567624515)) > 0) {
            Object object = tKcS.wY(tKcS.wY(tKcS.wY(blockFormEvent).getLocation()), 0.5, 0.5, 0.5);
            tKcS.wY((ktOu)cv.b(this, -13307204), object, (Color)cv.e(-373558676));
        }
    }

    @EventHandler
    public void ssNb(BlockFadeEvent blockFadeEvent) {
        if (tKcS.wY((wfPa)cv.b(this, -1567624515)) > 0) {
            Object object = tKcS.wY(tKcS.wY(tKcS.wY(blockFadeEvent).getLocation()), 0.5, 0.5, 0.5);
            tKcS.wY((ktOu)cv.b(this, -13307204), object, (Color)cv.e(1655173742));
        }
    }

    @EventHandler
    public void ssNb(InventoryMoveItemEvent inventoryMoveItemEvent) {
        if (tKcS.wY((wfPa)cv.b(this, -1567624515)) > 0) {
            Object object = tKcS.wY(inventoryMoveItemEvent);
            Object object2 = tKcS.wY(inventoryMoveItemEvent);
            if (object.getHolder() instanceof Hopper && object2.getHolder() instanceof Hopper) {
                Hopper hopper = (Hopper)object2.getHolder();
                Object object3 = tKcS.wY(tKcS.wY(hopper.getBlock().getLocation()), 0.5, 0.5, 0.5);
                tKcS.wY((ktOu)cv.b(this, -13307204), object3, (Color)cv.e(127201899));
            }
        }
    }

    static /* synthetic */ wfPa ssNb(tKcS tKcS2) {
        return (wfPa)cv.b(tKcS2, -1567624515);
    }

    private static Object wY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

