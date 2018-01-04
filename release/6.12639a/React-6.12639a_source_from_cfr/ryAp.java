/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.block.Hopper
 *  org.bukkit.event.Listener
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.ItemStack
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.bukkit.Material;
import org.bukkit.block.Hopper;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ryAp
implements Listener {
    private Hopper DbYw;

    public ryAp(Hopper hopper) {
        this.DbYw = hopper;
    }

    public int yJLS(Inventory inventory, int n) {
        int n2 = 0;
        int n3 = 0;
        while (n3 < n && this.getInventory().firstEmpty() >= 0) {
            ItemStack[] arritemStack = inventory.getContents();
            ItemStack itemStack = null;
            int n4 = -1;
            int n5 = 0;
            while (n5 < arritemStack.length) {
                if (arritemStack[n5] != null) {
                    if (ryAp.sq(ryAp.sq(arritemStack[n5]), (Material)o.k(-1236315249)) == false) {
                        itemStack = arritemStack[n5];
                        n4 = n5;
                        break;
                    }
                }
                ++n5;
            }
            if (itemStack != null && n4 >= 0) {
                arritemStack[n4] = new ItemStack((Material)o.k(-1236315249));
                this.getInventory().addItem(new ItemStack[]{itemStack});
                inventory.setContents(arritemStack);
                ++n2;
            }
            ++n3;
        }
        return n2;
    }

    public Inventory getInventory() {
        return ((Hopper)o.a(this, 1751536526)).getInventory();
    }

    public Gaty iTUC() {
        return ryAp.sq((Hopper)o.a(this, 1751536526));
    }

    public boolean baAi() {
        return (boolean)ryAp.sq((Hopper)o.a(this, 1751536526));
    }

    private static Object sq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

