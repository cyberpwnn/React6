/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class vsgm$3
implements Runnable {
    final /* synthetic */ Ralc nBIE;
    final /* synthetic */ Ralc fuej;
    final /* synthetic */ Ralc WhyT;
    final /* synthetic */ Ralc IqSO;
    final /* synthetic */ WFnH vbqV;
    final /* synthetic */ vsgm nlYH;

    vsgm$3(vsgm vsgm2, Ralc ralc, Ralc ralc2, Ralc ralc3, Ralc ralc4, WFnH wFnH) {
        this.nlYH = vsgm2;
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
        vsgm$3.rm((Ralc)yy.h(this, 320662029), true);
        var1_1 = (String)yy.p(-472520181);
        vsgm$3.rm((vsgm)yy.h(this, -1379800564), (Object)vsgm$3.rm((Ralc)yy.h(this, 320662029)) / (Object)vsgm$3.rm((Ralc)yy.h(this, 982379018)));
        var1_1 = vsgm$3.rm(var1_1, KDGY$JAHk.Y("\ufd8f\uac6d"), vsgm$3.rm(vsgm$3.rm((Ralc)yy.h(this, 320662029))));
        var1_1 = vsgm$3.rm(var1_1, KDGY$JAHk.Y("\ufd8f\uac7a"), vsgm$3.rm(vsgm$3.rm((Ralc)yy.h(this, 982379018))));
        var1_1 = vsgm$3.rm(var1_1, KDGY$JAHk.Y("\ufd8f\uac7e"), vsgm$3.rm(vsgm$3.rm((vsgm)yy.h(this, -1379800564)), false));
        vsgm$3.rm((vsgm)yy.h(this, -1379800564), var1_1);
        vsgm$3.rm((vsgm)yy.h(this, -1379800564), vsgm$3.rm());
        vsgm$3.rm((Ralc)yy.h(this, 269478471), vsgm$3.rm((vsgm)yy.h(this, -1379800564)));
        if (vsgm$3.rm((vsgm)yy.h(this, -1379800564)) > 0) {
            vsgm$3.rm((Ralc)yy.h(this, 1791879773), true);
        }
        if (vsgm$3.rm((Ralc)yy.h(this, 320662029)) != vsgm$3.rm((Ralc)yy.h(this, 982379018))) return;
        vsgm$3.rm((vsgm)yy.h(this, -1379800564));
        if (vsgm$3.rm((Ralc)yy.h(this, 1791879773)) > true) ** GOTO lbl-1000
        if (vsgm$3.rm((Ralc)yy.h(this, 1791879773)) == false) lbl-1000: // 2 sources:
        {
            v0 = KDGY$JAHk.Y("\ufdd8");
        } else {
            v0 = "";
        }
        ((WFnH)yy.h(this, 915532379)).wnXH((String)vsgm$3.rm(vsgm$3.rm(vsgm$3.rm(vsgm$3.rm(vsgm$3.rm(vsgm$3.rm(new StringBuilder(KDGY$JAHk.Y("\ufde8\uac7b\uc553\u9aaa\u5161\ubb22\u8b5c")), vsgm$3.rm(vsgm$3.rm((Ralc)yy.h(this, 269478471)))), KDGY$JAHk.Y("\ufd8b\uac6b\uc551\u9ab2\u516d\ubb32\u8b15\u0edf\u36ad\ud560\u162f\u698b\u8762")), vsgm$3.rm(vsgm$3.rm((Ralc)yy.h(this, 1791879773)))), KDGY$JAHk.Y("\ufd8b\uac6d\uc557\u9ab3\u516a\ubb2d")), v0)));
    }

    private static Object rm(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

