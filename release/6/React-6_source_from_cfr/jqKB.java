/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.v1_12_R1.BlockPosition
 *  org.bukkit.Chunk
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.craftbukkit.v1_12_R1.CraftWorld
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import net.minecraft.server.v1_12_R1.BlockPosition;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;

public class jqKB
implements rNNN {
    private PBUD<Chunk> bHAb = new PBUD();

    @Override
    public void mXJp(Location location, XAel xAel) {
        Object object = jqKB.yD(location);
        Object object2 = jqKB.yD((CraftWorld)object);
        Object object3 = jqKB.yD(object2, jqKB.yD(location) >> 4, jqKB.yD(location) >> 4);
        BlockPosition blockPosition = new BlockPosition((int)jqKB.yD(location), (int)jqKB.yD(location), (int)jqKB.yD(location));
        Object object4 = jqKB.yD(jqKB.yD(jqKB.yD(xAel)) + (jqKB.yD(jqKB.yD(xAel)) << 12));
        jqKB.yD(object3, blockPosition, object4);
        jqKB.yD((PBUD)yy.h(this, 1192880459), object.getChunkAt(((Integer)yy.h(object3, -1628706484)).intValue(), ((Integer)yy.h(object3, -1105204927)).intValue()));
    }

    @Override
    public void yIkI(Chunk chunk) {
        chunk.getWorld().refreshChunk(chunk.getX(), chunk.getZ());
    }

    @Override
    public PBUD<Chunk> VfRi() {
        return (PBUD)yy.h(this, 1192880459);
    }

    private static Object yD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

