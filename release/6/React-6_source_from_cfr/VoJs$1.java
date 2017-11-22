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

class VoJs$1
extends uyeC {
    private final /* synthetic */ Double uHPD;
    private final /* synthetic */ Entity grUt;
    private final /* synthetic */ Entity[] QWyh;

    VoJs$1(Location location, Vector vector, Double d, Double d2, Double d3, Entity entity, Entity[] arrentity) {
        this.uHPD = d3;
        this.grUt = entity;
        this.QWyh = arrentity;
        super(location, vector, d, d2);
    }

    @Override
    public void vtFs(Location location) {
        gVhV gVhV2 = new gVhV(location, (Double)cv.b(this, 769719059));
        Entity[] arrentity = (Entity[])VoJs$1.oT(gVhV2);
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (VoJs$1.oT((Entity)cv.b(this, -1284769006), entity) == false) {
                this.stop();
                ((Entity[])cv.b((Object)this, (int)-1786643683))[0] = entity;
                return;
            }
            ++n2;
        }
    }

    private static Object oT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

