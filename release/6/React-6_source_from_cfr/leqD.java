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

public class leqD {
    private String agDG;
    private Sound iLXI;
    private Float QhVA;
    private Float WYFR;

    public leqD(String string, Float f, Float f2) {
        this.agDG = string;
        this.QhVA = f;
        this.WYFR = f2;
    }

    public leqD(String string) {
        this.agDG = string;
        this.QhVA = leqD.JQ(1.0f);
        this.WYFR = leqD.JQ(1.0f);
    }

    public leqD(Sound sound, Float f, Float f2) {
        this.iLXI = sound;
        this.QhVA = f;
        this.WYFR = f2;
    }

    public leqD(Sound sound) {
        this.iLXI = sound;
        this.QhVA = leqD.JQ(1.0f);
        this.WYFR = leqD.JQ(1.0f);
    }

    public void gUxV(Player player) {
        if ((Sound)yy.h(this, 2681047) != null) {
            player.playSound(player.getLocation(), (Sound)yy.h(this, 2681047), (float)leqD.JQ((Float)yy.h(this, 386590936)), (float)leqD.JQ((Float)yy.h(this, -677320538)));
        }
        if ((String)yy.h(this, -969676629) != null) {
            Object object = leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(new StringBuilder(NVIs$JbpD.H("\u9071\u278a\uee62\u9072\ue813\u2ed7\uaf16\ubd3d\u563a\u0685")), (String)yy.h(this, -969676629)), NVIs$JbpD.H("\u9021")), player.getName()), NVIs$JbpD.H("\u9021")), leqD.JQ(player.getLocation())), NVIs$JbpD.H("\u9021")), leqD.JQ(player.getLocation())), NVIs$JbpD.H("\u9021")), leqD.JQ(player.getLocation())), NVIs$JbpD.H("\u9021")), (Float)yy.h(this, 386590936)), NVIs$JbpD.H("\u9021")), (Float)yy.h(this, -677320538)));
            player.getServer().dispatchCommand((CommandSender)player.getServer().getConsoleSender(), (String)object);
        }
    }

    public void SnBs(Location location) {
        if ((Sound)yy.h(this, 2681047) != null) {
            leqD.JQ(location).playSound(location, (Sound)yy.h(this, 2681047), (float)leqD.JQ((Float)yy.h(this, 386590936)), (float)leqD.JQ((Float)yy.h(this, -677320538)));
        }
        if ((String)yy.h(this, -969676629) != null) {
            Object object = leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(new StringBuilder(BkvY$LhxG.I("\u676a\u06c8\u1041\ue1df\uc61f\u2e0f\u9072\u7af0\u28ec\ue2e3")), (String)yy.h(this, -969676629)), BkvY$LhxG.I("\u673a\u06e4\u1041\ue186")), leqD.JQ(location)), BkvY$LhxG.I("\u673a")), leqD.JQ(location)), BkvY$LhxG.I("\u673a")), leqD.JQ(location)), BkvY$LhxG.I("\u673a")), (Float)yy.h(this, 386590936)), BkvY$LhxG.I("\u673a")), (Float)yy.h(this, -677320538)));
            leqD.JQ().dispatchCommand((CommandSender)leqD.JQ().getConsoleSender(), (String)object);
        }
    }

    public void mXJp(Player player, Vector vector) {
        Object object = leqD.JQ(leqD.JQ(player.getLocation()), vector);
        if ((Sound)yy.h(this, 2681047) != null) {
            player.playSound((Location)object, (Sound)yy.h(this, 2681047), (float)leqD.JQ((Float)yy.h(this, 386590936)), (float)leqD.JQ((Float)yy.h(this, -677320538)));
        }
        if ((String)yy.h(this, -969676629) != null) {
            Object object2 = leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(leqD.JQ(new StringBuilder(NVIs$JbpD.H("\u9518\u683b\u7f68\u9166\u7d2c\ua468\u6b15\u7437\u849b\u29b0")), (String)yy.h(this, -969676629)), NVIs$JbpD.H("\u9548")), player.getName()), NVIs$JbpD.H("\u9548")), leqD.JQ(object)), NVIs$JbpD.H("\u9548")), leqD.JQ(object)), NVIs$JbpD.H("\u9548")), leqD.JQ(object)), NVIs$JbpD.H("\u9548")), (Float)yy.h(this, 386590936)), NVIs$JbpD.H("\u9548")), (Float)yy.h(this, -677320538)));
            player.getServer().dispatchCommand((CommandSender)player.getServer().getConsoleSender(), (String)object2);
        }
    }

    public String bqhA() {
        return (String)yy.h(this, -969676629);
    }

    public void tTQG(String string) {
        yy.E(this, -969676629, string);
    }

    public Sound pinh() {
        return (Sound)yy.h(this, 2681047);
    }

    public void mXJp(Sound sound) {
        yy.E(this, 2681047, (Object)sound);
    }

    public Float lfSt() {
        return (Float)yy.h(this, 386590936);
    }

    public void mXJp(Float f) {
        yy.E(this, 386590936, f);
    }

    public Float NUlR() {
        return (Float)yy.h(this, -677320538);
    }

    public void ksfs(Float f) {
        yy.E(this, -677320538, f);
    }

    private static Object JQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

