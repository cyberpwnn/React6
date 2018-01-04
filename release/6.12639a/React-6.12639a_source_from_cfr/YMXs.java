/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.block.BlockExplodeEvent
 *  org.bukkit.event.entity.EntityExplodeEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public class YMXs
extends ggmf {
    private boolean BeGP;
    private long Koam;
    private long KDnL;
    private OXoN xiqO;

    @Override
    public void start() {
        YMXs.Cb(this);
        o.v(this, -1558750948, false);
        o.v(this, 1948604699, (long)YMXs.Cb());
        o.v(this, -1243981526, (long)YMXs.Cb());
        o.v(this, 647911721, new OXoN(30));
    }

    private void FyEK() {
        if (!((Boolean)o.a(this, -1558750948)).booleanValue()) {
            YMXs.Cb((OXoN)o.a(this, 647911721), 0.0);
            return;
        }
        if ((Long)o.a(this, -1243981526) < (Long)o.a(this, 1948604699)) {
            o.v(this, 1948604699, (long)((Long)o.a(this, -1243981526)));
        }
        YMXs.Cb((OXoN)o.a(this, 647911721), (Long)o.a(this, -1243981526) - (Long)o.a(this, 1948604699));
        o.v(this, -1558750948, false);
    }

    private void TWYT() {
        if (!((Boolean)o.a(this, -1558750948)).booleanValue()) {
            o.v(this, -1558750948, true);
            o.v(this, 1948604699, (long)YMXs.Cb());
            return;
        }
        o.v(this, -1243981526, (long)YMXs.Cb());
    }

    @Override
    public void stop() {
        YMXs.Cb(this);
    }

    @uFVW
    @Override
    public void tick() {
        this.FyEK();
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(EntityExplodeEvent entityExplodeEvent) {
        this.TWYT();
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(BlockExplodeEvent blockExplodeEvent) {
        this.TWYT();
    }

    public boolean jxxu() {
        return (Boolean)o.a(this, -1558750948);
    }

    public long YLuU() {
        return (Long)o.a(this, 1948604699);
    }

    public long WytI() {
        return (Long)o.a(this, -1243981526);
    }

    public OXoN SmjV() {
        return (OXoN)o.a(this, 647911721);
    }

    private static Object Cb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

