/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.command.CommandSender;

public abstract class fJhK
implements NxIh {
    private Class<?> PlyU;
    private DijM HnTK;
    private hGxw<Object> cKAG;
    private hGxw<Object> YESR;
    private static int YEST;

    public fJhK(Class<?> class_, DijM dijM) {
        this.PlyU = class_;
        this.HnTK = dijM;
        this.cKAG = new hGxw();
        this.YESR = new hGxw();
    }

    @Override
    public DijM lekR() {
        return (DijM)((Object)yy.h(this, 235865975));
    }

    @Override
    public Class<?> getType() {
        return (Class)yy.h(this, 1138624376);
    }

    @Override
    public boolean JjvV(Object object) {
        block4 : {
            block3 : {
                block2 : {
                    if (fJhK.og(this.lekR(), (DijM)((Object)yy.p(-1262745790))) == false) break block2;
                    if (fJhK.og(this.VCjX(), object) != false) break block3;
                }
                if (fJhK.og(this.lekR(), (DijM)((Object)yy.p(-751310334))) == false) break block4;
                if (fJhK.og(this.VCjX(), object) != false) break block4;
            }
            return true;
        }
        return false;
    }

    @Override
    public hGxw<Object> VCjX() {
        return (hGxw)yy.h(this, 906168139);
    }

    @Override
    public hGxw<Object> aela() {
        return (hGxw)yy.h(this, 282593100);
    }

    @Override
    public abstract int qdWJ(CommandSender var1, String var2) throws Foor;

    public static NxIh JRFt(CommandSender commandSender, String string) throws Foor {
        if (fJhK.og(string, KDGY$JAHk.Y("\ue56e")) == false) {
            throw new Foor(KDGY$JAHk.Y("\ue563\u3464\ubc3d\u97ef\u9b16\ufa00\u5826\ubbf9\u34a2\u5e97\u9ce1\u078e\uff01\u1a87\u4045\u73e2\ub10a\uc33d\u3c5d\u4e74\u3f72\u16a7\u899b\u995c\u21d8\u9db0\u6019\u4b12\u5bb9\uba1a\uf8ac\u78c9\u6ff0\udda2\u6f10\u539b\u3e72\u4b87\u65cd\uc183\ua03f\uf9ac\u1c5b\ufa8d\u79a6\ucbc0\uf186\uaa39\u3136\u1b4a\u549c\uce0e"));
        }
        if (fJhK.og(string, KDGY$JAHk.Y("\ue514")) == false) {
            throw new Foor(KDGY$JAHk.Y("\ue563\u3464\ubc3d\u97ef\u9b16\ufa00\u5826\ubbf9\u34a2\u5eed\u9ce1\u078e\uff01\u1a87\u4045\u73e2\ub10a\uc33d\u3c5d\u4e74\u3f72\u16a7\u899b\u995c\u21d8\u9db0\u6019\u4b12\u5bb9\uba1a\uf8ac\u78c9\u6ff0\udda2\u6f10\u539b\u3e72\u4b87\u65cd\uc183\ua03f\uf9ac\u1c5b\ufa8d\u79a6\ucbc0\uf186\uaa39\u3136\u1b4a\u549c\uce0e"));
        }
        Object object = fJhK.og(((String[])fJhK.og(string, KDGY$JAHk.Y("\ue514")))[0], true);
        String string2 = ((String[])fJhK.og(string, KDGY$JAHk.Y("\ue514")))[1];
        fJhK fJhK2 = null;
        if (fJhK.og(object, KDGY$JAHk.Y("\ue54d")) != false) {
            fJhK2 = new Hdte();
        } else if (fJhK.og(object, KDGY$JAHk.Y("\ue54b")) != false) {
            fJhK2 = new kkYw((DijM)((Object)yy.p(-1262745790)));
        } else {
            throw new Foor((String)fJhK.og(fJhK.og(fJhK.og(new StringBuilder(KDGY$JAHk.Y("\ue567\u3463\ubc38\u97fd\u9b13\ufa07\u5825\ubbf9\u34cb\u5e92\u9c9a\u0794\uff60\u1ac9")), object), KDGY$JAHk.Y("\ue50c"))));
        }
        yy.K(1088948032, (Integer)yy.p(1088948032) + fJhK2.qdWJ(commandSender, string2));
        return fJhK2;
    }

    public static int pop() {
        int n = (Integer)yy.p(1088948032);
        yy.K(1088948032, 0);
        return n;
    }

    static {
        yy.K(1088948032, 0);
    }

    private static Object og(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

