/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class aDQd
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(YEBy$TyVf.W("\u954d\u35a4\u7f69\u8775\u1995\u0f0a\u87a0\u119d"));
        this.setDescription(YEBy$TyVf.W("\u955c\u35a5\u7f69\u877d\u198d\u0f43\u8780\u1180\uc3e8\ud678\u29bf\u5764\ua57b\u9b3f"));
        this.setID((String)aDQd.uL((pqxh)((Object)cv.e(-412938087))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(1197215955)), (APKB)((Object)cv.e(1197215955)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)aDQd.uL(this.NxGC()));
    }

    @Override
    public String get() {
        return aDQd.uL(aDQd.uL(aDQd.uL(new StringBuilder(), aDQd.uL((int)this.getValue())), YEBy$TyVf.W("\u0c66")));
    }

    private static Object uL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

