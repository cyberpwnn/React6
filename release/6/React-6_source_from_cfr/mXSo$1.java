/*
 * Decompiled with CFR 0_123.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

final class mXSo$1
extends dDce {
    final /* synthetic */ Runnable fuvg;

    mXSo$1(Runnable runnable) {
        this.fuvg = runnable;
    }

    @Override
    public void run() {
        try {
            Object object;
            Object object2;
            mXSo$1.Ss(500);
            ktOu ktOu2 = new ktOu();
            Object object3 = new ktOu();
            object3 = mXSo$1.Ss(mXSo$1.Ss());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])mXSo$1.Ss(mXSo$1.Ss(), KUXS$dwji.S("\u872d\ua13b\u92b6\ua11f\ua507\u04c6\ue3b0\u7898\u13fc\ue10c\ufc5c\uf7d2\u2f2a\u29fd\ue1dc")));
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            Object object4 = mXSo$1.Ss(dataInputStream);
            for (int i = 0; i < object4; ++i) {
                object2 = mXSo$1.Ss(dataInputStream);
                object = new byte[32];
                mXSo$1.Ss(dataInputStream, object);
                mXSo$1.Ss(ktOu2, object2, mXSo$1.Ss(object));
            }
            mXSo$1.Ss(dataInputStream);
            QyFw qyFw = new QyFw();
            mXSo$1.Ss(qyFw, mXSo$1.Ss(object3));
            mXSo$1.Ss(qyFw, mXSo$1.Ss(ktOu2));
            object2 = mXSo$1.Ss(qyFw);
            while (object2.hasNext()) {
                object = (String)object2.next();
                if (mXSo$1.Ss(ktOu2, object) != false) {
                    if (mXSo$1.Ss(object3, object) != false) {
                        if (mXSo$1.Ss((byte[])mXSo$1.Ss((ByteBuffer)mXSo$1.Ss(ktOu2, object)), (byte[])mXSo$1.Ss((ByteBuffer)mXSo$1.Ss(object3, object))) == false) {
                            if (mXSo$1.Ss((wfPa)cv.e(1675424468), object) == false) {
                                mXSo$1.Ss((PrintStream)cv.e(363401407), mXSo$1.Ss(mXSo$1.Ss(mXSo$1.Ss(mXSo$1.Ss(mXSo$1.Ss(mXSo$1.Ss(new StringBuilder(), (APKB)((Object)cv.e(653004664))), object), KUXS$dwji.S("\u876b\ua17f\u92e6\ua158")), (APKB)((Object)cv.e(-314502936))), KUXS$dwji.S("\u870d\ua113\u9291\ua134\ua527\u04f0"))));
                                mXSo$1.Ss((wfPa)cv.e(1675424468), object);
                            } else {
                                mXSo$1.Ss((PrintStream)cv.e(363401407), mXSo$1.Ss(mXSo$1.Ss(mXSo$1.Ss(mXSo$1.Ss(mXSo$1.Ss(mXSo$1.Ss(new StringBuilder(), (APKB)((Object)cv.e(653004664))), object), KUXS$dwji.S("\u876b\ua17f\u92e6\ua158")), (APKB)((Object)cv.e(1489703379))), KUXS$dwji.S("\u871d\ua117\u928a\ua131\ua524\u04fd\ue385\u78ae"))));
                            }
                        }
                    }
                }
                mXSo$1.Ss(5);
            }
        }
        catch (Throwable throwable) {
            mXSo$1.Ss((wfPa)cv.e(1675424468), KUXS$dwji.S("\u876e\ua137\u92a0\ua11b\ua507\u04c4\ue3b4\u7883\u13fa\ue10c"));
        }
        new mXSo$1$1(this);
    }

    private static Object Ss(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

