/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Cancellable
 */
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class wClQ
extends owir
implements Cancellable {
    private YMWq TPNO;
    private boolean VUsI;
    private int xreq;

    public wClQ(Player player, YMWq yMWq, int n) {
        super(player);
        this.TPNO = yMWq;
        this.VUsI = false;
        this.xreq = n;
    }

    public YMWq tSvi() {
        return (YMWq)((Object)o.a((Object)this, -437758251));
    }

    public boolean isCancelled() {
        return (Boolean)o.a((Object)this, -768977196);
    }

    public void setCancelled(boolean bl) {
        o.v((Object)this, -768977196, bl);
    }

    public boolean mrFx() {
        return (Boolean)o.a((Object)this, -768977196);
    }

    public int getAmount() {
        return (Integer)o.a((Object)this, 77682387);
    }
}

