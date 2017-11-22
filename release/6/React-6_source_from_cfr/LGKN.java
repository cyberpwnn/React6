/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class LGKN<K, V>
implements mXMK<K, V> {
    private ktOu<K, QyFw<V>> vJAb = new ktOu();

    @Override
    public QyFw<V> ssNb(K k) {
        return (QyFw)LGKN.wN((ktOu)cv.b(this, 2104365004), k);
    }

    @Override
    public void put(K k, V v) {
        if (LGKN.wN((ktOu)cv.b(this, 2104365004), k) == false) {
            LGKN.wN((ktOu)cv.b(this, 2104365004), k, new QyFw());
        }
        LGKN.wN((QyFw)LGKN.wN((ktOu)cv.b(this, 2104365004), k), v);
    }

    @Override
    public void DYFV(K k) {
        LGKN.wN((ktOu)cv.b(this, 2104365004), k);
    }

    @Override
    public void clear() {
        LGKN.wN((ktOu)cv.b(this, 2104365004));
    }

    @Override
    public wfPa<K> rwyd() {
        return LGKN.wN((ktOu)cv.b(this, 2104365004));
    }

    @Override
    public boolean IWSm(K k) {
        return (boolean)LGKN.wN((ktOu)cv.b(this, 2104365004), k);
    }

    private static Object wN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

