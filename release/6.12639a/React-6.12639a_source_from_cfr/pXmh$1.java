/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class pXmh$1
extends xGOy {
    final /* synthetic */ pXmh etLP;

    pXmh$1(pXmh pXmh2) {
        this.etLP = pXmh2;
    }

    @Override
    public void run() {
        if (pXmh$1.cF((pXmh)o.a(this, 1729648445)) != false) {
            String[] arrstring = new String[2];
            arrstring[0] = pXmh$1.cF(mrFx$WjFM.d("\ubd47\uab3c\u7175\ucad2\ue579\u9513\u9f27\u02ee\u2f70\u905e\uaffd\uce48\ub000\ufed9\udd2d\uce38\ubcbb\u99c9\u14cf\uc557\u5073\u2466\uad46\u04da\ucd03\u6682\u516e\u7995\u1e3c\u991a\u16f4\u43b8\u9bee\u8f86\u7178\u4124"));
            arrstring[1] = pXmh$1.cF(mrFx$WjFM.d("\ubd47\uab3c\u7175\ucad2\ue579\u9513\u9f27\u02ee\u2f70\u905e\uaffd\uce48\ub000\ufed9\udd2d\uce38\ubcbb\u99c9\u14cf\uc557\u5073\u2479\uad53\u04cc"));
            pXmh$1.cF((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(871061494)), arrstring));
            return;
        }
        String[] arrstring = new String[2];
        arrstring[0] = pXmh$1.cF(mrFx$WjFM.d("\ubd47\uab3c\u7175\ucad2\ue579\u9513\u9f27\u02ee\u2f70\u905e\uaffd\uce48\ub000\ufed9\udd2d\uce38\ubcbb\u99c9\u14cf\uc557\u5073\u2466\uad46\u04da\ucd03\u66c6\u5173\u7986\u1e70\u990b\u16ec\u43bc\u9ba1\u8f9e\u716d"));
        arrstring[1] = pXmh$1.cF(mrFx$WjFM.d("\ubd47\uab3c\u7175\ucad2\ue579\u9513\u9f27\u02ee\u2f70\u905e\uaffd\uce48\ub000\ufed9\udd2d\uce38\ubcbb\u99c9\u14cf\uc557\u5073\u2479\uad53\u04cc"));
        pXmh$1.cF((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(1411405812)), arrstring));
    }

    private static Object cF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

