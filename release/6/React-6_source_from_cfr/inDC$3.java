/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class inDC$3
extends QFCu {
    final /* synthetic */ WFnH vbqV;
    final /* synthetic */ Ralc nBIE;
    final /* synthetic */ inDC YpAW;

    inDC$3(inDC inDC2, String string, int n, WFnH wFnH, Ralc ralc) {
        this.YpAW = inDC2;
        this.vbqV = wFnH;
        this.nBIE = ralc;
        super(string, n);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        if (inDC$3.Pj() - inDC$3.Pj((inDC)yy.h(this, -12129670)) <= 1000) return;
        if (inDC$3.Pj(inDC$3.Pj((inDC)yy.h(this, -12129670)), (SCOk)yy.p(-1947211227)) == false) return;
        this.cancel();
        inDC$3.Pj((inDC)yy.h(this, -12129670));
        if (inDC$3.Pj((Ralc)yy.h(this, 1517087294)) > true) ** GOTO lbl-1000
        if (inDC$3.Pj((Ralc)yy.h(this, 1517087294)) == false) lbl-1000: // 2 sources:
        {
            v0 = NVIs$JbpD.H("\u8d28");
        } else {
            v0 = "";
        }
        ((WFnH)yy.h(this, -1778783675)).wnXH((String)inDC$3.Pj(inDC$3.Pj(inDC$3.Pj(inDC$3.Pj(new StringBuilder(NVIs$JbpD.H("\u8d0b\ua998\u638c\u9c39\u8a22\u47e0\u8fb7")), inDC$3.Pj(inDC$3.Pj((Ralc)yy.h(this, 1517087294)))), NVIs$JbpD.H("\u8d7b\ua98e\u6396\u9c2b\u8a29\u47ef")), v0)));
    }

    private static Object Pj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

