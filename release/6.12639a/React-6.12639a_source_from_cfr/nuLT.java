/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class nuLT
extends maKI {
    private String HxJV;

    public nuLT() {
        super((Cfqo)((Object)o.k(-1632482266)));
    }

    public nuLT(String string) {
        super((Cfqo)((Object)o.k(-1632482266)));
        this.HxJV = string;
    }

    @Override
    public void yJLS(Elru elru) throws IOException {
        nuLT.xE(elru, (String)o.a(this, -2111157232));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws IOException {
        o.v(this, -2111157232, nuLT.xE(rFBK2));
    }

    public String QWNe() {
        return (String)o.a(this, -2111157232);
    }

    public void jNbl(String string) {
        o.v(this, -2111157232, string);
    }

    private static Object xE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

