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
public class RPon
extends Aqbp {
    public RPon() {
        this.command = (String)cv.e(-1783893239);
        this.aliases = new String[]{(String)cv.e(1017180936), (String)cv.e(1821897483)};
        String[] arrstring = new String[2];
        arrstring[0] = RPon.oZ((tdpC)((Object)cv.e(242159151)));
        arrstring[1] = RPon.oZ((tdpC)((Object)cv.e(1889406507)));
        this.VoJs = arrstring;
        this.ktXM = (String)cv.e(777384714);
        this.description = (String)cv.e(-1424355083);
        this.IFas = (OikN)((Object)cv.e(-1014689706));
    }

    @Override
    public void ssNb(CommandSender commandSender, String[] arrstring) {
        Player player = (Player)commandSender;
        RPon.oZ((GIDW)cv.b((YoSa)cv.e(239341894), 272634100), player);
    }

    private static Object oZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

