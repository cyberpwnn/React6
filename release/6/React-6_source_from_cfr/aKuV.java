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

public class aKuV<K, V>
extends ConcurrentHashMap<K, V> {
    private static final long serialVersionUID = 1527847670799761130L;

    public aKuV() {
    }

    public aKuV(Map<K, V> map) {
        for (K k : map.keySet()) {
            this.put(k, map.get(k));
        }
    }

    public aKuV<K, V> CLqw() {
        aKuV aKuV2 = new aKuV();
        Object object = aKuV.as(this.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            aKuV2.put(e, this.get(e));
        }
        return aKuV2;
    }

    public aKuV<K, V> mXJp(K k, V v) {
        this.put(k, v);
        return this.CLqw();
    }

    public aKuV<V, PBUD<K>> vsgm() {
        aKuV aKuV2 = new aKuV();
        Object object = aKuV.as(this.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            if (e == null) continue;
            if (!aKuV2.containsKey(this.get(e))) {
                aKuV2.put(this.get(e), new PBUD());
            }
            aKuV.as((PBUD)aKuV2.get(this.get(e)), e);
        }
        return aKuV2;
    }

    @Override
    public String toString() {
        PBUD pBUD = new PBUD();
        Object object = aKuV.as(this.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            aKuV.as(pBUD, aKuV.as(aKuV.as(aKuV.as(aKuV.as(new StringBuilder(), aKuV.as(e)), KDGY$JAHk.Y("\u1e02\ua387")), aKuV.as(this.get(e)))));
        }
        return aKuV.as(aKuV.as(aKuV.as(new StringBuilder(KDGY$JAHk.Y("\u1e63")), aKuV.as(pBUD)), KDGY$JAHk.Y("\u1e65")));
    }

    public aKuV<K, V> mXJp(aKuV<K, V> aKuV2) {
        Object object = aKuV.as(aKuV2.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            this.put(e, aKuV2.get(e));
        }
        return this;
    }

    public PBUD<K> inDC() {
        return new PBUD(this.keySet());
    }

    public hGxw<K> ePUd() {
        return new hGxw(this.keySet());
    }

    public PBUD<V> TEsR() {
        return new PBUD(this.values());
    }

    public hGxw<V> Ynto() {
        return new hGxw(this.values());
    }

    public void ksfs(K k, V v) {
        if (!this.containsValue(v)) {
            this.put(k, v);
        }
    }

    @Override
    public boolean contains(Object object) {
        return this.containsKey(object);
    }

    public PBUD<V> mXJp(PBUD<K> pBUD) {
        PBUD pBUD2 = new PBUD();
        Object object = aKuV.as(pBUD);
        while (object.hasNext()) {
            Object e = object.next();
            if (this.get(e) == null) continue;
            aKuV.as(pBUD2, this.get(e));
        }
        return pBUD2;
    }

    public aKuV<K, V> uFRK() {
        aKuV<K, V> aKuV2 = this.CLqw();
        Object object = aKuV.as(aKuV2.inDC());
        this.clear();
        Object object2 = aKuV.as(object);
        while (object2.hasNext()) {
            Object e = object2.next();
            this.put(e, aKuV2.get(e));
        }
        return this;
    }

    public void mXJp(PBUD<K> pBUD, PBUD<V> pBUD2) {
        if (aKuV.as(pBUD) != aKuV.as(pBUD2)) {
            return;
        }
        int n = 0;
        do {
            if (n >= aKuV.as(pBUD)) break;
            this.mXJp(pBUD, pBUD2);
            ++n;
        } while (true);
    }

    public PBUD<K> Lhol() {
        PBUD pBUD = new PBUD();
        PBUD<V> pBUD2 = this.TEsR();
        aKuV.as(pBUD2);
        Object object = aKuV.as(pBUD2);
        while (object.hasNext()) {
            Object e = object.next();
            Object object2 = aKuV.as(this.inDC());
            while (object2.hasNext()) {
                Object e2 = object2.next();
                if (aKuV.as(this.get(e2), e) == false) continue;
                aKuV.as(pBUD, e2);
            }
        }
        return pBUD;
    }

    public PBUD<V> LFmP() {
        PBUD pBUD = new PBUD();
        PBUD<K> pBUD2 = this.inDC();
        aKuV.as(pBUD2);
        Object object = aKuV.as(pBUD2);
        while (object.hasNext()) {
            Object e = object.next();
            Object object2 = aKuV.as(this.TEsR());
            while (object2.hasNext()) {
                Object e2 = object2.next();
                if (aKuV.as(this.get(e), e2) == false) continue;
                aKuV.as(pBUD, e2);
            }
        }
        return pBUD;
    }

    private static Object as(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

