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

public final class HCSq
extends Enum<HCSq> {
    public static final /* enum */ HCSq Tyjs;
    public static final /* enum */ HCSq ydSf;
    private String cSRj;
    private static final /* synthetic */ HCSq[] nRrG;

    public static HCSq[] values() {
        return (HCSq[])((HCSq[])cv.e(-2109206417)).clone();
    }

    public static HCSq valueOf(String string) {
        return (HCSq)((Object)HCSq.cw(HCSq.class, string));
    }

    private HCSq(String string2) {
        this.cSRj = string2;
    }

    public String cRaV() {
        return (String)cv.b((Object)this, 1435701358);
    }

    public static HCSq DYFV(CommandSender commandSender) {
        if (commandSender instanceof Player) {
            return (HCSq)((Object)cv.e(-770568087));
        }
        return (HCSq)((Object)cv.e(1020727400));
    }

    static {
        cv.V(-770568087, (Object)new HCSq(rgig$AWxc.r("\ub1bd\u4dff\u45e2\u711b\u8249\u1495\u2cb6")));
        cv.V(1020727400, (Object)new HCSq(rgig$AWxc.r("\ub1b9\u4dfb\u45e6\u7142\u824f\u1488\u2cab\u6719\u26dc\ufcde\ua8d0")));
        cv.V(-2109206417, new HCSq[]{(HCSq)((Object)cv.e(-770568087)), (HCSq)((Object)cv.e(1020727400))});
    }

    private static Object cw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

