/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class loLI$3
extends xFyR {
    final /* synthetic */ loLI rOfQ;

    loLI$3(loLI loLI2) {
        this.rOfQ = loLI2;
    }

    @Override
    public void MJee() {
        loLI$3.uJ((loLI)o.a(this, -1552921177), this.uNvj());
        loLI$3.uJ((loLI)o.a(this, -1552921177), this.QEpT());
        loLI$3.uJ((loLI)o.a(this, -1552921177), this.JuAt());
        loLI$3.uJ(loLI$3.uJ((loLI)o.a(this, -1552921177)), this.LqtU());
        loLI$3.uJ((loLI)o.a(this, -1552921177), loLI$3.uJ(loLI$3.uJ((loLI)o.a(this, -1552921177))));
    }

    private static Object uJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

