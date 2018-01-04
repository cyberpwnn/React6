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
public class kbjT
extends miQG {
    public kbjT() {
        this.command = (String)o.k(794449950);
        this.aliases = new String[]{(String)o.k(75388957), (String)o.k(-1154656228)};
        String[] arrstring = new String[2];
        arrstring[0] = kbjT.qI((aeiw)((Object)o.k(673269243)));
        arrstring[1] = kbjT.qI((aeiw)((Object)o.k(-2033957790)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(1063278619);
        this.description = (String)o.k(-1698342870);
        this.vImB = (EJip)((Object)o.k(319771278));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        kbjT.qI(new kbjT$1(this, commandSender));
    }

    private static Object qI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

