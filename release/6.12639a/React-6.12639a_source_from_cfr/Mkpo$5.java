/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;

class Mkpo$5
extends xGOy {
    final /* synthetic */ Mkpo uWeE;
    private final /* synthetic */ Entity WaRF;
    private final /* synthetic */ yJSB woNE;
    private final /* synthetic */ int NgWw;
    private final /* synthetic */ Chunk eHVp;
    private final /* synthetic */ Runnable owvU;

    Mkpo$5(Mkpo mkpo, Entity entity, yJSB yJSB2, int n, Chunk chunk, Runnable runnable) {
        this.uWeE = mkpo;
        this.WaRF = entity;
        this.woNE = yJSB2;
        this.NgWw = n;
        this.eHVp = chunk;
        this.owvU = runnable;
    }

    @Override
    public void run() {
        Mkpo$5.Wz((Entity)o.a(this, -1396093074));
        Mkpo$5.Wz((yJSB)o.a(this, -1169469588), true);
        if ((Integer)o.a(this, -1549774997) == ((Chunk)o.a(this, 1176391546)).getEntities().length - 1) {
            Mkpo$5.Wz((Mkpo)o.a(this, 1134776185), Mkpo$5.Wz((yJSB)o.a(this, -1169469588)));
            ((Runnable)o.a(this, -1458155657)).run();
        }
    }

    private static Object Wz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

