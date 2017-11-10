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

public abstract class OGmN$halY {
    private final Material QiRp;
    private final byte SVLH;
    private final int[] Ajib;

    public OGmN$halY(Material material, byte by) {
        this.QiRp = material;
        this.SVLH = by;
        int[] arrn = new int[2];
        arrn[0] = OGmN$halY.gr(material);
        arrn[1] = by;
        this.Ajib = arrn;
    }

    public Material getMaterial() {
        return (Material)yy.h(this, -1263467373);
    }

    public byte getData() {
        return ((Byte)yy.h(this, 1876821140)).byteValue();
    }

    public int[] PJvK() {
        return (int[])yy.h(this, -1483144055);
    }

    public String vlGM() {
        return OGmN$halY.gr(OGmN$halY.gr(OGmN$halY.gr(OGmN$halY.gr(new StringBuilder(KDGY$JAHk.Y("\u48ec")), ((int[])yy.h(this, -1483144055))[0]), KDGY$JAHk.Y("\u48ec")), ((int[])yy.h(this, -1483144055))[1]));
    }

    private static Object gr(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

