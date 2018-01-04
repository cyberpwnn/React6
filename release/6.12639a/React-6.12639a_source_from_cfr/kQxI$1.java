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

class kQxI$1
extends CEKe<Entity, Player> {
    kQxI$1() {
    }

    public Player Ipep(Entity entity) {
        if (kQxI$1.xY(entity.getType(), (EntityType)o.k(1458914430)) != false) {
            return (Player)entity;
        }
        return null;
    }

    @Override
    public /* synthetic */ Object GPlk(Object object) {
        return this.Ipep((Entity)object);
    }

    private static Object xY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

