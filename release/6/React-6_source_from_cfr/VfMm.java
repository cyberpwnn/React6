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

@IWbc(value=0)
public class VfMm
extends Aqbp {
    public VfMm() {
        this.command = (String)cv.e(-450432249);
        this.aliases = new String[]{(String)cv.e(-1140329722), (String)cv.e(263189249)};
        String[] arrstring = new String[2];
        arrstring[0] = VfMm.Vr((tdpC)((Object)cv.e(242159151)));
        arrstring[1] = VfMm.Vr((tdpC)((Object)cv.e(571280913)));
        this.VoJs = arrstring;
        this.ktXM = (String)cv.e(2135356160);
        this.description = (String)cv.e(-15469821);
        this.IFas = (OikN)((Object)cv.e(-1014689706));
    }

    @Override
    public void ssNb(CommandSender commandSender, String[] arrstring) {
        Player player = (Player)commandSender;
        VfMm.Vr((tKcS)cv.b((YoSa)cv.e(239341894), 2035872514), player);
    }

    private static Object Vr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

