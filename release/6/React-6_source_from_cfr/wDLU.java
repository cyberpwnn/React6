/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Listener
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
import org.bukkit.event.Listener;

public class wDLU
extends jqQR
implements CommandExecutor,
Listener {
    private wfPa<HBqU> AXbM;
    private boolean HTdw;

    @Override
    public void start() {
        cv.e(this, -1552477723, false);
    }

    @Override
    public void stop() {
        wDLU.Kz(this);
    }

    public void begin() {
        cv.e(this, -1552477723, true);
        wDLU.Kz(wDLU.Kz((String)cv.e(-1971777049)), this);
        wDLU.Kz(wDLU.Kz((String)cv.e(1358238176)), this);
        wDLU.Kz(this);
        cv.e(this, -1676799518, new wfPa());
        Object object = wDLU.Kz((wfPa)wDLU.Kz((ktOu)cv.e(-1326510031), wDLU.Kz(false)));
        while (object.hasNext()) {
            Object object2;
            Class class_ = (Class)object.next();
            try {
                object2 = wDLU.Kz(wDLU.Kz(class_, new Class[0]), new Object[0]);
                wDLU.Kz((wfPa)cv.b(this, -1676799518), (HBqU)object2);
                wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(rgig$AWxc.r("\u4f8e\u6b11\u092f\u71a2\u602f\u3278\ua2dc\u4df3\uc234")), wDLU.Kz(wDLU.Kz(object2)))));
            }
            catch (InstantiationException instantiationException) {
                object2 = instantiationException;
                wDLU.Kz(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                object2 = illegalAccessException;
                wDLU.Kz(illegalAccessException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object2 = illegalArgumentException;
                wDLU.Kz(illegalArgumentException);
            }
            catch (InvocationTargetException invocationTargetException) {
                object2 = invocationTargetException;
                wDLU.Kz(invocationTargetException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                object2 = noSuchMethodException;
                wDLU.Kz(noSuchMethodException);
            }
            catch (SecurityException securityException) {
                object2 = securityException;
                wDLU.Kz(securityException);
            }
        }
    }

    @Override
    public void tick() {
        if (!((Boolean)cv.b(this, -1552477723)).booleanValue()) {
            this.begin();
        }
    }

    public void nJLQ(CommandSender commandSender, String string) {
        wDLU.Kz(commandSender, string);
    }

    public void vtFs(CommandSender commandSender, String string) {
        this.nJLQ(commandSender, (String)wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(-314502936))), string)));
    }

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] arrstring) {
        if (wDLU.Kz(wDLU.Kz(command), (String)cv.e(1358238176)) != false) {
            if (wDLU.Kz((tdpC)((Object)cv.e(242159151)), commandSender) == false) {
                this.vtFs(commandSender, (String)cv.e(733352431));
                return true;
            }
            if (wDLU.Kz((tdpC)((Object)cv.e(-607646177)), commandSender) == false) {
                this.vtFs(commandSender, (String)cv.e(733352431));
                return true;
            }
            if (arrstring.length == 0) {
                commandSender.sendMessage((String)wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(1197215955))), YEBy$TyVf.W("\uc9dd\uf726\u9e3f"))), (APKB)((Object)cv.e(1129452014))));
                commandSender.sendMessage((String)wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(1129452014))), YEBy$TyVf.W("\uc9a0\uf715\u9e17\u1242\ud61a")), (APKB)((Object)cv.e(653004664))), YEBy$TyVf.W("\uc9fb\uf708\u9e11\u124c\ud656\u5bb3")), (APKB)((Object)cv.e(-1071443542))), YEBy$TyVf.W("\uc9af\uf74a\u9e56\u127f\ud655\u5bb1\u76fa\ue9b1\u37f4\u3320\ud23c\u9903\u08d5\ue2f0\u07e3\u2135\u80d6\uadef\u81b9\u5e1a\uaa69\ub81b\u10ce"))));
                commandSender.sendMessage((String)wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(1129452014))), YEBy$TyVf.W("\uc9a0\uf715\u9e17\u1242\ud61a")), (APKB)((Object)cv.e(653004664))), YEBy$TyVf.W("\uc9fc\uf713\u9e17\u125f\ud64f\u5ba5")), (APKB)((Object)cv.e(-1071443542))), YEBy$TyVf.W("\uc9af\uf74a\u9e56\u126c\ud65f\u5ba2\u76bd\ue98f\u37d0\u3349\ud249\u9931\u08bc\ue283\u07f8\u213a\u8082\uadf5\u81b8"))));
                commandSender.sendMessage((String)wDLU.Kz((APKB)((Object)cv.e(1129452014))));
            } else if (wDLU.Kz(arrstring[0], YEBy$TyVf.W("\uc9fb\uf708\u9e11\u124c\ud656\u5bb3")) != false) {
                if (wDLU.Kz((tdpC)((Object)cv.e(-1767240163)), commandSender) == false) {
                    this.vtFs(commandSender, (String)cv.e(733352431));
                    return true;
                }
                cv.e((tLCm)cv.b((YoSa)cv.e(239341894), 344592875), -1823403542, (Boolean)cv.b((tLCm)cv.b((YoSa)cv.e(239341894), 344592875), -1823403542) == false);
                wDLU.Kz(commandSender, (Boolean)cv.b((tLCm)cv.b((YoSa)cv.e(239341894), 344592875), -1823403542) != false ? YEBy$TyVf.W("\uc9dd\uf726\u9e3f\u120b\ud675\u5bb8\u76f1\ue9b4\u37ff\u3365\ud24f") : YEBy$TyVf.W("\uc9dd\uf726\u9e3f\u120b\ud653\u5ba5\u76bd\ue9b3\u37fe\u3377\ud24e\u992d\u08fa\ue2b6\u07e0\u2132\u8098\uade5\u81e5"));
            } else if (wDLU.Kz(arrstring[0], YEBy$TyVf.W("\uc9fc\uf713\u9e17\u125f\ud64f\u5ba5")) != false) {
                fTAa fTAa2;
                Object object;
                fTAa fTAa3;
                if (wDLU.Kz((tdpC)((Object)cv.e(-1367929325)), commandSender) == false) {
                    this.vtFs(commandSender, (String)cv.e(733352431));
                    return true;
                }
                int n = 0;
                int n2 = 0;
                Object object2 = wDLU.Kz(wDLU.Kz((jOKx)cv.e(-1547234860)));
                while (object2.hasNext()) {
                    fTAa2 = (fTAa)object2.next();
                    object = wDLU.Kz(fTAa2.JbqW());
                    while (object.hasNext()) {
                        fTAa3 = (fTAa)object.next();
                        ++n;
                        if (!fTAa3.Rayq()) continue;
                        ++n2;
                    }
                    ++n;
                    if (!fTAa2.Rayq()) continue;
                    ++n2;
                }
                commandSender.sendMessage((String)wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(1197215955))), YEBy$TyVf.W("\uc9dd\uf726\u9e3f\u120b\ud669\u5ba2\u76fc\ue9a9\u37e4\u3373"))), (APKB)((Object)cv.e(1129452014))));
                commandSender.sendMessage((String)wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(YEBy$TyVf.W("\uc9c8\uf708\u9e17\u1247\ud649\u5bec\u76bd")), (APKB)((Object)cv.e(653004664))), n - n2), YEBy$TyVf.W("\uc9af\uf748\u9e56")), n), (APKB)((Object)cv.e(-1071443542))), YEBy$TyVf.W("\uc9af\uf726\u9e15\u1243\ud653\u5bb3\u76eb\ue9b8\u37f5"))));
                commandSender.sendMessage((String)wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(YEBy$TyVf.W("\uc9c6\uf709\u9e02\u124e\ud648\u5ba0\u76f8\ue9b3\u37e5\u3369\ud201\u992c\u08ef\ue2ea\u07ac")), wDLU.Kz(wDLU.Kz(wDLU.Kz((jOKx)cv.e(-1547234860))))), YEBy$TyVf.W("\uc9af\uf70e\u9e18\u120b\ud64e\u5bbe\u76f8\ue9fd\u37e1\u3361\ud21d\u9936\u08bc")), wDLU.Kz(wDLU.Kz() - (Long)cv.b((jOKx)cv.e(-1547234860), 1319768529), false))));
                object2 = wDLU.Kz(wDLU.Kz((jOKx)cv.e(-1547234860)));
                while (object2.hasNext()) {
                    fTAa2 = (fTAa)object2.next();
                    commandSender.sendMessage((String)wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(653004664))), fTAa2.getTag()), (APKB)((Object)cv.e(-1071443542))), YEBy$TyVf.W("\uc9af\uf74a\u9e48\u120b")), fTAa2.Rayq() ? wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(-314502936))), YEBy$TyVf.W("\uc9c9\uf706\u9e1f\u1247\ud653\u5bb8\u76fa"))) : wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(1489703379))), YEBy$TyVf.W("\uc9ce\uf704\u9e1e\u1242\ud65f\u5ba0\u76f8\ue9b9"))))));
                    object = wDLU.Kz(fTAa2.JbqW());
                    while (object.hasNext()) {
                        fTAa3 = (fTAa)object.next();
                        commandSender.sendMessage((String)wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(YEBy$TyVf.W("\uc9af\uf747")), (APKB)((Object)cv.e(653004664))), fTAa3.getTag()), (APKB)((Object)cv.e(-1071443542))), YEBy$TyVf.W("\uc9af\uf74a\u9e48\u120b")), fTAa3.Rayq() ? wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(-314502936))), YEBy$TyVf.W("\uc9c9\uf706\u9e1f\u1247\ud653\u5bb8\u76fa"))) : wDLU.Kz(wDLU.Kz(wDLU.Kz(new StringBuilder(), (APKB)((Object)cv.e(1489703379))), YEBy$TyVf.W("\uc9ce\uf704\u9e1e\u1242\ud65f\u5ba0\u76f8\ue9b9"))))));
                    }
                }
                commandSender.sendMessage((String)wDLU.Kz((APKB)((Object)cv.e(1129452014))));
            }
        } else if (wDLU.Kz(wDLU.Kz(command), (String)cv.e(-1971777049)) != false) {
            Object object;
            boolean bl = commandSender instanceof Player;
            Player player = bl ? (Player)commandSender : null;
            if (wDLU.Kz((tdpC)((Object)cv.e(242159151)), commandSender) == false) {
                this.vtFs(commandSender, (String)cv.e(733352431));
                return true;
            }
            if (arrstring.length == 0) {
                this.onCommand((CommandSender)(bl ? player : commandSender), command, string, new String[]{YEBy$TyVf.W("\uc9b0")});
                return true;
            }
            Object object3 = null;
            Object object4 = wDLU.Kz((wfPa)cv.b(this, -1676799518));
            while (object4.hasNext()) {
                object = (HBqU)object4.next();
                if (wDLU.Kz(object.getCommand(), arrstring[0]) == false) continue;
                object3 = object;
                break;
            }
            if (object3 == null) {
                object4 = wDLU.Kz((wfPa)cv.b(this, -1676799518));
                block5 : while (object4.hasNext()) {
                    object = (HBqU)object4.next();
                    String[] arrstring2 = object.PuYf();
                    int n = arrstring2.length;
                    int n3 = 0;
                    while (n3 < n) {
                        String string2 = arrstring2[n3];
                        if (wDLU.Kz(string2, arrstring[0]) != false) {
                            object3 = object;
                            break block5;
                        }
                        ++n3;
                    }
                }
            }
            if (object3 != null) {
                object = wDLU.Kz(commandSender);
                object4 = object3.LGKN();
                if (wDLU.Kz(object4, object) == false) {
                    this.vtFs(commandSender, (String)wDLU.Kz(wDLU.Kz(new StringBuilder(YEBy$TyVf.W("\uc9db\uf70f\u9e1f\u1258\ud61a\u5bb5\u76f2\ue9b0\u37fc\u3361\ud200\u9926\u08bc\ue2b4\u07e3\u213e\u8085\uada0\u81a5\u5e55\uaa72\ub85d\u10db\u39c3\u6e2f\u9172\uc114\ub48c\ud570\u4382")), wDLU.Kz(object))));
                    return true;
                }
            }
            if (object3 != null) {
                if (arrstring.length == 1) {
                    object3.ssNb((CommandSender)(bl ? player : commandSender), new String[0]);
                } else {
                    object = new String[arrstring.length - 1];
                    int n = 1;
                    while (n < arrstring.length) {
                        object[n - 1] = arrstring[n];
                        ++n;
                    }
                    object3.ssNb((CommandSender)(bl ? player : commandSender), (String[])object);
                }
                return true;
            }
            this.onCommand((CommandSender)(bl ? player : commandSender), command, string, new String[]{YEBy$TyVf.W("\uc9b0")});
            return true;
        }
        return false;
    }

    private static Object Kz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

