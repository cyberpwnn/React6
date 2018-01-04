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

public class FNbH {
    public static boolean ktHX(Block block) {
        Object object = FNbH.zP(FNbH.Mkpo(block));
        while (object.hasNext()) {
            Block block2 = (Block)object.next();
            if (FNbH.zP(block2.getType()) == false) continue;
            return true;
        }
        return false;
    }

    public static void yJLS(ItemStack itemStack, Color color) {
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta)FNbH.zP(itemStack);
        leatherArmorMeta.setColor(color);
        FNbH.zP(itemStack, leatherArmorMeta);
    }

    public static Entity Jbjx(int n) {
        Iterator iterator = FNbH.zP().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            for (Entity entity : world.getEntities()) {
                if (entity.getEntityId() != n) continue;
                return entity;
            }
        }
        return null;
    }

    public static int yJLS(Player player, OrkN orkN) {
        int n = 0;
        ItemStack[] arritemStack = player.getInventory().getContents();
        int n2 = arritemStack.length;
        int n3 = 0;
        while (n3 < n2) {
            ItemStack itemStack = arritemStack[n3];
            if (itemStack != null) {
                if (FNbH.zP(itemStack) == false) {
                    if (FNbH.zP(FNbH.zP(itemStack), FNbH.zP(orkN)) != false) {
                        if ((Object)(FNbH.zP(FNbH.zP(itemStack)) == -1 ? false : (Object)FNbH.zP(FNbH.zP(itemStack))) == FNbH.zP(FNbH.zP(orkN))) {
                            n += FNbH.zP(itemStack);
                        }
                    }
                }
            }
            ++n3;
        }
        return n;
    }

    public static boolean yJLS(Player player, OrkN orkN, int n) {
        if (FNbH.yJLS(player, orkN) >= n) {
            return true;
        }
        return false;
    }

    public static int HeSD(Block block) {
        return block.getX() - (block.getChunk().getX() << 4);
    }

    public static int Ipep(Block block) {
        return block.getY();
    }

    public static void UtIU(Location location, int n) {
        ((ExperienceOrb)FNbH.zP(location).spawn(location, ExperienceOrb.class)).setExperience(n);
    }

    public static int qcvH(Block block) {
        return block.getZ() - (block.getChunk().getZ() << 4);
    }

    public static void UtIU(Player player, OrkN orkN, int n) {
        if (FNbH.yJLS(player, orkN, n)) {
            int n2 = 0;
            while (n2 < n) {
                ItemStack[] arritemStack = new ItemStack[1];
                arritemStack[0] = new ItemStack((Material)FNbH.zP(orkN), 1, 0, (Byte)FNbH.zP(orkN));
                player.getInventory().removeItem(arritemStack);
                ++n2;
            }
        }
    }

    public static int yJLS(Location location, Location location2, boolean bl) {
        reference var3_3 = FNbH.zP(FNbH.zP(location) - FNbH.zP(location2));
        var3_3 += FNbH.zP(FNbH.zP(location) - FNbH.zP(location2));
        if (bl) {
            var3_3 += FNbH.zP(FNbH.zP(location) - FNbH.zP(location2));
        }
        return (int)var3_3;
    }

    public static feCR<Location> xykf(Location location) {
        feCR<Location> feCR2 = new feCR<Location>();
        FNbH.zP(feCR2, FNbH.zP(FNbH.zP(location), 1.0, 0.0, 0.0));
        FNbH.zP(feCR2, FNbH.zP(FNbH.zP(location), 0.0, 0.0, 1.0));
        FNbH.zP(feCR2, FNbH.zP(FNbH.zP(location), -1.0, 0.0, 0.0));
        FNbH.zP(feCR2, FNbH.zP(FNbH.zP(location), 0.0, 0.0, -1.0));
        return feCR2;
    }

    public static int yJLS(Block block, Block block2, boolean bl) {
        reference var3_3 = FNbH.zP(block.getX() - block2.getX());
        var3_3 += FNbH.zP(block.getZ() - block2.getZ());
        if (bl) {
            var3_3 += FNbH.zP(block.getY() - block2.getY());
        }
        return (int)var3_3;
    }

    public static feCR<Block> xykf(Chunk chunk) {
        return new feCR<Block>((Iterator<Block>)FNbH.zP(new Kwaa(chunk.getBlock(0, 0, 0).getLocation(), chunk.getBlock(15, 255, 15).getLocation())));
    }

    public static World ooQj(World world) {
        return FNbH.zP(world.getName());
    }

    public static World IpeM(World world) {
        return FNbH.zP(world.getName());
    }

    public static Block UQfI(Block block) {
        return FNbH.IpeM(block.getWorld()).getBlockAt(block.getX(), block.getY(), block.getZ());
    }

    public static Location IFQY(Location location) {
        return new Location(FNbH.IpeM((World)FNbH.zP(location)), (double)FNbH.zP(location), (double)FNbH.zP(location), (double)FNbH.zP(location));
    }

    public static Chunk IFQY(Chunk chunk) {
        return FNbH.IpeM(chunk.getWorld()).getChunkAt(chunk.getX(), chunk.getZ());
    }

    public static OrkN yuDM(String string) {
        Object object;
        String string2;
        Object object2;
        block12 : {
            object = null;
            object2 = FNbH.zP(false);
            String string3 = FMkR$WjFM.a("\uac63");
            string2 = FMkR$WjFM.a("\uac63");
            if (FNbH.zP(string, FMkR$WjFM.a("\uac69")) != false) {
                string3 = ((String[])FNbH.zP(string, FMkR$WjFM.a("\uac69")))[0];
                string2 = ((String[])FNbH.zP(string, FMkR$WjFM.a("\uac69")))[1];
            } else {
                string3 = string;
            }
            try {
                object = FNbH.zP(FNbH.zP(FNbH.zP(string3)));
                if (object != null) break block12;
                try {
                    object = FNbH.zP(FNbH.zP(string3));
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
                    object = FNbH.zP(FNbH.zP(string3));
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
            object2 = FNbH.zP(FNbH.zP(FNbH.zP(string2)));
        }
        catch (Exception exception) {
            object2 = FNbH.zP(false);
        }
        return new OrkN((Material)object, (Byte)object2);
    }

    public static /* varargs */ Block[] yJLS(Block block, BlockFace ... arrblockFace) {
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

    public static void yJLS(Block block, Material material, MaterialData materialData) {
        FNbH.yJLS(block, material, materialData, true);
    }

    public static void yJLS(Block block, Material material, MaterialData materialData, boolean bl) {
        block.setTypeIdAndData((int)FNbH.zP(material), (byte)FNbH.zP(materialData), bl);
    }

    public static void yJLS(Block block, Material material, int n) {
        FNbH.yJLS(block, material, n, true);
    }

    public static void yJLS(Block block, Material material, int n, boolean bl) {
        block.setTypeIdAndData((int)FNbH.zP(material), (byte)n, bl);
    }

    public static void yJLS(Block block, MaterialData materialData) {
        block.setData((byte)FNbH.zP(materialData));
    }

    public static void yJLS(Block block, MaterialData materialData, boolean bl) {
        block.setData((byte)FNbH.zP(materialData), bl);
    }

    public static int yJLS(PotionEffectType potionEffectType, Collection<PotionEffect> collection) {
        Object object = 0;
        for (PotionEffect potionEffect : collection) {
            if (FNbH.zP(FNbH.zP(potionEffect), potionEffectType) == false) continue;
            if (FNbH.zP(potionEffect) + true <= object) continue;
            object = FNbH.zP(potionEffect) + true;
        }
        return (int)object;
    }

    public static feCR<Chunk> uVol(Chunk chunk) {
        feCR<Chunk> feCR2 = new feCR<Chunk>();
        FNbH.zP(feCR2, chunk.getWorld().getChunkAt(chunk.getX() + 1, chunk.getZ()));
        FNbH.zP(feCR2, chunk.getWorld().getChunkAt(chunk.getX() - 1, chunk.getZ()));
        FNbH.zP(feCR2, chunk.getWorld().getChunkAt(chunk.getX(), chunk.getZ() + 1));
        FNbH.zP(feCR2, chunk.getWorld().getChunkAt(chunk.getX(), chunk.getZ() - 1));
        return feCR2;
    }

    public static feCR<Block> Mkpo(Block block) {
        feCR<Block> feCR2 = new feCR<Block>();
        FNbH.zP(feCR2, block.getRelative((BlockFace)o.k(1715290581)));
        FNbH.zP(feCR2, block.getRelative((BlockFace)o.k(315245003)));
        FNbH.zP(feCR2, block.getRelative((BlockFace)o.k(-1597685287)));
        FNbH.zP(feCR2, block.getRelative((BlockFace)o.k(-1036828200)));
        FNbH.zP(feCR2, block.getRelative((BlockFace)o.k(1922515418)));
        FNbH.zP(feCR2, block.getRelative((BlockFace)o.k(1460290007)));
        return feCR2;
    }

    public static Location uVol(Location location) {
        reference var1_1;
        reference var2_2 = var1_1 = FNbH.zP(location);
        while (var2_2 > 0) {
            reference var3_3 = var2_2 - true;
            Material material = FNbH.zP(new Location((World)FNbH.zP(location), (double)FNbH.zP(location), (double)var3_3, (double)FNbH.zP(location))).getType();
            if (FNbH.zP(material, (Material)o.k(-1236315249)) == false) {
                if (FNbH.zP(material, (Material)o.k(-1143252726)) == false) {
                    if (FNbH.zP(material, (Material)o.k(-1895999223)) == false) {
                        if (FNbH.zP(material, (Material)o.k(-98346629)) == false) {
                            if (FNbH.zP(material, (Material)o.k(1093753096)) == false) {
                                return new Location((World)FNbH.zP(location), (double)FNbH.zP(location), (double)(var3_3 + true), (double)FNbH.zP(location));
                            }
                        }
                    }
                }
            }
            --var2_2;
        }
        return null;
    }

    public static feCR<Chunk> biLo(Chunk chunk, int n) {
        feCR<Chunk> feCR2 = new feCR<Chunk>();
        int n2 = chunk.getX() - n + 1;
        while (n2 < chunk.getX() + n) {
            int n3 = chunk.getZ() - n + 1;
            while (n3 < chunk.getZ() + n) {
                if (chunk.getWorld().isChunkLoaded(n2, n3)) {
                    FNbH.zP(feCR2, chunk.getWorld().getChunkAt(n2, n3));
                }
                ++n3;
            }
            ++n2;
        }
        FNbH.zP(feCR2, chunk);
        return feCR2;
    }

    public static feCR<Block> yJLS(Block block, int n) {
        feCR<Block> feCR2 = new feCR<Block>();
        int n2 = block.getX() - n + 1;
        while (n2 < block.getX() + n) {
            int n3 = block.getZ() - n + 1;
            while (n3 < block.getZ() + n) {
                FNbH.zP(feCR2, block.getWorld().getBlockAt(n2, block.getY(), n3));
                ++n3;
            }
            ++n2;
        }
        FNbH.zP(feCR2, block);
        return feCR2;
    }

    public static Entity yJLS(Entity entity, double d, double d2) {
        if (d2 < 1.0) {
            d2 = 1.0;
        }
        if (d < 1.0) {
            d = 1.0;
        }
        Object object = FNbH.zP(d2);
        Entity[] arrentity = new Entity[1];
        FNbH.zP(new FNbH$1((Location)FNbH.zP(FNbH.zP(entity.getLocation()), 0.5, 0.5, 0.5), (Vector)FNbH.zP(entity.getLocation()), (Double)FNbH.zP(d), (Double)FNbH.zP(1.0), (Double)object, entity, arrentity));
        return arrentity[0];
    }

    public static boolean yJLS(Entity entity, Entity entity2, double d, double d2) {
        Entity entity3 = FNbH.yJLS(entity, d, d2);
        if (entity3 == null) {
            return false;
        }
        return (boolean)FNbH.zP(entity3, entity2);
    }

    public static double yJLS(Vector vector, Vector vector2) {
        return (double)FNbH.zP(vector, vector2);
    }

    private static Object zP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

