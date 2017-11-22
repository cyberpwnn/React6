/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class LPFt
extends QVde {
    private boolean rqJg = false;

    public LPFt() {
        super(YEBy$TyVf.W("\u706c\u3f27\ufebb\ued07\u7fa4\u9ca1\ue2d9\udf7a\uebb6\ud87c\u11a1\u96d0\u7ad9"));
    }

    @Override
    public void VCsR() {
    }

    @Override
    public boolean esCa() {
        boolean bl = LPFt.Sj((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), LPFt.Sj((pqxh)((Object)cv.e(1212616879)))).getValue() > 50.0;
        if (bl != (Boolean)cv.b(this, 1719858102)) {
            cv.e(this, 1719858102, bl);
            if (((Boolean)cv.b(this, 1719858102)).booleanValue()) {
                LPFt.Sj((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(871691201)), YEBy$TyVf.W("\u6fb4\uba78\u4b56\u1df6\ua038\u590c\u564e\u4786\u20d4\u87a7\u2804\u3134\u9c84\u7fe8\ud9fb\u6c3f\ua9a8"), YEBy$TyVf.W("\u6fab\uba6d\u4b40")));
            } else {
                LPFt.Sj((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(-388566077)), YEBy$TyVf.W("\u6fb4\uba78\u4b56\u1df6\ua071\u5903\u5609\u47d5\u20c1\u87e6\u2815\u312c\u9c80\u7faa\ud9e3\u6c2a\ua9fb\uda80\u80bf\ucbec"), YEBy$TyVf.W("\u6fab\uba6d\u4b40")));
            }
        }
        return bl;
    }

    private static Object Sj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

