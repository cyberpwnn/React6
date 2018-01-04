/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class XRaB
implements xynF {
    @Override
    public void UtIU(String string) {
        XRaB.bI(XRaB.bI(), string);
    }

    @Override
    public void biLo(String string) {
        XRaB.bI(XRaB.bI(), string);
    }

    @Override
    public void VwLY(String string) {
        XRaB.bI(XRaB.bI(), string);
    }

    @Override
    public void TEqA(String string) {
        XRaB.bI(XRaB.bI(), string);
    }

    private static Object bI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

