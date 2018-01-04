/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.PlayerInventory
 *  org.bukkit.inventory.meta.BookMeta
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.BookMeta;

@BtuM(value=0)
public class WWpk
extends miQG {
    public WWpk() {
        this.command = (String)o.k(1376933928);
        this.aliases = new String[]{(String)o.k(1910724647), (String)o.k(-604350426)};
        String[] arrstring = new String[1];
        arrstring[0] = WWpk.jR((aeiw)((Object)o.k(673269243)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(994727973);
        this.description = (String)o.k(-1276356572);
        this.vImB = (EJip)((Object)o.k(-1176677744));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        Player player = (Player)commandSender;
        int n = -1;
        n = this.biLo(player);
        if (n != -1) {
            player.getInventory().setItem(n, this.RYbf());
        }
    }

    private ItemStack RYbf() {
        ItemStack itemStack = new ItemStack((Material)o.k(-349677533));
        BookMeta bookMeta = (BookMeta)WWpk.jR(itemStack);
        bookMeta.setTitle((String)WWpk.jR(nJPf$sILv.G("\ud3de\u0d63\ueaf1\uee84\u5d21\ucaf4\u8ca3\u696a\ufb51\u40c6\u5848\ua3c3\ubb39\ufe17\uc37d\u71ca\ufc98\ue7f7\ue907\uf385\ub5ef\u9c10\u580f\uc0a0\u5971\u28f8\u7d84\udc16")));
        feCR<String> feCR2 = new feCR<String>();
        this.VwLY(feCR2);
        this.biLo(feCR2);
        bookMeta.setPages(feCR2);
        WWpk.jR(itemStack, bookMeta);
        return itemStack;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void biLo(feCR<String> feCR2) {
        Object object = "";
        object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-1434167280))), WWpk.jR((psKX)((Object)o.k(-1489545201)))), (psKX)((Object)o.k(1753241614))), WWpk.jR(nJPf$sILv.G("\ue4c5\u7626\u741d\uc134\u9080\u3b26\uaa47\u5ec6\u806b\u972b\u5cd0\uc51c\u5a0d\ubd4e\ue538\u4586\u92d5\u30b8\u40a0\u3d4c\u1a38\ua6a6\ub2b8\ufdb6\udef5\u7bb0\uf188\ud73d"))), (psKX)((Object)o.k(692209039))));
        Object object2 = WWpk.jR(WWpk.jR((Bcie)o.a((TEqA)o.k(911295720), 181950477)));
        WWpk.jR(object2);
        WWpk.jR(object2);
        while (WWpk.jR(object2) > 12) {
            WWpk.jR(object2, WWpk.jR(object2) - true);
        }
        Object object3 = WWpk.jR(object2);
        block1 : while (object3.hasNext()) {
            Object object4 = WWpk.jR((Integer)object3.next());
            Object object5 = WWpk.jR(WWpk.jR(WWpk.jR((Bcie)o.a((TEqA)o.k(911295720), 181950477))));
            while (object5.hasNext()) {
                String string = (String)object5.next();
                if (WWpk.jR((Integer)WWpk.jR(WWpk.jR((Bcie)o.a((TEqA)o.k(911295720), 181950477)), string), WWpk.jR(object4)) == false) continue;
                String string2 = WWpk.jR(string) > 14 ? WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(WWpk.jR(string, false, 14))), WWpk.jR(nJPf$sILv.G("\ue4c5\u7626\u741d\uc134\u9080\u3b26\uaa47\u5ec6\u806b\u972b\u5cd0\uc51c\u5a0d\ubd4e\ue538\u4590\u92dc\u30a3\u40a6\u3d5a")))) : string;
                object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-23312902))), string2), nJPf$sILv.G("\ue49c\u7669")), (psKX)((Object)o.k(968906774))), WWpk.jR((psKX)((Object)o.k(-1489545201)))), object4), nJPf$sILv.G("\ue4ac")));
                continue block1;
            }
        }
        WWpk.jR(feCR2, object);
    }

    private void VwLY(feCR<String> feCR2) {
        Object object = "";
        object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-1434167280))), WWpk.jR((psKX)((Object)o.k(-1489545201)))), (psKX)((Object)o.k(1753241614))), WWpk.jR(mrFx$WjFM.d("\u3a30\u0807\ud867\uce93\u32c1\u0b33\u9657\u5e11\u541c\u3639\u0aa5\ued98\ue175\uda53\u0ed3\u2f1f\uc356\u8955\ufa26\u8a90\uca15\uc75f"))), (psKX)((Object)o.k(692209039))));
        object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-23312902))), WWpk.jR(mrFx$WjFM.d("\u3a30\u0807\ud867\uce93\u32c1\u0b33\u9657\u5e11\u541c\u3639\u0aa5\ued98\ue175\uda53\u0ed3\u2f08\uc35f\u895a\ufa3a\u8a87\uca06\uc740\uaf1b\uf55f\uecd9\u7e25\u3c26\u85c4\uf91d"))), WWpk.jR().getOnlinePlayers().size()), mrFx$WjFM.d("\u3a59")));
        object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-23312902))), WWpk.jR(mrFx$WjFM.d("\u3a30\u0807\ud867\uce93\u32c1\u0b33\u9657\u5e11\u541c\u3639\u0aa5\ued98\ue175\uda53\u0ed3\u2f1b\uc35b\u894e\ufa2d\u8a89\uca07\uc71e\uaf5a\uf55f\uecd6\u7e2d\u3c2a\u85ce"))), WWpk.jR((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWpk.jR((biRJ)((Object)o.k(-864726310)))).get()), mrFx$WjFM.d("\u3a59")));
        object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-23312902))), WWpk.jR(mrFx$WjFM.d("\u3a30\u0807\ud867\uce93\u32c1\u0b33\u9657\u5e11\u541c\u3639\u0aa5\ued98\ue175\uda53\u0ed3\u2f0f\uc35c\u8949\ufa2f\u8a86\uca07\uc71e\uaf5a\uf55f\uecd6\u7e2d\u3c2a\u85ce"))), WWpk.jR().size()), mrFx$WjFM.d("\u3a59")));
        object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-1434167280))), WWpk.jR((psKX)((Object)o.k(-1489545201)))), (psKX)((Object)o.k(1753241614))), WWpk.jR(mrFx$WjFM.d("\u3a30\u0807\ud867\uce93\u32c1\u0b33\u9657\u5e11\u541c\u3639\u0aa5\ued98\ue175\uda53\u0ed3\u2f15\uc356\u8956\ufa2c\u8a90\uca0d"))), (psKX)((Object)o.k(692209039))));
        object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-23312902))), WWpk.jR((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWpk.jR((biRJ)((Object)o.k(737891048)))).get()), WWpk.jR(mrFx$WjFM.d("\u3a30\u0807\ud867\uce93\u32c1\u0b33\u9657\u5e11\u541c\u3639\u0aa5\ued98\ue175\uda53\u0ed3\u2f17\uc355"))), WWpk.jR((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWpk.jR((biRJ)((Object)o.k(-1905241372)))).get()), mrFx$WjFM.d("\u3a59")));
        object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-1434167280))), WWpk.jR((psKX)((Object)o.k(-1489545201)))), (psKX)((Object)o.k(1753241614))), WWpk.jR(mrFx$WjFM.d("\u3a30\u0807\ud867\uce93\u32c1\u0b33\u9657\u5e11\u541c\u3639\u0aa5\ued98\ue175\uda53\u0ed3\u2f0c\uc35a\u8958\ufa28"))), (psKX)((Object)o.k(692209039))));
        object = WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(WWpk.jR(new StringBuilder((String)WWpk.jR(object)), (psKX)((Object)o.k(-23312902))), WWpk.jR(mrFx$WjFM.d("\u3a30\u0807\ud867\uce93\u32c1\u0b33\u9657\u5e11\u541c\u3639\u0aa5\ued98\ue175\uda53\u0ed3\u2f0c\uc35a\u8958\ufa28\u8acf\uca01\uc740\uaf57\uf557\uecd2"))), WWpk.jR((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWpk.jR((biRJ)((Object)o.k(-1235725590)))).get()), mrFx$WjFM.d("\u3a73\u0840")), WWpk.jR(WWpk.jR((FWER)o.a((TEqA)o.k(911295720), 1286751627), WWpk.jR((biRJ)((Object)o.k(711152348)))).getValue(), false)), mrFx$WjFM.d("\u3a3e\u081b\ud823\ucef4")));
        WWpk.jR(feCR2, object);
    }

    private int biLo(Player player) {
        int n;
        block6 : {
            block5 : {
                n = player.getInventory().getHeldItemSlot();
                if (player.getInventory().getItem(n) == null) break block5;
                if (WWpk.jR(WWpk.jR(player.getInventory().getItem(n)), (Material)o.k(-1236315249)) == false) break block6;
            }
            return n;
        }
        int n2 = 0;
        while (n2 < 9) {
            n = n2++;
            if (player.getInventory().getItem(n) != null) {
                if (WWpk.jR(WWpk.jR(player.getInventory().getItem(n)), (Material)o.k(-1236315249)) == false) continue;
            }
            return n;
        }
        return -1;
    }

    private static Object jR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

