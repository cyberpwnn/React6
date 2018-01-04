/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;

public class JAPK
implements Lqhy {
    private int port;
    private String address;
    private mrFx BvNc;
    private Socket socket;

    public JAPK(String string, int n) {
        this.port = n;
        this.address = string;
        this.BvNc = new mrFx((XAfJ)((Object)o.k(-1905570811)), null, null);
    }

    private void connect() throws IOException {
        o.v(this, 53886667, new Socket());
        JAPK.Zp((Socket)o.a(this, 53886667), 16);
        JAPK.Zp((Socket)o.a(this, 53886667), true);
        JAPK.Zp((Socket)o.a(this, 53886667), 10000);
        JAPK.Zp((Socket)o.a(this, 53886667), true, 2, false);
        JAPK.Zp((Socket)o.a(this, 53886667), new InetSocketAddress((String)o.a(this, -1872347434), (int)((Integer)o.a(this, -1878835499))), 1000);
    }

    private void disconnect() throws IOException {
        JAPK.Zp((Socket)o.a(this, 53886667));
    }

    @Override
    public int getPort() {
        return (Integer)o.a(this, -1878835499);
    }

    @Override
    public String getAddress() {
        return (String)o.a(this, -1872347434);
    }

    @Override
    public JROj yJLS(JROj jROj) throws Exception {
        this.connect();
        JAPK.Zp((PrintStream)o.k(-1536601438), JAPK.Zp(JAPK.Zp(new StringBuilder(FMkR$WjFM.a("\u984a\ufd93\ud853")), jROj.dfot())));
        rFBK rFBK2 = new rFBK((InputStream)JAPK.Zp((Socket)o.a(this, 53886667)));
        Elru elru = new Elru((OutputStream)JAPK.Zp((Socket)o.a(this, 53886667)));
        JAPK.Zp((mrFx)o.a(this, 883179072), elru, rFBK2);
        JAPK.Zp((mrFx)o.a(this, 883179072), jROj);
        JAPK.Zp(elru);
        Object object = JAPK.Zp((mrFx)o.a(this, 883179072));
        JAPK.Zp((PrintStream)o.k(-1536601438), JAPK.Zp(JAPK.Zp(new StringBuilder(FMkR$WjFM.a("\u985b\ufd80\ud853")), object.dfot())));
        this.disconnect();
        return object;
    }

    @Override
    public mrFx nuLT() {
        return (mrFx)o.a(this, 883179072);
    }

    private static Object Zp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

