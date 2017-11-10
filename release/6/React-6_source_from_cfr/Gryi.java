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

public class Gryi {
    public static boolean Lhol(String string) {
        if (Gryi.getPlayer(string) != null) {
            return true;
        }
        return false;
    }

    public static Player getPlayer(String string) {
        return Gryi.sO(string);
    }

    public static Player Xcpd() {
        if (Gryi.sO(Gryi.XuRe()) != false) {
            return null;
        }
        return (Player)Gryi.sO(Gryi.XuRe());
    }

    public static boolean tnRF() {
        if (Gryi.sO().isEmpty()) {
            return false;
        }
        return true;
    }

    public static PBUD<Player> qdWJ(World world) {
        return new PBUD<Player>(world.getPlayers());
    }

    public static PBUD<Player> qAsQ(Chunk chunk) {
        return new PBUD<Player>((List<Player>)Gryi.sO(new Gryi$1(), new PBUD<Entity>((T[])chunk.getEntities())));
    }

    public static PBUD<Player> mXJp(Location location, double d) {
        return new PBUD<Player>((T[])((Player[])Gryi.sO(new RIGg(location, (Double)Gryi.sO(d)))));
    }

    public static PBUD<Player> mXJp(Location location, int n) {
        return new PBUD<Player>((T[])((Player[])Gryi.sO(new RIGg(location, (Integer)Gryi.sO(n)))));
    }

    public static void SnAm(Player player) {
        Gryi.sO(Gryi.sO(Gryi.sO((KTsB)((Object)yy.p(-1370028678)), 500), 1024), player);
    }

    public static void SBla(Player player) {
        Gryi.sO(Gryi.sO(Gryi.sO((KTsB)((Object)yy.p(-1370028678)), 500), 20), player);
    }

    public static Location mXJp(Player player, int n) {
        return Gryi.sO(Gryi.sO(player.getTargetBlock(null, n).getLocation()), 0.5, 0.5, 0.5);
    }

    public static Entity ksfs(Player player, int n) {
        return Gryi.mXJp(player, (double)n, 1.0);
    }

    public static boolean gois(Player player) {
        InventoryView inventoryView = player.getOpenInventory();
        if (inventoryView != null) {
            if (Gryi.sO(inventoryView) != (InventoryType)yy.p(2012546372)) {
                return true;
            }
        }
        return false;
    }

    public static Entity mXJp(Player player, double d, double d2) {
        if (d2 < 1.0) {
            d2 = 1.0;
        }
        if (d < 1.0) {
            d = 1.0;
        }
        Object object = Gryi.sO(d2);
        Entity[] arrentity = new Entity[1];
        Gryi.sO(new Gryi$2((Location)Gryi.sO(Gryi.sO(player.getLocation()), 0.5, 1.5, 0.5), (Vector)Gryi.sO(player.getLocation()), (Double)Gryi.sO(d), (Double)Gryi.sO(1.0), (Double)object, player, arrentity));
        return arrentity[0];
    }

