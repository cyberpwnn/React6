/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.scoreboard.Scoreboard
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public class wTwT
implements XSNy {
    private feCR<String> qUOc;
    protected feCR<Player> RRen;
    private String name;
    private Scoreboard PerR;

    public wTwT(String string) {
        this.name = string;
        this.qUOc = new feCR();
        this.RRen = new feCR();
        this.Vnil();
    }

    @Override
    public feCR<String> URWm() {
        return (feCR)o.a(this, 1968986045);
    }

    @Override
    public void UtIU(int n, String string) {
        wTwT.BK((feCR)o.a(this, 1968986045), n, string);
    }

    @Override
    public void CoVI(feCR<String> feCR2) {
        o.v(this, 1968986045, feCR2);
    }

    @Override
    public String get(int n) {
        if (wTwT.BK((feCR)o.a(this, 1968986045), n) != false) {
            return (String)wTwT.BK((feCR)o.a(this, 1968986045), n);
        }
        return null;
    }

    @Override
    public void update() {
        this.Vnil();
        Object object = wTwT.BK((feCR)o.a(this, 735794762));
        while (object.hasNext()) {
            Player player = (Player)object.next();
            player.setScoreboard((Scoreboard)o.a(this, -977250743));
        }
    }

    @Override
    public void setName(String string) {
        o.v(this, 1430607432, string);
    }

    @Override
    public String getName() {
        return (String)o.a(this, 1430607432);
    }

    @Override
    public void Vnil() {
        o.v(this, -977250743, wTwT.BK((String)o.a(this, 1430607432), (feCR)o.a(this, 1968986045)));
    }

    @Override
    public void bhkI(Player player) {
        if (!this.IpeM(player)) {
            wTwT.BK((feCR)o.a(this, 735794762), player);
        }
    }

    @Override
    public void ooQj(Player player) {
        wTwT.BK((feCR)o.a(this, 735794762), player);
        player.setScoreboard(wTwT.BK().getMainScoreboard());
    }

    @Override
    public feCR<Player> BtuM() {
        return wTwT.BK((feCR)o.a(this, 735794762));
    }

    @Override
    public boolean IpeM(Player player) {
        return (boolean)wTwT.BK((feCR)o.a(this, 735794762), player);
    }

    @Override
    public void aLXV(String string) {
        wTwT.BK((feCR)o.a(this, 1968986045), string);
    }

    @Override
    public void fvLG() {
        wTwT.BK((feCR)o.a(this, 1968986045));
    }

    private static Object BK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

