/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class inDC$2
implements Runnable {
    final /* synthetic */ Ralc nBIE;
    final /* synthetic */ Ralc fuej;
    final /* synthetic */ Ralc WhyT;
    final /* synthetic */ Ralc IqSO;
    final /* synthetic */ WFnH vbqV;
    final /* synthetic */ inDC YpAW;

    inDC$2(inDC inDC2, Ralc ralc, Ralc ralc2, Ralc ralc3, Ralc ralc4, WFnH wFnH) {
        this.YpAW = inDC2;
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
        inDC$2.yz((Ralc)yy.h(this, -1430459787), true);
        var1_1 = (String)yy.p(-744101266);
        inDC$2.yz((inDC)yy.h(this, 2028923507), (Object)inDC$2.yz((Ralc)yy.h(this, -1430459787)) / (Object)inDC$2.yz((Ralc)yy.h(this, 1290005108)));
        var1_1 = inDC$2.yz(var1_1, KDGY$JAHk.Y("\u229a\ua349"), inDC$2.yz(inDC$2.yz((Ralc)yy.h(this, -1430459787))));
        var1_1 = inDC$2.yz(var1_1, KDGY$JAHk.Y("\u229a\ua35e"), inDC$2.yz(inDC$2.yz((Ralc)yy.h(this, 1290005108))));
        var1_1 = inDC$2.yz(var1_1, KDGY$JAHk.Y("\u229a\ua35a"), inDC$2.yz(inDC$2.yz((inDC)yy.h(this, 2028923507)), false));
        inDC$2.yz((inDC)yy.h(this, 2028923507), var1_1);
        inDC$2.yz((inDC)yy.h(this, 2028923507), inDC$2.yz());
        inDC$2.yz((Ralc)yy.h(this, -633279875), inDC$2.yz((inDC)yy.h(this, 2028923507)));
        if (inDC$2.yz((inDC)yy.h(this, 2028923507)) > 0) {
            inDC$2.yz((Ralc)yy.h(this, 473492091), true);
        }
        if (inDC$2.yz((Ralc)yy.h(this, -1430459787)) != inDC$2.yz((Ralc)yy.h(this, 1290005108))) return;
        inDC$2.yz((inDC)yy.h(this, 2028923507));
        if (inDC$2.yz((Ralc)yy.h(this, -1430459787)) > true) ** GOTO lbl-1000
        if (inDC$2.yz((Ralc)yy.h(this, -1430459787)) == false) lbl-1000: // 2 sources:
        {
            v0 = KDGY$JAHk.Y("\u22cd");
        } else {
            v0 = "";
        }
        ((WFnH)yy.h(this, 1640950385)).wnXH((String)inDC$2.yz(inDC$2.yz(inDC$2.yz(inDC$2.yz(new StringBuilder(KDGY$JAHk.Y("\u22ee\ua35f\u376a\u63ba\ubc39\uee26\uc336")), inDC$2.yz(inDC$2.yz((Ralc)yy.h(this, -1430459787)))), KDGY$JAHk.Y("\u229e\ua349\u3770\u63a8\ubc32\uee29")), v0)));
    }

    private static Object yz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

