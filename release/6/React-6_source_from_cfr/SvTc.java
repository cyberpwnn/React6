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

public class SvTc
implements WFnH {
    private CommandSender sender;

    public SvTc(CommandSender commandSender) {
        this.sender = commandSender;
    }

    public CommandSender getSender() {
        return (CommandSender)yy.h(this, 2028399069);
    }

    @Override
    public void jVod(String string) {
        SvTc.hZ((CommandSender)yy.h(this, 2028399069), string);
    }

    @Override
    public void wnXH(String string) {
        SvTc.hZ((CommandSender)yy.h(this, 2028399069), string);
    }

    @Override
    public void qKCn(String string) {
        SvTc.hZ((CommandSender)yy.h(this, 2028399069), string);
    }

    @Override
    public void HdqI(String string) {
        SvTc.hZ((CommandSender)yy.h(this, 2028399069), string);
    }

    private static Object hZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

