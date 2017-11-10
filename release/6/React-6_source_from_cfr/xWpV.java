/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class xWpV {
    public static xWpV YNIm;
    private static boolean ccvt;
    public static String QyWF;
    public static Object awdF;
    public static Object KVBr;
    public static Object wnqH;

    static {
        block3 : {
            block2 : {
                yy.K(-1378548184, null);
                yy.K(-706410947, null);
                yy.K(1008993846, null);
                Object object = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI())));
                yy.K(-2029976015, object);
                Object object2 = xWpV.JI(object, xWpV.JI((String)yy.p(-2029976015), KDGY$JAHk.Y("\ud19b")) + true);
                yy.K(-2029976015, object2);
                if (xWpV.JI(object2, KDGY$JAHk.Y("\ud1c3\u1fbf\u4631\u86c0\u2171\u4a4e\u518a")) != false) break block2;
                if (xWpV.JI((String)yy.p(-2029976015), KDGY$JAHk.Y("\ud1c3\u1fbf\u4631\u86cf\u2171")) == false) break block3;
            }
            yy.K(-1267399121, true);
        }
    }

    public static String getVersion() {
        Object object = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI())));
        Object object2 = xWpV.JI(xWpV.JI(new StringBuilder((String)xWpV.JI(xWpV.JI(object, xWpV.JI(object, 46) + true))), NVIs$JbpD.H("\u37c7")));
        return object2;
    }

    public static void mXJp(LivingEntity livingEntity, boolean bl) {
        try {
            if (xWpV.JI() != false) {
                livingEntity.setAI(bl);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static Class<?> jErH(String string) {
        Object object = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(KDGY$JAHk.Y("\uc946\u1f19\ud883\u10f7\u0a14\u58c7\u531e\u3652\u1488\u9fc9\uc3d0\uaaf5\u4678\u6b49\ue3a4\uc52f\u2565\u523b\uff1c\uc5e5\u14a1")), xWpV.getVersion()), string));
        Object object2 = null;
        try {
            object2 = xWpV.JI(object);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return object2;
    }

    public static Class<?> RjaO(String string) {
        Object object = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\uf6d0\u674a\ue0c7\u5a9c\u88b9\u3979\ufa88\u7419\u9ac6\u75fa\u90b3\u7c33\u1307\u62b4\u58e1\u512e\u0ce6\ud41d\u4944\u1853\u1bd4\udb57\uc234")), xWpV.getVersion()), string));
        Object object2 = null;
        try {
            object2 = xWpV.JI(object);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return object2;
    }

    public static Object mhmm(String string) {
        try {
            return xWpV.JI(xWpV.JI((Class)yy.p(1818886881), BkvY$LhxG.I("\u8086"), new Class[]{String.class}), null, new Object[]{string});
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static Field mXJp(Field field) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        xWpV.JI(field, true);
        Object object = xWpV.JI(Field.class, NVIs$JbpD.H("\uc2b1\u5fd1\u028c\uf869\ub123\ueeec\ucdb6\ub65a\u864c"));
        xWpV.JI(object, true);
        xWpV.JI(object, field, xWpV.JI(field) & -17);
        return field;
    }

    public static Method mXJp(Method method) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        xWpV.JI(method, true);
        return method;
    }

    public static String getBukkitVersion() {
        return xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI()))), 23);
    }

    public static String qTAY() {
        return xWpV.JI(xWpV.JI(new StringBuilder(KDGY$JAHk.Y("\ud64e\u2a78\u91af\udf4d\u8453\ufba3\u85f2\u7c41\u7e73\ubd3c\u5eaf\u8c0d\ueb98\u12fc\ub6d3\u7184\u3410\u5fe0\u5463\u564d\uf9f6")), xWpV.getBukkitVersion()));
    }

    public static String tLIK() {
        return xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\u2b73\u1ea3\uea4b\u9ccb\u0bdc\u358f\u89e6\u7231\u8bad\u201c\u1c8d\u5cfd\uc24b\u4238\ud358\u6e2b\ue7c2\uf9c1\u22a0\ucc35\u79bd\u28b1\u26ea")), xWpV.getBukkitVersion()));
    }

    public static void mXJp(Player player, Entity entity, Entity entity2) {
        try {
            Object object = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder((String)xWpV.JI(xWpV.tLIK())), BkvY$LhxG.I("\ue4b7\u8433\u25a3\ufe15\uf54d\u4d31\u18fb\ud79b\u39ae\ua06e\ua988\u191d\u447f\ua5ea\uf8bf\ud878\u4bdb\u9dfd\u07cd"))));
            Object object2 = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder((String)xWpV.JI(xWpV.qTAY())), BkvY$LhxG.I("\ue4b7\u8406\u25ac\ufe02\uf54f\u4d20\u18f6\ud7e5\u3981\ua07d\ua990\u1934\u447e\ua5ce\uf890\ud876\u4bce\u9df4\u07da\u6290\u3ac9"))));
            Object object3 = xWpV.JI(xWpV.JI(object, BkvY$LhxG.I("\ue4fe\u8433\u25b9\ufe29\uf545\u4d2b\u18e6\ud7d9\u3988"), new Class[0]), player, new Object[0]);
            Object[] arrobject = new Object[2];
            arrobject[0] = xWpV.JI(entity2.getEntityId());
            arrobject[1] = xWpV.JI(entity.getEntityId());
            Object object4 = xWpV.JI(xWpV.JI(object2, new Class[]{(Class)yy.p(-281088989), (Class)yy.p(-281088989)}), arrobject);
            Object object5 = xWpV.JI(xWpV.JI(xWpV.JI(object3), BkvY$LhxG.I("\ue4e9\u843a\u25ac\ufe18\uf541\u4d37\u18c1\ud7da\u3983\ua072\ua98c\u1918\u447f\ua5d3\uf8bc\ud877")), object3);
            Class[] arrclass = new Class[1];
            arrclass[0] = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder((String)xWpV.JI(xWpV.qTAY())), BkvY$LhxG.I("\ue4b7\u8406\u25ac\ufe02\uf54f\u4d20\u18f6"))));
            xWpV.JI(xWpV.JI(xWpV.JI(object5), BkvY$LhxG.I("\ue4ea\u8433\u25a3\ufe05\uf574\u4d24\u18e1\ud7de\u3988\ua068"), arrclass), object5, new Object[]{object4});
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            xWpV.JI(exception);
            return;
        }
    }

    public static void mXJp(Player player, Object object) {
        try {
            Object object2 = xWpV.JI(xWpV.JI(xWpV.JI(player), NVIs$JbpD.H("\uc2bb\u5fdb\u029c\uf848\ub124\ueeeb\ucdb7\ub644\u865a"), new Class[0]), player, new Object[0]);
            Object object3 = xWpV.JI(xWpV.JI(xWpV.JI(object2), NVIs$JbpD.H("\uc2ac\u5fd2\u0289\uf879\ub120\ueef7\ucd90\ub647\u8651\ue809\u6d78\uae72\u3182\u501e\u94dd\u1893")), object2);
            xWpV.JI(xWpV.JI(xWpV.JI(object3), NVIs$JbpD.H("\uc2af\u5fdb\u0286\uf864\ub115\ueee4\ucdb0\ub643\u865a\ue813"), new Class[]{xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1"))}), object3, new Object[]{object});
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            xWpV.JI(exception);
            return;
        }
    }

    public static Class<?> MtdI(String string) {
        String string2 = ((String[])xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI()))), BkvY$LhxG.I("\uf583\u405c")))[3];
        try {
            return xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\uf5b1\u4017\u3d6b\u8ad5\u8c31\u2b8a\u287e\u6cf4\uc752\ua55e\udd68\ua2a7\u4ea6\u12e0\u3e57\u1e06\ubcaf\u7545\u57f4\u4b53\u9b95")), string2), BkvY$LhxG.I("\uf5f1")), string)));
        }
        catch (ClassNotFoundException classNotFoundException) {
            ClassNotFoundException classNotFoundException2 = classNotFoundException;
            xWpV.JI(classNotFoundException);
            return null;
        }
    }

    public static void mXJp(Player player, Integer n, Integer n2, Integer n3, String object, String object2) {
        try {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            if (yy.p(-1378548184) == null) {
                yy.K(-1378548184, xWpV.JI(xWpV.JI(((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363"))))[0], NVIs$JbpD.H("\uc288\u5ff7\u02a5\uf845\ub116")), null));
            }
            if (yy.p(-706410947) == null) {
                yy.K(-706410947, xWpV.JI(xWpV.JI(((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363"))))[0], NVIs$JbpD.H("\uc288\u5ff7\u02bc\uf84c\ub100")), null));
            }
            if (yy.p(1008993846) == null) {
                yy.K(1008993846, xWpV.JI(xWpV.JI(((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363"))))[0], NVIs$JbpD.H("\uc28f\u5feb\u02aa\uf854\ub10c\ueed1\ucd9f\ub66d")), null));
            }
            if (object != null) {
                object = xWpV.JI(38, object);
                object = xWpV.JI(object, NVIs$JbpD.H("\uc2f9\u5fce\u0284\uf861\ub13c\ueee0\ucda1\ub60d"), player.getDisplayName());
                object3 = yy.p(-1378548184);
                Object[] arrobject = new Object[1];
                arrobject[0] = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(NVIs$JbpD.H("\uc2a7\u5f9c\u029c\uf865\ub13d\ueef1\ucdf1\ub612\u861d")), object), NVIs$JbpD.H("\uc2fe\u5fc3")));
                object6 = xWpV.JI(xWpV.JI(((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"))))[0], NVIs$JbpD.H("\uc2bd"), new Class[]{String.class}), null, arrobject);
                Class[] arrclass = new Class[5];
                arrclass[0] = ((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363"))))[0];
                arrclass[1] = xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"));
                arrclass[2] = (Class)yy.p(-281088989);
                arrclass[3] = (Class)yy.p(-281088989);
                arrclass[4] = (Class)yy.p(-281088989);
                object5 = xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363")), arrclass);
                object4 = xWpV.JI(object5, new Object[]{object3, object6, n, n2, n3});
                xWpV.mXJp(player, object4);
                object3 = yy.p(-706410947);
                Object[] arrobject2 = new Object[1];
                arrobject2[0] = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(NVIs$JbpD.H("\uc2a7\u5f9c\u029c\uf865\ub13d\ueef1\ucdf1\ub612\u861d")), object), NVIs$JbpD.H("\uc2fe\u5fc3")));
                object6 = xWpV.JI(xWpV.JI(((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"))))[0], NVIs$JbpD.H("\uc2bd"), new Class[]{String.class}), null, arrobject2);
                Class[] arrclass2 = new Class[2];
                arrclass2[0] = ((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363"))))[0];
                arrclass2[1] = xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"));
                object5 = xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363")), arrclass2);
                object4 = xWpV.JI(object5, new Object[]{object3, object6});
                xWpV.mXJp(player, object4);
            }
            if (object2 != null) {
                object2 = xWpV.JI(38, object2);
                object2 = xWpV.JI(object2, NVIs$JbpD.H("\uc2f9\u5fce\u0284\uf861\ub13c\ueee0\ucda1\ub60d"), player.getDisplayName());
                object3 = yy.p(-1378548184);
                Object[] arrobject = new Object[1];
                arrobject[0] = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(NVIs$JbpD.H("\uc2a7\u5f9c\u029c\uf865\ub13d\ueef1\ucdf1\ub612\u861d")), object), NVIs$JbpD.H("\uc2fe\u5fc3")));
                object6 = xWpV.JI(xWpV.JI(((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"))))[0], NVIs$JbpD.H("\uc2bd"), new Class[]{String.class}), null, arrobject);
                Class[] arrclass = new Class[5];
                arrclass[0] = ((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363"))))[0];
                arrclass[1] = xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"));
                arrclass[2] = (Class)yy.p(-281088989);
                arrclass[3] = (Class)yy.p(-281088989);
                arrclass[4] = (Class)yy.p(-281088989);
                object5 = xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363")), arrclass);
                object4 = xWpV.JI(object5, new Object[]{object3, object6, n, n2, n3});
                xWpV.mXJp(player, object4);
                object3 = yy.p(1008993846);
                Object[] arrobject3 = new Object[1];
                arrobject3[0] = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(NVIs$JbpD.H("\uc2a7\u5f9c\u029c\uf865\ub13d\ueef1\ucdf1\ub612\u861d")), object2), NVIs$JbpD.H("\uc2fe\u5fc3")));
                object6 = xWpV.JI(xWpV.JI(((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"))))[0], NVIs$JbpD.H("\uc2bd"), new Class[]{String.class}), null, arrobject3);
                Class[] arrclass3 = new Class[5];
                arrclass3[0] = ((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363"))))[0];
                arrclass3[1] = xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"));
                arrclass3[2] = (Class)yy.p(-281088989);
                arrclass3[3] = (Class)yy.p(-281088989);
                arrclass3[4] = (Class)yy.p(-281088989);
                object5 = xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5023\u94db\u1889\u4528\u1363")), arrclass3);
                object4 = xWpV.JI(object5, new Object[]{object3, object6, n, n2, n3});
                xWpV.mXJp(player, object4);
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            xWpV.JI(exception);
        }
    }

    public static void yIkA(Player player) {
        xWpV.mXJp(player, (Integer)xWpV.JI(false), (Integer)xWpV.JI(false), (Integer)xWpV.JI(false), "", "");
    }

    public static void mXJp(Player player, String object, String object2) {
        if (object == null) {
            object = "";
        }
        object = xWpV.JI(38, object);
        if (object2 == null) {
            object2 = "";
        }
        object2 = xWpV.JI(38, object2);
        object = xWpV.JI(object, NVIs$JbpD.H("\uc2f9\u5fce\u0284\uf861\ub13c\ueee0\ucda1\ub60d"), player.getDisplayName());
        object2 = xWpV.JI(object2, NVIs$JbpD.H("\uc2f9\u5fce\u0284\uf861\ub13c\ueee0\ucda1\ub60d"), player.getDisplayName());
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(NVIs$JbpD.H("\uc2a7\u5f9c\u029c\uf865\ub13d\ueef1\ucdf1\ub612\u861d")), object), NVIs$JbpD.H("\uc2fe\u5fc3")));
            Object object3 = xWpV.JI(xWpV.JI(((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"))))[0], NVIs$JbpD.H("\uc2bd"), new Class[]{String.class}), null, arrobject);
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(NVIs$JbpD.H("\uc2a7\u5f9c\u029c\uf865\ub13d\ueef1\ucdf1\ub612\u861d")), object2), NVIs$JbpD.H("\uc2fe\u5fc3")));
            Object object4 = xWpV.JI(xWpV.JI(((Class[])xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"))))[0], NVIs$JbpD.H("\uc2bd"), new Class[]{String.class}), null, arrobject2);
            Object object5 = xWpV.JI(xWpV.MtdI(NVIs$JbpD.H("\uc28c\u5fdf\u028b\uf86b\ub120\ueef1\ucd83\ub644\u865e\ue81e\u6d52\uae64\u3182\u5027\u94de\u189c\u453d\u1363\ufbc3\u64cf\u7aaa\u09de\ue825\u31e0\u557a\uc525\u1317\udd3e\u20e2\uf0bf\ub951\uc8b4\u3d8e\u2baa\u19c2")), new Class[]{xWpV.MtdI(NVIs$JbpD.H("\uc295\u5ffd\u0280\uf861\ub131\ueec7\ucdb2\ub65b\u865a\ue824\u6d72\uae7c\u3186\u5018\u94dc\u1898\u452a\u1372"))});
            Object object6 = xWpV.JI(object5, new Object[]{object3});
            Object object7 = xWpV.JI(xWpV.JI(object6), NVIs$JbpD.H("\uc2be"));
            xWpV.JI(object7, true);
            xWpV.JI(object7, object6, object4);
            xWpV.mXJp(player, object6);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            xWpV.JI(exception);
            return;
        }
    }

    public static void mXJp(Player player, String string) {
        if (xWpV.JI() == false) {
            return;
        }
        try {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5 = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\ue4f6\u8424\u25aa\ufe4f\uf546\u4d30\u18e9\ud7de\u3984\ua068\ua9c7\u1918\u4479\ua5db\uf8b5\ud86d\u4bc0\u9ded\u07d4\u6298\u3ad4\u206b\u9fe8")), (String)yy.p(-2029976015)), BkvY$LhxG.I("\ue4b7\u8433\u25a3\ufe15\uf54d\u4d31\u18fb\ud79b\u39ae\ua06e\ua988\u191d\u447f\ua5ea\uf8bf\ud878\u4bdb\u9dfd\u07cd"))));
            Object object6 = xWpV.JI(object5, player);
            Object object7 = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\ue4f7\u8433\u25b9\ufe4f\uf549\u4d2c\u18ec\ud7d0\u398e\ua06e\ua988\u191d\u447f\ua594\uf8a0\ud87c\u4bd0\u9dee\u07da\u6281\u3a93")), (String)yy.p(-2029976015)), BkvY$LhxG.I("\ue4b7\u8406\u25ac\ufe02\uf54f\u4d20\u18f6\ud7e5\u3981\ua07d\ua990\u1934\u447e\ua5ce\uf890\ud871\u4bc3\u9dec"))));
            Object object8 = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\ue4f7\u8433\u25b9\ufe4f\uf549\u4d2c\u18ec\ud7d0\u398e\ua06e\ua988\u191d\u447f\ua594\uf8a0\ud87c\u4bd0\u9dee\u07da\u6281\u3a93")), (String)yy.p(-2029976015)), BkvY$LhxG.I("\ue4b7\u8406\u25ac\ufe02\uf54f\u4d20\u18f6"))));
            if (((Boolean)yy.p(-1267399121)).booleanValue()) {
                Object object9 = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\ue4f7\u8433\u25b9\ufe4f\uf549\u4d2c\u18ec\ud7d0\u398e\ua06e\ua988\u191d\u447f\ua594\uf8a0\ud87c\u4bd0\u9dee\u07da\u6281\u3a93")), (String)yy.p(-2029976015)), BkvY$LhxG.I("\ue4b7\u8415\u25a5\ufe00\uf550\u4d16\u18e7\ud7c7\u3984\ua07d\ua985\u1912\u4471\ua5df\uf8a1"))));
                Object object10 = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\ue4f7\u8433\u25b9\ufe4f\uf549\u4d2c\u18ec\ud7d0\u398e\ua06e\ua988\u191d\u447f\ua594\uf8a0\ud87c\u4bd0\u9dee\u07da\u6281\u3a93")), (String)yy.p(-2029976015)), BkvY$LhxG.I("\ue4b7\u841f\u258e\ufe09\uf545\u4d31\u18c0\ud7d4\u399e\ua079\ua9aa\u1914\u4466\ua5ca\uf8bc\ud877\u4bc7\u9df6\u07cb"))));
                object = xWpV.JI(object9, BkvY$LhxG.I("\ue4f8"), new Class[]{String.class});
                Object[] arrobject = new Object[1];
                arrobject[0] = xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\ue4e2\u8474\u25b9\ufe04\uf55c\u4d31\u18a0\ud78f\u39cd\ua03e")), string), BkvY$LhxG.I("\ue4bb\u842b")));
                object3 = xWpV.JI(object10, xWpV.JI(object, object9, arrobject));
                Object[] arrobject2 = new Object[2];
                arrobject2[0] = object3;
                arrobject2[1] = xWpV.JI(2);
                object4 = xWpV.JI(xWpV.JI(object7, new Class[]{object10, (Class)yy.p(-2009201151)}), arrobject2);
            } else {
                Object object11 = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\ue4f7\u8433\u25b9\ufe4f\uf549\u4d2c\u18ec\ud7d0\u398e\ua06e\ua988\u191d\u447f\ua594\uf8a0\ud87c\u4bd0\u9dee\u07da\u6281\u3a93")), (String)yy.p(-2029976015)), BkvY$LhxG.I("\ue4b7\u8415\u25a5\ufe00\uf550\u4d06\u18ed\ud7d8\u399d\ua073\ua987\u191e\u4465\ua5ce\uf887\ud87c\u4bda\u9dec"))));
                Object object12 = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\ue4f7\u8433\u25b9\ufe4f\uf549\u4d2c\u18ec\ud7d0\u398e\ua06e\ua988\u191d\u447f\ua594\uf8a0\ud87c\u4bd0\u9dee\u07da\u6281\u3a93")), (String)yy.p(-2029976015)), BkvY$LhxG.I("\ue4b7\u841f\u258e\ufe09\uf545\u4d31\u18c0\ud7d4\u399e\ua079\ua9aa\u1914\u4466\ua5ca\uf8bc\ud877\u4bc7\u9df6\u07cb"))));
                object = xWpV.JI(xWpV.JI(object11, new Class[]{String.class}), new Object[]{string});
                if (xWpV.JI(xWpV.JI(), (Ahus)((Object)yy.p(-328464896))) != false) {
                    object3 = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\ue4f7\u8433\u25b9\ufe4f\uf549\u4d2c\u18ec\ud7d0\u398e\ua06e\ua988\u191d\u447f\ua594\uf8a0\ud87c\u4bd0\u9dee\u07da\u6281\u3a93")), (String)yy.p(-2029976015)), BkvY$LhxG.I("\ue4b7\u8415\u25a5\ufe00\uf550\u4d08\u18e7\ud7c6\u399e\ua07d\ua98e\u191e\u445f\ua5c3\uf8a3\ud87c"))));
                    object2 = xWpV.JI(xWpV.JI(object3, BkvY$LhxG.I("\ue4ef\u8437\u25a1\ufe14\uf541\u4d0a\u18e4"), new Class[]{String.class}), null, new Object[]{BkvY$LhxG.I("\ue4de\u8417\u2580\ufe24\uf57b\u4d0c\u18cc\ud7f3\u39a2")});
                    object4 = xWpV.JI(xWpV.JI(object7, new Class[]{object12, object3}), new Object[]{object, object2});
                } else {
                    Object[] arrobject = new Object[2];
                    arrobject[0] = object;
                    arrobject[1] = xWpV.JI(2);
                    object4 = xWpV.JI(xWpV.JI(object7, new Class[]{object12, (Class)yy.p(-2009201151)}), arrobject);
                }
            }
            object = xWpV.JI(object5, BkvY$LhxG.I("\ue4fe\u8433\u25b9\ufe29\uf545\u4d2b\u18e6\ud7d9\u3988"), new Class[0]);
            object3 = xWpV.JI(object, object6, new Object[0]);
            object2 = xWpV.JI(xWpV.JI(object3), BkvY$LhxG.I("\ue4e9\u843a\u25ac\ufe18\uf541\u4d37\u18c1\ud7da\u3983\ua072\ua98c\u1918\u447f\ua5d3\uf8bc\ud877"));
            Object object13 = xWpV.JI(object2, object3);
            Object object14 = xWpV.JI(xWpV.JI(object13), BkvY$LhxG.I("\ue4ea\u8433\u25a3\ufe05\uf574\u4d24\u18e1\ud7de\u3988\ua068"), new Class[]{object8});
            xWpV.JI(object14, object13, new Object[]{object4});
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            xWpV.JI(exception);
            return;
        }
    }

    public static void mXJp(Player player, String string, int n) {
        xWpV.mXJp(player, string);
        if (n >= 0) {
            xWpV.JI(new xWpV$1(player), (Plugin)((xWpV)yy.p(-1168964018)), n + 1);
        }
        while (n > 60) {
            int n2 = (n -= 60) % 60;
            xWpV.JI(new xWpV$2(player, string), (Plugin)((xWpV)yy.p(-1168964018)), n2);
        }
    }

    public static void jEqq(String string) {
        xWpV.qdWJ(string, -1);
    }

    public static void qdWJ(String string, int n) {
        Iterator iterator = xWpV.JI().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            xWpV.mXJp(player, string, n);
        }
    }

    public static String qAsQ(Entity entity) {
        if (xWpV.JI() == false) {
            return null;
        }
        return entity.getCustomName();
    }

    public static int qArm(Player player) {
        try {
            Object object = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI()))), 23);
            Object object2 = xWpV.JI(xWpV.JI(xWpV.JI(xWpV.JI(new StringBuilder(BkvY$LhxG.I("\u8301\uf412\ucc16\ub2de\uddd4\u0329\u4bcc\u9fca\uc203\u3883\u144f\ucbac\ubce3\u368b\uae49\u91b4\ud794\u1b61\u7459\ud1bf\u62ce\ufe00\u4528")), object), BkvY$LhxG.I("\u8340\uf405\ucc1f\ub284\udddf\u0328\u4bde\u9f8f\uc229\u3885\u1400\ucba9\ubce5\u36ba\uae43\u91a1\ud78f\u1b71\u7440"))));
            Object object3 = xWpV.JI(xWpV.JI(object2, BkvY$LhxG.I("\u8309\uf405\ucc05\ub2b8\uddd7\u0332\u4bc3\u9fcd\uc20f"), new Class[0]), player, new Object[0]);
            Integer n = (Integer)xWpV.JI(xWpV.JI(xWpV.JI(object3), BkvY$LhxG.I("\u831e\uf409\ucc1f\ub297")), object3);
            return (int)xWpV.JI(n);
        }
        catch (Exception exception) {
            return -1;
        }
    }

    private static Object JI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

