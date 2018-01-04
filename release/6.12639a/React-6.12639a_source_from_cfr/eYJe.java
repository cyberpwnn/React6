/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class eYJe {
    private feCR<Kvlx> ivrT = new feCR();

    public void yJLS(Kvlx kvlx) {
        eYJe.Ej((feCR)o.a(this, 762139424), kvlx);
    }

    public int gMkO() {
        return (int)(eYJe.Ej((feCR)o.a(this, 762139424)) - true);
    }

    public int Ipep(int n) {
        n = n > this.gMkO() ? this.gMkO() : n;
        if ((n = n < 0 ? 0 : n) == 0) {
            return this.gMkO();
        }
        return n - 1;
    }

    public int qcvH(int n) {
        n = n > this.gMkO() ? this.gMkO() : n;
        if ((n = n < 0 ? 0 : n) == this.gMkO()) {
            return 0;
        }
        return n + 1;
    }

    public Kvlx UQfI(int n) {
        return (Kvlx)eYJe.Ej((feCR)o.a(this, 762139424), n);
    }

    public String yJLS(int n, boolean bl, WWtP wWtP, Jbjx jbjx, int n2) {
        Object object = "";
        if (!bl) {
            return object;
        }
        Object object2 = eYJe.Ej(eYJe.Ej(this.UQfI(n)));
        while (object2.hasNext()) {
            NwfF nwfF = (NwfF)object2.next();
            Object object3 = eYJe.Ej(wWtP, jbjx, nwfF.aLXV(), n2);
            object = eYJe.Ej(eYJe.Ej(eYJe.Ej(eYJe.Ej(eYJe.Ej(new StringBuilder((String)eYJe.Ej(object)), FMkR$WjFM.a("\ufe9e")), (psKX)((Object)o.k(692209039))), object3), eYJe.Ej(nwfF.get())));
        }
        if (eYJe.Ej(object) < 2) {
            return object;
        }
        return eYJe.Ej(object, true);
    }

    public String yJLS(int n, boolean bl) {
        Object object = "";
        int n2 = 0;
        Object object2 = eYJe.Ej((feCR)o.a(this, 762139424));
        while (object2.hasNext()) {
            Kvlx kvlx = (Kvlx)object2.next();
            Object object3 = eYJe.Ej((psKX)((Object)o.k(1251758875)));
            Object object4 = eYJe.Ej(eYJe.Ej(kvlx).aLXV());
            Object object5 = n == -1 || n2 == n ? object4 : object3;
            object = eYJe.Ej(eYJe.Ej(eYJe.Ej(eYJe.Ej(eYJe.Ej(new StringBuilder((String)eYJe.Ej(object)), mrFx$WjFM.d("\uec1f")), (psKX)((Object)o.k(692209039))), object5), eYJe.Ej(kvlx).get()));
            ++n2;
        }
        if (eYJe.Ej(object) < 2) {
            return object;
        }
        return eYJe.Ej(object, true);
    }

    private static Object Ej(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

