/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

@IWbc(value=1)
public class vtFs
extends TyVf {
    private long QFEs;
    private int YEMO;

    public vtFs() {
        super((cIji)((Object)cv.e(423694606)));
        this.ssNb((String[])cv.e(-88927991));
        this.ssNb(Chunk.class, new vtFs$1(this));
        this.ssNb(EntityType.class, new vtFs$2(this));
    }

    @Override
    public /* varargs */ void ssNb(ftyu ftyu2, EmKi ... arremKi) {
        Object object;
        Object e;
        TFYr tFYr = new TFYr(0);
        TFYr tFYr2 = new TFYr(0);
        TFYr tFYr3 = new TFYr(0);
        TFYr tFYr4 = new TFYr(0);
        cv.e(this, -1836904184, (long)vtFs.SW());
        int n = 0;
        int n2 = 0;
        for (EmKi emKi : arremKi) {
            if (vtFs.SW(emKi.getType(), Chunk.class) != false) {
                n += vtFs.SW(emKi.mXMK());
            }
            if (vtFs.SW(emKi.getType(), EntityType.class) == false) continue;
            object = vtFs.SW(emKi.mXMK());
            while (object.hasNext()) {
                e = object.next();
                if (!emKi.OXeK(e)) continue;
                ++n2;
            }
        }
        ftyu2.YoSa((String)vtFs.SW(vtFs.SW(vtFs.SW(vtFs.SW(vtFs.SW(vtFs.SW(vtFs.SW(vtFs.SW(vtFs.SW(vtFs.SW(new StringBuilder(YEBy$TyVf.W("\ub8d9\u93f2\ubcf4\u3a8f\u8506\ue304\uf923\u75c2")), n2), YEBy$TyVf.W("\ub8a9\u93f3\ubcff\u3a98\u850a")), n2 == 0 || n2 > 1 ? YEBy$TyVf.W("\ub8fa") : ""), YEBy$TyVf.W("\ub8a9\u93e8\ubce0\u3ac8")), n2 == 0 || n2 > 1 ? YEBy$TyVf.W("\ub8ec\u93e9\ubcf2\u3a81\u851b\ue303\uf921\u7591") : YEBy$TyVf.W("\ub8ec\u93e9\ubcf2\u3a81\u851b\ue313")), YEBy$TyVf.W("\ub8a9\u93e6\ubce5\u3a9a\u8500\ue319\uf937\u75c2")), vtFs.SW(n)), YEBy$TyVf.W("\ub8a9\u93e4\ubcee\u3a9d\u8501\ue301")), n > 1 || n == 0 ? YEBy$TyVf.W("\ub8fa") : "")));
        for (EmKi emKi : arremKi) {
            if (vtFs.SW(emKi.getType(), Chunk.class) == false) continue;
            vtFs.SW(tFYr, vtFs.SW(emKi.mXMK()));
            object = vtFs.SW(emKi.mXMK());
            while (object.hasNext()) {
                e = object.next();
                if (!emKi.OXeK(e)) continue;
                this.DYFV((Chunk)e, new vtFs$3(this, tFYr4, tFYr, tFYr2, tFYr3, ftyu2), ftyu2, arremKi);
            }
        }
        new vtFs$4(this, YEBy$TyVf.W("\ub8f9\u93f2\ubcf4\u3a8f\u850a\ue318\uf969\u758f\ub389\u4628\u0111\ub0f8\u9c75\u9cbf\u25f3\u654c\u56e7\uc826\u35a2\u9caf\u66da\u9833\u19d6"), 2, ftyu2, tFYr2, tFYr3);
    }

    public /* varargs */ void DYFV(Chunk chunk, Runnable runnable, ftyu ftyu2, EmKi ... arremKi) {
        boolean bl = false;
        TFYr tFYr = new TFYr(0);
        block0 : for (int i = 0; i < chunk.getEntities().length; ++i) {
            int n = i;
            Entity entity = chunk.getEntities()[i];
            for (EmKi emKi : arremKi) {
                if (vtFs.SW(emKi.getType(), EntityType.class) != false && !emKi.OXeK((Object)entity.getType())) continue block0;
            }
            bl = true;
            new vtFs$5(this, entity, tFYr, n, chunk, runnable);
        }
        if (!bl) {
            cv.e(this, 84939019, (int)vtFs.SW(tFYr));
            runnable.run();
        }
    }

    static /* synthetic */ long ssNb(vtFs vtFs2, long l) {
        long l2 = l;
        cv.e(vtFs2, -1836904184, l2);
        return l2;
    }

    static /* synthetic */ int ssNb(vtFs vtFs2) {
        return (Integer)cv.b(vtFs2, 84939019);
    }

    static /* synthetic */ long DYFV(vtFs vtFs2) {
        return (Long)cv.b(vtFs2, -1836904184);
    }

    static /* synthetic */ int ssNb(vtFs vtFs2, int n) {
        int n2 = n;
        cv.e(vtFs2, 84939019, n2);
        return n2;
    }

    private static Object SW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

