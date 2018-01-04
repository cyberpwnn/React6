/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.EntityType
 */
import java.io.PrintStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;

public class JYxj
extends UtLV {
    public JYxj(yuDM yuDM2) {
        super(EntityType.class, yuDM2);
        EntityType[] arrentityType = (EntityType[])JYxj.ry();
        int n = arrentityType.length;
        int n2 = 0;
        while (n2 < n) {
            EntityType entityType = arrentityType[n2];
            JYxj.ry(this.IFSe(), entityType);
            ++n2;
        }
    }

    public void biLo(EntityType entityType) {
        JYxj.ry(this.GjaJ(), entityType);
    }

    @Override
    public int KTiK(CommandSender commandSender, String string) throws JYyP {
        Lhwj lhwj = new Lhwj();
        if (JYxj.ry(string, mrFx$WjFM.d("\u6e42")) != false) {
            String[] arrstring = (String[])JYxj.ry(string, mrFx$WjFM.d("\u6e42"));
            int n = arrstring.length;
            int n2 = 0;
            while (n2 < n) {
                String string2 = arrstring[n2];
                Object object = JYxj.ry(string2, mrFx$WjFM.d("\u6e45"));
                Object object2 = JYxj.ry(this.ktHX(commandSender, (String)(object != false ? JYxj.ry(string2, true) : string2)));
                while (object2.hasNext()) {
                    EntityType entityType = (EntityType)object2.next();
                    if (object != false) {
                        JYxj.ry(lhwj, entityType);
                        continue;
                    }
                    JYxj.ry(lhwj, entityType);
                }
                ++n2;
            }
        } else {
            JYxj.ry(lhwj, this.ktHX(commandSender, string));
        }
        JYxj.ry(this.GjaJ());
        JYxj.ry(this.IFSe(), lhwj);
        JYxj.ry(this.GjaJ(), lhwj);
        JYxj.ry((PrintStream)o.k(-1536601438), JYxj.ry(this.IFSe()));
        return (int)JYxj.ry(lhwj);
    }

    private Lhwj<EntityType> ktHX(CommandSender commandSender, String string) throws JYyP {
        Lhwj<EntityType> lhwj = new Lhwj<EntityType>();
        boolean bl = false;
        if (JYxj.ry(string, mrFx$WjFM.d("\ub918")) != false) {
            EntityType[] arrentityType = (EntityType[])JYxj.ry();
            int n = arrentityType.length;
            int n2 = 0;
            while (n2 < n) {
                EntityType entityType = arrentityType[n2];
                if (JYxj.ry(entityType, (EntityType)o.k(1458914430)) == false) {
                    JYxj.ry(lhwj, entityType);
                }
                ++n2;
            }
            return lhwj;
        }
        EntityType[] arrentityType = (EntityType[])JYxj.ry();
        int n = arrentityType.length;
        int n3 = 0;
        while (n3 < n) {
            EntityType entityType = arrentityType[n3];
            if (JYxj.ry(string, JYxj.ry(entityType)) != false) {
                JYxj.ry(lhwj, entityType);
                bl = true;
                break;
            }
            if (JYxj.ry(JYxj.ry(string), JYxj.ry(entityType)) != false) {
                JYxj.ry(lhwj, entityType);
                bl = true;
                break;
            }
            ++n3;
        }
        if (!bl) {
            throw new JYyP((String)JYxj.ry(JYxj.ry(new StringBuilder(mrFx$WjFM.d("\ub967\u75ff\ud74b\ua702\u4f1c\u000b\u2995\uf9dc\u095d\ueb14\u49f1\u45ed\uee00\ub99a\u4168\u7608\u6da2\u7a22\u654f\u4886\u0962\ua1ee\ucf8a\u5719\u931d\ud1d2\u619b\u9e7f\uee54")), string)));
        }
        if (JYxj.ry(lhwj, (EntityType)o.k(1458914430)) != false) {
            throw new JYyP(mrFx$WjFM.d("\ub967\u75ff\ud74b\ua702\u4f1c\u000b\u2995\uf9dc\u095d\ueb14\u49f2\u45e9\uee1e\ub98c\u416e\u765c\u6de7\u7a1c\u6557\u488e\u096f\ua1f2\ucfd8\u574d\u9321\ud1cc\u618a\u9e2c\uee00\u13c3\u0637\ud6c6\uea24\u97cc\u00ee"));
        }
        return lhwj;
    }

    @Override
    public String getName() {
        return nJPf$sILv.G("\uf454\ube20\ud5df\u961f\u37d6\u266b\uc9a7\uce4d\u6ce3\udb1a\ua949");
    }

    private static Object ry(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

