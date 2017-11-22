/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class jhSt$4
extends gyID {
    final /* synthetic */ jhSt BAjC;
    private final /* synthetic */ ftyu aLcY;
    private final /* synthetic */ TFYr DYRf;
    private final /* synthetic */ TFYr FyLC;

    jhSt$4(jhSt jhSt2, String string, int n, ftyu ftyu2, TFYr tFYr, TFYr tFYr2) {
        this.BAjC = jhSt2;
        this.aLcY = ftyu2;
        this.DYRf = tFYr;
        this.FyLC = tFYr2;
        super(string, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        if (jhSt$4.gA() - jhSt$4.gA((jhSt)cv.b(this, 1203376401)) <= 100) return;
        if (jhSt$4.gA(jhSt$4.gA((jhSt)cv.b(this, 1203376401)), (kQcX)cv.e(-747106030)) == false) return;
        this.cancel();
        jhSt$4.gA((jhSt)cv.b(this, 1203376401));
        if (jhSt$4.gA((TFYr)cv.b(this, 763891998)) > true) ** GOTO lbl-1000
        if (jhSt$4.gA((TFYr)cv.b(this, 763891998)) == false) lbl-1000: // 2 sources:
        {
            v0 = rgig$AWxc.r("\u85d7");
        } else {
            v0 = "";
        }
        ((ftyu)cv.b(this, 206377244)).IWSm((String)jhSt$4.gA(jhSt$4.gA(jhSt$4.gA(jhSt$4.gA(jhSt$4.gA(jhSt$4.gA(new StringBuilder(rgig$AWxc.r("\u85e7\u1c01\udc1e\u5e68\uf827\ufc05\u92d6")), jhSt$4.gA(jhSt$4.gA((TFYr)cv.b(this, -1597239009)))), rgig$AWxc.r("\u8584\u1c11\udc1c\u5e70\uf82b\ufc15\u929f\u6720\u2c0f\u6476\ua2af\u94e8\u5278")), jhSt$4.gA(jhSt$4.gA((TFYr)cv.b(this, 763891998)))), rgig$AWxc.r("\u8584\u1c17\udc1a\u5e71\uf82c\ufc0a")), v0)));
    }

    private static Object gA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

