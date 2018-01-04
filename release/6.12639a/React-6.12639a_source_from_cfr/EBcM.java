/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class EBcM {
    public int x;
    public int y;

    public EBcM() {
        this.x = 0;
        this.y = 0;
    }

    public EBcM(int n, int n2) {
        this.x = n;
        this.y = n2;
    }

    public String toString() {
        return EBcM.ZG(EBcM.ZG(EBcM.ZG(new StringBuilder((String)EBcM.ZG((Integer)o.a(this, -1229760871))), mrFx$WjFM.d("\u8179")), (Integer)o.a(this, 402019983)));
    }

    private static Object ZG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

