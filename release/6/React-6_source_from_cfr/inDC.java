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

@tLIK(value=1)
public class inDC
extends TEsR {
    private long OGmN;
    private int Mcik;

    public inDC() {
        super((vsgc)((Object)yy.p(802875970)));
        this.mXJp((String[])yy.p(585427575));
        this.mXJp(Chunk.class, new inDC$1(this));
    }

    @Override
    public /* varargs */ void mXJp(WFnH wFnH, NxIh ... arrnxIh) {
        Ralc ralc = new Ralc(0);
        Ralc ralc2 = new Ralc(0);
        Ralc ralc3 = new Ralc(0);
        Ralc ralc4 = new Ralc(0);
        yy.E(this, -554112392, (long)inDC.rs());
        int n = 0;
        for (NxIh nxIh : arrnxIh) {
            if (inDC.rs(nxIh.getType(), Chunk.class) == false) continue;
            n += inDC.rs(nxIh.aela());
        }
        wFnH.HdqI((String)inDC.rs(inDC.rs(inDC.rs(inDC.rs(new StringBuilder(NVIs$JbpD.H("\uaf5b\u7a17\u060f\u05e2\uf04a\u6891\u33ce\u45c2")), inDC.rs(n)), NVIs$JbpD.H("\uaf2b\u7a01\u0615\u05f0\uf04d\u6894")), n > 1 || n == 0 ? NVIs$JbpD.H("\uaf78") : "")));
        for (NxIh nxIh : arrnxIh) {
            if (inDC.rs(nxIh.getType(), Chunk.class) == false) continue;
            inDC.rs(ralc, inDC.rs(nxIh.aela()));
            Object object = inDC.rs(nxIh.aela());
            while (object.hasNext()) {
                Object e = object.next();
                if (!nxIh.JjvV(e)) continue;
                this.ksfs((Chunk)e, new inDC$2(this, ralc4, ralc, ralc2, ralc3, wFnH), wFnH, arrnxIh);
            }
        }
        new inDC$3(this, NVIs$JbpD.H("\uaf7b\u7a17\u060f\u05e2\uf046\u688d\u3384\u458f\ub5c1\ud149\u45c9\ub376\u7560\u5a1d\u72df\ud8b2\uc622\u3e98\u9a72\u9d07\u27bb\uc2ea\u83f9"), 30, wFnH, ralc4);
    }

    public /* varargs */ void ksfs(Chunk chunk, Runnable runnable, WFnH wFnH, NxIh ... arrnxIh) {
        new inDC$4(this, chunk, runnable);
    }

    static /* synthetic */ long mXJp(inDC inDC2, long l) {
        long l2 = l;
        yy.E(inDC2, -554112392, l2);
        return l2;
    }

    static /* synthetic */ int mXJp(inDC inDC2) {
        return (Integer)yy.h(inDC2, 190769741);
    }

    static /* synthetic */ long ksfs(inDC inDC2) {
        return (Long)yy.h(inDC2, -554112392);
    }

    private static Object rs(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

