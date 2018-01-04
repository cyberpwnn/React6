/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.World
 *  org.bukkit.block.Block
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.World;
import org.bukkit.block.Block;

public class Kwaa$UtIU
implements Iterator<Block> {
    private World lOFT;
    private int rXgQ;
    private int FHHm;
    private int KqKI;
    private int x;
    private int y;
    private int z;
    private int IYcB;
    private int tpPO;
    private int wqGs;
    final /* synthetic */ Kwaa ffcK;

    public Kwaa$UtIU(Kwaa kwaa, World world, int n, int n2, int n3, int n4, int n5, int n6) {
        this.ffcK = kwaa;
        this.lOFT = world;
        this.rXgQ = n;
        this.FHHm = n2;
        this.KqKI = n3;
        this.IYcB = Kwaa$UtIU.zh(n4 - n) + true;
        this.tpPO = Kwaa$UtIU.zh(n5 - n2) + true;
        this.wqGs = Kwaa$UtIU.zh(n6 - n3) + true;
        this.z = 0;
        this.y = 0;
        this.x = 0;
    }

    @Override
    public boolean hasNext() {
        if ((Integer)o.a(this, -660128441) < (Integer)o.a(this, -1795736250) && (Integer)o.a(this, 443497797) < (Integer)o.a(this, -1553908412) && (Integer)o.a(this, -1162986173) < (Integer)o.a(this, -375833806)) {
            return true;
        }
        return false;
    }

    @Override
    public Block next() {
        Block block = ((World)o.a(this, 910113585)).getBlockAt((Integer)o.a(this, 552680240) + (Integer)o.a(this, -660128441), (Integer)o.a(this, -1371194577) + (Integer)o.a(this, 443497797), (Integer)o.a(this, -194168018) + (Integer)o.a(this, -1162986173));
        Kwaa$UtIU kwaa$UtIU = this;
        int n = (Integer)o.a(kwaa$UtIU, -660128441) + 1;
        o.v(kwaa$UtIU, -660128441, n);
        if (n >= (Integer)o.a(this, -1795736250)) {
            o.v(this, -660128441, 0);
            Kwaa$UtIU kwaa$UtIU2 = this;
            int n2 = (Integer)o.a(kwaa$UtIU2, 443497797) + 1;
            o.v(kwaa$UtIU2, 443497797, n2);
            if (n2 >= (Integer)o.a(this, -1553908412)) {
                o.v(this, 443497797, 0);
                Kwaa$UtIU kwaa$UtIU3 = this;
                o.v(kwaa$UtIU3, -1162986173, (Integer)o.a(kwaa$UtIU3, -1162986173) + 1);
            }
        }
        return block;
    }

    @Override
    public void remove() {
    }

    private static Object zh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

