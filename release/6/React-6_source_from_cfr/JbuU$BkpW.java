/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Material;

public abstract class JbuU$BkpW {
    private final Material gaKP;
    private final byte rrNs;
    private final int[] Fqpw;

    public JbuU$BkpW(Material material, byte by) {
        this.gaKP = material;
        this.rrNs = by;
        int[] arrn = new int[2];
        arrn[0] = JbuU$BkpW.Jl(material);
        arrn[1] = by;
        this.Fqpw = arrn;
    }

    public Material getMaterial() {
        return (Material)cv.b(this, 1901197153);
    }

    public byte getData() {
        return ((Byte)cv.b(this, -1457129632)).byteValue();
    }

    public int[] VoOY() {
        return (int[])cv.b(this, 1631254371);
    }

    public String dVUE() {
        return JbuU$BkpW.Jl(JbuU$BkpW.Jl(JbuU$BkpW.Jl(JbuU$BkpW.Jl(new StringBuilder(YEBy$TyVf.W("\u4f36")), ((int[])cv.b(this, 1631254371))[0]), YEBy$TyVf.W("\u4f36")), ((int[])cv.b(this, 1631254371))[1]));
    }

    private static Object Jl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

