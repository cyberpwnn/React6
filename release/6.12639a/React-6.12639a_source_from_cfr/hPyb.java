/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class hPyb
extends maKI {
    private String HxJV;

    public hPyb() {
        super((Cfqo)((Object)o.k(1306348584)));
    }

    public hPyb(String string) {
        super((Cfqo)((Object)o.k(1306348584)));
        this.HxJV = string;
    }

    @Override
    public void yJLS(Elru elru) throws IOException {
        hPyb.Go(elru, (String)o.a(this, -2076095475));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws IOException {
        o.v(this, -2076095475, hPyb.Go(rFBK2));
    }

    public String QWNe() {
        return (String)o.a(this, -2076095475);
    }

    public void jNbl(String string) {
        o.v(this, -2076095475, string);
    }

    private static Object Go(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

