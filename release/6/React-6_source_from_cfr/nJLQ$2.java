/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class nJLQ$2
implements Runnable {
    final /* synthetic */ TFYr byyi;
    final /* synthetic */ TFYr UtUW;
    final /* synthetic */ TFYr DYRf;
    final /* synthetic */ TFYr FyLC;
    final /* synthetic */ ftyu aLcY;
    final /* synthetic */ nJLQ kkcI;

    nJLQ$2(nJLQ nJLQ2, TFYr tFYr, TFYr tFYr2, TFYr tFYr3, TFYr tFYr4, ftyu ftyu2) {
        this.kkcI = nJLQ2;
        this.byyi = tFYr;
        this.UtUW = tFYr2;
        this.DYRf = tFYr3;
        this.FyLC = tFYr4;
        this.aLcY = ftyu2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        nJLQ$2.Oh((TFYr)cv.b(this, -1333849806), true);
        var1_1 = (String)cv.e(1423053117);
        nJLQ$2.Oh((nJLQ)cv.b(this, 1699942716), (Object)nJLQ$2.Oh((TFYr)cv.b(this, -1333849806)) / (Object)nJLQ$2.Oh((TFYr)cv.b(this, 1990725951)));
        var1_1 = nJLQ$2.Oh(var1_1, YEBy$TyVf.W("\uc362\ua013"), nJLQ$2.Oh(nJLQ$2.Oh((TFYr)cv.b(this, -1333849806))));
        var1_1 = nJLQ$2.Oh(var1_1, YEBy$TyVf.W("\uc362\ua004"), nJLQ$2.Oh(nJLQ$2.Oh((TFYr)cv.b(this, 1990725951))));
        var1_1 = nJLQ$2.Oh(var1_1, YEBy$TyVf.W("\uc362\ua000"), nJLQ$2.Oh(nJLQ$2.Oh((nJLQ)cv.b(this, 1699942716)), false));
        nJLQ$2.Oh((nJLQ)cv.b(this, 1699942716), var1_1);
        nJLQ$2.Oh((nJLQ)cv.b(this, 1699942716), nJLQ$2.Oh());
        nJLQ$2.Oh((TFYr)cv.b(this, -2118054150), nJLQ$2.Oh((nJLQ)cv.b(this, 1699942716)));
        if (nJLQ$2.Oh((nJLQ)cv.b(this, 1699942716)) > 0) {
            nJLQ$2.Oh((TFYr)cv.b(this, 1555238628), true);
        }
        if (nJLQ$2.Oh((TFYr)cv.b(this, -1333849806)) != nJLQ$2.Oh((TFYr)cv.b(this, 1990725951))) return;
        nJLQ$2.Oh((nJLQ)cv.b(this, 1699942716));
        if (nJLQ$2.Oh((TFYr)cv.b(this, -1333849806)) > true) ** GOTO lbl-1000
        if (nJLQ$2.Oh((TFYr)cv.b(this, -1333849806)) == false) lbl-1000: // 2 sources:
        {
            v0 = YEBy$TyVf.W("\uc335");
        } else {
            v0 = "";
        }
        ((ftyu)cv.b(this, -1045491994)).IWSm((String)nJLQ$2.Oh(nJLQ$2.Oh(nJLQ$2.Oh(nJLQ$2.Oh(new StringBuilder(YEBy$TyVf.W("\uc316\ua005\ucbd9\ud161\u8e69\ud48c\u122a")), nJLQ$2.Oh(nJLQ$2.Oh((TFYr)cv.b(this, -1333849806)))), YEBy$TyVf.W("\uc366\ua013\ucbc3\ud173\u8e62\ud483")), v0)));
    }

    private static Object Oh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

