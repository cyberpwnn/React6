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

public class ktOu<K, V>
extends ConcurrentHashMap<K, V> {
    private static final long serialVersionUID = 1527847670799761130L;

    public ktOu() {
    }

    public ktOu(Map<K, V> map) {
        for (K k : map.keySet()) {
            this.put(k, map.get(k));
        }
    }

    public ktOu<K, V> WFtI() {
        ktOu ktOu2 = new ktOu();
        Object object = ktOu.QJ(this.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            ktOu2.put(e, this.get(e));
        }
        return ktOu2;
    }

    public ktOu<K, V> ssNb(K k, V v) {
        this.put(k, v);
        return this.WFtI();
    }

    public ktOu<V, wfPa<K>> ntjb() {
        ktOu ktOu2 = new ktOu();
        Object object = ktOu.QJ(this.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            if (e == null) continue;
            if (!ktOu2.containsKey(this.get(e))) {
                ktOu2.put(this.get(e), new wfPa());
            }
            ktOu.QJ((wfPa)ktOu2.get(this.get(e)), e);
        }
        return ktOu2;
    }

    @Override
    public String toString() {
        wfPa wfPa2 = new wfPa();
        Object object = ktOu.QJ(this.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            ktOu.QJ(wfPa2, ktOu.QJ(ktOu.QJ(ktOu.QJ(ktOu.QJ(new StringBuilder(), ktOu.QJ(e)), YEBy$TyVf.W("\u95cc\u3d70")), ktOu.QJ(this.get(e)))));
        }
        return ktOu.QJ(ktOu.QJ(ktOu.QJ(new StringBuilder(YEBy$TyVf.W("\u95ad")), ktOu.QJ(wfPa2)), YEBy$TyVf.W("\u95ab")));
    }

    public ktOu<K, V> ssNb(ktOu<K, V> ktOu2) {
        Object object = ktOu.QJ(ktOu2.keySet());
        while (object.hasNext()) {
            Object e = object.next();
            this.put(e, ktOu2.get(e));
        }
        return this;
    }

    public wfPa<K> rwyd() {
        return new wfPa(this.keySet());
    }

    public QyFw<K> AXWQ() {
        return new QyFw(this.keySet());
    }

    public wfPa<V> LPFt() {
        return new wfPa(this.values());
    }

    public QyFw<V> teYl() {
        return new QyFw(this.values());
    }

    public void DYFV(K k, V v) {
        if (!this.containsValue(v)) {
            this.put(k, v);
        }
    }

    @Override
    public boolean contains(Object object) {
        return this.containsKey(object);
    }

    public wfPa<V> jhSt(wfPa<K> wfPa2) {
        wfPa wfPa3 = new wfPa();
        Object object = ktOu.QJ(wfPa2);
        while (object.hasNext()) {
            Object e = object.next();
            if (this.get(e) == null) continue;
            ktOu.QJ(wfPa3, this.get(e));
        }
        return wfPa3;
    }

    public ktOu<K, V> Rrym() {
        ktOu<K, V> ktOu2 = this.WFtI();
        Object object = ktOu.QJ(ktOu2.rwyd());
        this.clear();
        Object object2 = ktOu.QJ(object);
        while (object2.hasNext()) {
            Object e = object2.next();
            this.put(e, ktOu2.get(e));
        }
        return this;
    }

    public void ssNb(wfPa<K> wfPa2, wfPa<V> wfPa3) {
        if (ktOu.QJ(wfPa2) != ktOu.QJ(wfPa3)) {
            return;
        }
        int n = 0;
        do {
            if (n >= ktOu.QJ(wfPa2)) break;
            this.ssNb(wfPa2, wfPa3);
            ++n;
        } while (true);
    }

    public wfPa<K> NUkt() {
        wfPa wfPa2 = new wfPa();
        wfPa<V> wfPa3 = this.LPFt();
        ktOu.QJ(wfPa3);
        Object object = ktOu.QJ(wfPa3);
        while (object.hasNext()) {
            Object e = object.next();
            Object object2 = ktOu.QJ(this.rwyd());
            while (object2.hasNext()) {
                Object e2 = object2.next();
                if (ktOu.QJ(this.get(e2), e) == false) continue;
                ktOu.QJ(wfPa2, e2);
            }
        }
        return wfPa2;
    }

    public wfPa<V> wfRd() {
        wfPa wfPa2 = new wfPa();
        wfPa<K> wfPa3 = this.rwyd();
        ktOu.QJ(wfPa3);
        Object object = ktOu.QJ(wfPa3);
        while (object.hasNext()) {
            Object e = object.next();
            Object object2 = ktOu.QJ(this.LPFt());
            while (object2.hasNext()) {
                Object e2 = object2.next();
                if (ktOu.QJ(this.get(e), e2) == false) continue;
                ktOu.QJ(wfPa2, e2);
            }
        }
        return wfPa2;
    }

    private static Object QJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

