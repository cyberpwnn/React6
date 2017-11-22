/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class SLHs
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(YEBy$TyVf.W("\ud957\u4351\ud712\u51f5\u2bb9\u50ac\u5a8b\u04db\ua763\uef80\u7da9\u387c\u1d87\u7ee9\ue003\u832a\udbe1\ubfca\uecf4\udc32\u459d\u9e01\u0b20\ua39b\uf096\u3015\u9e3e\ufbb5"));
        this.setDescription(YEBy$TyVf.W("\ud94c\u435f\ud70f\u51f5\u2bb0\u50bb\u5ad8\u04af\ua742\uef8c\u7db2\u382c\u1db6\u7ef2\ue04e\u831b\udba8\ubffc\ueceb\udc7b\u45a5\u9e01\u0b37\ua39f\uf0c2\u3029\u9e25\ufbb2\u7635\u192f\u4857\u6506\uc33e\ue8b9\u5ce8\ubfbb"));
        this.setID((String)SLHs.nS((pqxh)((Object)cv.e(-493612890))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        try {
            this.setValue((double)(SLHs.nS(SLHs.nS((XthG)cv.b((YoSa)cv.e(239341894), 1871515977))) / 5.0E7));
            return;
        }
        catch (Exception exception) {
            this.setValue(0.0);
            return;
        }
    }

    @Override
    public String get() {
        return SLHs.nS(new StringBuilder((String)SLHs.nS(SLHs.nS(this.getValue(), true))));
    }

    private static Object nS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

