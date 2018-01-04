/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.enchantments.Enchantment
 *  org.bukkit.inventory.ItemStack
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class Ipxq {
    public static boolean yJLS(ItemStack itemStack) {
        if (itemStack != null) {
            if (Ipxq.oq(Ipxq.oq(itemStack), (Material)o.k(-1236315249)) == false) {
                return true;
            }
        }
        return false;
    }

    public static boolean yJLS(ItemStack itemStack, Material material) {
        if (Ipxq.yJLS(itemStack)) {
            if (Ipxq.oq(Ipxq.oq(itemStack), material) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean yJLS(ItemStack itemStack, OrkN orkN) {
        if (Ipxq.yJLS(itemStack, (Material)Ipxq.oq(orkN))) {
            if (Ipxq.oq(Ipxq.oq(itemStack)) == Ipxq.oq(Ipxq.oq(orkN))) {
                return true;
            }
        }
        return false;
    }

    public static boolean yJLS(ItemStack itemStack, Material material, byte by) {
        return Ipxq.yJLS(itemStack, new OrkN(material, (Byte)Ipxq.oq(by)));
    }

    public static boolean yJLS(ItemStack itemStack, Material material, int n) {
        return Ipxq.yJLS(itemStack, material, (byte)n);
    }

    public static boolean UtIU(ItemStack itemStack) {
        if (Ipxq.yJLS(itemStack)) {
            if (Ipxq.oq(itemStack) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean biLo(ItemStack itemStack) {
        if (Ipxq.UtIU(itemStack)) {
            if (Ipxq.oq(itemStack).hasDisplayName()) {
                return true;
            }
        }
        return false;
    }

    public static boolean VwLY(ItemStack itemStack) {
        if (Ipxq.UtIU(itemStack)) {
            if (Ipxq.oq(itemStack).hasLore()) {
                return true;
            }
        }
        return false;
    }

    public static boolean yJLS(ItemStack itemStack, String string) {
        if (Ipxq.biLo(itemStack)) {
            if (Ipxq.oq(Ipxq.oq(itemStack).getDisplayName(), string) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean yJLS(ItemStack itemStack, List<String> list) {
        if (Ipxq.VwLY(itemStack)) {
            if (Ipxq.oq(new feCR<String>(list), new feCR(Ipxq.oq(itemStack).getLore())) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean yJLS(ItemStack itemStack, Enchantment enchantment) {
        if (Ipxq.yJLS(itemStack)) {
            if (Ipxq.oq(itemStack).containsKey((Object)enchantment)) {
                return true;
            }
        }
        return false;
    }

    public static boolean yJLS(ItemStack itemStack, Enchantment enchantment, int n) {
        if (!Ipxq.yJLS(itemStack)) {
            return false;
        }
        if (Ipxq.yJLS(itemStack, enchantment)) {
            if (Ipxq.oq(itemStack, enchantment) == n) {
                return true;
            }
        }
        return false;
    }

    public static boolean TEqA(ItemStack itemStack) {
        if (!Ipxq.yJLS(itemStack)) {
            return false;
        }
        if (Ipxq.oq(itemStack).isEmpty()) {
            return false;
        }
        return true;
    }

    public static OrkN KTiK(ItemStack itemStack) {
        if (itemStack != null) {
            return new OrkN((Material)Ipxq.oq(itemStack), (Byte)Ipxq.oq(Ipxq.oq(Ipxq.oq(itemStack))));
        }
        return null;
    }

    public static boolean GPlk(ItemStack itemStack) {
        if (Ipxq.yJLS(itemStack) && Ipxq.Ipep(itemStack) == Ipxq.qcvH(itemStack) && Ipxq.ktHX(itemStack)) {
            return true;
        }
        return false;
    }

    public static boolean ktHX(ItemStack itemStack) {
        if (Ipxq.yJLS(itemStack) && Ipxq.Ipep(itemStack) > 0) {
            return true;
        }
        return false;
    }

    public static double HeSD(ItemStack itemStack) {
        if (!Ipxq.yJLS(itemStack)) {
            return 0.0;
        }
        if (Ipxq.Ipep(itemStack) == 0) {
            return 1.0;
        }
        return 1.0 - (double)Ipxq.qcvH(itemStack) / (double)Ipxq.Ipep(itemStack);
    }

    public static void yJLS(ItemStack itemStack, double d) {
        if (!Ipxq.yJLS(itemStack)) {
            return;
        }
        double d2 = d > 1.0 ? 1.0 : (d = d < 0.0 ? 0.0 : d);
        if (Ipxq.qcvH(itemStack) == 0) {
            return;
        }
        Ipxq.yJLS(itemStack, (int)((double)Ipxq.Ipep(itemStack) * (1.0 - d)));
    }

    public static short Ipep(ItemStack itemStack) {
        if (!Ipxq.yJLS(itemStack)) {
            return 0;
        }
        return (short)Ipxq.oq(Ipxq.oq(itemStack));
    }

    public static short qcvH(ItemStack itemStack) {
        if (!Ipxq.yJLS(itemStack)) {
            return 0;
        }
        return (short)Ipxq.oq(itemStack);
    }

    public static void yJLS(ItemStack itemStack, short s) {
        if (!Ipxq.yJLS(itemStack)) {
            return;
        }
        Ipxq.oq(itemStack, s > Ipxq.Ipep(itemStack) ? Ipxq.Ipep(itemStack) : s);
    }

    public static void yJLS(ItemStack itemStack, int n) {
        if (!Ipxq.yJLS(itemStack)) {
            return;
        }
        Ipxq.yJLS(itemStack, (short)n);
    }

    public static void UtIU(ItemStack itemStack, int n) {
        if (!Ipxq.yJLS(itemStack)) {
            return;
        }
        Ipxq.yJLS(itemStack, Ipxq.qcvH(itemStack) + n);
    }

    public static boolean yJLS(ItemStack itemStack, ItemStack itemStack2) {
        if (Ipxq.yJLS(itemStack) && Ipxq.yJLS(itemStack2)) {
            if (Ipxq.oq(Ipxq.oq(itemStack), Ipxq.oq(itemStack2)) == false) {
                return false;
            }
            if (Ipxq.oq(Ipxq.oq(itemStack)) != Ipxq.oq(Ipxq.oq(itemStack2))) {
                return false;
            }
            if (Ipxq.oq(itemStack) != Ipxq.oq(itemStack2)) {
                return false;
            }
            if (Ipxq.oq(itemStack) != Ipxq.oq(itemStack2)) {
                return false;
            }
            if (Ipxq.oq(itemStack) != false) {
                if (Ipxq.oq(Ipxq.oq(itemStack).getDisplayName(), Ipxq.oq(itemStack2).getDisplayName()) == false) {
                    return false;
                }
                if (Ipxq.oq(new feCR(Ipxq.oq(itemStack).getLore()), new feCR(Ipxq.oq(itemStack2).getLore())) == false) {
                    return false;
                }
            }
            if (Ipxq.oq(itemStack) < Ipxq.oq(itemStack) + Ipxq.oq(itemStack2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static Object oq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

