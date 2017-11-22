/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class gFBb
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(rgig$AWxc.r("\u164b\ude39\u2505\u8530\uccdb\u5b15\u2b2e\u344a\u53f4\u7e7c\u9d84\u1746\u9ec1\ue75a\u7454\u1616\ub2c1\uccf6"));
        this.setDescription(rgig$AWxc.r("\u164a\ude3d\u250c\u8533\uccc3\u5b1f\u2b33\u340f\u5386\u7e4d\u9d89\u1756\u9ede\ue715\u746e\u161a\ub28c\uccc7\ubd36\u1049\u1640\u24ed\u5d20\uf55e\u4f80\ufe80"));
        this.setID((String)gFBb.ot((pqxh)((Object)cv.e(71700647))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)gFBb.ot(gFBb.ot((TOJM)cv.b((YoSa)cv.e(239341894), 630329654))));
    }

    @Override
    public String get() {
        return gFBb.ot(new StringBuilder((String)gFBb.ot(gFBb.ot(this.getValue() / 1000000.0, true))));
    }

    private static Object ot(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

