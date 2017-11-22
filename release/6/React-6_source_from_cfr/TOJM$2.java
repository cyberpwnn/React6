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

class TOJM$2
extends vIXT {
    final /* synthetic */ TOJM HelD;
    private final /* synthetic */ Chunk uFhi;
    private final /* synthetic */ long VweQ;

    TOJM$2(TOJM tOJM, Chunk chunk, long l) {
        this.HelD = tOJM;
        this.uFhi = chunk;
        this.VweQ = l;
    }

    @Override
    public void run() {
        Entity[] arrentity = ((Chunk)cv.b(this, 688911680)).getEntities();
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (entity instanceof Player) {
                TOJM$2.yY(entity, TOJM$2.yY(TOJM$2.yY(new StringBuilder(YEBy$TyVf.W("\u0eaf\ub2f1\ucf1a\u9e51\u3e01\ucec8\u53c0\uef98\u32b1\ue4fe\u597e\u0448\u3147\u1025\u3e14\uf296\u8cc9\u22d2\u47b5\u2541\u8af8\ubbad\uefae\u7120\uc82e\u9787\ub211\u5513\udfdf\u76a1\ud95c\u08da\u30d2\ue634\u3eff\u9821\ueae7\ua9b6\u52ac\u7f55\u105b\u7d2a")), TOJM$2.yY((Long)cv.b(this, 387773763), true))));
            }
            ++n2;
        }
    }

    private static Object yY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

