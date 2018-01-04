/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 */
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

class Kwaa$1
extends CEKe<Entity, Player> {
    final /* synthetic */ Kwaa ffcK;

    Kwaa$1(Kwaa kwaa) {
        this.ffcK = kwaa;
    }

    public Player Ipep(Entity entity) {
        if (entity instanceof Player) {
            return (Player)entity;
        }
        return null;
    }

    @Override
    public /* synthetic */ Object GPlk(Object object) {
        return this.Ipep((Entity)object);
    }
}

