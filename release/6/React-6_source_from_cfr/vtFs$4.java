/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class vtFs$4
extends gyID {
    final /* synthetic */ ftyu aLcY;
    final /* synthetic */ TFYr DYRf;
    final /* synthetic */ TFYr FyLC;
    final /* synthetic */ vtFs fKRe;

    vtFs$4(vtFs vtFs2, String string, int n, ftyu ftyu2, TFYr tFYr, TFYr tFYr2) {
        this.fKRe = vtFs2;
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
        if (vtFs$4.tJ() - vtFs$4.tJ((vtFs)cv.b(this, -207810280)) <= 100) return;
        if (vtFs$4.tJ(vtFs$4.tJ((vtFs)cv.b(this, -207810280)), (kQcX)cv.e(-747106030)) == false) return;
        this.cancel();
        vtFs$4.tJ((vtFs)cv.b(this, -207810280));
        if (vtFs$4.tJ((TFYr)cv.b(this, 1228148999)) > true) ** GOTO lbl-1000
        if (vtFs$4.tJ((TFYr)cv.b(this, 1228148999)) == false) lbl-1000: // 2 sources:
        {
            v0 = YEBy$TyVf.W("\u9046");
        } else {
            v0 = "";
        }
        ((ftyu)cv.b(this, -1203629819)).IWSm((String)vtFs$4.tJ(vtFs$4.tJ(vtFs$4.tJ(vtFs$4.tJ(vtFs$4.tJ(vtFs$4.tJ(new StringBuilder(YEBy$TyVf.W("\u9065\u9f28\ubb26\u6007\u9c5e\ub4d7\ud9cb")), vtFs$4.tJ(vtFs$4.tJ((TFYr)cv.b(this, -2000088828)))), YEBy$TyVf.W("\u9015\u9f38\ubb3a\u6014\u9c52\ub4c7\ud982\ub07e\u46d6\uf649\u890d\u6d86\u0e35")), vtFs$4.tJ(vtFs$4.tJ((TFYr)cv.b(this, 1228148999)))), YEBy$TyVf.W("\u9015\u9f3e\ubb3c\u6015\u9c55\ub4d8")), v0)));
    }

    private static Object tJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

