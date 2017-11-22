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

@IWbc(value=0)
public class wfLE
extends Aqbp {
    public wfLE() {
        this.command = (String)cv.e(1230770616);
        this.aliases = new String[]{(String)cv.e(1839993275), (String)cv.e(17895866)};
        String[] arrstring = new String[1];
        arrstring[0] = wfLE.Ct((tdpC)((Object)cv.e(242159151)));
        this.VoJs = arrstring;
        this.ktXM = (String)cv.e(-1597566555);
        this.description = (String)cv.e(1136660900);
        this.IFas = (OikN)((Object)cv.e(-1014689706));
    }

    @Override
    public void ssNb(CommandSender commandSender, String[] arrstring) {
        Player player = (Player)commandSender;
        int n = -1;
        n = this.DYFV(player);
        if (n != -1) {
            player.getInventory().setItem(n, this.YEBy());
        }
    }

    private ItemStack YEBy() {
        ItemStack itemStack = new ItemStack((Material)cv.e(2089750951));
        BookMeta bookMeta = (BookMeta)wfLE.Ct(itemStack);
        bookMeta.setTitle(YEBy$TyVf.W("\ua5df\udc3f\u7f56\ue0c7\u9f36\u4514\u6177\ue671\u333d\u5f77\u6f49\ue08f\u62ef"));
        wfPa<String> wfPa2 = new wfPa<String>();
        this.OXeK(wfPa2);
        this.IWSm(wfPa2);
        bookMeta.setPages(wfPa2);
        wfLE.Ct(itemStack, bookMeta);
        return itemStack;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IWSm(wfPa<String> wfPa2) {
        Object object = "";
        object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-121302624))), wfLE.Ct((APKB)((Object)cv.e(-1164766813)))), (APKB)((Object)cv.e(-352841310))), rgig$AWxc.r("\u790d\u0166\ud39f\u7e55\uf97d\u1f31\u5a38\ud52e\u9989\uba34\u353e\uc29e\u895b\u4f29")), (APKB)((Object)cv.e(1712131958))));
        Object object2 = wfLE.Ct(wfLE.Ct((BuHU)cv.b((YoSa)cv.e(239341894), 2096566701)));
        wfLE.Ct(object2);
        wfLE.Ct(object2);
        while (wfLE.Ct(object2) > 12) {
            wfLE.Ct(object2, wfLE.Ct(object2) - true);
        }
        Object object3 = wfLE.Ct(object2);
        block1 : while (object3.hasNext()) {
            Object object4 = wfLE.Ct((Integer)object3.next());
            Object object5 = wfLE.Ct(wfLE.Ct(wfLE.Ct((BuHU)cv.b((YoSa)cv.e(239341894), 2096566701))));
            while (object5.hasNext()) {
                String string = (String)object5.next();
                if (wfLE.Ct((Integer)wfLE.Ct(wfLE.Ct((BuHU)cv.b((YoSa)cv.e(239341894), 2096566701)), string), wfLE.Ct(object4)) == false) continue;
                String string2 = wfLE.Ct(string) > 14 ? wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(wfLE.Ct(string, false, 14))), rgig$AWxc.r("\u7970\u012d\ud3c3"))) : string;
                object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-1071443542))), string2), rgig$AWxc.r("\u7964\u0123")), (APKB)((Object)cv.e(456069525))), wfLE.Ct((APKB)((Object)cv.e(-1164766813)))), object4), rgig$AWxc.r("\u7954")));
                continue block1;
            }
        }
        wfLE.Ct(wfPa2, object);
    }

    private void OXeK(wfPa<String> wfPa2) {
        Object object = "";
        object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-121302624))), wfLE.Ct((APKB)((Object)cv.e(-1164766813)))), (APKB)((Object)cv.e(-352841310))), YEBy$TyVf.W("\uc868\u5820\u5a65\u72fd\ubbda\ucee7\u0ae2\ucfee")), (APKB)((Object)cv.e(1712131958))));
        object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-1071443542))), YEBy$TyVf.W("\uc87f\u5829\u5a6a\u72e1\ubbcd\ucef4\u0afd\ucfc4\ubc1a\u591e\u2f57\u1de3\u061a\u197f\u211f\ua876")), wfLE.Ct().getOnlinePlayers().size()), YEBy$TyVf.W("\uc825")));
        object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-1071443542))), YEBy$TyVf.W("\uc86c\u582d\u5a7e\u72f6\ubbc3\ucef5\u0aae\ucfa8\ubc3a\u5911\u2f5f\u1def\u0610\u1920\u2105")), wfLE.Ct((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), wfLE.Ct((pqxh)((Object)cv.e(-893710179)))).get()), YEBy$TyVf.W("\uc825")));
        object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-1071443542))), YEBy$TyVf.W("\uc878\u582a\u5a79\u72f4\ubbcc\ucef5\u0aae\ucfa8\ubc3a\u5911\u2f5f\u1def\u0610\u1920\u2105")), wfLE.Ct().size()), YEBy$TyVf.W("\uc825")));
        object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-121302624))), wfLE.Ct((APKB)((Object)cv.e(-1164766813)))), (APKB)((Object)cv.e(-352841310))), YEBy$TyVf.W("\uc862\u5820\u5a66\u72f7\ubbda\uceff\u0a84")), (APKB)((Object)cv.e(1712131958))));
        object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-1071443542))), wfLE.Ct((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), wfLE.Ct((pqxh)((Object)cv.e(-1615195989)))).get()), YEBy$TyVf.W("\uc80f\u582a\u5a6d\u72b8")), wfLE.Ct((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), wfLE.Ct((pqxh)((Object)cv.e(1773277335)))).get()), YEBy$TyVf.W("\uc825")));
        object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-121302624))), wfLE.Ct((APKB)((Object)cv.e(-1164766813)))), (APKB)((Object)cv.e(-352841310))), YEBy$TyVf.W("\uc87b\u582c\u5a68\u72f3\ubba2")), (APKB)((Object)cv.e(1712131958))));
        object = wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(wfLE.Ct(new StringBuilder((String)wfLE.Ct(object)), (APKB)((Object)cv.e(-1071443542))), YEBy$TyVf.W("\uc87b\u582c\u5a68\u72f3\ubb88\uced3\u0afd\ucf85\ubc32\u5915\u2f01\u1daa")), wfLE.Ct((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), wfLE.Ct((pqxh)((Object)cv.e(987041961)))).get()), YEBy$TyVf.W("\uc80f\u586d")), wfLE.Ct(wfLE.Ct((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), wfLE.Ct((pqxh)((Object)cv.e(1212616879)))).getValue(), false)), YEBy$TyVf.W("\uc842\u5836\u5a22\u7292")));
        wfLE.Ct(wfPa2, object);
    }

    private int DYFV(Player player) {
        int n;
        block6 : {
            block5 : {
                n = player.getInventory().getHeldItemSlot();
                if (player.getInventory().getItem(n) == null) break block5;
                if (wfLE.Ct(wfLE.Ct(player.getInventory().getItem(n)), (Material)cv.e(-493219437)) == false) break block6;
            }
            return n;
        }
        int n2 = 0;
        while (n2 < 9) {
            n = n2++;
            if (player.getInventory().getItem(n) != null) {
                if (wfLE.Ct(wfLE.Ct(player.getInventory().getItem(n)), (Material)cv.e(-493219437)) == false) continue;
            }
            return n;
        }
        return -1;
    }

    private static Object Ct(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

