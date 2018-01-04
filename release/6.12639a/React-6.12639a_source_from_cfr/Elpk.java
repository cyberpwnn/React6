/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.World
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.world.WorldUnloadEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.WorldUnloadEvent;

public class Elpk
extends ggmf {
    @Override
    public void start() {
        Elpk.BC(this);
        Iterator iterator = Elpk.BC().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            Elpk.BC(world);
        }
    }

    @Override
    public void stop() {
        Elpk.BC(this);
        Iterator iterator = Elpk.BC().iterator();
        while (iterator.hasNext()) {
            World world = (World)iterator.next();
            Elpk.BC(world);
        }
    }

    @Override
    public void tick() {
    }

    @EventHandler
    public void yJLS(WorldUnloadEvent worldUnloadEvent) {
        Elpk.BC(Elpk.BC(worldUnloadEvent));
    }

    private static Object BC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

