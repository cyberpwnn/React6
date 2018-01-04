/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class XRig
extends DirU {
    private boolean GRax = false;

    public XRig() {
        super((String)XRig.Ds(FMkR$WjFM.a("\u8281\u8230\u42e3\uc1c5\ueaaf\ub1f6\udb8b\ub650\u2c9d\u0353\uaad4\u45b6\ue17f\u847a\udd63\u6c78\udca9\u9c99\u2c9a\u0cd2\u5ef6\u51a3\u5575\u2647\ue54f\u7688\uca5e\ubebe\uaa4a\uebbb\ue5f6\u9dee\u0612\u4a12\ua45a\u2b61\u4cb6\u600a\u32eb\ud72f\u8b56\u9a6f\u01ce\ua315\ueee6\u2f29\u0754.\u2777")));
    }

    @Override
    public void NxWm() {
    }

    public void ksyX() {
    }

    @Override
    public boolean OPgL() {
        boolean bl = false;
        double d = 1000000.0;
        double d2 = XRig.Ds((FWER)o.a((TEqA)o.k(911295720), 1286751627), XRig.Ds((biRJ)((Object)o.k(711152348)))).getValue() * 1000000.0;
        double d3 = XRig.Ds((FWER)o.a((TEqA)o.k(911295720), 1286751627), XRig.Ds((biRJ)((Object)o.k(-1952623888)))).getValue();
        Object object = XRig.Ds(d2 * (Double)o.k(1148410086) + (double)((Long)o.k(-1553180441)).longValue(), (Long)o.k(-1264953111), (Long)o.k(-1231136536));
        if (d3 > object && d3 / 1000000.0 - object / 1000000.0 > (Double)o.k(-348759835)) {
            bl = true;
        }
        if (bl != (Boolean)o.a(this, 314464230)) {
            o.v(this, 314464230, bl);
            new XRig$1(this);
        }
        return bl;
    }

    static /* synthetic */ boolean yJLS(XRig xRig) {
        return (Boolean)o.a(xRig, 314464230);
    }

    private static Object Ds(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

