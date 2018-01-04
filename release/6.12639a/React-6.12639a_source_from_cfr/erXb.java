/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class erXb {
    /*
     * Enabled aggressive block sorting
     */
    public static int Dqxl() {
        int n = 0;
        Object object = erXb.ks();
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        while (erXb.ks() - object < 1268) {
            Object object2;
            CEEt cEEt = new CEEt(1234);
            OihG oihG = new OihG(99999999);
            d = 0.0;
            d2 = 0.0;
            d3 = 0.0;
            int n2 = 0;
            while (n2 < 1000) {
                object2 = erXb.ks();
                double d4 = (double)(n2 + 10000 - 401) + 3.141592653589793 + 147.15177646857694;
                Object object3 = erXb.ks(d4 * 4.0 - 2.0);
                Object object4 = erXb.ks(object3 + d4 - 4.0);
                double d5 = 3.141592653589793 / object4;
                double d6 = d4 * 2.718281828459045;
                reference var24_17 = erXb.ks(d4, object3) + erXb.ks(d6 - d5);
                Object object5 = erXb.ks(d4 + object3 - object4 + d5 - d6 + var24_17, 0.02521);
                Object object6 = erXb.ks(d4 + object5 - object4 / d5 + var24_17 - d6, 0.116342);
                reference var30_20 = erXb.ks(erXb.ks(erXb.ks(object6 - object5 + d4 + object3) + d5 + d6) - var24_17) + object5;
                Object object7 = erXb.ks(erXb.ks(d4 - var24_17 + var30_20) + d5 + erXb.ks(object5 + 4.0));
                Object object8 = erXb.ks(object7 + object5 - var30_20 + object7 / 4.0 * d5 + erXb.ks(object4));
                Object object9 = erXb.ks(object7, 3.0);
                erXb.ks(object9 + object8 - object7 + var24_17 * d6);
                d += (Object)(erXb.ks() - object2) / 1000000.0;
                ++n2;
            }
            n2 = 0;
            while (n2 < 1000) {
                object2 = erXb.ks();
                erXb.ks(cEEt, 12 + n2 * 120, - n2 + n2 * 45, (double)n2, n2 + 5, 6.0, 12.0, false);
                d2 += (Object)(erXb.ks() - object2) / 1000000.0;
                ++n2;
            }
            n2 = 0;
            while (n2 < 1000) {
                object2 = erXb.ks();
                erXb.ks(oihG, 12 + n2 * 120, - n2 + n2 * 45, (double)n2, n2 + 5, 6.0, 12.0, false);
                d3 += (Object)(erXb.ks() - object2) / 1000000.0;
                ++n2;
            }
            n2 = (int)(50.0 - (d + d3 + d2));
            n += n2 + 1;
        }
        return n + 1100;
    }

    private static Object ks(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

