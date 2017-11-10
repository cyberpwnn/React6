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

public class RIGg {
    private Location WjNN;
    private Double lwjM;

    public static boolean mXJp(Location location, Location location2, double d) {
        return new RIGg(location, (Double)RIGg.Ps(d)).halY(location2);
    }

    public RIGg(Location location, Double d) {
        this.WjNN = location;
        this.lwjM = d;
    }

    public FVfT gNSr() {
        return new FVfT((Location)RIGg.Ps(RIGg.Ps((Location)yy.h(this, 1376584685)), RIGg.Ps((Double)yy.h(this, 392037350)), RIGg.Ps((Double)yy.h(this, 392037350)), RIGg.Ps((Double)yy.h(this, 392037350))), (Location)RIGg.Ps(RIGg.Ps((Location)yy.h(this, 1376584685)), RIGg.Ps((Double)yy.h(this, 392037350)), RIGg.Ps((Double)yy.h(this, 392037350)), RIGg.Ps((Double)yy.h(this, 392037350))));
    }

    public RIGg(Location location, Integer n) {
        this.WjNN = location;
        this.lwjM = RIGg.Ps(RIGg.Ps(n));
    }

    public Double qdWJ(Location location) {
        reference var2_2;
        reference var4_3 = var2_2 = RIGg.Ps((Location)yy.h(this, 1376584685), location);
        int n = 0;
        while (n < 3) {
            var4_3 = (var2_2 / var4_3 + var4_3) / 2.0;
            ++n;
        }
        return RIGg.Ps(var4_3);
    }

    public Double JRFt(Location location) {
        return RIGg.Ps(RIGg.Ps((Location)yy.h(this, 1376584685), location));
    }

    public boolean halY(Location location) {
        if (RIGg.Ps((Location)yy.h(this, 1376584685), location) <= RIGg.Ps((Double)yy.h(this, 392037350)) * RIGg.Ps((Double)yy.h(this, 392037350))) {
            return true;
        }
        return false;
    }

    public boolean hasEntities() {
        if (this.LWxB().length > 0) {
            return true;
        }
        return false;
    }

    public Entity[] SnBs(EntityType entityType) {
        PBUD<Entity> pBUD = new PBUD<Entity>((T[])this.LWxB());
        Object object = RIGg.Ps(RIGg.Ps(pBUD));
        while (object.hasNext()) {
            Entity entity = (Entity)object.next();
            if (RIGg.Ps(entity.getType(), entityType) != false) continue;
            RIGg.Ps(pBUD, entity);
        }
        return (Entity[])((Object[])RIGg.Ps(pBUD, new Entity[RIGg.Ps(pBUD)]));
    }

    public Entity[] mXJp(Class<? extends Entity> class_) {
        PBUD<Entity> pBUD = new PBUD<Entity>((T[])this.LWxB());
        Object object = RIGg.Ps(RIGg.Ps(pBUD));
        while (object.hasNext()) {
            Entity entity = (Entity)object.next();
            if (RIGg.Ps(RIGg.Ps(entity), class_) != false) continue;
            RIGg.Ps(pBUD, entity);
        }
        return (Entity[])((Object[])RIGg.Ps(pBUD, new Entity[RIGg.Ps(pBUD)]));
    }

    public Entity[] LWxB() {
        try {
            int n = (int)(RIGg.Ps((Double)yy.h(this, 392037350)) < 16.0 ? 1.0 : (Object)((RIGg.Ps((Double)yy.h(this, 392037350)) - RIGg.Ps((Double)yy.h(this, 392037350)) % 16.0) / 16.0));
            HashSet hashSet = new HashSet();
            int n2 = 0 - n;
            while (n2 <= n) {
                int n3 = 0 - n;
                while (n3 <= n) {
                    Object object = RIGg.Ps((Location)yy.h(this, 1376584685));
                    Object object2 = RIGg.Ps((Location)yy.h(this, 1376584685));
                    Object object3 = RIGg.Ps((Location)yy.h(this, 1376584685));
                    Entity[] arrentity = RIGg.Ps(new Location((World)RIGg.Ps((Location)yy.h(this, 1376584685)), (double)(object + (n2 << 4)), (double)object2, (double)(object3 + (n3 << 4)))).getEntities();
                    int n4 = arrentity.length;
                    int n5 = 0;
                    while (n5 < n4) {
                        Entity entity = arrentity[n5];
                        if (RIGg.Ps(entity.getLocation(), (Location)yy.h(this, 1376584685)) <= RIGg.Ps((Double)yy.h(this, 392037350)) * RIGg.Ps((Double)yy.h(this, 392037350))) {
                            if (RIGg.Ps(entity.getLocation()) != RIGg.Ps((Location)yy.h(this, 1376584685))) {
                                RIGg.Ps(hashSet, entity);
                            }
                        }
                        ++n5;
                    }
                    ++n3;
                }
                ++n2;
            }
            return (Entity[])((Object[])RIGg.Ps(hashSet, new Entity[RIGg.Ps(hashSet)]));
        }
        catch (Exception exception) {
            return (Entity[])((Object[])RIGg.Ps(new PBUD(), new Entity[0]));
        }
    }

    public Player[] wDPq() {
        PBUD pBUD = new PBUD();
        Entity[] arrentity = this.LWxB();
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (RIGg.Ps(entity.getType(), (EntityType)yy.p(-823268809)) != false) {
                RIGg.Ps(pBUD, (Player)entity);
            }
            ++n2;
        }
        return (Player[])((Object[])RIGg.Ps(pBUD, new Player[RIGg.Ps(pBUD)]));
    }

    public Location getLocation() {
        return (Location)yy.h(this, 1376584685);
    }

    public void ssMm(Location location) {
        yy.E(this, 1376584685, (Object)location);
    }

    public Double lvtr() {
        return (Double)yy.h(this, 392037350);
    }

    public void ksfs(Double d) {
        yy.E(this, 392037350, d);
    }

    public Location JtUd() {
        Random random = new Random();
        reference var2_2 = RIGg.Ps((Double)yy.h(this, 392037350)) * ((RIGg.Ps(random) - 0.5) * 2.0);
        reference var4_3 = RIGg.Ps((Double)yy.h(this, 392037350)) * ((RIGg.Ps(random) - 0.5) * 2.0);
        reference var6_4 = RIGg.Ps((Double)yy.h(this, 392037350)) * ((RIGg.Ps(random) - 0.5) * 2.0);
        return RIGg.Ps(RIGg.Ps((Location)yy.h(this, 1376584685)), var2_2, var4_3, var6_4);
    }

    private static Object Ps(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

