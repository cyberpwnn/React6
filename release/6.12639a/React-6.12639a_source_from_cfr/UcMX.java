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

@BtuM(value=0)
public class UcMX
extends miQG {
    public UcMX() {
        this.command = (String)o.k(-524396488);
        this.aliases = new String[]{(String)o.k(1499748407), (String)o.k(682907702)};
        String[] arrstring = new String[2];
        arrstring[0] = UcMX.Qd((aeiw)((Object)o.k(673269243)));
        arrstring[1] = UcMX.Qd((aeiw)((Object)o.k(-1903409785)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(-1203677131);
        this.description = (String)o.k(-1914546124);
        this.vImB = (EJip)((Object)o.k(-1176677744));
        this.yJLS(FMkR$WjFM.a("\u4c4a\ufbbe\u81c0\uc41c\ua6ed\u316b\u181a\uc410"), FMkR$WjFM.a("\u4c37\ufbb9\u81c6\uc415\ua6ed\u3127\u180b\uc451\u66ba\u1a53\u62c3\u6f77\u389e\uda88\ud0d5\u32eb\ud584\uc22f\u111d\u442a\u4e1c\u6d18\u2247\ue7d5\ub0eb\u6c93\u54a5\ubf88\ua6f0\u86d8\ua9ae\u5e49\u1c52\ua1af\u3912\uda83\u4ca5\u1af1\u85e6\u36fb\ued68\ud6ee\u48b6\u76fe\ue215"));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        Player player = (Player)commandSender;
        if (UcMX.Qd((JIWX)o.k(621102355)) == false) {
            UcMX.Qd((JIWX)o.k(621102355), player);
            return;
        }
        UcMX.Qd((WWtP)o.a((TEqA)o.k(911295720), -1632546189), player);
    }

    private static Object Qd(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

