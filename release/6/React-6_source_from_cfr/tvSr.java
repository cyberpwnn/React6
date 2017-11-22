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
public class tvSr
extends Aqbp {
    public tvSr() {
        this.command = KUXS$dwji.S("\udcd1\u12c3\u50d4\u9b33\udef7\uc0fc");
        this.aliases = new String[]{KUXS$dwji.S("\udcd1\u12c3")};
        String[] arrstring = new String[1];
        arrstring[0] = tvSr.tu((tdpC)((Object)cv.e(242159151)));
        this.VoJs = arrstring;
        this.ktXM = (String)cv.e(-2094140645);
        this.description = (String)cv.e(-2080640230);
        this.IFas = (OikN)((Object)cv.e(-1014689706));
    }

    @Override
    public void ssNb(CommandSender commandSender, String[] arrstring) {
        try {
            tvSr.tu(10000);
            return;
        }
        catch (InterruptedException interruptedException) {
            InterruptedException interruptedException2 = interruptedException;
            tvSr.tu(interruptedException);
            return;
        }
    }

    private static Object tu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

