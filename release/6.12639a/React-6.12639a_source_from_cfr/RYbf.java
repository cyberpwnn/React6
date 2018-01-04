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
public class RYbf
extends miQG {
    public RYbf() {
        this.command = (String)o.k(1861308998);
        this.aliases = new String[]{(String)o.k(-1436396987), (String)o.k(-2127867324)};
        String[] arrstring = new String[1];
        arrstring[0] = RYbf.QV((aeiw)((Object)o.k(673269243)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(298078787);
        this.description = (String)o.k(813652018);
        this.vImB = (EJip)((Object)o.k(319771278));
        this.yJLS((String)RYbf.QV(FMkR$WjFM.a("\uee29\uace2\u8279\u528f\udf7c\u0918\u7390\uc62b\u8846\u9ce0\uecb3\u80f5\u2c85\ua6ab\u7f89\uf540\u7bfd")), (String)RYbf.QV(FMkR$WjFM.a("\uee29\uace2\u8279\u528f\udf7c\u0918\u7390\uc62b\u8846\u9ce0\uecb3\u80f5\u2c85\ua6bf\u7f8d\uf554\u7bfb\u9fc8\u9768\u0b1c\u3316\u146f\u8ebc\u9945\ube4c\u80a4\uae53\u898c")));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        this.yJLS(commandSender, arrstring.length == 0 ? 0 : (Object)(RYbf.QV(RYbf.QV(arrstring[0])) - true), 9);
    }

    public void yJLS(CommandSender commandSender, int n, int n2) {
        if (n < 0) {
            return;
        }
        if (n >= this.wKtV(n2)) {
            return;
        }
        commandSender.sendMessage(mrFx$WjFM.d("\u91ec\u7dac"));
        this.UtIU(commandSender, n, n2);
        Object object = RYbf.QV(this.UtIU(n, n2));
        while (object.hasNext()) {
            Surr surr = (Surr)object.next();
            this.yJLS(commandSender, surr);
        }
        this.biLo(commandSender, n, n2);
    }

    public WjFM eYHy() {
        WjFM wjFM = new WjFM();
        SfIj sfIj = new SfIj();
        RYbf.QV(RYbf.QV(sfIj), new VfbL((psKX)((Object)o.k(-1118678018)), (String)RYbf.QV(FMkR$WjFM.a("\ude4c\u6808\u7b7c\u810e\u871c\ucfa7\ua800\u1bdc\ue6af\u224f\ua5fb\u8073\u015e\u403c\uc769\u36da\uc62b\u1c23\ue8a1\ubb61\uda6d\u87a1\u59cc\ufd56\u287c\u59db\u90ac\u3d99\u9118"))));
        RYbf.QV(RYbf.QV(sfIj), new VfbL((psKX)((Object)o.k(-23312902)), (String)RYbf.QV(FMkR$WjFM.a("\ude4c\u6808\u7b7c\u810e\u871c\ucfa7\ua800\u1bdc\ue6af\u224f\ua5fb\u8073\u015e\u4037\uc77e\u3684\uc63a\u1c34"))));
        RYbf.QV(wjFM, RYbf.QV(FMkR$WjFM.a("\ude4c\u6808\u7b7c\u810e\u871c\ucfa7\ua800\u1bdc\ue6af\u224f\ua5fb\u8073\u015e\u402a\uc769\u36c8\uc62b\u1c25\ue8e5\ubb72\uda74\u87aa")), sfIj, (psKX)((Object)o.k(-1118678018)));
        return wjFM;
    }

    public void yJLS(CommandSender commandSender, Surr surr) {
        if (commandSender instanceof Player) {
            String string;
            WjFM wjFM = this.eYHy();
            SfIj sfIj = new SfIj();
            RYbf.QV(RYbf.QV(sfIj), new VfbL((psKX)((Object)o.k(-1118678018)), (String)RYbf.QV(FMkR$WjFM.a("\u24b2\u9e96\u7f51\u5442\u8506\uf4e6\u3d50\u2b1f\uc7ff\u5766\u9eb0\ua722\u5547\ud443\ue456\u6cab\u1e60\u4c05\u3886\u59d8"))));
            String[] arrstring = surr.XRaB();
            int n = arrstring.length;
            int n2 = 0;
            while (n2 < n) {
                string = arrstring[n2];
                RYbf.QV(RYbf.QV(sfIj), new VfbL((psKX)((Object)o.k(-23312902)), (String)RYbf.QV(RYbf.QV(new StringBuilder((String)RYbf.QV(RYbf.QV(FMkR$WjFM.a("\u24b2\u9e96\u7f51\u5442\u8506\uf4e6\u3d50\u2b1f\uc7ff\u5766\u9eb0\ua722\u5547\ud44c\ue448\u6ca7\u1e60\u4c15\u3897")))), string))));
                ++n2;
            }
            RYbf.QV(RYbf.QV(sfIj), new VfbL((psKX)((Object)o.k(-1118678018)), (String)RYbf.QV(FMkR$WjFM.a("\u24b2\u9e96\u7f51\u5442\u8506\uf4e6\u3d50\u2b1f\uc7ff\u5766\u9eb0\ua722\u5547\ud44c\ue45e\u6ca7\u1e72\u4c15\u3891\u59c2\u895d\uf1d0\u2aae\uafc2\ucaa6"))));
            arrstring = (String[])RYbf.QV(RYbf.QV(RYbf.QV(RYbf.QV(RYbf.QV(new StringBuilder(FMkR$WjFM.a("\u24f3")), surr.getDescription()), FMkR$WjFM.a("\u24f3"))), 28), FMkR$WjFM.a("\u24db"));
            n = arrstring.length;
            n2 = 0;
            while (n2 < n) {
                string = arrstring[n2];
                RYbf.QV(RYbf.QV(sfIj), new VfbL((psKX)((Object)o.k(-23312902)), (String)RYbf.QV(RYbf.QV(new StringBuilder(FMkR$WjFM.a("\u24db")), string))));
                ++n2;
            }
            RYbf.QV(wjFM, RYbf.QV(RYbf.QV(new StringBuilder(FMkR$WjFM.a("\u24f1")), surr.getCommand())), sfIj, (psKX)((Object)o.k(-23312902)));
            if (RYbf.QV(RYbf.QV(surr.getUsage())) > 0) {
                arrstring = (String[])RYbf.QV(RYbf.QV(surr.getUsage()), FMkR$WjFM.a("\u24f1"));
                n = arrstring.length;
                n2 = 0;
                while (n2 < n) {
                    string = arrstring[n2];
                    SfIj sfIj2 = new SfIj();
                    psKX psKX2 = (psKX)((Object)o.k(-1118678018));
                    VfbL vfbL = new VfbL((psKX)((Object)o.k(-1118678018)), (String)RYbf.QV(FMkR$WjFM.a("\u24b2\u9e96\u7f51\u5442\u8506\uf4e6\u3d50\u2b1f\uc7ff\u5766\u9eb0\ua722\u5547\ud440\ue45b\u6cb1\u1e68\u4c15\u38ce\u59db\u894c\uf1d6")));
                    Object object = RYbf.QV(FMkR$WjFM.a("\u24b2\u9e96\u7f51\u5442\u8506\uf4e6\u3d50\u2b1f\uc7ff\u5766\u9eb0\ua722\u5547\ud44c\ue455\u6cac\u1e65\u4c13\u3890\u59c8\u895f\uf1cd\u2ab7\uafd9"));
                    if (surr.KTiK((String)RYbf.QV(RYbf.QV(string))) != null) {
                        object = surr.KTiK((String)RYbf.QV(RYbf.QV(string)));
                    }
                    if (RYbf.QV(string, FMkR$WjFM.a("\u24ed")) != false) {
                        psKX2 = (psKX)((Object)o.k(568215020));
                        vfbL = new VfbL(psKX2, (String)RYbf.QV(FMkR$WjFM.a("\u24b2\u9e96\u7f51\u5442\u8506\uf4e6\u3d50\u2b1f\uc7ff\u5766\u9eb0\ua722\u5547\ud450\ue45f\u6cb3\u1e74\u4c1f\u3891\u59ce\u8949\uf189\u2ab7\uafcc\ucaba")));
                    }
                    if (RYbf.QV(string, FMkR$WjFM.a("\u248a")) != false) {
                        psKX2 = (psKX)((Object)o.k(1742689159));
                        vfbL = new VfbL(psKX2, (String)RYbf.QV(FMkR$WjFM.a("\u24b2\u9e96\u7f51\u5442\u8506\uf4e6\u3d50\u2b1f\uc7ff\u5766\u9eb0\ua722\u5547\ud44d\ue44a\u6cb6\u1e68\u4c19\u388d\u59ca\u8941\uf189\u2ab7\uafcc\ucaba")));
                    }
                    if (RYbf.QV(string, FMkR$WjFM.a("\u24f9")) != false) {
                        psKX2 = (psKX)((Object)o.k(-1868409976));
                        vfbL = new VfbL(psKX2, (String)RYbf.QV(FMkR$WjFM.a("\u24b2\u9e96\u7f51\u5442\u8506\uf4e6\u3d50\u2b1f\uc7ff\u5766\u9eb0\ua722\u5547\ud44f\ue455\u6ca6\u1e64\u4c5b\u3893\u59ca\u895f")));
                    }
                    RYbf.QV(RYbf.QV(sfIj2), vfbL);
                    RYbf.QV(RYbf.QV(sfIj2), new VfbL((psKX)((Object)o.k(-23312902)), (String)RYbf.QV(RYbf.QV(new StringBuilder(FMkR$WjFM.a("\u24db")), RYbf.QV(RYbf.QV(RYbf.QV(RYbf.QV(new StringBuilder(FMkR$WjFM.a("\u24f3")), object), FMkR$WjFM.a("\u24f3"))), 28)))));
                    RYbf.QV(wjFM, RYbf.QV(RYbf.QV(new StringBuilder(FMkR$WjFM.a("\u24f1")), string)), sfIj2, psKX2);
                    ++n2;
                }
            }
            RYbf.QV(wjFM, (Player)commandSender);
        }
    }

    public void UtIU(CommandSender commandSender, int n, int n2) {
        if (commandSender instanceof Player) {
            BJdg bJdg = new BJdg();
            RYbf.QV(bJdg, RYbf.QV(RYbf.QV(RYbf.QV(RYbf.QV(new StringBuilder(), (psKX)((Object)o.k(-23312902))), FMkR$WjFM.a("\u5859"))), 17), FMkR$WjFM.a("\u581d\u64be\u3f1e\ub8b6\u225a\u6fea\u5a57\u293e\u582e"), false, false, true, true, false);
            RYbf.QV(bJdg, RYbf.QV(RYbf.QV(RYbf.QV(RYbf.QV(RYbf.QV(new StringBuilder(FMkR$WjFM.a("\u5859")), n + 1), RYbf.QV(FMkR$WjFM.a("\u581a\u64b0\u3f01\ub8b0\u2264\u6fe3\u5a41\u2971\u583f\u87b0\uc348\u7061\uabad\u6c84\uf6b4\u77d7"))), this.wKtV(n2)), FMkR$WjFM.a("\u5859"))), FMkR$WjFM.a("\u5818\u64ae\u3f19\ub8bc"));
            RYbf.QV(bJdg, RYbf.QV(RYbf.QV(RYbf.QV(RYbf.QV(new StringBuilder(), (psKX)((Object)o.k(-23312902))), FMkR$WjFM.a("\u5859"))), 17), FMkR$WjFM.a("\u581d\u64be\u3f1e\ub8b6\u225a\u6fea\u5a57\u293e\u582e"), false, false, true, true, false);
            RYbf.QV(bJdg, RYbf.QV(RYbf.QV()), (Player)commandSender);
        }
    }

    public void biLo(CommandSender commandSender, int n, int n2) {
        if (commandSender instanceof Player) {
            BJdg bJdg = new BJdg();
            if (n > 0) {
                RYbf.QV(bJdg, RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u550e\u7dec\u921f\u9e66\u4645\u1c99\u4d49\ua960\ue976\ude40\u64f5")), FMkR$WjFM.a("\u3ca0\u935b\u1ecf\u7206"), RYbf.QV(RYbf.QV(new StringBuilder((String)RYbf.QV(RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u550f\u7df0\u921a\u9e61\u4646\u1c85\u4d0e\ua965\ue969\ude55\u64e6\u97be")))), n)), RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u550d\u7de7\u9217\u9e72\u4643\u1c9a\u4d11\ua963\ue929\ude55\u64e2\u97ab\ub13d")), FMkR$WjFM.a("\u3ca0\u935b\u1ecf\u7206"), false, false, false, false, false);
            } else {
                RYbf.QV(bJdg, RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u550e\u7dec\u921f\u9e66\u4645\u1c99\u4d49\ua960\ue96d\ude55\u64e6")), FMkR$WjFM.a("\u3ca5\u934b\u1ec8\u720c\u90ec\u5248\ua014\u5748\u22b9"), RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u550d\u7de7\u9217\u9e72\u4643\u1c9a\u4d11\ua963\ue929\ude55\u64e2\u97ab\ub13d")), FMkR$WjFM.a("\u3cb3\u934f\u1ede"), false, false, false, false, false);
            }
            RYbf.QV(bJdg, RYbf.QV(RYbf.QV(RYbf.QV(RYbf.QV(new StringBuilder(), (psKX)((Object)o.k(-23312902))), FMkR$WjFM.a("\u3ce1"))), 17), FMkR$WjFM.a("\u3ca5\u934b\u1ec8\u720c\u90ec\u5248\ua014\u5748\u22b9"), false, false, true, true, false);
            RYbf.QV(bJdg, RYbf.QV(RYbf.QV(RYbf.QV(RYbf.QV(new StringBuilder(), (psKX)((Object)o.k(-23312902))), FMkR$WjFM.a("\u3ce1"))), 17), FMkR$WjFM.a("\u3ca5\u934b\u1ec8\u720c\u90ec\u5248\ua014\u5748\u22b9"), false, false, true, true, false);
            if (n < this.wKtV(n2) - 1) {
                RYbf.QV(bJdg, RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u550e\u7dec\u921f\u9e66\u4645\u1c99\u4d49\ua97e\ue961\ude5d\u64f7")), FMkR$WjFM.a("\u3ca0\u935b\u1ecf\u7206"), RYbf.QV(RYbf.QV(new StringBuilder((String)RYbf.QV(RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u550f\u7df0\u921a\u9e61\u4646\u1c85\u4d0e\ua965\ue969\ude55\u64e6\u97be")))), n + 2)), RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u5513\u7df0\u920a\u9e70\u4607\u1c85\u4d05\ua977\ue961")), FMkR$WjFM.a("\u3ca0\u935b\u1ecf\u7206"), false, false, false, false, false);
            } else {
                RYbf.QV(bJdg, RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u550e\u7dec\u921f\u9e66\u4645\u1c99\u4d49\ua960\ue96d\ude55\u64e6")), FMkR$WjFM.a("\u3ca5\u934b\u1ec8\u720c\u90ec\u5248\ua014\u5748\u22b9"), RYbf.QV(FMkR$WjFM.a("\u3ca2\u9345\u1ed7\u720a\u90d2\u5241\ua002\u5707\u22a8\u557b\ud132\ue1c9\ue0fc\u5513\u7df0\u920a\u9e70\u4607\u1c85\u4d05\ua977\ue961")), FMkR$WjFM.a("\u3cb3\u934f\u1ede"), false, false, false, false, false);
            }
            RYbf.QV(bJdg, RYbf.QV(RYbf.QV()), (Player)commandSender);
        }
    }

    public feCR<Surr> dDdF() {
        TNku tNku = new TNku();
        Object object = RYbf.QV(RYbf.QV((WytI)o.a((TEqA)o.k(911295720), -909682639)));
        while (object.hasNext()) {
            Surr surr = (Surr)object.next();
            RYbf.QV(tNku, surr.getCommand(), surr);
        }
        return RYbf.QV(tNku);
    }

    public int wKtV(int n) {
        Object object = RYbf.QV(this.dDdF());
        if ((Object)object % (double)n > 0.0) {
            return true + (Object)((Object)object / (double)n);
        }
        return (int)((Object)((Object)object / (double)n));
    }

    public boolean yJLS(int n, int n2) {
        if (n >= this.wKtV(n2) && n < 0) {
            return false;
        }
        return true;
    }

    public feCR<Surr> UtIU(int n, int n2) {
        if (!this.yJLS(n, n2)) {
            return null;
        }
        int n3 = n * n2;
        Object object = n3 + n2 - 1;
        object = RYbf.QV(this.dDdF(), object);
        return RYbf.QV(this.dDdF(), n3, object);
    }

    private static Object QV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

