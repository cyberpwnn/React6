/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.World
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.World;

public class dgVt {
    public static feCR<Chunk> sQJh(World world) {
        return new feCR<Chunk>((T[])world.getLoadedChunks());
    }

    public static feCR<Chunk> gxtQ() {
        feCR<Chunk> feCR2 = new feCR<Chunk>();
        Object object = dgVt.SF(dgVt.SF());
        while (object.hasNext()) {
            World world = (World)object.next();
            dgVt.SF(feCR2, dgVt.sQJh(world));
        }
        return feCR2;
    }

    public static feCR<Chunk> UtIU(Chunk chunk, int n) {
        return dgVt.SF(chunk, n);
    }

    public static boolean yJLS(Chunk chunk, boolean bl, boolean bl2) {
        return chunk.unload(bl, bl2);
    }

    public static boolean yJLS(Chunk chunk, boolean bl) {
        return dgVt.yJLS(chunk, bl, true);
    }

    public static boolean Mkpo(Chunk chunk) {
        return dgVt.yJLS(chunk, true, true);
    }

    public static int yJLS(feCR<Chunk> feCR2, boolean bl, boolean bl2) {
        int n = 0;
        Object object = dgVt.SF(feCR2);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            if (!dgVt.yJLS(chunk, bl, bl2)) continue;
            ++n;
        }
        return n;
    }

    public static int yJLS(feCR<Chunk> feCR2, boolean bl) {
        return dgVt.yJLS(feCR2, bl, true);
    }

    public static int wKtV(feCR<Chunk> feCR2) {
        return dgVt.yJLS(feCR2, true, true);
    }

    public static boolean yJLS(String string, int n, int n2) {
        return dgVt.UtIU((World)dgVt.SF(string), n, n2);
    }

    public static boolean UtIU(World world, int n, int n2) {
        Object object = dgVt.SF(dgVt.sQJh(world));
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            if (chunk.getX() != n || chunk.getZ() != n2) continue;
            return true;
        }
        return false;
    }

    public static void xykf(feCR<Chunk> feCR2) {
        Object object = dgVt.SF(feCR2);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            chunk.load();
        }
    }

    private static Object SF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

