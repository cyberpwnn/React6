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

public final class tdpC
extends Enum<tdpC> {
    public static final /* enum */ tdpC vswA;
    public static final /* enum */ tdpC yBLM;
    public static final /* enum */ tdpC IXEl;
    public static final /* enum */ tdpC nRmP;
    public static final /* enum */ tdpC uyeC;
    public static final /* enum */ tdpC DsJQ;
    public static final /* enum */ tdpC XdPy;
    public static final /* enum */ tdpC FMxr;
    public static final /* enum */ tdpC IXDX;
    public static final /* enum */ tdpC LqnN;
    public static final /* enum */ tdpC jXBg;
    public static final /* enum */ tdpC CNCt;
    private String rgig;
    private static final /* synthetic */ tdpC[] IygB;

    public static tdpC[] values() {
        return (tdpC[])((tdpC[])cv.e(-38728157)).clone();
    }

    public static tdpC valueOf(String string) {
        return (tdpC)((Object)tdpC.ep(tdpC.class, string));
    }

    private tdpC(String string2) {
        try {
            this.rgig = tdpC.ep(tdpC.ep(tdpC.ep(new StringBuilder(), (String)cv.e(-1817965022)), string2));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public boolean ssNb(CommandSender commandSender) {
        return commandSender.hasPermission(this.VCgr());
    }

    public String VCgr() {
        return (String)cv.b((Object)this, -645722579);
    }

    static {
        cv.V(242159151, (Object)new tdpC((String)cv.e(1481313836)));
        cv.V(2058817065, (Object)new tdpC((String)cv.e(960302638)));
        cv.V(1889406507, (Object)new tdpC((String)cv.e(62131752)));
        cv.V(-377614827, (Object)new tdpC((String)cv.e(274206250)));
        cv.V(1437011479, (Object)new tdpC((String)cv.e(747376148)));
        cv.V(571280913, (Object)new tdpC((String)cv.e(-1449980394)));
        cv.V(-1367929325, (Object)new tdpC((String)cv.e(-222294512)));
        cv.V(-1767240163, (Object)new tdpC((String)cv.e(1442319890)));
        cv.V(-607646177, (Object)new tdpC((String)cv.e(-611971556)));
        cv.V(1427312153, (Object)new tdpC((String)cv.e(-667939298)));
        cv.V(-638841253, (Object)new tdpC((String)cv.e(-1389883816)));
        cv.V(2075004485, (Object)new tdpC((String)cv.e(-316469670)));
        cv.V(-38728157, new tdpC[]{(tdpC)((Object)cv.e(242159151)), (tdpC)((Object)cv.e(2058817065)), (tdpC)((Object)cv.e(1889406507)), (tdpC)((Object)cv.e(-377614827)), (tdpC)((Object)cv.e(1437011479)), (tdpC)((Object)cv.e(571280913)), (tdpC)((Object)cv.e(-1367929325)), (tdpC)((Object)cv.e(-1767240163)), (tdpC)((Object)cv.e(-607646177)), (tdpC)((Object)cv.e(1427312153)), (tdpC)((Object)cv.e(-638841253)), (tdpC)((Object)cv.e(2075004485))});
    }

    private static Object ep(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

