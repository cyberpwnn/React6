/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class gotc
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(KUXS$dwji.S("\uc454\uc0bf\uba3d\u8850\ucbc6\u0d26\u4557\ua682\u04ce\uff3b\uc2da"));
        this.setDescription(KUXS$dwji.S("\uc45f\uc0a8\uba35\u885a\ucb94\u0d12\u4512\ua68c\u04d4\uff3b\uc2d1\u2931\u46e6\ubaf0\ubc6d\u28f7\u8fb7\udd33\udf7e\u89f4\u75f6"));
        this.setID((String)gotc.BR((pqxh)((Object)cv.e(1997934741))));
        this.setValue(1.0);
        this.ssNb((APKB)((Object)cv.e(-1207700747)), (APKB)((Object)cv.e(-1207700747)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)(gotc.BR(gotc.BR(this.NxGC())) - gotc.BR(this.NxGC())));
    }

    @Override
    public String get() {
        return gotc.BR((long)this.getValue());
    }

    private static Object BR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

