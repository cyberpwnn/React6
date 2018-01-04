/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class loLI$1
extends xPJu {
    final /* synthetic */ loLI rOfQ;

    loLI$1(loLI loLI2) {
        this.rOfQ = loLI2;
    }

    @Override
    public void yJLS(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        loLI$1.yO((loLI)o.a(this, 1849576879), n);
        loLI$1.yO((loLI)o.a(this, 1849576879), n2);
        loLI$1.yO((loLI)o.a(this, 1849576879), n3);
        loLI$1.yO((loLI)o.a(this, 1849576879), n5);
        loLI$1.yO((loLI)o.a(this, 1849576879), n4);
        loLI$1.yO((loLI)o.a(this, 1849576879), n6);
        loLI$1.yO((loLI)o.a(this, 1849576879), n7);
    }

    private static Object yO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

