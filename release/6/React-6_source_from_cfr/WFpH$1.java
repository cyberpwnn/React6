/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Material;

class WFpH$1
extends bqcB {
    final /* synthetic */ ktOu BSVJ;
    final /* synthetic */ WFpH NDxA;

    WFpH$1(WFpH wFpH, int n, int n2, Location location, ktOu ktOu2) {
        this.NDxA = wFpH;
        this.BSVJ = ktOu2;
        super(n, n2, location);
    }

    @Override
    public boolean ssNb(Location location) {
        block3 : {
            block2 : {
                if (WFpH$1.jg(WFpH$1.jg(location).getType(), (Material)cv.e(-355667263)) != false) break block2;
                if (WFpH$1.jg(WFpH$1.jg(location).getType(), (Material)cv.e(-1942359360)) == false) break block3;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean DYFV(Location location) {
        block3 : {
            block2 : {
                if (WFpH$1.jg(WFpH$1.jg(location).getType(), (Material)cv.e(-679480637)) != false) break block2;
                if (WFpH$1.jg(WFpH$1.jg(location).getType(), (Material)cv.e(1236202178)) == false) break block3;
            }
            return true;
        }
        return false;
    }

    @Override
    public void IWSm(Location location) {
        if (((Boolean)cv.e(1822167394)).booleanValue()) {
            if (this.ssNb(location)) {
                WFpH$1.jg(location).breakNaturally();
                return;
            }
        } else {
            Object object = WFpH$1.jg(false, (Integer)cv.e(728174957));
            if (WFpH$1.jg((ktOu)cv.b(this, -247729467), WFpH$1.jg(object)) == false) {
                WFpH$1.jg((ktOu)cv.b(this, -247729467), WFpH$1.jg(object), new wfPa());
            }
            WFpH$1.jg((wfPa)WFpH$1.jg((ktOu)cv.b(this, -247729467), WFpH$1.jg(object)), location);
        }
    }

    @Override
    public void finished() {
        if (!((Boolean)cv.e(1822167394)).booleanValue()) {
            Object object = WFpH$1.jg(WFpH$1.jg((ktOu)cv.b(this, -247729467)));
            while (object.hasNext()) {
                Object object2 = WFpH$1.jg((Integer)object.next());
                new WFpH$1$1(this, YEBy$TyVf.W("\uee46\ubfd1\uc5ee\uc329\u6e46\ub79e\u612f\u966f\ue6fd\u023c"), (int)object2, 2, (int)object2);
            }
        }
    }

    private static Object jg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

