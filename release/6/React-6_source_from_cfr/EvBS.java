/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.entity.Item
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.entity.ItemMergeEvent
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class EvBS
extends jqQR {
    @Override
    public void start() {
        EvBS.Nv(this);
    }

    @Override
    public void stop() {
        EvBS.Nv(this);
    }

    @EventHandler
    public void ssNb(ItemMergeEvent itemMergeEvent) {
        if (!((Boolean)cv.e(845287781)).booleanValue()) {
            EvBS.Nv(itemMergeEvent, true);
        }
        if (!((Boolean)cv.e(1163268474)).booleanValue()) {
            EvBS.Nv(itemMergeEvent, true);
        }
    }

    @Override
    public void tick() {
        if (((Boolean)cv.e(845287781)).booleanValue()) {
            return;
        }
        if (!((Boolean)cv.e(1163268474)).booleanValue()) {
            return;
        }
        Iterator iterator = EvBS.Nv().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            try {
                new EvBS$1(this, world);
            }
            catch (Exception exception) {}
        }
    }

    public void ssNb(Item item, Item item2) {
        if (EvBS.Nv(item2.getUniqueId(), item.getUniqueId()) != false) {
            return;
        }
        if (EvBS.Nv(item2.getLocation(), item.getLocation()) <= (Double)cv.e(-2136927877) * (Double)cv.e(-2136927877)) {
            Object object = EvBS.Nv(item2.getLocation(), item.getLocation());
            Object object2 = EvBS.Nv(item2.getItemStack());
            Object object3 = EvBS.Nv(item.getItemStack());
            Object object4 = EvBS.Nv(object2);
            Object object5 = EvBS.Nv(object3);
            EvBS.Nv(object2, true);
            EvBS.Nv(object3, true);
            if (EvBS.Nv(object2, object3) == false) {
                return;
            }
            if (EvBS.Nv(object2) < object4 + object5) {
                return;
            }
            if (item2.getTicksLived() == item.getTicksLived()) {
                item2.setTicksLived(item2.getTicksLived() + 2);
            }
            if (item2.getTicksLived() <= item.getTicksLived()) {
                return;
            }
            Item item3 = item2;
            Item item4 = item;
            Vector vector = item4.getVelocity();
            Object object6 = EvBS.Nv(EvBS.Nv(item4.getLocation(), EvBS.Nv(item3.getLocation())), 1.0 - object / (Double)cv.e(-2136927877));
            Object object7 = EvBS.Nv(vector, EvBS.Nv(object6, 0.19));
            if (!((Boolean)cv.e(-2114907804)).booleanValue()) {
                Object object8 = EvBS.Nv(item3.getItemStack());
                EvBS.Nv(object8, object4 + object5);
                item3.setItemStack((ItemStack)object8);
                item4.remove();
                return;
            }
            try {
                item4.setVelocity((Vector)object7);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (object < 0.6325) {
                Object object9 = EvBS.Nv(item3.getItemStack());
                EvBS.Nv(object9, object4 + object5);
                item3.setItemStack((ItemStack)object9);
                item4.remove();
            }
        }
    }

    public void DYFV(Item item, Item item2) {
        if (EvBS.Nv(item2.getUniqueId(), item.getUniqueId()) != false) {
            return;
        }
        if (EvBS.Nv(item2.getLocation(), item.getLocation()) <= (Double)cv.e(-2136927877) * (Double)cv.e(-2136927877)) {
            Object object = EvBS.Nv(item2.getLocation(), item.getLocation());
            Object object2 = EvBS.Nv(item2.getItemStack());
            Object object3 = EvBS.Nv(item.getItemStack());
            Object object4 = EvBS.Nv(object2);
            Object object5 = EvBS.Nv(object3);
            EvBS.Nv(object2, true);
            EvBS.Nv(object3, true);
            if (EvBS.Nv(object2, object3) == false) {
                return;
            }
            if (EvBS.Nv(object2) < object4 + object5) {
                return;
            }
            if (item2.getTicksLived() == item.getTicksLived()) {
                item2.setTicksLived(item2.getTicksLived() + 2);
            }
            if (item2.getTicksLived() <= item.getTicksLived()) {
                return;
            }
            Item item3 = item2;
            Item item4 = item;
            Vector vector = item4.getVelocity();
            Object object6 = EvBS.Nv(EvBS.Nv(item4.getLocation(), EvBS.Nv(item3.getLocation())), 1.0 - object / (Double)cv.e(-2136927877));
            Object object7 = EvBS.Nv(vector, EvBS.Nv(object6, 0.19));
            if (!((Boolean)cv.e(-2114907804)).booleanValue()) {
                Object object8 = EvBS.Nv(item3.getItemStack());
                EvBS.Nv(object8, object4 + object5);
                item3.setItemStack((ItemStack)object8);
                item4.remove();
                return;
            }
            try {
                item4.setVelocity((Vector)object7);
                item3.setVelocity((Vector)EvBS.Nv(object7));
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (object < 0.6325) {
                Object object9 = EvBS.Nv(item3.getItemStack());
                EvBS.Nv(object9, object4 + object5);
                item3.setItemStack((ItemStack)object9);
                item4.remove();
            }
        }
    }

    private static Object Nv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

