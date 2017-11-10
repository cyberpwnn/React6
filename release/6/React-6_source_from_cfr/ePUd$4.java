/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class ePUd$4
extends QFCu {
    final /* synthetic */ WFnH vbqV;
    final /* synthetic */ Ralc WhyT;
    final /* synthetic */ Ralc IqSO;
    final /* synthetic */ ePUd cBHm;

    ePUd$4(ePUd ePUd2, String string, int n, WFnH wFnH, Ralc ralc, Ralc ralc2) {
        this.cBHm = ePUd2;
        this.vbqV = wFnH;
        this.WhyT = ralc;
        this.IqSO = ralc2;
        super(string, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        if (ePUd$4.pr() - ePUd$4.pr((ePUd)yy.h(this, 568060295)) <= 100) return;
        if (ePUd$4.pr(ePUd$4.pr((ePUd)yy.h(this, 568060295)), (SCOk)yy.p(-1947211227)) == false) return;
        this.cancel();
        ePUd$4.pr((ePUd)yy.h(this, 568060295));
        if (ePUd$4.pr((Ralc)yy.h(this, 326494620)) > true) ** GOTO lbl-1000
        if (ePUd$4.pr((Ralc)yy.h(this, 326494620)) == false) lbl-1000: // 2 sources:
        {
            v0 = BkvY$LhxG.I("\u7c10");
        } else {
            v0 = "";
        }
        ((WFnH)yy.h(this, -1819874922)).wnXH((String)ePUd$4.pr(ePUd$4.pr(ePUd$4.pr(ePUd$4.pr(ePUd$4.pr(ePUd$4.pr(new StringBuilder(BkvY$LhxG.I("\u7c33\u1e43\u1e9d\u77c9\u6375\uf6d6\ucaf3")), ePUd$4.pr(ePUd$4.pr((Ralc)yy.h(this, 547613083)))), BkvY$LhxG.I("\u7c43\u1e53\u1e81\u77da\u6379\uf6c6\ucaba\u54d1\ue735\u6b77\u1b06\u0acc\uc5c6")), ePUd$4.pr(ePUd$4.pr((Ralc)yy.h(this, 326494620)))), BkvY$LhxG.I("\u7c43\u1e55\u1e87\u77db\u637e\uf6d9")), v0)));
    }

    private static Object pr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

