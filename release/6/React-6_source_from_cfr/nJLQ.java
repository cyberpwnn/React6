/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;

@IWbc(value=1)
public class nJLQ
extends TyVf {
    private long QFEs;
    private int YEMO;

    public nJLQ() {
        super((cIji)((Object)cv.e(-1064825111)));
        this.ssNb((String[])cv.e(-114553112));
        this.ssNb(Chunk.class, new nJLQ$1(this));
    }

    @Override
    public /* varargs */ void ssNb(ftyu ftyu2, EmKi ... arremKi) {
        TFYr tFYr = new TFYr(0);
        TFYr tFYr2 = new TFYr(0);
        TFYr tFYr3 = new TFYr(0);
        TFYr tFYr4 = new TFYr(0);
        cv.e(this, 284167915, (long)nJLQ.oC());
        int n = 0;
        for (EmKi emKi : arremKi) {
            if (nJLQ.oC(emKi.getType(), Chunk.class) == false) continue;
            n += nJLQ.oC(emKi.mXMK());
        }
        ftyu2.YoSa((String)nJLQ.oC(nJLQ.oC(nJLQ.oC(nJLQ.oC(new StringBuilder(rgig$AWxc.r("\u6bd2\u1800\u3e96\u649c\u9558\u4fc8\u48eb\u3c57")), nJLQ.oC(n)), rgig$AWxc.r("\u6ba2\u1816\u3e8c\u648e\u955f\u4fcd")), n > 1 || n == 0 ? rgig$AWxc.r("\u6bf1") : "")));
        for (EmKi emKi : arremKi) {
            if (nJLQ.oC(emKi.getType(), Chunk.class) == false) continue;
            nJLQ.oC(tFYr, nJLQ.oC(emKi.mXMK()));
            Object object = nJLQ.oC(emKi.mXMK());
            while (object.hasNext()) {
                Object e = object.next();
                if (!emKi.OXeK(e)) continue;
                this.DYFV((Chunk)e, new nJLQ$2(this, tFYr4, tFYr, tFYr2, tFYr3, ftyu2), ftyu2, arremKi);
            }
        }
        new nJLQ$3(this, rgig$AWxc.r("\u6bf2\u1800\u3e96\u649c\u9554\u4fd4\u48a1\u3c1a\u77d1\u523a\uf650\uc293\u868c\u305b\u7a8d\u862c\u943a\u87da\u49d6\u190c\ufe8b\u4b44\u52ba"), 30, ftyu2, tFYr4);
    }

    public /* varargs */ void DYFV(Chunk chunk, Runnable runnable, ftyu ftyu2, EmKi ... arremKi) {
        new nJLQ$4(this, chunk, runnable);
    }

    static /* synthetic */ long ssNb(nJLQ nJLQ2, long l) {
        long l2 = l;
        cv.e(nJLQ2, 284167915, l2);
        return l2;
    }

    static /* synthetic */ int ssNb(nJLQ nJLQ2) {
        return (Integer)cv.b(nJLQ2, 280235754);
    }

    static /* synthetic */ long DYFV(nJLQ nJLQ2) {
        return (Long)cv.b(nJLQ2, 284167915);
    }

    private static Object oC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

