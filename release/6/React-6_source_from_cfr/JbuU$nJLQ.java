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

public final class JbuU$nJLQ {
    private static int version;
    private static Class<?> pQuT;
    private static Constructor<?> qCve;
    private static Method tEPa;
    private static Field foLj;
    private static Method MCbI;
    private static boolean initialized;
    private final JbuU VhOQ;
    private float iwuT;
    private final float jYVU;
    private final float LbbG;
    private final float LINS;
    private final int cmqq;
    private final boolean DRWm;
    private final JbuU$BkpW bILm;
    private Object fDXB;

    public JbuU$nJLQ(JbuU jbuU, float f, float f2, float f3, float f4, int n, boolean bl, JbuU$BkpW jbuU$BkpW) throws IllegalArgumentException {
        JbuU$nJLQ.initialize();
        if (f4 < 0.0f) {
            throw new IllegalArgumentException(rgig$AWxc.r("\u28e0\uddff\uf1c8\u8d73\u6b3a\u81e5\u0543\u6431\u44dc\ub423\u4848\uf166\udb49\ub8d6\u7e13\ucc05\u48dd\u172d\u9e27\u040c\ubbe5\u8717\uab03\u6cfd\u8a8c"));
        }
        if (n < 0) {
            throw new IllegalArgumentException(rgig$AWxc.r("\u28e0\uddff\uf1c8\u8d73\u6b28\u81f8\u0549\u6421\u44d6\ub477\u4801\uf17c\udb1a\ub89a\u7e10\ucc1d\u48cf\u173a\u9e75\u0458\ubbf9\u871e\uab0c\u6cb3\u8a9c\ued74"));
        }
        this.VhOQ = jbuU;
        this.iwuT = f;
        this.jYVU = f2;
        this.LbbG = f3;
        this.LINS = f4;
        this.cmqq = n;
        this.DRWm = bl;
        this.bILm = jbuU$BkpW;
    }

    public JbuU$nJLQ(JbuU jbuU, Vector vector, float f, boolean bl, JbuU$BkpW jbuU$BkpW) throws IllegalArgumentException {
        this(jbuU, (float)JbuU$nJLQ.dO(vector), (float)JbuU$nJLQ.dO(vector), (float)JbuU$nJLQ.dO(vector), f, 0, bl, jbuU$BkpW);
    }

    public JbuU$nJLQ(JbuU jbuU, JbuU$YoSa jbuU$YoSa, boolean bl) {
        this(jbuU, (float)JbuU$nJLQ.dO(jbuU$YoSa), (float)JbuU$nJLQ.dO(jbuU$YoSa), (float)JbuU$nJLQ.dO(jbuU$YoSa), 1.0f, 0, bl, null);
        if (jbuU == (JbuU)((Object)cv.e(-1137117329)) && jbuU$YoSa instanceof JbuU$OXeK) {
            if (JbuU$nJLQ.dO((JbuU$OXeK)jbuU$YoSa) == false) {
                this.iwuT = Float.MIN_NORMAL;
            }
        }
    }

