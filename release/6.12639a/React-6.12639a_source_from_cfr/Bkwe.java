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
public class Bkwe
extends miQG {
    public Bkwe() {
        this.command = (String)o.k(-1919462791);
        this.aliases = new String[]{(String)o.k(-612740488), (String)o.k(1412846199)};
        String[] arrstring = new String[2];
        arrstring[0] = Bkwe.ux((aeiw)((Object)o.k(673269243)));
        arrstring[1] = Bkwe.ux((aeiw)((Object)o.k(-1903409785)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(633950838);
        this.description = (String)o.k(-1447275915);
        this.vImB = (EJip)((Object)o.k(-1176677744));
        this.yJLS(nJPf$sILv.G("\ua574\u0c06\u95a0\ufb87\uedd1\ub73b\u321e\ud993"), nJPf$sILv.G("\ua509\u0c01\u95a6\ufb8e\uedd1\ub777\u320f\ud9d2\ua405\ufb66\u6c69\u2910\udd11\u6c01\u56b8\u3405\u65b2\ubca0\ub5f0\uc837\u2069\u8db7\u6a3a\u5db1\u4cef\u1754\uc30b\u91bf\ubcdd\u7b85\ucbbb\u288b\uc28d\ua768\ud43f\u8d1c\u955a\u2e18\u5e85\u3b1c\uf2ce\ucaf2\u8644\u43f1\uf821"));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        Player player = (Player)commandSender;
        if (Bkwe.ux((JIWX)o.k(-1404877543)) == false) {
            Bkwe.ux((JIWX)o.k(-1404877543), player);
            return;
        }
        Bkwe.ux((WWtP)o.a((TEqA)o.k(911295720), -1632546189), player);
    }

    private static Object ux(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

