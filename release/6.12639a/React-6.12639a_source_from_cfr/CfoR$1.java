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

class CfoR$1
extends CxNA {
    final /* synthetic */ CfoR ydpQ;
    private final /* synthetic */ MapCanvas lMiM;
    private final /* synthetic */ MapView nCNc;

    CfoR$1(CfoR cfoR, MapCanvas mapCanvas, MapView mapView) {
        this.ydpQ = cfoR;
        this.lMiM = mapCanvas;
        this.nCNc = mapView;
    }

    @Override
    public void run() {
        CfoR$1.OG(CfoR$1.OG((CfoR)o.a(this, -1273997558)), false);
        Object object = CfoR$1.OG(CfoR$1.OG((CfoR)o.a(this, -1273997558)));
        while (object.hasNext()) {
            UstC ustC = (UstC)object.next();
            ustC.yJLS((UQqm)CfoR$1.OG((CfoR)o.a(this, -1273997558)), (MapCanvas)o.a(this, 89478919), (MapView)o.a(this, 733828870));
        }
        byte[][] arrby = (byte[][])CfoR$1.OG(CfoR$1.OG((CfoR)o.a(this, -1273997558)));
        byte[][] arrby2 = (byte[][])CfoR$1.OG(CfoR$1.OG((CfoR)o.a(this, -1273997558)));
        int n = 0;
        while (n < 128) {
            int n2 = 0;
            while (n2 < 128) {
                if (arrby[n][n2] != arrby2[n][n2]) {
                    ((MapCanvas)o.a(this, 89478919)).setPixel(n, n2, arrby[n][n2]);
                }
                ++n2;
            }
            ++n;
        }
    }

    private static Object OG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

