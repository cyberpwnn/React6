/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.v1_12_R1.Block
 *  net.minecraft.server.v1_12_R1.Blocks
 *  net.minecraft.server.v1_12_R1.IBlockData
 *  net.minecraft.server.v1_12_R1.MinecraftKey
 *  net.minecraft.server.v1_12_R1.RegistryBlockID
 *  net.minecraft.server.v1_12_R1.RegistryBlocks
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import net.minecraft.server.v1_12_R1.Block;
import net.minecraft.server.v1_12_R1.Blocks;
import net.minecraft.server.v1_12_R1.IBlockData;
import net.minecraft.server.v1_12_R1.MinecraftKey;
import net.minecraft.server.v1_12_R1.RegistryBlockID;
import net.minecraft.server.v1_12_R1.RegistryBlocks;

public class jpjE
extends pGhD<Block, Blocks> {
    public jpjE(eHVp eHVp2, Class<? extends Blocks> class_) {
        super(eHVp2, class_);
    }

    public Block HeSD(String string) {
        return (Block)jpjE.ND((RegistryBlocks)o.k(1750291438), new MinecraftKey(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void yJLS(int n, String string, Block block) {
        jpjE.ND((RegistryBlocks)o.k(1750291438), n, new MinecraftKey(string), block);
        Object object = jpjE.ND(jpjE.ND(jpjE.ND(block)));
        while (jpjE.ND(object) != false) {
            IBlockData iBlockData = (IBlockData)jpjE.ND(object);
            int n2 = jpjE.ND(block) << 4 | jpjE.ND(block, iBlockData);
            jpjE.ND((RegistryBlockID)o.k(-1444588553), iBlockData, n2);
        }
    }

    @Override
    public /* synthetic */ Object get(String string) {
        return this.HeSD(string);
    }

    private static Object ND(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

