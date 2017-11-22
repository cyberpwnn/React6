/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class sPsW
extends VCgr {
    private bqeB fCSu = new bqeB(50);

    @Override
    public void CMSR() {
        this.setName(YEBy$TyVf.W("\u3890\ua65c\uc7f7\u5645\u9125\ucf3c\ud431\u26dd\u9b4d"));
        this.setDescription(YEBy$TyVf.W("\u3890\ua65c\uc7f7\u5645\u9125\ucf1c\ud431\u26dd\u9b4d\u035d\u7b37\u0dde\u1a5f\ubf47\u6f6a\u0361\u963c\u73da\u87e9\u06ed\u5b4b\u2d97\u1536\u087f\u9a63"));
        this.setID((String)sPsW.Tq((pqxh)((Object)cv.e(1212616879))));
        this.setValue(1.0);
        this.ssNb((APKB)((Object)cv.e(1489703379)), (APKB)((Object)cv.e(1489703379)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        sPsW.Tq((bqeB)cv.b(this, 2135815006), sPsW.Tq(this.NxGC()));
        this.setValue((double)sPsW.Tq((bqeB)cv.b(this, 2135815006)));
    }

    @Override
    public String get() {
        return sPsW.Tq(sPsW.Tq(sPsW.Tq(new StringBuilder(), sPsW.Tq(this.getValue(), false)), rgig$AWxc.r("\u7573\u73cd\u4d92\u706c")));
    }

    private static Object Tq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

