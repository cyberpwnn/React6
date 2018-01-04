/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class MSAa<K, V>
implements aLXV<K, V> {
    private TNku<K, Lhwj<V>> KoRk = new TNku();

    @Override
    public Lhwj<V> UtIU(K k) {
        return (Lhwj)MSAa.po((TNku)o.a(this, 1824933137), k);
    }

    @Override
    public void put(K k, V v) {
        if (MSAa.po((TNku)o.a(this, 1824933137), k) == false) {
            MSAa.po((TNku)o.a(this, 1824933137), k, new Lhwj());
        }
        MSAa.po((Lhwj)MSAa.po((TNku)o.a(this, 1824933137), k), v);
    }

    @Override
    public void biLo(K k) {
        MSAa.po((TNku)o.a(this, 1824933137), k);
    }

    @Override
    public void clear() {
        MSAa.po((TNku)o.a(this, 1824933137));
    }

    @Override
    public feCR<K> sQJh() {
        return MSAa.po((TNku)o.a(this, 1824933137));
    }

    @Override
    public boolean VwLY(K k) {
        return (boolean)MSAa.po((TNku)o.a(this, 1824933137), k);
    }

    private static Object po(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

