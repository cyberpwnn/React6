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

class Nwie$1
extends ksfs {
    final /* synthetic */ Iterator oVSt;
    final /* synthetic */ Location Yogf;
    final /* synthetic */ int rVob;
    final /* synthetic */ Nwie cdWC;

    Nwie$1(Nwie nwie, Iterator iterator, Location location, int n) {
        this.cdWC = nwie;
        this.oVSt = iterator;
        this.Yogf = location;
        this.rVob = n;
    }

    @Override
    public void run() {
        Object object;
        while (((Iterator)yy.h(this, 888007022)).hasNext()) {
            object = (Block)((Iterator)yy.h(this, 888007022)).next();
            if (Nwie$1.Pj(object.getLocation(), (Location)yy.h(this, -1367217805)) != false) continue;
            if (Nwie$1.Pj((Nwie)yy.h(this, 1113254186), object.getLocation()) != false) {
                Nwie$1.Pj(Nwie$1.Pj((Nwie)yy.h(this, 1113254186)), object.getLocation());
                continue;
            }
            if (Nwie$1.Pj((Nwie)yy.h(this, 1113254186), object.getLocation()) == false) continue;
            Nwie$1.Pj(Nwie$1.Pj((Nwie)yy.h(this, 1113254186)), object.getLocation());
        }
        if (Nwie$1.Pj(Nwie$1.Pj((Nwie)yy.h(this, 1113254186))) != false) {
            return;
        }
        object = Nwie$1.Pj(Nwie$1.Pj((Nwie)yy.h(this, 1113254186)));
        while (object.hasNext()) {
            Location location = (Location)object.next();
            Object object2 = Integer.MAX_VALUE;
            Object object3 = Nwie$1.Pj(Nwie$1.Pj((Nwie)yy.h(this, 1113254186)));
            while (object3.hasNext()) {
                Location location2 = (Location)object3.next();
                Object object4 = Nwie$1.Pj((Nwie)yy.h(this, 1113254186), location, location2);
                if (object4 >= object2) continue;
                object2 = object4;
            }
            if (object2 <= (Integer)yy.h(this, -1140528778)) continue;
            Nwie$1.Pj(Nwie$1.Pj((Nwie)yy.h(this, 1113254186)), location);
        }
        new Nwie$1$1(this);
    }

    private static Object Pj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

