/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class eHME
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(YEBy$TyVf.W("\ub97a\ub095\u6c30\uc0fb\u49eb\u7362\uc671\u7ea3\u55a9\ua30b\uef82\udfce\u5740\u1c89\ude65\u2615"));
        this.setDescription(YEBy$TyVf.W("\ub97d\ub09d\u6c3e\uc0e0\u49f4\u7327\uc652\u7ee6\u55af\ua343\uefb4\udf8b\u5757\u1c96\ude78"));
        this.setID((String)eHME.mW((pqxh)((Object)cv.e(-310243155))));
        this.setValue(20.0);
        this.ssNb((APKB)((Object)cv.e(1489703379)), (APKB)((Object)cv.e(1489703379)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)eHME.mW(this.NxGC()));
    }

    @Override
    public String get() {
        if (- this.getValue() > 20.0) {
            return eHME.mW(eHME.mW(eHME.mW(eHME.mW(eHME.mW(eHME.mW(new StringBuilder(), eHME.mW(eHME.mW(0.5)) != false ? (APKB)((Object)cv.e(-1207700747)) : (APKB)((Object)cv.e(-314502936))), rgig$AWxc.r("\u7665")), (APKB)((Object)cv.e(-314502936))), rgig$AWxc.r("\u50e5")), eHME.mW(- this.getValue(), true)));
        }
        return eHME.mW(eHME.mW(eHME.mW(new StringBuilder(), eHME.mW(this.getValue() > 19.89 ? 20.0 : this.getValue(), false)), rgig$AWxc.r("\u71e3")));
    }

    private static Object mW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

