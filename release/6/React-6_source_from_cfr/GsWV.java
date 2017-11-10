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

@tLIK(value=0)
public class GsWV
extends onuL {
    public GsWV() {
        this.command = (String)yy.p(1914956808);
        this.aliases = new String[]{(String)yy.p(-411898851), (String)yy.p(-93000682)};
        String[] arrstring = new String[1];
        arrstring[0] = GsWV.mV((nSBH)((Object)yy.p(1531250457)));
        this.HUBV = arrstring;
        this.fKUx = (String)yy.p(-1722553317);
        this.description = (String)yy.p(-2113278948);
        this.owtH = (xFjc)((Object)yy.p(936183650));
    }

    @Override
    public void mXJp(CommandSender commandSender, String[] arrstring) {
        commandSender.sendMessage(NVIs$JbpD.H("\u8e33\ua691\ue037\u4b02\uc400\ue547\u32fa\u5e40\ubc1a\u138d\u20ef\u8383\u271c\ufd89\u74ab\uc1cd\u67ef\u761e\u8d08\u8344\u653a\uc797\u21bd"));
    }

    private static Object mV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

