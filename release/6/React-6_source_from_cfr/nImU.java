/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class nImU {
    public static int kQcX() {
        int n = 0;
        Object object = nImU.FK();
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        do {
            int n2;
            Object object2;
            if (nImU.FK() - object >= 1268) break;
            iSqp iSqp2 = new iSqp(1234);
            RbOr rbOr = new RbOr(99999999);
            d = 0.0;
            d2 = 0.0;
            d3 = 0.0;
            for (n2 = 0; n2 < 1000; ++n2) {
                object2 = nImU.FK();
                double d4 = (double)(n2 + 10000 - 401) + 3.141592653589793 + 147.15177646857694;
                Object object3 = nImU.FK(d4 * 4.0 - 2.0);
                Object object4 = nImU.FK(object3 + d4 - 4.0);
                double d5 = 3.141592653589793 / object4;
                double d6 = d4 * 2.718281828459045;
                reference var24_17 = nImU.FK(d4, object3) + nImU.FK(d6 - d5);
                Object object5 = nImU.FK(d4 + object3 - object4 + d5 - d6 + var24_17, 0.02521);
                Object object6 = nImU.FK(d4 + object5 - object4 / d5 + var24_17 - d6, 0.116342);
                reference var30_20 = nImU.FK(nImU.FK(nImU.FK(object6 - object5 + d4 + object3) + d5 + d6) - var24_17) + object5;
                Object object7 = nImU.FK(nImU.FK(d4 - var24_17 + var30_20) + d5 + nImU.FK(object5 + 4.0));
                Object object8 = nImU.FK(object7 + object5 - var30_20 + object7 / 4.0 * d5 + nImU.FK(object4));
                Object object9 = nImU.FK(object7, 3.0);
                nImU.FK(object9 + object8 - object7 + var24_17 * d6);
                d += (Object)(nImU.FK() - object2) / 1000000.0;
            }
            for (n2 = 0; n2 < 1000; ++n2) {
                object2 = nImU.FK();
                nImU.FK(iSqp2, 12 + n2 * 120, - n2 + n2 * 45, (double)n2, n2 + 5, 6.0, 12.0, false);
                d2 += (Object)(nImU.FK() - object2) / 1000000.0;
            }
            for (n2 = 0; n2 < 1000; ++n2) {
                object2 = nImU.FK();
                nImU.FK(rbOr, 12 + n2 * 120, - n2 + n2 * 45, (double)n2, n2 + 5, 6.0, 12.0, false);
                d3 += (Object)(nImU.FK() - object2) / 1000000.0;
            }
            n2 = (int)(50.0 - (d + d3 + d2));
            n += n2 + 1;
        } while (true);
        return n + 1100;
    }

    private static Object FK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

