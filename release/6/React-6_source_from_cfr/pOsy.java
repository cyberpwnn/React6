/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class pOsy {
    private PBUD<DGgy> TGFR = new PBUD();

    public void mXJp(DGgy dGgy) {
        pOsy.XO((PBUD)yy.h(this, 816842427), dGgy);
    }

    public int jOFy() {
        return (int)(pOsy.XO((PBUD)yy.h(this, 816842427)) - true);
    }

    public int jhSC(int n) {
        n = n > this.jOFy() ? this.jOFy() : n;
        if ((n = n < 0 ? 0 : n) == 0) {
            return this.jOFy();
        }
        return n - 1;
    }

    public int tTQG(int n) {
        n = n > this.jOFy() ? this.jOFy() : n;
        if ((n = n < 0 ? 0 : n) == this.jOFy()) {
            return 0;
        }
        return n + 1;
    }

    public DGgy jErH(int n) {
        return (DGgy)pOsy.XO((PBUD)yy.h(this, 816842427), n);
    }

    public String mXJp(int n, boolean bl, avqL avqL2, Cnvn cnvn, int n2) {
        Object object = "";
        if (!bl) {
            return object;
        }
        Object object2 = pOsy.XO(pOsy.XO(this.jErH(n)));
        while (object2.hasNext()) {
            FpQi fpQi = (FpQi)object2.next();
            Object object3 = pOsy.XO(avqL2, cnvn, fpQi.UtMF(), n2);
            object = pOsy.XO(pOsy.XO(pOsy.XO(pOsy.XO(pOsy.XO(pOsy.XO(new StringBuilder(), object), KDGY$JAHk.Y("\u9654")), (ydHl)((Object)yy.p(-1628960997))), object3), pOsy.XO(fpQi.get())));
        }
        if (pOsy.XO(object) < 2) {
            return object;
        }
        return pOsy.XO(object, true);
    }

    public String yJLL(int n, boolean bl) {
        Object object = "";
        int n2 = 0;
        Object object2 = pOsy.XO((PBUD)yy.h(this, 816842427));
        while (object2.hasNext()) {
            DGgy dGgy = (DGgy)object2.next();
            Object object3 = pOsy.XO((ydHl)((Object)yy.p(-20248912)));
            Object object4 = pOsy.XO(pOsy.XO(dGgy).UtMF());
            Object object5 = n == -1 || n2 == n ? object4 : object3;
            object = pOsy.XO(pOsy.XO(pOsy.XO(pOsy.XO(pOsy.XO(pOsy.XO(new StringBuilder(), object), KDGY$JAHk.Y("\uc20d")), (ydHl)((Object)yy.p(-1628960997))), object5), pOsy.XO(dGgy).get()));
            ++n2;
        }
        if (pOsy.XO(object) < 2) {
            return object;
        }
        return pOsy.XO(object, true);
    }

    private static Object XO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

