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

public class bWps {
    private UUID GQps;
    private int type;
    private int ticksLived;
    private String NhHW;
    private double x;
    private double y;
    private double z;
    private double dEbd;
    private double WsCK;
    private double qBwa;
    private double qKhR;
    private double BBaN;
    private double wDiA;

    public bWps(Entity entity) {
        this.GQps = entity.getUniqueId();
        this.type = bWps.vd(entity.getType());
        this.ticksLived = entity.getTicksLived();
        this.NhHW = bWps.vd(entity.getLocation()).getName();
        this.x = bWps.vd(entity.getLocation());
        this.y = bWps.vd(entity.getLocation());
        this.z = bWps.vd(entity.getLocation());
        this.dEbd = bWps.vd(entity.getVelocity());
        this.WsCK = bWps.vd(entity.getVelocity());
        this.qBwa = bWps.vd(entity.getVelocity());
        this.qKhR = bWps.vd(bWps.vd(entity.getLocation()));
        this.BBaN = bWps.vd(bWps.vd(entity.getLocation()));
        this.wDiA = bWps.vd(bWps.vd(entity.getLocation()));
    }

    public void ktHX(Entity entity) {
        entity.setTicksLived((Integer)o.a(this, -88124466) + 2);
        Location location = new Location((World)bWps.vd((String)o.a(this, 1951093709)), ((Double)o.a(this, 1810912203)).doubleValue(), ((Double)o.a(this, -1395108902)).doubleValue(), ((Double)o.a(this, -1056812071)).doubleValue());
        bWps.vd(location, new Vector(((Double)o.a(this, 820401112)).doubleValue(), ((Double)o.a(this, 16602071)).doubleValue(), ((Double)o.a(this, 1843483606)).doubleValue()));
        Vector vector = new Vector(((Double)o.a(this, 584733652)).doubleValue(), ((Double)o.a(this, -310094893)).doubleValue(), ((Double)o.a(this, 1119310658)).doubleValue());
        entity.teleport(location);
        entity.setVelocity(vector);
    }

    public int getType() {
        return (Integer)o.a(this, 1785746241);
    }

    public void setType(int n) {
        o.v(this, 1785746241, n);
    }

    public int getTicksLived() {
        return (Integer)o.a(this, -88124466);
    }

    public void setTicksLived(int n) {
        o.v(this, -88124466, n);
    }

    public String vHyF() {
        return (String)o.a(this, 1951093709);
    }

    public void setWorld(String string) {
        o.v(this, 1951093709, string);
    }

    public double getX() {
        return (Double)o.a(this, 1810912203);
    }

    public void setX(double d) {
        o.v(this, 1810912203, d);
    }

    public double getY() {
        return (Double)o.a(this, -1395108902);
    }

    public void setY(double d) {
        o.v(this, -1395108902, d);
    }

    public double getZ() {
        return (Double)o.a(this, -1056812071);
    }

    public void setZ(double d) {
        o.v(this, -1056812071, d);
    }

    public double SKdx() {
        return (Double)o.a(this, 584733652);
    }

    public void VwLY(double d) {
        o.v(this, 584733652, d);
    }

    public double RbUQ() {
        return (Double)o.a(this, -310094893);
    }

    public void TEqA(double d) {
        o.v(this, -310094893, d);
    }

    public double BReF() {
        return (Double)o.a(this, 1119310658);
    }

    public void KTiK(double d) {
        o.v(this, 1119310658, d);
    }

    public double jpjE() {
        return (Double)o.a(this, 820401112);
    }

    public void GPlk(double d) {
        o.v(this, 820401112, d);
    }

    public double oLsv() {
        return (Double)o.a(this, 16602071);
    }

    public void ktHX(double d) {
        o.v(this, 16602071, d);
    }

    public double BdGQ() {
        return (Double)o.a(this, 1843483606);
    }

    public void HeSD(double d) {
        o.v(this, 1843483606, d);
    }

    public UUID bWps() {
        return (UUID)o.a(this, -1186573504);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        Object object = bWps.vd((Double)o.a(this, 820401112));
        n2 = 31 + (Object)(object ^ object >>> 32);
        object = bWps.vd((Double)o.a(this, 16602071));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = bWps.vd((Double)o.a(this, 1843483606));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Integer)o.a(this, -88124466);
        n2 = n2 * 31 + (Integer)o.a(this, 1785746241);
        n2 = n2 * 31 + (Object)((UUID)o.a(this, -1186573504) == null ? 0 : (Object)bWps.vd((UUID)o.a(this, -1186573504)));
        object = bWps.vd((Double)o.a(this, 584733652));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = bWps.vd((Double)o.a(this, -310094893));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = bWps.vd((Double)o.a(this, 1119310658));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Object)((String)o.a(this, 1951093709) == null ? 0 : (Object)bWps.vd((String)o.a(this, 1951093709)));
        object = bWps.vd((Double)o.a(this, 1810912203));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = bWps.vd((Double)o.a(this, -1395108902));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = bWps.vd((Double)o.a(this, -1056812071));
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
        if (bWps.vd(this) != bWps.vd(object)) {
            return false;
        }
        bWps bWps2 = (bWps)object;
        if (bWps.vd((Double)o.a(this, 820401112)) != bWps.vd((Double)o.a(bWps2, 820401112))) {
            return false;
        }
        if (bWps.vd((Double)o.a(this, 16602071)) != bWps.vd((Double)o.a(bWps2, 16602071))) {
            return false;
        }
        if (bWps.vd((Double)o.a(this, 1843483606)) != bWps.vd((Double)o.a(bWps2, 1843483606))) {
            return false;
        }
        if (((Integer)o.a(this, -88124466)).intValue() != ((Integer)o.a(bWps2, -88124466)).intValue()) {
            return false;
        }
        if (((Integer)o.a(this, 1785746241)).intValue() != ((Integer)o.a(bWps2, 1785746241)).intValue()) {
            return false;
        }
        if ((UUID)o.a(this, -1186573504) == null) {
            if ((UUID)o.a(bWps2, -1186573504) != null) {
                return false;
            }
        } else if (bWps.vd((UUID)o.a(this, -1186573504), (UUID)o.a(bWps2, -1186573504)) == false) {
            return false;
        }
        if (bWps.vd((Double)o.a(this, 584733652)) != bWps.vd((Double)o.a(bWps2, 584733652))) {
            return false;
        }
        if (bWps.vd((Double)o.a(this, -310094893)) != bWps.vd((Double)o.a(bWps2, -310094893))) {
            return false;
        }
        if (bWps.vd((Double)o.a(this, 1119310658)) != bWps.vd((Double)o.a(bWps2, 1119310658))) {
            return false;
        }
        if ((String)o.a(this, 1951093709) == null) {
            if ((String)o.a(bWps2, 1951093709) != null) {
                return false;
            }
        } else if (bWps.vd((String)o.a(this, 1951093709), (String)o.a(bWps2, 1951093709)) == false) {
            return false;
        }
        if (bWps.vd((Double)o.a(this, 1810912203)) != bWps.vd((Double)o.a(bWps2, 1810912203))) {
            return false;
        }
        if (bWps.vd((Double)o.a(this, -1395108902)) != bWps.vd((Double)o.a(bWps2, -1395108902))) {
            return false;
        }
        if (bWps.vd((Double)o.a(this, -1056812071)) != bWps.vd((Double)o.a(bWps2, -1056812071))) {
            return false;
        }
        return true;
    }

    private static Object vd(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

