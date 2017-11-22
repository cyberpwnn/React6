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

public class WaHe {
    public static WaHe aEJR;
    private static boolean SwUw;
    public static String mGlB;
    public static Object URhN;
    public static Object XvDu;
    public static Object YNTN;

    static {
        block3 : {
            block2 : {
                cv.V(1962472445, null);
                cv.V(1651438588, null);
                cv.V(-1802570753, null);
                Object object = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI())));
                cv.V(-1746864968, object);
                Object object2 = WaHe.zI(object, WaHe.zI((String)cv.e(-1746864968), rgig$AWxc.r("\udb8f")) + true);
                cv.V(-1746864968, object2);
                if (WaHe.zI(object2, rgig$AWxc.r("\udbd7\u7b03\u4db1\u8ecb\u0c01\uc945\ucd8c")) != false) break block2;
                if (WaHe.zI((String)cv.e(-1746864968), rgig$AWxc.r("\udbd7\u7b03\u4db1\u8ec4\u0c01")) == false) break block3;
            }
            cv.V(1228600506, true);
        }
    }

    public static String getVersion() {
        Object object = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI())));
        Object object2 = WaHe.zI(WaHe.zI(new StringBuilder((String)WaHe.zI(WaHe.zI(object, WaHe.zI(object, 46) + true))), YEBy$TyVf.W("\uf8a3")));
        return object2;
    }

    public static void ssNb(LivingEntity livingEntity, boolean bl) {
        try {
            if (WaHe.zI() != false) {
                livingEntity.setAI(bl);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static Class<?> CoXE(String string) {
        Object object = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(rgig$AWxc.r("\u3e5b\u56c5\u4925\u87e1\ub7a9\ud9b2\u2a79\ud28a\u334b\u9ffa\uffdc\ue709\u72ea\uded6\u23c8\ud049\uec33\ufc2b\u29dd\u606a\ub3c8")), WaHe.getVersion()), string));
        Object object2 = null;
        try {
            object2 = WaHe.zI(object);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return object2;
    }

    public static Class<?> ftyu(String string) {
        Object object = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(rgig$AWxc.r("\u55ae\u68ba\ub51b\u8cc7\u593b\u9d1b\u8c2c\u5010\u8a2a\u490e\ue3ca\u9db2\uc49c\ucc98\u5a58\u2c44\ub3c0\u8a32\uf15a\u62bb\ue8ec\u5144\uc110")), WaHe.getVersion()), string));
        Object object2 = null;
        try {
            object2 = WaHe.zI(object);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return object2;
    }

    public static Object mXMK(String string) {
        try {
            return WaHe.zI(WaHe.zI((Class)cv.e(-1691815416), YEBy$TyVf.W("\u527f"), new Class[]{String.class}), null, new Object[]{string});
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static Field ssNb(Field field) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        WaHe.zI(field, true);
        Object object = WaHe.zI(Field.class, YEBy$TyVf.W("\u5437\u8f4a\ube02\u44e6\ue89c\ub327\u75df\u2b5b\ua0e3"));
        WaHe.zI(object, true);
        WaHe.zI(object, field, WaHe.zI(field) & -17);
        return field;
    }

    public static Method ssNb(Method method) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        WaHe.zI(method, true);
        return method;
    }

    public static String getBukkitVersion() {
        return WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI()))), 23);
    }

    public static String mrKm() {
        return WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u9ef9\ufa97\uf9a2\u64b2\u519f\u208e\u667e\u4bde\uec22\u3261\u1a4f\u7f35\uc6f0\u52b3\u92cc\u66fc\uf1b1\u8cdf\ufe57\u6d35\u45d2")), WaHe.getBukkitVersion()));
    }

    public static String kcUD() {
        return WaHe.zI(WaHe.zI(new StringBuilder(rgig$AWxc.r("\u9102\uc393\ue894\ucf9b\u37c2\u5c4c\u3734\ue14d\uaf8d\u2ca2\u6cad\uc066\u180f\u9a06\u48f3\u9f46\u5a0a\ud727\u3a70\u6386\ub3b0\ue2a0\ue13a")), WaHe.getBukkitVersion()));
    }

    public static void ssNb(Player player, Entity entity, Entity entity2) {
        try {
            Object object = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder((String)WaHe.zI(WaHe.kcUD())), rgig$AWxc.r("\u77bd\u0ee9\u9638\u4705\uadc3\u5243\u6208\ub9aa\u8ec9\ubcb0\u18e5\u79db\u8583\ue8ed\u8f9d\u61f6\u4171\ua4b2\u7b44"))));
            Object object2 = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder((String)WaHe.zI(WaHe.mrKm())), rgig$AWxc.r("\u77bd\u0edc\u9637\u4712\uadc1\u5252\u6205\ub9d4\u8ee6\ubca3\u18fd\u79f2\u8582\ue8c9\u8fb2\u61f8\u4164\ua4bb\u7b53\u5ab2\u3336"))));
            Object object3 = WaHe.zI(WaHe.zI(object, rgig$AWxc.r("\u77f4\u0ee9\u9622\u4739\uadcb\u5259\u6215\ub9e8\u8eef"), new Class[0]), player, new Object[0]);
            Object[] arrobject = new Object[2];
            arrobject[0] = WaHe.zI(entity2.getEntityId());
            arrobject[1] = WaHe.zI(entity.getEntityId());
            Object object4 = WaHe.zI(WaHe.zI(object2, new Class[]{(Class)cv.e(1035866500), (Class)cv.e(1035866500)}), arrobject);
            Object object5 = WaHe.zI(WaHe.zI(WaHe.zI(object3), rgig$AWxc.r("\u77e3\u0ee0\u9637\u4708\uadcf\u5245\u6232\ub9eb\u8ee4\ubcac\u18e1\u79de\u8583\ue8d4\u8f9e\u61f9")), object3);
            Class[] arrclass = new Class[1];
            arrclass[0] = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder((String)WaHe.zI(WaHe.mrKm())), rgig$AWxc.r("\u77bd\u0edc\u9637\u4712\uadc1\u5252\u6205"))));
            WaHe.zI(WaHe.zI(WaHe.zI(object5), rgig$AWxc.r("\u77e0\u0ee9\u9638\u4715\uadfa\u5256\u6212\ub9ef\u8eef\ubcb6"), arrclass), object5, new Object[]{object4});
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            WaHe.zI(exception);
            return;
        }
    }

    public static void ssNb(Player player, Object object) {
        try {
            Object object2 = WaHe.zI(WaHe.zI(WaHe.zI(player), rgig$AWxc.r("\u77f4\u0ee9\u9622\u4739\uadcb\u5259\u6215\ub9e8\u8eef"), new Class[0]), player, new Object[0]);
            Object object3 = WaHe.zI(WaHe.zI(WaHe.zI(object2), rgig$AWxc.r("\u77e3\u0ee0\u9637\u4708\uadcf\u5245\u6232\ub9eb\u8ee4\ubcac\u18e1\u79de\u8583\ue8d4\u8f9e\u61f9")), object2);
            WaHe.zI(WaHe.zI(WaHe.zI(object3), rgig$AWxc.r("\u77e0\u0ee9\u9638\u4715\uadfa\u5256\u6212\ub9ef\u8eef\ubcb6"), new Class[]{WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243"))}), object3, new Object[]{object});
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            WaHe.zI(exception);
            return;
        }
    }

    public static Class<?> HBqU(String string) {
        String string2 = ((String[])WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI()))), YEBy$TyVf.W("\ub849\u2b24")))[3];
        try {
            return WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(YEBy$TyVf.W("\ub87b\u2b6f\u6a8d\uc944\u8147\ub28e\u8ebf\u40ed\u826e\ud6ac\uf02a\u0daf\ue84b\ubad9\u4504\u9b39\ua715\u60ee\uadda\u507b\u12a3")), string2), YEBy$TyVf.W("\ub83b")), string)));
        }
        catch (ClassNotFoundException classNotFoundException) {
            ClassNotFoundException classNotFoundException2 = classNotFoundException;
            WaHe.zI(classNotFoundException);
            return null;
        }
    }

    public static void ssNb(Player player, Integer n, Integer n2, Integer n3, String object, String object2) {
        try {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            if (cv.e(1962472445) == null) {
                cv.V(1962472445, WaHe.zI(WaHe.zI(((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2"))))[0], rgig$AWxc.r("\u77c7\u0ec5\u961b\u4734\uadf9")), null));
            }
            if (cv.e(1651438588) == null) {
                cv.V(1651438588, WaHe.zI(WaHe.zI(((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2"))))[0], rgig$AWxc.r("\u77c7\u0ec5\u9602\u473d\uadef")), null));
            }
            if (cv.e(-1802570753) == null) {
                cv.V(-1802570753, WaHe.zI(WaHe.zI(((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2"))))[0], rgig$AWxc.r("\u77c0\u0ed9\u9614\u4725\uade3\u5263\u623d\ub9c1")), null));
            }
            if (object != null) {
                object = WaHe.zI(38, object);
                object = WaHe.zI(object, rgig$AWxc.r("\u77b6\u0efc\u963a\u4710\uadd3\u5252\u6203\ub9a1"), player.getDisplayName());
                object3 = cv.e(1962472445);
                Object[] arrobject = new Object[1];
                arrobject[0] = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(rgig$AWxc.r("\u77e8\u0eae\u9622\u4714\uadd2\u5243\u6253\ub9be\u8ea8")), object), rgig$AWxc.r("\u77b1\u0ef1")));
                object6 = WaHe.zI(WaHe.zI(((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77da\u0ecf\u963e\u4710\uadde\u5275\u6210\ub9f7\u8eef\ubc81\u18eb\u79d0\u8587\ue8d2\u8f9f\u61f2\u4166\ua4a3"))))[0], rgig$AWxc.r("\u77f2"), new Class[]{String.class}), null, arrobject);
                Class[] arrclass = new Class[5];
                arrclass[0] = ((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2"))))[0];
                arrclass[1] = WaHe.HBqU(rgig$AWxc.r("\u77da\u0ecf\u963e\u4710\uadde\u5275\u6210\ub9f7\u8eef\ubc81\u18eb\u79d0\u8587\ue8d2\u8f9f\u61f2\u4166\ua4a3"));
                arrclass[2] = (Class)cv.e(1035866500);
                arrclass[3] = (Class)cv.e(1035866500);
                arrclass[4] = (Class)cv.e(1035866500);
                object5 = WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2")), arrclass);
                object4 = WaHe.zI(object5, new Object[]{object3, object6, n, n2, n3});
                WaHe.ssNb(player, object4);
                object3 = cv.e(1651438588);
                Object[] arrobject2 = new Object[1];
                arrobject2[0] = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(rgig$AWxc.r("\u77e8\u0eae\u9622\u4714\uadd2\u5243\u6253\ub9be\u8ea8")), object), rgig$AWxc.r("\u77b1\u0ef1")));
                object6 = WaHe.zI(WaHe.zI(((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77da\u0ecf\u963e\u4710\uadde\u5275\u6210\ub9f7\u8eef\ubc81\u18eb\u79d0\u8587\ue8d2\u8f9f\u61f2\u4166\ua4a3"))))[0], rgig$AWxc.r("\u77f2"), new Class[]{String.class}), null, arrobject2);
                Class[] arrclass2 = new Class[2];
                arrclass2[0] = ((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2"))))[0];
                arrclass2[1] = WaHe.HBqU(rgig$AWxc.r("\u77da\u0ecf\u963e\u4710\uadde\u5275\u6210\ub9f7\u8eef\ubc81\u18eb\u79d0\u8587\ue8d2\u8f9f\u61f2\u4166\ua4a3"));
                object5 = WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2")), arrclass2);
                object4 = WaHe.zI(object5, new Object[]{object3, object6});
                WaHe.ssNb(player, object4);
            }
            if (object2 != null) {
                object2 = WaHe.zI(38, object2);
                object2 = WaHe.zI(object2, rgig$AWxc.r("\u77b6\u0efc\u963a\u4710\uadd3\u5252\u6203\ub9a1"), player.getDisplayName());
                object3 = cv.e(1962472445);
                Object[] arrobject = new Object[1];
                arrobject[0] = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(rgig$AWxc.r("\u77e8\u0eae\u9622\u4714\uadd2\u5243\u6253\ub9be\u8ea8")), object), rgig$AWxc.r("\u77b1\u0ef1")));
                object6 = WaHe.zI(WaHe.zI(((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77da\u0ecf\u963e\u4710\uadde\u5275\u6210\ub9f7\u8eef\ubc81\u18eb\u79d0\u8587\ue8d2\u8f9f\u61f2\u4166\ua4a3"))))[0], rgig$AWxc.r("\u77f2"), new Class[]{String.class}), null, arrobject);
                Class[] arrclass = new Class[5];
                arrclass[0] = ((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2"))))[0];
                arrclass[1] = WaHe.HBqU(rgig$AWxc.r("\u77da\u0ecf\u963e\u4710\uadde\u5275\u6210\ub9f7\u8eef\ubc81\u18eb\u79d0\u8587\ue8d2\u8f9f\u61f2\u4166\ua4a3"));
                arrclass[2] = (Class)cv.e(1035866500);
                arrclass[3] = (Class)cv.e(1035866500);
                arrclass[4] = (Class)cv.e(1035866500);
                object5 = WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2")), arrclass);
                object4 = WaHe.zI(object5, new Object[]{object3, object6, n, n2, n3});
                WaHe.ssNb(player, object4);
                object3 = cv.e(-1802570753);
                Object[] arrobject3 = new Object[1];
                arrobject3[0] = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(rgig$AWxc.r("\u77e8\u0eae\u9622\u4714\uadd2\u5243\u6253\ub9be\u8ea8")), object2), rgig$AWxc.r("\u77b1\u0ef1")));
                object6 = WaHe.zI(WaHe.zI(((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77da\u0ecf\u963e\u4710\uadde\u5275\u6210\ub9f7\u8eef\ubc81\u18eb\u79d0\u8587\ue8d2\u8f9f\u61f2\u4166\ua4a3"))))[0], rgig$AWxc.r("\u77f2"), new Class[]{String.class}), null, arrobject3);
                Class[] arrclass3 = new Class[5];
                arrclass3[0] = ((Class[])WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2"))))[0];
                arrclass3[1] = WaHe.HBqU(rgig$AWxc.r("\u77da\u0ecf\u963e\u4710\uadde\u5275\u6210\ub9f7\u8eef\ubc81\u18eb\u79d0\u8587\ue8d2\u8f9f\u61f2\u4166\ua4a3"));
                arrclass3[2] = (Class)cv.e(1035866500);
                arrclass3[3] = (Class)cv.e(1035866500);
                arrclass3[4] = (Class)cv.e(1035866500);
                object5 = WaHe.zI(WaHe.HBqU(rgig$AWxc.r("\u77c3\u0eed\u9635\u471a\uadcf\u5243\u6221\ub9e8\u8eeb\ubcbb\u18cb\u79c8\u8583\ue8e9\u8f98\u61e3\u4164\ua4b2")), arrclass3);
                object4 = WaHe.zI(object5, new Object[]{object3, object6, n, n2, n3});
                WaHe.ssNb(player, object4);
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            WaHe.zI(exception);
        }
    }

    public static void LGKl(Player player) {
        WaHe.ssNb(player, (Integer)WaHe.zI(false), (Integer)WaHe.zI(false), (Integer)WaHe.zI(false), "", "");
    }

    public static void ssNb(Player player, String object, String object2) {
        if (object == null) {
            object = "";
        }
        object = WaHe.zI(38, object);
        if (object2 == null) {
            object2 = "";
        }
        object2 = WaHe.zI(38, object2);
        object = WaHe.zI(object, KUXS$dwji.S("\u78f6\uc18f\uf318\u2f5d\u9a34\u7a0a\ub41d\u5005"), player.getDisplayName());
        object2 = WaHe.zI(object2, KUXS$dwji.S("\u78f6\uc18f\uf318\u2f5d\u9a34\u7a0a\ub41d\u5005"), player.getDisplayName());
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78a8\uc1dd\uf300\u2f59\u9a35\u7a1b\ub44d\u501a\u8ed3")), object), KUXS$dwji.S("\u78f1\uc182")));
            Object object3 = WaHe.zI(WaHe.zI(((Class[])WaHe.zI(WaHe.HBqU(KUXS$dwji.S("\u789a\uc1bc\uf31c\u2f5d\u9a39\u7a2d\ub40e\u5053\u8e94\u40cb\u9025\u7d69\u07eb\u3b18\u2f37\ubb7a\ua416\ucc9c"))))[0], KUXS$dwji.S("\u78b2"), new Class[]{String.class}), null, arrobject);
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78a8\uc1dd\uf300\u2f59\u9a35\u7a1b\ub44d\u501a\u8ed3")), object2), KUXS$dwji.S("\u78f1\uc182")));
            Object object4 = WaHe.zI(WaHe.zI(((Class[])WaHe.zI(WaHe.HBqU(KUXS$dwji.S("\u789a\uc1bc\uf31c\u2f5d\u9a39\u7a2d\ub40e\u5053\u8e94\u40cb\u9025\u7d69\u07eb\u3b18\u2f37\ubb7a\ua416\ucc9c"))))[0], KUXS$dwji.S("\u78b2"), new Class[]{String.class}), null, arrobject2);
            Object object5 = WaHe.zI(WaHe.HBqU(KUXS$dwji.S("\u7883\uc19e\uf317\u2f57\u9a28\u7a1b\ub43f\u504c\u8e90\u40f1\u9005\u7d71\u07ef\u3b27\u2f35\ubb7e\ua401\ucc8d\u14b4\u0dca\ufccb\u08c8\u1162\u4153\ub3be\u5a18\u8c45\u24e3\u0264\u2703\u3add\u22ea\uc59a\u7cd5\u848b")), new Class[]{WaHe.HBqU(KUXS$dwji.S("\u789a\uc1bc\uf31c\u2f5d\u9a39\u7a2d\ub40e\u5053\u8e94\u40cb\u9025\u7d69\u07eb\u3b18\u2f37\ubb7a\ua416\ucc9c"))});
            Object object6 = WaHe.zI(object5, new Object[]{object3});
            Object object7 = WaHe.zI(WaHe.zI(object6), KUXS$dwji.S("\u78b1"));
            WaHe.zI(object7, true);
            WaHe.zI(object7, object6, object4);
            WaHe.ssNb(player, object6);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            WaHe.zI(exception);
            return;
        }
    }

    public static void ssNb(Player player, String string) {
        if (WaHe.zI() == false) {
            return;
        }
        try {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5 = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78bc\uc18d\uf313\u2f12\u9a2f\u7a1a\ub404\u504b\u8e98\u40fc\u9064\u7d67\u07e9\u3b16\u2f3f\ubb6b\ua41a\ucc9d\u14ad\u0ded\ufccb\u08cf\u1138")), (String)cv.e(-1746864968)), KUXS$dwji.S("\u78fd\uc19a\uf31a\u2f48\u9a24\u7a1b\ub416\u500e\u8eb2\u40fa\u902b\u7d62\u07ef\u3b27\u2f35\ubb7e\ua401\ucc8d\u14b4"))));
            Object object6 = WaHe.zI(object5, player);
            Object object7 = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78bd\uc19a\uf300\u2f12\u9a20\u7a06\ub401\u5045\u8e92\u40fa\u902b\u7d62\u07ef\u3b59\u2f2a\ubb7a\ua40a\ucc9e\u14a3\u0df4\ufc8c")), (String)cv.e(-1746864968)), KUXS$dwji.S("\u78fd\uc1af\uf315\u2f5f\u9a26\u7a0a\ub41b\u5070\u8e9d\u40e9\u9033\u7d4b\u07ee\u3b03\u2f1a\ubb77\ua419\ucc9c"))));
            Object object8 = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78bd\uc19a\uf300\u2f12\u9a20\u7a06\ub401\u5045\u8e92\u40fa\u902b\u7d62\u07ef\u3b59\u2f2a\ubb7a\ua40a\ucc9e\u14a3\u0df4\ufc8c")), (String)cv.e(-1746864968)), KUXS$dwji.S("\u78fd\uc1af\uf315\u2f5f\u9a26\u7a0a\ub41b"))));
            if (((Boolean)cv.e(1228600506)).booleanValue()) {
                Object object9 = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78bd\uc19a\uf300\u2f12\u9a20\u7a06\ub401\u5045\u8e92\u40fa\u902b\u7d62\u07ef\u3b59\u2f2a\ubb7a\ua40a\ucc9e\u14a3\u0df4\ufc8c")), (String)cv.e(-1746864968)), KUXS$dwji.S("\u78fd\uc1bc\uf31c\u2f5d\u9a39\u7a3c\ub40a\u5052\u8e98\u40e9\u9026\u7d6d\u07e1\u3b12\u2f2b"))));
                Object object10 = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78bd\uc19a\uf300\u2f12\u9a20\u7a06\ub401\u5045\u8e92\u40fa\u902b\u7d62\u07ef\u3b59\u2f2a\ubb7a\ua40a\ucc9e\u14a3\u0df4\ufc8c")), (String)cv.e(-1746864968)), KUXS$dwji.S("\u78fd\uc1b6\uf337\u2f54\u9a2c\u7a1b\ub42d\u5041\u8e82\u40ed\u9009\u7d6b\u07f6\u3b07\u2f36\ubb71\ua41d\ucc86\u14b2"))));
                object = WaHe.zI(object9, KUXS$dwji.S("\u78b2"), new Class[]{String.class});
                Object[] arrobject = new Object[1];
                arrobject[0] = WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78a8\uc1dd\uf300\u2f59\u9a35\u7a1b\ub44d\u501a\u8ed1\u40aa")), string), KUXS$dwji.S("\u78f1\uc182")));
                object3 = WaHe.zI(object10, WaHe.zI(object, object9, arrobject));
                Object[] arrobject2 = new Object[2];
                arrobject2[0] = object3;
                arrobject2[1] = WaHe.zI(2);
                object4 = WaHe.zI(WaHe.zI(object7, new Class[]{object10, (Class)cv.e(-1532234577)}), arrobject2);
            } else {
                Object object11 = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78bd\uc19a\uf300\u2f12\u9a20\u7a06\ub401\u5045\u8e92\u40fa\u902b\u7d62\u07ef\u3b59\u2f2a\ubb7a\ua40a\ucc9e\u14a3\u0df4\ufc8c")), (String)cv.e(-1746864968)), KUXS$dwji.S("\u78fd\uc1bc\uf31c\u2f5d\u9a39\u7a2c\ub400\u504d\u8e81\u40e7\u9024\u7d61\u07f5\u3b03\u2f0d\ubb7a\ua400\ucc9c"))));
                Object object12 = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78bd\uc19a\uf300\u2f12\u9a20\u7a06\ub401\u5045\u8e92\u40fa\u902b\u7d62\u07ef\u3b59\u2f2a\ubb7a\ua40a\ucc9e\u14a3\u0df4\ufc8c")), (String)cv.e(-1746864968)), KUXS$dwji.S("\u78fd\uc1b6\uf337\u2f54\u9a2c\u7a1b\ub42d\u5041\u8e82\u40ed\u9009\u7d6b\u07f6\u3b07\u2f36\ubb71\ua41d\ucc86\u14b2"))));
                object = WaHe.zI(WaHe.zI(object11, new Class[]{String.class}), new Object[]{string});
                if (WaHe.zI(WaHe.zI(), (lTrT)((Object)cv.e(873460904))) != false) {
                    object3 = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(KUXS$dwji.S("\u78bd\uc19a\uf300\u2f12\u9a20\u7a06\ub401\u5045\u8e92\u40fa\u902b\u7d62\u07ef\u3b59\u2f2a\ubb7a\ua40a\ucc9e\u14a3\u0df4\ufc8c")), (String)cv.e(-1746864968)), KUXS$dwji.S("\u78fd\uc1bc\uf31c\u2f5d\u9a39\u7a22\ub40a\u5053\u8e82\u40e9\u902d\u7d61\u07cf\u3b0e\u2f29\ubb7a"))));
                    object2 = WaHe.zI(WaHe.zI(object3, KUXS$dwji.S("\u78a5\uc19e\uf318\u2f49\u9a28\u7a20\ub409"), new Class[]{String.class}), null, new Object[]{KUXS$dwji.S("\u7894\uc1be\uf339\u2f79\u9a12\u7a26\ub421\u5066\u8ebe")});
                    object4 = WaHe.zI(WaHe.zI(object7, new Class[]{object12, object3}), new Object[]{object, object2});
                } else {
                    Object[] arrobject = new Object[2];
                    arrobject[0] = object;
                    arrobject[1] = WaHe.zI(2);
                    object4 = WaHe.zI(WaHe.zI(object7, new Class[]{object12, (Class)cv.e(-1532234577)}), arrobject);
                }
            }
            object = WaHe.zI(object5, KUXS$dwji.S("\u78b4\uc19a\uf300\u2f74\u9a2c\u7a01\ub40b\u504c\u8e94"), new Class[0]);
            object3 = WaHe.zI(object, object6, new Object[0]);
            object2 = WaHe.zI(WaHe.zI(object3), KUXS$dwji.S("\u78a3\uc193\uf315\u2f45\u9a28\u7a1d\ub42c\u504f\u8e9f\u40e6\u902f\u7d67\u07ef\u3b1e\u2f36\ubb71"));
            Object object13 = WaHe.zI(object2, object3);
            Object object14 = WaHe.zI(WaHe.zI(object13), KUXS$dwji.S("\u78a0\uc19a\uf31a\u2f58\u9a1d\u7a0e\ub40c\u504b\u8e94\u40fc"), new Class[]{object8});
            WaHe.zI(object14, object13, new Object[]{object4});
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            WaHe.zI(exception);
            return;
        }
    }

    public static void ssNb(Player player, String string, int n) {
        WaHe.ssNb(player, string);
        if (n >= 0) {
            WaHe.zI(new WaHe$1(player), (Plugin)((WaHe)cv.e(1524561066)), n + 1);
        }
        while (n > 60) {
            int n2 = (n -= 60) % 60;
            WaHe.zI(new WaHe$2(player, string), (Plugin)((WaHe)cv.e(1524561066)), n2);
        }
    }

    public static void NxGC(String string) {
        WaHe.YoSa(string, -1);
    }

    public static void YoSa(String string, int n) {
        Iterator iterator = WaHe.zI().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            WaHe.ssNb(player, string, n);
        }
    }

    public static String EmLA(Entity entity) {
        if (WaHe.zI() == false) {
            return null;
        }
        return entity.getCustomName();
    }

    public static int ykmX(Player player) {
        try {
            Object object = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI()))), 23);
            Object object2 = WaHe.zI(WaHe.zI(WaHe.zI(WaHe.zI(new StringBuilder(YEBy$TyVf.W("\uc877\u7956\u0b6c\uc474\u4ce7\u0b13\u7f83\u6ab9\ucca0\uec04\ufad7\u5fae\u1e7d\u5011\uf078\u5cae\udae4\u06fc\u94d6\ue163\u046a\uc7e0\u50f7")), object), YEBy$TyVf.W("\uc836\u7941\u0b65\uc42e\u4cec\u0b12\u7f91\u6afc\ucc8a\uec02\ufa98\u5fab\u1e7b\u5020\uf072\u5cbb\udaff\u06ec\u94cf"))));
            Object object3 = WaHe.zI(WaHe.zI(object2, YEBy$TyVf.W("\uc87f\u7941\u0b7f\uc412\u4ce4\u0b08\u7f8c\u6abe\uccac"), new Class[0]), player, new Object[0]);
            Integer n = (Integer)WaHe.zI(WaHe.zI(WaHe.zI(object3), YEBy$TyVf.W("\uc868\u794d\u0b65\uc43d")), object3);
            return (int)WaHe.zI(n);
        }
        catch (Exception exception) {
            return -1;
        }
    }

    private static Object zI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

