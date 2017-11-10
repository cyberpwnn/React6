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

@tLIK(value=0)
public class MItN
extends onuL {
    public MItN() {
        this.command = (String)yy.p(-1485902831);
        this.aliases = new String[]{(String)yy.p(1820584986), (String)yy.p(-1317868529)};
        String[] arrstring = new String[2];
        arrstring[0] = MItN.AG((nSBH)((Object)yy.p(1531250457)));
        arrstring[1] = MItN.AG((nSBH)((Object)yy.p(494667757)));
        this.HUBV = arrstring;
        this.fKUx = (String)yy.p(2141121552);
        this.description = (String)yy.p(-620042011);
        this.owtH = (xFjc)((Object)yy.p(1640499053));
    }

    @Override
    public void mXJp(CommandSender commandSender, String[] arrstring) {
        Player player = (Player)commandSender;
        MItN.AG((avqL)yy.h((CLqw)yy.p(1998252577), -1200101154), player);
    }

    private static Object AG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