    public static void initialize() throws JbuU$nJLQ$IWSm {
        if (((Boolean)cv.e(1003616105)).booleanValue()) {
            return;
        }
        try {
            Object object = JbuU$nJLQ.dO();
            reference var1_2 = JbuU$nJLQ.dO(object, KUXS$dwji.S("\ub4cb")) + true;
            Object object2 = JbuU$nJLQ.dO(object, KUXS$dwji.S("\ub4cb"));
            Object object3 = JbuU$nJLQ.dO(JbuU$nJLQ.dO(object, var1_2, object2));
            cv.V(-1999964309, (int)object3);
            if (object3 > 7) {
                cv.V(50984788, JbuU$nJLQ.dO((DsJQ$DYFV)((Object)cv.e(-1966409878)), KUXS$dwji.S("\ub4d1\ud646\u6ecc\ueb7c\u72d0\u27df\u63e3\u153d\u95ad\u9bf1\u2759\uc80a")));
            }
            Object object4 = JbuU$nJLQ.dO((DsJQ$DYFV)((Object)cv.e(-1966409878)), (Integer)cv.e(-1999964309) < 7 ? KUXS$dwji.S("\ub4c4\ud649\u6eda\ueb7a\u72e5\u27ca\u63a7\u157a\u9593\u9bfd\u2747\uc803\ue741\ud6f3\ufd9f\uddc3\uded4\uf493\u0ff3\ua023\ucb5b\ue637") : KUXS$dwji.S("\ub4c4\ud649\u6eda\ueb7a\u72e5\u27ca\u63c1\u1525\u95a5\u9beb\u277a\uc81a\ue751\ud6f4\ufd91\uddc3\udecc\uf49e\u0fc0\ua02e\ucb4c\ue630\u32ff\u9216\u549d\u01d9\u2775"));
            cv.V(173864790, JbuU$nJLQ.dO(object4, new Class[0]));
            cv.V(1509357395, JbuU$nJLQ.dO(KUXS$dwji.S("\ub4d7\ud65a\u6ed8\ueb77\u72f4\u27ee\u63fd\u1528\u95bd\u9bf7\u2747"), (DsJQ$DYFV)((Object)cv.e(597817169)), KUXS$dwji.S("\ub4f3\ud64d\u6ecd\ueb59\u72e1\u27d0\u63f5\u1525\u95a1"), new Class[0]));
            Object object5 = JbuU$nJLQ.dO(KUXS$dwji.S("\ub4d1\ud646\u6ecd\ueb78\u72f4\u27c7\u63c1\u1525\u95a5\u9beb\u2750\uc81d"), (DsJQ$DYFV)((Object)cv.e(-1966409878)), false, KUXS$dwji.S("\ub4e4\ud644\u6ed8\ueb68\u72e5\u27cc\u63d2\u1526\u95aa\u9bfc\u2750\uc80c\ue751\ud6ca\ufd91\udddf"));
            cv.V(-132909219, object5);
            Class[] arrclass = new Class[1];
            arrclass[0] = JbuU$nJLQ.dO((DsJQ$DYFV)((Object)cv.e(-1966409878)), KUXS$dwji.S("\ub4c4\ud649\u6eda\ueb7a\u72e5\u27ca"));
            cv.V(-579864737, JbuU$nJLQ.dO(JbuU$nJLQ.dO(object5), KUXS$dwji.S("\ub4e7\ud64d\u6ed7\ueb75\u72d0\u27df\u63f2\u1522\u95a1\u9be6"), arrclass));
        }
        catch (Exception exception) {
            // empty catch block
        }
        cv.V(1003616105, true);
        if (true) {
            return;
        }
    }

    public static int getVersion() {
        if (!((Boolean)cv.e(1003616105)).booleanValue()) {
            JbuU$nJLQ.initialize();
        }
        return (Integer)cv.e(-1999964309);
    }

    public static boolean isInitialized() {
        return (Boolean)cv.e(1003616105);
    }

    private void WGJn(Location location) throws JbuU$nJLQ$ssNb {
        if (cv.b(this, 562624350) != null) {
            return;
        }
        try {
            cv.e(this, 562624350, JbuU$nJLQ.dO((Constructor)cv.e(173864790), new Object[0]));
            if ((Integer)cv.e(-1999964309) < 8) {
                Object object = JbuU$nJLQ.dO((JbuU)((Object)cv.b(this, 1009776473)));
                if ((JbuU$BkpW)cv.b(this, -125503589) != null) {
                    object = JbuU$nJLQ.dO(JbuU$nJLQ.dO(new StringBuilder((String)JbuU$nJLQ.dO(object)), JbuU$nJLQ.dO((JbuU$BkpW)cv.b(this, -125503589))));
                }
                JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6de"), object);
            } else {
                JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6de"), ((Object[])JbuU$nJLQ.dO((Class)cv.e(50984788)))[JbuU$nJLQ.dO((JbuU)((Object)cv.b(this, 1009776473)))]);
                JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6d5"), JbuU$nJLQ.dO((Boolean)cv.b(this, 1347680134)));
                if ((JbuU$BkpW)cv.b(this, -125503589) != null) {
                    int[] arrn;
                    int[] arrn2 = (int[])JbuU$nJLQ.dO((JbuU$BkpW)cv.b(this, -125503589));
                    if ((JbuU)((Object)cv.b(this, 1009776473)) == (JbuU)((Object)cv.e(1063843712))) {
                        arrn = arrn2;
                    } else {
                        int[] arrn3 = new int[1];
                        arrn = arrn3;
                        arrn3[0] = arrn2[0] | arrn2[1] << 12;
                    }
                    JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6d4"), arrn);
                }
            }
            JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6dd"), JbuU$nJLQ.dO(JbuU$nJLQ.dO(location)));
            JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6dc"), JbuU$nJLQ.dO(JbuU$nJLQ.dO(location)));
            JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6db"), JbuU$nJLQ.dO(JbuU$nJLQ.dO(location)));
            JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6da"), JbuU$nJLQ.dO(((Float)cv.b(this, 694286211)).floatValue()));
            JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6d9"), JbuU$nJLQ.dO(((Float)cv.b(this, 5306242)).floatValue()));
            JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6d8"), JbuU$nJLQ.dO(((Float)cv.b(this, 50329485)).floatValue()));
            JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6d7"), JbuU$nJLQ.dO(((Float)cv.b(this, 38664076)).floatValue()));
            JbuU$nJLQ.dO(cv.b(this, 562624350), true, KUXS$dwji.S("\ub6d6"), JbuU$nJLQ.dO((Integer)cv.b(this, -1317537905)));
            return;
        }
        catch (Exception exception) {
            throw new JbuU$nJLQ$ssNb(KUXS$dwji.S("\ub6ef\uc03b\u5e68\ub0f2\ubc7f\ud914\u841f\u3580\u8a3b\u3c9e\u58a6\u8610\u048f\u3909\u264b\ucec7\uee04\u2d80\u18e0\uf932\u5e0b\u06aa\u6bd3\u8c83\ua2ed\u9e84\u1ba7"), exception);
        }
    }

