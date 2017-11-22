/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

class XthG$2
extends vIXT {
    final /* synthetic */ XthG eroQ;
    private final /* synthetic */ Chunk uFhi;
    private final /* synthetic */ long VweQ;

    XthG$2(XthG xthG, Chunk chunk, long l) {
        this.eroQ = xthG;
        this.uFhi = chunk;
        this.VweQ = l;
    }

    @Override
    public void run() {
        Entity[] arrentity = ((Chunk)cv.b(this, 1690432085)).getEntities();
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (entity instanceof Player) {
                XthG$2.HY(entity, XthG$2.HY(XthG$2.HY(new StringBuilder(YEBy$TyVf.W("\u0f78\u7684\uf33f\u4c10\ub935\ufc68\u5660\u0006\ufe2c\ub64d\u8007\u9817\u6663\u351c\ub702\u1a2c\u8947\u2077\u6387\ufa0e\u3dd7\ud73d\u06cb\ud4dd\u1168\u57ea\u7cc0\u7d01\ue973\u79e0\u1ac6\ua025\u4c46\uaaf8\u0ee0\u8c43\uff8e\u31da\uddfc\u3a06\u8ce2\udcda")), XthG$2.HY((Long)cv.b(this, -1429867948), true))));
            }
            ++n2;
        }
    }

    private static Object HY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

