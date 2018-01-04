/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class MSKP
extends DirU {
    boolean GRax = false;

    public MSKP() {
        super((String)MSKP.dT(nJPf$sILv.G("\ucb95\u3cd0\u8068\u8a0a\u9261\u4397\udd66\u85a5\u685f\uc3aa\u1f78\u0a29\uf28c\u4d5e\u0fd2\u7758\u7685\ub0ff\u6d40\uf295\u0b76\u0bfb\u958d\u7ed5\u0484\u7fc6\u5dba\uddad\ua98a\u452a\u6b3d\ud47a\uf6aa\u568e\u9eb4\u952d\uc7c9\ua7ef")));
    }

    @Override
    public boolean OPgL() {
        boolean bl;
        int n = (int)MSKP.dT((FWER)o.a((TEqA)o.k(911295720), 1286751627), MSKP.dT((biRJ)((Object)o.k(-864726310)))).getValue();
        boolean bl2 = bl = n > MSKP.dT();
        if ((Boolean)o.a(this, 179263479) != bl) {
            o.v(this, 179263479, bl);
            new MSKP$1(this);
        }
        return bl;
    }

    @Override
    public void NxWm() {
        if ((Long)o.k(-619556004) % 100 == 0) {
            new MSKP$2(this);
        }
    }

    private static Object dT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

