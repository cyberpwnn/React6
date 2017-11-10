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

public class wUJy
implements WFnH {
    private final Player JJGJ;

    public wUJy(Player player) {
        this.JJGJ = player;
    }

    public Player getPlayer() {
        return (Player)yy.h(this, 265357108);
    }

    @Override
    public void jVod(String string) {
        wUJy.VZ((Player)yy.h(this, 265357108), string);
    }

    @Override
    public void wnXH(String string) {
        wUJy.VZ((Player)yy.h(this, 265357108), string);
    }

    @Override
    public void qKCn(String string) {
        wUJy.VZ((Player)yy.h(this, 265357108), string);
    }

    @Override
    public void HdqI(String string) {
        wUJy.VZ((Player)yy.h(this, 265357108), string);
    }

    private static Object VZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

