/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class Diox
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(rgig$AWxc.r("\ucf24\u6125\ud7ab\uc1b5\u58a4\ud4a3\ua0c8\uf436\u282a\u7823\u5a6e\udac1\u27f5\uaffa\ufab2\ue23b\u86d5\ua104\u1e47"));
        this.setDescription(rgig$AWxc.r("\ucf25\u6121\ud7a2\uc1b6\u58bc\ud4a9\ua0d5\uf473\u2878\u7816\u5a6f\udac0\u27a1\uafc6\ufab9\ue23d\u869a\ua11f\u1e53\uf32b\u54c1\u5fe4\u31f5\u7544\u9c63\u97fd\ua40e\u4d44\uc402\u8e76\u39ab\u0913\ub8d9\u9aea\ufde1"));
        this.setID((String)Diox.Fg((pqxh)((Object)cv.e(2017333413))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(5);
    }

    @Override
    public void avmQ() {
        this.setValue((double)Diox.Fg(Diox.Fg((TOJM)cv.b((YoSa)cv.e(239341894), 630329654))));
    }

    @Override
    public String get() {
        return Diox.Fg(Diox.Fg(new StringBuilder((String)Diox.Fg(Diox.Fg(this.getValue(), false))), KUXS$dwji.S("\u82ed\u361c")));
    }

    private static Object Fg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

