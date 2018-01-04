/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.World
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginDescriptionFile
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

public class oxLO
extends DXtE {
    @Override
    public String mFpP() {
        return oxLO.sY();
    }

    @Override
    public int Lqeo() {
        return (int)oxLO.sY(oxLO.sY());
    }

    @Override
    public String rMoL() {
        return oxLO.sY(oxLO.sY());
    }

    @Override
    public String gxcp() {
        return oxLO.sY(oxLO.sY(oxLO.sY(oxLO.sY())));
    }

    @Override
    public int xGOy() {
        return (int)oxLO.sY();
    }

    @Override
    public feCR<String> qmPN() {
        feCR<String> feCR2 = new feCR<String>();
        Iterator iterator = oxLO.sY().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            oxLO.sY(feCR2, player.getName());
        }
        return feCR2;
    }

    @Override
    public int cBEB() {
        return (int)oxLO.sY();
    }

    @Override
    public int bhsi() {
        return (int)oxLO.sY();
    }

    @Override
    public String nceQ() {
        return oxLO.sY();
    }

    @Override
    public feCR<mGQw> QVao() {
        feCR<mGQw> feCR2 = new feCR<mGQw>();
        Plugin[] arrplugin = oxLO.sY().getPlugins();
        int n = arrplugin.length;
        int n2 = 0;
        while (n2 < n) {
            Plugin plugin = arrplugin[n2];
            oxLO.sY(feCR2, new goyd(plugin.getName(), (String)oxLO.sY(plugin.getDescription()), (String)oxLO.sY(new feCR(oxLO.sY(plugin.getDescription())), nJPf$sILv.G("\u81a6"))));
            ++n2;
        }
        return feCR2;
    }

    @Override
    public feCR<String> XAcv() {
        feCR<String> feCR2 = new feCR<String>();
        Iterator iterator = oxLO.sY().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            oxLO.sY(feCR2, world.getName());
        }
        return feCR2;
    }

    @Override
    public feCR<String> tBsG() {
        return oxLO.sY((wwNq)o.a((TEqA)o.k(911295720), 1729188757));
    }

    @Override
    public feCR<String> LFqk() {
        return oxLO.sY((FWER)o.a((TEqA)o.k(911295720), 1286751627));
    }

    private static Object sY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

