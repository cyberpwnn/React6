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

public class lTsr {
    public static boolean ssNb(ItemStack itemStack) {
        if (itemStack != null) {
            if (lTsr.DR(lTsr.DR(itemStack), (Material)cv.e(-493219437)) == false) {
                return true;
            }
        }
        return false;
    }

    public static boolean ssNb(ItemStack itemStack, Material material) {
        if (lTsr.ssNb(itemStack)) {
            if (lTsr.DR(lTsr.DR(itemStack), material) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean ssNb(ItemStack itemStack, MBKs mBKs) {
        if (lTsr.ssNb(itemStack, (Material)lTsr.DR(mBKs))) {
            if (lTsr.DR(lTsr.DR(itemStack)) == lTsr.DR(lTsr.DR(mBKs))) {
                return true;
            }
        }
        return false;
    }

    public static boolean ssNb(ItemStack itemStack, Material material, byte by) {
        return lTsr.ssNb(itemStack, new MBKs(material, (Byte)lTsr.DR(by)));
    }

    public static boolean ssNb(ItemStack itemStack, Material material, int n) {
        return lTsr.ssNb(itemStack, material, (byte)n);
    }

    public static boolean DYFV(ItemStack itemStack) {
        if (lTsr.ssNb(itemStack)) {
            if (lTsr.DR(itemStack) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean IWSm(ItemStack itemStack) {
        if (lTsr.DYFV(itemStack)) {
            if (lTsr.DR(itemStack).hasDisplayName()) {
                return true;
            }
        }
        return false;
    }

    public static boolean OXeK(ItemStack itemStack) {
        if (lTsr.DYFV(itemStack)) {
            if (lTsr.DR(itemStack).hasLore()) {
                return true;
            }
        }
        return false;
    }

    public static boolean ssNb(ItemStack itemStack, String string) {
        if (lTsr.IWSm(itemStack)) {
            if (lTsr.DR(lTsr.DR(itemStack).getDisplayName(), string) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean ssNb(ItemStack itemStack, List<String> list) {
        if (lTsr.OXeK(itemStack)) {
            if (lTsr.DR(new wfPa<String>(list), new wfPa(lTsr.DR(itemStack).getLore())) != false) {
                return true;
            }
        }
        return false;
    }

    public static boolean ssNb(ItemStack itemStack, Enchantment enchantment) {
        if (lTsr.ssNb(itemStack)) {
            if (lTsr.DR(itemStack).containsKey((Object)enchantment)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ssNb(ItemStack itemStack, Enchantment enchantment, int n) {
        if (!lTsr.ssNb(itemStack)) {
            return false;
        }
        if (lTsr.ssNb(itemStack, enchantment)) {
            if (lTsr.DR(itemStack, enchantment) == n) {
                return true;
            }
        }
        return false;
    }

    public static boolean YoSa(ItemStack itemStack) {
        if (!lTsr.ssNb(itemStack)) {
            return false;
        }
        if (lTsr.DR(itemStack).isEmpty()) {
            return false;
        }
        return true;
    }

    public static MBKs jhSt(ItemStack itemStack) {
        if (itemStack != null) {
            return new MBKs((Material)lTsr.DR(itemStack), (Byte)lTsr.DR(lTsr.DR(lTsr.DR(itemStack))));
        }
        return null;
    }

    public static boolean BkpW(ItemStack itemStack) {
        if (lTsr.ssNb(itemStack) && lTsr.vtFs(itemStack) == lTsr.EmLA(itemStack) && lTsr.lCdp(itemStack)) {
            return true;
        }
        return false;
    }

    public static boolean lCdp(ItemStack itemStack) {
        if (lTsr.ssNb(itemStack) && lTsr.vtFs(itemStack) > 0) {
            return true;
        }
        return false;
    }

    public static double nJLQ(ItemStack itemStack) {
        if (!lTsr.ssNb(itemStack)) {
            return 0.0;
        }
        if (lTsr.vtFs(itemStack) == 0) {
            return 1.0;
        }
        return 1.0 - (double)lTsr.EmLA(itemStack) / (double)lTsr.vtFs(itemStack);
    }

    public static void ssNb(ItemStack itemStack, double d) {
        if (!lTsr.ssNb(itemStack)) {
            return;
        }
        double d2 = d > 1.0 ? 1.0 : (d = d < 0.0 ? 0.0 : d);
        if (lTsr.EmLA(itemStack) == 0) {
            return;
        }
        lTsr.ssNb(itemStack, (int)((double)lTsr.vtFs(itemStack) * (1.0 - d)));
    }

    public static short vtFs(ItemStack itemStack) {
        if (!lTsr.ssNb(itemStack)) {
            return 0;
        }
        return (short)lTsr.DR(lTsr.DR(itemStack));
    }

    public static short EmLA(ItemStack itemStack) {
        if (!lTsr.ssNb(itemStack)) {
            return 0;
        }
        return (short)lTsr.DR(itemStack);
    }

    public static void ssNb(ItemStack itemStack, short s) {
        if (!lTsr.ssNb(itemStack)) {
            return;
        }
        lTsr.DR(itemStack, s > lTsr.vtFs(itemStack) ? lTsr.vtFs(itemStack) : s);
    }

    public static void ssNb(ItemStack itemStack, int n) {
        if (!lTsr.ssNb(itemStack)) {
            return;
        }
        lTsr.ssNb(itemStack, (short)n);
    }

    public static void DYFV(ItemStack itemStack, int n) {
        if (!lTsr.ssNb(itemStack)) {
            return;
        }
        lTsr.ssNb(itemStack, lTsr.EmLA(itemStack) + n);
    }

    public static boolean ssNb(ItemStack itemStack, ItemStack itemStack2) {
        if (lTsr.ssNb(itemStack) && lTsr.ssNb(itemStack2)) {
            if (lTsr.DR(lTsr.DR(itemStack), lTsr.DR(itemStack2)) == false) {
                return false;
            }
            if (lTsr.DR(lTsr.DR(itemStack)) != lTsr.DR(lTsr.DR(itemStack2))) {
                return false;
            }
            if (lTsr.DR(itemStack) != lTsr.DR(itemStack2)) {
                return false;
            }
            if (lTsr.DR(itemStack) != lTsr.DR(itemStack2)) {
                return false;
            }
            if (lTsr.DR(itemStack) != false) {
                if (lTsr.DR(lTsr.DR(itemStack).getDisplayName(), lTsr.DR(itemStack2).getDisplayName()) == false) {
                    return false;
                }
                if (lTsr.DR(new wfPa(lTsr.DR(itemStack).getLore()), new wfPa(lTsr.DR(itemStack2).getLore())) == false) {
                    return false;
                }
            }
            if (lTsr.DR(itemStack) < lTsr.DR(itemStack) + lTsr.DR(itemStack2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static Object DR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

