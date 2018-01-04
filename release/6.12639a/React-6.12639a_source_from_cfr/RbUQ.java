/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.v1_10_R1.Block
 *  net.minecraft.server.v1_10_R1.Blocks
 *  net.minecraft.server.v1_10_R1.IBlockData
 *  net.minecraft.server.v1_10_R1.MinecraftKey
 *  net.minecraft.server.v1_10_R1.RegistryBlockID
 *  net.minecraft.server.v1_10_R1.RegistryBlocks
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import net.minecraft.server.v1_10_R1.Block;
import net.minecraft.server.v1_10_R1.Blocks;
import net.minecraft.server.v1_10_R1.IBlockData;
import net.minecraft.server.v1_10_R1.MinecraftKey;
import net.minecraft.server.v1_10_R1.RegistryBlockID;
import net.minecraft.server.v1_10_R1.RegistryBlocks;

public class RbUQ
extends pGhD<Block, Blocks> {
    public RbUQ(eHVp eHVp2, Class<? extends Blocks> class_) {
        super(eHVp2, class_);
    }

    public Block GPlk(String string) {
        return (Block)RbUQ.nu((RegistryBlocks)o.k(-552643821), new MinecraftKey(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void yJLS(int n, String string, Block block) {
        RbUQ.nu((RegistryBlocks)o.k(-552643821), n, new MinecraftKey(string), block);
        Object object = RbUQ.nu(RbUQ.nu(RbUQ.nu(block)));
        while (RbUQ.nu(object) != false) {
            IBlockData iBlockData = (IBlockData)RbUQ.nu(object);
            int n2 = RbUQ.nu(block) << 4 | RbUQ.nu(block, iBlockData);
            RbUQ.nu((RegistryBlockID)o.k(-1392880886), iBlockData, n2);
        }
    }

    @Override
    public /* synthetic */ Object get(String string) {
        return this.GPlk(string);
    }

    private static Object nu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

