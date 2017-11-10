/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

class Gryi$1
extends ePQp<Entity, Player> {
    Gryi$1() {
    }

    public Player gUxV(Entity entity) {
        if (Gryi$1.uZ(entity.getType(), (EntityType)yy.p(-823268809)) != false) {
            return (Player)entity;
        }
        return null;
    }

    @Override
    public /* synthetic */ Object ksfs(Object object) {
        return this.gUxV((Entity)object);
    }

    private static Object uZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

