/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@lDTo
public class uOFv
extends jqQR
implements XSJd {
    private ktOu<String, DXfX> bXeC = new ktOu();
    private kQsA uOYl = new kQsA();
    private int cuYy;

    public uOFv() {
        this.hjbh();
        this.cuYy = 4;
    }

    public void IWSm(DXfX dXfX) {
        uOFv.jZ((ktOu)cv.b(this, 1007547116), dXfX.getID(), dXfX);
    }

    public DXfX jhSt(String string) {
        return (DXfX)uOFv.jZ((ktOu)cv.b(this, 1007547116), string);
    }

    private void hjbh() {
        Object object;
        Object object2 = uOFv.jZ((wfPa)uOFv.jZ((ktOu)cv.e(-1326510031), uOFv.jZ(2)));
        while (object2.hasNext()) {
            object = (Class)object2.next();
            try {
                this.IWSm((DXfX)uOFv.jZ(uOFv.jZ(object, new Class[0]), new Object[0]));
            }
            catch (InstantiationException instantiationException) {
                InstantiationException instantiationException2 = instantiationException;
                uOFv.jZ(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                uOFv.jZ(illegalAccessException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                uOFv.jZ(illegalArgumentException);
            }
            catch (InvocationTargetException invocationTargetException) {
                InvocationTargetException invocationTargetException2 = invocationTargetException;
                uOFv.jZ(invocationTargetException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                NoSuchMethodException noSuchMethodException2 = noSuchMethodException;
                uOFv.jZ(noSuchMethodException);
            }
            catch (SecurityException securityException) {
                SecurityException securityException2 = securityException;
                uOFv.jZ(securityException);
            }
        }
        object2 = uOFv.jZ(uOFv.jZ((ktOu)cv.b(this, 1007547116)));
        while (object2.hasNext()) {
            object = (DXfX)object2.next();
            uOFv.jZ(uOFv.jZ(uOFv.jZ(uOFv.jZ(uOFv.jZ(uOFv.jZ(uOFv.jZ(new StringBuilder(KUXS$dwji.S("\u039a\u384a\ucd44\uf9b5\u3b19\ue3fe\uea04\u15be\u5024")), object.getID()), KUXS$dwji.S("\u03e9\u3803")), object.getName()), KUXS$dwji.S("\u03e0\u380b\ucd69\uf9e5")), object.getInterval())));
            object.CMSR();
        }
    }

    @Override
    public void start() {
        uOFv.jZ((kQsA)cv.b(this, 382726895));
        uOFv.jZ(this);
        uOFv.jZ(this);
    }

    @Override
    public void stop() {
        uOFv.jZ((kQsA)cv.b(this, 382726895));
        uOFv.jZ(this);
        uOFv.jZ(this);
    }

    @Override
    public void tick() {
    }

    public kQsA vIXT() {
        return (kQsA)cv.b(this, 382726895);
    }

    @Override
    public void FFBA() {
        if ((Integer)cv.b(this, 826995432) > 0) {
            uOFv uOFv2 = this;
            cv.e(uOFv2, 826995432, (Integer)cv.b(uOFv2, 826995432) - 1);
            return;
        }
        Object object = uOFv.jZ(uOFv.jZ((ktOu)cv.b(this, 1007547116)));
        while (object.hasNext()) {
            DXfX dXfX = (DXfX)object.next();
            try {
                if ((Long)cv.e(871764466) % (long)dXfX.getInterval() != 0) continue;
                dXfX.avmQ();
            }
            catch (Exception exception) {
                uOFv.jZ(uOFv.jZ(uOFv.jZ(new StringBuilder(rgig$AWxc.r("\u7064\u4f1a\u8be1\ue6f8\u674e\u2a2d\ubcfb\uf245\ub083\u6eed\u9b07\uda59\u06a2\u6781\u457b\u62fd\u68dc")), dXfX.getName())));
                uOFv.jZ(exception);
            }
        }
    }

    @Override
    public String BuHU() {
        return rgig$AWxc.r("\u39eb\u7166\u4068\ua697\uce42\ud0f1\u47bd");
    }

    private static Object jZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

