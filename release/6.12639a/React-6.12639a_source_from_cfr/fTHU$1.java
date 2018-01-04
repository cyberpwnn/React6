/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class fTHU$1
implements Runnable {
    final /* synthetic */ fTHU sAbF;

    fTHU$1(fTHU fTHU2) {
        this.sAbF = fTHU2;
    }

    @Override
    public void run() {
        fTHU$1.AN(nJPf$sILv.G("\u21f1\ucb74\uffc9\u34dc\ud55c\u4e09\uce67\u74ee\ue1b1\u1e7c\u42d3\u3041\ud751\u5e6d\ucf64"));
        fTHU$1.AN(fTHU$1.AN((fTHU)o.a(this, 1693142296)));
    }

    private static Object AN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

