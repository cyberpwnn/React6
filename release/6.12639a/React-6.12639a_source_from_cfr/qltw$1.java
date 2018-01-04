/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class qltw$1
implements ntkx {
    final /* synthetic */ qltw lyAy;

    qltw$1(qltw qltw2) {
        this.lyAy = qltw2;
    }

    @Override
    public String uVol(double d) {
        return qltw$1.oa(qltw$1.oa(new StringBuilder((String)qltw$1.oa(qltw$1.oa(d, false))), qltw$1.oa(FMkR$WjFM.a("\u16a8\u4467\ud717\uffdb\u944a\uce86\u0a0f\u8d7b\ue823\u3926\u68e4\u9fde\u1a92\u981f\u2ec0\u76f2\u9e79\ud4f0\u5924\u40ae\ud248\u4e34\u29f9\u5be2\u0140\ub465"))));
    }

    private static Object oa(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

