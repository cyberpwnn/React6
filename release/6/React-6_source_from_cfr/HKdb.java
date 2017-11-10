/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@bqhA
public class HKdb
extends qloI
implements wncc {
    private aKuV<String, FpQi> ieeF = new aKuV();
    private NUlR gFLN = new NUlR();

    public HKdb() {
        this.fvCQ();
    }

    public void yJLL(FpQi fpQi) {
        HKdb.xA((aKuV)yy.h(this, -1519392424), fpQi.getID(), fpQi);
    }

    public FpQi Bkpl(String string) {
        return (FpQi)HKdb.xA((aKuV)yy.h(this, -1519392424), string);
    }

    private void fvCQ() {
        Object object;
        Object object2 = HKdb.xA((PBUD)HKdb.xA((aKuV)yy.p(2038819903), HKdb.xA(2)));
        while (object2.hasNext()) {
            object = (Class)object2.next();
            try {
                this.yJLL((FpQi)HKdb.xA(HKdb.xA(object, new Class[0]), new Object[0]));
            }
            catch (InstantiationException instantiationException) {
                InstantiationException instantiationException2 = instantiationException;
                HKdb.xA(instantiationException);
            }
            catch (IllegalAccessException illegalAccessException) {
                IllegalAccessException illegalAccessException2 = illegalAccessException;
                HKdb.xA(illegalAccessException);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                HKdb.xA(illegalArgumentException);
            }
            catch (InvocationTargetException invocationTargetException) {
                InvocationTargetException invocationTargetException2 = invocationTargetException;
                HKdb.xA(invocationTargetException);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                NoSuchMethodException noSuchMethodException2 = noSuchMethodException;
                HKdb.xA(noSuchMethodException);
            }
            catch (SecurityException securityException) {
                SecurityException securityException2 = securityException;
                HKdb.xA(securityException);
            }
        }
        object2 = HKdb.xA(HKdb.xA((aKuV)yy.h(this, -1519392424)));
        while (object2.hasNext()) {
            object = (FpQi)object2.next();
            HKdb.xA(HKdb.xA(HKdb.xA(HKdb.xA(HKdb.xA(HKdb.xA(HKdb.xA(new StringBuilder(KDGY$JAHk.Y("\u54dd\u04f2\u2ad4\u1608\udcf2\ub016\ue274\u972b\u2194")), object.getID()), KDGY$JAHk.Y("\u54ae\u04bb")), object.getName()), KDGY$JAHk.Y("\u54a7\u04b3\u2af9\u1658")), object.getInterval())));
            object.pOsy();
        }
    }

    @Override
    public void start() {
        HKdb.xA((NUlR)yy.h(this, 748153133));
        HKdb.xA(this);
        HKdb.xA(this);
    }

    @Override
    public void stop() {
        HKdb.xA((NUlR)yy.h(this, 748153133));
        HKdb.xA(this);
        HKdb.xA(this);
    }

    @Override
    public void tick() {
    }

    public NUlR vRMJ() {
        return (NUlR)yy.h(this, 748153133);
    }

    @Override
    public void AWsr() {
        Object object = HKdb.xA(HKdb.xA((aKuV)yy.h(this, -1519392424)));
        while (object.hasNext()) {
            FpQi fpQi = (FpQi)object.next();
            try {
                if ((Long)yy.p(291695492) % (long)fpQi.getInterval() != 0) continue;
                fpQi.qKGr();
            }
            catch (Exception exception) {
                HKdb.xA(HKdb.xA(HKdb.xA(new StringBuilder(KDGY$JAHk.Y("\u719a\u54d1\u1350\u7666\u47b8\u7684\u221d\ue736\u6e45\u635d\uf408\u0af0\u441e\u77b1\ua9f5\u9335\ua292")), fpQi.getName())));
                HKdb.xA(exception);
            }
        }
    }

    @Override
    public String LrGi() {
        return NVIs$JbpD.H("\u762b\u927f\ue0d9\u6a38\uba5e\uc934\ud1af");
    }

    private static Object xA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

