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

public class XAel {
    private Material QiRp;
    private Byte AsWT;

    public XAel(Material material, Byte by) {
        this.QiRp = material;
        this.AsWT = by;
    }

    public XAel(Material material) {
        this.QiRp = material;
        this.AsWT = XAel.mD(false);
    }

    public XAel(Location location) {
        this((Block)XAel.mD(location));
    }

    public XAel(BlockState blockState) {
        this.QiRp = blockState.getType();
        this.AsWT = XAel.mD(XAel.mD(blockState.getData()));
    }

    public XAel(Block block) {
        this.QiRp = block.getType();
        this.AsWT = XAel.mD(block.getData());
    }

    public XAel() {
        this.QiRp = (Material)yy.p(1934035000);
        this.AsWT = XAel.mD(false);
    }

    public Material getMaterial() {
        return (Material)yy.h(this, 966658143);
    }

    public void setMaterial(Material material) {
        yy.E(this, 966658143, (Object)material);
    }

    public Byte INtC() {
        return (Byte)yy.h(this, -1751775136);
    }

    public void mXJp(Byte by) {
        yy.E(this, -1751775136, by);
    }

    public String toString() {
        if (XAel.mD(this.INtC()) == false) {
            return XAel.mD(this.getMaterial());
        }
        return XAel.mD(XAel.mD(XAel.mD(new StringBuilder((String)XAel.mD(XAel.mD(this.getMaterial()))), KDGY$JAHk.Y("\u2f6d")), this.INtC()));
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 + (Object)((Byte)yy.h(this, -1751775136) == null ? 0 : (Object)XAel.mD((Byte)yy.h(this, -1751775136)));
        n2 = n2 * 31 + (Object)((Material)yy.h(this, 966658143) == null ? 0 : (Object)XAel.mD((Material)yy.h(this, 966658143)));
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (XAel.mD(this) != XAel.mD(object)) {
            return false;
        }
        XAel xAel = (XAel)object;
        if ((Byte)yy.h(this, -1751775136) == null) {
            if ((Byte)yy.h(xAel, -1751775136) != null) {
                return false;
            }
        } else if (XAel.mD((Byte)yy.h(this, -1751775136), (Byte)yy.h(xAel, -1751775136)) == false) {
            return false;
        }
        if ((Material)yy.h(this, 966658143) != (Material)yy.h(xAel, 966658143)) {
            return false;
        }
        return true;
    }

    private static Object mD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

