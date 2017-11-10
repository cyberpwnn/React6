/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Item
 *  org.bukkit.inventory.ItemStack
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

public class bWml
extends lekR {
    private ItemStack uXDE;

    public bWml(Item item) {
        super((Entity)item);
        this.uXDE = item.getItemStack();
    }

    @Override
    public void yIkI(Entity entity) {
        super.yIkI(entity);
        Item item = (Item)entity;
        item.setItemStack((ItemStack)yy.h(this, -1481308428));
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Object)((ItemStack)yy.h(this, -1481308428) == null ? 0 : (Object)bWml.dZ((ItemStack)yy.h(this, -1481308428)));
        return n2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (bWml.dZ(this) != bWml.dZ(object)) {
            return false;
        }
        bWml bWml2 = (bWml)object;
        if ((ItemStack)yy.h(this, -1481308428) == null) {
            if ((ItemStack)yy.h(bWml2, -1481308428) != null) {
                return false;
            }
        } else if (bWml.dZ((ItemStack)yy.h(this, -1481308428), (ItemStack)yy.h(bWml2, -1481308428)) == false) {
            return false;
        }
        return true;
    }

    private static Object dZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

