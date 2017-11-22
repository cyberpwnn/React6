/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class Yfkw
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(KUXS$dwji.S("\u5a57\u986e\u4826\u0535\u7f17\u2703\ufff4\u35d5\ua6c1\u688f\udbc7\u8c34\ub93d\u1bed\uc7f7\ue7e0\udf8a\u0ff0\ub6fa\u3683\u6809\u8c74\u3a22\u3c9b\u4e7f\ub234\udc33\ufc17\u7336\uf822"));
        this.setDescription(KUXS$dwji.S("\u5a56\u986a\u482f\u0536\u7f0f\u2709\uffe9\u3590\ua6b3\u68be\udbca\u8c24\ub922\u1ba2\uc7cd\ue7ec\udfc7\u0fc1\ub6b3\u36b5\u6816\u8c3d\u3a1a\u3c9b\u4e68\ub230\udc67\ufc2b\u732d\uf825\u0090\u53b4\ue0bc\u32c9\udb59\u8b7a\ub0e8\u0d26"));
        this.setID((String)Yfkw.Oh((pqxh)((Object)cv.e(580128761))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        try {
            this.setValue((double)(Yfkw.Oh(Yfkw.Oh((TOJM)cv.b((YoSa)cv.e(239341894), 630329654))) / 5.0E7));
            return;
        }
        catch (Exception exception) {
            this.setValue(0.0);
            return;
        }
    }

    @Override
    public String get() {
        return Yfkw.Oh(new StringBuilder((String)Yfkw.Oh(Yfkw.Oh(this.getValue(), true))));
    }

    private static Object Oh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

