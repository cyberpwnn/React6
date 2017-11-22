/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class Rrym
extends VCgr {
    private bqeB anwm = new bqeB(19);

    @Override
    public void CMSR() {
        this.setName(rgig$AWxc.r("\ucc23\u9541\ua721\u6cd1\u1732\u03f5\u3cf6\u4a98"));
        this.setDescription(rgig$AWxc.r("\ucc23\u9541\ua721\u6cd1\u1732\u03f5\u3cf9\u4a9b\ua9c0\ud0e1\u40c8\ucee5\u9ce0\ubcab\u8eeb\ue50e\u8405"));
        this.setID((String)Rrym.FL((pqxh)((Object)cv.e(-405860193))));
        this.setValue(1.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(0);
    }

    @Override
    public void avmQ() {
        Rrym.FL((bqeB)cv.b(this, 2098983776), Rrym.FL(this.NxGC()));
        this.setValue((double)Rrym.FL((bqeB)cv.b(this, 2098983776)));
    }

    @Override
    public String get() {
        return Rrym.FL(Rrym.FL(Rrym.FL(new StringBuilder(rgig$AWxc.r("\u7a07\u11e9")), Rrym.FL((int)this.getValue())), rgig$AWxc.r("\u53d9\u11ba")));
    }

    private static Object FL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

