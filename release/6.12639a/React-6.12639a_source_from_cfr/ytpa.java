/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class ytpa {
    private URWm qoIn = new URWm();
    private URWm bYmQ;

    public ytpa(psKX psKX2, psKX psKX3, psKX psKX4) {
        String[] arrstring = new String[8];
        arrstring[0] = ytpa.ai(psKX2);
        arrstring[1] = ytpa.ai(psKX2);
        arrstring[2] = ytpa.ai(psKX2);
        arrstring[3] = ytpa.ai(psKX3);
        arrstring[4] = ytpa.ai(psKX4);
        arrstring[5] = ytpa.ai(psKX4);
        arrstring[6] = ytpa.ai(psKX4);
        arrstring[7] = ytpa.ai(psKX3);
        this.bYmQ = new URWm(arrstring);
    }

    public String toString() {
        return ytpa.ai(ytpa.ai(new StringBuilder((String)ytpa.ai(ytpa.ai((URWm)o.a(this, 1052527700)))), ytpa.ai((URWm)o.a(this, 123620802))));
    }

    private static Object ai(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

