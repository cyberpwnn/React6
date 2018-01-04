/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.block.Hopper
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.inventory.InventoryMoveItemEvent
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryHolder
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.block.Hopper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class tKeR
extends ggmf {
    private feCR<Location> PvcR;

    @Override
    public void start() {
        tKeR.CT(this);
        o.v(this, -1728751179, new feCR());
    }

    @Override
    public void stop() {
        tKeR.CT(this);
    }

    @Override
    public void tick() {
        tKeR.CT((feCR)o.a(this, -1728751179));
    }

    public boolean biLo(Hopper hopper) {
        if (!((Boolean)o.k(302864447)).booleanValue()) {
            return false;
        }
        if (hopper.getInventory().firstEmpty() == -1) {
            if (tKeR.CT((feCR)o.a(this, -1728751179), hopper.getLocation()) != false) {
                return true;
            }
            tKeR.CT((feCR)o.a(this, -1728751179), hopper.getLocation());
        } else {
            tKeR.CT((feCR)o.a(this, -1728751179), hopper.getLocation());
        }
        return false;
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(InventoryMoveItemEvent inventoryMoveItemEvent) {
        if (!((Boolean)o.k(302864447)).booleanValue()) {
            return;
        }
        boolean bl = false;
        boolean bl2 = false;
        if (tKeR.CT(inventoryMoveItemEvent).getHolder() instanceof Hopper) {
            bl = this.biLo((Hopper)tKeR.CT(inventoryMoveItemEvent).getHolder());
        }
        if (tKeR.CT(inventoryMoveItemEvent).getHolder() instanceof Hopper) {
            bl2 = this.biLo((Hopper)tKeR.CT(inventoryMoveItemEvent).getHolder());
        }
        tKeR.CT(inventoryMoveItemEvent, bl || bl2);
    }

    private static Object CT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

