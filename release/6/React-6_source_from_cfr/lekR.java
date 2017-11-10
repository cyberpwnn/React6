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

public class lekR {
    private UUID eiwi;
    private int type;
    private int ticksLived;
    private String PunF;
    private double x;
    private double y;
    private double z;
    private double vbvu;
    private double Xlcc;
    private double dESE;
    private double IhgI;
    private double pHSr;
    private double Jkin;

    public lekR(Entity entity) {
        this.eiwi = entity.getUniqueId();
        this.type = lekR.lL(entity.getType());
        this.ticksLived = entity.getTicksLived();
        this.PunF = lekR.lL(entity.getLocation()).getName();
        this.x = lekR.lL(entity.getLocation());
        this.y = lekR.lL(entity.getLocation());
        this.z = lekR.lL(entity.getLocation());
        this.vbvu = lekR.lL(entity.getVelocity());
        this.Xlcc = lekR.lL(entity.getVelocity());
        this.dESE = lekR.lL(entity.getVelocity());
        this.IhgI = lekR.lL(lekR.lL(entity.getLocation()));
        this.pHSr = lekR.lL(lekR.lL(entity.getLocation()));
        this.Jkin = lekR.lL(lekR.lL(entity.getLocation()));
    }

    public void yIkI(Entity entity) {
        entity.setTicksLived((Integer)yy.h(this, -399309172) + 2);
        Location location = new Location((World)lekR.lL((String)yy.h(this, 68290177)), ((Double)yy.h(this, 2066482815)).doubleValue(), ((Double)yy.h(this, -805828992)).doubleValue(), ((Double)yy.h(this, 1714357973)).doubleValue());
        lekR.lL(location, new Vector(((Double)yy.h(this, 1584858830)).doubleValue(), ((Double)yy.h(this, 1948714707)).doubleValue(), ((Double)yy.h(this, -847116588)).doubleValue()));
        Vector vector = new Vector(((Double)yy.h(this, 82970322)).doubleValue(), ((Double)yy.h(this, -1239152953)).doubleValue(), ((Double)yy.h(this, -2061171000)).doubleValue());
        entity.teleport(location);
        entity.setVelocity(vector);
    }

    public int getType() {
        return (Integer)yy.h(this, -359921955);
    }

    public void setType(int n) {
        yy.E(this, -359921955, n);
    }

    public int getTicksLived() {
        return (Integer)yy.h(this, -399309172);
    }

    public void setTicksLived(int n) {
        yy.E(this, -399309172, n);
    }

    public String jqKB() {
        return (String)yy.h(this, 68290177);
    }

    public void setWorld(String string) {
        yy.E(this, 68290177, string);
    }

    public double getX() {
        return (Double)yy.h(this, 2066482815);
    }

    public void setX(double d) {
        yy.E(this, 2066482815, d);
    }

    public double getY() {
        return (Double)yy.h(this, -805828992);
    }

    public void setY(double d) {
        yy.E(this, -805828992, d);
    }

    public double getZ() {
        return (Double)yy.h(this, 1714357973);
    }

    public void setZ(double d) {
        yy.E(this, 1714357973, d);
    }

    public double Mkul() {
        return (Double)yy.h(this, 82970322);
    }

    public void Fomb(double d) {
        yy.E(this, 82970322, d);
    }

    public double qllW() {
        return (Double)yy.h(this, -1239152953);
    }

    public void Ralc(double d) {
        yy.E(this, -1239152953, d);
    }

    public double wwNq() {
        return (Double)yy.h(this, -2061171000);
    }

    public void SnAm(double d) {
        yy.E(this, -2061171000, d);
    }

    public double HBtO() {
        return (Double)yy.h(this, 1584858830);
    }

    public void SBla(double d) {
        yy.E(this, 1584858830, d);
    }

    public double fmNM() {
        return (Double)yy.h(this, 1948714707);
    }

    public void gois(double d) {
        yy.E(this, 1948714707, d);
    }

