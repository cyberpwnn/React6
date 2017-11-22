/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class NUkt
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(KUXS$dwji.S("\u4a54\uedc2\u0661\u7a7c\uad80"));
        this.setDescription(KUXS$dwji.S("\u4a44\ueddf\u067a\u7a6d\uad9f\u631d\u1ac7\u763a\u78d8\u00f0\u9ef2"));
        this.setID((String)NUkt.wY((pqxh)((Object)cv.e(-2043277115))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(1197215955)), (APKB)((Object)cv.e(1197215955)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)NUkt.wY(this.NxGC()));
    }

    @Override
    public String get() {
        Object object = NUkt.wY((tCRu)cv.b((YoSa)cv.e(239341894), 94958327));
        return NUkt.wY(NUkt.wY(NUkt.wY(NUkt.wY(NUkt.wY(new StringBuilder(rgig$AWxc.r("\u11fd")), NUkt.wY((int)this.getValue())), (APKB)((Object)cv.e(1129452014))), rgig$AWxc.r("\u15f4")), NUkt.wY(object)));
    }

    private static Object wY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

