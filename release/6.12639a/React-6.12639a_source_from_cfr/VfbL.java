/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class VfbL {
    private psKX bdBx;
    private String qEYg;

    public VfbL(psKX psKX2, String string) {
        this.bdBx = psKX2;
        this.qEYg = string;
    }

    public String toString() {
        return VfbL.WY(VfbL.WY(new StringBuilder((String)VfbL.WY(VfbL.WY((psKX)((Object)o.a(this, 2036157487))))), (String)o.a(this, 929778734)));
    }

    public psKX afhy() {
        return (psKX)((Object)o.a(this, 2036157487));
    }

    public void UtIU(psKX psKX2) {
        o.v(this, 2036157487, (Object)psKX2);
    }

    public String JIuS() {
        return (String)o.a(this, 929778734);
    }

    public void JYxj(String string) {
        o.v(this, 929778734, string);
    }

    private static Object WY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

