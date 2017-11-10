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

public final class nSBH
extends Enum<nSBH> {
    public static final /* enum */ nSBH gowt;
    public static final /* enum */ nSBH TOQG;
    public static final /* enum */ nSBH DPcO;
    public static final /* enum */ nSBH DrfS;
    public static final /* enum */ nSBH dDmB;
    public static final /* enum */ nSBH pirH;
    public static final /* enum */ nSBH GHjf;
    public static final /* enum */ nSBH PmXT;
    private String qluD;
    private static final /* synthetic */ nSBH[] JsyR;

    public static nSBH[] values() {
        return (nSBH[])((nSBH[])yy.p(-1732966427)).clone();
    }

    public static nSBH valueOf(String string) {
        return (nSBH)((Object)nSBH.rH(nSBH.class, string));
    }

    private nSBH(String string2) {
        try {
            this.qluD = nSBH.rH(nSBH.rH(nSBH.rH(new StringBuilder(), (String)yy.p(-1693186082)), string2));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public boolean mXJp(CommandSender commandSender) {
        return commandSender.hasPermission(this.hHaT());
    }

    public String hHaT() {
        return (String)yy.h((Object)this, 2089027555);
    }

    static {
        yy.K(1531250457, (Object)new nSBH((String)yy.p(127862756)));
        yy.K(1769080599, (Object)new nSBH((String)yy.p(-1939077150)));
        yy.K(494667757, (Object)new nSBH((String)yy.p(-1555495144)));
        yy.K(-112457749, (Object)new nSBH((String)yy.p(-365033498)));
        yy.K(-1722218527, (Object)new nSBH((String)yy.p(-2042296340)));
        yy.K(-1120008225, (Object)new nSBH((String)yy.p(-566360086)));
        yy.K(-149878987, (Object)new nSBH((String)yy.p(-976091168)));
        yy.K(-271579341, (Object)new nSBH((String)yy.p(-1828255954)));
        yy.K(-1732966427, new nSBH[]{(nSBH)((Object)yy.p(1531250457)), (nSBH)((Object)yy.p(1769080599)), (nSBH)((Object)yy.p(494667757)), (nSBH)((Object)yy.p(-112457749)), (nSBH)((Object)yy.p(-1722218527)), (nSBH)((Object)yy.p(-1120008225)), (nSBH)((Object)yy.p(-149878987)), (nSBH)((Object)yy.p(-271579341))});
    }

    private static Object rH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

