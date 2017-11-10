/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class VfLY<K, V>
implements AXPu<K, V> {
    private aKuV<K, hGxw<V>> KUXe = new aKuV();

    @Override
    public hGxw<V> SnAm(K k) {
        return (hGxw)VfLY.Iw((aKuV)yy.h(this, -2046236204), k);
    }

    @Override
    public void put(K k, V v) {
        if (VfLY.Iw((aKuV)yy.h(this, -2046236204), k) == false) {
            VfLY.Iw((aKuV)yy.h(this, -2046236204), k, new hGxw());
        }
        VfLY.Iw((hGxw)VfLY.Iw((aKuV)yy.h(this, -2046236204), k), v);
    }

    @Override
    public void SBla(K k) {
        VfLY.Iw((aKuV)yy.h(this, -2046236204), k);
    }

    @Override
    public void clear() {
        VfLY.Iw((aKuV)yy.h(this, -2046236204));
    }

    @Override
    public PBUD<K> inDC() {
        return VfLY.Iw((aKuV)yy.h(this, -2046236204));
    }

    @Override
    public boolean gois(K k) {
        return (boolean)VfLY.Iw((aKuV)yy.h(this, -2046236204), k);
    }

    private static Object Iw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

