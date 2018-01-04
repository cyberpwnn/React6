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
public class eYHy
extends miQG {
    public eYHy() {
        this.command = (String)o.k(-1545645480);
        this.aliases = new String[]{(String)o.k(1201033815), (String)o.k(-1288744362)};
        String[] arrstring = new String[2];
        arrstring[0] = eYHy.dd((aeiw)((Object)o.k(673269243)));
        arrstring[1] = eYHy.dd((aeiw)((Object)o.k(-1427291024)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(-1398123947);
        this.description = (String)o.k(-2106764716);
        this.vImB = (EJip)((Object)o.k(319771278));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        new eYHy$1(this, commandSender);
    }

    private static Object dd(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

