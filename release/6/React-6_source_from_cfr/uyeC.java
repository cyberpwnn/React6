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

public class uyeC {
    private Location nwHu;
    private Vector IbMX;
    private Double GSVS;
    private Double lEnP;
    private Double hSTe;
    private Boolean xIQE;

    public uyeC(Location location, Vector vector, Double d, Double d2) {
        this.nwHu = location;
        this.IbMX = vector;
        this.GSVS = d;
        this.lEnP = uyeC.Lq(0.0);
        this.hSTe = d2;
        this.xIQE = uyeC.Lq(false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void agAu() {
        var1_1 = (Location)cv.b(this, -123078462);
        ** GOTO lbl27
lbl-1000: // 1 sources:
        {
            var2_2 = uyeC.Lq(uyeC.Lq(uyeC.Lq((Vector)cv.b(this, 31455437))), uyeC.Lq((Double)cv.b(this, 170326223)));
            uyeC.Lq(var1_1, var2_2);
            this.vtFs((Location)uyeC.Lq(var1_1));
            v0 = this;
            cv.e(v0, -1313933106, uyeC.Lq(uyeC.Lq((Double)cv.b(v0, -1313933106)) + uyeC.Lq((Double)cv.b(this, 170326223))));
            if (uyeC.Lq((Double)cv.b(this, -1313933106)) >= uyeC.Lq((Double)cv.b(this, -1783039799))) return;
lbl27: // 2 sources:
            if (uyeC.Lq((Double)cv.b(this, -1313933106)) >= uyeC.Lq((Double)cv.b(this, -1783039799))) return;
            ** while (uyeC.Lq((Boolean)cv.b((Object)this, (int)1253767368)) == false)
        }
lbl31: // 1 sources:
    }

    public void stop() {
        cv.e(this, 1253767368, uyeC.Lq(true));
    }

    public void vtFs(Location location) {
    }

    public Location FqEs() {
        return (Location)cv.b(this, -123078462);
    }

    public void TyVf(Location location) {
        cv.e(this, -123078462, (Object)location);
    }

    public Vector getDirection() {
        return (Vector)cv.b(this, 31455437);
    }

    public void setDirection(Vector vector) {
        cv.e(this, 31455437, (Object)vector);
    }

    public Double BSVJ() {
        return (Double)cv.b(this, -1783039799);
    }

    public void IWSm(Double d) {
        cv.e(this, -1783039799, d);
    }

    public Double NDxA() {
        return (Double)cv.b(this, -1313933106);
    }

    public void OXeK(Double d) {
        cv.e(this, -1313933106, d);
    }

    public Double ydUP() {
        return (Double)cv.b(this, 170326223);
    }

    public void YoSa(Double d) {
        cv.e(this, 170326223, d);
    }

    private static Object Lq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

