/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TNku<K, V>
extends ConcurrentHashMap<K, V> {
    private static final long serialVersionUID = 1527847670799761130L;

    public TNku() {
    }

    public TNku(Map<K, V> map) {
        for (K k : map.keySet()) {
            this.put(k, map.get(k));
        }
    }

    public TNku<K, V> hHgD() {
        TNku tNku = new TNku();
        Object object = TNku.NT(this.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            tNku.put(e, this.get(e));
        }
        return tNku;
    }

    public TNku<K, V> yJLS(K k, V v) {
        this.put(k, v);
        return this.hHgD();
    }

    public TNku<V, feCR<K>> vsrN() {
        TNku tNku = new TNku();
        Object object = TNku.NT(this.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            if (e == null) continue;
            if (!tNku.containsKey(this.get(e))) {
                tNku.put(this.get(e), new feCR());
            }
            TNku.NT((feCR)tNku.get(this.get(e)), e);
        }
        return tNku;
    }

    @Override
    public String toString() {
        feCR feCR2 = new feCR();
        Object object = TNku.NT(this.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            TNku.NT(feCR2, TNku.NT(TNku.NT(TNku.NT(new StringBuilder((String)TNku.NT(TNku.NT(e))), FMkR$WjFM.a("\u0ff6\ua707")), TNku.NT(this.get(e)))));
        }
        return TNku.NT(TNku.NT(TNku.NT(new StringBuilder(FMkR$WjFM.a("\u0f97")), TNku.NT(feCR2)), FMkR$WjFM.a("\u0f91")));
    }

    public TNku<K, V> yJLS(TNku<K, V> tNku) {
        Object object = TNku.NT(tNku.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            this.put(e, tNku.get(e));
        }
        return this;
    }

    public feCR<K> sQJh() {
        return new feCR(this.keySet());
    }

    public Lhwj<K> MSKP() {
        return new Lhwj(this.keySet());
    }

    public feCR<V> cBGi() {
        return new feCR(this.values());
    }

    public Lhwj<V> QMuP() {
        return new Lhwj(this.values());
    }

    public void UtIU(K k, V v) {
        if (!this.containsValue(v)) {
            this.put(k, v);
        }
    }

    @Override
    public boolean contains(Object object) {
        return this.containsKey(object);
    }

    public feCR<V> GPlk(feCR<K> feCR2) {
        feCR feCR3 = new feCR();
        Object object = TNku.NT(feCR2);
        while (object.hasNext()) {
            Object e = object.next();
            if (this.get(e) == null) continue;
            TNku.NT(feCR3, this.get(e));
        }
        return feCR3;
    }

    public TNku<K, V> XRig() {
        TNku<K, V> tNku = this.hHgD();
        Object object = TNku.NT(tNku.sQJh());
        this.clear();
        Object object2 = TNku.NT(object);
        while (object2.hasNext()) {
            Object e = object2.next();
            this.put(e, tNku.get(e));
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void yJLS(feCR<K> feCR2, feCR<V> feCR3) {
        if (TNku.NT(feCR2) != TNku.NT(feCR3)) {
            return;
        }
        int n = 0;
        while (n < TNku.NT(feCR2)) {
            this.yJLS(feCR2, feCR3);
            ++n;
        }
    }

    public feCR<K> IONy() {
        feCR feCR2 = new feCR();
        feCR<V> feCR3 = this.cBGi();
        TNku.NT(feCR3);
        Object object = TNku.NT(feCR3);
        while (object.hasNext()) {
            Object e = object.next();
            Object object2 = TNku.NT(this.sQJh());
            while (object2.hasNext()) {
                Object e2 = object2.next();
                if (TNku.NT(this.get(e2), e) == false) continue;
                TNku.NT(feCR2, e2);
            }
        }
        return feCR2;
    }

    public feCR<V> WPHK() {
        feCR feCR2 = new feCR();
        feCR<K> feCR3 = this.sQJh();
        TNku.NT(feCR3);
        Object object = TNku.NT(feCR3);
        while (object.hasNext()) {
            Object e = object.next();
            Object object2 = TNku.NT(this.cBGi());
            while (object2.hasNext()) {
                Object e2 = object2.next();
                if (TNku.NT(this.get(e), e2) == false) continue;
                TNku.NT(feCR2, e2);
            }
        }
        return feCR2;
    }

    private static Object NT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

