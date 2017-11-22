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

public class xhxl {
    public static wfPa<Chunk> OXeK(World world) {
        return new wfPa<Chunk>((T[])world.getLoadedChunks());
    }

    public static wfPa<Chunk> lDXV() {
        wfPa<Chunk> wfPa2 = new wfPa<Chunk>();
        Object object = xhxl.ur(xhxl.ur());
        while (object.hasNext()) {
            World world = (World)object.next();
            xhxl.ur(wfPa2, xhxl.OXeK(world));
        }
        return wfPa2;
    }

    public static wfPa<Chunk> DYFV(Chunk chunk, int n) {
        return xhxl.ur(chunk, n);
    }

    public static boolean ssNb(Chunk chunk, boolean bl, boolean bl2) {
        return chunk.unload(bl, bl2);
    }

    public static boolean ssNb(Chunk chunk, boolean bl) {
        return xhxl.ssNb(chunk, bl, true);
    }

    public static boolean rwyd(Chunk chunk) {
        return xhxl.ssNb(chunk, true, true);
    }

    public static int ssNb(wfPa<Chunk> wfPa2, boolean bl, boolean bl2) {
        int n = 0;
        Object object = xhxl.ur(wfPa2);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            if (!xhxl.ssNb(chunk, bl, bl2)) continue;
            ++n;
        }
        return n;
    }

    public static int ssNb(wfPa<Chunk> wfPa2, boolean bl) {
        return xhxl.ssNb(wfPa2, bl, true);
    }

    public static int BkpW(wfPa<Chunk> wfPa2) {
        return xhxl.ssNb(wfPa2, true, true);
    }

    public static boolean ssNb(String string, int n, int n2) {
        return xhxl.DYFV((World)xhxl.ur(string), n, n2);
    }

    public static boolean DYFV(World world, int n, int n2) {
        Object object = xhxl.ur(xhxl.OXeK(world));
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            if (chunk.getX() != n || chunk.getZ() != n2) continue;
            return true;
        }
        return false;
    }

    public static void lCdp(wfPa<Chunk> wfPa2) {
        Object object = xhxl.ur(wfPa2);
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            chunk.load();
        }
    }

    private static Object ur(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

