package react.binject.V12;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import javax.annotation.Nullable;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gconcurrent.S;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import net.minecraft.server.v1_12_R1.AxisAlignedBB;
import net.minecraft.server.v1_12_R1.Block;
import net.minecraft.server.v1_12_R1.BlockDiodeAbstract;
import net.minecraft.server.v1_12_R1.BlockObserver;
import net.minecraft.server.v1_12_R1.BlockPosition;
import net.minecraft.server.v1_12_R1.BlockRedstoneWire;
import net.minecraft.server.v1_12_R1.BlockRepeater;
import net.minecraft.server.v1_12_R1.BlockStateList;
import net.minecraft.server.v1_12_R1.Blocks;
import net.minecraft.server.v1_12_R1.EnumBlockFaceShape;
import net.minecraft.server.v1_12_R1.EnumDirection;
import net.minecraft.server.v1_12_R1.IBlockAccess;
import net.minecraft.server.v1_12_R1.IBlockData;
import net.minecraft.server.v1_12_R1.IBlockState;
import net.minecraft.server.v1_12_R1.Item;
import net.minecraft.server.v1_12_R1.ItemStack;
import net.minecraft.server.v1_12_R1.Items;
import net.minecraft.server.v1_12_R1.World;
import react.binject.InjectedBlock;
import surge.util.Anchor;
import surge.util.ParticleEffect;
import surge.util.Protocol;

@Anchor(87)
public class BlockRedstoneWire12 extends BlockRedstoneWire implements InjectedBlock
{
	private final Set<BlockPosition> B = Sets.newHashSet();
	private boolean g = true;

	public BlockRedstoneWire12()
	{
		super();
	}

