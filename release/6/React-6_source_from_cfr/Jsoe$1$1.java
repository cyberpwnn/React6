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

class Jsoe$1$1
extends QFCu {
    final /* synthetic */ Location HfFj;
    final /* synthetic */ Player PvNo;
    final /* synthetic */ Jsoe.1 pGuT;

    Jsoe$1$1(Jsoe.1 var1_1, String string, int n, int n2, Location location, Player player) {
        this.pGuT = var1_1;
        this.HfFj = location;
        this.PvNo = player;
        super(string, n, n2);
    }

    @Override
    public void run() {
        if ((Integer)yy.h(this, -340005898) == 1) {
            XAel xAel = new XAel((Location)yy.h(this, 661580795));
            ((Player)yy.h(this, 1929178108)).sendBlockChange((Location)yy.h(this, 661580795), (Material)Jsoe$1$1.er(xAel), (byte)Jsoe$1$1.er(Jsoe$1$1.er(xAel)));
        }
    }

    private static Object er(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

