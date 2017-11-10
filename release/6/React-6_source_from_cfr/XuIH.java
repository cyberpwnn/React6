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

public class XuIH
extends qloI
implements CommandExecutor,
Listener {
    private PBUD<XktK> QFLR;
    private boolean aCwg;

    @Override
    public void start() {
        yy.E(this, -717165679, false);
    }

    @Override
    public void stop() {
        XuIH.cj(this);
    }

    public void begin() {
        yy.E(this, -717165679, true);
        XuIH.cj(XuIH.cj((String)yy.p(756476815)), this);
        XuIH.cj(this);
        yy.E(this, -1206391709, new PBUD());
        Object object = XuIH.cj((PBUD)XuIH.cj((aKuV)yy.p(2038819903), XuIH.cj(false)));
        while (object.hasNext()) {
            Object object2;
            Class class_ = (Class)object.next();
            try {
                object2 = XuIH.cj(XuIH.cj(class_, new Class[0]), new Object[0]);
                XuIH.cj((PBUD)yy.h(this, -1206391709), (XktK)object2);
                XuIH.cj(XuIH.cj(XuIH.cj(new StringBuilder(NVIs$JbpD.H("\u4561\uf6c9\ud8be\u820d\ua3eb\uf463\u962f\u7faf\udfb0")), XuIH.cj(XuIH.cj(object2)))));
            }
            catch (InstantiationException instantiationException) {
                object2 = instantiationException;
                XuIH.cj(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                object2 = illegalAccessException;
                XuIH.cj(illegalAccessException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object2 = illegalArgumentException;
                XuIH.cj(illegalArgumentException);
            }
            catch (InvocationTargetException invocationTargetException) {
                object2 = invocationTargetException;
                XuIH.cj(invocationTargetException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                object2 = noSuchMethodException;
                XuIH.cj(noSuchMethodException);
            }
            catch (SecurityException securityException) {
                object2 = securityException;
                XuIH.cj(securityException);
            }
        }
    }

    @Override
    public void tick() {
        if (!((Boolean)yy.h(this, -717165679)).booleanValue()) {
            this.begin();
        }
    }

    public void ssMm(CommandSender commandSender, String string) {
        XuIH.cj(commandSender, string);
    }

    public void yIkI(CommandSender commandSender, String string) {
        this.ssMm(commandSender, (String)XuIH.cj(XuIH.cj(XuIH.cj(new StringBuilder(), (ydHl)((Object)yy.p(-329382161))), string)));
    }

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] arrstring) {
        if (XuIH.cj(XuIH.cj(command), (String)yy.p(756476815)) != false) {
            Object object;
            boolean bl = commandSender instanceof Player;
            Player player = bl ? (Player)commandSender : null;
            if (XuIH.cj((nSBH)((Object)yy.p(1531250457)), commandSender) == false) {
                this.yIkI(commandSender, (String)yy.p(-956765086));
                return true;
            }
            if (arrstring.length == 0) {
                this.onCommand((CommandSender)(bl ? player : commandSender), command, string, new String[]{KDGY$JAHk.Y("\ufde2")});
                return true;
            }
            Object object2 = null;
            String[] arrstring2 = XuIH.cj((PBUD)yy.h(this, -1206391709));
            while (arrstring2.hasNext()) {
                object = (XktK)arrstring2.next();
                if (XuIH.cj(object.getCommand(), arrstring[0]) == false) continue;
                object2 = object;
                break;
            }
            if (object2 == null) {
                arrstring2 = XuIH.cj((PBUD)yy.h(this, -1206391709));
                block1 : while (arrstring2.hasNext()) {
                    object = (XktK)arrstring2.next();
                    for (String string2 : object.kkYw()) {
                        if (XuIH.cj(string2, arrstring[0]) == false) continue;
                        object2 = object;
                        break block1;
                    }
                }
            }
            if (object2 != null) {
                arrstring2 = XuIH.cj(commandSender);
                object = object2.Hdte();
                if (XuIH.cj(object, arrstring2) == false) {
                    this.yIkI(commandSender, (String)XuIH.cj(XuIH.cj(new StringBuilder(KDGY$JAHk.Y("\ufd89\u9576\u0266\u6daf\u333f\u844f\uc708\uf4a6\uaa59\ue5d8\u9962\uad28\u2ec3\u8da0\ua9c4\u6ffc\uf9a4\uc449\uc30a\u423b\u5563\u3be8\ud984\u7c70\ue5af\ue30e\u1619\udb6e\uaa03\u7c79")), XuIH.cj(arrstring2))));
                    return true;
                }
            }
            if (object2 != null) {
                if (arrstring.length == 1) {
                    object2.mXJp((CommandSender)(bl ? player : commandSender), new String[0]);
                } else {
                    arrstring2 = new String[arrstring.length - 1];
                    for (int i = 1; i < arrstring.length; ++i) {
                        arrstring2[i - 1] = arrstring[i];
                    }
                    object2.mXJp((CommandSender)(bl ? player : commandSender), arrstring2);
                }
                return true;
            }
            this.onCommand((CommandSender)(bl ? player : commandSender), command, string, new String[]{KDGY$JAHk.Y("\ufde2")});
            return true;
        }
        return false;
    }

    private static Object cj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

