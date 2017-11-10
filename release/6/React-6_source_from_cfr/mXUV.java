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

public class mXUV {
    public static PBUD<Chunk> SnBs(World world) {
        return new PBUD<Chunk>((T[])world.getLoadedChunks());
    }

    public static PBUD<Chunk> maJd() {
        PBUD<Chunk> pBUD = new PBUD<Chunk>();
        Object object = mXUV.Kr(mXUV.Kr());
        while (object.hasNext()) {
            World world = (World)object.next();
            mXUV.Kr(pBUD, mXUV.SnBs(world));
        }
        return pBUD;
    }

    public static PBUD<Chunk> ksfs(Chunk chunk, int n) {
        return mXUV.Kr(chunk, n);
    }

    public static boolean mXJp(Chunk chunk, boolean bl, boolean bl2) {
        return chunk.unload(bl, bl2);
    }

    public static boolean mXJp(Chunk chunk, boolean bl) {
        return mXUV.mXJp(chunk, bl, true);
    }

    public static boolean CVAs(Chunk chunk) {
        return mXUV.mXJp(chunk, true, true);
    }

    public static int mXJp(PBUD<Chunk> pBUD, boolean bl, boolean bl2) {
        int n = 0;
        Object object = mXUV.Kr(pBUD);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            if (!mXUV.mXJp(chunk, bl, bl2)) continue;
            ++n;
        }
        return n;
    }

    public static int mXJp(PBUD<Chunk> pBUD, boolean bl) {
        return mXUV.mXJp(pBUD, bl, true);
    }

    public static int qdWJ(PBUD<Chunk> pBUD) {
        return mXUV.mXJp(pBUD, true, true);
    }

    public static boolean mXJp(String string, int n, int n2) {
        return mXUV.ksfs((World)mXUV.Kr(string), n, n2);
    }

    public static boolean ksfs(World world, int n, int n2) {
        Object object = mXUV.Kr(mXUV.SnBs(world));
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            if (chunk.getX() != n || chunk.getZ() != n2) continue;
            return true;
        }
        return false;
    }

    public static void JRFt(PBUD<Chunk> pBUD) {
        Object object = mXUV.Kr(pBUD);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            chunk.load();
        }
    }

    private static Object Kr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

