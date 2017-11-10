/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.World
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
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class WXMo {
    public static String mXJp(CommandSender commandSender, String string) {
        Object object = WXMo.SH(WXMo.SH(WXMo.SH(new StringBuilder(), WXMo.SH((ydHl)((Object)yy.p(-1388378419)), (ydHl)((Object)yy.p(-20248912)), (ydHl)((Object)yy.p(-1912346475)), (String)yy.p(-71505778))), string));
        commandSender.sendMessage((String)object);
        return object;
    }

    public static String ksfs(CommandSender commandSender, String string) {
        return WXMo.mXJp(commandSender, (String)WXMo.SH(WXMo.SH(WXMo.SH(WXMo.SH(WXMo.SH(new StringBuilder(), (ydHl)((Object)yy.p(1274341524))), BkvY$LhxG.I("\u9e88\u24bc")), (ydHl)((Object)yy.p(-1912346475))), string)));
    }

    public static String yJLL(CommandSender commandSender, String string) {
        return WXMo.mXJp(commandSender, (String)WXMo.SH(WXMo.SH(WXMo.SH(WXMo.SH(WXMo.SH(new StringBuilder(), (ydHl)((Object)yy.p(-329382161))), NVIs$JbpD.H("\ue318\ubb0a")), (ydHl)((Object)yy.p(-1912346475))), string)));
    }

    public static String SnBs(CommandSender commandSender, String string) {
        return WXMo.mXJp(commandSender, (String)WXMo.SH(WXMo.SH(WXMo.SH(WXMo.SH(WXMo.SH(new StringBuilder(), (ydHl)((Object)yy.p(-278730615))), NVIs$JbpD.H("\u3b04\uca99")), (ydHl)((Object)yy.p(-1912346475))), string)));
    }

    public static void mXJp(Chunk chunk) {
        chunk.unload();
    }

    public static void mXJp(World world, int n, int n2) {
        world.unloadChunk(n, n2);
    }

    private static void mXJp(Entity entity) {
        if (entity instanceof Player) {
            return;
        }
        entity.remove();
    }

    public static void ksfs(Entity entity) {
        if (WXMo.SH((PBUD)yy.p(1882909766), WXMo.SH(entity.getType())) == false) {
            return;
        }
        WXMo.mXJp(entity);
    }

    public static void yJLL(Entity entity) {
        if (WXMo.SH((PBUD)yy.p(-1597838259), WXMo.SH(entity.getType())) == false) {
            return;
        }
        WXMo.mXJp(entity);
    }

    public static void SnBs(Entity entity) {
        if (WXMo.SH((PBUD)yy.p(1794042955), WXMo.SH(entity.getType())) == false) {
            return;
        }
        WXMo.mXJp(entity);
    }

    public static void qdWJ(Entity entity) {
        if (entity instanceof Player) {
            return;
        }
        if (WXMo.SH((PBUD)yy.p(1794042955), WXMo.SH(entity.getType())) == false) {
            return;
        }
        WXMo.SH((IFYW)yy.h((CLqw)yy.p(1998252577), 1617160327), entity);
    }

    public static int ksfs(Chunk chunk) {
        return (int)WXMo.SH((IFYW)yy.h((CLqw)yy.p(1998252577), 1617160327), chunk);
    }

    private static Object SH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

