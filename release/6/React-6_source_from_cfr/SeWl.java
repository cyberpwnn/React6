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
public class SeWl
extends onuL {
    public SeWl() {
        this.command = (String)yy.p(-641595673);
        this.aliases = new String[]{(String)yy.p(1682900712), (String)yy.p(1983055613)};
        String[] arrstring = new String[1];
        arrstring[0] = SeWl.op((nSBH)((Object)yy.p(1531250457)));
        this.HUBV = arrstring;
        this.fKUx = (String)yy.p(-1158150405);
        this.description = (String)yy.p(-1421605124);
        this.owtH = (xFjc)((Object)yy.p(936183650));
    }

    @Override
    public void mXJp(CommandSender commandSender, String[] arrstring) {
        Object object;
        if (arrstring.length == 0) {
            SeWl.op(commandSender, KDGY$JAHk.Y("\u24c7\ua8c6\ue332\ub7fd\u0523\uebc1\ub3dc\ucb33\u3b3b\u4fb7\ucfec\u5d48\ueb37\ue9a7\u526d\u213a\u7468\u4f1d\uad58\uea89\uee5e\u5ae7\uff45\uca10\u9127\udad4\u292f\u28c4\u7f1c\u3809\u9a76\u553c\u689e\uf31a\u1c9a\u4f9a"));
            return;
        }
        String string = arrstring[0];
        NxIh[] arrnxIh = new NxIh[arrstring.length - 1];
        PBUD pBUD = new PBUD();
        Ahqh ahqh = null;
        Object object2 = SeWl.op(SeWl.op((CUga)yy.h((CLqw)yy.p(1998252577), 490604273)));
        block2 : while (object2.hasNext()) {
            object = (Ahqh)object2.next();
            for (String string2 : object.Cnvn()) {
                if (SeWl.op(string2, string) == false) continue;
                ahqh = object;
                break block2;
            }
        }
        if (ahqh == null) {
            SeWl.op(commandSender, SeWl.op(SeWl.op(SeWl.op(new StringBuilder(KDGY$JAHk.Y("\u24c1\ua8c7\ue334\ub7f6\u056c\uebda\ub3db\ucb60\u3b0e\u4ff4\ucff7\u5d47\ueb78\ue9a8\u5234\u216e")), (ydHl)((Object)yy.p(-329382161))), string)));
            return;
        }
        if (SeWl.op(ahqh.CLtX(), (Lhol)((Object)yy.p(1174858110))) != false) {
            SeWl.op(commandSender, SeWl.op(SeWl.op(SeWl.op(SeWl.op(SeWl.op(new StringBuilder(), (ydHl)((Object)yy.p(-329382161))), KDGY$JAHk.Y("\u24d5\ua8ca\ue32b\ub7f1\u056c\uebc3\ub38f\ucb60")), ahqh.getName()), KDGY$JAHk.Y("\u24b4\ua8cd\ue330\ub7fd\u0570\ueb8d\ub3db\ucb2f\u3b3b\u4fb7\ucff0\u5d5b\ueb67\ue9b6\u5261\u213c\u7475\u4f52\uad5b\uea9b\uee10\u5ae1\uff4c\uca13\u9172\udad1\u2925\u2892\u7f11\u380f\u9a37\u5520\u6892\uf307\u1c91\u4fc7\uc245"))));
            return;
        }
        if (arrstring.length > 0) {
            for (int i = 0; i < arrstring.length - 1; ++i) {
                try {
                    object = SeWl.op(SeWl.op(arrstring[i + 1]));
                    arrnxIh[i] = SeWl.op(commandSender, object);
                    SeWl.op();
                    if (SeWl.op(SeWl.op(ahqh.cdDX()), arrnxIh[i].getType()) != false) continue;
                    SeWl.op(commandSender, SeWl.op(SeWl.op(SeWl.op(SeWl.op(SeWl.op(SeWl.op(new StringBuilder(), (ydHl)((Object)yy.p(-329382161))), KDGY$JAHk.Y("\u24d5\ua8ca\ue32b\ub7f1\u056c\uebc3\ub38f\ucb60")), ahqh.getName()), KDGY$JAHk.Y("\u24b4\ua8cd\ue330\ub7fd\u0570\ueb8d\ub3db\ucb2f\u3b3b\u4fb7\ucff0\u5d5b\ueb67\ue9b6\u5261\u213c\u7475\u4f52\uad42\uea92\uee1b\u5ab4\uff5e\uca1a\u913e\udadd\u2928\u2890\u7f11\u381e\u9a6c\u5574")), arrnxIh[i].getName())));
                    return;
                }
                catch (Foor foor) {
                    SeWl.op(pBUD, SeWl.op(foor));
                    SeWl.op(foor);
                }
            }
        }
        if (SeWl.op(pBUD) != false) {
            object2 = new PJgj();
            if (commandSender instanceof Player) {
                object2 = new wUJy((Player)commandSender);
            }
            if (SeWl.op(ahqh.DGgy(), (SCOk)((Object)yy.p(-1947211227))) != false) {
                SeWl.op(commandSender, SeWl.op(SeWl.op(SeWl.op(SeWl.op(SeWl.op(new StringBuilder(), ahqh.getName()), KDGY$JAHk.Y("\u24b4")), (ydHl)((Object)yy.p(-1388378419))), ahqh.getStatus())));
                SeWl.op(commandSender, KDGY$JAHk.Y("\u24cd\ua8c6\ue32a\ub7ea\u0523\uebcc\ub3d6\ucb34\u3b26\u4ff8\ucfed\u5d0e\ueb7f\ue9a7\u527d\u216e\u7463\u4f17\uad53\uea94\uee5e\u5ae5\uff58\uca1a\u9127\udadd\u292f\u28c4\u7f0a\u3803\u9a76\u5526\u688e\uf306\u1cd1"));
            }
            SeWl.op((CUga)yy.h((CLqw)yy.p(1998252577), 490604273), ahqh.wUJy(), object2, arrnxIh);
            return;
        }
        SeWl.op(commandSender, SeWl.op(SeWl.op(SeWl.op(SeWl.op(SeWl.op(new StringBuilder(), (ydHl)((Object)yy.p(-329382161))), KDGY$JAHk.Y("\u24d5\ua8ca\ue32b\ub7f1\u056c\uebc3\ub38f\ucb60")), ahqh.getName()), KDGY$JAHk.Y("\u24b4\ua8cf\ue33e\ub7f1\u056f\uebc8\ub3d1\ucb60\u3b3b\u4ff8\ucfa3\u5d5e\ueb76\ue9b4\u527d\u212b\u7421\u4f01\uad43\uea8a\uee0e\u5af8\uff44\uca1a\u9136\uda98\u2922\u288a\u7f0e\u3819\u9a22\u557a"))));
        object2 = SeWl.op(pBUD);
        while (object2.hasNext()) {
            object = (String)object2.next();
            SeWl.op(commandSender, SeWl.op(SeWl.op(SeWl.op(SeWl.op(SeWl.op(new StringBuilder(), (ydHl)((Object)yy.p(-329382161))), ahqh.getName()), KDGY$JAHk.Y("\u24ae\ua889")), object)));
        }
    }

    private static Object op(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

