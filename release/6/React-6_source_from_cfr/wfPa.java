/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class wfPa<T>
extends ArrayList<T> {
    private static final long serialVersionUID = 4480457702775755227L;

    public wfPa() {
    }

    public wfPa(Set<T> set) {
        for (T t : set) {
            this.add(t);
        }
    }

    public wfPa(Collection<T> collection) {
        for (T t : collection) {
            this.add(t);
        }
    }

    public wfPa(Iterator<T> iterator) {
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
    }

    public wfPa(T[] arrT) {
        this.add(arrT);
    }

    public wfPa(List<T> list) {
        if (list == null) {
            return;
        }
        this.ssNb(list);
    }

    public T dwji() {
        ktOu ktOu2 = new ktOu();
        for (Object e : this) {
            if (wfPa.AO(ktOu2, e) == false) {
                wfPa.AO(ktOu2, e, wfPa.AO(false));
            }
            wfPa.AO(ktOu2, e, wfPa.AO(wfPa.AO((Integer)wfPa.AO(ktOu2, e)) + true));
        }
        Object object = false;
        T t = null;
        Object object2 = wfPa.AO(wfPa.AO(ktOu2));
        while (object2.hasNext()) {
            Object e = object2.next();
            if (wfPa.AO((Integer)wfPa.AO(ktOu2, e)) <= object) continue;
            object = wfPa.AO((Integer)wfPa.AO(ktOu2, e));
            t = (T)e;
        }
        return t;
    }

    public wfPa<T> QhEF() {
        wfPa<T> wfPa2 = this.QyID();
        wfPa.AO(wfPa2);
        return wfPa2;
    }

    public void ogMI() {
        wfPa.AO(this);
    }

    public wfPa<wfPa<T>> VoFU() {
        int n;
        wfPa<wfPa> wfPa2 = new wfPa<wfPa>();
        wfPa<T> wfPa3 = new wfPa<T>();
        wfPa<T> wfPa4 = new wfPa<T>();
        for (n = 0; n < this.size() / 2 && !this.cIji(n); ++n) {
            wfPa3.add(this.get(n));
        }
        for (n = this.size() / 2 - 1; n < this.size() && !this.cIji(n); ++n) {
            wfPa4.add(this.get(n));
        }
        wfPa2.add(wfPa3, wfPa4);
        return null;
    }

    public boolean cIji(int n) {
        if (n < this.size()) {
            return true;
        }
        return false;
    }

    public T QVde() {
        Random random = new Random();
        return (T)this.get((int)wfPa.AO(random, this.size()));
    }

    public wfPa<String> fTAa() {
        wfPa<String> wfPa2 = new wfPa<String>();
        for (Object e : this) {
            wfPa2.add((String)wfPa.AO(e));
        }
        return wfPa2;
    }

    public void ssNb(tdxF<T> tdxF2) {
        for (Object e : this) {
            wfPa.AO(tdxF2, e);
        }
    }

    public int last() {
        return this.size() - 1;
    }

    public int Cnru(int n) {
        if (this.cIji(n)) {
            return n;
        }
        return this.last();
    }

    public wfPa<T> LWjo(int n) {
        return this.DYFV(n, this.size() - 1);
    }

    public wfPa<wfPa<T>> PuYf(int n) {
        wfPa<wfPa<T>> wfPa2 = new wfPa<wfPa<T>>();
        int n2 = this.size() / n;
        if (n2 <= 0) {
            wfPa2.add(this.QyID());
        } else {
            for (int i = 0; i < n; ++i) {
                wfPa<T> wfPa3 = new wfPa<T>();
                for (int j = 0; j < this.size(); ++j) {
                    try {
                        wfPa3.add(this.get(j * (n + 1)));
                        continue;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                wfPa2.add(wfPa3);
            }
        }
        return wfPa2;
    }

    public wfPa<T> TNbD(int n) {
        return this.DYFV(0, n);
    }

    public wfPa<T> DYFV(int n, int n2) {
        wfPa<T> wfPa2 = new wfPa<T>();
        if (!this.isEmpty() && n >= 0 && this.cIji(n) && this.cIji(n2) && n <= n2) {
            for (int i = n; i <= n2; ++i) {
                wfPa2.add(this.get(i));
            }
        }
        return wfPa2;
    }

    public wfPa<T> WqhV() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this);
        this.clear();
        this.addAll(linkedHashSet);
        return this;
    }

    public void vtFs(T t) {
        while (this.contains(t)) {
            this.remove(t);
        }
    }

    public boolean jOKx() {
        if (this.size() != wfPa.AO(new LinkedHashSet(this))) {
            return true;
        }
        return false;
    }

    public void sort() {
        wfPa.AO(this, new wfPa$1(this));
    }

    public void ssNb(T t, int n) {
        this.add(t);
        while (this.size() > n && !this.isEmpty()) {
            this.remove(0);
        }
    }

    public /* varargs */ void add(T ... arrT) {
        for (T t : arrT) {
            this.add(t);
        }
    }

    public wfPa<T> EmLA(T t) {
        this.add(t);
        return this;
    }

    public void ssNb(List<T> list) {
        for (T t : list) {
            this.add(t);
        }
    }

    public String toString(String string) {
        if (this.isEmpty()) {
            return "";
        }
        if (this.size() == 1) {
            if (this.get(0) != null) {
                return wfPa.AO(this.get(0));
            }
            return "";
        }
        Object object = "";
        if (string == null) {
            string = "";
        }
        for (Object e : this) {
            object = wfPa.AO(wfPa.AO(wfPa.AO(wfPa.AO(new StringBuilder(), object), string), wfPa.AO(e)));
        }
        if (wfPa.AO(object) == false) {
            return "";
        }
        return wfPa.AO(object, wfPa.AO(string));
    }

    public wfPa<T> OsCE() {
        wfPa<T> wfPa2 = this.QyID();
        wfPa.AO(wfPa2);
        return wfPa2;
    }

    @Override
    public String toString() {
        return this.toString(KUXS$dwji.S("\u701e\u217c"));
    }

    public wfPa<T> QyID() {
        wfPa<T> wfPa2 = new wfPa<T>();
        for (Object e : this) {
            wfPa2.add(e);
        }
        return wfPa2;
    }

    public wfPa<T> WGJn(T t) {
        this.remove(t);
        return this;
    }

    public T pop() {
        if (this.isEmpty()) {
            return null;
        }
        Object e = this.get(0);
        this.remove(0);
        return (T)e;
    }

    public T SKhs() {
        wfPa<T> wfPa2 = this.QhEF();
        if (wfPa2.isEmpty()) {
            return null;
        }
        T t = wfPa2.get(0);
        this.remove(t);
        return t;
    }

    private static Object AO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

