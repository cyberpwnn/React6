/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class tLFo
extends VCgr {
    private bqeB fCSu = new bqeB(50);

    @Override
    public void CMSR() {
        this.setName(rgig$AWxc.r("\ue20b\u89a5\uca5e\u425d\uaf29\u44ad\u39aa\u2cdc\uf701\u920c\u227f\u8bc5\uabff\u87ab\uc728\ua666"));
        this.setDescription(rgig$AWxc.r("\ue20b\u89a5\uca5e\u425d\uaf29\u448d\u39ad\u2cd4\uf70a\u9200\u2225\u8bd2\uabe2\u87a3\uc767\ua678\ua028\u240f\uc072\u28a0\uf281\ud621"));
        this.setID((String)tLFo.ec((pqxh)((Object)cv.e(987041961))));
        this.setValue(1.0);
        this.ssNb((APKB)((Object)cv.e(1489703379)), (APKB)((Object)cv.e(1489703379)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        tLFo.ec((bqeB)cv.b(this, 950334360), tLFo.ec(this.NxGC()));
        this.setValue((double)tLFo.ec((bqeB)cv.b(this, 950334360)));
    }

    @Override
    public String get() {
        return tLFo.ec(this.getValue(), false);
    }

    private static Object ec(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

