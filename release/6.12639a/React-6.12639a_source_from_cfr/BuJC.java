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
public class BuJC
extends miQG {
    public BuJC() {
        this.command = (String)o.k(-1157277566);
        this.aliases = new String[]{(String)o.k(-754034559), (String)o.k(1030772864)};
        String[] arrstring = new String[1];
        arrstring[0] = BuJC.vo((aeiw)((Object)o.k(673269243)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(-42881);
        this.description = (String)o.k(1577998462);
        this.vImB = (EJip)((Object)o.k(319771278));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        Object object = "";
        Object object2 = BuJC.vo(BuJC.vo(BuJC.vo(BuJC.vo())));
        object = BuJC.vo(object2, FMkR$WjFM.a("\uedce")) != false ? BuJC.vo(BuJC.vo(BuJC.vo(BuJC.vo(new StringBuilder((String)BuJC.vo(object)), (psKX)((Object)o.k(568215020))), BuJC.vo((psKX)((Object)o.k(-911320963)))), object2)) : BuJC.vo(BuJC.vo(BuJC.vo(new StringBuilder((String)BuJC.vo(object)), (psKX)((Object)o.k(-1868409976))), object2));
        BuJC.vo(commandSender, BuJC.vo(BuJC.vo(BuJC.vo(BuJC.vo(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), FMkR$WjFM.a("\uedfd\ue9c5\u7558\uc0c7\u2f41\ucc54")), object)));
    }

    private static Object vo(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

