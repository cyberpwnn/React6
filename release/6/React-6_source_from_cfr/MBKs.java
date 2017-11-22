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

public class MBKs {
    private Material gaKP;
    private Byte pAQC;

    public MBKs(Material material, Byte by) {
        this.gaKP = material;
        this.pAQC = by;
    }

    public MBKs(Material material) {
        this.gaKP = material;
        this.pAQC = MBKs.Rb(false);
    }

    public MBKs(Location location) {
        this((Block)MBKs.Rb(location));
    }

    public MBKs(BlockState blockState) {
        this.gaKP = blockState.getType();
        this.pAQC = MBKs.Rb(MBKs.Rb(blockState.getData()));
    }

    public MBKs(Block block) {
        this.gaKP = block.getType();
        this.pAQC = MBKs.Rb(block.getData());
    }

    public MBKs() {
        this.gaKP = (Material)cv.e(-493219437);
        this.pAQC = MBKs.Rb(false);
    }

    public Material getMaterial() {
        return (Material)cv.b(this, 94500507);
    }

    public void setMaterial(Material material) {
        cv.e(this, 94500507, (Object)material);
    }

    public Byte tLRe() {
        return (Byte)cv.b(this, 729937562);
    }

    public void ssNb(Byte by) {
        cv.e(this, 729937562, by);
    }

    public String toString() {
        if (MBKs.Rb(this.tLRe()) == false) {
            return MBKs.Rb(this.getMaterial());
        }
        return MBKs.Rb(MBKs.Rb(MBKs.Rb(new StringBuilder((String)MBKs.Rb(MBKs.Rb(this.getMaterial()))), KUXS$dwji.S("\u581c")), this.tLRe()));
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Object)((Byte)cv.b(this, 729937562) == null ? 0 : (Object)MBKs.Rb((Byte)cv.b(this, 729937562)));
        n2 = n2 * 31 + (Object)((Material)cv.b(this, 94500507) == null ? 0 : (Object)MBKs.Rb((Material)cv.b(this, 94500507)));
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (MBKs.Rb(this) != MBKs.Rb(object)) {
            return false;
        }
        MBKs mBKs = (MBKs)object;
        if ((Byte)cv.b(this, 729937562) == null) {
            if ((Byte)cv.b(mBKs, 729937562) != null) {
                return false;
            }
        } else if (MBKs.Rb((Byte)cv.b(this, 729937562), (Byte)cv.b(mBKs, 729937562)) == false) {
            return false;
        }
        if ((Material)cv.b(this, 94500507) != (Material)cv.b(mBKs, 94500507)) {
            return false;
        }
        return true;
    }

    private static Object Rb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

