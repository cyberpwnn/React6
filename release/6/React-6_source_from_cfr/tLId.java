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

public class tLId {
    public static boolean SnBs(Block block) {
        Object object = tLId.Fx(tLId.yIkI(block));
        while (object.hasNext()) {
            Block block2 = (Block)object.next();
            if (tLId.Fx(block2.getType()) == false) continue;
            return true;
        }
        return false;
    }

    public static void mXJp(ItemStack itemStack, Color color) {
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)tLId.Fx(itemStack);
        leatherArmorMeta.setColor(color);
        tLId.Fx(itemStack, leatherArmorMeta);
    }

    public static Entity erWK(int n) {
        Iterator iterator = tLId.Fx().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            for (Entity entity : world.getEntities()) {
                if (entity.getEntityId() != n) continue;
                return entity;
            }
        }
        return null;
    }

    public static int mXJp(Player player, XAel xAel) {
        int n = 0;
        ItemStack[] arritemStack = player.getInventory().getContents();
        int n2 = arritemStack.length;
        int n3 = 0;
        while (n3 < n2) {
            ItemStack itemStack = arritemStack[n3];
            if (itemStack != null) {
                if (tLId.Fx(itemStack) == false) {
                    if (tLId.Fx(tLId.Fx(itemStack), tLId.Fx(xAel)) != false) {
                        if ((Object)(tLId.Fx(tLId.Fx(itemStack)) == -1 ? false : (Object)tLId.Fx(tLId.Fx(itemStack))) == tLId.Fx(tLId.Fx(xAel))) {
                            n += tLId.Fx(itemStack);
                        }
                    }
                }
            }
            ++n3;
        }
        return n;
    }

    public static boolean mXJp(Player player, XAel xAel, int n) {
        if (tLId.mXJp(player, xAel) >= n) {
            return true;
        }
        return false;
    }

    public static int qdWJ(Block block) {
        return block.getX() - (block.getChunk().getX() << 4);
    }

    public static int JRFt(Block block) {
        return block.getY();
    }

    public static void ksfs(Location location, int n) {
        ((ExperienceOrb)tLId.Fx(location).spawn(location, ExperienceOrb.class)).setExperience(n);
    }

    public static int halY(Block block) {
        return block.getZ() - (block.getChunk().getZ() << 4);
    }

    public static void ksfs(Player player, XAel xAel, int n) {
        if (tLId.mXJp(player, xAel, n)) {
            int n2 = 0;
            while (n2 < n) {
                ItemStack[] arritemStack = new ItemStack[1];
                arritemStack[0] = new ItemStack((Material)tLId.Fx(xAel), 1, 0, (Byte)tLId.Fx(xAel));
                player.getInventory().removeItem(arritemStack);
                ++n2;
            }
        }
    }

    public static int mXJp(Location location, Location location2, boolean bl) {
        reference var3_3 = tLId.Fx(tLId.Fx(location) - tLId.Fx(location2));
        var3_3 += tLId.Fx(tLId.Fx(location) - tLId.Fx(location2));
        if (bl) {
            var3_3 += tLId.Fx(tLId.Fx(location) - tLId.Fx(location2));
        }
        return (int)var3_3;
    }

    public static PBUD<Location> Fomb(Location location) {
        PBUD<Location> pBUD = new PBUD<Location>();
        tLId.Fx(pBUD, tLId.Fx(tLId.Fx(location), 1.0, 0.0, 0.0));
        tLId.Fx(pBUD, tLId.Fx(tLId.Fx(location), 0.0, 0.0, 1.0));
        tLId.Fx(pBUD, tLId.Fx(tLId.Fx(location), -1.0, 0.0, 0.0));
        tLId.Fx(pBUD, tLId.Fx(tLId.Fx(location), 0.0, 0.0, -1.0));
        return pBUD;
    }

    public static int mXJp(Block block, Block block2, boolean bl) {
        reference var3_3 = tLId.Fx(block.getX() - block2.getX());
        var3_3 += tLId.Fx(block.getZ() - block2.getZ());
        if (bl) {
            var3_3 += tLId.Fx(block.getY() - block2.getY());
        }
        return (int)var3_3;
    }

    public static PBUD<Block> yIkA(Chunk chunk) {
        return new PBUD<Block>((Iterator<Block>)tLId.Fx(new FVfT(chunk.getBlock(0, 0, 0).getLocation(), chunk.getBlock(15, 255, 15).getLocation())));
    }

    public static World JRFt(World world) {
        return tLId.Fx(world.getName());
    }

    public static World halY(World world) {
        return tLId.Fx(world.getName());
    }

    public static Block ssMm(Block block) {
        return tLId.halY(block.getWorld()).getBlockAt(block.getX(), block.getY(), block.getZ());
    }

    public static Location Ralc(Location location) {
        return new Location(tLId.halY((World)tLId.Fx(location)), (double)tLId.Fx(location), (double)tLId.Fx(location), (double)tLId.Fx(location));
    }

    public static Chunk qArm(Chunk chunk) {
        return tLId.halY(chunk.getWorld()).getChunkAt(chunk.getX(), chunk.getZ());
    }

    public static XAel BIor(String string) {
        Object object;
        String string2;
        Object object2;
        block12 : {
            object = null;
            object2 = tLId.Fx(false);
            String string3 = KDGY$JAHk.Y("\u41b6");
            string2 = KDGY$JAHk.Y("\u41b6");
            if (tLId.Fx(string, KDGY$JAHk.Y("\u41bc")) != false) {
                string3 = ((String[])tLId.Fx(string, KDGY$JAHk.Y("\u41bc")))[0];
                string2 = ((String[])tLId.Fx(string, KDGY$JAHk.Y("\u41bc")))[1];
            } else {
                string3 = string;
            }
            try {
                object = tLId.Fx(tLId.Fx(tLId.Fx(string3)));
                if (object != null) break block12;
                try {
                    object = tLId.Fx(tLId.Fx(string3));
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
                    object = tLId.Fx(tLId.Fx(string3));
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
            object2 = tLId.Fx(tLId.Fx(tLId.Fx(string2)));
        }
        catch (Exception exception) {
            object2 = tLId.Fx(false);
        }
        return new XAel((Material)object, (Byte)object2);
    }

    public static /* varargs */ Block[] mXJp(Block block, BlockFace ... arrblockFace) {
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

    public static void mXJp(Block block, Material material, MaterialData materialData) {
        tLId.mXJp(block, material, materialData, true);
    }

    public static void mXJp(Block block, Material material, MaterialData materialData, boolean bl) {
        block.setTypeIdAndData((int)tLId.Fx(material), (byte)tLId.Fx(materialData), bl);
    }

    public static void mXJp(Block block, Material material, int n) {
        tLId.mXJp(block, material, n, true);
    }

    public static void mXJp(Block block, Material material, int n, boolean bl) {
        block.setTypeIdAndData((int)tLId.Fx(material), (byte)n, bl);
    }

    public static void mXJp(Block block, MaterialData materialData) {
        block.setData((byte)tLId.Fx(materialData));
    }

    public static void mXJp(Block block, MaterialData materialData, boolean bl) {
        block.setData((byte)tLId.Fx(materialData), bl);
    }

    public static int mXJp(PotionEffectType potionEffectType, Collection<PotionEffect> collection) {
        Object object = 0;
        for (PotionEffect potionEffect : collection) {
            if (tLId.Fx(tLId.Fx(potionEffect), potionEffectType) == false) continue;
            if (tLId.Fx(potionEffect) + true <= object) continue;
            object = tLId.Fx(potionEffect) + true;
        }
        return (int)object;
    }

    public static PBUD<Chunk> Fomb(Chunk chunk) {
        PBUD<Chunk> pBUD = new PBUD<Chunk>();
        tLId.Fx(pBUD, chunk.getWorld().getChunkAt(chunk.getX() + 1, chunk.getZ()));
        tLId.Fx(pBUD, chunk.getWorld().getChunkAt(chunk.getX() - 1, chunk.getZ()));
        tLId.Fx(pBUD, chunk.getWorld().getChunkAt(chunk.getX(), chunk.getZ() + 1));
        tLId.Fx(pBUD, chunk.getWorld().getChunkAt(chunk.getX(), chunk.getZ() - 1));
        return pBUD;
    }

    public static PBUD<Block> yIkI(Block block) {
        PBUD<Block> pBUD = new PBUD<Block>();
        tLId.Fx(pBUD, block.getRelative((BlockFace)yy.p(585630090)));
        tLId.Fx(pBUD, block.getRelative((BlockFace)yy.p(-620625480)));
        tLId.Fx(pBUD, block.getRelative((BlockFace)yy.p(425197958)));
        tLId.Fx(pBUD, block.getRelative((BlockFace)yy.p(-1154285173)));
        tLId.Fx(pBUD, block.getRelative((BlockFace)yy.p(861340045)));
        tLId.Fx(pBUD, block.getRelative((BlockFace)yy.p(2127036812)));
        return pBUD;
    }

    public static Location SnAm(Location location) {
        reference var1_1;
        reference var2_2 = var1_1 = tLId.Fx(location);
        while (var2_2 > 0) {
            reference var3_3 = var2_2 - true;
            Material material = tLId.Fx(new Location((World)tLId.Fx(location), (double)tLId.Fx(location), (double)var3_3, (double)tLId.Fx(location))).getType();
            if (tLId.Fx(material, (Material)yy.p(1934035000)) == false) {
                if (tLId.Fx(material, (Material)yy.p(-1920924434)) == false) {
                    if (tLId.Fx(material, (Material)yy.p(-684063501)) == false) {
                        if (tLId.Fx(material, (Material)yy.p(1449066994)) == false) {
                            if (tLId.Fx(material, (Material)yy.p(1181483495)) == false) {
                                return new Location((World)tLId.Fx(location), (double)tLId.Fx(location), (double)(var3_3 + true), (double)tLId.Fx(location));
                            }
                        }
                    }
                }
            }
            --var2_2;
        }
        return null;
    }

    public static PBUD<Chunk> yJLL(Chunk chunk, int n) {
        PBUD<Chunk> pBUD = new PBUD<Chunk>();
        int n2 = chunk.getX() - n + 1;
        while (n2 < chunk.getX() + n) {
            int n3 = chunk.getZ() - n + 1;
            while (n3 < chunk.getZ() + n) {
                tLId.Fx(pBUD, chunk.getWorld().getChunkAt(n2, n3));
                ++n3;
            }
            ++n2;
        }
        tLId.Fx(pBUD, chunk);
        return pBUD;
    }

    public static PBUD<Block> mXJp(Block block, int n) {
        PBUD<Block> pBUD = new PBUD<Block>();
        int n2 = block.getX() - n + 1;
        while (n2 < block.getX() + n) {
            int n3 = block.getZ() - n + 1;
            while (n3 < block.getZ() + n) {
                tLId.Fx(pBUD, block.getWorld().getBlockAt(n2, block.getY(), n3));
                ++n3;
            }
            ++n2;
        }
        tLId.Fx(pBUD, block);
        return pBUD;
    }

    public static Entity mXJp(Entity entity, double d, double d2) {
        if (d2 < 1.0) {
            d2 = 1.0;
        }
        if (d < 1.0) {
            d = 1.0;
        }
        Object object = tLId.Fx(d2);
        Entity[] arrentity = new Entity[1];
        tLId.Fx(new tLId$1((Location)tLId.Fx(tLId.Fx(entity.getLocation()), 0.5, 0.5, 0.5), (Vector)tLId.Fx(entity.getLocation()), (Double)tLId.Fx(d), (Double)tLId.Fx(1.0), (Double)object, entity, arrentity));
        return arrentity[0];
    }

    public static boolean mXJp(Entity entity, Entity entity2, double d, double d2) {
        Entity entity3 = tLId.mXJp(entity, d, d2);
        if (entity3 == null) {
            return false;
        }
        return (boolean)tLId.Fx(entity3, entity2);
    }

    public static double mXJp(Vector vector, Vector vector2) {
        return (double)tLId.Fx(vector, vector2);
    }

    private static Object Fx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

