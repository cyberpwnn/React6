/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class wfRd
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(rgig$AWxc.r("\u9dd1\ub4c8\u2fa1\u9761\ufa43\u5474"));
        this.setDescription(rgig$AWxc.r("\u9dc9\ub4ce\u2fa3\u9769\ufa41\u5433\u50ce\u9f9b\u81c3\u2f80\u46c0\u76aa"));
        this.setID((String)wfRd.Tb((pqxh)((Object)cv.e(1928990939))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(1197215955)), (APKB)((Object)cv.e(1197215955)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)wfRd.Tb(this.NxGC()));
    }

    @Override
    public String get() {
        Object object = wfRd.Tb((tCRu)cv.b((YoSa)cv.e(239341894), 94958327));
        return wfRd.Tb(wfRd.Tb(wfRd.Tb(wfRd.Tb(wfRd.Tb(new StringBuilder(KUXS$dwji.S("\uaf25")), wfRd.Tb((int)this.getValue())), (APKB)((Object)cv.e(1129452014))), KUXS$dwji.S("\ua987")), wfRd.Tb(object)));
    }

    private static Object Tb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

