/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

class QMuP$2
extends xGOy {
    final /* synthetic */ QMuP CNfO;
    private final /* synthetic */ Object jYHS;

    QMuP$2(QMuP qMuP, Object object) {
        this.CNfO = qMuP;
        this.jYHS = object;
    }

    @Override
    public void run() {
        Player player = (Player)o.a(this, 468867049);
        if (player.isFlying()) {
            player.setVelocity(new Vector((double)QMuP$2.zQ(player.getVelocity()), (double)QMuP$2.zQ(player.getVelocity()), (double)QMuP$2.zQ(player.getVelocity())));
        }
    }

    private static Object zQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

