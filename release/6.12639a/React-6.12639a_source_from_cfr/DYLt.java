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

public class DYLt
extends bWps {
    private ItemStack uaEw;

    public DYLt(Item item) {
        super((Entity)item);
        this.uaEw = item.getItemStack();
    }

    @Override
    public void ktHX(Entity entity) {
        super.ktHX(entity);
        Item item = (Item)entity;
        item.setItemStack((ItemStack)o.a(this, 688739255));
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Object)((ItemStack)o.a(this, 688739255) == null ? 0 : (Object)DYLt.JH((ItemStack)o.a(this, 688739255)));
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
        if (DYLt.JH(this) != DYLt.JH(object)) {
            return false;
        }
        DYLt dYLt = (DYLt)object;
        if ((ItemStack)o.a(this, 688739255) == null) {
            if ((ItemStack)o.a(dYLt, 688739255) != null) {
                return false;
            }
        } else if (DYLt.JH((ItemStack)o.a(this, 688739255), (ItemStack)o.a(dYLt, 688739255)) == false) {
            return false;
        }
        return true;
    }

    private static Object JH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

