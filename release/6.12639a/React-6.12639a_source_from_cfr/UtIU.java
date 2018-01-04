/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.block.BlockState
 *  org.bukkit.block.Hopper
 *  org.bukkit.command.CommandSender
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.plugin.Plugin
 *  org.spigotmc.SpigotWorldConfig
 *  org.spigotmc.TickLimiter
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Hopper;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.spigotmc.SpigotWorldConfig;
import org.spigotmc.TickLimiter;

public class UtIU {
    private static TNku<String, Integer> dDgX;
    private static /* synthetic */ int[] aoCB;

    static {
        o.w(941708975, new TNku());
    }

    public static void yJLS(Rapb rapb, XAcv<Integer> xAcv, XAcv<Double> xAcv2) {
        new UtIU$1(rapb, xAcv2, xAcv);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Player yJLS(Chunk chunk) {
        if (chunk.isLoaded()) {
            Entity entity = chunk.getEntities();
            int n = entity.length;
            Object object = 0;
            while (object < n) {
                Entity entity2 = entity[object];
                if (entity2 instanceof Player) {
                    return (Player)entity2;
                }
                ++object;
            }
            int n2 = 1;
            while (n2 < UtIU.CL() + true) {
                Object object2 = UtIU.CL(UtIU.CL(chunk, n2 + 1));
                while (object2.hasNext()) {
                    Chunk chunk2 = (Chunk)object2.next();
                    object = (Object)chunk2;
                    Entity[] arrentity = chunk2.getEntities();
                    int n3 = arrentity.length;
                    int n4 = 0;
                    while (n4 < n3) {
                        entity = arrentity[n4];
                        if (entity instanceof Player) {
                            return (Player)entity;
                        }
                        ++n4;
                    }
                }
                ++n2;
            }
        }
        return null;
    }

    public static int TEqA() {
        return (int)((Object)UtIU.CL((UtIU.CL() << 1) + true, 2.0));
    }

    public static int KTiK() {
        return UtIU.TEqA() * (UtIU.CL().size() + 1);
    }

    public static boolean GPlk() {
        if (UtIU.CL().getPlugin(nJPf$sILv.G("\u6333\u6079\u5e59\u63af\ue88e\ub9a6\u7390\uba6c\uc5f9\u7d1a\u7a2c\u9b26\u5f12\u4960\ud1f6\ub12d\ue398\u6cdd")) != null) {
            return true;
        }
        return false;
    }

    public static void biLo(World world) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        Object object = UtIU.CL(nJPf$sILv.G("\u2c1c\u3554\u87fd\u2ffb\u9a84\u2357\uc323\u9eda\udb4c\u9c9b"));
        Object object2 = UtIU.CL(UtIU.CL(object, nJPf$sILv.G("\u2c38\u3543\u87e8\u2fd5\u9a91\u236e\uc328\u9ec4\udb45"), new Class[0]), world, new Object[0]);
        Field field = UtIU.yJLS(object2, nJPf$sILv.G("\u2c3a\u3548\u87e8\u2ff4\u9a84\u2379\uc300\u9ec1\udb4d\u9c96\u7e11\u9ca3\ubb05"));
        UtIU.CL(field, true);
        TickLimiter tickLimiter = (TickLimiter)UtIU.CL(field, object2);
        Object object3 = UtIU.CL(UtIU.CL(tickLimiter), nJPf$sILv.G("\u2c32\u3547\u87e4\u2fc9\u9a99\u236d\uc329"));
        UtIU.CL(object3, true);
        Object object4 = UtIU.CL((Integer)UtIU.CL(object3, tickLimiter));
        if (object4 > true) {
            if (UtIU.CL(tickLimiter) != false) {
                UtIU.yJLS(world, (int)(object4 - true));
            }
        }
        if ((Long)o.k(-619556004) % 40 == 0 && object4 < 50) {
            if (UtIU.CL(tickLimiter) == false) {
                UtIU.yJLS(world, (int)(object4 + true));
            }
        }
    }

