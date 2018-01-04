/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class SKsf {
    private int number = 0;
    private int max;

    public SKsf(int n) {
        this.max = n;
    }

    public SKsf HCPo(int n) {
        o.v(this, -1196475051, n);
        this.jhjy();
        return this;
    }

    public SKsf OihG(int n) {
        SKsf sKsf = this;
        o.v(sKsf, -1196475051, (Integer)o.a(sKsf, -1196475051) + n);
        this.jhjy();
        return this;
    }

    public SKsf uWRY(int n) {
        SKsf sKsf = this;
        o.v(sKsf, -1196475051, (Integer)o.a(sKsf, -1196475051) - n);
        this.jhjy();
        return this;
    }

    public int get() {
        return (Integer)o.a(this, -1196475051);
    }

    public void jhjy() {
        if ((Integer)o.a(this, -1196475051) < 0) {
            o.v(this, -1196475051, (Integer)o.a(this, -1139327660) - (Object)(SKsf.iA((Integer)o.a(this, -1196475051)) > (Integer)o.a(this, -1139327660) ? ((Integer)o.a(this, -1139327660)).intValue() : (Object)SKsf.iA((Integer)o.a(this, -1196475051))));
        }
        SKsf sKsf = this;
        o.v(sKsf, -1196475051, (Integer)o.a(sKsf, -1196475051) % (Integer)o.a(this, -1139327660));
    }

    public int getMax() {
        return (Integer)o.a(this, -1139327660);
    }

    public void aeiw(int n) {
        o.v(this, -1139327660, n);
        this.jhjy();
    }

    private static Object iA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

