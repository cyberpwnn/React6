/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class maKI
implements JROj {
    private final int id;
    private final String name;

    public maKI(Cfqo cfqo) {
        this.id = maKI.aF(cfqo);
        this.name = maKI.aF(maKI.aF(cfqo));
    }

    @Override
    public abstract void yJLS(Elru var1) throws IOException;

    @Override
    public abstract void yJLS(rFBK var1) throws IOException;

    @Override
    public int getId() {
        return (Integer)o.a(this, -657765347);
    }

    @Override
    public XAfJ ArMt() {
        return (XAfJ)((Object)o.k(-497136612));
    }

    @Override
    public String dfot() {
        return (String)o.a(this, 424954907);
    }

    private static Object aF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

