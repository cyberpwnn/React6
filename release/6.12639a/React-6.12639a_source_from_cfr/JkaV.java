/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.player.PlayerQuitEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Set;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

public class JkaV
extends ggmf {
    private feCR<Jbjx> YNXE;
    private Lhwj<Jbjx> cdfG;

    @Override
    public void start() {
        o.v(this, 929846832, new feCR());
        o.v(this, -1258334673, new Lhwj());
        JkaV.Cu(this);
    }

    @Override
    public void stop() {
        JkaV.Cu((Lhwj)o.a(this, -1258334673), (feCR)o.a(this, 929846832));
        Object object = JkaV.Cu((Lhwj)o.a(this, -1258334673));
        while (object.hasNext()) {
            Jbjx jbjx = (Jbjx)object.next();
            this.yJLS((Player)JkaV.Cu(jbjx), true);
        }
        JkaV.Cu((Lhwj)o.a(this, -1258334673));
        JkaV.Cu(this);
    }

    @Override
    public void tick() {
        if ((Long)o.k(-619556004) % 20 == 0) {
            feCR feCR2 = new feCR((Lhwj)o.a(this, -1258334673));
            JkaV.Cu((Lhwj)o.a(this, -1258334673));
            new JkaV$1(this, feCR2);
        }
    }

    public boolean dfaE(Player player) {
        Object object = JkaV.Cu((feCR)o.a(this, 929846832));
        while (object.hasNext()) {
            Jbjx jbjx = (Jbjx)object.next();
            if (JkaV.Cu(JkaV.Cu(jbjx), player) == false) continue;
            return true;
        }
        return false;
    }

    public void yJLS(Player player, boolean bl) {
        if (this.dfaE(player)) {
            if (bl) {
                JkaV.Cu((Lhwj)o.a(this, -1258334673), this.sQJh(player));
                JkaV.Cu(this.sQJh(player));
                return;
            }
            JkaV.Cu((Lhwj)o.a(this, -1258334673), this.sQJh(player));
        }
    }

    public Jbjx sQJh(Player player) {
        Jbjx jbjx;
        Object object = JkaV.Cu((feCR)o.a(this, 929846832));
        while (object.hasNext()) {
            jbjx = (Jbjx)object.next();
            if (JkaV.Cu(JkaV.Cu(jbjx), player) == false) continue;
            return jbjx;
        }
        jbjx = new Jbjx(player);
        JkaV.Cu((feCR)o.a(this, 929846832), jbjx);
        return jbjx;
    }

    public feCR<Jbjx> CxNA() {
        return (feCR)o.a(this, 929846832);
    }

    @EventHandler
    public void yJLS(PlayerQuitEvent playerQuitEvent) {
        if (this.dfaE((Player)JkaV.Cu(playerQuitEvent))) {
            JkaV.Cu(this.sQJh((Player)JkaV.Cu(playerQuitEvent)));
            JkaV.Cu((feCR)o.a(this, 929846832), this.sQJh((Player)JkaV.Cu(playerQuitEvent)));
        }
    }

    private static Object Cu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

