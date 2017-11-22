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

class XthG$1
extends vIXT {
    final /* synthetic */ XthG eroQ;
    private final /* synthetic */ Chunk uFhi;

    XthG$1(XthG xthG, Chunk chunk) {
        this.eroQ = xthG;
        this.uFhi = chunk;
    }

    @Override
    public void run() {
        Entity[] arrentity = ((Chunk)cv.b(this, -657657238)).getEntities();
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (entity instanceof Player) {
                XthG$1.VW(entity, YEBy$TyVf.W("\ua0ef\u9688\u04e3\uae4b\u067f\u217d\uf4eb\u425d\ueb74\u5207\u263e\uf42e\u18c5\u88f5\ua130\ued17\u9621\u64f2\u9a7a\ua6ac\u88db\ub7e3\u62af\u2317\u55bb\uee5a\u3636\u2f00\u4c58\uf5e2\u70d9\u4c1a\u257e\u6185\u1648\u7ef3\u4ade\u1e76\u8ef7"));
            }
            ++n2;
        }
    }

    private static Object VW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

