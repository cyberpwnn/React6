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
public class dDdF
extends miQG {
    public dDdF() {
        this.command = (String)o.k(146625469);
        this.aliases = new String[]{(String)o.k(1083003836), (String)o.k(1479627707)};
        String[] arrstring = new String[2];
        arrstring[0] = dDdF.Lw((aeiw)((Object)o.k(673269243)));
        arrstring[1] = dDdF.Lw((aeiw)((Object)o.k(-1427291024)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(-1180282294);
        this.description = (String)o.k(-464039351);
        this.vImB = (EJip)((Object)o.k(-1176677744));
        this.yJLS(nJPf$sILv.G("\ubaf0\uf297\uc9f4\u0411\ua0fe\u06c6\u18eb\u6082"), nJPf$sILv.G("\uba8d\uf290\uc9f2\u0418\ua0fe\u068a\u18fa\u60c3\uaf94\u88a7\u9cf4\u0c48\u091b\uc5e9\u8307\u8319\u2081\u0c3d\u60ca\udb5d\ue9a0\u95f5\u618d\u4466\u2a96\u1a92\u377b\u3b12\u52e6\u7508\u6df2\uccf9\u3f0e\u14f2\ub2b6\ua9fc\u70b1\u15a6\u7afb\u3113\udce1\u0f93\ua454\ub9cd\u5e97"));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        Player player = (Player)commandSender;
        dDdF.Lw((YMXg)o.a((TEqA)o.k(911295720), -1641065912), player);
    }

    private static Object Lw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

