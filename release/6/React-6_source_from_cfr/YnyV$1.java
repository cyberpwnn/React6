/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Item
 *  org.bukkit.inventory.ItemStack
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

class YnyV$1
extends halY {
    final /* synthetic */ World nuVB;
    final /* synthetic */ YnyV Libg;

    YnyV$1(YnyV ynyV, World world) {
        this.Libg = ynyV;
        this.nuVB = world;
    }

    @Override
    public void run() {
        try {
            for (Chunk chunk : ((World)yy.h(this, 936897638)).getLoadedChunks()) {
                for (Entity entity : chunk.getEntities()) {
                    for (Entity entity2 : (Entity[])YnyV$1.gR(new RIGg(entity.getLocation(), (Double)YnyV$1.gR((Double)yy.p(867036264))))) {
                        block8 : {
                            block7 : {
                                if (!(entity instanceof Item) || !(entity2 instanceof Item) || entity.isDead() || entity2.isDead() || entity.getTicksLived() <= (Integer)yy.p(-1100354493) || entity2.getTicksLived() <= (Integer)yy.p(-1100354493)) continue;
                                if (YnyV$1.gR(((Item)entity).getItemStack()) == true) break block7;
                                if (YnyV$1.gR(((Item)entity2).getItemStack()) != true) break block8;
                            }
                            YnyV$1.gR((YnyV)yy.h(this, -1397232543), (Item)entity, (Item)entity2);
                            continue;
                        }
                        YnyV$1.gR((YnyV)yy.h(this, -1397232543), (Item)entity, (Item)entity2);
                    }
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static Object gR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