    public double LaDA() {
        return (Double)yy.h(this, -847116588);
    }

    public void JjvV(double d) {
        yy.E(this, -847116588, d);
    }

    public UUID lTkh() {
        return (UUID)yy.h(this, 740099798);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        Object object = lekR.lL((Double)yy.h(this, 1584858830));
        n2 = 31 + (Object)(object ^ object >>> 32);
        object = lekR.lL((Double)yy.h(this, 1948714707));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = lekR.lL((Double)yy.h(this, -847116588));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Integer)yy.h(this, -399309172);
        n2 = n2 * 31 + (Integer)yy.h(this, -359921955);
        n2 = n2 * 31 + (Object)((UUID)yy.h(this, 740099798) == null ? 0 : (Object)lekR.lL((UUID)yy.h(this, 740099798)));
        object = lekR.lL((Double)yy.h(this, 82970322));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = lekR.lL((Double)yy.h(this, -1239152953));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = lekR.lL((Double)yy.h(this, -2061171000));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Object)((String)yy.h(this, 68290177) == null ? 0 : (Object)lekR.lL((String)yy.h(this, 68290177)));
        object = lekR.lL((Double)yy.h(this, 2066482815));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = lekR.lL((Double)yy.h(this, -805828992));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        object = lekR.lL((Double)yy.h(this, 1714357973));
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
        if (lekR.lL(this) != lekR.lL(object)) {
            return false;
        }
        lekR lekR2 = (lekR)object;
        if (lekR.lL((Double)yy.h(this, 1584858830)) != lekR.lL((Double)yy.h(lekR2, 1584858830))) {
            return false;
        }
        if (lekR.lL((Double)yy.h(this, 1948714707)) != lekR.lL((Double)yy.h(lekR2, 1948714707))) {
            return false;
        }
        if (lekR.lL((Double)yy.h(this, -847116588)) != lekR.lL((Double)yy.h(lekR2, -847116588))) {
            return false;
        }
        if (((Integer)yy.h(this, -399309172)).intValue() != ((Integer)yy.h(lekR2, -399309172)).intValue()) {
            return false;
        }
        if (((Integer)yy.h(this, -359921955)).intValue() != ((Integer)yy.h(lekR2, -359921955)).intValue()) {
            return false;
        }
        if ((UUID)yy.h(this, 740099798) == null) {
            if ((UUID)yy.h(lekR2, 740099798) != null) {
                return false;
            }
        } else if (lekR.lL((UUID)yy.h(this, 740099798), (UUID)yy.h(lekR2, 740099798)) == false) {
            return false;
        }
        if (lekR.lL((Double)yy.h(this, 82970322)) != lekR.lL((Double)yy.h(lekR2, 82970322))) {
            return false;
        }
        if (lekR.lL((Double)yy.h(this, -1239152953)) != lekR.lL((Double)yy.h(lekR2, -1239152953))) {
            return false;
        }
        if (lekR.lL((Double)yy.h(this, -2061171000)) != lekR.lL((Double)yy.h(lekR2, -2061171000))) {
            return false;
        }
        if ((String)yy.h(this, 68290177) == null) {
            if ((String)yy.h(lekR2, 68290177) != null) {
                return false;
            }
        } else if (lekR.lL((String)yy.h(this, 68290177), (String)yy.h(lekR2, 68290177)) == false) {
            return false;
        }
        if (lekR.lL((Double)yy.h(this, 2066482815)) != lekR.lL((Double)yy.h(lekR2, 2066482815))) {
            return false;
        }
        if (lekR.lL((Double)yy.h(this, -805828992)) != lekR.lL((Double)yy.h(lekR2, -805828992))) {
            return false;
        }
        if (lekR.lL((Double)yy.h(this, 1714357973)) != lekR.lL((Double)yy.h(lekR2, 1714357973))) {
            return false;
        }
        return true;
    }

    private static Object lL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

