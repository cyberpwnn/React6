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

public class aCiR
extends HuvK {
    private ItemStack gEkj;

    public aCiR(Item item) {
        super((Entity)item);
        this.gEkj = item.getItemStack();
    }

    @Override
    public void nJLQ(Entity entity) {
        super.nJLQ(entity);
        Item item = (Item)entity;
        item.setItemStack((ItemStack)cv.b(this, -1201729305));
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Object)((ItemStack)cv.b(this, -1201729305) == null ? 0 : (Object)aCiR.qp((ItemStack)cv.b(this, -1201729305)));
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
        if (aCiR.qp(this) != aCiR.qp(object)) {
            return false;
        }
        aCiR aCiR2 = (aCiR)object;
        if ((ItemStack)cv.b(this, -1201729305) == null) {
            if ((ItemStack)cv.b(aCiR2, -1201729305) != null) {
                return false;
            }
        } else if (aCiR.qp((ItemStack)cv.b(this, -1201729305), (ItemStack)cv.b(aCiR2, -1201729305)) == false) {
            return false;
        }
        return true;
    }

    private static Object qp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

