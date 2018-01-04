/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class sILv
implements qSgW {
    private TNku<File, Long> hdHt = new TNku();
    private TNku<File, Long> nCWL = new TNku();
    private TNku<File, Runnable> PvvJ = new TNku();

    public void yJLS(File file, Runnable runnable) {
        sILv.nJ((TNku)o.a(this, -65579147), file, sILv.nJ(sILv.nJ(file)));
        sILv.nJ((TNku)o.a(this, -723232908), file, sILv.nJ(sILv.nJ(file)));
        sILv.nJ((TNku)o.a(this, -1080207501), file, runnable);
        sILv.nJ(sILv.nJ(sILv.nJ(new StringBuilder(mrFx$WjFM.d("\ufd3c\u4c20\ud04b\u802f\ua01f\uccbd\u39d2\uc2ce\uc454\u0a25\u533c\u6784\ua54f\ud8fb\u47af\u316e\uf34e\u3cb2\u7abe\u0656\u4c49\u5da3\u7f95\u4c5e\u1d18\uf3a3\ua2b8")), sILv.nJ(file))));
    }

    public void VwLY(File file) {
        sILv.nJ((TNku)o.a(this, -65579147), file);
        sILv.nJ((TNku)o.a(this, -723232908), file);
        sILv.nJ((TNku)o.a(this, -1080207501), file);
    }

    public void WaRF() {
        sILv.nJ((TNku)o.a(this, -65579147));
        sILv.nJ((TNku)o.a(this, -723232908));
        sILv.nJ((TNku)o.a(this, -1080207501));
    }

    @Override
    public void owir() {
        if ((Lqeo)o.k(-382707289) == null || (Long)o.k(-619556004) % 20 == 0) {
            return;
        }
        new sILv$1(this);
    }

    @Override
    public String YMWq() {
        return mrFx$WjFM.d("\ubda7\ude3f\ub25a\u809f\u0eb9\u55c1\ueef9\uc2ed\ube3f\u2e1a");
    }

    static /* synthetic */ TNku yJLS(sILv sILv2) {
        return (TNku)o.a(sILv2, -65579147);
    }

    static /* synthetic */ TNku UtIU(sILv sILv2) {
        return (TNku)o.a(sILv2, -723232908);
    }

    static /* synthetic */ TNku biLo(sILv sILv2) {
        return (TNku)o.a(sILv2, -1080207501);
    }

    private static Object nJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

