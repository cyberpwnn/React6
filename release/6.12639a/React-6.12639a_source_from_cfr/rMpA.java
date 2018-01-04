/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class rMpA
extends ggmf {
    private Smoy scVv;

    @Override
    public void start() {
        new rMpA$1(this, nJPf$sILv.G("\uff9e\u9f30\ubba3\u610a\u783e\uc6ba\uf5cc\u781c\u98ae\u6351\u14d9\uce6e"), 2);
    }

    private void feCR() {
        try {
            o.v(this, -504473988, new rMpA$2(this, (Integer)o.k(-1450813202)));
            rMpA.kg((Smoy)o.a(this, -504473988));
            return;
        }
        catch (Nwmj nwmj) {
            Nwmj nwmj2 = nwmj;
            rMpA.kg(nwmj);
            return;
        }
    }

    @Override
    public void stop() {
        if (((Boolean)o.k(1632262381)).booleanValue()) {
            rMpA.kg((Smoy)o.a(this, -504473988));
        }
    }

    @Override
    public void tick() {
    }

    static /* synthetic */ void yJLS(rMpA rMpA2) {
        rMpA2.feCR();
    }

    private static Object kg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

