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

public abstract class Fpab$GPlk {
    private final Material BMIs;
    private final byte puVK;
    private final int[] vKqt;

    public Fpab$GPlk(Material material, byte by) {
        this.BMIs = material;
        this.puVK = by;
        int[] arrn = new int[2];
        arrn[0] = Fpab$GPlk.lV(material);
        arrn[1] = by;
        this.vKqt = arrn;
    }

    public Material getMaterial() {
        return (Material)o.a(this, 377438453);
    }

    public byte getData() {
        return ((Byte)o.a(this, -1967701772)).byteValue();
    }

    public int[] UJSK() {
        return (int[])o.a(this, 1965637875);
    }

    public String bGgH() {
        return Fpab$GPlk.lV(Fpab$GPlk.lV(Fpab$GPlk.lV(Fpab$GPlk.lV(new StringBuilder(FMkR$WjFM.a("\u0577")), ((int[])o.a(this, 1965637875))[0]), FMkR$WjFM.a("\u0577")), ((int[])o.a(this, 1965637875))[1]));
    }

    private static Object lV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

