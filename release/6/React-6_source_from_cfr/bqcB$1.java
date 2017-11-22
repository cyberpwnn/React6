/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.block.Block
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.Location;
import org.bukkit.block.Block;

class bqcB$1
extends dDce {
    final /* synthetic */ Iterator GcHN;
    final /* synthetic */ Location RcFw;
    final /* synthetic */ int iLVg;
    final /* synthetic */ bqcB AHEy;

    bqcB$1(bqcB bqcB2, Iterator iterator, Location location, int n) {
        this.AHEy = bqcB2;
        this.GcHN = iterator;
        this.RcFw = location;
        this.iLVg = n;
    }

    @Override
    public void run() {
        Object object;
        while (((Iterator)cv.b(this, -1963985640)).hasNext()) {
            try {
                object = (Block)((Iterator)cv.b(this, -1963985640)).next();
                if (bqcB$1.kV(object.getLocation(), (Location)cv.b(this, -1114770149)) != false) continue;
                if (bqcB$1.kV((bqcB)cv.b(this, 244380380), object.getLocation()) != false) {
                    bqcB$1.kV(bqcB$1.kV((bqcB)cv.b(this, 244380380)), object.getLocation());
                    continue;
                }
                if (bqcB$1.kV((bqcB)cv.b(this, 244380380), object.getLocation()) == false) continue;
                bqcB$1.kV(bqcB$1.kV((bqcB)cv.b(this, 244380380)), object.getLocation());
            }
            catch (Exception exception) {}
        }
        if (bqcB$1.kV(bqcB$1.kV((bqcB)cv.b(this, 244380380))) != false) {
            return;
        }
        object = bqcB$1.kV(bqcB$1.kV((bqcB)cv.b(this, 244380380)));
        while (object.hasNext()) {
            Location location = (Location)object.next();
            Object object2 = Integer.MAX_VALUE;
            Object object3 = bqcB$1.kV(bqcB$1.kV((bqcB)cv.b(this, 244380380)));
            while (object3.hasNext()) {
                Location location2 = (Location)object3.next();
                Object object4 = bqcB$1.kV((bqcB)cv.b(this, 244380380), location, location2);
                if (object4 >= object2) continue;
                object2 = object4;
            }
            if (object2 <= (Integer)cv.b(this, 1303442688)) continue;
            bqcB$1.kV(bqcB$1.kV((bqcB)cv.b(this, 244380380)), location);
        }
        new bqcB$1$1(this);
    }

    private static Object kV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

