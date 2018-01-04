/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.v1_8_R3.Block
 *  net.minecraft.server.v1_8_R3.Blocks
 *  net.minecraft.server.v1_8_R3.IBlockData
 *  net.minecraft.server.v1_8_R3.MinecraftKey
 *  net.minecraft.server.v1_8_R3.RegistryBlocks
 *  net.minecraft.server.v1_8_R3.RegistryID
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import net.minecraft.server.v1_8_R3.Block;
import net.minecraft.server.v1_8_R3.Blocks;
import net.minecraft.server.v1_8_R3.IBlockData;
import net.minecraft.server.v1_8_R3.MinecraftKey;
import net.minecraft.server.v1_8_R3.RegistryBlocks;
import net.minecraft.server.v1_8_R3.RegistryID;

public class oLsv
extends pGhD<Block, Blocks> {
    public oLsv(eHVp eHVp2, Class<? extends Blocks> class_) {
        super(eHVp2, class_);
    }

    public Block Ipep(String string) {
        return (Block)oLsv.In((RegistryBlocks)o.k(-1068149771), new MinecraftKey(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void yJLS(int n, String string, Block block) {
        oLsv.In((RegistryBlocks)o.k(-1068149771), n, new MinecraftKey(string), block);
        Object object = oLsv.In(oLsv.In(oLsv.In(block)));
        while (oLsv.In(object) != false) {
            IBlockData iBlockData = (IBlockData)oLsv.In(object);
            int n2 = oLsv.In(block) << 4 | oLsv.In(block, iBlockData);
            oLsv.In((RegistryID)o.k(-1997057058), iBlockData, n2);
        }
    }

    @Override
    public /* synthetic */ Object get(String string) {
        return this.Ipep(string);
    }

    private static Object In(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

