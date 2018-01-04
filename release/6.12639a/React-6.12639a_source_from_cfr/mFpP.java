/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class mFpP
implements Runnable {
    public static int id;
    public int idx;

    static {
        o.w(-1823916511, 0);
    }

    public mFpP() {
        int n = (Integer)o.k(-1823916511);
        o.w(-1823916511, n + 1);
        this.idx = n;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Integer)o.a(this, -778879456);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (mFpP.Em(this) != mFpP.Em(object)) {
            return false;
        }
        mFpP mFpP2 = (mFpP)object;
        if (((Integer)o.a(this, -778879456)).intValue() != ((Integer)o.a(mFpP2, -778879456)).intValue()) {
            return false;
        }
        return true;
    }

    private static Object Em(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

