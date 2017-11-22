/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class gEXv {
    private DXfX JkiO;
    private wfPa<DXfX> pXtD;
    private String name;

    public gEXv(String string, DXfX dXfX) {
        this.name = string;
        this.JkiO = dXfX;
        this.pXtD = new wfPa();
    }

    public void ssNb(DXfX dXfX) {
        gEXv.Hs((wfPa)cv.b(this, -1402925196), dXfX);
    }

    public DXfX GsQl() {
        return (DXfX)cv.b(this, 574033783);
    }

    public void DYFV(DXfX dXfX) {
        cv.e(this, 574033783, dXfX);
    }

    public wfPa<DXfX> DXfX() {
        return (wfPa)cv.b(this, -1402925196);
    }

    public String EmKi() {
        return gEXv.Hs(gEXv.Hs(gEXv.Hs(gEXv.Hs(gEXv.Hs(gEXv.Hs(gEXv.Hs(new StringBuilder(), this.GsQl().KwOT()), this.GsQl().get()), (APKB)((Object)cv.e(1712131958))), this.GsQl().KwOT()), KUXS$dwji.S("\ub00e")), this.GsQl().getID()));
    }

    public String ejGG() {
        Object object = "";
        Object object2 = gEXv.Hs(this.DXfX());
        while (object2.hasNext()) {
            DXfX dXfX = (DXfX)object2.next();
            Object object3 = gEXv.Hs(gEXv.Hs(gEXv.Hs(gEXv.Hs(gEXv.Hs(gEXv.Hs(gEXv.Hs(new StringBuilder(), dXfX.KwOT()), dXfX.get()), (APKB)((Object)cv.e(1712131958))), dXfX.KwOT()), YEBy$TyVf.W("\u7036")), dXfX.getID()));
            object = gEXv.Hs(gEXv.Hs(gEXv.Hs(gEXv.Hs(new StringBuilder(), object), YEBy$TyVf.W("\u7036")), object3));
        }
        if (gEXv.Hs(object) < 2) {
            return object;
        }
        return gEXv.Hs(object, true);
    }

    public String getName() {
        return (String)cv.b(this, -223342733);
    }

    public void setName(String string) {
        cv.e(this, -223342733, string);
    }

    public void ssNb(wfPa<DXfX> wfPa2) {
        cv.e(this, -1402925196, wfPa2);
    }

    private static Object Hs(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

