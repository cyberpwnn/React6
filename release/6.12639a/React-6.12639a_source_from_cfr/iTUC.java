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

@BtuM(value=0)
public class iTUC
extends miQG {
    public iTUC() {
        this.command = (String)o.k(-144485805);
        this.aliases = new String[]{(String)o.k(-2033626174), (String)o.k(752833473)};
        String[] arrstring = new String[1];
        arrstring[0] = iTUC.ST((aeiw)((Object)o.k(673269243)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(340153280);
        this.description = (String)o.k(1601196991);
        this.vImB = (EJip)((Object)o.k(319771278));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        iTUC.ST(new DaUw(commandSender));
    }

    private static Object ST(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

