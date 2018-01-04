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

class kbjT$1$1
extends vbvg {
    final /* synthetic */ kbjT.1 IFwe;
    private final /* synthetic */ CommandSender USIc;

    kbjT$1$1(kbjT.1 var1_1, String string, int n, CommandSender commandSender) {
        this.IFwe = var1_1;
        this.USIc = commandSender;
        super(string, n);
    }

    @Override
    public void run() {
        kbjT$1$1.ni((CommandSender)o.a(this, 309811234), kbjT$1$1.ni(kbjT$1$1.ni(kbjT$1$1.ni(new StringBuilder(nJPf$sILv.G("\udde3\u55c6\ua909\u283f\uf2bb\ua281")), kbjT$1$1.ni(kbjT$1$1.ni(kbjT$1$1.ni(kbjT$1$1.ni())))), nJPf$sILv.G("\udd91\u55f1\ua90d\u2830\uf2a0\ua2c0\u7c00\u0cd8\u8873"))));
    }

    private static Object ni(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

