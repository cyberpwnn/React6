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

public class gWIG$DYFV
implements Iterator<Block> {
    private World ArrX;
    private int rWkD;
    private int RJOD;
    private int yBlX;
    private int x;
    private int y;
    private int z;
    private int BKbH;
    private int nCLy;
    private int oyUQ;
    final /* synthetic */ gWIG qeiX;

    public gWIG$DYFV(gWIG gWIG2, World world, int n, int n2, int n3, int n4, int n5, int n6) {
        this.qeiX = gWIG2;
        this.ArrX = world;
        this.rWkD = n;
        this.RJOD = n2;
        this.yBlX = n3;
        this.BKbH = gWIG$DYFV.Rb(n4 - n) + true;
        this.nCLy = gWIG$DYFV.Rb(n5 - n2) + true;
        this.oyUQ = gWIG$DYFV.Rb(n6 - n3) + true;
        this.z = 0;
        this.y = 0;
        this.x = 0;
    }

    @Override
    public boolean hasNext() {
        if ((Integer)cv.b(this, -1113787381) < (Integer)cv.b(this, 893449226) && (Integer)cv.b(this, 730723829) < (Integer)cv.b(this, 1409480180) && (Integer)cv.b(this, -430967305) < (Integer)cv.b(this, -240847370)) {
            return true;
        }
        return false;
    }

    @Override
    public Block next() {
        Block block = ((World)cv.b(this, -2022902287)).getBlockAt((Integer)cv.b(this, -381553168) + (Integer)cv.b(this, -1113787381), (Integer)cv.b(this, -143133197) + (Integer)cv.b(this, 730723829), (Integer)cv.b(this, -247073294) + (Integer)cv.b(this, -430967305));
        gWIG$DYFV gWIG$DYFV = this;
        int n = (Integer)cv.b(gWIG$DYFV, -1113787381) + 1;
        cv.e(gWIG$DYFV, -1113787381, n);
        if (n >= (Integer)cv.b(this, 893449226)) {
            cv.e(this, -1113787381, 0);
            gWIG$DYFV gWIG$DYFV2 = this;
            int n2 = (Integer)cv.b(gWIG$DYFV2, 730723829) + 1;
            cv.e(gWIG$DYFV2, 730723829, n2);
            if (n2 >= (Integer)cv.b(this, 1409480180)) {
                cv.e(this, 730723829, 0);
                gWIG$DYFV gWIG$DYFV3 = this;
                cv.e(gWIG$DYFV3, -430967305, (Integer)cv.b(gWIG$DYFV3, -430967305) + 1);
            }
        }
        return block;
    }

    @Override
    public void remove() {
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

