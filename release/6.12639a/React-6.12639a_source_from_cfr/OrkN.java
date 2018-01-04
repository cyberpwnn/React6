/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.block.BlockState
 *  org.bukkit.material.MaterialData
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.material.MaterialData;

public class OrkN {
    private Material BMIs;
    private Byte LAUh;

    public OrkN(Material material, Byte by) {
        this.BMIs = material;
        this.LAUh = by;
    }

    public OrkN(Material material) {
        this.BMIs = material;
        this.LAUh = OrkN.Sb(false);
    }

    public OrkN(Location location) {
        this((Block)OrkN.Sb(location));
    }

    public OrkN(BlockState blockState) {
        this.BMIs = blockState.getType();
        this.LAUh = OrkN.Sb(OrkN.Sb(blockState.getData()));
    }

    public OrkN(Block block) {
        this.BMIs = block.getType();
        this.LAUh = OrkN.Sb(block.getData());
    }

    public OrkN() {
        this.BMIs = (Material)o.k(-1236315249);
        this.LAUh = OrkN.Sb(false);
    }

    public Material getMaterial() {
        return (Material)o.a(this, -1321059367);
    }

    public void setMaterial(Material material) {
        o.v(this, -1321059367, (Object)material);
    }

    public Byte Pdrw() {
        return (Byte)o.a(this, -1316733992);
    }

    public void yJLS(Byte by) {
        o.v(this, -1316733992, by);
    }

    public String toString() {
        if (OrkN.Sb(this.Pdrw()) == false) {
            return OrkN.Sb(this.getMaterial());
        }
        return OrkN.Sb(OrkN.Sb(OrkN.Sb(new StringBuilder((String)OrkN.Sb(OrkN.Sb(this.getMaterial()))), mrFx$WjFM.d("\u98c9")), this.Pdrw()));
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Object)((Byte)o.a(this, -1316733992) == null ? 0 : (Object)OrkN.Sb((Byte)o.a(this, -1316733992)));
        n2 = n2 * 31 + (Object)((Material)o.a(this, -1321059367) == null ? 0 : (Object)OrkN.Sb((Material)o.a(this, -1321059367)));
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (OrkN.Sb(this) != OrkN.Sb(object)) {
            return false;
        }
        OrkN orkN = (OrkN)object;
        if ((Byte)o.a(this, -1316733992) == null) {
            if ((Byte)o.a(orkN, -1316733992) != null) {
                return false;
            }
        } else if (OrkN.Sb((Byte)o.a(this, -1316733992), (Byte)o.a(orkN, -1316733992)) == false) {
            return false;
        }
        if ((Material)o.a(this, -1321059367) != (Material)o.a(orkN, -1321059367)) {
            return false;
        }
        return true;
    }

    private static Object Sb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

