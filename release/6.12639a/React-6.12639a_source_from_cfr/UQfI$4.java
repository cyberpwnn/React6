/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;

class UQfI$4
extends xGOy {
    final /* synthetic */ UQfI oDqt;
    private final /* synthetic */ Chunk eHVp;
    private final /* synthetic */ Runnable owvU;

    UQfI$4(UQfI uQfI, Chunk chunk, Runnable runnable) {
        this.oDqt = uQfI;
        this.eHVp = chunk;
        this.owvU = runnable;
    }

    @Override
    public void run() {
        UQfI$4.wQ((UQfI)o.a(this, 495469707), true);
        if (UQfI$4.wQ((Chunk)o.a(this, 1242907801)) != false) {
            UQfI$4.wQ((UQfI)o.a(this, 495469707), false);
        }
        UQfI$4.wQ((UQfI)o.a(this, 495469707), UQfI$4.wQ());
        ((Runnable)o.a(this, -585481065)).run();
    }

    private static Object wQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

