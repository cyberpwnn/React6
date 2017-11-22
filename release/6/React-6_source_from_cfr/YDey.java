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
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

public class YDey
extends jqQR {
    private wfPa<bXOh> dNIb;

    @Override
    public void start() {
        cv.e(this, -439880379, new wfPa());
        YDey.MP(this);
    }

    @Override
    public void stop() {
        YDey.MP(this);
    }

    @Override
    public void tick() {
    }

    public boolean EmLA(Player player) {
        Object object = YDey.MP((wfPa)cv.b(this, -439880379));
        while (object.hasNext()) {
            bXOh bXOh2 = (bXOh)object.next();
            if (YDey.MP(YDey.MP(bXOh2), player) == false) continue;
            return true;
        }
        return false;
    }

    public bXOh WGJn(Player player) {
        Object object = YDey.MP((wfPa)cv.b(this, -439880379));
        while (object.hasNext()) {
            bXOh bXOh2 = (bXOh)object.next();
            if (YDey.MP(YDey.MP(bXOh2), player) == false) continue;
            return bXOh2;
        }
        object = new bXOh(player);
        YDey.MP((wfPa)cv.b(this, -439880379), object);
        return object;
    }

    public wfPa<bXOh> kQhu() {
        return (wfPa)cv.b(this, -439880379);
    }

    @EventHandler
    public void ssNb(PlayerQuitEvent playerQuitEvent) {
        if (this.EmLA((Player)YDey.MP(playerQuitEvent))) {
            YDey.MP(this.WGJn((Player)YDey.MP(playerQuitEvent)));
            YDey.MP((wfPa)cv.b(this, -439880379), this.WGJn((Player)YDey.MP(playerQuitEvent)));
        }
    }

    private static Object MP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

