/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class nJLQ$3
extends gyID {
    final /* synthetic */ ftyu aLcY;
    final /* synthetic */ TFYr byyi;
    final /* synthetic */ nJLQ kkcI;

    nJLQ$3(nJLQ nJLQ2, String string, int n, ftyu ftyu2, TFYr tFYr) {
        this.kkcI = nJLQ2;
        this.aLcY = ftyu2;
        this.byyi = tFYr;
        super(string, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        if (nJLQ$3.XL() - nJLQ$3.XL((nJLQ)cv.b(this, 1678577377)) <= 1000) return;
        if (nJLQ$3.XL(nJLQ$3.XL((nJLQ)cv.b(this, 1678577377)), (kQcX)cv.e(-747106030)) == false) return;
        this.cancel();
        nJLQ$3.XL((nJLQ)cv.b(this, 1678577377));
        if (nJLQ$3.XL((TFYr)cv.b(this, -1876226323)) > true) ** GOTO lbl-1000
        if (nJLQ$3.XL((TFYr)cv.b(this, -1876226323)) == false) lbl-1000: // 2 sources:
        {
            v0 = rgig$AWxc.r("\u8125");
        } else {
            v0 = "";
        }
        ((ftyu)cv.b(this, 140709602)).IWSm((String)nJLQ$3.XL(nJLQ$3.XL(nJLQ$3.XL(nJLQ$3.XL(new StringBuilder(rgig$AWxc.r("\u8106\u9e12\ua91c\uf83d\u37be\ucec7\ue025")), nJLQ$3.XL(nJLQ$3.XL((TFYr)cv.b(this, -1876226323)))), rgig$AWxc.r("\u8176\u9e04\ua906\uf82f\u37b5\ucec8")), v0)));
    }

    private static Object XL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

