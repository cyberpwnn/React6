/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerCommandPreprocessEvent
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class WytI
extends ggmf
implements CommandExecutor,
Listener {
    private feCR<Surr> SngR;
    private boolean uGTw;

    @Override
    public void start() {
        o.v(this, 978277225, false);
    }

    @Override
    public void stop() {
        WytI.ao(this);
    }

    public void begin() {
        o.v(this, 978277225, true);
        WytI.ao(WytI.ao((String)o.k(917853032)), this);
        WytI.ao(WytI.ao((String)o.k(-39759003)), this);
        WytI.ao(this);
        o.v(this, 760042340, new feCR());
        Object object = WytI.ao((feCR)WytI.ao((TNku)o.k(278287122), WytI.ao(false)));
        while (object.hasNext()) {
            Object object2;
            Class class_ = (Class)object.next();
            try {
                object2 = WytI.ao(WytI.ao(class_, new Class[0]), new Object[0]);
                WytI.ao((feCR)o.a(this, 760042340), (Surr)object2);
                WytI.ao(WytI.ao(WytI.ao(new StringBuilder(FMkR$WjFM.a("\uc482\udb1d\ufb81\ue397\ua437\ueaa6\u2cb3\ud355\u0d32")), WytI.ao(WytI.ao(object2)))));
            }
            catch (InstantiationException instantiationException) {
                object2 = instantiationException;
                WytI.ao(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                object2 = illegalAccessException;
                WytI.ao(illegalAccessException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object2 = illegalArgumentException;
                WytI.ao(illegalArgumentException);
            }
            catch (InvocationTargetException invocationTargetException) {
                object2 = invocationTargetException;
                WytI.ao(invocationTargetException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                object2 = noSuchMethodException;
                WytI.ao(noSuchMethodException);
            }
            catch (SecurityException securityException) {
                object2 = securityException;
                WytI.ao(securityException);
            }
        }
    }

    @Override
    public void tick() {
        if (!((Boolean)o.a(this, 978277225)).booleanValue()) {
            this.begin();
        }
    }

    public void HeSD(CommandSender commandSender, String string) {
        WytI.ao(commandSender, string);
    }

    public void Ipep(CommandSender commandSender, String string) {
        this.HeSD(commandSender, (String)WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(568215020))), string)));
    }

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] arrstring) {
        if (WytI.ao(WytI.ao(command), (String)o.k(-39759003)) != false) {
            if (WytI.ao((aeiw)((Object)o.k(673269243)), commandSender) == false) {
                this.Ipep(commandSender, (String)o.k(-1332653231));
                return true;
            }
            if (WytI.ao((aeiw)((Object)o.k(-928627592)), commandSender) == false) {
                this.Ipep(commandSender, (String)o.k(-1332653231));
                return true;
            }
            if (arrstring.length == 0) {
                commandSender.sendMessage((String)WytI.ao(WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(-1118678018))), mrFx$WjFM.d("\u9902\u07ef\uc13a"))), (psKX)((Object)o.k(-857517477))));
                commandSender.sendMessage((String)WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(-857517477))), mrFx$WjFM.d("\u997f\u07dc\uc112\u11e1\u738b")), (psKX)((Object)o.k(-1880078855))), mrFx$WjFM.d("\u9924\u07c1\uc114\u11ef\u73c7\uf4f2")), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u9970\u0783\uc153\u11dc\u73c4\uf4f0\ud0fa\ude27\u8bb3\ue540\u0095\ub6a6\u288c\ud972\u7db5\ubf4c\ue845\ub1d2\ub65f\u7be1\u22b0\ub6de\u4037"))));
                commandSender.sendMessage((String)WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(-857517477))), mrFx$WjFM.d("\u997f\u07dc\uc112\u11e1\u738b")), (psKX)((Object)o.k(-1880078855))), mrFx$WjFM.d("\u9923\u07da\uc112\u11fc\u73de\uf4e4")), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u9970\u0783\uc153\u11cf\u73ce\uf4e3\ud0bd\ude19\u8b97\ue529\u00e0\ub694\u28e5\ud901\u7dae\ubf43\ue811\ub1c8\ub65e"))));
                commandSender.sendMessage((String)WytI.ao((psKX)((Object)o.k(-857517477))));
            } else if (WytI.ao(arrstring[0], mrFx$WjFM.d("\u9924\u07c1\uc114\u11ef\u73c7\uf4f2")) != false) {
                if (WytI.ao((aeiw)((Object)o.k(392447098)), commandSender) == false) {
                    this.Ipep(commandSender, (String)o.k(-1332653231));
                    return true;
                }
                o.v((HLIY)o.a((TEqA)o.k(911295720), -1789897906), -61910195, (Boolean)o.a((HLIY)o.a((TEqA)o.k(911295720), -1789897906), -61910195) == false);
                WytI.ao(commandSender, ((Boolean)o.a((HLIY)o.a((TEqA)o.k(911295720), -1789897906), -61910195)).booleanValue() ? WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8ba4\ue501\u00ae\ub6ca\u28aa\ud93c\u7db6\ubf4b\ue80b\ub1d8")) : WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8ba4\ue501\u00ae\ub6ca\u28aa\ud934\u7dbc\ubf4e\ue80c\ub1d3\ub648")));
            } else if (WytI.ao(arrstring[0], mrFx$WjFM.d("\u9923\u07da\uc112\u11fc\u73de\uf4e4")) != false) {
                Object object;
                kAOQ kAOQ2;
                kAOQ kAOQ3;
                if (WytI.ao((aeiw)((Object)o.k(-1481227156)), commandSender) == false) {
                    this.Ipep(commandSender, (String)o.k(-1332653231));
                    return true;
                }
                int n = 0;
                int n2 = 0;
                Object object2 = WytI.ao(WytI.ao((uqOm)o.k(-609594549)));
                while (object2.hasNext()) {
                    kAOQ2 = (kAOQ)object2.next();
                    object = WytI.ao(kAOQ2.SvcY());
                    while (object.hasNext()) {
                        kAOQ3 = (kAOQ)object.next();
                        ++n;
                        if (!kAOQ3.klJY()) continue;
                        ++n2;
                    }
                    ++n;
                    if (!kAOQ2.klJY()) continue;
                    ++n2;
                }
                commandSender.sendMessage((String)WytI.ao(WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(-1118678018))), WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8ba4\ue501\u00ae\ub6ca\u28b6\ud926\u7dbb\ubf56\ue810\ub1ce")))), (psKX)((Object)o.k(-857517477))));
                commandSender.sendMessage((String)WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(new StringBuilder((String)WytI.ao(WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8bb1\ue50f\u00a6\ub68b\u28eb\ud935\u7db5\ubf43\ue809\ub1ce")))), (psKX)((Object)o.k(-1880078855))), n - n2), mrFx$WjFM.d("\u9970\u0781\uc153")), n), (psKX)((Object)o.k(-23312902))), WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8bb1\ue50f\u00a6\ub68b\u28eb\ud933\u7db9\ubf4a\ue80c\ub1d8\ub65b\u7ba4\u22bb\ub695\u4022\u7626")))));
                commandSender.sendMessage((String)WytI.ao(WytI.ao(WytI.ao(new StringBuilder((String)WytI.ao(WytI.ao(WytI.ao(WytI.ao((uqOm)o.k(-609594549)))))), WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8bb1\ue50f\u00a6\ub68b\u28eb\ud93b\u7db4\ubf56\ue800\ub1cf\ub65b\u7ba4\u22b1\ub6cc\u4038\u7639\u4f7a\uad16\u0e33\u6e5f\u03aa\ude95\u639a\uf246\uadc1\ua257"))), WytI.ao(WytI.ao() - (Long)o.a((uqOm)o.k(-609594549), -1990962344), false))));
                object2 = WytI.ao(WytI.ao((uqOm)o.k(-609594549)));
                while (object2.hasNext()) {
                    kAOQ2 = (kAOQ)object2.next();
                    commandSender.sendMessage((String)WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), kAOQ2.getTag()), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u9970\u0783\uc14d\u11a8")), kAOQ2.klJY() ? WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(568215020))), WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8bb1\ue50f\u00a6\ub68b\u28eb\ud934\u7dbb\ubf4b\ue809\ub1d4\ub643\u7ba6")))) : WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(-1868409976))), WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8bb1\ue50f\u00a6\ub68b\u28eb\ud933\u7db9\ubf4a\ue80c\ub1d8\ub65b\u7ba4\u22bb")))))));
                    object = WytI.ao(kAOQ2.SvcY());
                    while (object.hasNext()) {
                        kAOQ3 = (kAOQ)object.next();
                        commandSender.sendMessage((String)WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(new StringBuilder(mrFx$WjFM.d("\u9970\u078e")), (psKX)((Object)o.k(-1880078855))), kAOQ3.getTag()), (psKX)((Object)o.k(-23312902))), mrFx$WjFM.d("\u9970\u0783\uc14d\u11a8")), kAOQ3.klJY() ? WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(568215020))), WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8bb1\ue50f\u00a6\ub68b\u28eb\ud934\u7dbb\ubf4b\ue809\ub1d4\ub643\u7ba6")))) : WytI.ao(WytI.ao(WytI.ao(new StringBuilder(), (psKX)((Object)o.k(-1868409976))), WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8bb1\ue50f\u00a6\ub68b\u28eb\ud933\u7db9\ubf4a\ue80c\ub1d8\ub65b\u7ba4\u22bb")))))));
                    }
                }
                commandSender.sendMessage((String)WytI.ao((psKX)((Object)o.k(-857517477))));
            }
        } else if (WytI.ao(WytI.ao(command), (String)o.k(917853032)) != false) {
            Object object;
            boolean bl = commandSender instanceof Player;
            Player player = bl ? (Player)commandSender : null;
            if (WytI.ao((aeiw)((Object)o.k(673269243)), commandSender) == false) {
                this.Ipep(commandSender, (String)o.k(-1332653231));
                return true;
            }
            if (arrstring.length == 0) {
                this.onCommand((CommandSender)(bl ? player : commandSender), command, string, new String[]{mrFx$WjFM.d("\u996f")});
                return true;
            }
            Object object3 = null;
            Object object4 = WytI.ao((feCR)o.a(this, 760042340));
            while (object4.hasNext()) {
                object = (Surr)object4.next();
                if (WytI.ao(object.getCommand(), arrstring[0]) == false) continue;
                object3 = object;
                break;
            }
            if (object3 == null) {
                object4 = WytI.ao((feCR)o.a(this, 760042340));
                block5 : while (object4.hasNext()) {
                    object = (Surr)object4.next();
                    String[] arrstring2 = object.XRaB();
                    int n = arrstring2.length;
                    int n3 = 0;
                    while (n3 < n) {
                        String string2 = arrstring2[n3];
                        if (WytI.ao(string2, arrstring[0]) != false) {
                            object3 = object;
                            break block5;
                        }
                        ++n3;
                    }
                }
            }
            if (object3 != null) {
                object = WytI.ao(commandSender);
                object4 = object3.erXb();
                if (WytI.ao(object4, object) == false) {
                    this.Ipep(commandSender, (String)WytI.ao(WytI.ao(new StringBuilder((String)WytI.ao(WytI.ao(mrFx$WjFM.d("\u993d\u07cb\uc100\u11fb\u73ca\uf4f0\ud0f8\ude65\u8bb0\ue501\u00ae\ub68b\u28b0\ud920\u7dbf\ubf0c\ue801\ub1d2\ub648\u7bb2\u22f2\ub6d6\u403e\u7622\u4f39\uad16\u0e6b\u6e46\u03b4\uded7\u6398\uf253\uad9f\ua250\ue24f\uf88a\u9508")))), WytI.ao(object))));
                    return true;
                }
            }
            if (object3 != null) {
                if (arrstring.length == 1) {
                    object3.yJLS((CommandSender)(bl ? player : commandSender), new String[0]);
                } else {
                    object = new String[arrstring.length - 1];
                    int n = 1;
                    while (n < arrstring.length) {
                        object[n - 1] = arrstring[n];
                        ++n;
                    }
                    object3.yJLS((CommandSender)(bl ? player : commandSender), (String[])object);
                }
                return true;
            }
            this.onCommand((CommandSender)(bl ? player : commandSender), command, string, new String[]{mrFx$WjFM.d("\u996f")});
            return true;
        }
        return false;
    }

    @EventHandler
    public void yJLS(PlayerCommandPreprocessEvent playerCommandPreprocessEvent) {
        block11 : {
            block10 : {
                block9 : {
                    block8 : {
                        if (WytI.ao(WytI.ao(WytI.ao(playerCommandPreprocessEvent)), nJPf$sILv.G("\u1e55\u9c1d\uadd0\u083b")) != false) break block8;
                        if (WytI.ao(WytI.ao(WytI.ao(playerCommandPreprocessEvent)), nJPf$sILv.G("\u1e55\u9c05\uadc1\u082f")) == false) break block9;
                    }
                    if (WytI.ao((aeiw)((Object)o.k(673269243)), WytI.ao(playerCommandPreprocessEvent)) != false && ((Boolean)o.k(-886482705)).booleanValue()) {
                        WytI.ao(WytI.ao(playerCommandPreprocessEvent), WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(new StringBuilder(nJPf$sILv.G("\u1e39\u9c1c\uadd2\u083a\ue280\u63f8\ufd97\ubd3d\u489d\u407f\u0a12\ud7f5\u1b05")), (psKX)((Object)o.k(-1868409976))), WytI.ao((biRJ)((Object)o.k(-1955441954))).get()), (psKX)((Object)o.k(-23312902))), nJPf$sILv.G("\u1e5a\u9c41")), (psKX)((Object)o.k(-1868409976))), WytI.ao(WytI.ao((biRJ)((Object)o.k(711152348))).getValue(), true)), (psKX)((Object)o.k(-23312902))), nJPf$sILv.G("\u1e53"))));
                        WytI.ao(playerCommandPreprocessEvent, true);
                    }
                }
                if (WytI.ao(WytI.ao(WytI.ao(playerCommandPreprocessEvent)), nJPf$sILv.G("\u1e55\u9c04\uadc5\u0825")) != false) break block10;
                if (WytI.ao(WytI.ao(WytI.ao(playerCommandPreprocessEvent)), nJPf$sILv.G("\u1e55\u9c04\uadc5\u0825\ue28a\u63e4\ufd9a")) != false) break block10;
                if (WytI.ao(WytI.ao(WytI.ao(playerCommandPreprocessEvent)), nJPf$sILv.G("\u1e55\u9c0e\uadc3")) == false) break block11;
            }
            if (WytI.ao((aeiw)((Object)o.k(673269243)), WytI.ao(playerCommandPreprocessEvent)) != false && ((Boolean)o.k(684677364)).booleanValue()) {
                WytI.ao(WytI.ao(playerCommandPreprocessEvent), WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(WytI.ao(new StringBuilder(nJPf$sILv.G("\u1e39\u9c1c\uadd2\u083a\ue280\u63f8\ufd97\ubd3d\u4884\u404a\u0a2c\ud7a0\u1b57\ue44f\u7b70\ud502\udebb\ucd20\uebbd\u40f6\ub1c1\u6df3")), (psKX)((Object)o.k(1742689159))), WytI.ao((biRJ)((Object)o.k(737891048))).get()), (psKX)((Object)o.k(-23312902))), nJPf$sILv.G("\u1e5a\u9c41")), (psKX)((Object)o.k(1742689159))), WytI.ao(WytI.ao((biRJ)((Object)o.k(737891048))).getValue() / WytI.ao((biRJ)((Object)o.k(-1905241372))).getValue(), false)), nJPf$sILv.G("\u1e17\u9c1a")), (psKX)((Object)o.k(-23312902))), nJPf$sILv.G("\u1e53"))));
                WytI.ao(playerCommandPreprocessEvent, true);
            }
        }
    }

    public feCR<Surr> TpmQ() {
        return (feCR)o.a(this, 760042340);
    }

    public void TEqA(feCR<Surr> feCR2) {
        o.v(this, 760042340, feCR2);
    }

    public boolean VDPB() {
        return (Boolean)o.a(this, 978277225);
    }

    public void Ipep(boolean bl) {
        o.v(this, 978277225, bl);
    }

    private static Object ao(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

