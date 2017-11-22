/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Random;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class gVhV {
    private Location WHQb;
    private Double BKXC;

    public static boolean ssNb(Location location, Location location2, double d) {
        return new gVhV(location, (Double)gVhV.JE(d)).BkpW(location2);
    }

    public gVhV(Location location, Double d) {
        this.WHQb = location;
        this.BKXC = d;
    }

    public gWIG Oixf() {
        return new gWIG((Location)gVhV.JE(gVhV.JE((Location)cv.b(this, 866252559)), gVhV.JE((Double)cv.b(this, 953939726)), gVhV.JE((Double)cv.b(this, 953939726)), gVhV.JE((Double)cv.b(this, 953939726))), (Location)gVhV.JE(gVhV.JE((Location)cv.b(this, 866252559)), gVhV.JE((Double)cv.b(this, 953939726)), gVhV.JE((Double)cv.b(this, 953939726)), gVhV.JE((Double)cv.b(this, 953939726))));
    }

    public gVhV(Location location, Integer n) {
        this.WHQb = location;
        this.BKXC = gVhV.JE(gVhV.JE(n));
    }

    public Double YoSa(Location location) {
        reference var2_2;
        reference var4_3 = var2_2 = gVhV.JE((Location)cv.b(this, 866252559), location);
        int n = 0;
        while (n < 3) {
            var4_3 = (var2_2 / var4_3 + var4_3) / 2.0;
            ++n;
        }
        return gVhV.JE(var4_3);
    }

    public Double jhSt(Location location) {
        return gVhV.JE(gVhV.JE((Location)cv.b(this, 866252559), location));
    }

    public boolean BkpW(Location location) {
        if (gVhV.JE((Location)cv.b(this, 866252559), location) <= gVhV.JE((Double)cv.b(this, 953939726)) * gVhV.JE((Double)cv.b(this, 953939726))) {
            return true;
        }
        return false;
    }

    public boolean hasEntities() {
        if (this.cuSa().length > 0) {
            return true;
        }
        return false;
    }

    public Entity[] OXeK(EntityType entityType) {
        wfPa<Entity> wfPa2 = new wfPa<Entity>((T[])this.cuSa());
        Object object = gVhV.JE(gVhV.JE(wfPa2));
        while (object.hasNext()) {
            Entity entity = (Entity)object.next();
            if (gVhV.JE(entity.getType(), entityType) != false) continue;
            gVhV.JE(wfPa2, entity);
        }
        return (Entity[])((Object[])gVhV.JE(wfPa2, new Entity[gVhV.JE(wfPa2)]));
    }

    public Entity[] ssNb(Class<? extends Entity> class_) {
        wfPa<Entity> wfPa2 = new wfPa<Entity>((T[])this.cuSa());
        Object object = gVhV.JE(gVhV.JE(wfPa2));
        while (object.hasNext()) {
            Entity entity = (Entity)object.next();
            if (gVhV.JE(gVhV.JE(entity), class_) != false) continue;
            gVhV.JE(wfPa2, entity);
        }
        return (Entity[])((Object[])gVhV.JE(wfPa2, new Entity[gVhV.JE(wfPa2)]));
    }

    public Entity[] cuSa() {
        try {
            int n = (int)(gVhV.JE((Double)cv.b(this, 953939726)) < 16.0 ? 1.0 : (Object)((gVhV.JE((Double)cv.b(this, 953939726)) - gVhV.JE((Double)cv.b(this, 953939726)) % 16.0) / 16.0));
            HashSet hashSet = new HashSet();
            int n2 = 0 - n;
            while (n2 <= n) {
                int n3 = 0 - n;
                while (n3 <= n) {
                    Object object = gVhV.JE((Location)cv.b(this, 866252559));
                    Object object2 = gVhV.JE((Location)cv.b(this, 866252559));
                    Object object3 = gVhV.JE((Location)cv.b(this, 866252559));
                    if (gVhV.JE((Location)cv.b(this, 866252559)).isChunkLoaded((int)(object + (n2 << 4) >> 4), (int)(object3 + (n3 << 4) >> 4))) {
                        Entity[] arrentity = gVhV.JE(new Location((World)gVhV.JE((Location)cv.b(this, 866252559)), (double)(object + (n2 << 4)), (double)object2, (double)(object3 + (n3 << 4)))).getEntities();
                        int n4 = arrentity.length;
                        int n5 = 0;
                        while (n5 < n4) {
                            Entity entity = arrentity[n5];
                            if (gVhV.JE(entity.getLocation(), (Location)cv.b(this, 866252559)) <= gVhV.JE((Double)cv.b(this, 953939726)) * gVhV.JE((Double)cv.b(this, 953939726))) {
                                if (gVhV.JE(entity.getLocation()) != gVhV.JE((Location)cv.b(this, 866252559))) {
                                    gVhV.JE(hashSet, entity);
                                }
                            }
                            ++n5;
                        }
                    }
                    ++n3;
                }
                ++n2;
            }
            return (Entity[])((Object[])gVhV.JE(hashSet, new Entity[gVhV.JE(hashSet)]));
        }
        catch (Exception exception) {
            return (Entity[])((Object[])gVhV.JE(new wfPa(), new Entity[0]));
        }
    }

    public Player[] WqqP() {
        wfPa wfPa2 = new wfPa();
        Entity[] arrentity = this.cuSa();
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (gVhV.JE(entity.getType(), (EntityType)cv.e(-209907400)) != false) {
                gVhV.JE(wfPa2, (Player)entity);
            }
            ++n2;
        }
        return (Player[])((Object[])gVhV.JE(wfPa2, new Player[gVhV.JE(wfPa2)]));
    }

    public Location getLocation() {
        return (Location)cv.b(this, 866252559);
    }

    public void lCdp(Location location) {
        cv.e(this, 866252559, (Object)location);
    }

    public Double gFKj() {
        return (Double)cv.b(this, 953939726);
    }

    public void DYFV(Double d) {
        cv.e(this, 953939726, d);
    }

    public Location ktYs() {
        Random random = new Random();
        reference var2_2 = gVhV.JE((Double)cv.b(this, 953939726)) * ((gVhV.JE(random) - 0.5) * 2.0);
        reference var4_3 = gVhV.JE((Double)cv.b(this, 953939726)) * ((gVhV.JE(random) - 0.5) * 2.0);
        reference var6_4 = gVhV.JE((Double)cv.b(this, 953939726)) * ((gVhV.JE(random) - 0.5) * 2.0);
        return gVhV.JE(gVhV.JE((Location)cv.b(this, 866252559)), var2_2, var4_3, var6_4);
    }

    private static Object JE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

