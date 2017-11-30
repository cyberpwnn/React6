package react.binject.V8;

import com.google.common.collect.UnmodifiableIterator;

import net.minecraft.server.v1_8_R3.Block;
import net.minecraft.server.v1_8_R3.Blocks;
import net.minecraft.server.v1_8_R3.IBlockData;
import net.minecraft.server.v1_8_R3.MinecraftKey;
import react.binject.BlockInjector;
import surge.util.Protocol;

public class BlockInjector8 extends BlockInjector<Block, Blocks>
{
	public BlockInjector8(Protocol protocol, Class<? extends Blocks> blocksClass)
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
		for(UnmodifiableIterator<?> localUnmodifiableIterator = block.P().a().iterator(); localUnmodifiableIterator.hasNext();)
		{
			IBlockData iblockdata = (IBlockData) localUnmodifiableIterator.next();
			int k = Block.getId(block) << 4 | block.toLegacyData(iblockdata);
			Block.d.a(iblockdata, k);
		}
	}
}
