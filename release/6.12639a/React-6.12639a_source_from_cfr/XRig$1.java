/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class XRig$1
extends xGOy {
    final /* synthetic */ XRig vmLP;

    XRig$1(XRig xRig) {
        this.vmLP = xRig;
    }

    @Override
    public void run() {
        if (XRig$1.jC((XRig)o.a(this, -713926680)) != false) {
            String[] arrstring = new String[2];
            arrstring[0] = XRig$1.jC(FMkR$WjFM.a("\u39b5\ua7e8\uf0e7\u763d\u6622\u0f4a\uc739\u3a96\u3509\uf613\u08cb\u320a\ufbe0\u15f2\ud2ac\u46b3\u5b0c\uae90\u40fd\uaecb\ud5fd\uda87\u3a83\u4e0a\u76f2\uffee\u558f\u84df\u3658\u0886\u9f7b\u95c7\u8070\uea09\uf2d4\u4d01\ue2a1\ud924\udac8"));
            arrstring[1] = XRig$1.jC(FMkR$WjFM.a("\u39b5\ua7e8\uf0e7\u763d\u6622\u0f4a\uc739\u3a96\u3509\uf613\u08cb\u320a\ufbe0\u15f2\ud2ac\u46b3\u5b0c\uae90\u40fd\uaecb\ud5fd\uda87\u3a83\u4e0a\u76f2\uffee\u558f\u84df\u3656\u088d\u9f6a\u95de\u8029\uea03\uf28d\u4d14\ue2aa\ud92b\udac6"));
            XRig$1.jC((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(871061494)), arrstring));
            return;
        }
        String[] arrstring = new String[2];
        arrstring[0] = XRig$1.jC(FMkR$WjFM.a("\u39b5\ua7e8\uf0e7\u763d\u6622\u0f4a\uc739\u3a96\u3509\uf613\u08cb\u320a\ufbe0\u15f2\ud2ac\u46b3\u5b0c\uae90\u40fd\uaecb\ud5fd\uda87\u3a83\u4e0a\u76f2\uffee\u558f\u84df\u3658\u0886\u9f7b\u95c7\u8034\uea14\uf2c7\u4d4d\ue2b0\ud93c\udacc\ud5f9\ubbe0\uc0f6"));
        arrstring[1] = XRig$1.jC(FMkR$WjFM.a("\u39b5\ua7e8\uf0e7\u763d\u6622\u0f4a\uc739\u3a96\u3509\uf613\u08cb\u320a\ufbe0\u15f2\ud2ac\u46b3\u5b0c\uae90\u40fd\uaecb\ud5fd\uda87\u3a83\u4e0a\u76f2\uffee\u558f\u84df\u3656\u088d\u9f6a\u95de\u8029\uea03\uf28d\u4d14\ue2aa\ud92b\udac6"));
        XRig$1.jC((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(1411405812)), arrstring));
    }

    private static Object jC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

