/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class cJUN$2
extends CxNA {
    final /* synthetic */ cJUN dhJl;

    cJUN$2(cJUN cJUN2) {
        this.dhJl = cJUN2;
    }

    @Override
    public void run() {
        Object object = cJUN$2.Av(cJUN$2.Av(cJUN$2.Av((cJUN)o.a(this, -57648679))));
        while (object.hasNext()) {
            biRJ biRJ2 = (biRJ)((Object)object.next());
            cJUN$2.Av((MAfd)cJUN$2.Av(cJUN$2.Av((cJUN)o.a(this, -57648679)), biRJ2));
        }
    }

    private static Object Av(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

