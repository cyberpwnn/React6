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

public class kQxI {
    public static boolean Jbjx(String string) {
        if (kQxI.getPlayer(string) != null) {
            return true;
        }
        return false;
    }

    public static Player getPlayer(String string) {
        return kQxI.zp(string);
    }

    public static Player cJgR() {
        if (kQxI.zp(kQxI.vImB()) != false) {
            return null;
        }
        return (Player)kQxI.zp(kQxI.vImB());
    }

    public static boolean rpeR() {
        if (kQxI.zp().isEmpty()) {
            return false;
        }
        return true;
    }

    public static feCR<Player> bhkI(World world) {
        return new feCR<Player>(world.getPlayers());
    }

    public static feCR<Player> CoVI(Chunk chunk) {
        return new feCR<Player>((List<Player>)kQxI.zp(new kQxI$1(), new feCR<Entity>((T[])chunk.getEntities())));
    }

    public static feCR<Player> yJLS(Location location, double d) {
        return new feCR<Player>((T[])((Player[])kQxI.zp(new fvLG(location, (Double)kQxI.zp(d)))));
    }

    public static feCR<Player> yJLS(Location location, int n) {
        return new feCR<Player>((T[])((Player[])kQxI.zp(new fvLG(location, (Integer)kQxI.zp(n)))));
    }

    public static void Dqxl(Player player) {
        kQxI.zp(kQxI.zp(kQxI.zp((wMJq)((Object)o.k(550191113)), 500), 1024), player);
    }

    public static void MSAa(Player player) {
        kQxI.zp(kQxI.zp(kQxI.zp((wMJq)((Object)o.k(550191113)), 500), 20), player);
    }

    public static Location yJLS(Player player, int n) {
        return kQxI.zp(kQxI.zp(player.getTargetBlock(null, n).getLocation()), 0.5, 0.5, 0.5);
    }

    public static Entity UtIU(Player player, int n) {
        return kQxI.yJLS(player, (double)n, 1.0);
    }

    public static boolean JIWX(Player player) {
        InventoryView inventoryView = player.getOpenInventory();
        if (inventoryView != null) {
            if (kQxI.zp(inventoryView) != (InventoryType)o.k(-435470331)) {
                return true;
            }
        }
        return false;
    }

    public static Entity yJLS(Player player, double d, double d2) {
        if (d2 < 1.0) {
            d2 = 1.0;
        }
        if (d < 1.0) {
            d = 1.0;
        }
        Object object = kQxI.zp(d2);
        Entity[] arrentity = new Entity[1];
        kQxI.zp(new kQxI$2((Location)kQxI.zp(kQxI.zp(player.getLocation()), 0.5, 1.5, 0.5), (Vector)kQxI.zp(player.getLocation()), (Double)kQxI.zp(d), (Double)kQxI.zp(1.0), (Double)object, player, arrentity));
        return arrentity[0];
    }

