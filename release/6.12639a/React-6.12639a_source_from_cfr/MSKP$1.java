/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class MSKP$1
extends xGOy {
    final /* synthetic */ MSKP TYHd;

    MSKP$1(MSKP mSKP) {
        this.TYHd = mSKP;
    }

    @Override
    public void run() {
        if (((Boolean)o.a((MSKP)o.a(this, 2142656504), 179263479)).booleanValue()) {
            String[] arrstring = new String[2];
            arrstring[0] = MSKP$1.lW(nJPf$sILv.G("\u7429\u6ee7\u6783\u0c84\u5409\u4222\u574b\ub5ef\u58fa\u2de7\uef21\u50af\u1749\u61b3\u4c31\u89e5\udf73\u96d9\u12d2\ua6f2\ud2f9\uabec\u58fe\u790c\u4164\uf264\u0e34\uc59d\u4a9a\u329d\u85de\uff5e\u89ff\u80eb\u3f3d\u85e6"));
            arrstring[1] = MSKP$1.lW(nJPf$sILv.G("\u7429\u6ee7\u6783\u0c84\u5409\u4222\u574b\ub5ef\u58fa\u2de7\uef21\u50af\u1749\u61b3\u4c31\u89e5\udf73\u96d9\u12d2\ua6f2\ud2f1\uabe1\u58ee\u7912\u4122\uf22a\u0e3f\uc587\u4a81\u3298\u8587"));
            MSKP$1.lW((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(871061494)), arrstring));
            return;
        }
        String[] arrstring = new String[2];
        arrstring[0] = MSKP$1.lW(nJPf$sILv.G("\u7429\u6ee7\u6783\u0c84\u5409\u4222\u574b\ub5ef\u58fa\u2de7\uef21\u50af\u1749\u61b3\u4c31\u89e5\udf73\u96d9\u12d2\ua6f2\ud2f9\uabec\u58fe\u790c\u4164\uf264\u0e34\uc59d\u4a9a\u329d\u85de\uff5e\u89ff\u80eb\u3f3d\u85e6"));
        arrstring[1] = MSKP$1.lW(nJPf$sILv.G("\u7429\u6ee7\u6783\u0c84\u5409\u4222\u574b\ub5ef\u58fa\u2de7\uef21\u50af\u1749\u61b3\u4c31\u89e5\udf73\u96d9\u12d2\ua6f2\ud2f1\uabe1\u58ee\u7912\u4122\uf22a\u0e3f\uc587\u4a81\u3298\u8587"));
        MSKP$1.lW((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(1411405812)), arrstring));
    }

    private static Object lW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

