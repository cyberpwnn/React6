/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.entity.Tameable
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.List;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Tameable;

public final class YoUO
extends Enum<YoUO> {
    public static final /* enum */ YoUO maJd;
    public static final /* enum */ YoUO gghu;
    public static final /* enum */ YoUO yIxn;
    public static final /* enum */ YoUO FVjY;
    public static final /* enum */ YoUO EeJI;
    private String rNVu;
    private static final /* synthetic */ YoUO[] UkeY;

    public static YoUO[] values() {
        return (YoUO[])((YoUO[])yy.p(-1844254217)).clone();
    }

    public static YoUO valueOf(String string) {
        return (YoUO)((Object)YoUO.lo(YoUO.class, string));
    }

    private YoUO(String string2) {
        this.rNVu = string2;
    }

    public static hGxw<YoUO> halY(Entity entity) {
        hGxw<YoUO> hGxw2 = new hGxw<YoUO>();
        for (YoUO yoUO : YoUO.values()) {
            if (!yoUO.ssMm(entity)) continue;
            YoUO.lo(hGxw2, yoUO);
        }
        return hGxw2;
    }

    public boolean ssMm(Entity entity) {
        if (this.equals((Object)((YoUO)((Object)yy.p(-936252936))))) {
            if (entity instanceof LivingEntity && ((LivingEntity)entity).isLeashed()) {
                return true;
            }
            return false;
        }
        if (this.equals((Object)((YoUO)((Object)yy.p(1178986957))))) {
            return entity.isCustomNameVisible();
        }
        if (this.equals((Object)((YoUO)((Object)yy.p(-1348277818)))) || this.equals((Object)((YoUO)((Object)yy.p(2105731531))))) {
            if (!entity.getPassengers().isEmpty()) {
                return true;
            }
            return false;
        }
        if (this.equals((Object)((YoUO)((Object)yy.p(612166092))))) {
            if (entity instanceof Tameable && ((Tameable)entity).isTamed()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        return (String)yy.h((Object)this, 837740993);
    }

    static {
        yy.K(1178986957, (Object)new YoUO(BkvY$LhxG.I("\u8952\ud3c3\ube7b\u579c\uea9d")));
        yy.K(612166092, (Object)new YoUO(BkvY$LhxG.I("\u8948\ud3c3\ube7b\u579c\uea9d")));
        yy.K(2105731531, (Object)new YoUO(BkvY$LhxG.I("\u894f\ud3d6\ube77\u579a\uea92\uf5cb\ua902")));
        yy.K(-1348277818, (Object)new YoUO(BkvY$LhxG.I("\u894e\ud3cb\ube72\u579d\uea9c\uf5c0")));
        yy.K(-936252936, (Object)new YoUO(BkvY$LhxG.I("\u8950\ud3c7\ube77\u578a\uea91\uf5cb\ua902")));
        yy.K(-1844254217, new YoUO[]{(YoUO)((Object)yy.p(1178986957)), (YoUO)((Object)yy.p(612166092)), (YoUO)((Object)yy.p(2105731531)), (YoUO)((Object)yy.p(-1348277818)), (YoUO)((Object)yy.p(-936252936))});
    }

    private static Object lo(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

