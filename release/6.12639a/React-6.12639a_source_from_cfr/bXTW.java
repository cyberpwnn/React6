/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.world.ChunkUnloadEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.world.ChunkUnloadEvent;

@tvby
public class bXTW
extends ggmf
implements qSgW {
    private TNku<Chunk, Rjca> NVho;

    @Override
    public void start() {
        o.v(this, -2111809466, new TNku());
        bXTW.de(this);
        bXTW.de(this);
    }

    @Override
    public void stop() {
        bXTW.de(this);
        bXTW.de(this);
    }

    @uFVW
    @Override
    public void tick() {
    }

    public void Ipep(Chunk chunk) {
        this.yJLS(chunk, (GkCK)((Object)o.k(1070941663)), 10);
    }

    public void qcvH(Chunk chunk) {
        this.yJLS(chunk, (GkCK)((Object)o.k(1460684256)), 10);
    }

    public void UQfI(Chunk chunk) {
        this.yJLS(chunk, (GkCK)((Object)o.k(-365017634)), 10);
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void yJLS(ChunkUnloadEvent chunkUnloadEvent) {
        bXTW.de((TNku)o.a(this, -2111809466), bXTW.de(chunkUnloadEvent));
    }

    public void yJLS(Chunk chunk, GkCK gkCK, int n) {
        if (bXTW.de((TNku)o.a(this, -2111809466), chunk) == false) {
            bXTW.de((TNku)o.a(this, -2111809466), chunk, new Rjca(chunk));
        }
        bXTW.de((Rjca)bXTW.de((TNku)o.a(this, -2111809466), chunk), gkCK, n);
    }

    @Override
    public void owir() {
        try {
            Object object = bXTW.de(bXTW.de((TNku)o.a(this, -2111809466)));
            while (object.hasNext()) {
                Chunk chunk = (Chunk)object.next();
                Rjca rjca = (Rjca)bXTW.de((TNku)o.a(this, -2111809466), chunk);
                bXTW.de(rjca);
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            bXTW.de(exception);
            return;
        }
    }

    @Override
    public String YMWq() {
        return mrFx$WjFM.d("\u34c2\f\u2808\u081c\u5dc8\u9a53\uac5b\u6899\u6be0\u5d88\ua64f\u7487\u9f1c\u5c69\u653d\ua7de\u4331\u61ed");
    }

    public TNku<Chunk, Rjca> MRfD() {
        return (TNku)o.a(this, -2111809466);
    }

    private static Object de(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

