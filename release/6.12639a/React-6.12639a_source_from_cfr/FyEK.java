/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class FyEK
extends ggmf {
    private DaUw skdF;
    private boolean BSeD;
    private int htEq;

    @Override
    public void start() {
        o.v(this, -620865282, Integer.MIN_VALUE);
        o.v(this, 1210276093, false);
        o.v(this, -1358997252, null);
        new FyEK$1(this, mrFx$WjFM.d("\ub5b4\u0f7e\ucadc\uee3f\u5ffd\u6896\u5049\u5db0\uacf8\ua452\uf4d4"), 40);
    }

    @Override
    public void stop() {
        if (FyEK.De((DaUw)o.a(this, -1358997252)) != false) {
            FyEK.De((DaUw)o.a(this, -1358997252));
        }
    }

    @Override
    public void tick() {
        if (((Boolean)o.a(this, 1210276093)).booleanValue() && (Integer)o.a(this, -620865282) == Integer.MIN_VALUE) {
            o.v(this, -620865282, (int)FyEK.De(FyEK.De((DaUw)o.a(this, -1358997252))));
            FyEK.De(FyEK.De(FyEK.De(FyEK.De(FyEK.De(FyEK.De(new StringBuilder((String)FyEK.De(FyEK.De(nJPf$sILv.G("\u58ad\u3335\uaae3\uc6d1\u787a\u75d9\ubb68\u462c\u0567\u1ed5\uc023\u7c23\udbb8\u057d\ud42a\u88ea\uce8e\u09c4\u6c74\ua032\u67ce\u2635\ue69d\u3993\ucc34\u3649")))), (Integer)o.a(this, -620865282)), nJPf$sILv.G("\u58ee\u3372")), FyEK.De(FyEK.De((Integer)o.a(this, -620865282)))), nJPf$sILv.G("\u58e7"))));
        }
    }

    static /* synthetic */ void yJLS(FyEK fyEK, boolean bl) {
        o.v(fyEK, 1210276093, bl);
    }

    static /* synthetic */ void yJLS(FyEK fyEK, DaUw daUw) {
        o.v(fyEK, -1358997252, daUw);
    }

    static /* synthetic */ DaUw yJLS(FyEK fyEK) {
        return (DaUw)o.a(fyEK, -1358997252);
    }

    private static Object De(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

