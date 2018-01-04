/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

class YMXg$1$1
extends JJHM {
    final /* synthetic */ YMXg.1 HTxS;
    private final /* synthetic */ Location Snin;
    private final /* synthetic */ Player XlxR;

    YMXg$1$1(YMXg.1 var1_1, String string, int n, int n2, Location location, Player player) {
        this.HTxS = var1_1;
        this.Snin = location;
        this.XlxR = player;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if ((Integer)o.a(this, -2140382737) == 1) {
            OrkN orkN = new OrkN((Location)o.a(this, 1035819502));
            ((Player)o.a(this, 1090673133)).sendBlockChange((Location)o.a(this, 1035819502), (Material)YMXg$1$1.qQ(orkN), (byte)YMXg$1$1.qQ(YMXg$1$1.qQ(orkN)));
        }
    }

    private static Object qQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

