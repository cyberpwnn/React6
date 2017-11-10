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

public class vcRa {
    private Location YOQh;
    private Vector jYRw;
    private Double TadY;
    private Double AtBh;
    private Double bkNM;
    private Boolean sBJm;

    public vcRa(Location location, Vector vector, Double d, Double d2) {
        this.YOQh = location;
        this.jYRw = vector;
        this.TadY = d;
        this.AtBh = vcRa.lr(0.0);
        this.bkNM = d2;
        this.sBJm = vcRa.lr(false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void YEST() {
        var1_1 = (Location)yy.h(this, 1431634555);
        ** GOTO lbl27
lbl-1000: // 1 sources:
        {
            var2_2 = vcRa.lr(vcRa.lr(vcRa.lr((Vector)yy.h(this, -1311505796))), vcRa.lr((Double)yy.h(this, -1280966022)));
            vcRa.lr(var1_1, var2_2);
            this.CVAs((Location)vcRa.lr(var1_1));
            v0 = this;
            yy.E(v0, 1085407855, vcRa.lr(vcRa.lr((Double)yy.h(v0, 1085407855)) + vcRa.lr((Double)yy.h(this, -1280966022))));
            if (vcRa.lr((Double)yy.h(this, 1085407855)) >= vcRa.lr((Double)yy.h(this, -1974009232))) return;
lbl27: // 2 sources:
            if (vcRa.lr((Double)yy.h(this, 1085407855)) >= vcRa.lr((Double)yy.h(this, -1974009232))) return;
            ** while (vcRa.lr((Boolean)yy.h((Object)this, (int)-7011771)) == false)
        }
lbl31: // 1 sources:
    }

    public void stop() {
        yy.E(this, -7011771, vcRa.lr(true));
    }

    public void CVAs(Location location) {
    }

    public Location fSiD() {
        return (Location)yy.h(this, 1431634555);
    }

    public void yIkA(Location location) {
        yy.E(this, 1431634555, (Object)location);
    }

    public Vector getDirection() {
        return (Vector)yy.h(this, -1311505796);
    }

    public void setDirection(Vector vector) {
        yy.E(this, -1311505796, (Object)vector);
    }

    public Double IiHr() {
        return (Double)yy.h(this, -1974009232);
    }

    public void yJLL(Double d) {
        yy.E(this, -1974009232, d);
    }

    public Double priD() {
        return (Double)yy.h(this, 1085407855);
    }

    public void SnBs(Double d) {
        yy.E(this, 1085407855, d);
    }

    public Double Cwwo() {
        return (Double)yy.h(this, -1280966022);
    }

    public void qdWJ(Double d) {
        yy.E(this, -1280966022, d);
    }

    private static Object lr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