    public static int jxvf(Player player) {
        try {
            Object object = kQxI.zp(FMkR$WjFM.a("\u3bd6\u2377\u088c\ub722\ua3f2\ud551\u76be\ubf4a\u7663\u2ba2\u5e10\u93ca\uc369\ua744\u06d2\u92f6\uca9c\uf6e7\uc027\u14cd\ub326\u969e\u9d4f\u7dd9\u3ee5\u5ee4\uf2b7\u8881\udb52\uf033\u4159\u8fbd\ub4fa\u71dd\uc291\u2043\u48f9\u4d95\u87d3\ua85b\ua6c6\u456a\u88be\uf90b\ua88d"));
            return (int)kQxI.zp((Integer)kQxI.zp(kQxI.zp(object, FMkR$WjFM.a("\u3bd2\u237d\u0895\ub758\ua3f8\ud544\u76ad\ubf52\u764e\u2be8\u5e0d\u93ca\uc335\ua748\u06c4\u92eb\uca9a\uf6ec"), new Class[]{Player.class}), null, new Object[]{player}));
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public static void biLo(Player player, int n) {
        try {
            Object object = kQxI.zp(mrFx$WjFM.d("\ubfb9\u2817\u4271\u2e19\ucd82\u357d\u7610\u4ce6\u9228\u1a54\ub592\u1209\ube37\u191e\ub05b\ue695\udfea\ubcfe\uba93\ubb05\uf452\ued71\ude70\u07f9\u521b\ub707\ua02b\u37ab\u517a\u3fb3\u51b0\u63a6\uebee\ube2d\u3094\u3236\u570b\u4200\u70fe\u6707\u6b16\ue913\u2791\ua4e1\u402a"));
            Object[] arrobject = new Object[2];
            arrobject[0] = player;
            arrobject[1] = kQxI.zp(n);
            kQxI.zp(kQxI.zp(object, mrFx$WjFM.d("\ubfa9\u281d\u4268\u2e63\ucd88\u3568\u7603\u4cfe\u9205\u1a1e\ub58f\u1209\ube6b\u1912\ub04d\ue688\udfec\ubcf5"), new Class[]{Player.class, (Class)o.k(836130996)}), null, arrobject);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean ktLW(String string) {
        if (kQxI.XIpm(string) == null) {
            return false;
        }
        return true;
    }

    public static Player XIpm(String string) {
        Player player;
        Object object = kQxI.zp(kQxI.vImB());
        while (object.hasNext()) {
            player = (Player)object.next();
            if (kQxI.zp(player.getName(), string) == false) continue;
            return player;
        }
        object = kQxI.zp(kQxI.vImB());
        while (object.hasNext()) {
            player = (Player)object.next();
            if (kQxI.zp(kQxI.zp(player.getName()), kQxI.zp(string)) == false) continue;
            return player;
        }
        return null;
    }

    public static feCR<Player> vImB() {
        feCR<Player> feCR2 = new feCR<Player>();
        Iterator iterator = kQxI.zp().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            kQxI.zp(feCR2, player);
        }
        return feCR2;
    }

    public static Location GkCK(Player player) {
        return kQxI.zp(kQxI.zp(player.getLocation(), 0.0, 0.899, 0.0), kQxI.zp(kQxI.zp(kQxI.zp(player.getLocation()), false), 0.1));
    }

    public static void Ywen(Player player) {
        kQxI.hanW(player);
        kQxI.erXb(player);
        kQxI.XRaB(player);
    }

    public static void UAGQ(Player player) {
        Object object = kQxI.zp(new feCR(player.getActivePotionEffects()));
        while (object.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)object.next();
            player.removePotionEffect((PotionEffectType)kQxI.zp(potionEffect));
        }
    }

    public static void yJLS(Player player, double d) {
        player.setHealth(player.getHealth() + d > player.getMaxHealth() ? player.getMaxHealth() : player.getHealth() + d);
    }

    public static void XRaB(Player player) {
        player.setHealth(player.getHealth());
    }

    public static void hanW(Player player) {
        player.setMaxHealth(20.0);
    }

    public static void erXb(Player player) {
        player.setFoodLevel(20);
    }

    public static void STSP(Player player) {
        player.setHealth(0.0);
    }

    public static GYte OPWR(Player player) {
        return new GYte(kQxI.GkCK(player), new Vector(0.7, 1.8, 0.7));
    }

    public static Location ivSs(Player player) {
        return kQxI.yJLS(player, 0.0f, 0.0f);
    }

    public static Location yJLS(Player player, float f, float f2) {
        Location location = player.getEyeLocation();
        Location location2 = player.getEyeLocation();
        Object object = kQxI.zp(kQxI.zp(player.getLocation()) + 50.0f + f);
        Object object2 = kQxI.zp(kQxI.zp(player.getLocation()) + f2);
        kQxI.zp(location2, kQxI.zp(object));
        kQxI.zp(location2, kQxI.zp(object2));
        kQxI.zp(location, kQxI.zp(location2));
        return location;
    }

    private static Object zp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

