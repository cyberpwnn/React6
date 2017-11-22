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

@IWbc(value=0)
public class YoWX
extends Aqbp {
    public YoWX() {
        this.command = (String)cv.e(-574156554);
        this.aliases = new String[]{(String)cv.e(1933447409), (String)cv.e(200085744)};
        String[] arrstring = new String[2];
        arrstring[0] = YoWX.WB((tdpC)((Object)cv.e(242159151)));
        arrstring[1] = YoWX.WB((tdpC)((Object)cv.e(2075004485)));
        this.VoJs = arrstring;
        this.ktXM = (String)cv.e(1253511411);
        this.description = (String)cv.e(1111167218);
        this.IFas = (OikN)((Object)cv.e(-428666795));
    }

    @Override
    public void ssNb(CommandSender commandSender, String[] arrstring) {
        YoWX.WB(commandSender, YoWX.WB(YoWX.WB(YoWX.WB(new StringBuilder(YEBy$TyVf.W("\u7823\u0eaf\u7089\u7d88\u30d7\u3774")), YoWX.WB(YoWX.WB(YoWX.WB(YoWX.WB())))), YEBy$TyVf.W("\u7851\u0e98\u708d\u7d87\u30cc\u3735\u1e51\u4515\u95e1"))));
        YoWX.WB();
    }

    private static Object WB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

