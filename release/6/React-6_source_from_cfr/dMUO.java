/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class dMUO
implements Runnable {
    public static int id;
    public int idx;

    static {
        cv.V(-1074136634, 0);
    }

    public dMUO() {
        int n = (Integer)cv.e(-1074136634);
        cv.V(-1074136634, n + 1);
        this.idx = n;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Integer)cv.b(this, -376636991);
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (dMUO.EF(this) != dMUO.EF(object)) {
            return false;
        }
        dMUO dMUO2 = (dMUO)object;
        if (((Integer)cv.b(this, -376636991)).intValue() != ((Integer)cv.b(dMUO2, -376636991)).intValue()) {
            return false;
        }
        return true;
    }

    private static Object EF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

