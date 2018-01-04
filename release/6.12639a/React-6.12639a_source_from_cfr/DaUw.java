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

public class DaUw
extends Thread {
    private CommandSender sender;
    private int htEq;
    private Runnable wnns;

    public DaUw(CommandSender commandSender) {
        this.sender = commandSender;
        this.htEq = 0;
        this.setPriority(10);
        this.wnns = null;
        this.setName(mrFx$WjFM.d("\u1297\u19cf\u5456\ue724\uf608\u51e0\u7c0f\ue56b\u626e\u414a\ud376\ueeef\uda8b\ub050\u8cbd\u4d5c\u62fd\u7722\u6a86"));
    }

    public DaUw(CommandSender commandSender, Runnable runnable) {
        this(commandSender);
        this.wnns = runnable;
    }

    @Override
    public void run() {
        new DaUw$1(this);
        Object object = false;
        Object object2 = Integer.MIN_VALUE;
        if (DaUw.interrupted()) {
            return;
        }
        int n = 0;
        while (n < 19) {
            if (DaUw.interrupted()) {
                return;
            }
            Object object3 = DaUw.vn();
            object = object3;
            if (object3 > object2) {
                object2 = object;
                o.v(this, -1399306801, (int)object2);
            }
            ++n;
        }
        if (DaUw.interrupted()) {
            return;
        }
        new DaUw$2(this);
    }

    public CommandSender getSender() {
        return (CommandSender)o.a(this, -103201330);
    }

    public int getScore() {
        return (Integer)o.a(this, -1399306801);
    }

    public Runnable dfaE() {
        return (Runnable)o.a(this, -1608301107);
    }

    static /* synthetic */ CommandSender yJLS(DaUw daUw) {
        return (CommandSender)o.a(daUw, -103201330);
    }

    static /* synthetic */ int UtIU(DaUw daUw) {
        return (Integer)o.a(daUw, -1399306801);
    }

    static /* synthetic */ Runnable biLo(DaUw daUw) {
        return (Runnable)o.a(daUw, -1608301107);
    }

    private static Object vn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

