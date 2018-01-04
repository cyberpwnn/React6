/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

class kQxI$2
extends woNE {
    private final /* synthetic */ Double txle;
    private final /* synthetic */ Player pcoT;
    private final /* synthetic */ Entity[] WJFY;

    kQxI$2(Location location, Vector vector, Double d, Double d2, Double d3, Player player, Entity[] arrentity) {
        this.txle = d3;
        this.pcoT = player;
        this.WJFY = arrentity;
        super(location, vector, d, d2);
    }

    @Override
    public void qcvH(Location location) {
        fvLG fvLG2 = new fvLG(location, (Double)o.a(this, -49004416));
        Entity[] arrentity = (Entity[])kQxI$2.iF(fvLG2);
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (kQxI$2.iF((Player)o.a(this, -11386754), entity) == false) {
                this.stop();
                ((Entity[])o.a((Object)this, (int)-740605827))[0] = entity;
                return;
            }
            ++n2;
        }
    }

    private static Object iF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

