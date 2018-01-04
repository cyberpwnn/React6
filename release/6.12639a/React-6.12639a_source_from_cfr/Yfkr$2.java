/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class Yfkr$2
extends JJHM {
    final /* synthetic */ Yfkr eYsk;

    Yfkr$2(Yfkr yfkr, String string, int n) {
        this.eYsk = yfkr;
        super(string, n);
    }

    @Override
    public void run() {
        if (Yfkr$2.aq((Yfkr)o.a(this, 161044104)) != false) {
            if (Yfkr$2.aq((Yfkr)o.a(this, 161044104)) > 0) {
                Yfkr yfkr = (Yfkr)o.a(this, 161044104);
                Yfkr$2.aq(yfkr, Yfkr$2.aq(yfkr) - true);
                if (Yfkr$2.aq((Yfkr)o.a(this, 161044104)) >= 13) {
                    Yfkr$2.aq((Yfkr)o.a(this, 161044104), false);
                    Object object = Yfkr$2.aq(Yfkr$2.aq((Yfkr)o.a(this, 161044104)));
                    while (object.hasNext()) {
                        String string = (String)object.next();
                        Yfkr$2.aq((Yfkr)o.a(this, 161044104), string);
                    }
                    Yfkr$2.aq(Yfkr$2.aq((Yfkr)o.a(this, 161044104)));
                }
            }
        }
    }

    private static Object aq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

