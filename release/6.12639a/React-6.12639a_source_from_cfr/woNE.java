/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.util.Vector;

public class woNE {
    private Location LJMN;
    private Vector vnWJ;
    private Double JDGL;
    private Double GvRb;
    private Double Umwv;
    private Boolean JfJJ;

    public woNE(Location location, Vector vector, Double d, Double d2) {
        this.LJMN = location;
        this.vnWJ = vector;
        this.JDGL = d;
        this.GvRb = woNE.fG(0.0);
        this.Umwv = d2;
        this.JfJJ = woNE.fG(false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void LOxA() {
        var1_1 = (Location)o.a(this, -175816410);
        ** GOTO lbl27
lbl-1000: // 1 sources:
        {
            var2_2 = woNE.fG(woNE.fG(woNE.fG((Vector)o.a(this, -442613467))), woNE.fG((Double)o.a(this, 1303724323)));
            woNE.fG(var1_1, var2_2);
            this.qcvH((Location)woNE.fG(var1_1));
            v0 = this;
            o.v(v0, 2053456146, woNE.fG(woNE.fG((Double)o.a(v0, 2053456146)) + woNE.fG((Double)o.a(this, 1303724323))));
            if (woNE.fG((Double)o.a(this, 2053456146)) >= woNE.fG((Double)o.a(this, -41598703))) return;
lbl27: // 2 sources:
            if (woNE.fG((Double)o.a(this, 2053456146)) >= woNE.fG((Double)o.a(this, -41598703))) return;
            ** while (woNE.fG((Boolean)o.a((Object)this, (int)572604688)) == false)
        }
lbl31: // 1 sources:
    }

    public void stop() {
        o.v(this, 572604688, woNE.fG(true));
    }

    public void qcvH(Location location) {
    }

    public Location UJQs() {
        return (Location)o.a(this, -175816410);
    }

    public void CoVI(Location location) {
        o.v(this, -175816410, (Object)location);
    }

    public Vector getDirection() {
        return (Vector)o.a(this, -442613467);
    }

    public void setDirection(Vector vector) {
        o.v(this, -442613467, (Object)vector);
    }

    public Double fBqS() {
        return (Double)o.a(this, -41598703);
    }

    public void VwLY(Double d) {
        o.v(this, -41598703, d);
    }

    public Double xOth() {
        return (Double)o.a(this, 2053456146);
    }

    public void TEqA(Double d) {
        o.v(this, 2053456146, d);
    }

    public Double psQx() {
        return (Double)o.a(this, 1303724323);
    }

    public void KTiK(Double d) {
        o.v(this, 1303724323, d);
    }

    private static Object fG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