    public void ssNb(Location location, Player player) throws JbuU$nJLQ$ssNb, JbuU$nJLQ$DYFV {
        this.WGJn(location);
        try {
            JbuU$nJLQ.dO((Method)cv.e(-579864737), JbuU$nJLQ.dO((Field)cv.e(-132909219), JbuU$nJLQ.dO((Method)cv.e(1509357395), player, new Object[0])), new Object[]{cv.b(this, 562624350)});
            return;
        }
        catch (Exception exception) {
            throw new JbuU$nJLQ$DYFV((String)JbuU$nJLQ.dO(JbuU$nJLQ.dO(JbuU$nJLQ.dO(new StringBuilder(YEBy$TyVf.W("\u9d82\ud5a6\ud8d1\u041c\ub069\ued34\u6328\ue53d\ua74c\u0159\u0414\u12d7\uc9a2\uae6e\u547a\ub792\u53b7\u9417\u1a98\u3dab\ub811\u6ef8\u7f68\u4959\u60cb\u7c6e\ua89b\u02fe\uc7bf\ub1d3\u7f3c\u6e62\ua2ee\ua3ab\u45be\ucca8\udd7a")), player.getName()), YEBy$TyVf.W("\u9de3"))), exception);
        }
    }

    public void DYFV(Location location, List<Player> list) throws IllegalArgumentException {
        if (list.isEmpty()) {
            throw new IllegalArgumentException(YEBy$TyVf.W("\u3845\ufdc3\u1aea\ud423\u311d\u6fd6\ua1c1\u1b29\u1f98\u42cd\uf78b\ub4ca\u57db\ua02e\ubb6a\ue5fb\u52fe\u94dc\ub347\ue4cc\u12fd\ud094\u9310\u0966"));
        }
        for (Player player : list) {
            this.ssNb(location, player);
        }
    }

    public void DYFV(Location location, double d) throws IllegalArgumentException {
        if (d < 1.0) {
            throw new IllegalArgumentException(YEBy$TyVf.W("\u3845\ufdc3\u1aea\ud423\u311f\u6fdb\ua1ce\u1b37\u1f98\u429f\uf7c2\ub4d5\u5792\ua031\ubb71\ue5ac\u52f2\u94dd\ub347\ue4dd\u12f8\ud085\u930a\u093f\u28d1"));
        }
        String string = JbuU$nJLQ.dO(location).getName();
        double d2 = d * d;
        Iterator iterator = JbuU$nJLQ.dO().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            if (JbuU$nJLQ.dO(player.getWorld().getName(), string) == false) continue;
            if (JbuU$nJLQ.dO(player.getLocation(), location) > d2) continue;
            this.ssNb(location, player);
        }
    }

    private static Object dO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

