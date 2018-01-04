/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class URWm {
    private String[] feyM;
    private int index = 0;
    public static final URWm GcqQ;
    public static final URWm YFaj;
    public static final URWm fwYx;
    public static final URWm aFHL;
    public static final URWm bjll;

    static {
        o.w(-1102754367, new URWm());
        o.w(1832930752, new URWm(mrFx$WjFM.d("\u3fbf"), mrFx$WjFM.d("\u3fbe"), mrFx$WjFM.d("\u3fbd"), mrFx$WjFM.d("\u3fbc"), mrFx$WjFM.d("\u3fbb"), mrFx$WjFM.d("\u3fba"), mrFx$WjFM.d("\u3fb9"), mrFx$WjFM.d("\u3fb8")));
        o.w(-765243969, new URWm(mrFx$WjFM.d("\u3c7b"), mrFx$WjFM.d("\u3c7a"), mrFx$WjFM.d("\u3c79"), mrFx$WjFM.d("\u3c78")));
        o.w(404966846, new URWm(mrFx$WjFM.d("\u3f0f"), mrFx$WjFM.d("\u3f0e"), mrFx$WjFM.d("\u3f0d"), mrFx$WjFM.d("\u3f0c"), mrFx$WjFM.d("\u3f0b"), mrFx$WjFM.d("\u3f0a")));
        o.w(1293045181, new URWm(mrFx$WjFM.d("\u3f23"), mrFx$WjFM.d("\u3f22"), mrFx$WjFM.d("\u3f21"), mrFx$WjFM.d("\u3f20"), mrFx$WjFM.d("\u3f21"), mrFx$WjFM.d("\u3f22")));
    }

    public /* varargs */ URWm(String ... arrstring) {
        this.feyM = arrstring;
    }

    public URWm() {
        this(FMkR$WjFM.a("\ubdf0"), FMkR$WjFM.a("\ubdf3"), FMkR$WjFM.a("\ubdf4"), FMkR$WjFM.a("\ubdf1"), FMkR$WjFM.a("\ubdf5"), FMkR$WjFM.a("\ubdf2"));
    }

    public String toString() {
        if (((String[])o.a(this, 1806912956)).length > (Integer)o.a(this, -1316205125) + 1) {
            URWm uRWm = this;
            o.v(uRWm, -1316205125, (Integer)o.a(uRWm, -1316205125) + 1);
        } else {
            o.v(this, -1316205125, 0);
        }
        return URWm.zR(new StringBuilder((String)URWm.zR(((String[])o.a(this, 1806912956))[(Integer)o.a(this, -1316205125)])));
    }

    public String[] GIUV() {
        return (String[])o.a(this, 1806912956);
    }

    public int getIndex() {
        return (Integer)o.a(this, -1316205125);
    }

    private static Object zR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

