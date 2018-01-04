/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class KTiK$1$1
extends xGOy {
    final /* synthetic */ KTiK$1 cAqI;
    private final /* synthetic */ long WaQx;
    private final /* synthetic */ long YEUY;
    private final /* synthetic */ xynF gFNH;

    KTiK$1$1(KTiK$1 var1_1, long l, long l2, xynF xynF2) {
        this.cAqI = var1_1;
        this.WaQx = l;
        this.YEUY = l2;
        this.gFNH = xynF2;
    }

    @Override
    public void run() {
        long l = (Long)o.a(this, 1938965520) - (Long)o.a(this, 1983136783);
        if (l > 0) {
            ((xynF)o.a(this, 1317356558)).biLo((String)KTiK$1$1.Jb(KTiK$1$1.Jb(KTiK$1$1.Jb(new StringBuilder(mrFx$WjFM.d("\uebdb\uf0e8\u5d3b\u5d5c\uc219\ub9ef\u596e\ud765\u79fd\u8580")), KTiK$1$1.Jb(l)), mrFx$WjFM.d("\uebb8\uf0e8\u5d31\u5d10\uc21b\ub9ed\u5968\ud762\u79f8\u85c7\ufeb7\ub2ce"))));
        } else {
            ((xynF)o.a(this, 1317356558)).VwLY(mrFx$WjFM.d("\uebdb\uf0e8\u5d22\u5d5c\uc218\ub9ac\u5974\ud76f\u79ed\u8580\ufeb4\ub292\udb00\uab0d\u03ab\uca65\u3013\uebc6\u9099\ufcbf\u241c\u8304\u4fd0\uc71a\u45d8\ud3af\u4b53\uc95e\ub3b3\ud10a\u8e3b\ub19c\u72a0\ue20a\u6e50\u405e\u9a63\u7905\u1543\uc73d\uab4b\u8da2\uf391\u92a6\u4415"));
        }
        KTiK$1$1.Jb(KTiK$1$1.Jb((KTiK$1)o.a(this, 1306215450)));
    }

    private static Object Jb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

