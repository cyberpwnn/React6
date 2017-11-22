/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class yReg
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(KUXS$dwji.S("\u4777\u94c9\u5f1a\u1c20\u23e7\u883f\u47c1\u809f\uc0b3\u5627\ua68e\u8334\u42e7\uc43a\ue046\uca18"));
        this.setDescription(KUXS$dwji.S("\u4777\u94c9\u5f1a\u1c20\u23e7\u883f\u47c1\u809f\uc0b3\u5627\ua68e\u8334\u42e7\uc43a\ue046\uca18"));
        this.setID((String)yReg.ln((pqxh)((Object)cv.e(2031095953))));
        this.setValue(1.0);
        this.ssNb((APKB)((Object)cv.e(-1207700747)), (APKB)((Object)cv.e(-1207700747)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)yReg.ln(this.NxGC()));
    }

    @Override
    public String get() {
        return yReg.ln((long)this.getValue());
    }

    private static Object ln(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

