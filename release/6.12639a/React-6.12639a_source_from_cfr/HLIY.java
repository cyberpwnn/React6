/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class HLIY
extends ggmf {
    private LhyL bYRw;
    public boolean KpCu;

    @Override
    public void start() {
        HLIY.TP(this);
        o.v(this, 1497912875, new uqOm());
        o.v(this, -61910195, true);
        pXmh pXmh2 = new pXmh();
        pXmh2.yJLS(new oUjh());
        pXmh2.yJLS(new IONy());
        pXmh2.yJLS(new WPHK());
        pXmh2.yJLS(new cBGi());
        pXmh2.yJLS(new MSKP());
        pXmh2.yJLS(new QMuP());
        ((LhyL)o.a(this, 1497912875)).yJLS(pXmh2);
    }

    @Override
    public void stop() {
        HLIY.TP(this);
    }

    @Override
    public void tick() {
        new HLIY$1(this);
    }

    static /* synthetic */ LhyL yJLS(HLIY hLIY) {
        return (LhyL)o.a(hLIY, 1497912875);
    }

    private static Object TP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