    public static void VwLY(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        if (UtIU.CL((TNku)o.k(941708975), UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(world.getName())), FMkR$WjFM.a("\u84c4\u7406\u6cc9\ucb1a\u36cd\uf59f\u9611\u5704\u28f8\ub40b\uab19\u6c77\u76f6\u5e7a")))) != false) {
            UtIU.yJLS(world, (int)UtIU.CL((Integer)UtIU.CL((TNku)o.k(941708975), UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(world.getName())), FMkR$WjFM.a("\u84c4\u7406\u6cc9\ucb1a\u36cd\uf59f\u9611\u5704\u28f8\ub40b\uab19\u6c77\u76f6\u5e7a"))))));
        }
    }

    public static int TEqA(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        return (Integer)o.a((Object)UtIU.GPlk(world), -1046653267);
    }

    public static int KTiK(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        return (Integer)o.a((Object)UtIU.GPlk(world), -1993124180);
    }

    public static void yJLS(World world, int n) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        SpigotWorldConfig spigotWorldConfig = UtIU.GPlk(world);
        if (UtIU.CL((TNku)o.k(941708975), UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(world.getName())), FMkR$WjFM.a("\u6663\uf373\u8acc\u6b45\u687b\u6224\u18b0\u9440\u95af\ud7b3\ub278\u1d3d\u4bcf\ubd8a")))) == false) {
            UtIU.CL((TNku)o.k(941708975), UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(world.getName())), FMkR$WjFM.a("\u6663\uf373\u8acc\u6b45\u687b\u6224\u18b0\u9440\u95af\ud7b3\ub278\u1d3d\u4bcf\ubd8a"))), UtIU.CL(UtIU.TEqA(world)));
        }
        o.v((Object)spigotWorldConfig, -1046653267, n);
        UtIU.yJLS(spigotWorldConfig, FMkR$WjFM.a("\u6623\uf377\u8ada\u6b1c\u6866\u6239\u18aa\u9446\u95e3\ud7bf\ub265\u1d39\u4bc9\ubdcf\ud746\uef39\u086f\u6d08\u51e1\u254b"), UtIU.CL(n));
        Object object = UtIU.CL(FMkR$WjFM.a("\u660d\uf364\u8ac3\u6b57\u6866\u6207\u18a6\u945f\u95a2\ud7af"));
        Object object2 = UtIU.CL(UtIU.CL(object, FMkR$WjFM.a("\u6629\uf373\u8ad6\u6b79\u6873\u623e\u18ad\u9441\u95ab"), new Class[0]), world, new Object[0]);
        Field field = UtIU.yJLS(object2, FMkR$WjFM.a("\u662b\uf378\u8ad6\u6b58\u6866\u6229\u1885\u9444\u95a3\ud7a2\ub278\u1d31\u4bde"));
        if (field != null) {
            UtIU.CL(field, true);
            UtIU.CL(field, object2, new TickLimiter(n));
        }
    }

    public static Field yJLS(Object object, String string) {
        Object object2;
        Object object3 = object2 = UtIU.CL(object);
        while (object3 != null) {
            try {
                Object object4 = UtIU.CL(object3, string);
                return object4;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                object3 = UtIU.CL(object3);
            }
        }
        return null;
    }

    public static void yJLS(SpigotWorldConfig spigotWorldConfig, String string, Object object) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        Object object2 = UtIU.CL(UtIU.CL(spigotWorldConfig), nJPf$sILv.G("\u22a0\ubd3a\u9162\u2f60\u6a74\uaabc"));
        UtIU.CL(object2, true);
        YamlConfiguration yamlConfiguration = (YamlConfiguration)UtIU.CL(object2, spigotWorldConfig);
        UtIU.CL(yamlConfiguration, UtIU.CL(UtIU.CL(new StringBuilder(nJPf$sILv.G("\u22b4\ubd3a\u917e\u2f6a\u6a79\uaaf6\u1a3f\uc366\ubd8f\uab73\ub85b\u69e6\ua507\u25c7\ud8a9\u9067\uc775\ued1e\u761b\uc4a4\u0cfd\u82f5\u0fe8")), string)), object);
    }

    public static int yJLS(World world, IEpg iEpg) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        switch (UtIU.ktHX()[UtIU.CL(iEpg)]) {
            case 1: {
                return (Integer)o.a((Object)UtIU.GPlk(world), -384018759);
            }
            case 3: {
                return (Integer)o.a((Object)UtIU.GPlk(world), 1052923576);
            }
            case 2: {
                return (Integer)o.a((Object)UtIU.GPlk(world), -227060041);
            }
        }
        return -1;
    }

    public static void UtIU(World world, IEpg iEpg) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        if (UtIU.CL((TNku)o.k(941708975), UtIU.CL(UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(world.getName())), mrFx$WjFM.d("\u722c")), UtIU.CL(iEpg)))) != false) {
            UtIU.yJLS(world, iEpg, (int)UtIU.CL((Integer)UtIU.CL((TNku)o.k(941708975), UtIU.CL(UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(world.getName())), mrFx$WjFM.d("\u722c")), UtIU.CL(iEpg))))));
        }
    }

    public static void yJLS(World world, IEpg iEpg, int n) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        SpigotWorldConfig spigotWorldConfig = UtIU.GPlk(world);
        if (UtIU.CL((TNku)o.k(941708975), UtIU.CL(UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(world.getName())), nJPf$sILv.G("\u22ee")), UtIU.CL(iEpg)))) == false) {
            UtIU.CL((TNku)o.k(941708975), UtIU.CL(UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(world.getName())), nJPf$sILv.G("\u22ee")), UtIU.CL(iEpg))), UtIU.CL(UtIU.yJLS(world, iEpg)));
        }
        switch (UtIU.ktHX()[UtIU.CL(iEpg)]) {
            case 1: {
                o.v((Object)spigotWorldConfig, -384018759, n);
            }
            case 3: {
                o.v((Object)spigotWorldConfig, 1052923576, n);
            }
            case 2: {
                o.v((Object)spigotWorldConfig, -227060041, n);
            }
        }
    }

    public static SpigotWorldConfig GPlk(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
        Object object = UtIU.CL(nJPf$sILv.G("\u6336\u606a\u5e4b\u63bd\ue8bb\ub982\u7386\uba70\uc5f6\u7d29"));
        Object object2 = UtIU.CL(UtIU.CL(object, nJPf$sILv.G("\u6312\u607d\u5e5e\u6393\ue8ae\ub9bb\u738d\uba6e\uc5ff"), new Class[0]), world, new Object[0]);
        SpigotWorldConfig spigotWorldConfig = (SpigotWorldConfig)UtIU.CL(UtIU.CL(UtIU.CL(object2), nJPf$sILv.G("\u6306\u6068\u5e43\u63bc\ue8a0\ub9a1\u73aa\uba6d\uc5f4\u7d2b\u7a2a\u9b33")), object2);
        return spigotWorldConfig;
    }

    public static String yJLS(CommandSender commandSender, String string) {
        Object object = UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(UtIU.CL((psKX)((Object)o.k(-1118678018)), (psKX)((Object)o.k(1251758875)), (psKX)((Object)o.k(-23312902)), (String)o.k(-426092876)))), string));
        commandSender.sendMessage((String)object);
        return object;
    }

    public static String UtIU(CommandSender commandSender, String string) {
        Object object = UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(UtIU.CL((psKX)((Object)o.k(-1118678018)), (psKX)((Object)o.k(1251758875)), (psKX)((Object)o.k(-23312902)), nJPf$sILv.G("\u8fa8\u9e01\u87b2")))), string));
        commandSender.sendMessage((String)object);
        return object;
    }

    public static String biLo(CommandSender commandSender, String string) {
        return UtIU.yJLS(commandSender, (String)UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(new StringBuilder(), (psKX)((Object)o.k(-1868409976))), nJPf$sILv.G("\u0b4b\u3506")), (psKX)((Object)o.k(-23312902))), string)));
    }

    public static String VwLY(CommandSender commandSender, String string) {
        return UtIU.yJLS(commandSender, (String)UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(new StringBuilder(), (psKX)((Object)o.k(568215020))), nJPf$sILv.G("\ud13f\u627c")), (psKX)((Object)o.k(-23312902))), string)));
    }

    public static String TEqA(CommandSender commandSender, String string) {
        return UtIU.yJLS(commandSender, (String)UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(new StringBuilder(), (psKX)((Object)o.k(1742689159))), nJPf$sILv.G("\u0731\u4fb0")), (psKX)((Object)o.k(-23312902))), string)));
    }

    public static boolean unloadChunk(Chunk chunk) {
        block3 : {
            try {
                if (((Boolean)o.a(UtIU.CL(chunk.getWorld()), 1208173758)).booleanValue()) break block3;
                return false;
            }
            catch (Exception exception) {
                UtIU.CL(UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(UtIU.CL(FMkR$WjFM.a("\uceef\ud61d\uffeb\u8825\u62da\u823d\u80f9\u22d9\u08e6\u41b7\ufb69\udf57\ufe74\u13be\ub2a6\u10fc\u7e54\ud83c\uc8ea\ubeec\u37c6\ua204\uae75\u5b21\u698f")))), UtIU.CL(exception))));
                return false;
            }
        }
        return chunk.unload();
    }

    public static void yJLS(World world, int n, int n2) {
        if (!((Boolean)o.a(UtIU.CL(world), 1208173758)).booleanValue()) {
            return;
        }
        world.unloadChunk(n, n2);
    }

    private static void yJLS(Entity entity) {
        if (entity instanceof Player) {
            return;
        }
        if (((List)o.a(UtIU.CL(entity.getWorld()), 2083804833)).contains(UtIU.CL(entity.getType()))) {
            return;
        }
        entity.remove();
    }

    public static void UtIU(Entity entity) {
        if (((List)o.a(UtIU.CL(entity.getWorld()), 2083804833)).contains(UtIU.CL(entity.getType()))) {
            return;
        }
        if (UtIU.CL((feCR)o.k(-659793699), UtIU.CL(entity.getType())) == false) {
            return;
        }
        UtIU.yJLS(entity);
    }

    public static void biLo(Entity entity) {
        if (((List)o.a(UtIU.CL(entity.getWorld()), 2083804833)).contains(UtIU.CL(entity.getType()))) {
            return;
        }
        if (UtIU.CL((feCR)o.k(1147164894), UtIU.CL(entity.getType())) == false) {
            return;
        }
        UtIU.yJLS(entity);
    }

    public static void VwLY(Entity entity) {
        if (((List)o.a(UtIU.CL(entity.getWorld()), 2083804833)).contains(UtIU.CL(entity.getType()))) {
            return;
        }
        if (UtIU.CL((feCR)o.k(-1308600100), UtIU.CL(entity.getType())) == false) {
            return;
        }
        UtIU.yJLS(entity);
    }

    public static void yJLS(Block block) {
        ItemStack[] arritemStack = null;
        if (block.getState() instanceof Hopper) {
            arritemStack = ((Hopper)block.getState()).getInventory().getContents();
            ((Hopper)block.getState()).getInventory().clear();
        }
        int n = block.getTypeId();
        byte by = block.getData();
        block.setTypeIdAndData(1, 0, false);
        block.setTypeIdAndData(n, by, true);
        if (block.getState() instanceof Hopper) {
            ((Hopper)block.getState()).getInventory().setContents(arritemStack);
        }
    }

    public static String yJLS(String string, psKX psKX2) {
        int n = 48;
        reference var3_3 = UtIU.CL(string) + 2;
        int n2 = (48 - var3_3) / 2;
        return UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(UtIU.CL(new StringBuilder((String)UtIU.CL(UtIU.CL(psKX2, n2))), (psKX)((Object)o.k(692209039))), nJPf$sILv.G("\u22e3")), string), nJPf$sILv.G("\u22e3")), (psKX)((Object)o.k(692209039))), UtIU.CL(psKX2, n2)));
    }

    public static String yJLS(psKX psKX2) {
        return UtIU.CL(psKX2, 48);
    }

    public static void UtIU(Block block) {
        int n = block.getTypeId();
        byte by = block.getData();
        block.setTypeIdAndData(block.getTypeId(), 0, false);
        block.setTypeIdAndData(n, by, true);
    }

    static /* synthetic */ int[] ktHX() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(2136692382);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((IEpg[])UtIU.CL()).length];
        try {
            arrn[UtIU.CL((IEpg)o.k((int)1538213157))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[UtIU.CL((IEpg)o.k((int)1098466595))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[UtIU.CL((IEpg)o.k((int)-281656028))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(2136692382, arrn3);
        return arrn3;
    }

    private static Object CL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

