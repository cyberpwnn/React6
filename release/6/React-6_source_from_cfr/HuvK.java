/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.util.Vector;

public class HuvK {
    private UUID ssbd;
    private int type;
    private int ticksLived;
    private String GHqf;
    private double x;
    private double y;
    private double z;
    private double dfwH;
    private double upwg;
    private double fSkO;
    private double tLRe;
    private double RkTB;
    private double YUuA;

    public HuvK(Entity entity) {
        this.ssbd = entity.getUniqueId();
        this.type = HuvK.LS(entity.getType());
        this.ticksLived = entity.getTicksLived();
        this.GHqf = HuvK.LS(entity.getLocation()).getName();
        this.x = HuvK.LS(entity.getLocation());
        this.y = HuvK.LS(entity.getLocation());
        this.z = HuvK.LS(entity.getLocation());
        this.dfwH = HuvK.LS(entity.getVelocity());
        this.upwg = HuvK.LS(entity.getVelocity());
        this.fSkO = HuvK.LS(entity.getVelocity());
        this.tLRe = HuvK.LS(HuvK.LS(entity.getLocation()));
        this.RkTB = HuvK.LS(HuvK.LS(entity.getLocation()));
        this.YUuA = HuvK.LS(HuvK.LS(entity.getLocation()));
    }

    public void nJLQ(Entity entity) {
        entity.setTicksLived((Integer)cv.b(this, 499970846) + 2);
        Location location = new Location((World)HuvK.LS((String)cv.b(this, 1029370649)), ((Double)cv.b(this, 1913123675)).doubleValue(), ((Double)cv.b(this, -162073766)).doubleValue(), ((Double)cv.b(this, -497421499)).doubleValue());
        HuvK.LS(location, new Vector(((Double)cv.b(this, 583463748)).doubleValue(), ((Double)cv.b(this, 1771434823)).doubleValue(), ((Double)cv.b(this, 1621422918)).doubleValue()));
        Vector vector = new Vector(((Double)cv.b(this, -705367232)).doubleValue(), ((Double)cv.b(this, 942338883)).doubleValue(), ((Double)cv.b(this, 1566700354)).doubleValue());
        entity.teleport(location);
        entity.setVelocity(vector);
    }

    public int getType() {
        return (Integer)cv.b(this, 1655567181);
    }

    public void setType(int n) {
        cv.e(this, 1655567181, n);
    }

    public int getTicksLived() {
        return (Integer)cv.b(this, 499970846);
    }

    public void setTicksLived(int n) {
        cv.e(this, 499970846, n);
    }

    public String OikN() {
        return (String)cv.b(this, 1029370649);
    }

    public void setWorld(String string) {
        cv.e(this, 1029370649, string);
    }

    public double getX() {
        return (Double)cv.b(this, 1913123675);
    }

    public void setX(double d) {
        cv.e(this, 1913123675, d);
    }

    public double getY() {
        return (Double)cv.b(this, -162073766);
    }

    public void setY(double d) {
        cv.e(this, -162073766, d);
    }

    public double getZ() {
        return (Double)cv.b(this, -497421499);
    }

    public void setZ(double d) {
        cv.e(this, -497421499, d);
    }

    public double iSqp() {
        return (Double)cv.b(this, -705367232);
    }

    public void OXeK(double d) {
        cv.e(this, -705367232, d);
    }

    public double YnwU() {
        return (Double)cv.b(this, 942338883);
    }

    public void YoSa(double d) {
        cv.e(this, 942338883, d);
    }

    public double owfl() {
        return (Double)cv.b(this, 1566700354);
    }

    public void jhSt(double d) {
        cv.e(this, 1566700354, d);
    }

    public double kRIL() {
        return (Double)cv.b(this, 583463748);
    }

    public void BkpW(double d) {
        cv.e(this, 583463748, d);
    }

    public double ejJV() {
        return (Double)cv.b(this, 1771434823);
    }

    public void lCdp(double d) {
        cv.e(this, 1771434823, d);
    }

