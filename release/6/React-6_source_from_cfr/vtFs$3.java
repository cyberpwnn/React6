/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class vtFs$3
implements Runnable {
    final /* synthetic */ TFYr byyi;
    final /* synthetic */ TFYr UtUW;
    final /* synthetic */ TFYr DYRf;
    final /* synthetic */ TFYr FyLC;
    final /* synthetic */ ftyu aLcY;
    final /* synthetic */ vtFs fKRe;

    vtFs$3(vtFs vtFs2, TFYr tFYr, TFYr tFYr2, TFYr tFYr3, TFYr tFYr4, ftyu ftyu2) {
        this.fKRe = vtFs2;
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
        vtFs$3.On((TFYr)cv.b(this, -1263333675), true);
        var1_1 = (String)cv.e(488050388);
        vtFs$3.On((vtFs)cv.b(this, -466743593), (Object)vtFs$3.On((TFYr)cv.b(this, -1263333675)) / (Object)vtFs$3.On((TFYr)cv.b(this, -134672682)));
        var1_1 = vtFs$3.On(var1_1, rgig$AWxc.r("\ud0d4\ub00f"), vtFs$3.On(vtFs$3.On((TFYr)cv.b(this, -1263333675))));
        var1_1 = vtFs$3.On(var1_1, rgig$AWxc.r("\ud0d4\ub018"), vtFs$3.On(vtFs$3.On((TFYr)cv.b(this, -134672682))));
        var1_1 = vtFs$3.On(var1_1, rgig$AWxc.r("\ud0d4\ub01c"), vtFs$3.On(vtFs$3.On((vtFs)cv.b(this, -466743593)), false));
        vtFs$3.On((vtFs)cv.b(this, -466743593), var1_1);
        vtFs$3.On((vtFs)cv.b(this, -466743593), vtFs$3.On());
        vtFs$3.On((TFYr)cv.b(this, 1684672221), vtFs$3.On((vtFs)cv.b(this, -466743593)));
        if (vtFs$3.On((vtFs)cv.b(this, -466743593)) > 0) {
            vtFs$3.On((TFYr)cv.b(this, -1993994529), true);
        }
        if (vtFs$3.On((TFYr)cv.b(this, -1263333675)) != vtFs$3.On((TFYr)cv.b(this, -134672682))) return;
        vtFs$3.On((vtFs)cv.b(this, -466743593));
        if (vtFs$3.On((TFYr)cv.b(this, -1993994529)) > true) ** GOTO lbl-1000
        if (vtFs$3.On((TFYr)cv.b(this, -1993994529)) == false) lbl-1000: // 2 sources:
        {
            v0 = rgig$AWxc.r("\ud083");
        } else {
            v0 = "";
        }
        ((ftyu)cv.b(this, 631377625)).IWSm((String)vtFs$3.On(vtFs$3.On(vtFs$3.On(vtFs$3.On(vtFs$3.On(vtFs$3.On(new StringBuilder(rgig$AWxc.r("\ud0a0\ub019\ucf06\u6e12\ude7f\u6734\u2307")), vtFs$3.On(vtFs$3.On((TFYr)cv.b(this, 1684672221)))), rgig$AWxc.r("\ud0d0\ub009\ucf1a\u6e01\ude73\u6724\u234e\u6fe7\u2118\u50b7\u2230\ueda9\u3255")), vtFs$3.On(vtFs$3.On((TFYr)cv.b(this, -1993994529)))), rgig$AWxc.r("\ud0d0\ub00f\ucf1c\u6e00\ude74\u673b")), v0)));
    }

    private static Object On(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

