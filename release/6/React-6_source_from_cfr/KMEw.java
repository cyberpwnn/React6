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

public class KMEw {
    private String hcNi;
    private Sound xGiX;
    private Float wDeq;
    private Float feWx;

    public KMEw(String string, Float f, Float f2) {
        this.hcNi = string;
        this.wDeq = f;
        this.feWx = f2;
    }

    public KMEw(String string) {
        this.hcNi = string;
        this.wDeq = KMEw.kN(1.0f);
        this.feWx = KMEw.kN(1.0f);
    }

    public KMEw(Sound sound, Float f, Float f2) {
        this.xGiX = sound;
        this.wDeq = f;
        this.feWx = f2;
    }

    public KMEw(Sound sound) {
        this.xGiX = sound;
        this.wDeq = KMEw.kN(1.0f);
        this.feWx = KMEw.kN(1.0f);
    }

    public void TyVf(Player player) {
        if ((Sound)cv.b(this, 1704260170) != null) {
            player.playSound(player.getLocation(), (Sound)cv.b(this, 1704260170), (float)KMEw.kN((Float)cv.b(this, 449835573)), (float)KMEw.kN((Float)cv.b(this, 1243869751)));
        }
        if ((String)cv.b(this, -1345261002) != null) {
            Object object = KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(new StringBuilder(YEBy$TyVf.W("\u7f44\u64b3\ucf5c\uef12\u0c58\u542e\u428b\ub4c9\uc23f\u0292")), (String)cv.b(this, -1345261002)), YEBy$TyVf.W("\u7f14")), player.getName()), YEBy$TyVf.W("\u7f14")), KMEw.kN(player.getLocation())), YEBy$TyVf.W("\u7f14")), KMEw.kN(player.getLocation())), YEBy$TyVf.W("\u7f14")), KMEw.kN(player.getLocation())), YEBy$TyVf.W("\u7f14")), (Float)cv.b(this, 449835573)), YEBy$TyVf.W("\u7f14")), (Float)cv.b(this, 1243869751)));
            player.getServer().dispatchCommand((CommandSender)player.getServer().getConsoleSender(), (String)object);
        }
    }

    public void OXeK(Location location) {
        if ((Sound)cv.b(this, 1704260170) != null) {
            KMEw.kN(location).playSound(location, (Sound)cv.b(this, 1704260170), (float)KMEw.kN((Float)cv.b(this, 449835573)), (float)KMEw.kN((Float)cv.b(this, 1243869751)));
        }
        if ((String)cv.b(this, -1345261002) != null) {
            Object object = KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(new StringBuilder(rgig$AWxc.r("\ua0ad\u3b85\u441a\udb02\u48b4\u38d3\uf83a\ue1fb\uc25a\u6144")), (String)cv.b(this, -1345261002)), rgig$AWxc.r("\ua0fd\u3ba9\u441a\udb5b")), KMEw.kN(location)), rgig$AWxc.r("\ua0fd")), KMEw.kN(location)), rgig$AWxc.r("\ua0fd")), KMEw.kN(location)), rgig$AWxc.r("\ua0fd")), (Float)cv.b(this, 449835573)), rgig$AWxc.r("\ua0fd")), (Float)cv.b(this, 1243869751)));
            KMEw.kN().dispatchCommand((CommandSender)KMEw.kN().getConsoleSender(), (String)object);
        }
    }

    public void ssNb(Player player, Vector vector) {
        Object object = KMEw.kN(KMEw.kN(player.getLocation()), vector);
        if ((Sound)cv.b(this, 1704260170) != null) {
            player.playSound((Location)object, (Sound)cv.b(this, 1704260170), (float)KMEw.kN((Float)cv.b(this, 449835573)), (float)KMEw.kN((Float)cv.b(this, 1243869751)));
        }
        if ((String)cv.b(this, -1345261002) != null) {
            Object object2 = KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(KMEw.kN(new StringBuilder(KUXS$dwji.S("\u3408\u09e6\ub6a0\ubf51\u2db2\u179b\u01d8\uc038\u723a\u4bf3")), (String)cv.b(this, -1345261002)), KUXS$dwji.S("\u3458")), player.getName()), KUXS$dwji.S("\u3458")), KMEw.kN(object)), KUXS$dwji.S("\u3458")), KMEw.kN(object)), KUXS$dwji.S("\u3458")), KMEw.kN(object)), KUXS$dwji.S("\u3458")), (Float)cv.b(this, 449835573)), KUXS$dwji.S("\u3458")), (Float)cv.b(this, 1243869751)));
            player.getServer().dispatchCommand((CommandSender)player.getServer().getConsoleSender(), (String)object2);
        }
    }

    public String kQsA() {
        return (String)cv.b(this, -1345261002);
    }

    public void CMSR(String string) {
        cv.e(this, -1345261002, string);
    }

    public Sound WaKm() {
        return (Sound)cv.b(this, 1704260170);
    }

    public void ssNb(Sound sound) {
        cv.e(this, 1704260170, (Object)sound);
    }

    public Float UARh() {
        return (Float)cv.b(this, 449835573);
    }

    public void ssNb(Float f) {
        cv.e(this, 449835573, f);
    }

    public Float KUXS() {
        return (Float)cv.b(this, 1243869751);
    }

    public void DYFV(Float f) {
        cv.e(this, 1243869751, f);
    }

    private static Object kN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

