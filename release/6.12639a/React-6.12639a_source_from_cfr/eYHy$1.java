/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

class eYHy$1
extends CxNA {
    final /* synthetic */ eYHy YovW;
    private final /* synthetic */ CommandSender USIc;

    eYHy$1(eYHy eYHy2, CommandSender commandSender) {
        this.YovW = eYHy2;
        this.USIc = commandSender;
    }

    @Override
    public void run() {
        Player player;
        Object object = eYHy$1.RR((YLuU)o.a((TEqA)o.k(911295720), -1625533873));
        Object object2 = eYHy$1.RR((YLuU)o.a((TEqA)o.k(911295720), -1625533873));
        TNku tNku = new TNku();
        int n = 0;
        Object object3 = eYHy$1.RR(eYHy$1.RR(object));
        while (object3.hasNext()) {
            player = (Player)object3.next();
            eYHy$1.RR(tNku, eYHy$1.RR(eYHy$1.RR(eYHy$1.RR(new StringBuilder(), (psKX)((Object)o.k(-1868409976))), player.getName())), (Integer)eYHy$1.RR(object, player));
            n += eYHy$1.RR((Integer)eYHy$1.RR(object, player));
        }
        object3 = eYHy$1.RR(eYHy$1.RR(object2));
        while (object3.hasNext()) {
            player = (Plugin)object3.next();
            eYHy$1.RR(tNku, eYHy$1.RR(eYHy$1.RR(eYHy$1.RR(new StringBuilder(), (psKX)((Object)o.k(-1118678018))), player.getName())), (Integer)eYHy$1.RR(object2, player));
            n += eYHy$1.RR((Integer)eYHy$1.RR(object2, player));
        }
        eYHy$1.RR(tNku, eYHy$1.RR(eYHy$1.RR(eYHy$1.RR(new StringBuilder(), (psKX)((Object)o.k(2144817739))), nJPf$sILv.G("\u33c5\u73d5\ubca8\u1c28\u7659\u5655"))), eYHy$1.RR(eYHy$1.RR((YLuU)o.a((TEqA)o.k(911295720), -1625533873))));
        int n2 = n += eYHy$1.RR((YLuU)o.a((TEqA)o.k(911295720), -1625533873));
        Object object4 = eYHy$1.RR(eYHy$1.RR(tNku));
        while (object4.hasNext()) {
            object3 = (String)object4.next();
            new eYHy$1$1(this, (CommandSender)o.a(this, 893735513), (String)object3, tNku, n2);
        }
    }

    private static Object RR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

