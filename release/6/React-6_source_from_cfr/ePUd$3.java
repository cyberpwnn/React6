/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class ePUd$3
implements Runnable {
    final /* synthetic */ Ralc nBIE;
    final /* synthetic */ Ralc fuej;
    final /* synthetic */ Ralc WhyT;
    final /* synthetic */ Ralc IqSO;
    final /* synthetic */ WFnH vbqV;
    final /* synthetic */ ePUd cBHm;

    ePUd$3(ePUd ePUd2, Ralc ralc, Ralc ralc2, Ralc ralc3, Ralc ralc4, WFnH wFnH) {
        this.cBHm = ePUd2;
        this.nBIE = ralc;
        this.fuej = ralc2;
        this.WhyT = ralc3;
        this.IqSO = ralc4;
        this.vbqV = wFnH;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        ePUd$3.gT((Ralc)yy.h(this, -614274490), true);
        var1_1 = (String)yy.p(-2022053301);
        ePUd$3.gT((ePUd)yy.h(this, -615912884), (Object)ePUd$3.gT((Ralc)yy.h(this, -614274490)) / (Object)ePUd$3.gT((Ralc)yy.h(this, -709629375)));
        var1_1 = ePUd$3.gT(var1_1, NVIs$JbpD.H("\ua330\uc0c1"), ePUd$3.gT(ePUd$3.gT((Ralc)yy.h(this, -614274490))));
        var1_1 = ePUd$3.gT(var1_1, NVIs$JbpD.H("\ua330\uc0d6"), ePUd$3.gT(ePUd$3.gT((Ralc)yy.h(this, -709629375))));
        var1_1 = ePUd$3.gT(var1_1, NVIs$JbpD.H("\ua330\uc0d2"), ePUd$3.gT(ePUd$3.gT((ePUd)yy.h(this, -615912884)), false));
        ePUd$3.gT((ePUd)yy.h(this, -615912884), var1_1);
        ePUd$3.gT((ePUd)yy.h(this, -615912884), ePUd$3.gT());
        ePUd$3.gT((Ralc)yy.h(this, 302770574), ePUd$3.gT((ePUd)yy.h(this, -615912884)));
        if (ePUd$3.gT((ePUd)yy.h(this, -615912884)) > 0) {
            ePUd$3.gT((Ralc)yy.h(this, -1224939116), true);
        }
        if (ePUd$3.gT((Ralc)yy.h(this, -614274490)) != ePUd$3.gT((Ralc)yy.h(this, -709629375))) return;
        ePUd$3.gT((ePUd)yy.h(this, -615912884));
        if (ePUd$3.gT((Ralc)yy.h(this, -1224939116)) > true) ** GOTO lbl-1000
        if (ePUd$3.gT((Ralc)yy.h(this, -1224939116)) == false) lbl-1000: // 2 sources:
        {
            v0 = NVIs$JbpD.H("\ua367");
        } else {
            v0 = "";
        }
        ((WFnH)yy.h(this, -1093670510)).wnXH((String)ePUd$3.gT(ePUd$3.gT(ePUd$3.gT(ePUd$3.gT(ePUd$3.gT(ePUd$3.gT(new StringBuilder(NVIs$JbpD.H("\ua344\uc0d7\u6aa2\u5232\u7fb9\u8a03\ueddf")), ePUd$3.gT(ePUd$3.gT((Ralc)yy.h(this, 302770574)))), NVIs$JbpD.H("\ua334\uc0c7\u6abe\u5221\u7fb5\u8a13\ued96\uea19\u32e7\u6139\u6b8d\u8630\u45a0")), ePUd$3.gT(ePUd$3.gT((Ralc)yy.h(this, -1224939116)))), NVIs$JbpD.H("\ua334\uc0c1\u6ab8\u5220\u7fb2\u8a0c")), v0)));
    }

    private static Object gT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

