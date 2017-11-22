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

@IWbc(value=0)
public class oxGX
extends Aqbp {
    public oxGX() {
        this.command = (String)cv.e(-2017783584);
        this.aliases = new String[]{(String)cv.e(-434171677), (String)cv.e(-1842278174)};
        String[] arrstring = new String[1];
        arrstring[0] = oxGX.Qo((tdpC)((Object)cv.e(242159151)));
        this.VoJs = arrstring;
        this.ktXM = (String)cv.e(288428268);
        this.description = (String)cv.e(-179826449);
        this.IFas = (OikN)((Object)cv.e(-428666795));
    }

    @Override
    public void ssNb(CommandSender commandSender, String[] arrstring) {
        Object object;
        if (arrstring.length == 0) {
            oxGX.Qo(commandSender, YEBy$TyVf.W("\ub7ad\u7647\ua0ef\ub13e\u591c\u900b\u27e4\ubc17\u4fb1\ub40b\u2ef9\u6d3e\ub441\u658d\uabcf\ud646\uf21a\ua9b4\uec60\u3830\u22eb\ub44f\ua546\u517a\u622a\ucc71\u4b2b\uc4db\u3c31\uaf5a\uc004\ucb0f\u5a0c\ubb33\ud06b\ub11e"));
            return;
        }
        String string = arrstring[0];
        EmKi[] arremKi = new EmKi[arrstring.length - 1];
        wfPa wfPa2 = new wfPa();
        Object object2 = null;
        Object object3 = oxGX.Qo(oxGX.Qo((yuFb)cv.b((YoSa)cv.e(239341894), 73011438)));
        block2 : while (object3.hasNext()) {
            object = (CoXE)object3.next();
            String[] arrstring2 = object.LGKl();
            int n = arrstring2.length;
            int n2 = 0;
            while (n2 < n) {
                String string2 = arrstring2[n2];
                if (oxGX.Qo(string2, string) != false) {
                    object2 = object;
                    break block2;
                }
                ++n2;
            }
        }
        if (object2 == null) {
            oxGX.Qo(commandSender, oxGX.Qo(oxGX.Qo(oxGX.Qo(new StringBuilder(YEBy$TyVf.W("\ub7ab\u7646\ua0e9\ub135\u5953\u9010\u27e3\ubc44\u4f84\ub448\u2ee2\u6d31\ub40e\u6582\uab96\ud612")), (APKB)((Object)cv.e(-314502936))), string)));
            return;
        }
        if (oxGX.Qo(object2.BkpW(), (rwyd)((Object)cv.e(-1387065430))) != false) {
            oxGX.Qo(commandSender, oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(new StringBuilder(), (APKB)((Object)cv.e(-314502936))), YEBy$TyVf.W("\ub7bf\u764b\ua0f6\ub132\u5953\u9009\u27b7\ubc44")), object2.getName()), YEBy$TyVf.W("\ub7de\u764c\ua0ed\ub13e\u594f\u9047\u27e3\ubc0b\u4fb1\ub40b\u2ee5\u6d2d\ub411\u659c\uabc3\ud640\uf207\ua9fb\uec63\u3822\u22a5\ub449\ua54f\u5179\u627f\ucc74\u4b21\uc48d\u3c3c\uaf5c\uc045\ucb13\u5a00\ubb2e\ud060\ub143\uc8de"))));
            return;
        }
        if (arrstring.length > 0) {
            int n = 0;
            while (n < arrstring.length - 1) {
                try {
                    object3 = oxGX.Qo(oxGX.Qo(arrstring[n + 1]));
                    arremKi[n] = oxGX.Qo(commandSender, object3);
                    oxGX.Qo();
                    if (oxGX.Qo(oxGX.Qo(object2.EmLA()), arremKi[n].getType()) == false) {
                        oxGX.Qo(commandSender, oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(new StringBuilder(), (APKB)((Object)cv.e(-314502936))), YEBy$TyVf.W("\ub7bf\u764b\ua0f6\ub132\u5953\u9009\u27b7\ubc44")), object2.getName()), YEBy$TyVf.W("\ub7de\u764c\ua0ed\ub13e\u594f\u9047\u27e3\ubc0b\u4fb1\ub40b\u2ee5\u6d2d\ub411\u659c\uabc3\ud640\uf207\ua9fb\uec7a\u382b\u22ae\ub41c\ua55d\u5170\u6233\ucc78\u4b2c\uc48f\u3c3c\uaf4d\uc01e\ucb47")), arremKi[n].getName())));
                        return;
                    }
                }
                catch (kYwm kYwm2) {
                    oxGX.Qo(wfPa2, oxGX.Qo(kYwm2));
                    oxGX.Qo(kYwm2);
                }
                ++n;
            }
        }
        if (oxGX.Qo(wfPa2) != false) {
            object = new Smci();
            if (commandSender instanceof Player) {
                object = new PBWX((Player)commandSender);
            }
            if (oxGX.Qo(object2.lCdp(), (kQcX)((Object)cv.e(-747106030))) != false) {
                oxGX.Qo(commandSender, oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(new StringBuilder((String)oxGX.Qo(object2.getName())), YEBy$TyVf.W("\ub7de")), (APKB)((Object)cv.e(1197215955))), object2.getStatus())));
                oxGX.Qo(commandSender, YEBy$TyVf.W("\ub7a7\u7647\ua0f7\ub129\u591c\u9006\u27ee\ubc10\u4fac\ub444\u2ef8\u6d78\ub409\u658d\uabdf\ud612\uf211\ua9be\uec6b\u382d\u22eb\ub44d\ua55b\u5170\u622a\ucc78\u4b2b\uc4db\u3c27\uaf50\uc004\ucb15\u5a1c\ubb2f\ud020"));
            }
            oxGX.Qo((yuFb)cv.b((YoSa)cv.e(239341894), 73011438), object2.vtFs(), object, arremKi);
            return;
        }
        oxGX.Qo(commandSender, oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(new StringBuilder(), (APKB)((Object)cv.e(-314502936))), YEBy$TyVf.W("\ub7bf\u764b\ua0f6\ub132\u5953\u9009\u27b7\ubc44")), object2.getName()), YEBy$TyVf.W("\ub7de\u764e\ua0e3\ub132\u5950\u9002\u27e9\ubc44\u4fb1\ub444\u2eb6\u6d28\ub400\u659e\uabdf\ud657\uf253\ua9a8\uec7b\u3833\u22bb\ub450\ua547\u5170\u623b\ucc3d\u4b26\uc495\u3c23\uaf4a\uc050\ucb49"))));
        object3 = oxGX.Qo(wfPa2);
        while (object3.hasNext()) {
            object = (String)object3.next();
            oxGX.Qo(commandSender, oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(oxGX.Qo(new StringBuilder(), (APKB)((Object)cv.e(-314502936))), object2.getName()), YEBy$TyVf.W("\ub7c4\u7608")), object)));
        }
    }

    private static Object Qo(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

