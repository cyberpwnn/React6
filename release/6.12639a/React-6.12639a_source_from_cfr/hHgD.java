/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class hHgD {
    private vsrN ObhC;
    private String[] APnk;
    private String SMRJ;

    public /* varargs */ hHgD(vsrN vsrN2, String ... arrstring) {
        this.APnk = arrstring;
        this.ObhC = vsrN2;
        this.SMRJ = hHgD.MD(vsrN2, hHgD.MD(vsrN2), arrstring);
    }

    public String toString() {
        return (String)o.a(this, 765679536);
    }

    public vsrN XcrK() {
        return (vsrN)((Object)o.a(this, -526493777));
    }

    public String[] yAmM() {
        return (String[])o.a(this, 388061102);
    }

    public String Qgnj() {
        return (String)o.a(this, 765679536);
    }

    private static Object MD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

