/*
 * Decompiled with CFR 0_123.
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.URL;

@BtuM(value=-10)
public class eHRu
extends Thread {
    private String hJTi = null;

    @Override
    public void run() {
        try {
            URL uRL = new URL(nJPf$sILv.G("\ufc30\u67c9\ue362\uea8b\u73b7\ufae9\u8133\u8783\u9cf2\u5528\u2047\u0478\u4298\u1406\ud51f\ub2aa\u1c37\u998f\u1db9\u23c2\u8ca1\u2501\u388f\uef09\u77dd\ua4d5\ub07d\u8285\ube51"));
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)eHRu.Vs(uRL));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            Object object = eHRu.Vs(bufferedReader);
            eHRu.Vs(bufferedReader);
            o.v(this, -499558462, object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public String getIp() {
        return (String)o.a(this, -499558462);
    }

    private static Object Vs(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

