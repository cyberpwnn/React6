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
public class kAFo
extends Aqbp {
    public kAFo() {
        this.command = (String)cv.e(-1688465187);
        this.aliases = new String[]{(String)cv.e(653594844), (String)cv.e(-2021256993)};
        String[] arrstring = new String[1];
        arrstring[0] = kAFo.kr((tdpC)((Object)cv.e(242159151)));
        this.VoJs = arrstring;
        this.ktXM = (String)cv.e(-593424162);
        this.description = (String)cv.e(2108559577);
        this.IFas = (OikN)((Object)cv.e(-428666795));
    }

    @Override
    public void ssNb(CommandSender commandSender, String[] arrstring) {
        kAFo.kr(new PuYf(commandSender));
    }

    private static Object kr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

