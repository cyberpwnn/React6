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

public class aLYV
implements ftyu {
    private CommandSender sender;

    public aLYV(CommandSender commandSender) {
        this.sender = commandSender;
    }

    public CommandSender getSender() {
        return (CommandSender)cv.b(this, -763818058);
    }

    @Override
    public void DYFV(String string) {
        aLYV.xJ((CommandSender)cv.b(this, -763818058), string);
    }

    @Override
    public void IWSm(String string) {
        aLYV.xJ((CommandSender)cv.b(this, -763818058), string);
    }

    @Override
    public void OXeK(String string) {
        aLYV.xJ((CommandSender)cv.b(this, -763818058), string);
    }

    @Override
    public void YoSa(String string) {
        aLYV.xJ((CommandSender)cv.b(this, -763818058), string);
    }

    private static Object xJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

