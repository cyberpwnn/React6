/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.World
 *  org.bukkit.entity.Player
 *  org.bukkit.map.MapCanvas
 *  org.bukkit.map.MapRenderer
 *  org.bukkit.map.MapView
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.List;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

public class VoFU
extends MapRenderer
implements QhEF {
    private MapView LikI;
    private YDfo Cosh;
    private YDfo vJRp;
    private wfPa<ogMI> dxbw;

    public VoFU(World world) {
        this.LikI = VoFU.WY(world);
        this.Cosh = new YDfo();
        this.vJRp = new YDfo();
        this.dxbw = new wfPa();
        for (MapRenderer mapRenderer : ((MapView)cv.b(this, -1614941287)).getRenderers()) {
            ((MapView)cv.b(this, -1614941287)).removeRenderer(mapRenderer);
        }
        ((MapView)cv.b(this, -1614941287)).addRenderer((MapRenderer)this);
    }

    @Override
    public MapView gotS() {
        return (MapView)cv.b(this, -1614941287);
    }

    @Override
    public YDfo QMsU() {
        return (YDfo)cv.b(this, -430378024);
    }

    @Override
    public void ssNb(ogMI ogMI2) {
        VoFU.WY((wfPa)cv.b(this, -1576143909), ogMI2);
    }

    @Override
    public void GjjA() {
        VoFU.WY((wfPa)cv.b(this, -1576143909));
    }

    @Override
    public wfPa<ogMI> vbnM() {
        return (wfPa)cv.b(this, -1576143909);
    }

    @Override
    public void DYFV(ogMI ogMI2) {
        VoFU.WY((wfPa)cv.b(this, -1576143909), ogMI2);
    }

    public void render(MapView mapView, MapCanvas mapCanvas, Player player) {
        if (mapView.getId() == ((MapView)cv.b(this, -1614941287)).getId()) {
            if (VoFU.WY(mapView.getWorld(), ((MapView)cv.b(this, -1614941287)).getWorld()) != false) {
                new VoFU$1(this, mapCanvas);
            }
        }
    }

    @Override
    public void destroy() {
    }

    static /* synthetic */ YDfo ssNb(VoFU voFU) {
        return (YDfo)cv.b(voFU, -430378024);
    }

    static /* synthetic */ wfPa DYFV(VoFU voFU) {
        return (wfPa)cv.b(voFU, -1576143909);
    }

    static /* synthetic */ YDfo IWSm(VoFU voFU) {
        return (YDfo)cv.b(voFU, 707982298);
    }

    private static Object WY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

