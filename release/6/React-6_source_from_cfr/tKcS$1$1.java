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

class tKcS$1$1
extends gyID {
    final /* synthetic */ tKcS.1 ofwX;
    private final /* synthetic */ Location aoQC;
    private final /* synthetic */ Player CDwg;

    tKcS$1$1(tKcS.1 var1_1, String string, int n, int n2, Location location, Player player) {
        this.ofwX = var1_1;
        this.aoQC = location;
        this.CDwg = player;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if ((Integer)cv.b(this, 1087435471) == 1) {
            MBKs mBKs = new MBKs((Location)cv.b(this, 672002766));
            ((Player)cv.b(this, -1724714295)).sendBlockChange((Location)cv.b(this, 672002766), (Material)tKcS$1$1.kV(mBKs), (byte)tKcS$1$1.kV(tKcS$1$1.kV(mBKs)));
        }
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

