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

public class PBUD<T>
extends ArrayList<T> {
    private static final long serialVersionUID = 4480457702775755227L;

    public PBUD() {
    }

    public PBUD(Set<T> set) {
        for (T t : set) {
            this.add(t);
        }
    }

    public PBUD(Collection<T> collection) {
        for (T t : collection) {
            this.add(t);
        }
    }

    public PBUD(Iterator<T> iterator) {
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
    }

    public PBUD(T[] arrT) {
        this.add(arrT);
    }

    public PBUD(List<T> list) {
        if (list == null) {
            return;
        }
        this.mXJp(list);
    }

    public T WNxt() {
        aKuV aKuV2 = new aKuV();
        for (Object e : this) {
            if (PBUD.tv(aKuV2, e) == false) {
                PBUD.tv(aKuV2, e, PBUD.tv(false));
            }
            PBUD.tv(aKuV2, e, PBUD.tv(PBUD.tv((Integer)PBUD.tv(aKuV2, e)) + true));
        }
        Object object = false;
        T t = null;
        Object object2 = PBUD.tv(PBUD.tv(aKuV2));
        while (object2.hasNext()) {
            Object e = object2.next();
            if (PBUD.tv((Integer)PBUD.tv(aKuV2, e)) <= object) continue;
            object = PBUD.tv((Integer)PBUD.tv(aKuV2, e));
            t = (T)e;
        }
        return t;
    }

    public PBUD<T> jhSC() {
        PBUD<T> pBUD = this.WXMo();
        PBUD.tv(pBUD);
        return pBUD;
    }

    public void tTQG() {
        PBUD.tv(this);
    }

    public PBUD<PBUD<T>> jErH() {
        int n;
        PBUD<PBUD> pBUD = new PBUD<PBUD>();
        PBUD<T> pBUD2 = new PBUD<T>();
        PBUD<T> pBUD3 = new PBUD<T>();
        for (n = 0; n < this.size() / 2 && !this.JRFt(n); ++n) {
            pBUD2.add(this.get(n));
        }
        for (n = this.size() / 2 - 1; n < this.size() && !this.JRFt(n); ++n) {
            pBUD3.add(this.get(n));
        }
        pBUD.add(pBUD2, pBUD3);
        return null;
    }

    public boolean JRFt(int n) {
        if (n < this.size()) {
            return true;
        }
        return false;
    }

    public T RjaO() {
        Random random = new Random();
        return (T)this.get((int)PBUD.tv(random, this.size()));
    }

    public PBUD<String> mhmm() {
        PBUD<String> pBUD = new PBUD<String>();
        for (Object e : this) {
            pBUD.add((String)PBUD.tv(e));
        }
        return pBUD;
    }

    public void mXJp(yIkA<T> yIkA2) {
        for (Object e : this) {
            PBUD.tv(yIkA2, e);
        }
    }

    public int last() {
        return this.size() - 1;
    }

    public int halY(int n) {
        if (this.JRFt(n)) {
            return n;
        }
        return this.last();
    }

    public PBUD<T> ssMm(int n) {
        return this.ksfs(n, this.size() - 1);
    }

    public PBUD<PBUD<T>> yIkI(int n) {
        PBUD<PBUD<T>> pBUD = new PBUD<PBUD<T>>();
        int n2 = this.size() / n;
        if (n2 <= 0) {
            pBUD.add(this.WXMo());
        } else {
            for (int i = 0; i < n; ++i) {
                PBUD<T> pBUD2 = new PBUD<T>();
                for (int j = 0; j < this.size(); ++j) {
                    try {
                        pBUD2.add(this.get(j * (n + 1)));
                        continue;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                pBUD.add(pBUD2);
            }
        }
        return pBUD;
    }

    public PBUD<T> CVAs(int n) {
        return this.ksfs(0, n);
    }

    public PBUD<T> ksfs(int n, int n2) {
        PBUD<T> pBUD = new PBUD<T>();
        if (!this.isEmpty() && n >= 0 && this.JRFt(n) && this.JRFt(n2) && n <= n2) {
            for (int i = n; i <= n2; ++i) {
                pBUD.add(this.get(i));
            }
        }
        return pBUD;
    }

    public PBUD<T> MtdI() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this);
        this.clear();
        this.addAll(linkedHashSet);
        return this;
    }

    public void JRFt(T t) {
        while (this.contains(t)) {
            this.remove(t);
        }
    }

    public boolean jEqq() {
        if (this.size() != PBUD.tv(new LinkedHashSet(this))) {
            return true;
        }
        return false;
    }

    public void sort() {
        PBUD.tv(this, new PBUD$1(this));
    }

    public void mXJp(T t, int n) {
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

    public PBUD<T> halY(T t) {
        this.add(t);
        return this;
    }

    public void mXJp(List<T> list) {
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
                return PBUD.tv(this.get(0));
            }
            return "";
        }
        Object object = "";
        if (string == null) {
            string = "";
        }
        for (Object e : this) {
            object = PBUD.tv(PBUD.tv(PBUD.tv(PBUD.tv(new StringBuilder(), object), string), PBUD.tv(e)));
        }
        if (PBUD.tv(object) == false) {
            return "";
        }
        return PBUD.tv(object, PBUD.tv(string));
    }

    public PBUD<T> lUIx() {
        PBUD<T> pBUD = this.WXMo();
        PBUD.tv(pBUD);
        return pBUD;
    }

    @Override
    public String toString() {
        return this.toString(NVIs$JbpD.H("\u2ed1\u8c04"));
    }

    public PBUD<T> WXMo() {
        PBUD<T> pBUD = new PBUD<T>();
        for (Object e : this) {
            pBUD.add(e);
        }
        return pBUD;
    }

    public PBUD<T> ssMm(T t) {
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

    public T NLsD() {
        PBUD<T> pBUD = this.jhSC();
        if (pBUD.isEmpty()) {
            return null;
        }
        T t = pBUD.get(0);
        this.remove(t);
        return t;
    }

    private static Object tv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

