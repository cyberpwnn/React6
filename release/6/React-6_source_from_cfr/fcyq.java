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
public class fcyq
extends Aqbp {
    public fcyq() {
        this.command = (String)cv.e(-1125911796);
        this.aliases = new String[]{(String)cv.e(-1802964209), (String)cv.e(-1185221874)};
        String[] arrstring = new String[1];
        arrstring[0] = fcyq.jZ((tdpC)((Object)cv.e(242159151)));
        this.VoJs = arrstring;
        this.ktXM = (String)cv.e(-2094140645);
        this.description = (String)cv.e(-2080640230);
        this.IFas = (OikN)((Object)cv.e(-428666795));
    }

    @Override
    public void ssNb(CommandSender commandSender, String[] arrstring) {
        commandSender.sendMessage(rgig$AWxc.r("\u2189\ufbf5\u3a16\ud1ae\u8282\u3b25\u511d\uf51c\uc3a7\u52f3\u5fba\u4aa4\uc921\u9408\u12a7\u360b\u5ad8\u5b9a\u4fd5\ua2b5\uff35\u2432\ue348"));
    }

    private static Object jZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

