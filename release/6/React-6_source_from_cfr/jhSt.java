/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.EntityType
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.EntityType;

@IWbc(value=1)
public class jhSt
extends TyVf {
    private long QFEs;
    private int YEMO;

    public jhSt() {
        super((cIji)((Object)cv.e(-2006183655)));
        this.ssNb((String[])cv.e(1074663768));
        this.ssNb(Chunk.class, new jhSt$1(this));
        this.ssNb(EntityType.class, new jhSt$2(this));
    }

    @Override
    public /* varargs */ void ssNb(ftyu ftyu2, EmKi ... arremKi) {
        Object object;
        Object e;
        EmKi emKi;
        TFYr tFYr = new TFYr(0);
        TFYr tFYr2 = new TFYr(0);
        TFYr tFYr3 = new TFYr(0);
        TFYr tFYr4 = new TFYr(0);
        cv.e(this, -1089728165, (long)jhSt.wA());
        int n = 0;
        int n2 = 0;
        EmKi[] arremKi2 = arremKi;
        int n3 = arremKi2.length;
        int n4 = 0;
        while (n4 < n3) {
            emKi = arremKi2[n4];
            if (jhSt.wA(emKi.getType(), Chunk.class) != false) {
                n += jhSt.wA(emKi.mXMK());
            }
            if (jhSt.wA(emKi.getType(), EntityType.class) != false) {
                object = jhSt.wA(emKi.mXMK());
                while (object.hasNext()) {
                    e = object.next();
                    if (!emKi.OXeK(e)) continue;
                    ++n2;
                }
            }
            ++n4;
        }
        ftyu2.YoSa((String)jhSt.wA(jhSt.wA(jhSt.wA(jhSt.wA(jhSt.wA(jhSt.wA(jhSt.wA(jhSt.wA(jhSt.wA(jhSt.wA(new StringBuilder(KUXS$dwji.S("\ufb84\u28c8\u9e8d\u241e\u9688\ubede\u1ff9\ud947")), n2), KUXS$dwji.S("\ufbe7\u28c9\u9e98\u2402\u9684")), n2 == 0 || n2 > 1 ? KUXS$dwji.S("\ufbb4") : ""), KUXS$dwji.S("\ufbe7\u28d2\u9e87\u2452")), n2 == 0 || n2 > 1 ? KUXS$dwji.S("\ufba2\u28d3\u9e95\u241b\u9695\ubed9\u1ffb\ud914") : KUXS$dwji.S("\ufba2\u28d3\u9e95\u241b\u9695\ubec9")), KUXS$dwji.S("\ufbe7\u28dc\u9e82\u2400\u968e\ubec3\u1fed\ud947")), jhSt.wA(n)), KUXS$dwji.S("\ufbe7\u28de\u9e89\u2407\u968f\ubedb")), n > 1 || n == 0 ? KUXS$dwji.S("\ufbb4") : "")));
        arremKi2 = arremKi;
        n3 = arremKi2.length;
        n4 = 0;
        while (n4 < n3) {
            emKi = arremKi2[n4];
            if (jhSt.wA(emKi.getType(), Chunk.class) != false) {
                jhSt.wA(tFYr, jhSt.wA(emKi.mXMK()));
                object = jhSt.wA(emKi.mXMK());
                while (object.hasNext()) {
                    e = object.next();
                    if (!emKi.OXeK(e)) continue;
                    this.ssNb((Chunk)e, new jhSt$3(this, tFYr4, tFYr, tFYr2, tFYr3, ftyu2), ftyu2, arremKi);
                }
            }
            ++n4;
        }
        new jhSt$4(this, KUXS$dwji.S("\ufba4\u28c8\u9e8d\u241e\u9684\ubec2\u1fb3\ud90a\u404e\u7c92\udf4c\u4473\u6d83\u6505\u91ab\u9ae4\u9a76\u3e45\u5ad5\u563b\u6893\u939d\ubc60"), 2, ftyu2, tFYr2, tFYr3);
    }

    public /* varargs */ void ssNb(Chunk chunk, Runnable runnable, ftyu ftyu2, EmKi ... arremKi) {
        cv.e(this, -987557565, (int)jhSt.wA((cAai)cv.b((YoSa)cv.e(239341894), -865660607), chunk));
        runnable.run();
    }

    static /* synthetic */ void ssNb(jhSt jhSt2, long l) {
        cv.e(jhSt2, -1089728165, l);
    }

    static /* synthetic */ int ssNb(jhSt jhSt2) {
        return (Integer)cv.b(jhSt2, -987557565);
    }

    static /* synthetic */ long DYFV(jhSt jhSt2) {
        return (Long)cv.b(jhSt2, -1089728165);
    }

    private static Object wA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

