/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.inventory.InventoryType
 *  org.bukkit.inventory.InventoryView
 *  org.bukkit.potion.PotionEffect
 *  org.bukkit.potion.PotionEffectType
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryView;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class UIbl {
    public static boolean KCiG(String string) {
        if (UIbl.getPlayer(string) != null) {
            return true;
        }
        return false;
    }

    public static Player getPlayer(String string) {
        return UIbl.Zv(string);
    }

    public static Player RkTB() {
        if (UIbl.Zv(UIbl.MctC()) != false) {
            return null;
        }
        return (Player)UIbl.Zv(UIbl.MctC());
    }

    public static boolean YUuA() {
        if (UIbl.Zv().isEmpty()) {
            return false;
        }
        return true;
    }

    public static wfPa<Player> YoSa(World world) {
        return new wfPa<Player>(world.getPlayers());
    }

    public static wfPa<Player> hHYn(Chunk chunk) {
        return new wfPa<Player>((List<Player>)UIbl.Zv(new UIbl$1(), new wfPa<Entity>((T[])chunk.getEntities())));
    }

    public static wfPa<Player> ssNb(Location location, double d) {
        return new wfPa<Player>((T[])((Player[])UIbl.Zv(new gVhV(location, (Double)UIbl.Zv(d)))));
    }

    public static wfPa<Player> ssNb(Location location, int n) {
        return new wfPa<Player>((T[])((Player[])UIbl.Zv(new gVhV(location, (Integer)UIbl.Zv(n)))));
    }

    public static void kQcX(Player player) {
        UIbl.Zv(UIbl.Zv(UIbl.Zv((hQYY)((Object)cv.e(-289867829)), 500), 1024), player);
    }

    public static void rMgK(Player player) {
        UIbl.Zv(UIbl.Zv(UIbl.Zv((hQYY)((Object)cv.e(-289867829)), 500), 20), player);
    }

    public static Location ssNb(Player player, int n) {
        return UIbl.Zv(UIbl.Zv(player.getTargetBlock(null, n).getLocation()), 0.5, 0.5, 0.5);
    }

    public static Entity DYFV(Player player, int n) {
        return UIbl.ssNb(player, (double)n, 1.0);
    }

    public static boolean cIji(Player player) {
        InventoryView inventoryView = player.getOpenInventory();
        if (inventoryView != null) {
            if (UIbl.Zv(inventoryView) != (InventoryType)cv.e(-1018824783)) {
                return true;
            }
        }
        return false;
    }

    public static Entity ssNb(Player player, double d, double d2) {
        if (d2 < 1.0) {
            d2 = 1.0;
        }
        if (d < 1.0) {
            d = 1.0;
        }
        Object object = UIbl.Zv(d2);
        Entity[] arrentity = new Entity[1];
        UIbl.Zv(new UIbl$2((Location)UIbl.Zv(UIbl.Zv(player.getLocation()), 0.5, 1.5, 0.5), (Vector)UIbl.Zv(player.getLocation()), (Double)UIbl.Zv(d), (Double)UIbl.Zv(1.0), (Double)object, player, arrentity));
        return arrentity[0];
    }

    public static int Cnru(Player player) {
        try {
            Object object = UIbl.Zv(rgig$AWxc.r("\uad2c\uef22\u48bf\u8dcc\u62f0\u76e7\u354a\udb9e\u8c7c\ue9c0\uab56\u35d0\ub074\u62a1\u412d\u9986\u8028\u104e\u012e\ud3dd\u89e5\uacea\u9c3d\ubaaa\u5668\u66c5\ubb1a\u75ce\ucc6f\ue0a5\ufc28\u52d6\u5a28\ubb4c\u24cc\u06b8\u351a\u01e4\u5591\u3e63\u6186\u699b\ufdb7\u7288\u371a"));
            return (int)UIbl.Zv((Integer)UIbl.Zv(UIbl.Zv(object, rgig$AWxc.r("\uad28\uef28\u48a6\u8db6\u62fa\u76f2\u3559\udb86\u8c51\ue98a\uab4b\u35d0\ub028\u62ad\u413b\u999b\u802e\u1045"), new Class[]{Player.class}), null, new Object[]{player}));
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public static void IWSm(Player player, int n) {
        try {
            Object object = UIbl.Zv(KUXS$dwji.S("\u920d\u6b64\u37d2\u7052\u4d31\u5dd7\u2ae2\u4506\u2902\ucb36\u4c88\u9cf8\ud7b0\u23b4\ua9c7\u8a7c\uafd0\ud1d1\u10ec\u6316\ub8b4\u71d5\uf564\u79dd\u34f1\u2bcd\u230c\uc748\u6526\u44c8\u647f\u4f6a\u9d93\u8280\u6ad3\ud2b8\uf2ba\u78a5\u1ded\u7109\u7af8\ua3f4\u15fb\ud3d0\uf098"));
            Object[] arrobject = new Object[2];
            arrobject[0] = player;
            arrobject[1] = UIbl.Zv(n);
            UIbl.Zv(UIbl.Zv(object, KUXS$dwji.S("\u921d\u6b6e\u37cb\u7028\u4d3b\u5dc2\u2af1\u451e\u292f\ucb7c\u4c95\u9cf8\ud7ec\u23b8\ua9d1\u8a61\uafd6\ud1da"), new Class[]{Player.class, (Class)cv.e(1035866500)}), null, arrobject);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean tdpC(String string) {
        if (UIbl.PBWX(string) == null) {
            return false;
        }
        return true;
    }

    public static Player PBWX(String string) {
        Player player;
        Object object = UIbl.Zv(UIbl.MctC());
        while (object.hasNext()) {
            player = (Player)object.next();
            if (UIbl.Zv(player.getName(), string) == false) continue;
            return player;
        }
        object = UIbl.Zv(UIbl.MctC());
        while (object.hasNext()) {
            player = (Player)object.next();
            if (UIbl.Zv(UIbl.Zv(player.getName()), UIbl.Zv(string)) == false) continue;
            return player;
        }
        return null;
    }

    public static wfPa<Player> MctC() {
        wfPa<Player> wfPa2 = new wfPa<Player>();
        Iterator iterator = UIbl.Zv().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            UIbl.Zv(wfPa2, player);
        }
        return wfPa2;
    }

    public static Location LWjo(Player player) {
        return UIbl.Zv(UIbl.Zv(player.getLocation(), 0.0, 0.899, 0.0), UIbl.Zv(UIbl.Zv(UIbl.Zv(player.getLocation()), false), 0.1));
    }

    public static void PuYf(Player player) {
        UIbl.NUdB(player);
        UIbl.OOtu(player);
        UIbl.LGKN(player);
    }

    public static void TNbD(Player player) {
        Object object = UIbl.Zv(new wfPa(player.getActivePotionEffects()));
        while (object.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)object.next();
            player.removePotionEffect((PotionEffectType)UIbl.Zv(potionEffect));
        }
    }

    public static void ssNb(Player player, double d) {
        player.setHealth(player.getHealth() + d > player.getMaxHealth() ? player.getMaxHealth() : player.getHealth() + d);
    }

    public static void LGKN(Player player) {
        player.setHealth(player.getHealth());
    }

    public static void NUdB(Player player) {
        player.setMaxHealth(20.0);
    }

    public static void OOtu(Player player) {
        player.setFoodLevel(20);
    }

    public static void aLYV(Player player) {
        player.setHealth(0.0);
    }

    public static LqnN Smci(Player player) {
        return new LqnN(UIbl.LWjo(player), new Vector(0.7, 1.8, 0.7));
    }

    public static Location oVCY(Player player) {
        return UIbl.ssNb(player, 0.0f, 0.0f);
    }

    public static Location ssNb(Player player, float f, float f2) {
        Location location = player.getEyeLocation();
        Location location2 = player.getEyeLocation();
        Object object = UIbl.Zv(UIbl.Zv(player.getLocation()) + 50.0f + f);
        Object object2 = UIbl.Zv(UIbl.Zv(player.getLocation()) + f2);
        UIbl.Zv(location2, UIbl.Zv(object));
        UIbl.Zv(location2, UIbl.Zv(object2));
        UIbl.Zv(location, UIbl.Zv(location2));
        return location;
    }

    private static Object Zv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

