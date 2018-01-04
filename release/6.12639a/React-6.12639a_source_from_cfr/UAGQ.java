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

public class UAGQ
implements xynF {
    private CommandSender sender;

    public UAGQ(CommandSender commandSender) {
        this.sender = commandSender;
    }

    public CommandSender getSender() {
        return (CommandSender)o.a(this, -1730394661);
    }

    @Override
    public void UtIU(String string) {
        UAGQ.Ar((CommandSender)o.a(this, -1730394661), string);
    }

    @Override
    public void biLo(String string) {
        UAGQ.Ar((CommandSender)o.a(this, -1730394661), string);
    }

    @Override
    public void VwLY(String string) {
        UAGQ.Ar((CommandSender)o.a(this, -1730394661), string);
    }

    @Override
    public void TEqA(String string) {
        UAGQ.Ar((CommandSender)o.a(this, -1730394661), string);
    }

    private static Object Ar(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

