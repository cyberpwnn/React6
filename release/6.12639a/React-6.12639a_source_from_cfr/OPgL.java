/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Server
 *  org.bukkit.Sound
 *  org.bukkit.command.CommandSender
 *  org.bukkit.command.ConsoleCommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class OPgL {
    private String EoFg;
    private Sound DlCf;
    private Float QhwH;
    private Float qndB;

    public OPgL(String string, Float f, Float f2) {
        this.EoFg = string;
        this.QhwH = f;
        this.qndB = f2;
    }

    public OPgL(String string) {
        this.EoFg = string;
        this.QhwH = OPgL.TS(1.0f);
        this.qndB = OPgL.TS(1.0f);
    }

    public OPgL(Sound sound, Float f, Float f2) {
        this.DlCf = sound;
        this.QhwH = f;
        this.qndB = f2;
    }

    public OPgL(Sound sound) {
        this.DlCf = sound;
        this.QhwH = OPgL.TS(1.0f);
        this.qndB = OPgL.TS(1.0f);
    }

    public void WOYg(Player player) {
        if ((Sound)o.a(this, 1079659668) != null) {
            player.playSound(player.getLocation(), (Sound)o.a(this, 1079659668), (float)OPgL.TS((Float)o.a(this, 1887063187)), (float)OPgL.TS((Float)o.a(this, 29445377)));
        }
        if ((String)o.a(this, -1090630400) != null) {
            Object object = OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(new StringBuilder(nJPf$sILv.G("\u6e9e\uee26\u3623\u68b9\ufc00\u8de0\uc5bb\ua67c\ube6b\u349a")), (String)o.a(this, -1090630400)), nJPf$sILv.G("\u6ece")), player.getName()), nJPf$sILv.G("\u6ece")), OPgL.TS(player.getLocation())), nJPf$sILv.G("\u6ece")), OPgL.TS(player.getLocation())), nJPf$sILv.G("\u6ece")), OPgL.TS(player.getLocation())), nJPf$sILv.G("\u6ece")), (Float)o.a(this, 1887063187)), nJPf$sILv.G("\u6ece")), (Float)o.a(this, 29445377)));
            player.getServer().dispatchCommand((CommandSender)player.getServer().getConsoleSender(), (String)object);
        }
    }

    public void TEqA(Location location) {
        if ((Sound)o.a(this, 1079659668) != null) {
            OPgL.TS(location).playSound(location, (Sound)o.a(this, 1079659668), (float)OPgL.TS((Float)o.a(this, 1887063187)), (float)OPgL.TS((Float)o.a(this, 29445377)));
        }
        if ((String)o.a(this, -1090630400) != null) {
            Object object = OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(new StringBuilder(mrFx$WjFM.d("\u221f\u6e81\u6a4a\u2573\u274b\u15e3\u30e0\u5370\uf499\uaa2b")), (String)o.a(this, -1090630400)), mrFx$WjFM.d("\u224f\u6ead\u6a4a\u252a")), OPgL.TS(location)), mrFx$WjFM.d("\u224f")), OPgL.TS(location)), mrFx$WjFM.d("\u224f")), OPgL.TS(location)), mrFx$WjFM.d("\u224f")), (Float)o.a(this, 1887063187)), mrFx$WjFM.d("\u224f")), (Float)o.a(this, 29445377)));
            OPgL.TS().dispatchCommand((CommandSender)OPgL.TS().getConsoleSender(), (String)object);
        }
    }

    public void yJLS(Player player, Vector vector) {
        Object object = OPgL.TS(OPgL.TS(player.getLocation()), vector);
        if ((Sound)o.a(this, 1079659668) != null) {
            player.playSound((Location)object, (Sound)o.a(this, 1079659668), (float)OPgL.TS((Float)o.a(this, 1887063187)), (float)OPgL.TS((Float)o.a(this, 29445377)));
        }
        if ((String)o.a(this, -1090630400) != null) {
            Object object2 = OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(OPgL.TS(new StringBuilder(mrFx$WjFM.d("\u05a2\u2d8f\ud5f3\u8048\uc9c9\ue030\u01fd\ufebf\u0bbd\u9773")), (String)o.a(this, -1090630400)), mrFx$WjFM.d("\u05f2")), player.getName()), mrFx$WjFM.d("\u05f2")), OPgL.TS(object)), mrFx$WjFM.d("\u05f2")), OPgL.TS(object)), mrFx$WjFM.d("\u05f2")), OPgL.TS(object)), mrFx$WjFM.d("\u05f2")), (Float)o.a(this, 1887063187)), mrFx$WjFM.d("\u05f2")), (Float)o.a(this, 29445377)));
            player.getServer().dispatchCommand((CommandSender)player.getServer().getConsoleSender(), (String)object2);
        }
    }

    public String wnlo() {
        return (String)o.a(this, -1090630400);
    }

    public void NwfF(String string) {
        o.v(this, -1090630400, string);
    }

    public Sound bOmc() {
        return (Sound)o.a(this, 1079659668);
    }

    public void yJLS(Sound sound) {
        o.v(this, 1079659668, (Object)sound);
    }

    public Float PJyi() {
        return (Float)o.a(this, 1887063187);
    }

    public void yJLS(Float f) {
        o.v(this, 1887063187, f);
    }

    public Float GRCK() {
        return (Float)o.a(this, 29445377);
    }

    public void UtIU(Float f) {
        o.v(this, 29445377, f);
    }

    private static Object TS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

