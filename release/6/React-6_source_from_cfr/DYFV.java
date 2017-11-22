/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class DYFV {
    public static String ssNb(CommandSender commandSender, String string) {
        Object object = DYFV.hz(DYFV.hz(new StringBuilder((String)DYFV.hz(DYFV.hz((APKB)((Object)cv.e(1197215955)), (APKB)((Object)cv.e(416543530)), (APKB)((Object)cv.e(-1071443542)), (String)cv.e(-1155664629)))), string));
        commandSender.sendMessage((String)object);
        return object;
    }

    public static String DYFV(CommandSender commandSender, String string) {
        Object object = DYFV.hz(DYFV.hz(new StringBuilder((String)DYFV.hz(DYFV.hz((APKB)((Object)cv.e(1197215955)), (APKB)((Object)cv.e(416543530)), (APKB)((Object)cv.e(-1071443542)), rgig$AWxc.r("\ua734\uca59\uba91")))), string));
        commandSender.sendMessage((String)object);
        return object;
    }

    public static String IWSm(CommandSender commandSender, String string) {
        return DYFV.ssNb(commandSender, (String)DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(new StringBuilder(), (APKB)((Object)cv.e(1489703379))), KUXS$dwji.S("\ucfa6\u2df8")), (APKB)((Object)cv.e(-1071443542))), string)));
    }

    public static String OXeK(CommandSender commandSender, String string) {
        return DYFV.ssNb(commandSender, (String)DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(new StringBuilder(), (APKB)((Object)cv.e(-314502936))), YEBy$TyVf.W("\u8522\u1cb7")), (APKB)((Object)cv.e(-1071443542))), string)));
    }

    public static String YoSa(CommandSender commandSender, String string) {
        return DYFV.ssNb(commandSender, (String)DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(new StringBuilder(), (APKB)((Object)cv.e(-1207700747))), YEBy$TyVf.W("\ufc75\u0d31")), (APKB)((Object)cv.e(-1071443542))), string)));
    }

    public static void ssNb(Chunk chunk) {
        chunk.unload();
    }

    public static void ssNb(World world, int n, int n2) {
        world.unloadChunk(n, n2);
    }

    private static void ssNb(Entity entity) {
        if (entity instanceof Player) {
            return;
        }
        entity.remove();
    }

    public static void DYFV(Entity entity) {
        if (DYFV.hz((wfPa)cv.e(1630343509), DYFV.hz(entity.getType())) == false) {
            return;
        }
        DYFV.ssNb(entity);
    }

    public static void IWSm(Entity entity) {
        if (DYFV.hz((wfPa)cv.e(2070942058), DYFV.hz(entity.getType())) == false) {
            return;
        }
        DYFV.ssNb(entity);
    }

    public static void OXeK(Entity entity) {
        if (DYFV.hz((wfPa)cv.e(-163770028), DYFV.hz(entity.getType())) == false) {
            return;
        }
        DYFV.ssNb(entity);
    }

    public static void YoSa(Entity entity) {
        if (entity instanceof Player) {
            return;
        }
        if (DYFV.hz((wfPa)cv.e(-163770028), DYFV.hz(entity.getType())) == false) {
            return;
        }
        DYFV.hz((tCRu)cv.b((YoSa)cv.e(239341894), 94958327), entity);
    }

    public static int DYFV(Chunk chunk) {
        return (int)DYFV.hz((tCRu)cv.b((YoSa)cv.e(239341894), 94958327), chunk);
    }

    public static void ssNb(Block block) {
        int n = block.getTypeId();
        byte by = block.getData();
        block.setTypeIdAndData(1, 0, false);
        block.setTypeIdAndData(n, by, true);
    }

    public static String ssNb(String string, APKB aPKB) {
        int n = 48;
        reference var3_3 = DYFV.hz(string) + 2;
        int n2 = (48 - var3_3) / 2;
        return DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(DYFV.hz(new StringBuilder((String)DYFV.hz(DYFV.hz(aPKB, n2))), (APKB)((Object)cv.e(1712131958))), rgig$AWxc.r("\u2783")), string), rgig$AWxc.r("\u2783")), (APKB)((Object)cv.e(1712131958))), DYFV.hz(aPKB, n2)));
    }

    public static String ssNb(APKB aPKB) {
        return DYFV.hz(aPKB, 48);
    }

    private static Object hz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

