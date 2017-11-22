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

class TOJM$1
extends vIXT {
    final /* synthetic */ TOJM HelD;
    private final /* synthetic */ Chunk uFhi;

    TOJM$1(TOJM tOJM, Chunk chunk) {
        this.HelD = tOJM;
        this.uFhi = chunk;
    }

    @Override
    public void run() {
        Entity[] arrentity = ((Chunk)cv.b(this, -1050020543)).getEntities();
        int n = arrentity.length;
        int n2 = 0;
        while (n2 < n) {
            Entity entity = arrentity[n2];
            if (entity instanceof Player) {
                TOJM$1.EZ(entity, YEBy$TyVf.W("\u2278\u3293\u93b2\u10c1\u6551\u3896\u1749\uf6d6\u961d\ubc75\uc204\udf47\u929c\u54d2\u962c\u9340\u356e\u663e\u1394\u5a4e\ud6f0\u5995\uaaa7\ufc4a\u92c0\u4916\u38cf\u9ff3\u91df\u6222\u0469\u921a\uc356\u45ed\u60bc\uf10f\u5a5a\uea9b\u8e98"));
            }
            ++n2;
        }
    }

    private static Object EZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

