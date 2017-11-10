/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CDfF
extends qloI {
    public static RkDm JlMO;

    public CDfF() {
        try {
            this.tLGH();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void tLGH() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Object object = CDfF.wg();
        CDfF.wg(CDfF.wg(CDfF.wg(new StringBuilder(NVIs$JbpD.H("\u1e21\ub8ff\u35e2\ufd00\u5328\u9d87\ud98d\ufc64\u6a7f\u4147\u48f4\u0aed\u3c02\ua41a\u865a\u10f9")), CDfF.wg(object))));
        if (CDfF.wg(object) != false) {
            CDfF.wg(CDfF.wg(CDfF.wg(new StringBuilder(NVIs$JbpD.H("\u1e3c\ub8d7\u35c3\ufd4c\u536d")), CDfF.wg(object))));
            RkDm rkDm = this.vHqM((String)CDfF.wg(object));
            yy.K(556722513, rkDm);
            if (rkDm != null) {
                CDfF.wg(CDfF.wg(CDfF.wg(new StringBuilder(NVIs$JbpD.H("\u1e22\ub8fb\u35f3\ufd1d\u532c\u9d92\ud9c8\ufc12\u6a56\u4150\u48f1\u0ae1\u3c01\ua454\u8633\u10ac\u6284\u4b55\u6569\uf475\ua050\uc879\u4564")), CDfF.wg(object))));
                for (Field field : (Field[])CDfF.wg(CDfF.wg(rkDm))) {
                    if (CDfF.wg(field, jOFy.class) == false) continue;
                    Object object2 = CDfF.wg(field);
                    Object object3 = CDfF.wg(CDfF.wg(object2, new Class[0]), new Object[0]);
                    CDfF.wg(field, rkDm, object3);
                }
            }
            return;
        }
        CDfF.wg(CDfF.wg(CDfF.wg(new StringBuilder(NVIs$JbpD.H("\u1e3c\ub8f5\u35b0\ufd38\u5300\u9da6\ud98d\ufc61\u6a6f\u4145\u48f7\u0aeb\u3c1f\ua400\u8640\u10bf\u629b\u4b57\u6526")), CDfF.wg(object))));
    }

    private RkDm vHqM(String string) {
        if (CDfF.wg(string, CDfF.wg((YpAW)((Object)yy.p(-1677399729)))) != false) {
            return new Mkul();
        }
        CDfF.wg(string, CDfF.wg((YpAW)((Object)yy.p(-1066538672))));
        CDfF.wg(string, CDfF.wg((YpAW)((Object)yy.p(52947237))));
        CDfF.wg(string, CDfF.wg((YpAW)((Object)yy.p(1042999582))));
        CDfF.wg(string, CDfF.wg((YpAW)((Object)yy.p(-561780445))));
        CDfF.wg(string, CDfF.wg((YpAW)((Object)yy.p(-9049820))));
        return null;
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
    }

    static {
        yy.K(556722513, null);
    }

    private static Object wg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

