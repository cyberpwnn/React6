/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class JlDV
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(KUXS$dwji.S("\uc62d\uf6dc\u2a5b\ufddc\u9fcf"));
        this.setDescription(KUXS$dwji.S("\uc62d\uf6da\u2a43\ufdd8\u9fd0\u9e43\ub61e\u1229\u4c6a\u5d1d\udcd3"));
        this.setID((String)JlDV.ca((pqxh)((Object)cv.e(-1238232889))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(1197215955)), (APKB)((Object)cv.e(1197215955)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)JlDV.ca(this.NxGC()));
    }

    @Override
    public String get() {
        return JlDV.ca(JlDV.ca(new StringBuilder(KUXS$dwji.S("\uc42d")), JlDV.ca((int)this.getValue())));
    }

    private static Object ca(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

