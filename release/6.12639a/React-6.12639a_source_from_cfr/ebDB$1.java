/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class ebDB$1
implements ntkx {
    final /* synthetic */ ebDB yBqF;

    ebDB$1(ebDB ebDB2) {
        this.yBqF = ebDB2;
    }

    @Override
    public String uVol(double d) {
        return ebDB$1.fi(ebDB$1.fi(new StringBuilder((String)ebDB$1.fi(ebDB$1.fi(d, false))), ebDB$1.fi(mrFx$WjFM.d("\udc4b\u099c\u393b\uc449\u6b00\u1c39\u88e8\u9732\u8410\u28a4\u6cb3\uce98\uc7bc\u6d5a\u11f8\udcb5\u6d46\u508c\ue200\u9536\u02e8\u5d88\u6076\u01cb\u933a\u45d3"))));
    }

    private static Object fi(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

