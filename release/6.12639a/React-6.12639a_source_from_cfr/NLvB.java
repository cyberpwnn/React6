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
public class NLvB
extends miQG {
    public NLvB() {
        this.command = (String)o.k(356145199);
        this.aliases = new String[]{(String)o.k(1664833582), (String)o.k(1418680365)};
        String[] arrstring = new String[2];
        arrstring[0] = NLvB.MG((aeiw)((Object)o.k(673269243)));
        arrstring[1] = NLvB.MG((aeiw)((Object)o.k(-1249688188)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(1222989868);
        this.description = (String)o.k(-387098581);
        this.vImB = (EJip)((Object)o.k(-1176677744));
        this.yJLS(mrFx$WjFM.d("\uf72c\u3dfd\u30eb\u666f\u72df\ue516\ue196\uc544"), mrFx$WjFM.d("\uf751\u3dfa\u30ed\u6666\u72df\ue55a\ue187\uc505\ud0d9\u00bf\uf42c\u65b3\u3788\u7533\u57c8\u688f\u8020\ue6b7\u803d\uacaa\u4fc8\u1d17\ufc27\uf30d\ua920\u979f\u6c17\u12b2\u449b\ufd14\ue199\ua2b1\u4b5e\ufe21\ud788\udcbb\u7688\u884a\uff06\udcaa\uda65\ua693\u6c25\ufae0\u4ff5"));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        Player player = (Player)commandSender;
        if (NLvB.MG((JIWX)o.k(-918600437)) == false) {
            NLvB.MG((JIWX)o.k(-918600437), player);
            return;
        }
        NLvB.MG((cJUN)o.a((TEqA)o.k(911295720), -1378592710), player);
    }

    private static Object MG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

