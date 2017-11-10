/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.entity.Player
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public final class OGmN$yIkI {
    private static int version;
    private static Class<?> MnLd;
    private static Constructor<?> Gtjy;
    private static Method TGlR;
    private static Field QGWF;
    private static Method veDG;
    private static boolean initialized;
    private final OGmN Yppe;
    private float cKig;
    private final float BByo;
    private final float UvFi;
    private final float rrJE;
    private final int AYjA;
    private final boolean ySxh;
    private final OGmN$halY txOO;
    private Object jiot;

    public OGmN$yIkI(OGmN oGmN, float f, float f2, float f3, float f4, int n, boolean bl, OGmN$halY oGmN$halY) throws IllegalArgumentException {
        OGmN$yIkI.initialize();
        if (f4 < 0.0f) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u715e\ucb82\u9644\u15ce\u4f1e\u9693\u6bb8\udf2c\u76c9\u8bd8\u8a65\u6b42\uc149\u87ab\u57a5\u733a\ue448\u1869\udec3\ue9bb\u9891\u926e\u8cfa\uac05\ubd62"));
        }
        if (n < 0) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u715e\ucb82\u9644\u15ce\u4f0c\u968e\u6bb2\udf3c\u76c3\u8b8c\u8a2c\u6b58\uc11a\u87e7\u57a6\u7322\ue45a\u187e\ude91\ue9ef\u988d\u9267\u8cf5\uac4b\ubd72\u407e"));
        }
        this.Yppe = oGmN;
        this.cKig = f;
        this.BByo = f2;
        this.UvFi = f3;
        this.rrJE = f4;
        this.AYjA = n;
        this.ySxh = bl;
        this.txOO = oGmN$halY;
    }

    public OGmN$yIkI(OGmN oGmN, Vector vector, float f, boolean bl, OGmN$halY oGmN$halY) throws IllegalArgumentException {
        this(oGmN, (float)OGmN$yIkI.Ks(vector), (float)OGmN$yIkI.Ks(vector), (float)OGmN$yIkI.Ks(vector), f, 0, bl, oGmN$halY);
    }

    public OGmN$yIkI(OGmN oGmN, OGmN$qdWJ oGmN$qdWJ, boolean bl) {
        this(oGmN, (float)OGmN$yIkI.Ks(oGmN$qdWJ), (float)OGmN$yIkI.Ks(oGmN$qdWJ), (float)OGmN$yIkI.Ks(oGmN$qdWJ), 1.0f, 0, bl, null);
        if (oGmN == (OGmN)((Object)yy.p(-354155363)) && oGmN$qdWJ instanceof OGmN$SnBs) {
            if (OGmN$yIkI.Ks((OGmN$SnBs)oGmN$qdWJ) == false) {
                this.cKig = Float.MIN_NORMAL;
            }
        }
    }

    public static void initialize() throws OGmN$yIkI$yJLL {
        if (((Boolean)yy.p(855835803)).booleanValue()) {
            return;
        }
        try {
            Object object = OGmN$yIkI.Ks();
            reference var1_2 = OGmN$yIkI.Ks(object, NVIs$JbpD.H("\u2a21")) + true;
            Object object2 = OGmN$yIkI.Ks(object, NVIs$JbpD.H("\u2a21"));
            Object object3 = OGmN$yIkI.Ks(OGmN$yIkI.Ks(object, var1_2, object2));
            yy.K(-1950284655, (int)object3);
            if (object3 > 7) {
                yy.K(-757005168, OGmN$yIkI.Ks((xyyN$ksfs)((Object)yy.p(1350435994)), NVIs$JbpD.H("\u2a3b\u6a39\uc098\ub845\u753c\ud661\ucc1a\u8399\udd64\u80e2\u6530\ub757")));
            }
            Object object4 = OGmN$yIkI.Ks((xyyN$ksfs)((Object)yy.p(1350435994)), (Integer)yy.p(-1950284655) < 7 ? NVIs$JbpD.H("\u2a2e\u6a36\uc08e\ub843\u7509\ud674\ucc5e\u83de\udd5a\u80ee\u652e\ub75e\u77b9\u9a3c\u9998\ua355\u27be\u9c2a\ufc51\u7896\ua719\u4f5c") : NVIs$JbpD.H("\u2a2e\u6a36\uc08e\ub843\u7509\ud674\ucc38\u8381\udd6c\u80f8\u6513\ub747\u77a9\u9a3b\u9996\ua355\u27a6\u9c27\ufc62\u789b\ua70e\u4f5b\uf7c7\u9f06\u7202\uabc8\u4762"));
            yy.K(64357726, OGmN$yIkI.Ks(object4, new Class[0]));
            yy.K(1062929561, OGmN$yIkI.Ks(NVIs$JbpD.H("\u2a3d\u6a25\uc08c\ub84e\u7518\ud650\ucc04\u838c\udd74\u80e4\u652e"), (xyyN$ksfs)((Object)yy.p(1607402851)), NVIs$JbpD.H("\u2a19\u6a32\uc099\ub860\u750d\ud66e\ucc0c\u8381\udd68"), new Class[0]));
            Object object5 = OGmN$yIkI.Ks(NVIs$JbpD.H("\u2a3b\u6a39\uc099\ub841\u7518\ud679\ucc38\u8381\udd6c\u80f8\u6539\ub740"), (xyyN$ksfs)((Object)yy.p(1350435994)), false, NVIs$JbpD.H("\u2a0e\u6a3b\uc08c\ub851\u7509\ud672\ucc2b\u8382\udd63\u80ef\u6539\ub751\u77a9\u9a05\u9996\ua349"));
            yy.K(-641923945, object5);
            Class[] arrclass = new Class[1];
            arrclass[0] = OGmN$yIkI.Ks((xyyN$ksfs)((Object)yy.p(1350435994)), NVIs$JbpD.H("\u2a2e\u6a36\uc08e\ub843\u7509\ud674"));
            yy.K(-921303699, OGmN$yIkI.Ks(OGmN$yIkI.Ks(object5), NVIs$JbpD.H("\u2a0d\u6a32\uc083\ub84c\u753c\ud661\ucc0b\u8386\udd68\u80f5"), arrclass));
        }
        catch (Exception exception) {
            // empty catch block
        }
        yy.K(855835803, true);
        if (true) {
            return;
        }
    }

    public static int getVersion() {
        if (!((Boolean)yy.p(855835803)).booleanValue()) {
            OGmN$yIkI.initialize();
        }
        return (Integer)yy.p(-1950284655);
    }

    public static boolean isInitialized() {
        return (Boolean)yy.p(855835803);
    }

    private void gUxV(Location location) throws OGmN$yIkI$mXJp {
        if (yy.h(this, 403375462) != null) {
            return;
        }
        try {
            yy.E(this, 403375462, OGmN$yIkI.Ks((Constructor)yy.p(64357726), new Object[0]));
            if ((Integer)yy.p(-1950284655) < 8) {
                Object object = OGmN$yIkI.Ks((OGmN)((Object)yy.h(this, -673512085)));
                if ((OGmN$halY)yy.h(this, -291175071) != null) {
                    object = OGmN$yIkI.Ks(OGmN$yIkI.Ks(new StringBuilder((String)OGmN$yIkI.Ks(object)), OGmN$yIkI.Ks((OGmN$halY)yy.h(this, -291175071))));
                }
                OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf9d"), object);
            } else {
                OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf9d"), ((Object[])OGmN$yIkI.Ks((Class)yy.p(-757005168)))[OGmN$yIkI.Ks((OGmN)((Object)yy.h(this, -673512085)))]);
                OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf96"), OGmN$yIkI.Ks((Boolean)yy.h(this, 1633289390)));
                if ((OGmN$halY)yy.h(this, -291175071) != null) {
                    int[] arrn;
                    int[] arrn2 = (int[])OGmN$yIkI.Ks((OGmN$halY)yy.h(this, -291175071));
                    if ((OGmN)((Object)yy.h(this, -673512085)) == (OGmN)((Object)yy.p(-331414348))) {
                        arrn = arrn2;
                    } else {
                        int[] arrn3 = new int[1];
                        arrn = arrn3;
                        arrn3[0] = arrn2[0] | arrn2[1] << 12;
                    }
                    OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf97"), arrn);
                }
            }
            OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf9e"), OGmN$yIkI.Ks(OGmN$yIkI.Ks(location)));
            OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf9f"), OGmN$yIkI.Ks(OGmN$yIkI.Ks(location)));
            OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf98"), OGmN$yIkI.Ks(OGmN$yIkI.Ks(location)));
            OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf99"), OGmN$yIkI.Ks(((Float)yy.h(this, 1391723689)).floatValue()));
            OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf9a"), OGmN$yIkI.Ks(((Float)yy.h(this, -1425079118)).floatValue()));
            OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf9b"), OGmN$yIkI.Ks(((Float)yy.h(this, 248317095)).floatValue()));
            OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf94"), OGmN$yIkI.Ks(((Float)yy.h(this, 1167983784)).floatValue()));
            OGmN$yIkI.Ks(yy.h(this, 403375462), true, BkvY$LhxG.I("\udf95"), OGmN$yIkI.Ks((Integer)yy.h(this, -341900099)));
            return;
        }
        catch (Exception exception) {
            throw new OGmN$yIkI$mXJp(BkvY$LhxG.I("\udfac\u8491\u4a6e\u9f5a\u4402\ua974\u834f\u7860\ua57d\u26c7\u950f\ubeb7\u3d57\ub2d1\uf445\uf9fd\u6038\u14fa\uae5d\u9a0c\uae9d\u373c\uc716\u18fa\u624d\u22ed\u7e4e"), exception);
        }
    }

    public void mXJp(Location location, Player player) throws OGmN$yIkI$mXJp, OGmN$yIkI$ksfs {
        this.gUxV(location);
        try {
            OGmN$yIkI.Ks((Method)yy.p(-921303699), OGmN$yIkI.Ks((Field)yy.p(-641923945), OGmN$yIkI.Ks((Method)yy.p(1062929561), player, new Object[0])), new Object[]{yy.h(this, 403375462)});
            return;
        }
        catch (Exception exception) {
            throw new OGmN$yIkI$ksfs((String)OGmN$yIkI.Ks(OGmN$yIkI.Ks(OGmN$yIkI.Ks(new StringBuilder(BkvY$LhxG.I("\u0663\u4ba5\ufc84\u0a66\uca11\u168f\u34a2\u3396\ud7d0\ufaef\u947c\uf7c5\uaab2\udaa1\uf62a\u534b\u0783\uf6a4\u5425\u7fe7\u92a3\ucc0a\uf7fb\u0d9a\u255c\ua800\ub027\\\u9884\u37dc\u2c99\u4bf3\u6f88\u3b11\ue4eb\ua18a\u927b")), player.getName()), BkvY$LhxG.I("\u0602"))), exception);
        }
    }

    public void ksfs(Location location, List<Player> list) throws IllegalArgumentException {
        if (list.isEmpty()) {
            throw new IllegalArgumentException(NVIs$JbpD.H("\u0f35\u13a3\uf999\u1cf7\u3fc0\uc910\u9b40\u37f6\u569b\uef29\u4b04\ub421\u4b67\u3c16\ue446\uc1fa\u01a4\u675f\u18d1\u4336\uca24\u3d12\u8497\u9c52"));
        }
        for (Player player : list) {
            this.mXJp(location, player);
        }
    }

    public void ksfs(Location location, double d) throws IllegalArgumentException {
        if (d < 1.0) {
            throw new IllegalArgumentException(BkvY$LhxG.I("\u82fb\u5fa4\u8628\ua414\uc4f1\u3530\uc9c8\u28a7\ucb97\u636c\u3e1b\u1660\u1fc9\uc536\uf5ed\u850b\u6eb4\ua133\u8e8a\uc40f\uff26\ub116\u62d4\u0946\uea23"));
        }
        String string = OGmN$yIkI.Ks(location).getName();
        double d2 = d * d;
        Iterator iterator = OGmN$yIkI.Ks().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            if (OGmN$yIkI.Ks(player.getWorld().getName(), string) == false) continue;
            if (OGmN$yIkI.Ks(player.getLocation(), location) > d2) continue;
            this.mXJp(location, player);
        }
    }

    private static Object Ks(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

