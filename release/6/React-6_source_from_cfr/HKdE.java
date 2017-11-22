/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;

public class HKdE {
    private Chunk Oixf;
    private ktOu<NUdB, Integer> UIbl;

    public HKdE(Chunk chunk) {
        this.Oixf = chunk;
        this.UIbl = new ktOu();
    }

    public void HKdE() {
        HKdE.LN((ktOu)cv.b(this, -986705934));
    }

    public void ssNb(NUdB nUdB, int n) {
        try {
            if (HKdE.LN((ktOu)cv.b(this, -986705934), nUdB) == false) {
                HKdE.LN((ktOu)cv.b(this, -986705934), nUdB, HKdE.LN(false));
            }
            HKdE.LN((ktOu)cv.b(this, -986705934), nUdB, HKdE.LN(HKdE.LN((Integer)HKdE.LN((ktOu)cv.b(this, -986705934), nUdB)) + n));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public Chunk pqxh() {
        return (Chunk)cv.b(this, 47321085);
    }

    public ktOu<NUdB, Integer> GkDg() {
        return (ktOu)cv.b(this, -986705934);
    }

    private static Object LN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

