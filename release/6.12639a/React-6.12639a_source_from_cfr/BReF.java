/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.v1_11_R1.Block
 *  net.minecraft.server.v1_11_R1.Blocks
 *  net.minecraft.server.v1_11_R1.IBlockData
 *  net.minecraft.server.v1_11_R1.MinecraftKey
 *  net.minecraft.server.v1_11_R1.RegistryBlockID
 *  net.minecraft.server.v1_11_R1.RegistryBlocks
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import net.minecraft.server.v1_11_R1.Block;
import net.minecraft.server.v1_11_R1.Blocks;
import net.minecraft.server.v1_11_R1.IBlockData;
import net.minecraft.server.v1_11_R1.MinecraftKey;
import net.minecraft.server.v1_11_R1.RegistryBlockID;
import net.minecraft.server.v1_11_R1.RegistryBlocks;

public class BReF
extends pGhD<Block, Blocks> {
    public BReF(eHVp eHVp2, Class<? extends Blocks> class_) {
        super(eHVp2, class_);
    }

    public Block ktHX(String string) {
        return (Block)BReF.pp((RegistryBlocks)o.k(501306119), new MinecraftKey(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void yJLS(int n, String string, Block block) {
        BReF.pp((RegistryBlocks)o.k(501306119), n, new MinecraftKey(string), block);
        Object object = BReF.pp(BReF.pp(BReF.pp(block)));
        while (BReF.pp(object) != false) {
            IBlockData iBlockData = (IBlockData)BReF.pp(object);
            int n2 = BReF.pp(block) << 4 | BReF.pp(block, iBlockData);
            BReF.pp((RegistryBlockID)o.k(2006864880), iBlockData, n2);
        }
    }

    @Override
    public /* synthetic */ Object get(String string) {
        return this.ktHX(string);
    }

    private static Object pp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

