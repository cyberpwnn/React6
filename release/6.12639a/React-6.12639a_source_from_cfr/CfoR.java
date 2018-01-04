/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.ItemStack
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
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

public class CfoR
extends MapRenderer
implements YxPY {
    private MapView Jljr;
    private UQqm UAvT;
    private UQqm dyVa;
    private feCR<UstC> tfbV;

    public CfoR(World world) {
        this.Jljr = CfoR.xP(world);
        this.UAvT = new UQqm();
        this.dyVa = new UQqm();
        this.tfbV = new feCR();
        for (MapRenderer mapRenderer : ((MapView)o.a(this, 1438275570)).getRenderers()) {
            ((MapView)o.a(this, 1438275570)).removeRenderer(mapRenderer);
        }
        ((MapView)o.a(this, 1438275570)).addRenderer((MapRenderer)this);
    }

    @Override
    public MapView hHjO() {
        return (MapView)o.a(this, 1438275570);
    }

    @Override
    public UQqm XRnR() {
        return (UQqm)o.a(this, 1989367793);
    }

    @Override
    public void yJLS(UstC ustC) {
        CfoR.xP((feCR)o.a(this, -36546576), ustC);
    }

    @Override
    public void NDol() {
        CfoR.xP((feCR)o.a(this, -36546576));
    }

    @Override
    public feCR<UstC> mWxx() {
        return (feCR)o.a(this, -36546576);
    }

    @Override
    public void UtIU(UstC ustC) {
        CfoR.xP((feCR)o.a(this, -36546576), ustC);
    }

    public void render(MapView mapView, MapCanvas mapCanvas, Player player) {
        if (mapView.getId() == ((MapView)o.a(this, 1438275570)).getId()) {
            if (CfoR.xP(mapView.getWorld(), ((MapView)o.a(this, 1438275570)).getWorld()) != false) {
                new CfoR$1(this, mapCanvas, mapView);
            }
        }
    }

    @Override
    public void destroy() {
    }

    @Override
    public ItemStack skNB() {
        ItemStack itemStack = new ItemStack((Material)o.k(277108719));
        CfoR.xP(itemStack, ((MapView)o.a(this, 1438275570)).getId());
        return itemStack;
    }

    static /* synthetic */ UQqm yJLS(CfoR cfoR) {
        return (UQqm)o.a(cfoR, 1989367793);
    }

    static /* synthetic */ feCR UtIU(CfoR cfoR) {
        return (feCR)o.a(cfoR, -36546576);
    }

    static /* synthetic */ UQqm biLo(CfoR cfoR) {
        return (UQqm)o.a(cfoR, 1026381805);
    }

    private static Object xP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

