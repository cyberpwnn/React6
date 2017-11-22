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

@lDTo
public class YUgh
extends jqQR
implements XSJd {
    private ktOu<Chunk, HKdE> ObOd;

    @Override
    public void start() {
        cv.e(this, 31454552, new ktOu());
        YUgh.vl(this);
        YUgh.vl(this);
    }

    @Override
    public void stop() {
        YUgh.vl(this);
        YUgh.vl(this);
    }

    @YffC
    @Override
    public void tick() {
    }

    public void LGKl(Chunk chunk) {
        this.ssNb(chunk, (NUdB)((Object)cv.e(760942516)), 10);
    }

    public void ykmX(Chunk chunk) {
        this.ssNb(chunk, (NUdB)((Object)cv.e(-1111289931)), 10);
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void ssNb(ChunkUnloadEvent chunkUnloadEvent) {
        YUgh.vl((ktOu)cv.b(this, 31454552), YUgh.vl(chunkUnloadEvent));
    }

    public void ssNb(Chunk chunk, NUdB nUdB, int n) {
        if (YUgh.vl((ktOu)cv.b(this, 31454552), chunk) == false) {
            YUgh.vl((ktOu)cv.b(this, 31454552), chunk, new HKdE(chunk));
        }
        YUgh.vl((HKdE)YUgh.vl((ktOu)cv.b(this, 31454552), chunk), nUdB, n);
    }

    @Override
    public void FFBA() {
        try {
            Object object = YUgh.vl(YUgh.vl((ktOu)cv.b(this, 31454552)));
            while (object.hasNext()) {
                Chunk chunk = (Chunk)object.next();
                HKdE hKdE = (HKdE)YUgh.vl((ktOu)cv.b(this, 31454552), chunk);
                YUgh.vl(hKdE);
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            YUgh.vl(exception);
            return;
        }
    }

    @Override
    public String BuHU() {
        return YEBy$TyVf.W("\u8a2a\ub9ae\u3af7\uc169\ue927\u3349\u6738\u38e1\u2e1a\u9ce1\uc747\u663c\u90ee\u6bf8\udc09\u35f1\u40af\u596c");
    }

    public ktOu<Chunk, HKdE> bqcB() {
        return (ktOu)cv.b(this, 31454552);
    }

    private static Object vl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

