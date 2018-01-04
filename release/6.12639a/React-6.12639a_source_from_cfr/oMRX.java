/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class oMRX
extends ktLW<feCR<StackTraceElement>> {
    public oMRX(long l, feCR<StackTraceElement> feCR2, String string) {
        super(l, feCR2, string);
    }

    @Override
    public vbpi ivSs() {
        vbpi vbpi2 = new vbpi();
        JRRx jRRx = new JRRx();
        Object object = oMRX.FD((feCR)this.YoVV());
        while (object.hasNext()) {
            StackTraceElement stackTraceElement = (StackTraceElement)object.next();
            vbpi vbpi3 = new vbpi();
            oMRX.FD(vbpi3, nJPf$sILv.G("\u3d19\u676b\u7aed\u2f73"), oMRX.FD(stackTraceElement));
            oMRX.FD(vbpi3, nJPf$sILv.G("\u3d13\u676b\u7aef\u2f73"), oMRX.FD(stackTraceElement));
            oMRX.FD(vbpi3, nJPf$sILv.G("\u3d16\u676e\u7ae2\u2f65\u3ac2"), oMRX.FD(stackTraceElement));
            oMRX.FD(vbpi3, nJPf$sILv.G("\u3d18\u6767\u7af7\u2f7e\u3ade\u9703"), oMRX.FD(stackTraceElement));
            oMRX.FD(jRRx, vbpi3);
        }
        oMRX.FD(vbpi2, nJPf$sILv.G("\u3d01\u6770\u7ae2\u2f75\u3ad4"), jRRx);
        return vbpi2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void yJLS(vbpi vbpi2) {
        feCR feCR2 = new feCR();
        Object object = oMRX.FD(vbpi2, mrFx$WjFM.d("\u029c\ua0e4\ue13f\ud49f\ue6bc"));
        int n = 0;
        while (n < oMRX.FD(object)) {
            Object object2 = oMRX.FD(object, n);
            StackTraceElement stackTraceElement = new StackTraceElement((String)oMRX.FD(object2, mrFx$WjFM.d("\u028b\ua0fa\ue13f\ud48f\ue6aa")), (String)oMRX.FD(object2, mrFx$WjFM.d("\u0285\ua0f3\ue12a\ud494\ue6b6\ueb0c")), (String)oMRX.FD(object2, mrFx$WjFM.d("\u028e\ua0ff\ue132\ud499")), (int)oMRX.FD(object2, mrFx$WjFM.d("\u0284\ua0ff\ue130\ud499")));
            oMRX.FD(feCR2, stackTraceElement);
            ++n;
        }
        o.v(this, 1920422689, feCR2);
    }

    private static Object FD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

