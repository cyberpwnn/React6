/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class gyID$3
implements Runnable {
    final /* synthetic */ gyID Rkdw;
    private final /* synthetic */ int biqo;

    gyID$3(gyID gyID2, int n) {
        this.Rkdw = gyID2;
        this.biqo = n;
    }

    @Override
    public void run() {
        gyID$3.tU(gyID$3.tU((gyID)cv.b(this, 1376908387)));
        gyID$3.tU((gyID)cv.b(this, 1376908387));
        gyID gyID2 = (gyID)cv.b(this, 1376908387);
        cv.e(gyID2, -1951599514, (Integer)cv.b(gyID2, -1951599514) + 1);
        gyID$3.tU(gyID$3.tU((gyID)cv.b(this, 1376908387)));
        gyID$3.tU((gyID)cv.b(this, 1376908387), gyID$3.tU(gyID$3.tU((gyID)cv.b(this, 1376908387))));
        gyID gyID3 = (gyID)cv.b(this, 1376908387);
        gyID$3.tU(gyID3, gyID$3.tU(gyID3) + gyID$3.tU((gyID)cv.b(this, 1376908387)));
        gyID$3.tU(gyID$3.tU((gyID)cv.b(this, 1376908387)));
        gyID gyID4 = (gyID)cv.b(this, 1376908387);
        gyID$3.tU(gyID4, gyID$3.tU(gyID4) + gyID$3.tU(gyID$3.tU((gyID)cv.b(this, 1376908387))));
        gyID$3.tU(gyID$3.tU((gyID)cv.b(this, 1376908387)));
        gyID$3.tU(gyID$3.tU((gyID)cv.b(this, 1376908387)));
        gyID$3.tU(gyID$3.tU((gyID)cv.b(this, 1376908387)));
        if ((Integer)cv.b((gyID)cv.b(this, 1376908387), -1951599514) >= (Integer)cv.b(this, -1389628318)) {
            gyID$3.tU((gyID)cv.b(this, 1376908387));
        }
    }

    private static Object tU(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

