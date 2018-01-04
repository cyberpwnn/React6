/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class oDiX
extends maKI {
    private String HxJV;

    public oDiX() {
        super((Cfqo)((Object)o.k(339102759)));
    }

    public oDiX(String string) {
        super((Cfqo)((Object)o.k(339102759)));
        this.HxJV = string;
    }

    @Override
    public void yJLS(Elru elru) throws IOException {
        oDiX.dz(elru, (String)o.a(this, -1730130908));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws IOException {
        o.v(this, -1730130908, oDiX.dz(rFBK2));
    }

    public String QWNe() {
        return (String)o.a(this, -1730130908);
    }

    public void jNbl(String string) {
        o.v(this, -1730130908, string);
    }

    private static Object dz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