	@Override
	@Nullable
	public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition)
	{
		return BlockRedstoneWire.k;
	}

	@Override
	public boolean b(IBlockData iblockdata)
	{
		return false;
	}

	@Override
	public boolean c(IBlockData iblockdata)
	{
		return false;
	}

	@Override
	public boolean canPlace(World world, BlockPosition blockposition)
	{
		return world.getType(blockposition.down()).q() || world.getType(blockposition.down()).getBlock() == Blocks.GLOWSTONE;
	}

	private void mark(BlockPosition pos, ParticleEffect effect)
	{
		Location l = new Location(Bukkit.getWorld("world"), pos.getX(), pos.getY(), pos.getZ()).clone().add(0.5, 0.5, 0.5);
		effect.display(0, 1, l, 120);
	}

	private IBlockData e(World world, BlockPosition blockposition, IBlockData iblockdata)
	{
		iblockdata = this.a(world, blockposition, blockposition, iblockdata);
		ArrayList<BlockPosition> arraylist = Lists.newArrayList(this.B);
		Iterator<BlockPosition> iterator = arraylist.iterator();
		this.B.clear();

		while(iterator.hasNext())
		{
			BlockPosition blockposition1 = (BlockPosition) iterator.next();
			world.applyPhysics(blockposition1, this, false);
		}

		return iblockdata;
	}

	private IBlockData a(World world, BlockPosition blockposition, BlockPosition blockposition1, IBlockData iblockdata)
	{
		new A()
		{

			@Override
			public void run()
			{
				IBlockData iblockdata1 = iblockdata;
				int i = ((Integer) iblockdata.get(BlockRedstoneWire.POWER)).intValue();
				byte b0 = 0;
				int j = getPower(world, blockposition1, b0);

				g = false;
				int k = world.z(blockposition);

				.g = true;
				if(k > 0 && k > j - 1)
				{
					j = k;
				}

				int l = 0;
				Iterator<EnumDirection> iterator = EnumDirection.EnumDirectionLimit.HORIZONTAL.iterator();

				while(iterator.hasNext())
				{
					EnumDirection enumdirection = (EnumDirection) iterator.next();
					BlockPosition blockposition2 = blockposition.shift(enumdirection);
					boolean flag = blockposition2.getX() != blockposition1.getX() || blockposition2.getZ() != blockposition1.getZ();

					if(flag)
					{
						l = getPower(world, blockposition2, l);
					}

					if(world.getType(blockposition2).l() && !world.getType(blockposition.up()).l())
					{
						if(flag && blockposition.getY() >= blockposition1.getY())
						{
							l = getPower(world, blockposition2.up(), l);
						}
					}

					else if(!world.getType(blockposition2).l() && flag && blockposition.getY() <= blockposition1.getY())
					{
						l = getPower(world, blockposition2.down(), l);
					}
				}

				if(l > j)
				{
					j = l - 1;
				}
				else if(j > 0)
				{
					--j;
				}
				else
				{
					j = 0;
				}

				if(k > j - 1)
				{
					j = k;
				}

				// CraftBukkit start
				new S()
				{
					@Override
					public void run()
					{
						if(i != j)
						{
							BlockRedstoneEvent event = new BlockRedstoneEvent(world.getWorld().getBlockAt(blockposition.getX(), blockposition.getY(), blockposition.getZ()), i, j);
							world.getServer().getPluginManager().callEvent(event);

							j = event.getNewCurrent();
						}
					}
				};
				// CraftBukkit end

				if(i != j)
				{
					iblockdata = iblockdata.set(BlockRedstoneWire.POWER, Integer.valueOf(j));
					if(world.getType(blockposition) == iblockdata1)
					{
						new S()
						{
							@Override
							public void run()
							{
								world.setTypeAndData(blockposition, iblockdata, 2);
							}
						};
					}

					this.B.add(blockposition);
					EnumDirection[] aenumdirection = EnumDirection.values();
					int i1 = aenumdirection.length;

					for(int j1 = 0; j1 < i1; ++j1)
					{
						EnumDirection enumdirection1 = aenumdirection[j1];

						this.B.add(blockposition.shift(enumdirection1));
					}
				}
			}
		};

		return iblockdata;
	}

	private void b(World world, BlockPosition blockposition)
	{
		if(world.getType(blockposition).getBlock() == this)
		{
			world.applyPhysics(blockposition, this, false);
			EnumDirection[] aenumdirection = EnumDirection.values();
			int i = aenumdirection.length;

			for(int j = 0; j < i; ++j)
			{
				EnumDirection enumdirection = aenumdirection[j];
				world.applyPhysics(blockposition.shift(enumdirection), this, false);
			}
		}
	}

	@Override
	public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata)
	{
		if(!world.isClientSide)
		{
			this.e(world, blockposition, iblockdata);
			Iterator<EnumDirection> iterator = EnumDirection.EnumDirectionLimit.VERTICAL.iterator();

			EnumDirection enumdirection;

			while(iterator.hasNext())
			{
				enumdirection = (EnumDirection) iterator.next();
				world.applyPhysics(blockposition.shift(enumdirection), this, false);
			}

			iterator = EnumDirection.EnumDirectionLimit.HORIZONTAL.iterator();

			while(iterator.hasNext())
			{
				enumdirection = (EnumDirection) iterator.next();
				this.b(world, blockposition.shift(enumdirection));
			}

			iterator = EnumDirection.EnumDirectionLimit.HORIZONTAL.iterator();

			while(iterator.hasNext())
			{
				enumdirection = (EnumDirection) iterator.next();
				BlockPosition blockposition1 = blockposition.shift(enumdirection);

				if(world.getType(blockposition1).l())
				{
					this.b(world, blockposition1.up());
				}
				else
				{
					this.b(world, blockposition1.down());
				}
			}

		}
	}

	@Override
	public void remove(World world, BlockPosition blockposition, IBlockData iblockdata)
	{
		super.remove(world, blockposition, iblockdata);
		if(!world.isClientSide)
		{
			EnumDirection[] aenumdirection = EnumDirection.values();
			int i = aenumdirection.length;

			for(int j = 0; j < i; ++j)
			{
				EnumDirection enumdirection = aenumdirection[j];

				world.applyPhysics(blockposition.shift(enumdirection), this, false);
			}

			this.e(world, blockposition, iblockdata);
			Iterator<EnumDirection> iterator = EnumDirection.EnumDirectionLimit.HORIZONTAL.iterator();

			EnumDirection enumdirection1;

			while(iterator.hasNext())
			{
				enumdirection1 = (EnumDirection) iterator.next();
				this.b(world, blockposition.shift(enumdirection1));
			}

			iterator = EnumDirection.EnumDirectionLimit.HORIZONTAL.iterator();

			while(iterator.hasNext())
			{
				enumdirection1 = (EnumDirection) iterator.next();
				BlockPosition blockposition1 = blockposition.shift(enumdirection1);

				if(world.getType(blockposition1).l())
				{
					this.b(world, blockposition1.up());
				}
				else
				{
					this.b(world, blockposition1.down());
				}
			}

		}
	}

	@Override
	public int getPower(World world, BlockPosition blockposition, int i)
	{
		if(world.getType(blockposition).getBlock() != this)
		{
			return i;
		}
		else
		{
			int j = ((Integer) world.getType(blockposition).get(BlockRedstoneWire.POWER)).intValue();

			return j > i ? j : i;
		}
	}

	@Override
	public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block, BlockPosition blockposition1)
	{
		if(!world.isClientSide)
		{
			if(this.canPlace(world, blockposition))
			{
				this.e(world, blockposition, iblockdata);
			}
			else
			{
				this.b(world, blockposition, iblockdata, 0);
				world.setAir(blockposition);
			}

		}
	}

	@Override
	public Item getDropType(IBlockData iblockdata, Random random, int i)
	{
		return Items.REDSTONE;
	}

	@Override
	public int c(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection)
	{
		return !this.g ? 0 : iblockdata.a(iblockaccess, blockposition, enumdirection);
	}

	@Override
	public int b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection)
	{
		if(!this.g)
		{
			return 0;
		}
		else
		{
			int i = ((Integer) iblockdata.get(BlockRedstoneWire.POWER)).intValue();

			if(i == 0)
			{
				return 0;
			}
			else if(enumdirection == EnumDirection.UP)
			{
				return i;
			}
			else
			{
				EnumSet<EnumDirection> enumset = EnumSet.noneOf(EnumDirection.class);
				Iterator<EnumDirection> iterator = EnumDirection.EnumDirectionLimit.HORIZONTAL.iterator();

				while(iterator.hasNext())
				{
					EnumDirection enumdirection1 = (EnumDirection) iterator.next();

					if(this.b(iblockaccess, blockposition, enumdirection1))
					{
						enumset.add(enumdirection1);
					}
				}

				if(enumdirection.k().c() && enumset.isEmpty())
				{
					return i;
				}
				else if(enumset.contains(enumdirection) && !enumset.contains(enumdirection.f()) && !enumset.contains(enumdirection.e()))
				{
					return i;
				}
				else
				{
					return 0;
				}
			}
		}
	}

	private boolean b(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection)
	{
		BlockPosition blockposition1 = blockposition.shift(enumdirection);
		IBlockData iblockdata = iblockaccess.getType(blockposition1);
		boolean flag = iblockdata.l();
		boolean flag1 = iblockaccess.getType(blockposition.up()).l();

		return !flag1 && flag && c(iblockaccess, blockposition1.up()) ? true : (a(iblockdata, enumdirection) ? true : (iblockdata.getBlock() == Blocks.POWERED_REPEATER && iblockdata.get(BlockDiodeAbstract.FACING) == enumdirection ? true : !flag && c(iblockaccess, blockposition1.down())));
	}

	protected static boolean c(IBlockAccess iblockaccess, BlockPosition blockposition)
	{
		return x(iblockaccess.getType(blockposition));
	}

	protected static boolean x(IBlockData iblockdata)
	{
		return a(iblockdata, (EnumDirection) null);
	}

	protected static boolean a(IBlockData iblockdata, @Nullable EnumDirection enumdirection)
	{
		Block block = iblockdata.getBlock();

		if(block == Blocks.REDSTONE_WIRE)
		{
			return true;
		}
		else if(Blocks.UNPOWERED_REPEATER.D(iblockdata))
		{
			EnumDirection enumdirection1 = (EnumDirection) iblockdata.get(BlockRepeater.FACING);

			return enumdirection1 == enumdirection || enumdirection1.opposite() == enumdirection;
		}
		else
		{
			return Blocks.dk == iblockdata.getBlock() ? enumdirection == iblockdata.get(BlockObserver.FACING) : iblockdata.m() && enumdirection != null;
		}
	}

	@Override
	public boolean isPowerSource(IBlockData iblockdata)
	{
		return this.g;
	}

	@Override
	public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata)
	{
		return new ItemStack(Items.REDSTONE);
	}

	@Override
	public IBlockData fromLegacyData(int i)
	{
		return this.getBlockData().set(BlockRedstoneWire.POWER, Integer.valueOf(i));
	}

	@Override
	public int toLegacyData(IBlockData iblockdata)
	{
		return ((Integer) iblockdata.get(BlockRedstoneWire.POWER)).intValue();
	}

	@Override
	protected BlockStateList getStateList()
	{
		return new BlockStateList(this, new IBlockState[] {BlockRedstoneWire.NORTH, BlockRedstoneWire.EAST, BlockRedstoneWire.SOUTH, BlockRedstoneWire.WEST, BlockRedstoneWire.POWER});
	}

	@Override
	public EnumBlockFaceShape a(IBlockAccess iblockaccess, IBlockData iblockdata, BlockPosition blockposition, EnumDirection enumdirection)
	{
		return EnumBlockFaceShape.UNDEFINED;
	}

	@Override
	public Protocol getInjectProtocol()
	{
		return Protocol.R1_12;
	}

	@Override
	public String getInjectKey()
	{
		return "redstone_wire";
	}

	@Override
	public String getInjectCKey()
	{
		return "REDSTONE_WIRE";
	}

	@Override
	public int getInjectId()
	{
		return 55;
	}
}