    public static int JjvV(Player player) {
        try {
            Object object = Gryi.sO(NVIs$JbpD.H("\u456c\u50e2\ua44f\u995d\u27c0\u85ef\uf1ae\uc743\ud4c0\ud22a\u4168\udd72\u4fe8\uf36a\ub7a3\ude11\uabfd\ufac5\uee82\u640d\uc739\ud528\u800e\ue0ae\uedc2\ufc83\u96f2\ud563\u2af1\u9d8a\u4463\u92b4\ucef5\u5c72\u7985\u96c2\ua626\udfbf\u53b8\u108f\uaa91\ucd59\uae1b\u93da\ua04c"));
            return (int)Gryi.sO((Integer)Gryi.sO(Gryi.sO(object, NVIs$JbpD.H("\u4568\u50e8\ua456\u9927\u27ca\u85fa\uf1bd\uc75b\ud4ed\ud260\u4175\udd72\u4fb4\uf366\ub7b5\ude0c\uabfb\uface"), new Class[]{Player.class}), null, new Object[]{player}));
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public static void yJLL(Player player, int n) {
        try {
            Object object = Gryi.sO(NVIs$JbpD.H("\u4b77\ueecf\ub7ba\u2171\u15da\ud20e\uf9c5\u84ac\u382d\u37fd\ufb04\u90aa\u304d\u011e\uf338\u2911\uc5af\uec03\u18db\ua5a3\uf344\u6dce\u3025\u4cc9\ud155\ua015\u570b\ucf3e\u1cd5\u1cc0\u1311\u6b8c\u04f1\udb55\ube28\ub61d\u685c\u19a5\ua1c4\u6570\uf7fe\u6836\u5e7f\u7444\u4b79"));
            Object[] arrobject = new Object[2];
            arrobject[0] = player;
            arrobject[1] = Gryi.sO(n);
            Gryi.sO(Gryi.sO(object, NVIs$JbpD.H("\u4b67\ueec5\ub7a3\u210b\u15d0\ud21b\uf9d6\u84b4\u3800\u37b7\ufb19\u90aa\u3011\u0112\uf32e\u290c\uc5a9\uec08"), new Class[]{Player.class, (Class)yy.p(-281088989)}), null, arrobject);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean LFmP(String string) {
        if (Gryi.SCOk(string) == null) {
            return false;
        }
        return true;
    }

    public static Player SCOk(String string) {
        Player player;
        Object object = Gryi.sO(Gryi.XuRe());
        while (object.hasNext()) {
            player = (Player)object.next();
            if (Gryi.sO(player.getName(), string) == false) continue;
            return player;
        }
        object = Gryi.sO(Gryi.XuRe());
        while (object.hasNext()) {
            player = (Player)object.next();
            if (Gryi.sO(Gryi.sO(player.getName()), Gryi.sO(string)) == false) continue;
            return player;
        }
        return null;
    }

    public static PBUD<Player> XuRe() {
        PBUD<Player> pBUD = new PBUD<Player>();
        Iterator iterator = Gryi.sO().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            Gryi.sO(pBUD, player);
        }
        return pBUD;
    }

    public static Location PBUD(Player player) {
        return Gryi.sO(Gryi.sO(player.getLocation(), 0.0, 0.899, 0.0), Gryi.sO(Gryi.sO(Gryi.sO(player.getLocation()), false), 0.1));
    }

    public static void ePQp(Player player) {
        Gryi.hGxw(player);
        Gryi.eYCP(player);
        Gryi.KDGY(player);
    }

    public static void aKuV(Player player) {
        Object object = Gryi.sO(new PBUD(player.getActivePotionEffects()));
        while (object.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)object.next();
            player.removePotionEffect((PotionEffectType)Gryi.sO(potionEffect));
        }
    }

    public static void mXJp(Player player, double d) {
        player.setHealth(player.getHealth() + d > player.getMaxHealth() ? player.getMaxHealth() : player.getHealth() + d);
    }

    public static void KDGY(Player player) {
        player.setHealth(player.getHealth());
    }

    public static void hGxw(Player player) {
        player.setMaxHealth(20.0);
    }

    public static void eYCP(Player player) {
        player.setFoodLevel(20);
    }

    public static void dMNe(Player player) {
        player.setHealth(0.0);
    }

    public static myxn jVod(Player player) {
        return new myxn(Gryi.PBUD(player), new Vector(0.7, 1.8, 0.7));
    }

    public static Location wnXH(Player player) {
        return Gryi.mXJp(player, 0.0f, 0.0f);
    }

    public static Location mXJp(Player player, float f, float f2) {
        Location location = player.getEyeLocation();
        Location location2 = player.getEyeLocation();
        Object object = Gryi.sO(Gryi.sO(player.getLocation()) + 50.0f + f);
        Object object2 = Gryi.sO(Gryi.sO(player.getLocation()) + f2);
        Gryi.sO(location2, Gryi.sO(object));
        Gryi.sO(location2, Gryi.sO(object2));
        Gryi.sO(location, Gryi.sO(location2));
        return location;
    }

    private static Object sO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

