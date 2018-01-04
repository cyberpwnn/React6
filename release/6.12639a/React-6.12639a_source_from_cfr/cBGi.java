/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;

public class cBGi
extends DirU {
    private boolean GRax = false;

    public cBGi() {
        super((String)cBGi.FC(mrFx$WjFM.d("\ub093\uddb2\ua73a\ue083\udbbf\uc9e0\udb7c\u923d\u5f25\ub333\u85e0\u356d\u979b\u7574\uaf7d\u9626\ub770\uce0c\u9894\ue94b\u74d4\ub51b\u4cf6\ud734\ubd8a\ufa5d\ud284\u3978\u28be\uabe6\ue02a\ub0cc\ud392\u4fde\ude9c\u40de\ua06c\u4af1\ud0bf\u942f\ucc86\u80dd")));
    }

    @Override
    public boolean OPgL() {
        int n = -1;
        try {
            Object object = cBGi.FC(cBGi.FC());
            while (object.hasNext()) {
                Chunk chunk = (Chunk)object.next();
                int n2 = chunk.getEntities().length;
                if (n2 <= n) continue;
                n = n2;
            }
        }
        catch (Exception exception) {
            return false;
        }
        int n3 = (int)(cBGi.FC((FWER)o.a((TEqA)o.k(911295720), 1286751627), cBGi.FC((biRJ)((Object)o.k(-567520706)))).getValue() + cBGi.FC((FWER)o.a((TEqA)o.k(911295720), 1286751627), cBGi.FC((biRJ)((Object)o.k(1642156608)))).getValue());
        int n4 = (int)cBGi.FC((FWER)o.a((TEqA)o.k(911295720), 1286751627), cBGi.FC((biRJ)((Object)o.k(-864726310)))).getValue();
        boolean bl = n4 * (Integer)o.k(-1210361653) < n3 && n > (Integer)o.k(-1146988326);
        if (bl != (Boolean)o.a(this, -907257892)) {
            o.v(this, -907257892, bl);
            new cBGi$1(this);
        }
        return bl;
    }

    @Override
    public void NxWm() {
        Chunk chunk;
        if (!((Boolean)o.k(1316247748)).booleanValue()) {
            return;
        }
        if ((Long)o.k(-619556004) % 2 != 0) {
            return;
        }
        Chunk chunk2 = null;
        int n = -1;
        Object object = cBGi.FC(cBGi.FC());
        while (object.hasNext()) {
            chunk = (Chunk)object.next();
            int n2 = chunk.getEntities().length;
            if (n2 <= n) continue;
            n = n2;
            chunk2 = chunk;
        }
        if (chunk2 != null) {
            chunk = chunk2;
            new cBGi$2(this, chunk);
        }
    }

    static /* synthetic */ boolean yJLS(cBGi cBGi2) {
        return (Boolean)o.a(cBGi2, -907257892);
    }

    private static Object FC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

