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

class oUpd$1
extends CxNA {
    private final /* synthetic */ Runnable yuww;

    oUpd$1(Runnable runnable) {
        this.yuww = runnable;
    }

    @Override
    public void run() {
        try {
            Object object;
            Object object2;
            oUpd$1.aW(500);
            TNku tNku = new TNku();
            Object object3 = new TNku();
            object3 = oUpd$1.aW(oUpd$1.aW());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])oUpd$1.aW(oUpd$1.aW(), FMkR$WjFM.a("\u177d\udaa2\u1f82\uba98\u0f38\u2df9\u5d20\ubc3f\u5a37\ua957\u1924\u6174\u87d5\uc39a\u0d91")));
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            Object object4 = oUpd$1.aW(dataInputStream);
            int n = 0;
            while (n < object4) {
                object2 = oUpd$1.aW(dataInputStream);
                object = new byte[32];
                oUpd$1.aW(dataInputStream, object);
                oUpd$1.aW(tNku, object2, oUpd$1.aW(object));
                ++n;
            }
            oUpd$1.aW(dataInputStream);
            Lhwj lhwj = new Lhwj();
            oUpd$1.aW(lhwj, oUpd$1.aW(object3));
            oUpd$1.aW(lhwj, oUpd$1.aW(tNku));
            object2 = oUpd$1.aW(lhwj);
            while (object2.hasNext()) {
                object = (String)object2.next();
                if (oUpd$1.aW(tNku, object) != false) {
                    if (oUpd$1.aW(object3, object) != false) {
                        if (oUpd$1.aW((byte[])oUpd$1.aW((ByteBuffer)oUpd$1.aW(tNku, object)), (byte[])oUpd$1.aW((ByteBuffer)oUpd$1.aW(object3, object))) == false) {
                            if (oUpd$1.aW((feCR)o.k(1787909858), object) == false) {
                                oUpd$1.aW((PrintStream)o.k(-1536601438), oUpd$1.aW(oUpd$1.aW(oUpd$1.aW(oUpd$1.aW(oUpd$1.aW(oUpd$1.aW(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), object), FMkR$WjFM.a("\u173b\udae6\u1fd2\ubadf")), (psKX)((Object)o.k(568215020))), FMkR$WjFM.a("\u175d\uda8a\u1fa5\ubab3\u0f18\u2dcf"))));
                                oUpd$1.aW((feCR)o.k(1787909858), object);
                            } else {
                                oUpd$1.aW((PrintStream)o.k(-1536601438), oUpd$1.aW(oUpd$1.aW(oUpd$1.aW(oUpd$1.aW(oUpd$1.aW(oUpd$1.aW(new StringBuilder(), (psKX)((Object)o.k(-1880078855))), object), FMkR$WjFM.a("\u173b\udae6\u1fd2\ubadf")), (psKX)((Object)o.k(-1868409976))), FMkR$WjFM.a("\u174d\uda8e\u1fbe\ubab6\u0f1b\u2dc2\u5d15\ubc09"))));
                            }
                        }
                    }
                }
                oUpd$1.aW(5);
            }
        }
        catch (Throwable throwable) {
            oUpd$1.aW((feCR)o.k(1787909858), FMkR$WjFM.a("\u173e\udaae\u1f94\uba9c\u0f38\u2dfb\u5d24\ubc24\u5a31\ua957"));
        }
        new oUpd$1$1(this, (Runnable)o.a(this, -581085616));
    }

    private static Object aW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

