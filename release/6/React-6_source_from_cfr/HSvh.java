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

public class HSvh
extends qloI {
    private PBUD<Cnvn> kJIE;

    @Override
    public void start() {
        yy.E(this, 1566697817, new PBUD());
        HSvh.VL(this);
    }

    @Override
    public void stop() {
        HSvh.VL(this);
    }

    @Override
    public void tick() {
    }

    public boolean CVAs(Player player) {
        Object object = HSvh.VL((PBUD)yy.h(this, 1566697817));
        while (object.hasNext()) {
            Cnvn cnvn = (Cnvn)object.next();
            if (HSvh.VL(HSvh.VL(cnvn), player) == false) continue;
            return true;
        }
        return false;
    }

    public Cnvn qAsQ(Player player) {
        Object object = HSvh.VL((PBUD)yy.h(this, 1566697817));
        while (object.hasNext()) {
            Cnvn cnvn = (Cnvn)object.next();
            if (HSvh.VL(HSvh.VL(cnvn), player) == false) continue;
            return cnvn;
        }
        object = new Cnvn(player);
        HSvh.VL((PBUD)yy.h(this, 1566697817), object);
        return object;
    }

    public PBUD<Cnvn> XSFr() {
        return (PBUD)yy.h(this, 1566697817);
    }

    @EventHandler
    public void mXJp(PlayerQuitEvent playerQuitEvent) {
        if (this.CVAs((Player)HSvh.VL(playerQuitEvent))) {
            HSvh.VL(this.qAsQ((Player)HSvh.VL(playerQuitEvent)));
            HSvh.VL((PBUD)yy.h(this, 1566697817), this.qAsQ((Player)HSvh.VL(playerQuitEvent)));
        }
    }

    private static Object VL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

