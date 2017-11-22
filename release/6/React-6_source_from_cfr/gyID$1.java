/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class gyID$1
implements Runnable {
    final /* synthetic */ gyID Rkdw;

    gyID$1(gyID gyID2) {
        this.Rkdw = gyID2;
    }

    @Override
    public void run() {
        gyID$1.Qf(gyID$1.Qf((gyID)cv.b(this, 1839789234)));
        gyID$1.Qf((gyID)cv.b(this, 1839789234));
        gyID$1.Qf(gyID$1.Qf((gyID)cv.b(this, 1839789234)));
        gyID$1.Qf((gyID)cv.b(this, 1839789234), true);
        gyID$1.Qf(gyID$1.Qf((gyID)cv.b(this, 1839789234)));
        gyID$1.Qf((gyID)cv.b(this, 1839789234), gyID$1.Qf(gyID$1.Qf((gyID)cv.b(this, 1839789234))));
        gyID$1.Qf((gyID)cv.b(this, 1839789234), gyID$1.Qf(gyID$1.Qf((gyID)cv.b(this, 1839789234))));
        gyID$1.Qf((gyID)cv.b(this, 1839789234), gyID$1.Qf((gyID)cv.b(this, 1839789234)));
        gyID$1.Qf(gyID$1.Qf((gyID)cv.b(this, 1839789234)));
        gyID$1.Qf(gyID$1.Qf((gyID)cv.b(this, 1839789234)));
    }

    private static Object Qf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

