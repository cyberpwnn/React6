/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class UtIU$1$2
extends vbvg {
    final /* synthetic */ UtIU$1 dLuw;
    private final /* synthetic */ XAcv SnJT;
    private final /* synthetic */ XAcv Elpk;
    private final /* synthetic */ Integer[] CxNA;

    UtIU$1$2(UtIU$1 utIU$1, String string, int n, XAcv xAcv, XAcv xAcv2, Integer[] arrinteger) {
        this.dLuw = utIU$1;
        this.SnJT = xAcv;
        this.Elpk = xAcv2;
        this.CxNA = arrinteger;
        super(string, n);
    }

    @Override
    public void run() {
        try {
            UtIU$1$2.qQ((XAcv)o.a(this, 2020366023), UtIU$1$2.qQ(1.0));
            UtIU$1$2.qQ((XAcv)o.a(this, -378382650), ((Integer[])o.a(this, -883861819))[0]);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static Object qQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

