/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class BBAa {
    private wfPa<gEXv> RkTm = new wfPa();

    public void ssNb(gEXv gEXv2) {
        BBAa.YC((wfPa)cv.b(this, 436007727), gEXv2);
    }

    public int HCSq() {
        return (int)(BBAa.YC((wfPa)cv.b(this, 436007727)) - true);
    }

    public int vtFs(int n) {
        n = n > this.HCSq() ? this.HCSq() : n;
        if ((n = n < 0 ? 0 : n) == 0) {
            return this.HCSq();
        }
        return n - 1;
    }

    public int EmLA(int n) {
        n = n > this.HCSq() ? this.HCSq() : n;
        if ((n = n < 0 ? 0 : n) == this.HCSq()) {
            return 0;
        }
        return n + 1;
    }

    public gEXv WGJn(int n) {
        return (gEXv)BBAa.YC((wfPa)cv.b(this, 436007727), n);
    }

    public String ssNb(int n, boolean bl, GIDW gIDW, bXOh bXOh2, int n2) {
        Object object = "";
        if (!bl) {
            return object;
        }
        Object object2 = BBAa.YC(BBAa.YC(this.WGJn(n)));
        while (object2.hasNext()) {
            DXfX dXfX = (DXfX)object2.next();
            Object object3 = BBAa.YC(gIDW, bXOh2, dXfX.KwOT(), n2);
            object = BBAa.YC(BBAa.YC(BBAa.YC(BBAa.YC(BBAa.YC(BBAa.YC(new StringBuilder(), object), YEBy$TyVf.W("\ua1b6")), (APKB)((Object)cv.e(1712131958))), object3), BBAa.YC(dXfX.get())));
        }
        if (BBAa.YC(object) < 2) {
            return object;
        }
        return BBAa.YC(object, true);
    }

    public String ssNb(int n, boolean bl) {
        Object object = "";
        int n2 = 0;
        Object object2 = BBAa.YC((wfPa)cv.b(this, 436007727));
        while (object2.hasNext()) {
            gEXv gEXv2 = (gEXv)object2.next();
            Object object3 = BBAa.YC((APKB)((Object)cv.e(416543530)));
            Object object4 = BBAa.YC(BBAa.YC(gEXv2).KwOT());
            Object object5 = n == -1 || n2 == n ? object4 : object3;
            object = BBAa.YC(BBAa.YC(BBAa.YC(BBAa.YC(BBAa.YC(BBAa.YC(new StringBuilder(), object), YEBy$TyVf.W("\ua1b6")), (APKB)((Object)cv.e(1712131958))), object5), BBAa.YC(gEXv2).get()));
            ++n2;
        }
        if (BBAa.YC(object) < 2) {
            return object;
        }
        return BBAa.YC(object, true);
    }

    private static Object YC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

