/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class MSKP$2
extends xGOy {
    final /* synthetic */ MSKP TYHd;

    MSKP$2(MSKP mSKP) {
        this.TYHd = mSKP;
    }

    @Override
    public void run() {
        Object object = MSKP$2.Kc((wwNq)o.a((TEqA)o.k(911295720), 1729188757), (WOYg)((Object)o.k(-437042026)));
        String[] arrstring = new String[2];
        arrstring[0] = object.getName();
        arrstring[1] = MSKP$2.Kc(mrFx$WjFM.d("\ua8ab\ue05f\ucb83\ud867\ueaaf\u18dc\u3ead\ud4b7\u085c\u9bf7\u8fd3\u6d9f\u3242\uf09d\u92d1\u7519\ua9be\u947a\u13e2\ub999\ucfb7\udae6\ub3fa\u1e15\uc6ac\u3bfa\u1d13\u195e\u8e2c\ud595"));
        MSKP$2.Kc((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(400971763)), arrstring));
        MSKP$2.Kc((wwNq)o.a((TEqA)o.k(911295720), 1729188757), object.Mkpo(), new nJPf(), new GjaJ[0]);
    }

    private static Object Kc(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

