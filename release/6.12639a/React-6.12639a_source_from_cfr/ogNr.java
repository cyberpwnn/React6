/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class ogNr {
    private static int aDus;
    private xyxr YNaS;
    private JcRS xrmJ;
    private int id;

    static {
        o.w(1059673906, 0);
    }

    public ogNr(xyxr xyxr2, JcRS jcRS) {
        int n = (Integer)o.k(1059673906);
        o.w(1059673906, n + 1);
        this.id = n;
        this.YNaS = xyxr2;
        this.xrmJ = jcRS;
    }

    public xyxr eHRu() {
        return (xyxr)o.a(this, 341858097);
    }

    public void yJLS(xyxr xyxr2) {
        o.v(this, 341858097, xyxr2);
    }

    public JcRS wvyx() {
        return (JcRS)((Object)o.a(this, 1583634224));
    }

    public void yJLS(JcRS jcRS) {
        o.v(this, 1583634224, (Object)jcRS);
    }

    public int getId() {
        return (Integer)o.a(this, -845981905);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Object)((xyxr)o.a(this, 341858097) == null ? 0 : (Object)ogNr.HM((xyxr)o.a(this, 341858097)));
        n2 = n2 * 31 + (Integer)o.a(this, -845981905);
        n2 = n2 * 31 + (Object)((JcRS)((Object)o.a(this, 1583634224)) == null ? 0 : (Object)ogNr.HM((JcRS)((Object)o.a(this, 1583634224))));
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (ogNr.HM(this) != ogNr.HM(object)) {
            return false;
        }
        ogNr ogNr2 = (ogNr)object;
        if ((xyxr)o.a(this, 341858097) == null) {
            if ((xyxr)o.a(ogNr2, 341858097) != null) {
                return false;
            }
        } else if (ogNr.HM((xyxr)o.a(this, 341858097), (xyxr)o.a(ogNr2, 341858097)) == false) {
            return false;
        }
        if (((Integer)o.a(this, -845981905)).intValue() != ((Integer)o.a(ogNr2, -845981905)).intValue()) {
            return false;
        }
        if ((JcRS)((Object)o.a(this, 1583634224)) != (JcRS)((Object)o.a(ogNr2, 1583634224))) {
            return false;
        }
        return true;
    }

    private static Object HM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

