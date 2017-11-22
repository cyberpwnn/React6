/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class loHn {
    private int number = 0;
    private int max;

    public loHn(int n) {
        this.max = n;
    }

    public loHn gEXv(int n) {
        cv.e(this, 173011973, n);
        this.Rsag();
        return this;
    }

    public loHn tvRU(int n) {
        loHn loHn2 = this;
        cv.e(loHn2, 173011973, (Integer)cv.b(loHn2, 173011973) + n);
        this.Rsag();
        return this;
    }

    public loHn dntE(int n) {
        loHn loHn2 = this;
        cv.e(loHn2, 173011973, (Integer)cv.b(loHn2, 173011973) - n);
        this.Rsag();
        return this;
    }

    public int get() {
        return (Integer)cv.b(this, 173011973);
    }

    public void Rsag() {
        if ((Integer)cv.b(this, 173011973) < 0) {
            cv.e(this, 173011973, (Integer)cv.b(this, -1010437116) - (Object)(loHn.YD((Integer)cv.b(this, 173011973)) > (Integer)cv.b(this, -1010437116) ? ((Integer)cv.b(this, -1010437116)).intValue() : (Object)loHn.YD((Integer)cv.b(this, 173011973))));
        }
        loHn loHn2 = this;
        cv.e(loHn2, 173011973, (Integer)cv.b(loHn2, 173011973) % (Integer)cv.b(this, -1010437116));
    }

    public int getMax() {
        return (Integer)cv.b(this, -1010437116);
    }

    public void RbOr(int n) {
        cv.e(this, -1010437116, n);
        this.Rsag();
    }

    private static Object YD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

