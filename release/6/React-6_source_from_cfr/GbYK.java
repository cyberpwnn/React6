/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class GbYK
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(rgig$AWxc.r("\ud71d\ub2ba\uf06d\ucc43\u7df1\u22c9\udb4b\u819d\uf8b9\u8b41\u1449"));
        this.setDescription(rgig$AWxc.r("\ud705\ub2ac\uf065\ucc48\u7da3\u22fd\udb0e\u8193\uf8a3\u8b41\u1442\u51ff\ueda1\u28f0\u5ac5\u5247\ufc3e\u2606\u78ef\u164d\u0bea"));
        this.setID((String)GbYK.kg((pqxh)((Object)cv.e(-1615195989))));
        this.setValue(1.0);
        this.ssNb((APKB)((Object)cv.e(-1207700747)), (APKB)((Object)cv.e(-1207700747)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)GbYK.kg(this.NxGC()));
    }

    @Override
    public String get() {
        return GbYK.kg((long)this.getValue());
    }

    private static Object kg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

