/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class MAeq
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(KUXS$dwji.S("\uf5d1\ubebd\u18f9\u42ea\u460b\u0815\ub6ea\u46bc\uf9c2\uea22\u9337\ue762\ud131\u316b\ua746\uef07\u934b\ubc92\u545e\u1a8d\uc7c4\u0e36\u7ff6\ubbe7\uc930\u1b35\ud0bd"));
        this.setDescription(KUXS$dwji.S("\uf5d1\ubebd\u18f9\u42ea\u460b\u0815\ub6ea\u46bc\uf9c2\uea22\u9337\ue762\ud131\u316b\ua746\uef07\u934b\ubc92\u545e\u1a8d\uc7c4\u0e36\u7ff6\ubbe7\uc930\u1b35\ud0bd"));
        this.setID((String)MAeq.Nf((pqxh)((Object)cv.e(1040388243))));
        this.setValue(1.0);
        this.ssNb((APKB)((Object)cv.e(-1207700747)), (APKB)((Object)cv.e(-1207700747)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)MAeq.Nf(this.NxGC()));
    }

    @Override
    public String get() {
        return MAeq.Nf(MAeq.Nf(new StringBuilder(rgig$AWxc.r("\u8937\u5685")), MAeq.Nf((long)this.getValue())));
    }

    private static Object Nf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

