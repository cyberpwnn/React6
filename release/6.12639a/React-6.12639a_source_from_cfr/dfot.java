/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class dfot
extends WOht {
    private boolean MmeW;

    public dfot() {
        super((jGAA)((Object)o.k(-1984279313)));
    }

    public dfot(boolean bl) {
        super((jGAA)((Object)o.k(-1984279313)));
        this.MmeW = bl;
    }

    @Override
    public void yJLS(Elru elru) throws IOException {
        dfot.yG(elru, (Boolean)o.a(this, -732803858));
    }

    @Override
    public void yJLS(rFBK rFBK2) throws IOException {
        o.v(this, -732803858, (boolean)dfot.yG(rFBK2));
    }

    public boolean xPJu() {
        return (Boolean)o.a(this, -732803858);
    }

    public void wKtV(boolean bl) {
        o.v(this, -732803858, bl);
    }

    private static Object yG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

