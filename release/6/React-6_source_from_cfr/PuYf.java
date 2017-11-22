/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;

public class PuYf
extends Thread {
    private CommandSender sender;
    private int kcUD;

    public PuYf(CommandSender commandSender) {
        this.sender = commandSender;
        this.kcUD = 0;
        this.setPriority(10);
    }

    @Override
    public void run() {
        new PuYf$1(this);
        Object object = false;
        Object object2 = Integer.MIN_VALUE;
        for (int i = 0; i < 19; ++i) {
            Object object3 = PuYf.Uk();
            object = object3;
            if (object3 <= object2) continue;
            object2 = object;
            cv.e(this, -1122496668, (int)object2);
        }
        new PuYf$2(this);
    }

    static /* synthetic */ CommandSender ssNb(PuYf puYf) {
        return (CommandSender)cv.b(puYf, 1354633063);
    }

    static /* synthetic */ int DYFV(PuYf puYf) {
        return (Integer)cv.b(puYf, -1122496668);
    }

    private static Object Uk(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