    public double UbkT() {
        return (Double)cv.b(this, 1621422918);
    }

    public void nJLQ(double d) {
        cv.e(this, 1621422918, d);
    }

    public UUID BBAa() {
        return (UUID)cv.b(this, -484707508);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        Object object = HuvK.LS((Double)cv.b(this, 583463748));
        n2 = 31 + (Object)(object ^ object >>> 32);
        object = HuvK.LS((Double)cv.b(this, 1771434823));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = HuvK.LS((Double)cv.b(this, 1621422918));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Integer)cv.b(this, 499970846);
        n2 = n2 * 31 + (Integer)cv.b(this, 1655567181);
        n2 = n2 * 31 + (Object)((UUID)cv.b(this, -484707508) == null ? 0 : (Object)HuvK.LS((UUID)cv.b(this, -484707508)));
        object = HuvK.LS((Double)cv.b(this, -705367232));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = HuvK.LS((Double)cv.b(this, 942338883));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = HuvK.LS((Double)cv.b(this, 1566700354));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Object)((String)cv.b(this, 1029370649) == null ? 0 : (Object)HuvK.LS((String)cv.b(this, 1029370649)));
        object = HuvK.LS((Double)cv.b(this, 1913123675));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = HuvK.LS((Double)cv.b(this, -162073766));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = HuvK.LS((Double)cv.b(this, -497421499));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (HuvK.LS(this) != HuvK.LS(object)) {
            return false;
        }
        HuvK huvK = (HuvK)object;
        if (HuvK.LS((Double)cv.b(this, 583463748)) != HuvK.LS((Double)cv.b(huvK, 583463748))) {
            return false;
        }
        if (HuvK.LS((Double)cv.b(this, 1771434823)) != HuvK.LS((Double)cv.b(huvK, 1771434823))) {
            return false;
        }
        if (HuvK.LS((Double)cv.b(this, 1621422918)) != HuvK.LS((Double)cv.b(huvK, 1621422918))) {
            return false;
        }
        if (((Integer)cv.b(this, 499970846)).intValue() != ((Integer)cv.b(huvK, 499970846)).intValue()) {
            return false;
        }
        if (((Integer)cv.b(this, 1655567181)).intValue() != ((Integer)cv.b(huvK, 1655567181)).intValue()) {
            return false;
        }
        if ((UUID)cv.b(this, -484707508) == null) {
            if ((UUID)cv.b(huvK, -484707508) != null) {
                return false;
            }
        } else if (HuvK.LS((UUID)cv.b(this, -484707508), (UUID)cv.b(huvK, -484707508)) == false) {
            return false;
        }
        if (HuvK.LS((Double)cv.b(this, -705367232)) != HuvK.LS((Double)cv.b(huvK, -705367232))) {
            return false;
        }
        if (HuvK.LS((Double)cv.b(this, 942338883)) != HuvK.LS((Double)cv.b(huvK, 942338883))) {
            return false;
        }
        if (HuvK.LS((Double)cv.b(this, 1566700354)) != HuvK.LS((Double)cv.b(huvK, 1566700354))) {
            return false;
        }
        if ((String)cv.b(this, 1029370649) == null) {
            if ((String)cv.b(huvK, 1029370649) != null) {
                return false;
            }
        } else if (HuvK.LS((String)cv.b(this, 1029370649), (String)cv.b(huvK, 1029370649)) == false) {
            return false;
        }
        if (HuvK.LS((Double)cv.b(this, 1913123675)) != HuvK.LS((Double)cv.b(huvK, 1913123675))) {
            return false;
        }
        if (HuvK.LS((Double)cv.b(this, -162073766)) != HuvK.LS((Double)cv.b(huvK, -162073766))) {
            return false;
        }
        if (HuvK.LS((Double)cv.b(this, -497421499)) != HuvK.LS((Double)cv.b(huvK, -497421499))) {
            return false;
        }
        return true;
    }

    private static Object LS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

