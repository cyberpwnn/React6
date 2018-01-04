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
import java.util.List;
import org.bukkit.World;

public class lnpk {
    public static feCR<World> xFyR() {
        return new feCR<World>((List<World>)lnpk.lT());
    }

    public static boolean UtLV(String string) {
        if (lnpk.getWorld(string) != null) {
            return true;
        }
        return false;
    }

    public static World getWorld(String string) {
        return lnpk.lT(string);
    }

    private static Object lT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

