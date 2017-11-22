/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
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
import java.util.List;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

class EvBS$1
extends vIXT {
    final /* synthetic */ World piwi;
    final /* synthetic */ EvBS JkoN;

    EvBS$1(EvBS evBS, World world) {
        this.JkoN = evBS;
        this.piwi = world;
    }

    @Override
    public void run() {
        double d = 0.0;
        Object object = EvBS$1.Hg(EvBS$1.Hg(new wfPa(((World)cv.b(this, 1090064863)).getEntities())));
        while (object.hasNext()) {
            Entity entity = (Entity)object.next();
            KeoU keoU = new KeoU();
            EvBS$1.Hg(keoU);
            Object object2 = EvBS$1.Hg(EvBS$1.Hg(new wfPa(((World)cv.b(this, 1090064863)).getEntities())));
            while (object2.hasNext()) {
                Entity entity2;
                block5 : {
                    block4 : {
                        entity2 = (Entity)object2.next();
                        if (!(entity instanceof Item) || !(entity2 instanceof Item) || entity.isDead() || entity2.isDead() || entity.getTicksLived() <= (Integer)cv.e(-1506471572) || entity2.getTicksLived() <= (Integer)cv.e(-1506471572)) continue;
                        if (EvBS$1.Hg(((Item)entity).getItemStack()) == true) break block4;
                        if (EvBS$1.Hg(((Item)entity2).getItemStack()) != true) break block5;
                    }
                    EvBS$1.Hg((EvBS)cv.b(this, 940511259), (Item)entity, (Item)entity2);
                    continue;
                }
                EvBS$1.Hg((EvBS)cv.b(this, 940511259), (Item)entity, (Item)entity2);
            }
            EvBS$1.Hg(keoU);
            if ((d += (Object)EvBS$1.Hg(keoU)) <= 5.0) continue;
        }
    }

    private static Object Hg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

