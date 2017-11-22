/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class JtRs
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(KUXS$dwji.S("\u889e\u9244\u8fda\u48c4\u845e\uf8f5\u7cc7\u8a59\u7bb4\u045b"));
        this.setDescription(KUXS$dwji.S("\u889e\u9244\u8fda\u488d\u847e\uf8e5\u7cc7\u8a16\u7b8b\u0447\ud2b3\u1e95\u4232\ua913"));
        this.setID((String)JtRs.ll((pqxh)((Object)cv.e(1773277335))));
        this.setValue(1.0);
        this.ssNb((APKB)((Object)cv.e(-1207700747)), (APKB)((Object)cv.e(-1207700747)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)JtRs.ll(JtRs.ll(this.NxGC())));
    }

    @Override
    public String get() {
        return JtRs.ll((long)this.getValue());
    }

    private static Object ll(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

