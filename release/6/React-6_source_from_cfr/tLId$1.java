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

class tLId$1
extends vcRa {
    private final /* synthetic */ Double Wara;
    private final /* synthetic */ Entity Vglb;
    private final /* synthetic */ Entity[] SfhJ;

    tLId$1(Location location, Vector vector, Double d, Double d2, Double d3, Entity entity, Entity[] arrentity) {
        this.Wara = d3;
        this.Vglb = entity;
        this.SfhJ = arrentity;
        super(location, vector, d, d2);
    }

    @Override
    public void CVAs(Location location) {
        RIGg rIGg = new RIGg(location, (Double)yy.h(this, -1966734932));
        Entity[] arrentity = (Entity[])tLId$1.qI(rIGg);
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (tLId$1.qI((Entity)yy.h(this, -1124990559), entity) == false) {
                this.stop();
                ((Entity[])yy.h((Object)this, (int)-1872887382))[0] = entity;
                return;
            }
            ++n2;
        }
    }

    private static Object qI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

