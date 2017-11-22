/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class teYl
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(rgig$AWxc.r("\ue739\u4661\u7781\ucdc3\ubb0a\ub59a"));
        this.setDescription(rgig$AWxc.r("\ue72e\u4666\u7780\ucdcc\ubb0d\ub5c9\ud816\ud00e\u5127\ue0ff\ud399\ufc86\u16e1\u6ad7\u2c41\u83eb\ua9d0\u32b1\u3568"));
        this.setID((String)teYl.Qm((pqxh)((Object)cv.e(-893710179))));
        this.setValue(1.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        this.setValue((double)teYl.Qm(this.NxGC()));
    }

    @Override
    public String get() {
        return teYl.Qm(teYl.Qm(teYl.Qm(new StringBuilder(), teYl.Qm((int)this.getValue())), rgig$AWxc.r("\u8948")));
    }

    private static Object Qm(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

