/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class MSHX$3
extends vbvg {
    final /* synthetic */ MSHX RsxR;

    MSHX$3(MSHX mSHX, String string, int n) {
        this.RsxR = mSHX;
        super(string, n);
    }

    @Override
    public void run() {
        MSHX$3$1 mSHX$3$1 = new MSHX$3$1(this);
        MSHX$3.OT(mSHX$3$1, nJPf$sILv.G("\uf4de\u6198\u1028\u4916\u6592\udad4\u95db\u4b25\u5a3e\ufc5f\u3161\uda83\ud517\u7d91\ub895\u2760\ub1cc\u0b68\u57ec\uc12f\ubccd\udecf"));
        MSHX$3.OT(mSHX$3$1);
    }

    private static Object OT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

