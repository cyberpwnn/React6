/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

@BtuM(value=0)
public class vAGm
extends miQG {
    public vAGm() {
        this.command = (String)o.k(-2011540596);
        this.aliases = new String[]{(String)o.k(-1013427317), (String)o.k(-675523686)};
        String[] arrstring = new String[1];
        arrstring[0] = vAGm.FP((aeiw)((Object)o.k(673269243)));
        this.Pdrw = arrstring;
        this.cJgR = (String)o.k(-1827122280);
        this.description = (String)o.k(-1871096937);
        this.vImB = (EJip)((Object)o.k(319771278));
        this.yJLS(mrFx$WjFM.d("\u4315\u5447\udde8\ubf28\u171b\u873f\ub1c3\u5627"), mrFx$WjFM.d("\u437d\u544e\uddee\ubf7c\u171c\u8731\ub1c0\u567c\u957e\u92b7\u0fdb\ue8cb\u64b8\u2834\uf411\ub879\uce71\ue066\ua90b\uc414\ua562\u702e\ucad4\ub576\u4f6a\u79f1\ue6d7\u569d\u9fd0"));
        this.yJLS(mrFx$WjFM.d("\u4372\u5449\uddfb\ubf28\u171b\u873f\ub1c3\u566a\u9503"), mrFx$WjFM.d("\u437a\u5456\uddee\ubf3f\u171b\u8731\ub1c1\u5639\u952d\u92bd\u0fd1\ue88e\u64af\u2828\uf41b\ub82b\uce63\ue025\ua957\uc410\ua578\u702c\uca80\ub56b\u4f75\u79bd\ue6c0\u56c1\u9f9e\u2ab9\ucbec\u50a4\u28d4\u9b55\u355b\u91cc\u8299\ub50d\ua732\u4d7a\u1fad\u092b\ub84a\uf714\u5522\u7372\uffe0\u045b\uc25f\u94aa\u1316\u6426\u2a4d\u999f\uff1d\uac02\ub118\u4176\ubb2e\u3002\u4684\u9a5c\uda53\uac48\u9e0e\u3b05\ub157\ua5c4\u5983\u7c32\u5fc9\u10a1\uc226\ub6e8\ud31d\u972b\u1021\u554e\u2d6f\u9ba2\uc1e5\ued11\u6795\u72f9\uf7d5\ucb40\ufecd\uee58\u3e2e\u6009\u55b0\u0a77\u33fa\u2b6e\uf3a6\uaa33\ue139\ua7b5\u5681\uc71d\uf315\u14c6\u2e9d\u4b97\uaaaf\u7228\ucb4d\u49c4\u7904"));
    }

    @Override
    public void yJLS(CommandSender commandSender, String[] arrstring) {
        Object object;
        if (arrstring.length == 0) {
            this.yJLS(commandSender, 0, 9);
            return;
        }
        if (arrstring.length == 1) {
            try {
                Object object2 = vAGm.FP(vAGm.FP(arrstring[0]));
                this.yJLS(commandSender, (int)(object2 - true), 9);
                vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder((String)vAGm.FP(object2)), mrFx$WjFM.d("\uc2b7\ud45d"))));
                return;
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        String string = arrstring[0];
        GjaJ[] arrgjaJ = new GjaJ[arrstring.length - 1];
        feCR feCR2 = new feCR();
        Object object3 = null;
        Object object4 = vAGm.FP(vAGm.FP((wwNq)o.a((TEqA)o.k(911295720), 1729188757)));
        block4 : while (object4.hasNext()) {
            object = (jNbl)object4.next();
            String[] arrstring2 = object.IFQY();
            int n = arrstring2.length;
            int n2 = 0;
            while (n2 < n) {
                String string2 = arrstring2[n2];
                if (vAGm.FP(string2, string) != false) {
                    object3 = object;
                    break block4;
                }
                ++n2;
            }
        }
        if (object3 == null) {
            vAGm.FP(commandSender, vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder((String)vAGm.FP(vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua292\u2a5b\ud4a4\u16b2\u001a\ue73e\u49e8\u9433\u3af5\u2bb7\uecc4\u62a8\ub598\ud304\u8fd2\u23b3\ud68b\u5e71")))), (psKX)((Object)o.k(568215020))), string)));
            return;
        }
        if (vAGm.FP(object3.Ipep(), (sQJh)((Object)o.k(-424325302))) != false) {
            vAGm.FP(commandSender, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(), (psKX)((Object)o.k(568215020))), vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua292\u2a5b\ud4a4\u16b2\u000e\ue733\u49f7\u9434\u3af5\u2bae"))), object3.getName()), vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua292\u2a5b\ud4a4\u16b2\u0001\ue73f\u49ae\u9430\u3afb\u2bae\uecdf\u62e4\ub595")))));
            return;
        }
        if (arrstring.length > 0) {
            int n = 0;
            while (n < arrstring.length - 1) {
                try {
                    object4 = vAGm.FP(vAGm.FP(arrstring[n + 1]));
                    arrgjaJ[n] = vAGm.FP(commandSender, object4);
                    vAGm.FP();
                    if (vAGm.FP(vAGm.FP(object3.CoVI()), arrgjaJ[n].getType()) == false) {
                        vAGm.FP(commandSender, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(), (psKX)((Object)o.k(568215020))), vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua292\u2a5b\ud4a4\u16b2\u000e\ue733\u49f7\u9434\u3af5\u2bae"))), object3.getName()), vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua292\u2a5b\ud4a4\u16b2\u0001\ue73f\u49ae\u942e\u3aff\u2bac\ueccf\u62e6\ub58d\ud308\u8fd4"))), arrgjaJ[n].getName())));
                        return;
                    }
                }
                catch (JYyP jYyP) {
                    vAGm.FP(feCR2, vAGm.FP(jYyP));
                    vAGm.FP(jYyP);
                }
                ++n;
            }
        }
        if (vAGm.FP(feCR2) != false) {
            object = new XRaB();
            if (commandSender instanceof Player) {
                object = new TOGS((Player)commandSender);
            }
            if (vAGm.FP(object3.qcvH(), (ooQj)((Object)o.k(1731151092))) != false) {
                vAGm.FP(commandSender, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder((String)vAGm.FP(object3.getName())), mrFx$WjFM.d("\uc2ad")), (psKX)((Object)o.k(-1118678018))), object3.getStatus())));
                vAGm.FP(commandSender, vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua292\u2a5b\ud4a4\u16b2\u001e\ue725\u49e6\u9428\u3aff\u2ba4\uec87\u62f1\ub596\ud34a\u8fd4\u23af\ud68a")));
            }
            vAGm.FP((wwNq)o.a((TEqA)o.k(911295720), 1729188757), object3.Mkpo(), object, arrgjaJ);
            return;
        }
        vAGm.FP(commandSender, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(), (psKX)((Object)o.k(568215020))), vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua292\u2a5b\ud4a4\u16b2\u000e\ue733\u49f7\u9434\u3af5\u2bae"))), object3.getName()), vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua292\u2a5b\ud4a4\u16b2\t\ue731\u49ea\u9431\u3aff\u2ba4\uec87\u62f1\ub596\ud34a\u8fd6\u23bb\ud696\u5e6c\u8c6f")))));
        object4 = vAGm.FP(feCR2);
        while (object4.hasNext()) {
            object = (String)object4.next();
            vAGm.FP(commandSender, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(), (psKX)((Object)o.k(568215020))), object3.getName()), mrFx$WjFM.d("\uc2b7\ud41b")), object)));
        }
    }

    public void yJLS(CommandSender commandSender, int n, int n2) {
        if (n < 0) {
            return;
        }
        if (n >= this.wKtV(n2)) {
            return;
        }
        commandSender.sendMessage(nJPf$sILv.G("\u137e\u3847"));
        this.UtIU(commandSender, n, n2);
        Object object = vAGm.FP(this.UtIU(n, n2));
        while (object.hasNext()) {
            WOYg wOYg = (WOYg)((Object)object.next());
            this.yJLS(commandSender, wOYg);
        }
        this.biLo(commandSender, n, n2);
    }

    public WjFM eYHy() {
        WjFM wjFM = new WjFM();
        SfIj sfIj = new SfIj();
        vAGm.FP(vAGm.FP(sfIj), new VfbL((psKX)((Object)o.k(-1118678018)), (String)vAGm.FP(FMkR$WjFM.a("\u1dcc\ufde9\uebdd\u9e93\u08bf\uc47d\u57c7\u898e\u8a8b\ub2c0\u7d45\u14a6\u1ac2\u2c4c\u7e78\uaecc\u3bd3\u6d43\ua1a7\ud136\ufb9c\uf6c9\u668c\u685f\ua4a2\u0fa2\u032c\u5b0f\u191e"))));
        vAGm.FP(vAGm.FP(sfIj), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(FMkR$WjFM.a("\u1dcc\ufde9\uebdd\u9e93\u08bf\uc47d\u57c7\u898e\u8a8b\ub2c0\u7d45\u14a6\u1ac2\u2c47\u7e6f\uae92\u3bc2\u6d54"))));
        vAGm.FP(wjFM, vAGm.FP(vAGm.FP(new StringBuilder((String)vAGm.FP(vAGm.FP(FMkR$WjFM.a("\u1dcc\ufde9\uebdd\u9e93\u08bf\uc47d\u57c7\u898e\u8a8b\ub2c0\u7d45\u14a6\u1ac2\u2c5a\u7e78\uaede\u3bd3\u6d45\ua1e3\ud125\ufb85\uf6c2")))), FMkR$WjFM.a("\u1d8f\ufde7\uebd3\u9e8a"))), sfIj, (psKX)((Object)o.k(-1118678018)));
        return wjFM;
    }

    public void yJLS(CommandSender commandSender, WOYg wOYg) {
        if (commandSender instanceof Player) {
            Object object;
            WjFM wjFM = this.eYHy();
            SfIj sfIj = new SfIj();
            vAGm.FP(vAGm.FP(sfIj), new VfbL((psKX)((Object)o.k(-1118678018)), (String)vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua29b\u2a5d\ud4bc\u16ecA\ue731\u49ef\u9434\u3afb\u2bb3\ueccf\u62f6"))));
            Object object2 = vAGm.FP((wwNq)o.a((TEqA)o.k(911295720), 1729188757), wOYg).IFQY();
            int n = object2.length;
            int n2 = 0;
            while (n2 < n) {
                object = object2[n2];
                vAGm.FP(vAGm.FP(sfIj), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder((String)vAGm.FP(vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua29b\u2a5d\ud4bc\u16ecA\ue73e\u49f1\u9438\u3afb\u2ba3\uecde")))), mrFx$WjFM.d("\uc2ec\ud458\u0260\u9eee")), object))));
                ++n2;
            }
            vAGm.FP(vAGm.FP(sfIj), new VfbL((psKX)((Object)o.k(-1118678018)), (String)vAGm.FP(mrFx$WjFM.d("\uc2ee\ud454\u0279\u9ea3\uc3c1\ufbf2\u7882\ube93\ua29b\u2a5d\ud4bc\u16ecA\ue73e\u49e7\u9438\u3ae9\u2ba3\uecd8\u62ec\ub589\ud313\u8fcf\u23b5\ud68a"))));
            object2 = (String[])vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(mrFx$WjFM.d("\uc2af")), vAGm.FP(wOYg)), mrFx$WjFM.d("\uc2af"))), 28), mrFx$WjFM.d("\uc287"));
            n = object2.length;
            n2 = 0;
            while (n2 < n) {
                object = object2[n2];
                vAGm.FP(vAGm.FP(sfIj), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(vAGm.FP(new StringBuilder(mrFx$WjFM.d("\uc287")), object))));
                ++n2;
            }
            vAGm.FP(wjFM, vAGm.FP(vAGm.FP(new StringBuilder(mrFx$WjFM.d("\uc2ad")), vAGm.FP((wwNq)o.a((TEqA)o.k(911295720), 1729188757), wOYg).IFQY()[0])), sfIj, (psKX)((Object)o.k(-23312902)));
            object = vAGm.FP((wwNq)o.a((TEqA)o.k(911295720), 1729188757), wOYg);
            Object object3 = vAGm.FP(vAGm.FP(object.CoVI()));
            while (object3.hasNext()) {
                Class class_ = (Class)object3.next();
                if (vAGm.FP(class_, Chunk.class) != false) {
                    object2 = new SfIj();
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1868409976)), mrFx$WjFM.d("\uc2dd\ud454\u0267\u9ea7\uc3d4\ufbf5\u7889\ubed3\ua292\u2a54\ud4f0\u16cf\n\ue73c\u49e6\u943e\u3aee\u2baf\uecd8\u628f")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(mrFx$WjFM.d("\uc2af")), vAGm.FP(mrFx$WjFM.d("\uc2de\ud44e\u0264\u9ebe\uc3cf\ufbee\u7892\ubece\ua2d3\u2a4b\ud4b5\u16f0\n\ue733\u49f7\u9434\u3af5\u2bae\uec8a\u62ea\ub59f\ud347\u8fc5\u23b2\ud691\u5e71\u8c61\ue76c\u5697\ue16b\u780b\u1e1b\u0667\ub8ff\u8222\u5425\u40e0\u5410\u1484\ue048\u4b2a\u9d51\u0e53\uda3a\ubf76\u90d7\ucd30\u52ad\u53a8\u3b8a\ufd06\u8bd5\u15ca\u8163\ud165\u8617\u78bb\udf89\u29b8\u798f"), 27)), mrFx$WjFM.d("\uc2af\ud431")))));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1868409976)), mrFx$WjFM.d("\uc2c9\ud45e\u0272\u9eaf\uc3d5\ufbf0\u7892\ubeb7")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), mrFx$WjFM.d("\uc2cd\ud458\u022e\u9ee4\uc3aa")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1868409976)), mrFx$WjFM.d("\uc2c8\ud443\u0275\u9ea3\uc3d0\ufbf0\u7883\ubece\ua2f9")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud458\u022e\u9eba\uc3c8\ufbf5\u7895\ubeb7")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua28a\u2a57\ud4a5\u16eeO\ue733\u49eb\u9428\u3af4\u2bab\ueca0")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud458\u022e\u9eba\uc3c8\ufbf5\u7895\ube96\ua2c1\u2a32")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(vAGm.FP(new StringBuilder((String)vAGm.FP(vAGm.FP(mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua28a\u2a57\ud4a5\u16eeO\ue733\u49eb\u9428\u3af4\u2bab\uec8a\u62ad\ub58b\ud306\u8fc2\u23b3\ud691\u5e6c\u8c2a\ue770\u56d1\ue13e\u784a\u1e52\u0668\ub8ea\u826d\u5410\u40ed\u5454\u14d0\ue05e\u4b65\u9d47\u0e15"), 27))), mrFx$WjFM.d("\uc287")))));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud458\u022e\u9ea2\uc3cf\ufbf3\u788d\ube96\ua2c1\u2a32")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(vAGm.FP(new StringBuilder((String)vAGm.FP(vAGm.FP(mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua290\u2a50\ud4a5\u16f2\u0004\ue770\u49ef\u9432\u3af5\u2bab\ueccf\u62e1\ub5d9\ud306\u8fd2\u23fa\ud6cc\u5e6d\u8c6b\ue77b\u56de\ue16b\u780b\u1e52\u0666\ub8fe\u8222\u5457\u40a3\u5451\u1482\ue048\u4b7f\u9d5c\u0e58\uda74\ubf7b\u90ca\ucd2a\u52e8"), 27))), mrFx$WjFM.d("\uc287")))));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud458\u022e\u9ee4\uc386\ufbbd\u7892\ubed5\ua29a\u2a4b\ud4fb\u16aee")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua292\u2a54\ud4bc\u16bc\f\ue738\u49f6\u9433\u3af1\u2bb3\uec8a\u62e0\ub581\ud304\u8fc3\u23aa\ud690\u5e3f\u8c6c\ue770\u56c5\ue13e\u7801\u1e1d\u067c\ub8ea\u8271\u5445\u40a8\u5402\u14d0\ue055\u4b6b\u9d56\u0e55\uda21\ubf71"), 27)));
                    vAGm.FP(wjFM, mrFx$WjFM.d("\uc2ad\ud47b\u0277"), object2, (psKX)((Object)o.k(-1868409976)));
                }
                if (vAGm.FP(class_, EntityType.class) != false) {
                    object2 = new SfIj();
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1118678018)), mrFx$WjFM.d("\uc2c8\ud455\u0260\u9ea7\uc3d4\ufbe5\u78c6\ubeee\ua296\u2a54\ud4b5\u16ff\u001b\ue73f\u49f1\u9457")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(mrFx$WjFM.d("\uc2af")), vAGm.FP(mrFx$WjFM.d("\uc2de\ud44e\u0264\u9ebe\uc3cf\ufbee\u7892\ubece\ua2d3\u2a4b\ud4b5\u16f0\n\ue733\u49f7\u9434\u3af5\u2bae\uec8a\u62ea\ub59f\ud347\u8fc3\u23b4\ud690\u5e76\u8c7e\ue766\u5697\ue16a\u7801\u1e02\u066c\ub8eb\u8222\u5410\u40f0\u5459\u149e\ue040\u4b2a\u9d72\u0e59\uda74\ubf76\u90ca\ucd7f\u52a2\u53e7\u3b90\ufd1a\u8bce\u15d6\u812f\ud124\u8600\u78a7\udf89\u29a4\u79c1\u8285\udcc8\u8098\u4ec6\ud9c9\ue7c1"), 27)), mrFx$WjFM.d("\uc2af\ud431")))));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1118678018)), mrFx$WjFM.d("\uc2c9\ud45e\u0272\u9eaf\uc3d5\ufbf0\u7892\ubeb7")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), mrFx$WjFM.d("\uc2cd\ud45e\u022e\u9ee4\uc386\ufbbd\u78ce\ubede\ua281\u2a4b\ud4a4\u16b5e")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1118678018)), mrFx$WjFM.d("\uc2c8\ud443\u0275\u9ea3\uc3d0\ufbf0\u7883\ubece\ua2f9")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud45e\u022e\u9e9e\uc3c9\ufbfb\u78ec")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua29c\u2a56\ud4bc\u16e5O\ue720\u49ea\u943a\u3ae9\u2bca")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud45e\u022e\u9e9e\uc3c9\ufbfb\u78c0\ubefe\ua29c\u2a4f\ud4da")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(vAGm.FP(new StringBuilder((String)vAGm.FP(vAGm.FP(mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua29c\u2a56\ud4bc\u16e5O\ue720\u49ea\u943a\u3ae9\u2be0\ueccb\u62eb\ub59d\ud347\u8fc5\u23b5\ud693\u5e6c"), 27))), mrFx$WjFM.d("\uc287")))));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud45e\u022e\u9ee4\uc386\ufbbd\u78a5\ubed2\ua284\u2a1e\ud4f1\u16cc\u0006\ue737\u4989")));
                    vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua292\u2a54\ud4bc\u16bc\n\ue73e\u49f7\u9434\u3aee\u2ba9\ueccf\u62f6\ub5d9\ud302\u8fde\u23b9\ud681\u5e6f\u8c7e\ue73f\u56d1\ue171\u780a\u1e52\u0679\ub8f1\u8265\u5416\u40a3\u5451\u149e\ue043\u4b2a\u9d51\u0e53\uda23\ubf71"), 27)));
                    vAGm.FP(wjFM, mrFx$WjFM.d("\uc2ad\ud47b\u0271"), object2, (psKX)((Object)o.k(-1118678018)));
                }
                if (vAGm.FP(class_, Long.class) == false) continue;
                object2 = new SfIj();
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(1742689159)), mrFx$WjFM.d("\uc2d9\ud452\u0279\u9eab\uc380\ufbcf\u7883\ubed1\ua296\u2a5b\ud4a4\u16f3\u001d\ue75a")));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(mrFx$WjFM.d("\uc2af")), vAGm.FP(mrFx$WjFM.d("\uc2de\ud44e\u0264\u9ebe\uc3cf\ufbee\u7892\ubece\ua2d3\u2a4b\ud4b5\u16f0\n\ue733\u49f7\u9434\u3af5\u2bae\uec8a\u62ea\ub59f\ud347\u8fc7\u23fa\ud690\u5e76\u8c67\ue77a\u5697\ue172\u781d\u1e1c\u066e\ub8ec\u826a\u5445\u40f6\u5443\u1499\ue049\u4b6d\u9d12\u0e7c\uda20\ubf22\u90d1\ucd30\u52e1\u53eb\u3b91\ufd00\u8bc8\u15cb\u812c\ud168\u8654\u78bb\udf88\u29be\u7992\u82c4\udcca\u808f\u4edb\ud9cf\ue7c0\u731e"), 27)), mrFx$WjFM.d("\uc2af\ud431")))));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(1742689159)), mrFx$WjFM.d("\uc2c9\ud45e\u0272\u9eaf\uc3d5\ufbf0\u7892\ubeb7")));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), mrFx$WjFM.d("\uc2cd\ud44f\u022e\u9ee6\uc3d5\ufbf8\u7880\ube94\ua280\u2a32")));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(1742689159)), mrFx$WjFM.d("\uc2c8\ud443\u0275\u9ea3\uc3d0\ufbf0\u7883\ubece\ua2f9")));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud44f\u022e\u9efb\uc3d3\ufb96")));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua2c6\u2a18\ud4a3\u16f9\f\ue73f\u49ed\u9439\u3ae9\u2bca")));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud44f\u022e\u9efc\uc390\ufbe8\u78ec")));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(vAGm.FP(new StringBuilder((String)vAGm.FP(vAGm.FP(mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua2c1\u2a08\ud4f0\u16e8\u0006\ue733\u49e8\u942e\u3aba\u2be8\uec9b\u62a5\ub58a\ud302\u8fc5\u23b5\ud68a\u5e7b\u8c23"), 27))), mrFx$WjFM.d("\uc287")))));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-1880078855)), mrFx$WjFM.d("\uc2cd\ud44f\u022e\u9efb\uc3c8\ufb96")));
                vAGm.FP(vAGm.FP(object2), new VfbL((psKX)((Object)o.k(-23312902)), (String)vAGm.FP(mrFx$WjFM.d("\uc2de\ud45e\u0278\u9eab\uc3c3\ufbe8\u7895\ube9d\ua2c6\u2a18\ud4b8\u16f3\u001a\ue722\u49f0"), 27)));
                vAGm.FP(wjFM, mrFx$WjFM.d("\uc2ad\ud47b\u0260"), object2, (psKX)((Object)o.k(1742689159)));
            }
            vAGm.FP(wjFM, (Player)commandSender);
        }
    }

    public void UtIU(CommandSender commandSender, int n, int n2) {
        if (commandSender instanceof Player) {
            BJdg bJdg = new BJdg();
            vAGm.FP(bJdg, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(), (psKX)((Object)o.k(-23312902))), nJPf$sILv.G("\u7ec2"))), 17), nJPf$sILv.G("\u7e86\ue66d\u5af4\u6444\u7db9\uee96\uef7d\u1b73\u52c3"), false, false, true, true, false);
            vAGm.FP(bJdg, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(nJPf$sILv.G("\u7ec2")), n + 1), vAGm.FP(nJPf$sILv.G("\u7e81\ue663\u5aeb\u6442\u7d87\uee9f\uef6b\u1b3c\u52d2\u3368\u0c5a\u30d7\u2529\uc14b\u3b53\u13de"))), this.wKtV(n2)), nJPf$sILv.G("\u7ec2"))), nJPf$sILv.G("\u7e83\ue67d\u5af3\u644e"));
            vAGm.FP(bJdg, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(), (psKX)((Object)o.k(-23312902))), nJPf$sILv.G("\u7ec2"))), 17), nJPf$sILv.G("\u7e86\ue66d\u5af4\u6444\u7db9\uee96\uef7d\u1b73\u52c3"), false, false, true, true, false);
            vAGm.FP(bJdg, vAGm.FP(vAGm.FP()), (Player)commandSender);
        }
    }

    public void biLo(CommandSender commandSender, int n, int n2) {
        if (commandSender instanceof Player) {
            BJdg bJdg = new BJdg();
            if (n > 0) {
                vAGm.FP(bJdg, vAGm.FP(mrFx$WjFM.d("\u33ba\u8314\u92f6\u14fe\u8c3f\u99c6\ua18f\ufff0\ua17c\u6f98\ua253\u7b45\uad4f\u7057\u7b14\u4775\u1d22\ub50c\u34ff\u766c\uc453\uff4c\u8e7f\u1a6f")), mrFx$WjFM.d("\u33b8\u830a\u92ee\u14f2"), vAGm.FP(vAGm.FP(new StringBuilder(mrFx$WjFM.d("\u33f6\u8309\u92fe\u14b3\u8c3f\u9988")), n)), vAGm.FP(mrFx$WjFM.d("\u33ba\u8314\u92f6\u14fe\u8c3f\u99c6\ua18f\ufff0\ua17c\u6f98\ua253\u7b45\uad4f\u7054\u7b1f\u477d\u1d36\ub50a\u34fc\u7634\uc450\uff13\u8e6a\u1a78\u7071\u6101")), mrFx$WjFM.d("\u33b8\u830a\u92ee\u14f2"), false, false, false, false, false);
            } else {
                vAGm.FP(bJdg, vAGm.FP(mrFx$WjFM.d("\u33ba\u8314\u92f6\u14fe\u8c3f\u99c6\ua18f\ufff0\ua17c\u6f98\ua253\u7b45\uad4f\u7057\u7b14\u4775\u1d22\ub50c\u34ff\u766c\uc453\uff57\u8e6a\u1a7c")), mrFx$WjFM.d("\u33bd\u831a\u92e9\u14f8\u8c01\u99cf\ua199\uffbf\ua16d"), vAGm.FP(mrFx$WjFM.d("\u33ba\u8314\u92f6\u14fe\u8c3f\u99c6\ua18f\ufff0\ua17c\u6f98\ua253\u7b45\uad4f\u7054\u7b1f\u477d\u1d36\ub50a\u34fc\u7634\uc450\uff13\u8e6a\u1a78\u7071\u6101")), mrFx$WjFM.d("\u33ab\u831e\u92ff"), false, false, false, false, false);
            }
            vAGm.FP(bJdg, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u33f9"))), 17), mrFx$WjFM.d("\u33bd\u831a\u92e9\u14f8\u8c01\u99cf\ua199\uffbf\ua16d"), false, false, true, true, false);
            vAGm.FP(bJdg, vAGm.FP(vAGm.FP(vAGm.FP(vAGm.FP(new StringBuilder(), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u33f9"))), 17), mrFx$WjFM.d("\u33bd\u831a\u92e9\u14f8\u8c01\u99cf\ua199\uffbf\ua16d"), false, false, true, true, false);
            if (n < this.wKtV(n2) - 1) {
                vAGm.FP(bJdg, vAGm.FP(mrFx$WjFM.d("\u33ba\u8314\u92f6\u14fe\u8c3f\u99c6\ua18f\ufff0\ua17c\u6f98\ua253\u7b45\uad4f\u7057\u7b14\u4775\u1d22\ub50c\u34ff\u766c\uc44d\uff5b\u8e62\u1a6d")), mrFx$WjFM.d("\u33b8\u830a\u92ee\u14f2"), vAGm.FP(vAGm.FP(new StringBuilder(mrFx$WjFM.d("\u33f6\u8309\u92fe\u14b3\u8c3f\u9988")), n + 2)), vAGm.FP(mrFx$WjFM.d("\u33ba\u8314\u92f6\u14fe\u8c3f\u99c6\ua18f\ufff0\ua17c\u6f98\ua253\u7b45\uad4f\u704a\u7b08\u4760\u1d34\ub54e\u34e3\u7620\uc444\uff5b")), mrFx$WjFM.d("\u33b8\u830a\u92ee\u14f2"), false, false, false, false, false);
            } else {
                vAGm.FP(bJdg, vAGm.FP(mrFx$WjFM.d("\u33ba\u8314\u92f6\u14fe\u8c3f\u99c6\ua18f\ufff0\ua17c\u6f98\ua253\u7b45\uad4f\u7057\u7b14\u4775\u1d22\ub50c\u34ff\u766c\uc453\uff57\u8e6a\u1a7c")), mrFx$WjFM.d("\u33bd\u831a\u92e9\u14f8\u8c01\u99cf\ua199\uffbf\ua16d"), vAGm.FP(mrFx$WjFM.d("\u33ba\u8314\u92f6\u14fe\u8c3f\u99c6\ua18f\ufff0\ua17c\u6f98\ua253\u7b45\uad4f\u704a\u7b08\u4760\u1d34\ub54e\u34e3\u7620\uc444\uff5b")), mrFx$WjFM.d("\u33ab\u831e\u92ff"), false, false, false, false, false);
            }
            vAGm.FP(bJdg, vAGm.FP(vAGm.FP()), (Player)commandSender);
        }
    }

    public feCR<WOYg> dDdF() {
        TNku tNku = new TNku();
        WOYg[] arrwOYg = (WOYg[])vAGm.FP();
        int n = arrwOYg.length;
        int n2 = 0;
        while (n2 < n) {
            WOYg wOYg = arrwOYg[n2];
            try {
                vAGm.FP(tNku, vAGm.FP((wwNq)o.a((TEqA)o.k(911295720), 1729188757), wOYg).IFQY()[0], wOYg);
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++n2;
        }
        return vAGm.FP(tNku);
    }

    public int wKtV(int n) {
        Object object = vAGm.FP(this.dDdF());
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

    public feCR<WOYg> UtIU(int n, int n2) {
        if (!this.yJLS(n, n2)) {
            return null;
        }
        int n3 = n * n2;
        Object object = n3 + n2 - 1;
        object = vAGm.FP(this.dDdF(), object);
        return vAGm.FP(this.dDdF(), n3, object);
    }

    private static Object FP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

