/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 */
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

class FVfT$1
extends ePQp<Entity, Player> {
    final /* synthetic */ FVfT WYVI;

    FVfT$1(FVfT fVfT) {
        this.WYVI = fVfT;
    }

    public Player gUxV(Entity entity) {
        if (entity instanceof Player) {
            return (Player)entity;
        }
        return null;
    }

    @Override
    public /* synthetic */ Object ksfs(Object object) {
        return this.gUxV((Entity)object);
    }
}

