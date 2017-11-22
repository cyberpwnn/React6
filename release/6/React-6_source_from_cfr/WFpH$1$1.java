/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;

class WFpH$1$1
extends gyID {
    final /* synthetic */ int ydUP;
    final /* synthetic */ WFpH$1 Vwai;

    WFpH$1$1(WFpH$1 var1_1, String string, int n, int n2, int n3) {
        this.Vwai = var1_1;
        this.ydUP = n3;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if ((Integer)cv.b(this, -1949895973) == 1) {
            Object object = WFpH$1$1.Kh((wfPa)WFpH$1$1.Kh((ktOu)cv.b((WFpH$1)cv.b(this, -1413287206), -247729467), WFpH$1$1.Kh((Integer)cv.b(this, -821300540))));
            while (object.hasNext()) {
                Location location = (Location)object.next();
                if (WFpH$1$1.Kh((WFpH$1)cv.b(this, -1413287206), location) == false) continue;
                WFpH$1$1.Kh(location).breakNaturally();
            }
        }
    }

    private static Object Kh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

