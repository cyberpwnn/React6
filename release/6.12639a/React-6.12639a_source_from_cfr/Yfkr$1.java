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

class Yfkr$1
extends JJHM {
    final /* synthetic */ Yfkr eYsk;
    private final /* synthetic */ Player urTi;

    Yfkr$1(Yfkr yfkr, String string, int n, Player player) {
        this.eYsk = yfkr;
        this.urTi = player;
        super(string, n);
    }

    @Override
    public void run() {
        if (Yfkr$1.yO((Yfkr)o.a(this, -1855301890)) != false) {
            if (Yfkr$1.yO(Yfkr$1.yO((Yfkr)o.a(this, -1855301890))) == false) {
                if (Yfkr$1.yO((Yfkr)o.a(this, -1855301890)) != false) {
                    Yfkr$1.yO((Yfkr)o.a(this, -1855301890), false);
                    if (Yfkr$1.yO(Yfkr$1.yO((Yfkr)o.a(this, -1855301890))) > true) {
                        Yfkr$1.yO((Player)o.a(this, -17148279), Yfkr$1.yO(Yfkr$1.yO(new StringBuilder((String)Yfkr$1.yO(Yfkr$1.yO(Yfkr$1.yO((Yfkr)o.a(this, -1855301890))))), mrFx$WjFM.d("\u1b84\u46c0\ufbbb\u1629\uf071\ue0f7\ua576\u6534\uaf11\u0ce0\u97ed\ua2ac\u8b61\u2481\ue2f2\ubfca\ua073\uc5f9\ua57d\u04d5\u9d13\u132e\ua1a2\u274f\uc3dd\uba65\u7d26\u8a8b\u0978\u386a\u96b5\ue226\u92b5\u248e\u4e31\ue0c9\ub086"))));
                        return;
                    }
                    Yfkr$1.yO((Player)o.a(this, -17148279), mrFx$WjFM.d("\u1b95\u4683\ufbbe\u162d\uf076\ue0a4\ua57a\u6536\uaf07\u0cb3\u97fb\ua2a2\u8b70\u249a\ue2b9\ubf86\ua053\uc5b8\ua528\u04f3\u9d10\u133e\ua1e0\u2750\uc3d0\uba2c\u7d33\u8a97\u0931\u3878\u96ae\ue226\u92b7\u2488\u4e74\ue0c8\ub0c1\u62b8\ua5f4\ufead"));
                }
            }
        }
    }

    private static Object yO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

