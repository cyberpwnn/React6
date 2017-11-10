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

@tLIK(value=1)
public class vsgm
extends TEsR {
    private long OGmN;
    private int Mcik;

    public vsgm() {
        super((vsgc)((Object)yy.p(2065623586)));
        this.mXJp((String[])yy.p(-123737513));
        this.mXJp(Chunk.class, new vsgm$1(this));
        this.mXJp(EntityType.class, new vsgm$2(this));
    }

    @Override
    public /* varargs */ void mXJp(WFnH wFnH, NxIh ... arrnxIh) {
        Object object;
        Object e;
        Ralc ralc = new Ralc(0);
        Ralc ralc2 = new Ralc(0);
        Ralc ralc3 = new Ralc(0);
        Ralc ralc4 = new Ralc(0);
        yy.E(this, -1119819176, (long)vsgm.KO());
        int n = 0;
        int n2 = 0;
        for (NxIh nxIh : arrnxIh) {
            if (vsgm.KO(nxIh.getType(), Chunk.class) != false) {
                n += vsgm.KO(nxIh.aela());
            }
            if (vsgm.KO(nxIh.getType(), EntityType.class) == false) continue;
            object = vsgm.KO(nxIh.aela());
            while (object.hasNext()) {
                e = object.next();
                if (!nxIh.JjvV(e)) continue;
                ++n2;
            }
        }
        wFnH.HdqI((String)vsgm.KO(vsgm.KO(vsgm.KO(vsgm.KO(vsgm.KO(vsgm.KO(vsgm.KO(vsgm.KO(vsgm.KO(vsgm.KO(new StringBuilder(BkvY$LhxG.I("\u9d84\uadc2\uac33\u50b8\u8ddc\u2b69\u833e\u5d8b")), n2), BkvY$LhxG.I("\u9de7\uadc3\uac26\u50a4\u8dd0")), n2 == 0 || n2 > 1 ? BkvY$LhxG.I("\u9db4") : ""), BkvY$LhxG.I("\u9de7\uadd8\uac39\u50f4")), n2 == 0 || n2 > 1 ? BkvY$LhxG.I("\u9da2\uadd9\uac2b\u50bd\u8dc1\u2b6e\u833c\u5dd8") : BkvY$LhxG.I("\u9da2\uadd9\uac2b\u50bd\u8dc1\u2b7e")), BkvY$LhxG.I("\u9de7\uadd6\uac3c\u50a6\u8dda\u2b74\u832a\u5d8b")), vsgm.KO(n)), BkvY$LhxG.I("\u9de7\uadd4\uac37\u50a1\u8ddb\u2b6c")), n > 1 || n == 0 ? BkvY$LhxG.I("\u9db4") : "")));
        for (NxIh nxIh : arrnxIh) {
            if (vsgm.KO(nxIh.getType(), Chunk.class) == false) continue;
            vsgm.KO(ralc, vsgm.KO(nxIh.aela()));
            object = vsgm.KO(nxIh.aela());
            while (object.hasNext()) {
                e = object.next();
                if (!nxIh.JjvV(e)) continue;
                this.mXJp((Chunk)e, new vsgm$3(this, ralc4, ralc, ralc2, ralc3, wFnH), wFnH, arrnxIh);
            }
        }
        new vsgm$4(this, BkvY$LhxG.I("\u9da4\uadc2\uac33\u50b8\u8dd0\u2b75\u8374\u5dc6\u6eec\ud112\u9baa\ub585\uaa42\uf94b\u9405\ufdda\u06da\u1e8c\u9421\u47fa\uf5eb\u726b\ud67d"), 2, wFnH, ralc2, ralc3);
    }

    public /* varargs */ void mXJp(Chunk chunk, Runnable runnable, WFnH wFnH, NxIh ... arrnxIh) {
        yy.E(this, -1624184288, (int)vsgm.KO((yIpb)yy.h((CLqw)yy.p(1998252577), 2058873386), chunk));
        runnable.run();
    }

    static /* synthetic */ long mXJp(vsgm vsgm2, long l) {
        long l2 = l;
        yy.E(vsgm2, -1119819176, l2);
        return l2;
    }

    static /* synthetic */ int mXJp(vsgm vsgm2) {
        return (Integer)yy.h(vsgm2, -1624184288);
    }

    static /* synthetic */ long ksfs(vsgm vsgm2) {
        return (Long)yy.h(vsgm2, -1119819176);
    }

    private static Object KO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

