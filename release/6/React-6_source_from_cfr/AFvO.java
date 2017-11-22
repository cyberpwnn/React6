/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class AFvO
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(YEBy$TyVf.W("\ucac2\u842d\u58f7\u9316\u9a69\udf48\u01d7\u026d\u669a\u1ec6\udd13\u15af\ub44c\u7780\u7802\u0988"));
        this.setDescription(YEBy$TyVf.W("\ucad9\u8423\u58ea\u9316\u9a60\udf5f\u0184\u0219\u66bb\u1eca\udd08\u15ff\ub47d\u779b\u784f\u09b9\u6c47\u3057\u44e5\u8381\u96ab\u2888\u5bd2\u8808"));
        this.setID((String)AFvO.KA((pqxh)((Object)cv.e(951914659))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)AFvO.KA(AFvO.KA((XthG)cv.b((YoSa)cv.e(239341894), 1871515977))));
    }

    @Override
    public String get() {
        return AFvO.KA(new StringBuilder((String)AFvO.KA(AFvO.KA(this.getValue() / 1000000.0, true))));
    }

    private static Object KA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

