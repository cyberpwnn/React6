/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class DXtK
extends WOht {
    private String HxJV;

    public DXtK() {
        super((jGAA)((Object)o.k(-1180152590)));
    }

    public DXtK(String string) {
        super((jGAA)((Object)o.k(-1180152590)));
        this.HxJV = string;
    }

    @Override
    public void yJLS(Elru elru) throws IOException {
        DXtK.io(elru, (String)o.a(this, -1145877261));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws IOException {
        o.v(this, -1145877261, DXtK.io(rFBK2));
    }

    public String QWNe() {
        return (String)o.a(this, -1145877261);
    }

    public void jNbl(String string) {
        o.v(this, -1145877261, string);
    }

    private static Object io(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

