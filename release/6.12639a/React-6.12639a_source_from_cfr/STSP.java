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

public final class STSP
extends Enum<STSP> {
    public static final /* enum */ STSP NEXo;
    public static final /* enum */ STSP Edqb;
    public static final /* enum */ STSP wgAV;
    public static final /* enum */ STSP oVXW;
    public static final /* enum */ STSP eQKy;
    private String Edom;
    private static final /* synthetic */ STSP[] AXet;

    static {
        o.w(967001522, (Object)new STSP(nJPf$sILv.G("\uf0f5\ud3b9\u6902\ucae1\uaf00"), 0, nJPf$sILv.G("\uf0d5\ud399\u6922\ucac1\uaf20")));
        o.w(-1354218063, (Object)new STSP(nJPf$sILv.G("\uf0ef\ud3b9\u6902\ucae1\uaf00"), 1, nJPf$sILv.G("\uf0cf\ud399\u6922\ucac1\uaf20")));
        o.w(-1807661648, (Object)new STSP(nJPf$sILv.G("\uf0e8\ud3ac\u690e\ucae7\uaf0f\u1147\u65e7"), 2, nJPf$sILv.G("\uf0c8\ud38c\u692e\ucac7\uaf2f\u1167\u65c7")));
        o.w(-1412020817, (Object)new STSP(nJPf$sILv.G("\uf0e9\ud3b1\u690b\ucae0\uaf01\u114c"), 3, nJPf$sILv.G("\uf0c9\ud391\u692b\ucac0\uaf21\u116c")));
        o.w(-2143074898, (Object)new STSP(nJPf$sILv.G("\uf0f7\ud3bd\u690e\ucaf7\uaf0c\u1147\u65e7"), 4, nJPf$sILv.G("\uf0d7\ud39d\u692e\ucad7\uaf2c\u1167\u65c7")));
        o.w(1597523373, new STSP[]{(STSP)((Object)o.k(967001522)), (STSP)((Object)o.k(-1354218063)), (STSP)((Object)o.k(-1807661648)), (STSP)((Object)o.k(-1412020817)), (STSP)((Object)o.k(-2143074898))});
    }

    private STSP(String string2, int n2, String string3) {
        this.Edom = string2;
    }

    public static Lhwj<STSP> KTiK(Entity entity) {
        Lhwj<STSP> lhwj = new Lhwj<STSP>();
        STSP[] arrsTSP = STSP.values();
        int n = arrsTSP.length;
        int n2 = 0;
        while (n2 < n) {
            STSP sTSP = arrsTSP[n2];
            if (sTSP.GPlk(entity)) {
                STSP.yF(lhwj, sTSP);
            }
            ++n2;
        }
        return lhwj;
    }

    public boolean GPlk(Entity entity) {
        if (this.equals((Object)((STSP)((Object)o.k(-2143074898))))) {
            if (entity instanceof LivingEntity && ((LivingEntity)entity).isLeashed()) {
                return true;
            }
            return false;
        }
        if (this.equals((Object)((STSP)((Object)o.k(967001522))))) {
            return entity.isCustomNameVisible();
        }
        if (this.equals((Object)((STSP)((Object)o.k(-1412020817)))) || this.equals((Object)((STSP)((Object)o.k(-1807661648))))) {
            if (entity.getPassengers().isEmpty()) {
                return false;
            }
            return true;
        }
        if (this.equals((Object)((STSP)((Object)o.k(-1354218063))))) {
            if (entity instanceof Tameable && ((Tameable)entity).isTamed()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        return (String)o.a((Object)this, 253380012);
    }

    public static STSP[] values() {
        STSP[] arrsTSP = (STSP[])o.k(1597523373);
        int n = arrsTSP.length;
        STSP[] arrsTSP2 = new STSP[n];
        STSP.yF(arrsTSP, false, arrsTSP2, false, n);
        return arrsTSP2;
    }

    public static STSP valueOf(String string) {
        return (STSP)((Object)STSP.yF(STSP.class, string));
    }

    private static Object yF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

