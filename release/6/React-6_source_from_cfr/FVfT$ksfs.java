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

public class FVfT$ksfs
implements Iterator<Block> {
    private World EefV;
    private int RQxp;
    private int urPW;
    private int UleI;
    private int x;
    private int y;
    private int z;
    private int cCIa;
    private int xGsd;
    private int YxqD;
    final /* synthetic */ FVfT WYVI;

    public FVfT$ksfs(FVfT fVfT, World world, int n, int n2, int n3, int n4, int n5, int n6) {
        this.WYVI = fVfT;
        this.EefV = world;
        this.RQxp = n;
        this.urPW = n2;
        this.UleI = n3;
        this.cCIa = FVfT$ksfs.zQ(n4 - n) + true;
        this.xGsd = FVfT$ksfs.zQ(n5 - n2) + true;
        this.YxqD = FVfT$ksfs.zQ(n6 - n3) + true;
        this.z = 0;
        this.y = 0;
        this.x = 0;
    }

    @Override
    public boolean hasNext() {
        if ((Integer)yy.h(this, -346486738) < (Integer)yy.h(this, -371521485) && (Integer)yy.h(this, -51771340) < (Integer)yy.h(this, -668202967) && (Integer)yy.h(this, 2044790834) < (Integer)yy.h(this, 971704359)) {
            return true;
        }
        return false;
    }

    @Override
    public Block next() {
        Block block = ((World)yy.h(this, -204732376)).getBlockAt((Integer)yy.h(this, -315226051) + (Integer)yy.h(this, -346486738), (Integer)yy.h(this, 489424950) + (Integer)yy.h(this, -51771340), (Integer)yy.h(this, 1126303803) + (Integer)yy.h(this, 2044790834));
        FVfT$ksfs fVfT$ksfs = this;
        int n = (Integer)yy.h(fVfT$ksfs, -346486738) + 1;
        yy.E(fVfT$ksfs, -346486738, n);
        if (n >= (Integer)yy.h(this, -371521485)) {
            yy.E(this, -346486738, 0);
            FVfT$ksfs fVfT$ksfs2 = this;
            int n2 = (Integer)yy.h(fVfT$ksfs2, -51771340) + 1;
            yy.E(fVfT$ksfs2, -51771340, n2);
            if (n2 >= (Integer)yy.h(this, -668202967)) {
                yy.E(this, -51771340, 0);
                FVfT$ksfs fVfT$ksfs3 = this;
                yy.E(fVfT$ksfs3, 2044790834, (Integer)yy.h(fVfT$ksfs3, 2044790834) + 1);
            }
        }
        return block;
    }

    @Override
    public void remove() {
    }

    private static Object zQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

