/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class UQfI$2$1
implements Runnable {
    final /* synthetic */ UQfI.2 GRCK;
    private final /* synthetic */ yJSB PJyi;
    private final /* synthetic */ yJSB GQbv;
    private final /* synthetic */ yJSB rxpT;
    private final /* synthetic */ yJSB uqWq;
    private final /* synthetic */ yJSB Ipxq;
    private final /* synthetic */ xynF gFNH;

    UQfI$2$1(UQfI.2 var1_1, yJSB yJSB2, yJSB yJSB3, yJSB yJSB4, yJSB yJSB5, yJSB yJSB6, xynF xynF2) {
        this.GRCK = var1_1;
        this.PJyi = yJSB2;
        this.GQbv = yJSB3;
        this.rxpT = yJSB4;
        this.uqWq = yJSB5;
        this.Ipxq = yJSB6;
        this.gFNH = xynF2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        if (UQfI$2$1.wX(UQfI$2$1.wX((UQfI.2)o.a(this, 1634157740))) == false) {
            UQfI$2$1.wX((yJSB)o.a(this, 1843086521), true);
        }
        UQfI$2$1.wX((yJSB)o.a(this, 1426670776), true);
        var1_1 = (String)o.k(-527153993);
        UQfI$2$1.wX(UQfI$2$1.wX((UQfI.2)o.a(this, 1634157740)), (Object)UQfI$2$1.wX((yJSB)o.a(this, 1426670776)) / (Object)UQfI$2$1.wX((yJSB)o.a(this, -47954762)));
        var1_1 = UQfI$2$1.wX(var1_1, FMkR$WjFM.a("\u18ae\ub9ba"), UQfI$2$1.wX(UQfI$2$1.wX((yJSB)o.a(this, 1426670776))));
        var1_1 = UQfI$2$1.wX(var1_1, FMkR$WjFM.a("\u18ae\ub9ad"), UQfI$2$1.wX(UQfI$2$1.wX((yJSB)o.a(this, -47954762))));
        var1_1 = UQfI$2$1.wX(var1_1, FMkR$WjFM.a("\u18ae\ub9a9"), UQfI$2$1.wX(UQfI$2$1.wX(UQfI$2$1.wX((UQfI.2)o.a(this, 1634157740))), false));
        UQfI$2$1.wX(UQfI$2$1.wX((UQfI.2)o.a(this, 1634157740)), var1_1);
        UQfI$2$1.wX(UQfI$2$1.wX((UQfI.2)o.a(this, 1634157740)), UQfI$2$1.wX());
        UQfI$2$1.wX((yJSB)o.a(this, -1663286111), UQfI$2$1.wX(UQfI$2$1.wX((UQfI.2)o.a(this, 1634157740))));
        if (UQfI$2$1.wX(UQfI$2$1.wX((UQfI.2)o.a(this, 1634157740))) > 0) {
            UQfI$2$1.wX((yJSB)o.a(this, -1811659617), true);
        }
        if (UQfI$2$1.wX((yJSB)o.a(this, 1426670776)) != UQfI$2$1.wX((yJSB)o.a(this, -47954762))) return;
        UQfI$2$1.wX(UQfI$2$1.wX((UQfI.2)o.a(this, 1634157740)));
        if (UQfI$2$1.wX((yJSB)o.a(this, 1843086521)) > true) ** GOTO lbl-1000
        if (UQfI$2$1.wX((yJSB)o.a(this, 1843086521)) == false) lbl-1000: // 2 sources:
        {
            v0 = FMkR$WjFM.a("\u18f9");
        } else {
            v0 = "";
        }
        ((xynF)o.a(this, -1409203043)).biLo((String)UQfI$2$1.wX(UQfI$2$1.wX(UQfI$2$1.wX(UQfI$2$1.wX(new StringBuilder((String)UQfI$2$1.wX(UQfI$2$1.wX(FMkR$WjFM.a("\u18eb\ub9ba\u1b5e\u2447\ubc81\u1527\uc998\u8f41\u0937\u1c81\u17d7\u47b8\u23f0\u0aa4\uf917\u6512\uaa73\u3560\u3f46\u619a\ua064\ub5f6\u097e\u7bc3\u536d\u3cd6")))), UQfI$2$1.wX(UQfI$2$1.wX((yJSB)o.a(this, 1843086521)))), UQfI$2$1.wX(FMkR$WjFM.a("\u18eb\ub9ba\u1b5e\u2447\ubc81\u1527\uc998\u8f41\u0937\u1c81\u17d7\u47b8\u23f0\u0aa4\uf917\u6512\uaa73\u3560\u3f46\u619a\ua077\ub5eb\u0979\u7bca\u5363"))), v0)));
    }

    private static Object wX(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

