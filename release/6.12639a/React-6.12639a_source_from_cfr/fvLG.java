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

public class fvLG {
    private Location COTa;
    private Double fUWQ;

    public static boolean yJLS(Location location, Location location2, double d) {
        return new fvLG(location, (Double)fvLG.NT(d)).ktHX(location2);
    }

    public fvLG(Location location, Double d) {
        this.COTa = location;
        this.fUWQ = d;
    }

    public Kwaa HfJm() {
        return new Kwaa((Location)fvLG.NT(fvLG.NT((Location)o.a(this, 668421194)), fvLG.NT((Double)o.a(this, 1947290697)), fvLG.NT((Double)o.a(this, 1947290697)), fvLG.NT((Double)o.a(this, 1947290697))), (Location)fvLG.NT(fvLG.NT((Location)o.a(this, 668421194)), fvLG.NT((Double)o.a(this, 1947290697)), fvLG.NT((Double)o.a(this, 1947290697)), fvLG.NT((Double)o.a(this, 1947290697))));
    }

    public fvLG(Location location, Integer n) {
        this.COTa = location;
        this.fUWQ = fvLG.NT(fvLG.NT(n));
    }

    public Double KTiK(Location location) {
        reference var2_2;
        reference var4_3 = var2_2 = fvLG.NT((Location)o.a(this, 668421194), location);
        int n = 0;
        while (n < 3) {
            var4_3 = (var2_2 / var4_3 + var4_3) / 2.0;
            ++n;
        }
        return fvLG.NT(var4_3);
    }

    public Double GPlk(Location location) {
        return fvLG.NT(fvLG.NT((Location)o.a(this, 668421194), location));
    }

    public boolean ktHX(Location location) {
        if (fvLG.NT((Location)o.a(this, 668421194), location) <= fvLG.NT((Double)o.a(this, 1947290697)) * fvLG.NT((Double)o.a(this, 1947290697))) {
            return true;
        }
        return false;
    }

    public boolean hasEntities() {
        if (this.FFQt().length > 0) {
            return true;
        }
        return false;
    }

    public Entity[] VwLY(EntityType entityType) {
        feCR<Entity> feCR2 = new feCR<Entity>((T[])this.FFQt());
        Object object = fvLG.NT(fvLG.NT(feCR2));
        while (object.hasNext()) {
            Entity entity = (Entity)object.next();
            if (fvLG.NT(entity.getType(), entityType) != false) continue;
            fvLG.NT(feCR2, entity);
        }
        return (Entity[])((Object[])fvLG.NT(feCR2, new Entity[fvLG.NT(feCR2)]));
    }

    public Entity[] yJLS(Class<? extends Entity> class_) {
        feCR<Entity> feCR2 = new feCR<Entity>((T[])this.FFQt());
        Object object = fvLG.NT(fvLG.NT(feCR2));
        while (object.hasNext()) {
            Entity entity = (Entity)object.next();
            if (fvLG.NT(fvLG.NT(entity), class_) != false) continue;
            fvLG.NT(feCR2, entity);
        }
        return (Entity[])((Object[])fvLG.NT(feCR2, new Entity[fvLG.NT(feCR2)]));
    }

    public Entity[] FFQt() {
        try {
            int n = (int)(fvLG.NT((Double)o.a(this, 1947290697)) < 16.0 ? 1.0 : (Object)((fvLG.NT((Double)o.a(this, 1947290697)) - fvLG.NT((Double)o.a(this, 1947290697)) % 16.0) / 16.0));
            HashSet hashSet = new HashSet();
            int n2 = 0 - n;
            while (n2 <= n) {
                int n3 = 0 - n;
                while (n3 <= n) {
                    Object object = fvLG.NT((Location)o.a(this, 668421194));
                    Object object2 = fvLG.NT((Location)o.a(this, 668421194));
                    Object object3 = fvLG.NT((Location)o.a(this, 668421194));
                    if (fvLG.NT((Location)o.a(this, 668421194)).isChunkLoaded((int)(object + (n2 << 4) >> 4), (int)(object3 + (n3 << 4) >> 4))) {
                        Entity[] arrentity = fvLG.NT(new Location((World)fvLG.NT((Location)o.a(this, 668421194)), (double)(object + (n2 << 4)), (double)object2, (double)(object3 + (n3 << 4)))).getEntities();
                        int n4 = arrentity.length;
                        int n5 = 0;
                        while (n5 < n4) {
                            Entity entity = arrentity[n5];
                            if (fvLG.NT(entity.getLocation(), (Location)o.a(this, 668421194)) <= fvLG.NT((Double)o.a(this, 1947290697)) * fvLG.NT((Double)o.a(this, 1947290697))) {
                                if (fvLG.NT(entity.getLocation()) != fvLG.NT((Location)o.a(this, 668421194))) {
                                    fvLG.NT(hashSet, entity);
                                }
                            }
                            ++n5;
                        }
                    }
                    ++n3;
                }
                ++n2;
            }
            return (Entity[])((Object[])fvLG.NT(hashSet, new Entity[fvLG.NT(hashSet)]));
        }
        catch (Exception exception) {
            return (Entity[])((Object[])fvLG.NT(new feCR(), new Entity[0]));
        }
    }

    public Player[] brVS() {
        feCR feCR2 = new feCR();
        Entity[] arrentity = this.FFQt();
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (fvLG.NT(entity.getType(), (EntityType)o.k(1458914430)) != false) {
                fvLG.NT(feCR2, (Player)entity);
            }
            ++n2;
        }
        return (Player[])((Object[])fvLG.NT(feCR2, new Player[fvLG.NT(feCR2)]));
    }

    public Location getLocation() {
        return (Location)o.a(this, 668421194);
    }

    public void HeSD(Location location) {
        o.v(this, 668421194, (Object)location);
    }

    public Double tmxT() {
        return (Double)o.a(this, 1947290697);
    }

    public void biLo(Double d) {
        o.v(this, 1947290697, d);
    }

    public Location uiLJ() {
        Random random = new Random();
        reference var2_2 = fvLG.NT((Double)o.a(this, 1947290697)) * ((fvLG.NT(random) - 0.5) * 2.0);
        reference var4_3 = fvLG.NT((Double)o.a(this, 1947290697)) * ((fvLG.NT(random) - 0.5) * 2.0);
        reference var6_4 = fvLG.NT((Double)o.a(this, 1947290697)) * ((fvLG.NT(random) - 0.5) * 2.0);
        return fvLG.NT(fvLG.NT((Location)o.a(this, 668421194)), var2_2, var4_3, var6_4);
    }

    private static Object NT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

