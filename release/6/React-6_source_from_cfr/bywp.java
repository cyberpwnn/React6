/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class bywp
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(YEBy$TyVf.W("\ucbc9\u3d3e\u92e8\uf1b3\u0d5f\u397b\u0bd2\ufc01\u3e81\ua4c0\u8b6a\u1653\u3a9f\u10e8\u3a67\udb4a\u499d\uc18b"));
        this.setDescription(YEBy$TyVf.W("\ucbd2\u3d30\u92f5\uf1b3\u0d56\u396c\u0bd2\ufc01\u3eb9\ua4ca\u8b68\u1603\u3aa9\u10ff\u3a24\udb50\u4983\uc18b\u2f22\u22ae\u2d2d\u74df\u21b0\ufe75\u1ff2\u2025\ubf56\ufab6\ud7df\uae9f\u7b6d\u8feb\u2f6a"));
        this.setID((String)bywp.sb((pqxh)((Object)cv.e(316412064))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(5);
    }

    @Override
    public void avmQ() {
        this.setValue((double)bywp.sb(bywp.sb((XthG)cv.b((YoSa)cv.e(239341894), 1871515977))));
    }

    @Override
    public String get() {
        return bywp.sb(bywp.sb(new StringBuilder((String)bywp.sb(bywp.sb(this.getValue(), false))), YEBy$TyVf.W("\ucdf7\uc2a1")));
    }

    private static Object sb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

