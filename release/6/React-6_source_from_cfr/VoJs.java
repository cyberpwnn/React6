/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Color
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.block.Block
 *  org.bukkit.block.BlockFace
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.ExperienceOrb
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.PlayerInventory
 *  org.bukkit.inventory.meta.LeatherArmorMeta
 *  org.bukkit.material.MaterialData
 *  org.bukkit.potion.PotionEffect
 *  org.bukkit.potion.PotionEffectType
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Chunk;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class VoJs {
    public static boolean jhSt(Block block) {
        Object object = VoJs.Uy(VoJs.EmLA(block));
        while (object.hasNext()) {
            Block block2 = (Block)object.next();
            if (VoJs.Uy(block2.getType()) == false) continue;
            return true;
        }
        return false;
    }

    public static void ssNb(ItemStack itemStack, Color color) {
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)VoJs.Uy(itemStack);
        leatherArmorMeta.setColor(color);
        VoJs.Uy(itemStack, leatherArmorMeta);
    }

    public static Entity Aqbp(int n) {
        Iterator iterator = VoJs.Uy().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            for (Entity entity : world.getEntities()) {
                if (entity.getEntityId() != n) continue;
                return entity;
            }
        }
        return null;
    }

    public static int ssNb(Player player, MBKs mBKs) {
        int n = 0;
        ItemStack[] arritemStack = player.getInventory().getContents();
        int n2 = arritemStack.length;
        int n3 = 0;
        while (n3 < n2) {
            ItemStack itemStack = arritemStack[n3];
            if (itemStack != null) {
                if (VoJs.Uy(itemStack) == false) {
                    if (VoJs.Uy(VoJs.Uy(itemStack), VoJs.Uy(mBKs)) != false) {
                        if ((Object)(VoJs.Uy(VoJs.Uy(itemStack)) == -1 ? false : (Object)VoJs.Uy(VoJs.Uy(itemStack))) == VoJs.Uy(VoJs.Uy(mBKs))) {
                            n += VoJs.Uy(itemStack);
                        }
                    }
                }
            }
            ++n3;
        }
        return n;
    }

    public static boolean ssNb(Player player, MBKs mBKs, int n) {
        if (VoJs.ssNb(player, mBKs) >= n) {
            return true;
        }
        return false;
    }

    public static int BkpW(Block block) {
        return block.getX() - (block.getChunk().getX() << 4);
    }

    public static int lCdp(Block block) {
        return block.getY();
    }

    public static void DYFV(Location location, int n) {
        ((ExperienceOrb)VoJs.Uy(location).spawn(location, ExperienceOrb.class)).setExperience(n);
    }

    public static int nJLQ(Block block) {
        return block.getZ() - (block.getChunk().getZ() << 4);
    }

    public static void DYFV(Player player, MBKs mBKs, int n) {
        if (VoJs.ssNb(player, mBKs, n)) {
            int n2 = 0;
            while (n2 < n) {
                ItemStack[] arritemStack = new ItemStack[1];
                arritemStack[0] = new ItemStack((Material)VoJs.Uy(mBKs), 1, 0, (Byte)VoJs.Uy(mBKs));
                player.getInventory().removeItem(arritemStack);
                ++n2;
            }
        }
    }

    public static int ssNb(Location location, Location location2, boolean bl) {
        reference var3_3 = VoJs.Uy(VoJs.Uy(location) - VoJs.Uy(location2));
        var3_3 += VoJs.Uy(VoJs.Uy(location) - VoJs.Uy(location2));
        if (bl) {
            var3_3 += VoJs.Uy(VoJs.Uy(location) - VoJs.Uy(location2));
        }
        return (int)var3_3;
    }

    public static wfPa<Location> ykmX(Location location) {
        wfPa<Location> wfPa2 = new wfPa<Location>();
        VoJs.Uy(wfPa2, VoJs.Uy(VoJs.Uy(location), 1.0, 0.0, 0.0));
        VoJs.Uy(wfPa2, VoJs.Uy(VoJs.Uy(location), 0.0, 0.0, 1.0));
        VoJs.Uy(wfPa2, VoJs.Uy(VoJs.Uy(location), -1.0, 0.0, 0.0));
        VoJs.Uy(wfPa2, VoJs.Uy(VoJs.Uy(location), 0.0, 0.0, -1.0));
        return wfPa2;
    }

    public static int ssNb(Block block, Block block2, boolean bl) {
        reference var3_3 = VoJs.Uy(block.getX() - block2.getX());
        var3_3 += VoJs.Uy(block.getZ() - block2.getZ());
        if (bl) {
            var3_3 += VoJs.Uy(block.getY() - block2.getY());
        }
        return (int)var3_3;
    }

    public static wfPa<Block> rMgK(Chunk chunk) {
        return new wfPa<Block>((Iterator<Block>)VoJs.Uy(new gWIG(chunk.getBlock(0, 0, 0).getLocation(), chunk.getBlock(15, 255, 15).getLocation())));
    }

    public static World jhSt(World world) {
        return VoJs.Uy(world.getName());
    }

    public static World BkpW(World world) {
        return VoJs.Uy(world.getName());
    }

    public static Block vtFs(Block block) {
        return VoJs.BkpW(block.getWorld()).getBlockAt(block.getX(), block.getY(), block.getZ());
    }

    public static Location rwyd(Location location) {
        return new Location(VoJs.BkpW((World)VoJs.Uy(location)), (double)VoJs.Uy(location), (double)VoJs.Uy(location), (double)VoJs.Uy(location));
    }

    public static Chunk cIji(Chunk chunk) {
        return VoJs.BkpW(chunk.getWorld()).getChunkAt(chunk.getX(), chunk.getZ());
    }

    public static MBKs Lhpt(String string) {
        Object object;
        String string2;
        Object object2;
        block12 : {
            object = null;
            object2 = VoJs.Uy(false);
            String string3 = KUXS$dwji.S("\uba37");
            string2 = KUXS$dwji.S("\uba37");
            if (VoJs.Uy(string, KUXS$dwji.S("\uba3d")) != false) {
                string3 = ((String[])VoJs.Uy(string, KUXS$dwji.S("\uba3d")))[0];
                string2 = ((String[])VoJs.Uy(string, KUXS$dwji.S("\uba3d")))[1];
            } else {
                string3 = string;
            }
            try {
                object = VoJs.Uy(VoJs.Uy(VoJs.Uy(string3)));
                if (object != null) break block12;
                try {
                    object = VoJs.Uy(VoJs.Uy(string3));
                    if (object == null) {
                        return null;
                    }
                }
                catch (Exception exception) {
                    return null;
                }
            }
            catch (Exception exception) {
                try {
                    object = VoJs.Uy(VoJs.Uy(string3));
                    if (object == null) {
                        return null;
                    }
                }
                catch (Exception exception2) {
                    return null;
                }
            }
        }
        try {
            object2 = VoJs.Uy(VoJs.Uy(VoJs.Uy(string2)));
        }
        catch (Exception exception) {
            object2 = VoJs.Uy(false);
        }
        return new MBKs((Material)object, (Byte)object2);
    }

    public static /* varargs */ Block[] ssNb(Block block, BlockFace ... arrblockFace) {
        if (block == null) {
            return new Block[0];
        }
        Block[] arrblock = new Block[arrblockFace.length];
        int n = 0;
        while (n < arrblock.length) {
            arrblock[n] = block.getRelative(arrblockFace[n]);
            ++n;
        }
        return arrblock;
    }

    public static void ssNb(Block block, Material material, MaterialData materialData) {
        VoJs.ssNb(block, material, materialData, true);
    }

    public static void ssNb(Block block, Material material, MaterialData materialData, boolean bl) {
        block.setTypeIdAndData((int)VoJs.Uy(material), (byte)VoJs.Uy(materialData), bl);
    }

    public static void ssNb(Block block, Material material, int n) {
        VoJs.ssNb(block, material, n, true);
    }

    public static void ssNb(Block block, Material material, int n, boolean bl) {
        block.setTypeIdAndData((int)VoJs.Uy(material), (byte)n, bl);
    }

    public static void ssNb(Block block, MaterialData materialData) {
        block.setData((byte)VoJs.Uy(materialData));
    }

    public static void ssNb(Block block, MaterialData materialData, boolean bl) {
        block.setData((byte)VoJs.Uy(materialData), bl);
    }

    public static int ssNb(PotionEffectType potionEffectType, Collection<PotionEffect> collection) {
        Object object = 0;
        for (PotionEffect potionEffect : collection) {
            if (VoJs.Uy(VoJs.Uy(potionEffect), potionEffectType) == false) continue;
            if (VoJs.Uy(potionEffect) + true <= object) continue;
            object = VoJs.Uy(potionEffect) + true;
        }
        return (int)object;
    }

    public static wfPa<Chunk> Cnru(Chunk chunk) {
        wfPa<Chunk> wfPa2 = new wfPa<Chunk>();
        VoJs.Uy(wfPa2, chunk.getWorld().getChunkAt(chunk.getX() + 1, chunk.getZ()));
        VoJs.Uy(wfPa2, chunk.getWorld().getChunkAt(chunk.getX() - 1, chunk.getZ()));
        VoJs.Uy(wfPa2, chunk.getWorld().getChunkAt(chunk.getX(), chunk.getZ() + 1));
        VoJs.Uy(wfPa2, chunk.getWorld().getChunkAt(chunk.getX(), chunk.getZ() - 1));
        return wfPa2;
    }

    public static wfPa<Block> EmLA(Block block) {
        wfPa<Block> wfPa2 = new wfPa<Block>();
        VoJs.Uy(wfPa2, block.getRelative((BlockFace)cv.e(-1471022979)));
        VoJs.Uy(wfPa2, block.getRelative((BlockFace)cv.e(216856695)));
        VoJs.Uy(wfPa2, block.getRelative((BlockFace)cv.e(1388705905)));
        VoJs.Uy(wfPa2, block.getRelative((BlockFace)cv.e(-322439056)));
        VoJs.Uy(wfPa2, block.getRelative((BlockFace)cv.e(1382611062)));
        VoJs.Uy(wfPa2, block.getRelative((BlockFace)cv.e(-1364133773)));
        return wfPa2;
    }

    public static Location hHYn(Location location) {
        reference var1_1;
        reference var2_2 = var1_1 = VoJs.Uy(location);
        while (var2_2 > 0) {
            reference var3_3 = var2_2 - true;
            Material material = VoJs.Uy(new Location((World)VoJs.Uy(location), (double)VoJs.Uy(location), (double)var3_3, (double)VoJs.Uy(location))).getType();
            if (VoJs.Uy(material, (Material)cv.e(-493219437)) == false) {
                if (VoJs.Uy(material, (Material)cv.e(1517483590)) == false) {
                    if (VoJs.Uy(material, (Material)cv.e(-855509439)) == false) {
                        if (VoJs.Uy(material, (Material)cv.e(-936379558)) == false) {
                            if (VoJs.Uy(material, (Material)cv.e(-347538619)) == false) {
                                return new Location((World)VoJs.Uy(location), (double)VoJs.Uy(location), (double)(var3_3 + true), (double)VoJs.Uy(location));
                            }
                        }
                    }
                }
            }
            --var2_2;
        }
        return null;
    }

    public static wfPa<Chunk> IWSm(Chunk chunk, int n) {
        wfPa<Chunk> wfPa2 = new wfPa<Chunk>();
        int n2 = chunk.getX() - n + 1;
        while (n2 < chunk.getX() + n) {
            int n3 = chunk.getZ() - n + 1;
            while (n3 < chunk.getZ() + n) {
                VoJs.Uy(wfPa2, chunk.getWorld().getChunkAt(n2, n3));
                ++n3;
            }
            ++n2;
        }
        VoJs.Uy(wfPa2, chunk);
        return wfPa2;
    }

    public static wfPa<Block> ssNb(Block block, int n) {
        wfPa<Block> wfPa2 = new wfPa<Block>();
        int n2 = block.getX() - n + 1;
        while (n2 < block.getX() + n) {
            int n3 = block.getZ() - n + 1;
            while (n3 < block.getZ() + n) {
                VoJs.Uy(wfPa2, block.getWorld().getBlockAt(n2, block.getY(), n3));
                ++n3;
            }
            ++n2;
        }
        VoJs.Uy(wfPa2, block);
        return wfPa2;
    }

    public static Entity ssNb(Entity entity, double d, double d2) {
        if (d2 < 1.0) {
            d2 = 1.0;
        }
        if (d < 1.0) {
            d = 1.0;
        }
        Object object = VoJs.Uy(d2);
        Entity[] arrentity = new Entity[1];
        VoJs.Uy(new VoJs$1((Location)VoJs.Uy(VoJs.Uy(entity.getLocation()), 0.5, 0.5, 0.5), (Vector)VoJs.Uy(entity.getLocation()), (Double)VoJs.Uy(d), (Double)VoJs.Uy(1.0), (Double)object, entity, arrentity));
        return arrentity[0];
    }

    public static boolean ssNb(Entity entity, Entity entity2, double d, double d2) {
        Entity entity3 = VoJs.ssNb(entity, d, d2);
        if (entity3 == null) {
            return false;
        }
        return (boolean)VoJs.Uy(entity3, entity2);
    }

    public static double ssNb(Vector vector, Vector vector2) {
        return (double)VoJs.Uy(vector, vector2);
    }

    private static Object Uy(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

