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

class vtFs$2
implements xqeH<EmKi> {
    final /* synthetic */ vtFs fKRe;

    vtFs$2(vtFs vtFs2) {
        this.fKRe = vtFs2;
    }

    public EmKi jhSt() {
        sapB sapB2 = new sapB((GHaL)((Object)cv.e(1197936249)));
        vtFs$2.Pf(sapB2, (EntityType)cv.e(-209907400));
        return sapB2;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.jhSt();
    }

    private static Object Pf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

