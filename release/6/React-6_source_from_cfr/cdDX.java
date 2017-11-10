/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class cdDX
implements WFnH {
    @Override
    public void jVod(String string) {
        cdDX.ti(cdDX.ti(cdDX.ti(new StringBuilder(NVIs$JbpD.H("\ub354\u7b5f\u027b\ub8bc\u0440\u6266\u8d12")), string)));
    }

    @Override
    public void wnXH(String string) {
        cdDX.ti(cdDX.ti(cdDX.ti(new StringBuilder(KDGY$JAHk.Y("\u54f7\u2145\ue4a8\u7d02\u789c\u3ed2\u2d79")), string)));
    }

    @Override
    public void qKCn(String string) {
        cdDX.ti(cdDX.ti(cdDX.ti(new StringBuilder(BkvY$LhxG.I("\u5dd7\u60ff\u6f36\u11d7\u31cc\ua3b7\ubd25")), string)));
    }

    @Override
    public void HdqI(String string) {
        cdDX.ti(cdDX.ti(cdDX.ti(new StringBuilder(NVIs$JbpD.H("\uda21\u8fa5\u126f\u0dee\u787b\u99a4\ue1d5")), string)));
    }

    private static Object ti(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

