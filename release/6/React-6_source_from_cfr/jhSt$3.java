/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class jhSt$3
implements Runnable {
    final /* synthetic */ jhSt BAjC;
    private final /* synthetic */ TFYr byyi;
    private final /* synthetic */ TFYr UtUW;
    private final /* synthetic */ TFYr DYRf;
    private final /* synthetic */ TFYr FyLC;
    private final /* synthetic */ ftyu aLcY;

    jhSt$3(jhSt jhSt2, TFYr tFYr, TFYr tFYr2, TFYr tFYr3, TFYr tFYr4, ftyu ftyu2) {
        this.BAjC = jhSt2;
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
        jhSt$3.ih((TFYr)cv.b(this, -1086254790), true);
        var1_1 = (String)cv.e(-1189998300);
        jhSt$3.ih((jhSt)cv.b(this, -616820441), (Object)jhSt$3.ih((TFYr)cv.b(this, -1086254790)) / (Object)jhSt$3.ih((TFYr)cv.b(this, -1955065567)));
        var1_1 = jhSt$3.ih(var1_1, KUXS$dwji.S("\u0127\u2945"), jhSt$3.ih(jhSt$3.ih((TFYr)cv.b(this, -1086254790))));
        var1_1 = jhSt$3.ih(var1_1, KUXS$dwji.S("\u0127\u2952"), jhSt$3.ih(jhSt$3.ih((TFYr)cv.b(this, -1955065567))));
        var1_1 = jhSt$3.ih(var1_1, KUXS$dwji.S("\u0127\u2956"), jhSt$3.ih(jhSt$3.ih((jhSt)cv.b(this, -616820441)), false));
        jhSt$3.ih((jhSt)cv.b(this, -616820441), var1_1);
        jhSt$3.ih((jhSt)cv.b(this, -616820441), jhSt$3.ih());
        jhSt$3.ih((TFYr)cv.b(this, -1382280920), jhSt$3.ih((jhSt)cv.b(this, -616820441)));
        if (jhSt$3.ih((jhSt)cv.b(this, -616820441)) > 0) {
            jhSt$3.ih((TFYr)cv.b(this, 1038946602), true);
        }
        if (jhSt$3.ih((TFYr)cv.b(this, -1086254790)) != jhSt$3.ih((TFYr)cv.b(this, -1955065567))) return;
        jhSt$3.ih((jhSt)cv.b(this, -616820441));
        if (jhSt$3.ih((TFYr)cv.b(this, 1038946602)) > true) ** GOTO lbl-1000
        if (jhSt$3.ih((TFYr)cv.b(this, 1038946602)) == false) lbl-1000: // 2 sources:
        {
            v0 = KUXS$dwji.S("\u0170");
        } else {
            v0 = "";
        }
        ((ftyu)cv.b(this, 660345108)).IWSm((String)jhSt$3.ih(jhSt$3.ih(jhSt$3.ih(jhSt$3.ih(jhSt$3.ih(jhSt$3.ih(new StringBuilder(KUXS$dwji.S("\u0140\u2953\ue3e8\u1adc\u5ccc\ub002\u226c")), jhSt$3.ih(jhSt$3.ih((TFYr)cv.b(this, -1382280920)))), KUXS$dwji.S("\u0123\u2943\ue3ea\u1ac4\u5cc0\ub012\u2225\uda85\ue86f\ufeb6\u4f5d\u9249\ue7a0")), jhSt$3.ih(jhSt$3.ih((TFYr)cv.b(this, 1038946602)))), KUXS$dwji.S("\u0123\u2945\ue3ec\u1ac5\u5cc7\ub00d")), v0)));
    }

    private static Object ih(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

