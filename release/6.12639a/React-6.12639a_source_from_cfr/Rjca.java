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

public class Rjca {
    private Chunk yRyF;
    private TNku<GkCK, Integer> jhjy;

    public Rjca(Chunk chunk) {
        this.yRyF = chunk;
        this.jhjy = new TNku();
    }

    public void JYxj() {
        Rjca.Hp((TNku)o.a(this, 1329746453));
    }

    public void yJLS(GkCK gkCK, int n) {
        try {
            if (Rjca.Hp((TNku)o.a(this, 1329746453), gkCK) == false) {
                Rjca.Hp((TNku)o.a(this, 1329746453), gkCK, Rjca.Hp(false));
            }
            Rjca.Hp((TNku)o.a(this, 1329746453), gkCK, Rjca.Hp(Rjca.Hp((Integer)Rjca.Hp((TNku)o.a(this, 1329746453), gkCK)) + n));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public Chunk JYyP() {
        return (Chunk)o.a(this, 574968340);
    }

    public TNku<GkCK, Integer> Rapb() {
        return (TNku)o.a(this, 1329746453);
    }

    private static Object Hp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

