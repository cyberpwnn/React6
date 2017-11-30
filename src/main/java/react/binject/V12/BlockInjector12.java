package react.binject.V12;

import com.google.common.collect.UnmodifiableIterator;

import net.minecraft.server.v1_12_R1.Block;
import net.minecraft.server.v1_12_R1.Blocks;
import net.minecraft.server.v1_12_R1.IBlockData;
import net.minecraft.server.v1_12_R1.MinecraftKey;
import react.binject.BlockInjector;
import surge.util.Protocol;

public class BlockInjector12 extends BlockInjector<Block, Blocks>
{
	public BlockInjector12(Protocol protocol, Class<? extends Blocks> blocksClass)
	{
		super(protocol, blocksClass);
	}

	@Override
	public Block get(String s)
	{
		return Block.REGISTRY.get(new MinecraftKey(s));
	}

	@Override
	public void add(int index, String name, Block block)
	{
		Block.REGISTRY.a(index, new MinecraftKey(name), block);

		for(UnmodifiableIterator<IBlockData> localUnmodifiableIterator = block.s().a().iterator(); localUnmodifiableIterator.hasNext();)
		{
			IBlockData iblockdata = (IBlockData) localUnmodifiableIterator.next();
			int k = Block.getId(block) << 4 | block.toLegacyData(iblockdata);
			Block.REGISTRY_ID.a(iblockdata, k);
		}
	}
}
