/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.map.MapCanvas
 *  org.bukkit.map.MapView
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapView;

class Yfkr$3
implements UstC {
    final /* synthetic */ Yfkr eYsk;

    Yfkr$3(Yfkr yfkr) {
        this.eYsk = yfkr;
    }

    @Override
    public void yJLS(UQqm uQqm, MapCanvas mapCanvas, MapView mapView) {
        Yfkr$3.NB(Yfkr$3.NB((Yfkr)o.a(this, -1205709180)));
        Yfkr$3.NB(uQqm, Yfkr$3.NB(Yfkr$3.NB((Yfkr)o.a(this, -1205709180))));
    }

    private static Object NB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

