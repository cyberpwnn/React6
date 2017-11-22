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

class UIbl$1
extends EvEN<Entity, Player> {
    UIbl$1() {
    }

    public Player WGJn(Entity entity) {
        if (UIbl$1.Ej(entity.getType(), (EntityType)cv.e(-209907400)) != false) {
            return (Player)entity;
        }
        return null;
    }

    @Override
    public /* synthetic */ Object jhSt(Object object) {
        return this.WGJn((Entity)object);
    }

    private static Object Ej(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

