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

public class cAfA {
    public static boolean mXJp(ItemStack itemStack) {
        if (itemStack != null) {
            if (cAfA.YI(cAfA.YI(itemStack), (Material)yy.p(1934035000)) == false) {
                return true;
            }
        }
        return false;
    }

    public static boolean mXJp(ItemStack itemStack, Material material) {
        if (cAfA.mXJp(itemStack)) {
            if (cAfA.YI(cAfA.YI(itemStack), material) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean mXJp(ItemStack itemStack, XAel xAel) {
        if (cAfA.mXJp(itemStack, (Material)cAfA.YI(xAel))) {
            if (cAfA.YI(cAfA.YI(itemStack)) == cAfA.YI(cAfA.YI(xAel))) {
                return true;
            }
        }
        return false;
    }

    public static boolean mXJp(ItemStack itemStack, Material material, byte by) {
        return cAfA.mXJp(itemStack, new XAel(material, (Byte)cAfA.YI(by)));
    }

    public static boolean mXJp(ItemStack itemStack, Material material, int n) {
        return cAfA.mXJp(itemStack, material, (byte)n);
    }

    public static boolean ksfs(ItemStack itemStack) {
        if (cAfA.mXJp(itemStack)) {
            if (cAfA.YI(itemStack) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean yJLL(ItemStack itemStack) {
        if (cAfA.ksfs(itemStack)) {
            if (cAfA.YI(itemStack).hasDisplayName()) {
                return true;
            }
        }
        return false;
    }

    public static boolean SnBs(ItemStack itemStack) {
        if (cAfA.ksfs(itemStack)) {
            if (cAfA.YI(itemStack).hasLore()) {
                return true;
            }
        }
        return false;
    }

    public static boolean mXJp(ItemStack itemStack, String string) {
        if (cAfA.yJLL(itemStack)) {
            if (cAfA.YI(cAfA.YI(itemStack).getDisplayName(), string) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean mXJp(ItemStack itemStack, List<String> list) {
        if (cAfA.SnBs(itemStack)) {
            if (cAfA.YI(new PBUD<String>(list), new PBUD(cAfA.YI(itemStack).getLore())) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean mXJp(ItemStack itemStack, Enchantment enchantment) {
        if (cAfA.mXJp(itemStack)) {
            if (cAfA.YI(itemStack).containsKey((Object)enchantment)) {
                return true;
            }
        }
        return false;
    }

    public static boolean mXJp(ItemStack itemStack, Enchantment enchantment, int n) {
        if (!cAfA.mXJp(itemStack)) {
            return false;
        }
        if (cAfA.mXJp(itemStack, enchantment)) {
            if (cAfA.YI(itemStack, enchantment) == n) {
                return true;
            }
        }
        return false;
    }

    public static boolean qdWJ(ItemStack itemStack) {
        if (!cAfA.mXJp(itemStack)) {
            return false;
        }
        if (cAfA.YI(itemStack).isEmpty()) {
            return false;
        }
        return true;
    }

    public static XAel JRFt(ItemStack itemStack) {
        if (itemStack != null) {
            return new XAel((Material)cAfA.YI(itemStack), (Byte)cAfA.YI(cAfA.YI(cAfA.YI(itemStack))));
        }
        return null;
    }

    public static boolean halY(ItemStack itemStack) {
        if (cAfA.mXJp(itemStack) && cAfA.CVAs(itemStack) == cAfA.qAsQ(itemStack) && cAfA.ssMm(itemStack)) {
            return true;
        }
        return false;
    }

    public static boolean ssMm(ItemStack itemStack) {
        if (cAfA.mXJp(itemStack) && cAfA.CVAs(itemStack) > 0) {
            return true;
        }
        return false;
    }

    public static double yIkI(ItemStack itemStack) {
        if (!cAfA.mXJp(itemStack)) {
            return 0.0;
        }
        if (cAfA.CVAs(itemStack) == 0) {
            return 1.0;
        }
        return 1.0 - (double)cAfA.qAsQ(itemStack) / (double)cAfA.CVAs(itemStack);
    }

    public static void mXJp(ItemStack itemStack, double d) {
        if (!cAfA.mXJp(itemStack)) {
            return;
        }
        double d2 = d > 1.0 ? 1.0 : (d = d < 0.0 ? 0.0 : d);
        if (cAfA.qAsQ(itemStack) == 0) {
            return;
        }
        cAfA.mXJp(itemStack, (int)((double)cAfA.CVAs(itemStack) * (1.0 - d)));
    }

    public static short CVAs(ItemStack itemStack) {
        if (!cAfA.mXJp(itemStack)) {
            return 0;
        }
        return (short)cAfA.YI(cAfA.YI(itemStack));
    }

    public static short qAsQ(ItemStack itemStack) {
        if (!cAfA.mXJp(itemStack)) {
            return 0;
        }
        return (short)cAfA.YI(itemStack);
    }

    public static void mXJp(ItemStack itemStack, short s) {
        if (!cAfA.mXJp(itemStack)) {
            return;
        }
        cAfA.YI(itemStack, s > cAfA.CVAs(itemStack) ? cAfA.CVAs(itemStack) : s);
    }

    public static void mXJp(ItemStack itemStack, int n) {
        if (!cAfA.mXJp(itemStack)) {
            return;
        }
        cAfA.mXJp(itemStack, (short)n);
    }

    public static void ksfs(ItemStack itemStack, int n) {
        if (!cAfA.mXJp(itemStack)) {
            return;
        }
        cAfA.mXJp(itemStack, cAfA.qAsQ(itemStack) + n);
    }

    public static boolean mXJp(ItemStack itemStack, ItemStack itemStack2) {
        if (cAfA.mXJp(itemStack) && cAfA.mXJp(itemStack2)) {
            if (cAfA.YI(cAfA.YI(itemStack), cAfA.YI(itemStack2)) == false) {
                return false;
            }
            if (cAfA.YI(cAfA.YI(itemStack)) != cAfA.YI(cAfA.YI(itemStack2))) {
                return false;
            }
            if (cAfA.YI(itemStack) != cAfA.YI(itemStack2)) {
                return false;
            }
            if (cAfA.YI(itemStack) != cAfA.YI(itemStack2)) {
                return false;
            }
            if (cAfA.YI(itemStack) != false) {
                if (cAfA.YI(cAfA.YI(itemStack).getDisplayName(), cAfA.YI(itemStack2).getDisplayName()) == false) {
                    return false;
                }
                if (cAfA.YI(new PBUD(cAfA.YI(itemStack).getLore()), new PBUD(cAfA.YI(itemStack2).getLore())) == false) {
                    return false;
                }
            }
            if (cAfA.YI(itemStack) < cAfA.YI(itemStack) + cAfA.YI(itemStack2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static Object YI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

