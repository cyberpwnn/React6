/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class DaUw$2
extends xGOy {
    final /* synthetic */ DaUw TXIq;

    DaUw$2(DaUw daUw) {
        this.TXIq = daUw;
    }

    @Override
    public void run() {
        DaUw$2.aN(DaUw$2.aN((DaUw)o.a(this, 1366771172)), DaUw$2.aN(DaUw$2.aN(new StringBuilder(mrFx$WjFM.d("\u755f\uf99d\uff9e\u7540\uf094\u0cd8\u1c57\u2420\u4470\u58d2\uddfb")), DaUw$2.aN((DaUw)o.a(this, 1366771172)))));
        DaUw$2.aN(DaUw$2.aN((DaUw)o.a(this, 1366771172)), DaUw$2.aN(DaUw$2.aN(DaUw$2.aN(DaUw$2.aN(new StringBuilder(mrFx$WjFM.d("\u7550\uf9a2\uffa4\u750b\uf0b4\u0c9b\u1c54\u243b\u447e\u588d\uddfb\u6c56\uc14a\uaf25\ua721\uc761\u4bbc\uba16")), (psKX)((Object)o.k(-1880078855))), DaUw$2.aN(DaUw$2.aN((DaUw)o.a(this, 1366771172)))), mrFx$WjFM.d("\u753c\uf98e\uff9b\u7535"))));
        if (DaUw$2.aN((DaUw)o.a(this, 1366771172)) != null) {
            DaUw$2.aN((DaUw)o.a(this, 1366771172)).run();
        }
    }

    private static Object aN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

