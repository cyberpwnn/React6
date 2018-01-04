/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.v1_9_R1.Block
 *  net.minecraft.server.v1_9_R1.Blocks
 *  net.minecraft.server.v1_9_R1.IBlockData
 *  net.minecraft.server.v1_9_R1.MinecraftKey
 *  net.minecraft.server.v1_9_R1.RegistryBlockID
 *  net.minecraft.server.v1_9_R1.RegistryBlocks
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import net.minecraft.server.v1_9_R1.Block;
import net.minecraft.server.v1_9_R1.Blocks;
import net.minecraft.server.v1_9_R1.IBlockData;
import net.minecraft.server.v1_9_R1.MinecraftKey;
import net.minecraft.server.v1_9_R1.RegistryBlockID;
import net.minecraft.server.v1_9_R1.RegistryBlocks;

public class BdGQ
extends pGhD<Block, Blocks> {
    public BdGQ(eHVp eHVp2, Class<? extends Blocks> class_) {
        super(eHVp2, class_);
    }

    public Block qcvH(String string) {
        return (Block)BdGQ.rI((RegistryBlocks)o.k(-1278061604), new MinecraftKey(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void yJLS(int n, String string, Block block) {
        BdGQ.rI((RegistryBlocks)o.k(-1278061604), n, new MinecraftKey(string), block);
        Object object = BdGQ.rI(BdGQ.rI(BdGQ.rI(block)));
        while (BdGQ.rI(object) != false) {
            IBlockData iBlockData = (IBlockData)BdGQ.rI(object);
            int n2 = BdGQ.rI(block) << 4 | BdGQ.rI(block, iBlockData);
            BdGQ.rI((RegistryBlockID)o.k(1483101157), iBlockData, n2);
        }
    }

    @Override
    public /* synthetic */ Object get(String string) {
        return this.qcvH(string);
    }

    private static Object rI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

