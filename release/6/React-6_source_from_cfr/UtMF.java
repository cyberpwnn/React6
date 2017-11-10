/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class UtMF
extends Enum<UtMF> {
    public static final /* enum */ UtMF fSiD;
    public static final /* enum */ UtMF IiHr;
    private String priD;
    private static final /* synthetic */ UtMF[] Cwwo;

    public static UtMF[] values() {
        return (UtMF[])((UtMF[])yy.p(-843118960)).clone();
    }

    public static UtMF valueOf(String string) {
        return (UtMF)((Object)UtMF.tl(UtMF.class, string));
    }

    private UtMF(String string2) {
        this.priD = string2;
    }

    public String VUMv() {
        return (String)yy.h((Object)this, -1102117019);
    }

    public static UtMF ksfs(CommandSender commandSender) {
        if (commandSender instanceof Player) {
            return (UtMF)((Object)yy.p(1984366430));
        }
        return (UtMF)((Object)yy.p(1787430755));
    }

    static {
        yy.K(1984366430, (Object)new UtMF(KDGY$JAHk.Y("\u1e55\u9de9\u1057\ufa68\u6abb\u72ef\udb14")));
        yy.K(1787430755, (Object)new UtMF(KDGY$JAHk.Y("\u1e51\u9ded\u1053\ufa31\u6abd\u72f2\udb09\u73af\u8658\ubc98\u8255")));
        yy.K(-843118960, new UtMF[]{(UtMF)((Object)yy.p(1984366430)), (UtMF)((Object)yy.p(1787430755))});
    }

    private static Object tl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

