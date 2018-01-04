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
import java.net.ServerSocket;
import java.net.SocketTimeoutException;

public abstract class PeBo
extends Thread
implements LrIE {
    private int port;
    private ServerSocket FqYm;
    private mrFx BvNc = new mrFx((XAfJ)((Object)o.k(-497136612)), null, null);

    public PeBo(int n) {
        this.port = n;
    }

    @Override
    public mrFx nuLT() {
        return (mrFx)o.a(this, -1853538652);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        try {
            this.HnQt();
            ** GOTO lbl61
        }
        catch (IOException v0) {
            var1_1 = v0;
            PeBo.qQ(v0);
            return;
        }
lbl-1000: // 1 sources:
        {
            try {
                var1_2 = PeBo.qQ((ServerSocket)o.a(this, -721535325));
                PeBo.qQ((PrintStream)o.k(-1536601438), nJPf$sILv.G("\u540e\u9c93\u2300\u96ba\u1504\ua352\u0517\uc6a8\u0221\u6e89\ube24\uce8f\ua5ec\uf762\ua5da\u82e0\u2723\u3a00\u4648"));
                var2_4 = new Elru((OutputStream)PeBo.qQ(var1_2));
                var3_5 = new rFBK((InputStream)PeBo.qQ(var1_2));
                PeBo.qQ((mrFx)o.a(this, -1853538652), var2_4, var3_5);
                var4_6 = PeBo.qQ((mrFx)o.a(this, -1853538652));
                PeBo.qQ((PrintStream)o.k(-1536601438), PeBo.qQ(PeBo.qQ(new StringBuilder(nJPf$sILv.G("\u5471\u9cd1\u234e")), var4_6.dfot())));
                var5_7 = this.VwLY((JROj)var4_6);
                PeBo.qQ((mrFx)o.a(this, -1853538652), var5_7);
                PeBo.qQ((PrintStream)o.k(-1536601438), PeBo.qQ(PeBo.qQ(new StringBuilder(nJPf$sILv.G("\u5460\u9cc2\u234e")), var5_7.dfot())));
                PeBo.qQ(var2_4);
                PeBo.qQ(var1_2);
                continue;
            }
            catch (SocketTimeoutException var1_3) {
                continue;
            }
            catch (Exception v1) {
                var1_2 = v1;
                PeBo.qQ(v1);
            }
lbl61: // 4 sources:
            ** while (!PeBo.interrupted())
        }
lbl62: // 1 sources:
        try {
            this.DXtK();
            return;
        }
        catch (IOException v2) {
            var1_2 = v2;
            PeBo.qQ(v2);
            return;
        }
    }

    private void HnQt() throws IOException {
        o.v(this, -721535325, new ServerSocket((Integer)o.a(this, -1209254255)));
        PeBo.qQ((ServerSocket)o.a(this, -721535325), 1000);
        PeBo.qQ((ServerSocket)o.a(this, -721535325), true, 2, false);
    }

    private void DXtK() throws IOException {
        PeBo.qQ((ServerSocket)o.a(this, -721535325));
    }

    @Override
    public int getPort() {
        return (Integer)o.a(this, -1209254255);
    }

    @Override
    public abstract JROj VwLY(JROj var1);

    private static Object qQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

