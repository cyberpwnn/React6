/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class MSHX$3$1
extends Thread {
    final /* synthetic */ MSHX$3 PnPx;

    MSHX$3$1(MSHX$3 mSHX$3) {
        this.PnPx = mSHX$3;
    }

    @Override
    public void run() {
        MSHX$3$1.oC(mrFx$WjFM.d("\u0946\ua30a\u51ab\u4719\u8c4b\uebbe\u1479\uaf73\uc762\ud7bb\u278b\uf9b6\u9fa7\u2e26\u85ae\ufd77\uc0d3\u82d3\u8a93\ua3da\ubec1\uab0e\u4635\u13b3\ufa63\ub097\u24c9\u114a\uc641\ua686\ufc84\u063d\u77fa\u0218\u8058\u5af2"));
        MSHX$3$1.oC((Lqeo)o.k(-382707289));
        new MSHX$3$1$1(this, mrFx$WjFM.d("\u0943\ua30e\u51ae\u4702\u8c43\uebb4\u143e\uaf24\uc777\ud7bd\u27df\uf9b2\u9fa5"), 20);
    }

    private static Object oC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

