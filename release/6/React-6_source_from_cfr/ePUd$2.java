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

class ePUd$2
implements qAsQ<NxIh> {
    final /* synthetic */ ePUd cBHm;

    ePUd$2(ePUd ePUd2) {
        this.cBHm = ePUd2;
    }

    public NxIh AaAq() {
        kkYw kkYw2 = new kkYw((DijM)((Object)yy.p(-751310334)));
        ePUd$2.eC(kkYw2, (EntityType)yy.p(-823268809));
        return kkYw2;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.AaAq();
    }

    private static Object eC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

