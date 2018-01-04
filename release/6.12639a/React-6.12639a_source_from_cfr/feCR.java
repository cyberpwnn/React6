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
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class feCR<T>
extends ArrayList<T> {
    private static final long serialVersionUID = 4480457702775755227L;

    public feCR() {
    }

    public feCR<T> VwLY(int n, int n2) {
        feCR<T> feCR2 = new feCR<T>();
        int n3 = n;
        while (n3 < n2 + 1) {
            feCR2.add(this.getAt(n3));
            ++n3;
        }
        return feCR2;
    }

    public feCR<T> TEqA(int n, int n2) {
        feCR<T> feCR2 = new feCR<T>();
        int n3 = 0;
        while (n3 < n2) {
            feCR2.add(this.getAt(n3 + n));
            ++n3;
        }
        return feCR2;
    }

    public T getAt(int n) {
        return (T)this.get(n);
    }

    public T UtIU(Integer n) {
        return (T)this.get((int)feCR.qE(n));
    }

    public feCR(Set<T> set) {
        for (T t : set) {
            this.add(t);
        }
    }

    public feCR(Collection<T> collection) {
        for (T t : collection) {
            this.add(t);
        }
    }

    public feCR(Iterator<T> iterator) {
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
    }

    public feCR(T[] arrT) {
        this.add(arrT);
    }

    public feCR(List<T> list) {
        if (list == null) {
            return;
        }
        this.yJLS(list);
    }

    public T IqTB() {
        TNku tNku = new TNku();
        for (Object e : this) {
            if (feCR.qE(tNku, e) == false) {
                feCR.qE(tNku, e, feCR.qE(false));
            }
            feCR.qE(tNku, e, feCR.qE(feCR.qE((Integer)feCR.qE(tNku, e)) + true));
        }
        Object object = false;
        T t = null;
        Object object2 = feCR.qE(feCR.qE(tNku));
        while (object2.hasNext()) {
            Object e = object2.next();
            if (feCR.qE((Integer)feCR.qE(tNku, e)) <= object) continue;
            object = feCR.qE((Integer)feCR.qE(tNku, e));
            t = (T)e;
        }
        return t;
    }

    public feCR<T> GYkP() {
        feCR<T> feCR2 = this.DirU();
        feCR.qE(feCR2);
        return feCR2;
    }

    public void aTsu() {
        feCR.qE(this);
    }

    public feCR<feCR<T>> Rjkm() {
        feCR<feCR> feCR2 = new feCR<feCR>();
        feCR<T> feCR3 = new feCR<T>();
        feCR<T> feCR4 = new feCR<T>();
        int n = 0;
        while (n < this.size() / 2) {
            if (this.bhkI(n)) break;
            feCR3.add(this.get(n));
            ++n;
        }
        n = this.size() / 2 - 1;
        while (n < this.size()) {
            if (this.bhkI(n)) break;
            feCR4.add(this.get(n));
            ++n;
        }
        feCR2.add(feCR3, feCR4);
        return null;
    }

    public boolean bhkI(int n) {
        if (n < this.size()) {
            return true;
        }
        return false;
    }

    public T UQqm() {
        Random random = new Random();
        return (T)this.get((int)feCR.qE(random, this.size()));
    }

    public feCR<String> AWyb() {
        feCR<String> feCR2 = new feCR<String>();
        for (Object e : this) {
            feCR2.add((String)feCR.qE(e));
        }
        return feCR2;
    }

    public void UtIU(XAcv<T> xAcv) {
        for (Object e : this) {
            feCR.qE(xAcv, e);
        }
    }

    public int last() {
        return this.size() - 1;
    }

    public int ooQj(int n) {
        if (this.bhkI(n)) {
            return n;
        }
        return this.last();
    }

    public feCR<T> IpeM(int n) {
        return this.KTiK(n, this.size() - 1);
    }

    public feCR<feCR<T>> WOYg(int n) {
        feCR<feCR<T>> feCR2 = new feCR<feCR<T>>();
        int n2 = this.size() / n;
        if (n2 <= 0) {
            feCR2.add(this.DirU());
        } else {
            int n3 = 0;
            while (n3 < n) {
                feCR<T> feCR3 = new feCR<T>();
                int n4 = 0;
                while (n4 < this.size()) {
                    try {
                        feCR3.add(this.get(n4 * (n + 1)));
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    ++n4;
                }
                feCR2.add(feCR3);
                ++n3;
            }
        }
        return feCR2;
    }

    public feCR<T> IEpg(int n) {
        return this.KTiK(0, n);
    }

    public feCR<T> KTiK(int n, int n2) {
        feCR<T> feCR2 = new feCR<T>();
        if (!this.isEmpty() && n >= 0 && this.bhkI(n) && this.bhkI(n2) && n <= n2) {
            int n3 = n;
            while (n3 <= n2) {
                feCR2.add(this.get(n3));
                ++n3;
            }
        }
        return feCR2;
    }

    public feCR<T> YxPY() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this);
        this.clear();
        this.addAll(linkedHashSet);
        return this;
    }

    public void Ipep(T t) {
        while (this.contains(t)) {
            this.remove(t);
        }
    }

    public boolean UstC() {
        if (this.size() != feCR.qE(new LinkedHashSet(this))) {
            return true;
        }
        return false;
    }

    public void sort() {
        this.sort(null);
    }

    public feCR<T> CfoR() {
        feCR<T> feCR2 = this.DirU();
        feCR2.sort(null);
        return feCR2;
    }

    public void yJLS(T t, int n) {
        this.add(t);
        while (this.size() > n && !this.isEmpty()) {
            this.remove(0);
        }
    }

    public /* varargs */ void add(T ... arrT) {
        T[] arrT2 = arrT;
        int n = arrT2.length;
        int n2 = 0;
        while (n2 < n) {
            T t = arrT2[n2];
            this.add(t);
            ++n2;
        }
    }

    public feCR<T> qcvH(T t) {
        this.add(t);
        return this;
    }

    public void yJLS(List<T> list) {
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
                return feCR.qE(this.get(0));
            }
            return "";
        }
        Object object = "";
        if (string == null) {
            string = "";
        }
        for (Object e : this) {
            object = feCR.qE(feCR.qE(feCR.qE(new StringBuilder((String)feCR.qE(object)), string), feCR.qE(e)));
        }
        if (feCR.qE(object) == false) {
            return "";
        }
        return feCR.qE(object, feCR.qE(string));
    }

    public feCR<T> pbAB() {
        feCR<T> feCR2 = this.DirU();
        feCR.qE(feCR2);
        return feCR2;
    }

    @Override
    public String toString() {
        return this.toString(nJPf$sILv.G("\u12db\u034d"));
    }

    public feCR<T> DirU() {
        feCR<T> feCR2 = new feCR<T>();
        for (Object e : this) {
            feCR2.add(e);
        }
        return feCR2;
    }

    public feCR<T> UQfI(T t) {
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

    public void kAOQ() {
        this.remove(this.last());
    }

    public T LhyL() {
        if (this.isEmpty()) {
            return null;
        }
        Object e = this.get(this.last());
        this.remove(this.last());
        return (T)e;
    }

    public T uqOm() {
        feCR<T> feCR2 = this.GYkP();
        if (feCR2.isEmpty()) {
            return null;
        }
        T t = feCR2.get(0);
        this.remove(t);
        return t;
    }

    private static Object qE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

