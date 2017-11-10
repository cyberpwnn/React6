/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class vsgm$4
extends QFCu {
    final /* synthetic */ WFnH vbqV;
    final /* synthetic */ Ralc WhyT;
    final /* synthetic */ Ralc IqSO;
    final /* synthetic */ vsgm nlYH;

    vsgm$4(vsgm vsgm2, String string, int n, WFnH wFnH, Ralc ralc, Ralc ralc2) {
        this.nlYH = vsgm2;
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
        if (vsgm$4.Rw() - vsgm$4.Rw((vsgm)yy.h(this, 199289434)) <= 100) return;
        if (vsgm$4.Rw(vsgm$4.Rw((vsgm)yy.h(this, 199289434)), (SCOk)yy.p(-1947211227)) == false) return;
        this.cancel();
        vsgm$4.Rw((vsgm)yy.h(this, 199289434));
        if (vsgm$4.Rw((Ralc)yy.h(this, -1099175335)) > true) ** GOTO lbl-1000
        if (vsgm$4.Rw((Ralc)yy.h(this, -1099175335)) == false) lbl-1000: // 2 sources:
        {
            v0 = NVIs$JbpD.H("\u1a59");
        } else {
            v0 = "";
        }
        ((WFnH)yy.h(this, 1118038563)).wnXH((String)vsgm$4.Rw(vsgm$4.Rw(vsgm$4.Rw(vsgm$4.Rw(vsgm$4.Rw(vsgm$4.Rw(new StringBuilder(NVIs$JbpD.H("\u1a69\u98b1\ub542\uc93d\u2f5b\uea12\uacad")), vsgm$4.Rw(vsgm$4.Rw((Ralc)yy.h(this, -1833768412)))), NVIs$JbpD.H("\u1a0a\u98a1\ub540\uc925\u2f57\uea02\uace4\u3b30\u8f87\u2793\ub1f7\ueeef\u161c")), vsgm$4.Rw(vsgm$4.Rw((Ralc)yy.h(this, -1099175335)))), NVIs$JbpD.H("\u1a0a\u98a7\ub546\uc924\u2f50\uea1d")), v0)));
    }

    private static Object Rw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

