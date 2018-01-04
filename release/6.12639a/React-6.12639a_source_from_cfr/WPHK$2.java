/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class WPHK$2
extends xGOy {
    final /* synthetic */ WPHK UAxi;

    WPHK$2(WPHK wPHK) {
        this.UAxi = wPHK;
    }

    @Override
    public void run() {
        if (WPHK$2.QK((WPHK)o.a(this, -304326696)) != false) {
            String[] arrstring = new String[2];
            arrstring[0] = WPHK$2.QK(mrFx$WjFM.d("\u374a\u36a9\ub869\uec0e\u41a3\u534a\ua591\u5d94\u62cb\ud333\u2d66\u2df4\u4d89\u3001\uf405\u7fae\ueb65\ua25e\uabbc\ufb4a\u7b92\uf3ce\uc357\ua10d\ud3f8\u7e4f\ufa75\u0ab1\u6d1e\ufee0\uff75\uf964\uf7d2\uc52d\uf3a6\uaa46\udc56\ubf48\ub2e7"));
            arrstring[1] = WPHK$2.QK(mrFx$WjFM.d("\u374a\u36a9\ub869\uec0e\u41a3\u534a\ua591\u5d94\u62cb\ud333\u2d66\u2df4\u4d89\u3001\uf405\u7fae\ueb65\ua25e\uabbc\ufb4a\u7b92\uf3ce\uc357\ua10d\ud3f8\u7e4f\ufa75\u0ab1\u6d1d\ufeea\uff60\uf964\uf79a\uc52c\uf3ff\uaa53\udc5d\ubf47\ub2e9"));
            WPHK$2.QK((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(871061494)), arrstring));
            return;
        }
        String[] arrstring = new String[2];
        arrstring[0] = WPHK$2.QK(mrFx$WjFM.d("\u374a\u36a9\ub869\uec0e\u41a3\u534a\ua591\u5d94\u62cb\ud333\u2d66\u2df4\u4d89\u3001\uf405\u7fae\ueb65\ua25e\uabbc\ufb4a\u7b92\uf3ce\uc357\ua10d\ud3f8\u7e4f\ufa75\u0ab1\u6d1e\ufee0\uff75\uf964\uf796\uc530\uf3b5\uaa0a\udc47\ubf50\ub2e3\ub85d\u38f6\u892d"));
        arrstring[1] = WPHK$2.QK(mrFx$WjFM.d("\u374a\u36a9\ub869\uec0e\u41a3\u534a\ua591\u5d94\u62cb\ud333\u2d66\u2df4\u4d89\u3001\uf405\u7fae\ueb65\ua25e\uabbc\ufb4a\u7b92\uf3ce\uc357\ua10d\ud3f8\u7e4f\ufa75\u0ab1\u6d1d\ufeea\uff60\uf964\uf79a\uc52c\uf3ff\uaa53\udc5d\ubf47\ub2e9"));
        WPHK$2.QK((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(1411405812)), arrstring));
    }

    private static Object QK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

