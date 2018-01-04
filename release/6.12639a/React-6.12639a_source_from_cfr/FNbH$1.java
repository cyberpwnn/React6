/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.entity.Entity
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

class FNbH$1
extends woNE {
    private final /* synthetic */ Double txle;
    private final /* synthetic */ Entity TYyG;
    private final /* synthetic */ Entity[] WJFY;

    FNbH$1(Location location, Vector vector, Double d, Double d2, Double d3, Entity entity, Entity[] arrentity) {
        this.txle = d3;
        this.TYyG = entity;
        this.WJFY = arrentity;
        super(location, vector, d, d2);
    }

    @Override
    public void qcvH(Location location) {
        fvLG fvLG2 = new fvLG(location, (Double)o.a(this, 1087062455));
        Entity[] arrentity = (Entity[])FNbH$1.cY(fvLG2);
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (FNbH$1.cY((Entity)o.a(this, -1431354954), entity) == false) {
                this.stop();
                ((Entity[])o.a((Object)this, (int)-1634123339))[0] = entity;
                return;
            }
            ++n2;
        }
    }

    private static Object cY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

