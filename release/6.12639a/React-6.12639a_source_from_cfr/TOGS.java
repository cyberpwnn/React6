/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Player;

public class TOGS
implements xynF {
    private final Player XlkH;

    public TOGS(Player player) {
        this.XlkH = player;
    }

    public Player getPlayer() {
        return (Player)o.a(this, 816333918);
    }

    @Override
    public void UtIU(String string) {
        TOGS.as((Player)o.a(this, 816333918), string);
    }

    @Override
    public void biLo(String string) {
        TOGS.as((Player)o.a(this, 816333918), string);
    }

    @Override
    public void VwLY(String string) {
        TOGS.as((Player)o.a(this, 816333918), string);
    }

    @Override
    public void TEqA(String string) {
        TOGS.as((Player)o.a(this, 816333918), string);
    }

    private static Object as(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

