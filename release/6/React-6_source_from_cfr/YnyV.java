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

public class YnyV
extends qloI {
    @Override
    public void start() {
        YnyV.Fg(this);
    }

    @Override
    public void stop() {
        YnyV.Fg(this);
    }

    @EventHandler
    public void mXJp(ItemMergeEvent itemMergeEvent) {
        if (!((Boolean)yy.p(-923603850)).booleanValue()) {
            YnyV.Fg(itemMergeEvent, true);
        }
        if (!((Boolean)yy.p(-1211896707)).booleanValue()) {
            YnyV.Fg(itemMergeEvent, true);
        }
    }

    @Override
    public void tick() {
        if (((Boolean)yy.p(-923603850)).booleanValue()) {
            return;
        }
        if (!((Boolean)yy.p(-1211896707)).booleanValue()) {
            return;
        }
        Iterator iterator = YnyV.Fg().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            new YnyV$1(this, world);
        }
    }

    public void mXJp(Item item, Item item2) {
        if (YnyV.Fg(item2.getUniqueId(), item.getUniqueId()) != false) {
            return;
        }
        if (YnyV.Fg(item2.getLocation(), item.getLocation()) <= (Double)yy.p(867036264) * (Double)yy.p(867036264)) {
            Object object = YnyV.Fg(item2.getLocation(), item.getLocation());
            Object object2 = YnyV.Fg(item2.getItemStack());
            Object object3 = YnyV.Fg(item.getItemStack());
            Object object4 = YnyV.Fg(object2);
            Object object5 = YnyV.Fg(object3);
            YnyV.Fg(object2, true);
            YnyV.Fg(object3, true);
            if (YnyV.Fg(object2, object3) == false) {
                return;
            }
            if (YnyV.Fg(object2) < object4 + object5) {
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
            Object object6 = YnyV.Fg(YnyV.Fg(item4.getLocation(), YnyV.Fg(item3.getLocation())), 1.0 - object / (Double)yy.p(867036264));
            Object object7 = YnyV.Fg(vector, YnyV.Fg(object6, 0.19));
            if (!((Boolean)yy.p(40103035)).booleanValue()) {
                Object object8 = YnyV.Fg(item3.getItemStack());
                YnyV.Fg(object8, object4 + object5);
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
                Object object9 = YnyV.Fg(item3.getItemStack());
                YnyV.Fg(object9, object4 + object5);
                item3.setItemStack((ItemStack)object9);
                item4.remove();
            }
        }
    }

    public void ksfs(Item item, Item item2) {
        if (YnyV.Fg(item2.getUniqueId(), item.getUniqueId()) != false) {
            return;
        }
        if (YnyV.Fg(item2.getLocation(), item.getLocation()) <= (Double)yy.p(867036264) * (Double)yy.p(867036264)) {
            Object object = YnyV.Fg(item2.getLocation(), item.getLocation());
            Object object2 = YnyV.Fg(item2.getItemStack());
            Object object3 = YnyV.Fg(item.getItemStack());
            Object object4 = YnyV.Fg(object2);
            Object object5 = YnyV.Fg(object3);
            YnyV.Fg(object2, true);
            YnyV.Fg(object3, true);
            if (YnyV.Fg(object2, object3) == false) {
                return;
            }
            if (YnyV.Fg(object2) < object4 + object5) {
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
            Object object6 = YnyV.Fg(YnyV.Fg(item4.getLocation(), YnyV.Fg(item3.getLocation())), 1.0 - object / (Double)yy.p(867036264));
            Object object7 = YnyV.Fg(vector, YnyV.Fg(object6, 0.19));
            if (!((Boolean)yy.p(40103035)).booleanValue()) {
                Object object8 = YnyV.Fg(item3.getItemStack());
                YnyV.Fg(object8, object4 + object5);
                item3.setItemStack((ItemStack)object8);
                item4.remove();
                return;
            }
            try {
                item4.setVelocity((Vector)object7);
                item3.setVelocity((Vector)YnyV.Fg(object7));
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (object < 0.6325) {
                Object object9 = YnyV.Fg(item3.getItemStack());
                YnyV.Fg(object9, object4 + object5);
                item3.setItemStack((ItemStack)object9);
                item4.remove();
            }
        }
    }

    private static Object Fg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

