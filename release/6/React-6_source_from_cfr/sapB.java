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

public class sapB
extends OPXm {
    public sapB(GHaL gHaL) {
        super(EntityType.class, gHaL);
        for (EntityType entityType : (EntityType[])sapB.Bc()) {
            sapB.Bc(this.mXMK(), entityType);
        }
    }

    public void IWSm(EntityType entityType) {
        sapB.Bc(this.ftyu(), entityType);
    }

    @Override
    public int jhSt(CommandSender commandSender, String string) throws kYwm {
        QyFw qyFw = new QyFw();
        if (sapB.Bc(string, rgig$AWxc.r("\u095e")) != false) {
            for (String string2 : (String[])sapB.Bc(string, rgig$AWxc.r("\u095e"))) {
                Object object = sapB.Bc(string2, rgig$AWxc.r("\u0959"));
                Object object2 = sapB.Bc(this.lCdp(commandSender, (String)(object != false ? sapB.Bc(string2, true) : string2)));
                while (object2.hasNext()) {
                    EntityType entityType = (EntityType)object2.next();
                    if (object != false) {
                        sapB.Bc(qyFw, entityType);
                        continue;
                    }
                    sapB.Bc(qyFw, entityType);
                }
            }
        } else {
            sapB.Bc(qyFw, this.lCdp(commandSender, string));
        }
        sapB.Bc(this.ftyu());
        sapB.Bc(this.mXMK(), qyFw);
        sapB.Bc(this.ftyu(), qyFw);
        sapB.Bc((PrintStream)cv.e(363401407), sapB.Bc(this.mXMK()));
        return (int)sapB.Bc(qyFw);
    }

    private QyFw<EntityType> lCdp(CommandSender commandSender, String string) throws kYwm {
        QyFw<EntityType> qyFw = new QyFw<EntityType>();
        boolean bl = false;
        if (sapB.Bc(string, rgig$AWxc.r("\u8cd0")) != false) {
            for (EntityType entityType : (EntityType[])sapB.Bc()) {
                if (sapB.Bc(entityType, (EntityType)cv.e(-209907400)) != false) continue;
                sapB.Bc(qyFw, entityType);
            }
            return qyFw;
        }
        for (EntityType entityType : (EntityType[])sapB.Bc()) {
            if (sapB.Bc(string, sapB.Bc(entityType)) != false) {
                sapB.Bc(qyFw, entityType);
                bl = true;
                break;
            }
            if (sapB.Bc(sapB.Bc(string), sapB.Bc(entityType)) == false) continue;
            sapB.Bc(qyFw, entityType);
            bl = true;
            break;
        }
        if (!bl) {
            throw new kYwm((String)sapB.Bc(sapB.Bc(new StringBuilder(rgig$AWxc.r("\u8caf\u742c\u682b\uf6fd\u1162\u293f\ub776\u2cc1\ue2aa\ub48d\uca43\u35b7\ud38f\ude58\ud241\ub4c6\u1782\ued79\u28b7\u084e\u9481\u302d\u5e49\u644e\uec23\u0fa6\u075a\u4c20\u733f")), string)));
        }
        if (sapB.Bc(qyFw, (EntityType)cv.e(-209907400)) != false) {
            throw new kYwm(rgig$AWxc.r("\u8caf\u742c\u682b\uf6fd\u1162\u293f\ub776\u2cc1\ue2aa\ub48d\uca40\u35b3\ud391\ude4e\ud247\ub492\u17c7\ued47\u28af\u0846\u948c\u3031\u5e1b\u641a\uec1f\u0fb8\u074b\u4c73\u736b\u8f90\u6954\u30bb\u645e\ua5e9\ud7d0"));
        }
        return qyFw;
    }

    @Override
    public String getName() {
        return KUXS$dwji.S("\ub7a1\u98dc\ue561\ua9a2\u88b6\u9c06\u6335\u509f\ua9df\ucc9a\u5931");
    }

    private static Object Bc(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

