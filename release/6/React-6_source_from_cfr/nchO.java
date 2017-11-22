/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class nchO
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(YEBy$TyVf.W("\ufbfe\ubf5e\u2b0a\ub24f\uac2b\u2e6e\u0e4a\u1dfa\u4f4d\ud78f\u7490\uf56c\u8b3b\uc6d5\u60af\u643b\u9d37"));
        this.setDescription(YEBy$TyVf.W("\ufbff\ubf5a\u2b03\ub24c\uac33\u2e64\u0e57\u1dbf\u4f1f\ud7ba\u7491\uf56d\u8b6f\uc6ee\u60a8\u643d\u9d7c\ub3a6\u355b\u407e\u6dd4\u9c1b\u365c\u9b69\u25cd\ueb42\uae6e\u6aaf\u7ae5\u3288\ue6c0\u8fac\uaa62"));
        this.setID((String)nchO.JR((pqxh)((Object)cv.e(-1152642885))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        try {
            this.setValue((double)nchO.JR(nchO.JR((TOJM)cv.b((YoSa)cv.e(239341894), 630329654))));
            return;
        }
        catch (Exception exception) {
            this.setValue(0.0);
            return;
        }
    }

    @Override
    public String get() {
        return nchO.JR(nchO.JR(new StringBuilder((String)nchO.JR(nchO.JR(this.getValue(), false))), rgig$AWxc.r("\uaab6\u1b79")));
    }

    private static Object JR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

