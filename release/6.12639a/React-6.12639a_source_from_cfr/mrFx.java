/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class mrFx {
    private feCR<JROj> nJve = new feCR();
    private XAfJ CxqW;
    private Elru hbxJ;
    private rFBK KDsY;

    public mrFx(XAfJ xAfJ, Elru elru, rFBK rFBK2) {
        this.yJLS(elru, rFBK2);
    }

    public void yJLS(Elru elru, rFBK rFBK2) {
        o.v(this, 1557216925, rFBK2);
        o.v(this, -633389412, elru);
    }

    public void UtIU(JROj jROj) throws Nwmj {
        if (mrFx.Cu(jROj.ArMt(), (XAfJ)((Object)o.a(this, -335462757))) != false) {
            throw new Nwmj((String)mrFx.Cu(mrFx.Cu(mrFx.Cu(mrFx.Cu(new StringBuilder(nJPf$sILv.G("\u55d6\u4d1b\ub623\u3a1e\ueb22\u0f77\uf9e3\u2adf\u35b5\u8489\ubd1b\u3dd2\u7f32\u2e1b\u0a5b\u7d47\u53d2\ud3d7\u3f2d")), (XAfJ)((Object)o.a(this, -335462757))), nJPf$sILv.G("\u55a6\u4d0e\ub62f\u3a55")), (XAfJ)((Object)o.a(this, -335462757)))));
        }
        mrFx.Cu((feCR)o.a(this, -1169473879), jROj);
    }

    private JROj DaUw(int n) {
        Object object = mrFx.Cu((feCR)o.a(this, -1169473879));
        while (object.hasNext()) {
            JROj jROj = (JROj)object.next();
            if (jROj.getId() != n) continue;
            return jROj;
        }
        return null;
    }

    public JROj OrfP() throws Exception {
        Object object = mrFx.Cu((rFBK)o.a(this, 1557216925));
        Object object2 = mrFx.Cu((rFBK)o.a(this, 1557216925));
        byte[] arrby = new byte[object2];
        mrFx.Cu((rFBK)o.a(this, 1557216925), arrby);
        JROj jROj = this.DaUw((int)object);
        rFBK rFBK2 = new rFBK(arrby);
        if (jROj == null) {
            mrFx.Cu(rFBK2);
            throw new xXTE((String)mrFx.Cu(mrFx.Cu(new StringBuilder(nJPf$sILv.G("\u04fd\u46e9\u729d\u53b7\u5c12\u3b86\ub833\ua5df\ube39\ue215\u0f2e\u7190\u2f5c\u4ae9\ua943\u4f79\uf3a9\u6937\u7122\u93c7\u126b\u535f\uca93\u3cd9\ue6be\u48e4\u25b7\u9879\ude72\u3610")), object)));
        }
        jROj.yJLS(rFBK2);
        mrFx.Cu(rFBK2);
        return jROj;
    }

    public void biLo(JROj jROj) throws Exception {
        Elru elru = new Elru();
        jROj.yJLS(elru);
        byte[] arrby = (byte[])mrFx.Cu(elru);
        mrFx.Cu((Elru)o.a(this, -633389412), jROj.getId());
        mrFx.Cu((Elru)o.a(this, -633389412), arrby.length);
        mrFx.Cu((Elru)o.a(this, -633389412), arrby);
    }

    private static Object Cu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

