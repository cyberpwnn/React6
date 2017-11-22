/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class gyID$2
implements Runnable {
    final /* synthetic */ gyID Rkdw;

    gyID$2(gyID gyID2) {
        this.Rkdw = gyID2;
    }

    @Override
    public void run() {
        gyID$2.QA(gyID$2.QA((gyID)cv.b(this, -1310854041)));
        gyID$2.QA((gyID)cv.b(this, -1310854041));
        gyID gyID2 = (gyID)cv.b(this, -1310854041);
        cv.e(gyID2, -1951599514, (Integer)cv.b(gyID2, -1951599514) + 1);
        gyID$2.QA(gyID$2.QA((gyID)cv.b(this, -1310854041)));
        gyID$2.QA((gyID)cv.b(this, -1310854041), gyID$2.QA(gyID$2.QA((gyID)cv.b(this, -1310854041))));
        gyID gyID3 = (gyID)cv.b(this, -1310854041);
        gyID$2.QA(gyID3, gyID$2.QA(gyID3) + gyID$2.QA((gyID)cv.b(this, -1310854041)));
        gyID$2.QA(gyID$2.QA((gyID)cv.b(this, -1310854041)));
        gyID gyID4 = (gyID)cv.b(this, -1310854041);
        gyID$2.QA(gyID4, gyID$2.QA(gyID4) + gyID$2.QA(gyID$2.QA((gyID)cv.b(this, -1310854041))));
        gyID$2.QA(gyID$2.QA((gyID)cv.b(this, -1310854041)));
        gyID$2.QA(gyID$2.QA((gyID)cv.b(this, -1310854041)));
        gyID$2.QA(gyID$2.QA((gyID)cv.b(this, -1310854041)));
    }

    private static Object QA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

