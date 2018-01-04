/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class pXmh
extends DirU {
    private boolean GRax = false;

    public pXmh() {
        super((String)pXmh.vg(FMkR$WjFM.a("\ud4b9\udf84\u62fa\u3121\u4cce\ubcfb\u3f78\u9f53\u9701\u09db\u7b31\u076e\uf3ed\u238c\u0c55\uba66\uf192\u1951\u637c\u44aa\uec1b\ufb76\u6fca\ua6ed\u9f9c\ud115\u0f6c\u776b\u9ed5\ud63b\u1e56")));
    }

    @Override
    public void NxWm() {
    }

    @Override
    public boolean OPgL() {
        boolean bl = pXmh.vg((FWER)o.a((TEqA)o.k(911295720), 1286751627), pXmh.vg((biRJ)((Object)o.k(711152348)))).getValue() > (Double)o.k(474896618);
        if (bl != (Boolean)o.a(this, -82553029)) {
            o.v(this, -82553029, bl);
            new pXmh$1(this);
        }
        return bl;
    }

    static /* synthetic */ boolean yJLS(pXmh pXmh2) {
        return (Boolean)o.a(pXmh2, -82553029);
    }

    private static Object vg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

