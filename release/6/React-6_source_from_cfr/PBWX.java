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

public class PBWX
implements ftyu {
    private final Player JIdp;

    public PBWX(Player player) {
        this.JIdp = player;
    }

    public Player getPlayer() {
        return (Player)cv.b(this, -1881272764);
    }

    @Override
    public void DYFV(String string) {
        PBWX.xs((Player)cv.b(this, -1881272764), string);
    }

    @Override
    public void IWSm(String string) {
        PBWX.xs((Player)cv.b(this, -1881272764), string);
    }

    @Override
    public void OXeK(String string) {
        PBWX.xs((Player)cv.b(this, -1881272764), string);
    }

    @Override
    public void YoSa(String string) {
        PBWX.xs((Player)cv.b(this, -1881272764), string);
    }

    private static Object xs(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

