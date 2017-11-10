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

@tLIK(value=1)
public class ePUd
extends TEsR {
    private long OGmN;
    private int Mcik;

    public ePUd() {
        super((vsgc)((Object)yy.p(-497948263)));
        this.mXJp((String[])yy.p(257878626));
        this.mXJp(Chunk.class, new ePUd$1(this));
        this.mXJp(EntityType.class, new ePUd$2(this));
    }

    @Override
    public /* varargs */ void mXJp(WFnH wFnH, NxIh ... arrnxIh) {
        Object object;
        Object e;
        Ralc ralc = new Ralc(0);
        Ralc ralc2 = new Ralc(0);
        Ralc ralc3 = new Ralc(0);
        Ralc ralc4 = new Ralc(0);
        yy.E(this, -649729641, (long)ePUd.uv());
        int n = 0;
        int n2 = 0;
        for (NxIh nxIh : arrnxIh) {
            if (ePUd.uv(nxIh.getType(), Chunk.class) != false) {
                n += ePUd.uv(nxIh.aela());
            }
            if (ePUd.uv(nxIh.getType(), EntityType.class) == false) continue;
            object = ePUd.uv(nxIh.aela());
            while (object.hasNext()) {
                e = object.next();
                if (!nxIh.JjvV(e)) continue;
                ++n2;
            }
        }
        wFnH.HdqI((String)ePUd.uv(ePUd.uv(ePUd.uv(ePUd.uv(ePUd.uv(ePUd.uv(ePUd.uv(ePUd.uv(ePUd.uv(ePUd.uv(new StringBuilder(KDGY$JAHk.Y("\uef9b\uf88f\u7f38\u0308\uef67\u35fb\ubee0\u4694")), n2), KDGY$JAHk.Y("\uefeb\uf88e\u7f33\u031f\uef6b")), n2 == 0 || n2 > 1 ? KDGY$JAHk.Y("\uefb8") : ""), KDGY$JAHk.Y("\uefeb\uf895\u7f2c\u034f")), n2 == 0 || n2 > 1 ? KDGY$JAHk.Y("\uefae\uf894\u7f3e\u0306\uef7a\u35fc\ubee2\u46c7") : KDGY$JAHk.Y("\uefae\uf894\u7f3e\u0306\uef7a\u35ec")), KDGY$JAHk.Y("\uefeb\uf89b\u7f29\u031d\uef61\u35e6\ubef4\u4694")), ePUd.uv(n)), KDGY$JAHk.Y("\uefeb\uf899\u7f22\u031a\uef60\u35fe")), n > 1 || n == 0 ? KDGY$JAHk.Y("\uefb8") : "")));
        for (NxIh nxIh : arrnxIh) {
            if (ePUd.uv(nxIh.getType(), Chunk.class) == false) continue;
            ePUd.uv(ralc, ePUd.uv(nxIh.aela()));
            object = ePUd.uv(nxIh.aela());
            while (object.hasNext()) {
                e = object.next();
                if (!nxIh.JjvV(e)) continue;
                this.ksfs((Chunk)e, new ePUd$3(this, ralc4, ralc, ralc2, ralc3, wFnH), wFnH, arrnxIh);
            }
        }
        new ePUd$4(this, KDGY$JAHk.Y("\uefbb\uf88f\u7f38\u0308\uef6b\u35e7\ubeaa\u46d9\u626c\u428b\u91c0\ud5fb\ud501\u4d24\uf701\ufd8b\u5b73\ud398\ub5fb\u3a43\uc18c\u555b\u4514"), 2, wFnH, ralc2, ralc3);
    }

    public /* varargs */ void ksfs(Chunk chunk, Runnable runnable, WFnH wFnH, NxIh ... arrnxIh) {
        boolean bl = false;
        Ralc ralc = new Ralc(0);
        block0 : for (int i = 0; i < chunk.getEntities().length; ++i) {
            int n = i;
            Entity entity = chunk.getEntities()[i];
            for (NxIh nxIh : arrnxIh) {
                if (ePUd.uv(nxIh.getType(), EntityType.class) != false && !nxIh.JjvV((Object)entity.getType())) continue block0;
            }
            bl = true;
            new ePUd$5(this, entity, ralc, n, chunk, runnable);
        }
        if (!bl) {
            yy.E(this, 1794566552, (int)ePUd.uv(ralc));
            runnable.run();
        }
    }

    static /* synthetic */ long mXJp(ePUd ePUd2, long l) {
        long l2 = l;
        yy.E(ePUd2, -649729641, l2);
        return l2;
    }

    static /* synthetic */ int mXJp(ePUd ePUd2) {
        return (Integer)yy.h(ePUd2, 1794566552);
    }

    static /* synthetic */ long ksfs(ePUd ePUd2) {
        return (Long)yy.h(ePUd2, -649729641);
    }

    static /* synthetic */ int mXJp(ePUd ePUd2, int n) {
        int n2 = n;
        yy.E(ePUd2, 1794566552, n2);
        return n2;
    }

    private static Object uv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

