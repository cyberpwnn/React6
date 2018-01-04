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

public final class ThWp
extends Enum<ThWp> {
    public static final /* enum */ ThWp YMqx;
    public static final /* enum */ ThWp dVcL;
    private String cubk;
    private static final /* synthetic */ ThWp[] UBFj;

    static {
        o.w(-1398058332, (Object)new ThWp(nJPf$sILv.G("\u2e53\ua4c8\ue109\u6858\u5354\u2792\u29af"), 0, nJPf$sILv.G("\u2e73\ua4e8\ue129\u6878\u5374\u27b2\u298f")));
        o.w(-166964573, (Object)new ThWp(nJPf$sILv.G("\u2e40\ua4cb\ue106\u6852\u535e\u278c\u29b9"), 1, nJPf$sILv.G("\u2e77\ua4ec\ue12d\u6821\u5372\u27af\u2992\uada9\uf41c\uf6a1\u5201")));
        o.w(-1866444142, new ThWp[]{(ThWp)((Object)o.k(-1398058332)), (ThWp)((Object)o.k(-166964573))});
    }

    private ThWp(String string2, int n2, String string3) {
        this.cubk = string2;
    }

    public String EJip() {
        return (String)o.a((Object)this, -1439411567);
    }

    public static ThWp UtIU(CommandSender commandSender) {
        if (commandSender instanceof Player) {
            return (ThWp)((Object)o.k(-1398058332));
        }
        return (ThWp)((Object)o.k(-166964573));
    }

    public static ThWp[] values() {
        ThWp[] arrthWp = (ThWp[])o.k(-1866444142);
        int n = arrthWp.length;
        ThWp[] arrthWp2 = new ThWp[n];
        ThWp.Ir(arrthWp, false, arrthWp2, false, n);
        return arrthWp2;
    }

    public static ThWp valueOf(String string) {
        return (ThWp)((Object)ThWp.Ir(ThWp.class, string));
    }

    private static Object Ir(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

