/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.plugin.Plugin;

@tvby
public class Bcie
extends ggmf
implements qSgW {
    private TNku<String, Integer> NgnK = new TNku();

    @Override
    public void start() {
        Bcie.rv(this);
        new Bcie$1(this, mrFx$WjFM.d("\u7b2a\u8ef1\uf5e0\udfbf\uf69c\ua30a"));
    }

    @Override
    public void stop() {
        Bcie.rv(this);
    }

    @bhlC
    @Override
    public void owir() {
        Object object = Bcie.rv(Bcie.rv(Bcie.rv((FWER)o.a((TEqA)o.k(911295720), 1286751627))));
        Bcie.rv(Bcie.rv(Bcie.rv((FWER)o.a((TEqA)o.k(911295720), 1286751627))));
        new Bcie$2(this, (TNku)object);
    }

    @Override
    public String YMWq() {
        return mrFx$WjFM.d("\ubbdf\u885c\ub5c6\u5523\ub404\udb5f\u308e\u8d43\u77a1\u784d\u08aa\u0f5b\u7648\u32bd\u2462\u7bbf");
    }

    @uFVW
    @Override
    public void tick() {
    }

    public TNku<String, Integer> XAfJ() {
        return (TNku)o.a(this, -193964326);
    }

    public void yJLS(XAcv<Plugin> xAcv) {
        Object object = Bcie.rv();
        new Bcie$3(this, (Thread)object, xAcv);
    }

    static /* synthetic */ TNku yJLS(Bcie bcie) {
        return (TNku)o.a(bcie, -193964326);
    }

    private static Object rv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

