/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.v1_10_R1.Blocks
 *  net.minecraft.server.v1_11_R1.Blocks
 *  net.minecraft.server.v1_12_R1.Blocks
 *  net.minecraft.server.v1_8_R3.Blocks
 *  net.minecraft.server.v1_9_R1.Blocks
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import net.minecraft.server.v1_8_R3.Blocks;

public class TWYT
extends ggmf {
    private TNku<owvU, eHVp> gNnH;
    private iBsQ<?, ?> XCDQ;
    private boolean nJqV;

    @Override
    public void start() {
        o.v(this, 37247112, new TNku());
        TWYT.ok((TNku)o.a(this, 37247112), new owvU((eHVp)((Object)o.k(-543991673)), (eHVp)((Object)o.k(-1647224698))), (eHVp)((Object)o.k(-543991673)));
        TWYT.ok((TNku)o.a(this, 37247112), new owvU((eHVp)((Object)o.k(-97167227)), (eHVp)((Object)o.k(-1641785212))), (eHVp)((Object)o.k(-97167227)));
        TWYT.ok((TNku)o.a(this, 37247112), new owvU((eHVp)((Object)o.k(-1096263549)), (eHVp)((Object)o.k(-1177463950))), (eHVp)((Object)o.k(-1096263549)));
        TWYT.ok((TNku)o.a(this, 37247112), new owvU((eHVp)((Object)o.k(1167475980)), (eHVp)((Object)o.k(1892176753))), (eHVp)((Object)o.k(1167475980)));
        TWYT.ok((TNku)o.a(this, 37247112), new owvU((eHVp)((Object)o.k(329073944)), (eHVp)((Object)o.k(568480624))), (eHVp)((Object)o.k(329073944)));
        this.kbjT();
    }

    private void kbjT() {
        o.v(this, 1942836079, false);
        o.v(this, 1859801966, null);
        Object object = TWYT.ok();
        eHVp eHVp2 = null;
        Object object2 = TWYT.ok(TWYT.ok((TNku)o.a(this, 37247112)));
        while (object2.hasNext()) {
            owvU owvU2 = (owvU)object2.next();
            if (TWYT.ok(owvU2, object) == false) continue;
            eHVp2 = (eHVp)((Object)TWYT.ok((TNku)o.a(this, 37247112), owvU2));
            break;
        }
        if (eHVp2 != null) {
            if (TWYT.ok(eHVp2, (eHVp)((Object)o.k(-543991673))) != false) {
                o.v(this, 1859801966, new jpjE(eHVp2, net.minecraft.server.v1_12_R1.Blocks.class));
            } else if (TWYT.ok(eHVp2, (eHVp)((Object)o.k(-97167227))) != false) {
                o.v(this, 1859801966, new BReF(eHVp2, net.minecraft.server.v1_11_R1.Blocks.class));
            } else if (TWYT.ok(eHVp2, (eHVp)((Object)o.k(-1096263549))) != false) {
                o.v(this, 1859801966, new RbUQ(eHVp2, net.minecraft.server.v1_10_R1.Blocks.class));
            } else if (TWYT.ok(eHVp2, (eHVp)((Object)o.k(1167475980))) != false) {
                o.v(this, 1859801966, new BdGQ(eHVp2, net.minecraft.server.v1_9_R1.Blocks.class));
            } else if (TWYT.ok(eHVp2, (eHVp)((Object)o.k(329073944))) != false) {
                o.v(this, 1859801966, new oLsv(eHVp2, Blocks.class));
            } else {
                TWYT.ok(TWYT.ok(TWYT.ok(new StringBuilder((String)TWYT.ok(TWYT.ok(nJPf$sILv.G("\u9e02\u83cc\u9887\u256d\ubaf8\u7772\u6e99\u46a0\u781c\u9309\uc7dd\u56ec\ue1bf\u42e6\u4528\u564e\u6a38\ua7dd\uc4cc\u80e7\u4fad\u549d\u5a25\ucfe4\uc5bf\ud9ae\u2df5\u6ecf\u1096\udaa5\u755f\u7536\u62fd\u9990\uffe5\u94b9")))), TWYT.ok(object))));
                TWYT.ok(TWYT.ok(nJPf$sILv.G("\u9e02\u83cc\u9887\u256d\ubaf8\u7772\u6e99\u46a0\u781c\u9309\uc7dd\u56ec\ue1bf\u42e6\u4528\u564f\u6a3b\ua7c7\uc4c3\u80e8\u4fad\u549a\u5a24\ucffa\uc5f7\ud9ab\u2de8\u6ec8\u109d\udae6\u754f\u7577\u62e3\u999a\uffe5\u94b9")));
            }
        }
        if ((iBsQ)o.a(this, 1859801966) != null) {
            TWYT.ok(TWYT.ok(TWYT.ok(TWYT.ok(TWYT.ok(new StringBuilder((String)TWYT.ok(TWYT.ok(nJPf$sILv.G("\u9e02\u83cc\u9887\u256d\ubaf8\u7772\u6e99\u46a0\u781c\u9309\uc7dd\u56ec\ue1bf\u42e6\u4528\u564b\u6a38\ua7dd\uc4ce\u80e7\u4fad\u549a\u5a24\ucffa\uc5f7\ud9ab\u2de8\u6ece\u1080")))), TWYT.ok(eHVp2)), TWYT.ok(nJPf$sILv.G("\u9e02\u83cc\u9887\u256d\ubaf8\u7772\u6e99\u46a0\u781c\u9309\uc7dd\u56ec\ue1bf\u42e6\u4528\u564b\u6a38\ua7da"))), TWYT.ok(object))));
            TWYT.ok(TWYT.ok(nJPf$sILv.G("\u9e02\u83cc\u9887\u256d\ubaf8\u7772\u6e99\u46a0\u781c\u9309\uc7dd\u56ec\ue1bf\u42e6\u4528\u5644\u6a39\ua7c2\uc4c5\u80e0\u4ff4\u549a\u5a24\ucff7\uc5bf\ud9aa\u2df0\u6ece\u1091\udae3\u754f")));
            ((iBsQ)o.a(this, 1859801966)).eYJe();
            TWYT.ok(nJPf$sILv.G("\u9e5d\u839d\u98d5\u2533\ubaae\u7762\u6ecd\u46f3\u784b\u9351\uc783\u56a5\ue1ed\u42a9\u453b\u5610\u6a6a\ua795\uc49d\u80be\u4fbd\u54ce\u5a77\ucfad"));
            o.v(this, 1942836079, true);
        }
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
    }

    public TNku<owvU, eHVp> WWpk() {
        return (TNku)o.a(this, 37247112);
    }

    public iBsQ<?, ?> BuJC() {
        return (iBsQ)o.a(this, 1859801966);
    }

    public boolean wwNq() {
        return (Boolean)o.a(this, 1942836079);
    }

    private static Object ok(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

