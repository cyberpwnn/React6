/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class pGhD<T, B>
implements iBsQ<T, B> {
    private eHVp XueI;
    private Class<? extends B> bjQO;

    public pGhD(eHVp eHVp2, Class<? extends B> class_) {
        this.XueI = eHVp2;
        this.bjQO = class_;
    }

    @Override
    public void yJLS(int n, String string, String string2, T t) {
        this.yJLS(n, string, t);
        pGhD.Uj(string2, (Class)o.a(this, 1891652388), this.get(string));
    }

    @Override
    public void eYJe() {
        if (pGhD.Uj((TNku)o.k(278287122), pGhD.Uj(87)) == null) {
            pGhD.Uj(pGhD.Uj(pGhD.Uj(new StringBuilder(FMkR$WjFM.a("\u1208\u1627\u0c40\u7ecc\ua4de\u7b71\u4035\ueda6\u2fa4\uc9d4\ua632\u527a\u9f9d\u8c70\u5e7b\uadc1\ube3f\u8c4f\uff3b\ueb93\u3a16\ub646\u36a6\u5b40")), pGhD.Uj(this.IEpg()))));
            return;
        }
        Object object = pGhD.Uj((feCR)pGhD.Uj((TNku)o.k(278287122), pGhD.Uj(87)));
        while (object.hasNext()) {
            Object object2;
            Class class_ = (Class)object.next();
            if (pGhD.Uj(vHyF.class, class_) == false) continue;
            try {
                object2 = (vHyF)pGhD.Uj(class_);
                if (pGhD.Uj(object2.uFVW(), this.IEpg()) == false) continue;
                pGhD.Uj(pGhD.Uj(pGhD.Uj(pGhD.Uj(pGhD.Uj(pGhD.Uj(pGhD.Uj(new StringBuilder(FMkR$WjFM.a("\u120f\u1626\u0c0a\u7ecb\ua4d1\u7b6a\u4033\ueda9\u2fa4\uc9ff\ua610\u525f\u9fbb\u8c58\u5e35\uad88")), object2.iBsQ()), FMkR$WjFM.a("\u1266\u1674\u0c5e\u7e8e")), pGhD.Uj(object2.uFVW())), FMkR$WjFM.a("\u1266\u1672\u0c5a\u7e8e")), object2.dDeO())));
                this.yJLS(object2.iBsQ(), object2.dDeO(), object2.pGhD(), object2);
            }
            catch (Exception exception) {
                object2 = exception;
                pGhD.Uj(exception);
            }
        }
    }

    @Override
    public eHVp IEpg() {
        return (eHVp)((Object)o.a(this, -1971563764));
    }

    private static Object Uj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

