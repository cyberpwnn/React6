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

public final class KwOT
extends Enum<KwOT> {
    public static final /* enum */ KwOT IWad;
    public static final /* enum */ KwOT miYd;
    public static final /* enum */ KwOT ETFk;
    public static final /* enum */ KwOT QWIV;
    public static final /* enum */ KwOT lTsr;
    private String loHX;
    private static final /* synthetic */ KwOT[] gowu;

    public static KwOT[] values() {
        return (KwOT[])((KwOT[])cv.e(371068826)).clone();
    }

    public static KwOT valueOf(String string) {
        return (KwOT)((Object)KwOT.xt(KwOT.class, string));
    }

    private KwOT(String string2) {
        this.loHX = string2;
    }

    public static QyFw<KwOT> BkpW(Entity entity) {
        QyFw<KwOT> qyFw = new QyFw<KwOT>();
        for (KwOT kwOT : KwOT.values()) {
            if (!kwOT.lCdp(entity)) continue;
            KwOT.xt(qyFw, kwOT);
        }
        return qyFw;
    }

    public boolean lCdp(Entity entity) {
        if (this.equals((Object)((KwOT)((Object)cv.e(887230341))))) {
            if (entity instanceof LivingEntity && ((LivingEntity)entity).isLeashed()) {
                return true;
            }
            return false;
        }
        if (this.equals((Object)((KwOT)((Object)cv.e(434311044))))) {
            return entity.isCustomNameVisible();
        }
        if (this.equals((Object)((KwOT)((Object)cv.e(792465287)))) || this.equals((Object)((KwOT)((Object)cv.e(-2001858682))))) {
            if (!entity.getPassengers().isEmpty()) {
                return true;
            }
            return false;
        }
        if (this.equals((Object)((KwOT)((Object)cv.e(-1072558207))))) {
            if (entity instanceof Tameable && ((Tameable)entity).isTamed()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        return (String)cv.b((Object)this, 62066560);
    }

    static {
        cv.V(434311044, (Object)new KwOT(KUXS$dwji.S("\uaf35\ud3ed\ud5b8\u1310\u41d2")));
        cv.V(-1072558207, (Object)new KwOT(KUXS$dwji.S("\uaf2f\ud3ed\ud5b8\u1310\u41d2")));
        cv.V(-2001858682, (Object)new KwOT(KUXS$dwji.S("\uaf28\ud3f8\ud5b4\u1316\u41dd\uff64\uee73")));
        cv.V(792465287, (Object)new KwOT(KUXS$dwji.S("\uaf29\ud3e5\ud5b1\u1311\u41d3\uff6f")));
        cv.V(887230341, (Object)new KwOT(KUXS$dwji.S("\uaf37\ud3e9\ud5b4\u1306\u41de\uff64\uee73")));
        cv.V(371068826, new KwOT[]{(KwOT)((Object)cv.e(434311044)), (KwOT)((Object)cv.e(-1072558207)), (KwOT)((Object)cv.e(-2001858682)), (KwOT)((Object)cv.e(792465287)), (KwOT)((Object)cv.e(887230341))});
    }

    private static Object xt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

