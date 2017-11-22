/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 */
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

class gWIG$1
extends EvEN<Entity, Player> {
    final /* synthetic */ gWIG qeiX;

    gWIG$1(gWIG gWIG2) {
        this.qeiX = gWIG2;
    }

    public Player WGJn(Entity entity) {
        if (entity instanceof Player) {
            return (Player)entity;
        }
        return null;
    }

    @Override
    public /* synthetic */ Object jhSt(Object object) {
        return this.WGJn((Entity)object);
    }
}

