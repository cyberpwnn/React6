/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class WOht
implements JROj {
    private final int id;
    private final String name;

    public WOht(jGAA jGAA2) {
        this.id = WOht.Zu(jGAA2);
        this.name = WOht.Zu(WOht.Zu(jGAA2));
    }

    @Override
    public abstract void yJLS(Elru var1) throws IOException, Exception;

    @Override
    public abstract void yJLS(rFBK var1) throws IOException, Exception;

    @Override
    public int getId() {
        return (Integer)o.a(this, 1914522630);
    }

    @Override
    public XAfJ ArMt() {
        return (XAfJ)((Object)o.k(-1905570811));
    }

    @Override
    public String dfot() {
        return (String)o.a(this, 1663978500);
    }

    private static Object Zu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

