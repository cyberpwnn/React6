/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.EntityType
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.EntityType;

class GPlk$2
implements nceQ<GjaJ> {
    final /* synthetic */ GPlk DbLk;

    GPlk$2(GPlk gPlk) {
        this.DbLk = gPlk;
    }

    public GjaJ HeSD() {
        JYxj jYxj = new JYxj((yuDM)((Object)o.k(1956463743)));
        GPlk$2.HV(jYxj, (EntityType)o.k(1458914430));
        return jYxj;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.HeSD();
    }

    private static Object HV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

