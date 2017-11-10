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

class Gryi$2
extends vcRa {
    private final /* synthetic */ Double Wara;
    private final /* synthetic */ Player txHK;
    private final /* synthetic */ Entity[] SfhJ;

    Gryi$2(Location location, Vector vector, Double d, Double d2, Double d3, Player player, Entity[] arrentity) {
        this.Wara = d3;
        this.txHK = player;
        this.SfhJ = arrentity;
        super(location, vector, d, d2);
    }

    @Override
    public void CVAs(Location location) {
        RIGg rIGg = new RIGg(location, (Double)yy.h(this, -219216536));
        Entity[] arrentity = (Entity[])Gryi$2.kj(rIGg);
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (Gryi$2.kj((Player)yy.h(this, -488831619), entity) == false) {
                this.stop();
                ((Entity[])yy.h((Object)this, (int)2114717046))[0] = entity;
                return;
            }
            ++n2;
        }
    }

    private static Object kj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

