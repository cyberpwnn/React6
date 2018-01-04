/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.enchantments.Enchantment
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.AsyncPlayerChatEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.event.player.PlayerSwapHandItemsEvent
 *  org.bukkit.event.player.PlayerToggleSneakEvent
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.PlayerInventory
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Yfkr
implements Listener {
    private Player player;
    private ItemStack item;
    private feCR<ogNr> ptEC;
    private xqdv tDYx;
    private CfoR Wrkb;
    private UstC KgXy;
    private boolean paqR;
    private feCR<String> XeNW;
    private JJHM qKuP;
    private JJHM FFij;
    private int Ucvq = 0;
    private boolean dVqK = false;

    public Yfkr(Player player) {
        this.qKuP = new Yfkr$1(this, FMkR$WjFM.a("\u5914\u2c87\u0b8b\u7286\udbba\u173c\ue0ed\u382d\ub3f9\u79ae\u5f56"), 199, player);
        this.FFij = new Yfkr$2(this, FMkR$WjFM.a("\u5914\u2c87\u0b8b\u7286\udbba\u173c\ue0ed\u382d\ub3f9\u79ae\u5f56\u3557"), 0);
        this.XeNW = new feCR();
        this.paqR = false;
        Yfkr.YT(this);
        this.player = player;
        this.KgXy = new Yfkr$3(this);
    }

    @EventHandler
    public void yJLS(PlayerToggleSneakEvent playerToggleSneakEvent) {
        if (((Boolean)o.a(this, -1048028817)).booleanValue()) {
            if (Yfkr.YT(Yfkr.YT(playerToggleSneakEvent), (Player)o.a(this, -1573496466)) != false) {
                Yfkr.YT((xqdv)o.a(this, 1705597293));
                Yfkr yfkr = this;
                o.v(yfkr, -1938269845, (Integer)o.a(yfkr, -1938269845) + 5);
            }
        }
    }

    @EventHandler
    public void yJLS(PlayerQuitEvent playerQuitEvent) {
        if (Yfkr.YT(Yfkr.YT(playerQuitEvent), Yfkr.YT(playerQuitEvent)) != false) {
            this.destroy();
        }
    }

    public void sQJh(String string) {
        Object object = Yfkr.YT(((String[])Yfkr.YT(string, mrFx$WjFM.d("\u248c\u018b\u920a\u9cb8\u7caa\ua8a3\uc943\u7cc6\ubfca\uf902\u6f82\u7930\uafbc\uefdc\u4b58\ub524\u04e0\u7437")))[0]);
        Object object2 = Yfkr.YT(object);
        Object object3 = Yfkr.YT(Yfkr.YT(Yfkr.YT(Yfkr.YT(Yfkr.YT(Yfkr.YT(new StringBuilder(), (psKX)((Object)o.k(2144817739))), mrFx$WjFM.d("\u24ed")), Yfkr.YT(Yfkr.YT() - Yfkr.YT(object2), false)), mrFx$WjFM.d("\u2496\u01b8\u9228\u9c96\u7cb4\ua8d7")), ((String[])Yfkr.YT(string, mrFx$WjFM.d("\u248c\u018b\u920a\u9cb8\u7caa\ua8a3\uc943\u7cc6\ubfca\uf902\u6f82\u7930\uafbc\uefdc\u4b58\ub524\u04e0\u7437")))[1]));
        ((Player)o.a(this, -1573496466)).sendMessage((String)object3);
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(AsyncPlayerChatEvent asyncPlayerChatEvent) {
    }

    @EventHandler
    public void yJLS(wClQ wClQ2) {
        if (((Boolean)o.a(this, -1048028817)).booleanValue()) {
            if (Yfkr.YT(Yfkr.YT(wClQ2), (Player)o.a(this, -1573496466)) != false) {
                if (Yfkr.YT(Yfkr.YT(wClQ2), (YMWq)((Object)o.k(1175935264))) != false) {
                    Yfkr.YT((xqdv)o.a(this, 1705597293), 32 * Yfkr.YT(wClQ2));
                    return;
                }
                Yfkr.YT((xqdv)o.a(this, 1705597293), -32 * Yfkr.YT(wClQ2));
            }
        }
    }

    @EventHandler
    public void yJLS(PlayerSwapHandItemsEvent playerSwapHandItemsEvent) {
        if (((Boolean)o.a(this, -1048028817)).booleanValue()) {
            if (Yfkr.YT(Yfkr.YT(playerSwapHandItemsEvent), (Player)o.a(this, -1573496466)) != false) {
                this.disable();
                Yfkr.YT(playerSwapHandItemsEvent, true);
            }
        }
    }

    public void destroy() {
        if (((Boolean)o.a(this, -1048028817)).booleanValue()) {
            this.gEea();
        }
        Yfkr.YT((JJHM)o.a(this, -1547675277));
        Yfkr.YT((JJHM)o.a(this, 857299297));
        Yfkr.YT(this);
    }

    public void ebDB() {
        if (((Boolean)o.a(this, -1048028817)).booleanValue()) {
            this.disable();
            return;
        }
        this.enable();
    }

    public void Mkpo(feCR<ogNr> feCR2) {
        o.v(this, 1425037664, feCR2);
    }

    public void enable() {
        block3 : {
            block2 : {
                if (((Player)o.a(this, -1573496466)).getInventory().getItemInOffHand() == null) break block2;
                if (Yfkr.YT(Yfkr.YT(((Player)o.a(this, -1573496466)).getInventory().getItemInOffHand()), (Material)o.k(-1236315249)) == false) break block3;
            }
            Yfkr.YT(Yfkr.YT((JkaV)o.a((TEqA)o.k(911295720), 1104499257), (Player)o.a(this, -1573496466)), true);
            o.v(this, -1048028817, true);
            ((Player)o.a(this, -1573496466)).getInventory().setItemInOffHand((ItemStack)o.a(this, 500783454));
            Yfkr.YT((Player)o.a(this, -1573496466), mrFx$WjFM.d("\u9883\u6eda\ucbd3\u19f7\u394e\uf7fb\u2cfb\ue940\ue841\u4265\u438d\u7504\u159e\u5c3e\u9ac1"));
            Yfkr.YT((Player)o.a(this, -1573496466), mrFx$WjFM.d("\u9883\u6ede\ucbd0\u19f4\u3946\uf7f2\u2cf9\ue913\ue824\u4263\u438d\u7510\u1597\u5c7b\u9ac7\ucb7a\udfc2\u5beb\uf9d9\u9438\u7c13\u76d8\u603a\u73c0\u74c8\uf973\ucf83\u7a13\u6172\u5c34\u3274\ud606\u3ea6\u3548\u4064\u81a7\u8205\ub4e1\u3c13\u1522\u254e\ud05e\uf89a\u246b\u182b\u57a8\u7503\u4bf8"));
            return;
        }
        Yfkr.YT((Player)o.a(this, -1573496466), mrFx$WjFM.d("\u988d\u6eda\ucbcd\u19e9\u3948\uf7e1\u2cbc\ue905\ue86a\u426a\u438e\u750a\u1597\u5c7b\u9ac8\ucb7e\udfd7\u5bf5\uf990\u9425\u7c18\u7699\u606d\u73e6\u74c0\uf936\ucf95\u7a09\u613b\u5c21\u327e\ud653\u3ead\u3507\u407e\u81e1\u8216\ub4fa\u3c17\u156c\u255e\ud018"));
    }

    public void disable() {
        o.v(this, -1048028817, false);
        ((Player)o.a(this, -1573496466)).getInventory().setItemInOffHand(null);
        Yfkr.YT(Yfkr.YT((JkaV)o.a((TEqA)o.k(911295720), 1104499257), (Player)o.a(this, -1573496466)), false);
        Yfkr.YT((feCR)o.a(this, -710780579));
        Yfkr.YT((Player)o.a(this, -1573496466), mrFx$WjFM.d("\ufc5d\u968e\u53ef\u1e31\u9476\u5b7d\uca1c\u293f\uaa82\u50da\u7383\u299e\u98c5\u8e6d\ub996\u28be"));
    }

    public void gEea() {
        o.v(this, -1048028817, false);
        ((Player)o.a(this, -1573496466)).getInventory().setItemInOffHand(null);
        Yfkr.YT((feCR)o.a(this, -710780579));
        Yfkr.YT((Player)o.a(this, -1573496466), mrFx$WjFM.d("\u7bbd\uc566\ucbaa\u5c96\u29d0\ua039\u78b0\uff15\ua642\ue829\uff92\ud584\u4234\ue300\u22fd\ub34b"));
    }

    public void qltY() {
        Object object;
        xqdv$yJLS xqdv$yJLS = new xqdv$yJLS();
        Object object2 = Yfkr.YT((feCR)o.a(this, 1425037664));
        while (object2.hasNext()) {
            object = (ogNr)object2.next();
            Yfkr.YT(xqdv$yJLS, Yfkr.YT(object), Yfkr.YT(object));
        }
        o.v(this, 1705597293, Yfkr.YT(xqdv$yJLS));
        o.v(this, -1888396950, new CfoR(((Player)o.a(this, -1573496466)).getWorld()));
        Yfkr.YT((CfoR)o.a(this, -1888396950), (UstC)o.a(this, -119121559));
        o.v(this, 500783454, Yfkr.YT((CfoR)o.a(this, -1888396950)));
        object = Yfkr.YT((ItemStack)o.a(this, 500783454));
        object.setDisplayName((String)Yfkr.YT(Yfkr.YT(Yfkr.YT(Yfkr.YT(Yfkr.YT(new StringBuilder(), (psKX)((Object)o.k(-1118678018))), mrFx$WjFM.d("\u322b\ucd9e\uaff9\uffba\ucd2b\u7818")), (psKX)((Object)o.k(-857517477))), mrFx$WjFM.d("\u3234\ucd9a\uafe8"))));
        object.setLore((List)Yfkr.YT(new feCR(), Yfkr.YT(Yfkr.YT(Yfkr.YT(new StringBuilder(), (psKX)((Object)o.k(-1868409976))), mrFx$WjFM.d("\u322a\ucd98\uafea\uffb6\ucd33\u7854\uf8b1\u1955\ua5a2\uc58f\u3399\ua6a0\u1130\ua3b2\u17f9\ub7f5\u91f6\ub2be\u7762\uedb9\udd7f\ude72\ubc38\u7df2\u0e1b\ub870\u5ccb\u0456\u2e37\u18ea\u5aea\uf998\ufecb\u4d22\u519e\u1944\u1eea\u7955\u58e0\u8137\uf54a")))));
        Yfkr.YT((ItemStack)o.a(this, 500783454), object);
        Yfkr.YT((ItemStack)o.a(this, 500783454), (Enchantment)o.k(1425103206), 1338);
    }

    static /* synthetic */ boolean yJLS(Yfkr yfkr) {
        return (Boolean)o.a(yfkr, -1048028817);
    }

    static /* synthetic */ feCR UtIU(Yfkr yfkr) {
        return (feCR)o.a(yfkr, -710780579);
    }

    static /* synthetic */ boolean biLo(Yfkr yfkr) {
        return (Boolean)o.a(yfkr, 25319780);
    }

    static /* synthetic */ void yJLS(Yfkr yfkr, boolean bl) {
        o.v(yfkr, 25319780, bl);
    }

    static /* synthetic */ int VwLY(Yfkr yfkr) {
        return (Integer)o.a(yfkr, -1938269845);
    }

    static /* synthetic */ void yJLS(Yfkr yfkr, int n) {
        o.v(yfkr, -1938269845, n);
    }

    static /* synthetic */ xqdv TEqA(Yfkr yfkr) {
        return (xqdv)o.a(yfkr, 1705597293);
    }

    private static Object YT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

