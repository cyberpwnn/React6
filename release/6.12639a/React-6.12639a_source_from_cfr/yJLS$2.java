/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.World
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.World;

class yJLS$2
implements Runnable {
    private final /* synthetic */ dDeO rMpA;
    private final /* synthetic */ World FWER;

    yJLS$2(dDeO dDeO2, World world) {
        this.rMpA = dDeO2;
        this.FWER = world;
    }

    @Override
    public void run() {
        yJLS$2.Vr((dDeO)o.a(this, 654530565), (World)o.a(this, -1353820156));
    }

    private static Object Vr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

