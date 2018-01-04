/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class ktHX$2
extends XAcv<Integer> {
    final /* synthetic */ ktHX EBjP;
    private final /* synthetic */ xynF gFNH;
    private final /* synthetic */ int OrkN;

    ktHX$2(ktHX ktHX2, xynF xynF2, int n) {
        this.EBjP = ktHX2;
        this.gFNH = xynF2;
        this.OrkN = n;
    }

    @Override
    public void yJLS(Integer n) {
        if (ktHX$2.of(ktHX$2.of((ktHX)o.a(this, 2097235172)), (ooQj)((Object)o.k(1731151092))) != false) {
            ((xynF)o.a(this, 587547858)).biLo((String)ktHX$2.of(ktHX$2.of(ktHX$2.of(ktHX$2.of(new StringBuilder((String)ktHX$2.of(ktHX$2.of(FMkR$WjFM.a("\uab93\u14d6\ucdd2\uefda\u1cdf\u2512\u2d49\u3568\u95d5\ue29a\uf86b\u15e5\ub6c7\u676b\ub500\u354c\u105a\uc30e\u11cb\u5305\uebf7\u30ee\u3ba0\uf7d5\u3e9b")))), ktHX$2.of((Integer)o.a(this, -925350703))), ktHX$2.of(FMkR$WjFM.a("\uab93\u14d6\ucdd2\uefda\u1cdf\u2512\u2d49\u3568\u95d5\ue29a\uf86b\u15e5\ub6c7\u676b\ub500\u354c\u105a\uc30e\u11cb\u5305\uebe6\u30e3\u3bb9\uf7d2\u3e84"))), (Integer)o.a(this, -925350703) > 1 || (Integer)o.a(this, -925350703) == 0 ? FMkR$WjFM.a("\uab81") : "")));
            ktHX$2.of((ktHX)o.a(this, 2097235172));
        }
    }

    private static Object of(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

