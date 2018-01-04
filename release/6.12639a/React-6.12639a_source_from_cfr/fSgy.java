/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class fSgy
extends Thread {
    public boolean r = true;

    public fSgy() {
        this.setName(mrFx$WjFM.d("\u01cf\u334b\u8b66\uf6d5\uc7a2\ud657\u211d\u0593\u0f13\u2b40\ude93\u10f3\u4aee\u9cd3"));
    }

    @Override
    public void run() {
        fSgy.wJ(mrFx$WjFM.d("\u24bf\u5f60\ufa1d\uf2d8\ua052\ueff9\u02a1\u349c\u0641\u3622\u5596\ua5f8\u30fa\uec79\ue935\u453a"));
        while (!fSgy.interrupted()) {
            if (!((Boolean)o.a(this, 1859865738)).booleanValue()) break;
            if (fSgy.wJ() != false) {
                return;
            }
            try {
                if (fSgy.wJ() != false) {
                    return;
                }
                fSgy.wJ(50);
                Object object = fSgy.wJ(fSgy.wJ());
                while (object.hasNext()) {
                    qSgW qSgW2 = (qSgW)object.next();
                    if (fSgy.wJ() != false) {
                        return;
                    }
                    qSgW2.owir();
                }
            }
            catch (InterruptedException interruptedException) {
                return;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    private static Object wJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

