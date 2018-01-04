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

class qRvu$1
extends CxNA {
    final /* synthetic */ qRvu DawF;
    private final /* synthetic */ Iterator AYPH;
    private final /* synthetic */ Location ThuI;
    private final /* synthetic */ int BJpS;

    qRvu$1(qRvu qRvu2, Iterator iterator, Location location, int n) {
        this.DawF = qRvu2;
        this.AYPH = iterator;
        this.ThuI = location;
        this.BJpS = n;
    }

    @Override
    public void run() {
        Block block;
        while (((Iterator)o.a(this, 371479913)).hasNext()) {
            try {
                block = (Block)((Iterator)o.a(this, 371479913)).next();
                if (qRvu$1.rO(block.getLocation(), (Location)o.a(this, -484354712)) != false) continue;
                if (qRvu$1.rO((qRvu)o.a(this, 1618236774), block.getLocation()) != false) {
                    qRvu$1.rO(qRvu$1.rO((qRvu)o.a(this, 1618236774)), block.getLocation());
                    continue;
                }
                if (qRvu$1.rO((qRvu)o.a(this, 1618236774), block.getLocation()) == false) continue;
                qRvu$1.rO(qRvu$1.rO((qRvu)o.a(this, 1618236774)), block.getLocation());
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (qRvu$1.rO(qRvu$1.rO((qRvu)o.a(this, 1618236774))) != false) {
            return;
        }
        Object object = qRvu$1.rO(qRvu$1.rO((qRvu)o.a(this, 1618236774)));
        while (object.hasNext()) {
            block = (Location)object.next();
            Object object2 = Integer.MAX_VALUE;
            Object object3 = qRvu$1.rO(qRvu$1.rO((qRvu)o.a(this, 1618236774)));
            while (object3.hasNext()) {
                Location location = (Location)object3.next();
                Object object4 = qRvu$1.rO((qRvu)o.a(this, 1618236774), block, location);
                if (object4 >= object2) continue;
                object2 = object4;
            }
            if (object2 <= (Integer)o.a(this, -885500593)) continue;
            qRvu$1.rO(qRvu$1.rO((qRvu)o.a(this, 1618236774)), block);
        }
        new qRvu$1$1(this);
    }

    static /* synthetic */ qRvu yJLS(qRvu$1 qRvu$1) {
        return (qRvu)o.a(qRvu$1, 1618236774);
    }

    private static Object rO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

