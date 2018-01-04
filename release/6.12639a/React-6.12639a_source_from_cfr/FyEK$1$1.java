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

class FyEK$1$1
extends CxNA {
    final /* synthetic */ FyEK$1 jrJc;

    FyEK$1$1(FyEK$1 var1_1) {
        this.jrJc = var1_1;
    }

    @Override
    public void run() {
        FyEK$1$1.gA(FyEK$1$1.gA((FyEK$1)o.a(this, 561469698)), new DaUw((CommandSender)FyEK$1$1.gA(), new FyEK$1$1$1(this)));
        FyEK$1$1.gA(FyEK$1$1.gA(FyEK$1$1.gA((FyEK$1)o.a(this, 561469698))));
    }

    static /* synthetic */ FyEK$1 yJLS(FyEK$1$1 fyEK$1$1) {
        return (FyEK$1)o.a(fyEK$1$1, 561469698);
    }

    private static Object gA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

