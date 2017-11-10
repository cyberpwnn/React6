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

public class kkYw
extends fJhK {
    public kkYw(DijM dijM) {
        super(EntityType.class, dijM);
        for (EntityType entityType : (EntityType[])kkYw.zP()) {
            kkYw.zP(this.aela(), entityType);
        }
    }

    public void yJLL(EntityType entityType) {
        kkYw.zP(this.VCjX(), entityType);
    }

    @Override
    public int qdWJ(CommandSender commandSender, String string) throws Foor {
        hGxw hGxw2 = new hGxw();
        if (kkYw.zP(string, KDGY$JAHk.Y("\u2c1b")) != false) {
            for (String string2 : (String[])kkYw.zP(string, KDGY$JAHk.Y("\u2c1b"))) {
                Object object = kkYw.zP(string2, KDGY$JAHk.Y("\u2c1c"));
                Object object2 = kkYw.zP(this.halY(commandSender, (String)(object != false ? kkYw.zP(string2, true) : string2)));
                while (object2.hasNext()) {
                    EntityType entityType = (EntityType)object2.next();
                    if (object != false) {
                        kkYw.zP(hGxw2, entityType);
                        continue;
                    }
                    kkYw.zP(hGxw2, entityType);
                }
            }
        } else {
            kkYw.zP(hGxw2, this.halY(commandSender, string));
        }
        kkYw.zP(this.VCjX());
        kkYw.zP(this.aela(), hGxw2);
        kkYw.zP(this.VCjX(), hGxw2);
        kkYw.zP((PrintStream)yy.p(-1742338412), kkYw.zP(this.aela()));
        return (int)kkYw.zP(hGxw2);
    }

    private hGxw<EntityType> halY(CommandSender commandSender, String string) throws Foor {
        hGxw<EntityType> hGxw2 = new hGxw<EntityType>();
        boolean bl = false;
        if (kkYw.zP(string, NVIs$JbpD.H("\u79f7")) != false) {
            for (EntityType entityType : (EntityType[])kkYw.zP()) {
                if (kkYw.zP(entityType, (EntityType)yy.p(-823268809)) != false) continue;
                kkYw.zP(hGxw2, entityType);
            }
            return hGxw2;
        }
        for (EntityType entityType : (EntityType[])kkYw.zP()) {
            if (kkYw.zP(string, kkYw.zP(entityType)) != false) {
                kkYw.zP(hGxw2, entityType);
                bl = true;
                break;
            }
            if (kkYw.zP(kkYw.zP(string), kkYw.zP(entityType)) == false) continue;
            kkYw.zP(hGxw2, entityType);
            bl = true;
            break;
        }
        if (!bl) {
            throw new Foor((String)kkYw.zP(kkYw.zP(new StringBuilder(NVIs$JbpD.H("\u7988\ueb58\u68e4\u7a29\uad42\u22ab\udfa5\uc9d0\u2dfc\ub4b5\u4075\u03e3\u0d4d\u8eac\uf911\u0d58\uc0ea\ue5cd\uddc8\u9545\u8750\u0f2e\u601c\ub9c4\u1070\u88f4\u8d53\u476d\u384e")), string)));
        }
        if (kkYw.zP(hGxw2, (EntityType)yy.p(-823268809)) != false) {
            throw new Foor(NVIs$JbpD.H("\u7988\ueb58\u68e4\u7a29\uad42\u22ab\udfa5\uc9d0\u2dfc\ub4b5\u4076\u03e7\u0d53\u8eba\uf917\u0d0c\uc0af\ue5f3\uddd0\u954d\u875d\u0f32\u604e\ub990\u104c\u88ea\u8d42\u473e\u381a\ude40\ucdee\u0b5d\u014c\u1703\ud909"));
        }
        return hGxw2;
    }

    @Override
    public String getName() {
        return NVIs$JbpD.H("\u3e07\ub62b\ue3f4\u1473\uf6ae\u8cd3\u6c58\ubcc5\u32a2\u5d12\u4fd0");
    }

    private static Object zP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

