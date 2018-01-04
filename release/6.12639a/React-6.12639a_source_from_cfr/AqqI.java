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

public class AqqI {
    public static AqqI sJTk;
    private static boolean scgE;
    public static String PvuI;
    public static Object xPrd;
    public static Object UlrQ;
    public static Object FaJR;

    static {
        block3 : {
            block2 : {
                o.w(728127303, null);
                o.w(1865176902, null);
                o.w(503863109, null);
                Object object = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt())));
                o.w(1386237234, object);
                Object object2 = AqqI.Gt(object, AqqI.Gt((String)o.k(1386237234), mrFx$WjFM.d("\u9e90")) + true);
                o.w(1386237234, object2);
                if (AqqI.Gt(object2, mrFx$WjFM.d("\u9ec8\u3d98\u7e8e\u3070\ufc6f\u6071\ue965")) != false) break block2;
                if (AqqI.Gt((String)o.k(1386237234), mrFx$WjFM.d("\u9ec8\u3d98\u7e8e\u307f\ufc6f")) == false) break block3;
            }
            o.w(1549684016, true);
        }
    }

    public static String getVersion() {
        Object object = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt())));
        Object object2 = AqqI.Gt(AqqI.Gt(new StringBuilder((String)AqqI.Gt(AqqI.Gt(object, AqqI.Gt(object, 46) + true))), FMkR$WjFM.a("\u01e5")));
        return object2;
    }

    public static void yJLS(LivingEntity livingEntity, boolean bl) {
        try {
            if (AqqI.Gt() != false) {
                livingEntity.setAI(bl);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static Class<?> GjaJ(String string) {
        Object object = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(FMkR$WjFM.a("\uf7d5\u3dd2\uc832\u0594\u0afa\u0e4c\ud8f1\u25b6\ued1d\u0df4\uc902\u15a0\u2c50\u94a0\u6304\u3e78\uab23\u42d6\u3ccd\ufd36\u54ce")), AqqI.getVersion()), string));
        Object object2 = null;
        try {
            object2 = AqqI.Gt(object);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return object2;
    }

    public static Class<?> IFSe(String string) {
        Object object = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u13dd\u56fb\ucd15\u4288\u9206\ufa8d\udbd5\ue028\u6ec1\u6cf2\u856d\ue558\u5164\ua03c\ue055\u3a1f\ucf40\u09bc\uebab\ub0e2\u1e10\ub53c\ud18b")), AqqI.getVersion()), string));
        Object object2 = null;
        try {
            object2 = AqqI.Gt(object);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return object2;
    }

    public static Object IhWD(String string) {
        try {
            return AqqI.Gt(AqqI.Gt((Class)o.k(-1850127166), FMkR$WjFM.a("\uce41"), new Class[]{String.class}), null, new Object[]{string});
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static Field UtIU(Field field) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        AqqI.Gt(field, true);
        Object object = AqqI.Gt(Field.class, nJPf$sILv.G("\u23a7\u9dd7\u36b6\u3564\uee06\u8a05\u7ca2\u1489\u9911"));
        AqqI.Gt(object, true);
        AqqI.Gt(object, field, AqqI.Gt(field) & -17);
        return field;
    }

    public static Method yJLS(Method method) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        AqqI.Gt(method, true);
        return method;
    }

    public static String getBukkitVersion() {
        return AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt()))), 23);
    }

    public static String woNE() {
        return AqqI.Gt(AqqI.Gt(new StringBuilder(FMkR$WjFM.a("\u0418\u2fa8\ua3c5\u07c8\u4647\u6b29\u8cb9\uf3af\u45c8\ue10c\u4e3a\u53ea\ub9fc\u9ca2\u2fd5\u938e\u66b8\u34db\u2847\u8558\ufc52")), AqqI.getBukkitVersion()));
    }

    public static String NgWw() {
        return AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u2d8d\u9a74\u51e3\u7c19\uc55e\udb3fL\ud09b\u9848\u8f20\u4460\uee9d\u7c45\u7ae0\u1f05\u7caf\u1e25\ud97a\uc1a9\u9293\u18db\uc159\ucebd")), AqqI.getBukkitVersion()));
    }

    public static void yJLS(Player player, Entity entity, Entity entity2) {
        try {
            Object object = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder((String)AqqI.Gt(AqqI.NgWw())), mrFx$WjFM.d("\u62e8\uf2af\u011f\u6a85\u2751\ucfcb\u12c4\ua6bc\u5eee\ud200\uf65c\u0e9c\u6b75\u725c\u5799\u6daa\ua2ac\u80a9\u8b46"))));
            Object object2 = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder((String)AqqI.Gt(AqqI.woNE())), mrFx$WjFM.d("\u62e8\uf29a\u0110\u6a92\u2753\ucfda\u12c9\ua6c2\u5ec1\ud213\uf644\u0eb5\u6b74\u7278\u57b6\u6da4\ua2b9\u80a0\u8b51\u5c9d\u710b"))));
            Object object3 = AqqI.Gt(AqqI.Gt(object, mrFx$WjFM.d("\u62a1\uf2af\u0105\u6ab9\u2759\ucfd1\u12d9\ua6fe\u5ec8"), new Class[0]), player, new Object[0]);
            Object[] arrobject = new Object[2];
            arrobject[0] = AqqI.Gt(entity2.getEntityId());
            arrobject[1] = AqqI.Gt(entity.getEntityId());
            Object object4 = AqqI.Gt(AqqI.Gt(object2, new Class[]{(Class)o.k(836130996), (Class)o.k(836130996)}), arrobject);
            Object object5 = AqqI.Gt(AqqI.Gt(AqqI.Gt(object3), mrFx$WjFM.d("\u62b6\uf2a6\u0110\u6a88\u275d\ucfcd\u12fe\ua6fd\u5ec3\ud21c\uf658\u0e99\u6b75\u7265\u579a\u6da5")), object3);
            Class[] arrclass = new Class[1];
            arrclass[0] = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder((String)AqqI.Gt(AqqI.woNE())), mrFx$WjFM.d("\u62e8\uf29a\u0110\u6a92\u2753\ucfda\u12c9"))));
            AqqI.Gt(AqqI.Gt(AqqI.Gt(object5), mrFx$WjFM.d("\u62b5\uf2af\u011f\u6a95\u2768\ucfde\u12de\ua6f9\u5ec8\ud206"), arrclass), object5, new Object[]{object4});
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            AqqI.Gt(exception);
            return;
        }
    }

    public static void yJLS(Player player, Object object) {
        try {
            Object object2 = AqqI.Gt(AqqI.Gt(AqqI.Gt(player), nJPf$sILv.G("\u6dc1\ucfd5\ua8bc\u2aa5\u871b\ub085\u7150\u48d4\uf635"), new Class[0]), player, new Object[0]);
            Object object3 = AqqI.Gt(AqqI.Gt(AqqI.Gt(object2), nJPf$sILv.G("\u6dd6\ucfdc\ua8a9\u2a94\u871f\ub099\u7177\u48d7\uf63e\u444f\ud060\u8860\ue3d8\u1961\u13b3\u6c12")), object2);
            AqqI.Gt(AqqI.Gt(AqqI.Gt(object3), nJPf$sILv.G("\u6dd5\ucfd5\ua8a6\u2a89\u872a\ub08a\u7157\u48d3\uf635\u4455"), new Class[]{AqqI.IVtS(nJPf$sILv.G("\u6df6\ucfd1\ua8ab\u2a86\u871f\ub09f"))}), object3, new Object[]{object});
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            AqqI.Gt(exception);
            return;
        }
    }

    public static Class<?> IVtS(String string) {
        String string2 = ((String[])AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt()))), FMkR$WjFM.a("\u7a26\u4b4a")))[3];
        try {
            return AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(FMkR$WjFM.a("\u7a14\u4b01\ud562\u0ab0\u7619\u3caa\ud6a4\u0fae\u5b07\u486b\u1b27\ud51a\u26a4\u7858\ub7e3\ua49a\u1f80\uaea0\u39c0\u8d03\u3df1")), string2), FMkR$WjFM.a("\u7a54")), string)));
        }
        catch (ClassNotFoundException classNotFoundException) {
            ClassNotFoundException classNotFoundException2 = classNotFoundException;
            AqqI.Gt(classNotFoundException);
            return null;
        }
    }

    public static void yJLS(Player player, Integer n, Integer n2, Integer n3, String object, String object2) {
        try {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            if (o.k(728127303) == null) {
                o.w(728127303, AqqI.Gt(AqqI.Gt(((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9"))))[0], mrFx$WjFM.d("\u6292\uf283\u013c\u6ab4\u276b")), null));
            }
            if (o.k(1865176902) == null) {
                o.w(1865176902, AqqI.Gt(AqqI.Gt(((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9"))))[0], mrFx$WjFM.d("\u6292\uf283\u0125\u6abd\u277d")), null));
            }
            if (o.k(503863109) == null) {
                o.w(503863109, AqqI.Gt(AqqI.Gt(((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9"))))[0], mrFx$WjFM.d("\u6295\uf29f\u0133\u6aa5\u2771\ucfeb\u12f1\ua6d7")), null));
            }
            if (object != null) {
                object = AqqI.Gt(38, object);
                object = AqqI.Gt(object, mrFx$WjFM.d("\u62e3\uf2ba\u011d\u6a90\u2741\ucfda\u12cf\ua6b7"), player.getDisplayName());
                object3 = o.k(728127303);
                Object[] arrobject = new Object[1];
                arrobject[0] = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62bd\uf2e8\u0105\u6a94\u2740\ucfcb\u129f\ua6a8\u5e8f")), object), mrFx$WjFM.d("\u62e4\uf2b7")));
                object6 = AqqI.Gt(AqqI.Gt(((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u628f\uf289\u0119\u6a90\u274c\ucffd\u12dc\ua6e1\u5ec8\ud231\uf652\u0e97\u6b71\u7263\u579b\u6dae\ua2bb\u80b8"))))[0], mrFx$WjFM.d("\u62a7"), new Class[]{String.class}), null, arrobject);
                Class[] arrclass = new Class[5];
                arrclass[0] = ((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9"))))[0];
                arrclass[1] = AqqI.IVtS(mrFx$WjFM.d("\u628f\uf289\u0119\u6a90\u274c\ucffd\u12dc\ua6e1\u5ec8\ud231\uf652\u0e97\u6b71\u7263\u579b\u6dae\ua2bb\u80b8"));
                arrclass[2] = (Class)o.k(836130996);
                arrclass[3] = (Class)o.k(836130996);
                arrclass[4] = (Class)o.k(836130996);
                object5 = AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9")), arrclass);
                object4 = AqqI.Gt(object5, new Object[]{object3, object6, n, n2, n3});
                AqqI.yJLS(player, object4);
                object3 = o.k(1865176902);
                Object[] arrobject2 = new Object[1];
                arrobject2[0] = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62bd\uf2e8\u0105\u6a94\u2740\ucfcb\u129f\ua6a8\u5e8f")), object), mrFx$WjFM.d("\u62e4\uf2b7")));
                object6 = AqqI.Gt(AqqI.Gt(((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u628f\uf289\u0119\u6a90\u274c\ucffd\u12dc\ua6e1\u5ec8\ud231\uf652\u0e97\u6b71\u7263\u579b\u6dae\ua2bb\u80b8"))))[0], mrFx$WjFM.d("\u62a7"), new Class[]{String.class}), null, arrobject2);
                Class[] arrclass2 = new Class[2];
                arrclass2[0] = ((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9"))))[0];
                arrclass2[1] = AqqI.IVtS(mrFx$WjFM.d("\u628f\uf289\u0119\u6a90\u274c\ucffd\u12dc\ua6e1\u5ec8\ud231\uf652\u0e97\u6b71\u7263\u579b\u6dae\ua2bb\u80b8"));
                object5 = AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9")), arrclass2);
                object4 = AqqI.Gt(object5, new Object[]{object3, object6});
                AqqI.yJLS(player, object4);
            }
            if (object2 != null) {
                object2 = AqqI.Gt(38, object2);
                object2 = AqqI.Gt(object2, mrFx$WjFM.d("\u62e3\uf2ba\u011d\u6a90\u2741\ucfda\u12cf\ua6b7"), player.getDisplayName());
                object3 = o.k(728127303);
                Object[] arrobject = new Object[1];
                arrobject[0] = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62bd\uf2e8\u0105\u6a94\u2740\ucfcb\u129f\ua6a8\u5e8f")), object), mrFx$WjFM.d("\u62e4\uf2b7")));
                object6 = AqqI.Gt(AqqI.Gt(((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u628f\uf289\u0119\u6a90\u274c\ucffd\u12dc\ua6e1\u5ec8\ud231\uf652\u0e97\u6b71\u7263\u579b\u6dae\ua2bb\u80b8"))))[0], mrFx$WjFM.d("\u62a7"), new Class[]{String.class}), null, arrobject);
                Class[] arrclass = new Class[5];
                arrclass[0] = ((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9"))))[0];
                arrclass[1] = AqqI.IVtS(mrFx$WjFM.d("\u628f\uf289\u0119\u6a90\u274c\ucffd\u12dc\ua6e1\u5ec8\ud231\uf652\u0e97\u6b71\u7263\u579b\u6dae\ua2bb\u80b8"));
                arrclass[2] = (Class)o.k(836130996);
                arrclass[3] = (Class)o.k(836130996);
                arrclass[4] = (Class)o.k(836130996);
                object5 = AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9")), arrclass);
                object4 = AqqI.Gt(object5, new Object[]{object3, object6, n, n2, n3});
                AqqI.yJLS(player, object4);
                object3 = o.k(503863109);
                Object[] arrobject3 = new Object[1];
                arrobject3[0] = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62bd\uf2e8\u0105\u6a94\u2740\ucfcb\u129f\ua6a8\u5e8f")), object2), mrFx$WjFM.d("\u62e4\uf2b7")));
                object6 = AqqI.Gt(AqqI.Gt(((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u628f\uf289\u0119\u6a90\u274c\ucffd\u12dc\ua6e1\u5ec8\ud231\uf652\u0e97\u6b71\u7263\u579b\u6dae\ua2bb\u80b8"))))[0], mrFx$WjFM.d("\u62a7"), new Class[]{String.class}), null, arrobject3);
                Class[] arrclass3 = new Class[5];
                arrclass3[0] = ((Class[])AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9"))))[0];
                arrclass3[1] = AqqI.IVtS(mrFx$WjFM.d("\u628f\uf289\u0119\u6a90\u274c\ucffd\u12dc\ua6e1\u5ec8\ud231\uf652\u0e97\u6b71\u7263\u579b\u6dae\ua2bb\u80b8"));
                arrclass3[2] = (Class)o.k(836130996);
                arrclass3[3] = (Class)o.k(836130996);
                arrclass3[4] = (Class)o.k(836130996);
                object5 = AqqI.Gt(AqqI.IVtS(mrFx$WjFM.d("\u6296\uf2ab\u0112\u6a9a\u275d\ucfcb\u12ed\ua6fe\u5ecc\ud20b\uf672\u0e8f\u6b75\u7258\u579c\u6dbf\ua2b9\u80a9")), arrclass3);
                object4 = AqqI.Gt(object5, new Object[]{object3, object6, n, n2, n3});
                AqqI.yJLS(player, object4);
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            AqqI.Gt(exception);
        }
    }

    public static void IEpg(Player player) {
        AqqI.yJLS(player, (Integer)AqqI.Gt(false), (Integer)AqqI.Gt(false), (Integer)AqqI.Gt(false), "", "");
    }

    public static void UtIU(Player player, String object, String object2) {
        if (object == null) {
            object = "";
        }
        object = AqqI.Gt(38, object);
        if (object2 == null) {
            object2 = "";
        }
        object2 = AqqI.Gt(38, object2);
        object = AqqI.Gt(object, FMkR$WjFM.a("\uf122\u39c9\u5329\ub81f\u9c92\u4e66\u6295\u72f2"), player.getDisplayName());
        object2 = AqqI.Gt(object2, FMkR$WjFM.a("\uf122\u39c9\u5329\ub81f\u9c92\u4e66\u6295\u72f2"), player.getDisplayName());
        try {
            Object[] arrobject = new Object[1];
            arrobject[0] = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(FMkR$WjFM.a("\uf17c\u399b\u5331\ub81b\u9c93\u4e77\u62c5\u72ed\ueb7d")), object), FMkR$WjFM.a("\uf125\u39c4")));
            Object object3 = AqqI.Gt(AqqI.Gt(((Class[])AqqI.Gt(AqqI.IVtS(FMkR$WjFM.a("\uf14e\u39fa\u532d\ub81f\u9c9f\u4e41\u6286\u72a4\ueb3a\u4975\ua7da\ub110\uedd0\uc370\udcad\u829a\uf3f0\u736f"))))[0], FMkR$WjFM.a("\uf166"), new Class[]{String.class}), null, arrobject);
            Object[] arrobject2 = new Object[1];
            arrobject2[0] = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(FMkR$WjFM.a("\uf17c\u399b\u5331\ub81b\u9c93\u4e77\u62c5\u72ed\ueb7d")), object2), FMkR$WjFM.a("\uf125\u39c4")));
            Object object4 = AqqI.Gt(AqqI.Gt(((Class[])AqqI.Gt(AqqI.IVtS(FMkR$WjFM.a("\uf14e\u39fa\u532d\ub81f\u9c9f\u4e41\u6286\u72a4\ueb3a\u4975\ua7da\ub110\uedd0\uc370\udcad\u829a\uf3f0\u736f"))))[0], FMkR$WjFM.a("\uf166"), new Class[]{String.class}), null, arrobject2);
            Object object5 = AqqI.Gt(AqqI.IVtS(FMkR$WjFM.a("\uf157\u39d8\u5326\ub815\u9c8e\u4e77\u62b7\u72bb\ueb3e\u494f\ua7fa\ub108\uedd4\uc34f\udcaf\u829e\uf3e7\u737e\u85a8\uc2b2\u4c40\ufa1d\u194c\uffc5\u58f7\ub2af\ub231\u52f9\u713e\u61e9\ucb6c\u771d\u272b\u18b9\u9220")), new Class[]{AqqI.IVtS(FMkR$WjFM.a("\uf14e\u39fa\u532d\ub81f\u9c9f\u4e41\u6286\u72a4\ueb3a\u4975\ua7da\ub110\uedd0\uc370\udcad\u829a\uf3f0\u736f"))});
            Object object6 = AqqI.Gt(object5, new Object[]{object3});
            Object object7 = AqqI.Gt(AqqI.Gt(object6), FMkR$WjFM.a("\uf165"));
            AqqI.Gt(object7, true);
            AqqI.Gt(object7, object6, object4);
            AqqI.yJLS(player, object6);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            AqqI.Gt(exception);
            return;
        }
    }

    public static void yJLS(Player player, String string) {
        if (AqqI.Gt() == false) {
            return;
        }
        try {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5 = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62a9\uf2b8\u0116\u6adf\u275a\ucfca\u12d6\ua6f9\u5ec4\ud206\uf613\u0e99\u6b73\u726d\u5793\u6dbf\ua2b7\u80b9\u8b5f\u5c95\u7116\ubd90\u6416")), (String)o.k(1386237234)), mrFx$WjFM.d("\u62e8\uf2af\u011f\u6a85\u2751\ucfcb\u12c4\ua6bc\u5eee\ud200\uf65c\u0e9c\u6b75\u725c\u5799\u6daa\ua2ac\u80a9\u8b46"))));
            Object object6 = AqqI.Gt(object5, player);
            Object object7 = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62a8\uf2af\u0105\u6adf\u2755\ucfd6\u12d3\ua6f7\u5ece\ud200\uf65c\u0e9c\u6b75\u7222\u5786\u6dae\ua2a7\u80ba\u8b51\u5c8c\u7151")), (String)o.k(1386237234)), mrFx$WjFM.d("\u62e8\uf29a\u0110\u6a92\u2753\ucfda\u12c9\ua6c2\u5ec1\ud213\uf644\u0eb5\u6b74\u7278\u57b6\u6da3\ua2b4\u80b8"))));
            Object object8 = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62a8\uf2af\u0105\u6adf\u2755\ucfd6\u12d3\ua6f7\u5ece\ud200\uf65c\u0e9c\u6b75\u7222\u5786\u6dae\ua2a7\u80ba\u8b51\u5c8c\u7151")), (String)o.k(1386237234)), mrFx$WjFM.d("\u62e8\uf29a\u0110\u6a92\u2753\ucfda\u12c9"))));
            if (((Boolean)o.k(1549684016)).booleanValue()) {
                Object object9 = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62a8\uf2af\u0105\u6adf\u2755\ucfd6\u12d3\ua6f7\u5ece\ud200\uf65c\u0e9c\u6b75\u7222\u5786\u6dae\ua2a7\u80ba\u8b51\u5c8c\u7151")), (String)o.k(1386237234)), mrFx$WjFM.d("\u62e8\uf289\u0119\u6a90\u274c\ucfec\u12d8\ua6e0\u5ec4\ud213\uf651\u0e93\u6b7b\u7269\u5787"))));
                Object object10 = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62a8\uf2af\u0105\u6adf\u2755\ucfd6\u12d3\ua6f7\u5ece\ud200\uf65c\u0e9c\u6b75\u7222\u5786\u6dae\ua2a7\u80ba\u8b51\u5c8c\u7151")), (String)o.k(1386237234)), mrFx$WjFM.d("\u62e8\uf283\u0132\u6a99\u2759\ucfcb\u12ff\ua6f3\u5ede\ud217\uf67e\u0e95\u6b6c\u727c\u579a\u6da5\ua2b0\u80a2\u8b40"))));
                object = AqqI.Gt(object9, mrFx$WjFM.d("\u62a7"), new Class[]{String.class});
                Object[] arrobject = new Object[1];
                arrobject[0] = AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62bd\uf2e8\u0105\u6a94\u2740\ucfcb\u129f\ua6a8\u5e8d\ud250")), string), mrFx$WjFM.d("\u62e4\uf2b7")));
                object3 = AqqI.Gt(object10, AqqI.Gt(object, object9, arrobject));
                Object[] arrobject2 = new Object[2];
                arrobject2[0] = object3;
                arrobject2[1] = AqqI.Gt(2);
                object4 = AqqI.Gt(AqqI.Gt(object7, new Class[]{object10, (Class)o.k(858869048)}), arrobject2);
            } else {
                Object object11 = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62a8\uf2af\u0105\u6adf\u2755\ucfd6\u12d3\ua6f7\u5ece\ud200\uf65c\u0e9c\u6b75\u7222\u5786\u6dae\ua2a7\u80ba\u8b51\u5c8c\u7151")), (String)o.k(1386237234)), mrFx$WjFM.d("\u62e8\uf289\u0119\u6a90\u274c\ucffc\u12d2\ua6ff\u5edd\ud21d\uf653\u0e9f\u6b6f\u7278\u57a1\u6dae\ua2ad\u80b8"))));
                Object object12 = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62a8\uf2af\u0105\u6adf\u2755\ucfd6\u12d3\ua6f7\u5ece\ud200\uf65c\u0e9c\u6b75\u7222\u5786\u6dae\ua2a7\u80ba\u8b51\u5c8c\u7151")), (String)o.k(1386237234)), mrFx$WjFM.d("\u62e8\uf283\u0132\u6a99\u2759\ucfcb\u12ff\ua6f3\u5ede\ud217\uf67e\u0e95\u6b6c\u727c\u579a\u6da5\ua2b0\u80a2\u8b40"))));
                object = AqqI.Gt(AqqI.Gt(object11, new Class[]{String.class}), new Object[]{string});
                if (AqqI.Gt(AqqI.Gt(), (QWNe)((Object)o.k(545213749))) != false) {
                    object3 = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(mrFx$WjFM.d("\u62a8\uf2af\u0105\u6adf\u2755\ucfd6\u12d3\ua6f7\u5ece\ud200\uf65c\u0e9c\u6b75\u7222\u5786\u6dae\ua2a7\u80ba\u8b51\u5c8c\u7151")), (String)o.k(1386237234)), mrFx$WjFM.d("\u62e8\uf289\u0119\u6a90\u274c\ucff2\u12d8\ua6e1\u5ede\ud213\uf65a\u0e9f\u6b55\u7275\u5785\u6dae"))));
                    object2 = AqqI.Gt(AqqI.Gt(object3, mrFx$WjFM.d("\u62b0\uf2ab\u011d\u6a84\u275d\ucff0\u12db"), new Class[]{String.class}), null, new Object[]{mrFx$WjFM.d("\u6281\uf28b\u013c\u6ab4\u2767\ucff6\u12f3\ua6d4\u5ee2")});
                    object4 = AqqI.Gt(AqqI.Gt(object7, new Class[]{object12, object3}), new Object[]{object, object2});
                } else {
                    Object[] arrobject = new Object[2];
                    arrobject[0] = object;
                    arrobject[1] = AqqI.Gt(2);
                    object4 = AqqI.Gt(AqqI.Gt(object7, new Class[]{object12, (Class)o.k(858869048)}), arrobject);
                }
            }
            object = AqqI.Gt(object5, mrFx$WjFM.d("\u62a1\uf2af\u0105\u6ab9\u2759\ucfd1\u12d9\ua6fe\u5ec8"), new Class[0]);
            object3 = AqqI.Gt(object, object6, new Object[0]);
            object2 = AqqI.Gt(AqqI.Gt(object3), mrFx$WjFM.d("\u62b6\uf2a6\u0110\u6a88\u275d\ucfcd\u12fe\ua6fd\u5ec3\ud21c\uf658\u0e99\u6b75\u7265\u579a\u6da5"));
            Object object13 = AqqI.Gt(object2, object3);
            Object object14 = AqqI.Gt(AqqI.Gt(object13), mrFx$WjFM.d("\u62b5\uf2af\u011f\u6a95\u2768\ucfde\u12de\ua6f9\u5ec8\ud206"), new Class[]{object8});
            AqqI.Gt(object14, object13, new Object[]{object4});
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            AqqI.Gt(exception);
            return;
        }
    }

    public static void yJLS(Player player, String string, int n) {
        AqqI.yJLS(player, string);
        if (n >= 0) {
            AqqI.Gt(new AqqI$1(player), (Plugin)((AqqI)o.k(-1481028301)), n + 1);
        }
        while (n > 60) {
            int n2 = (n -= 60) % 60;
            AqqI.Gt(new AqqI$2(player, string), (Plugin)((AqqI)o.k(-1481028301)), n2);
        }
    }

    public static void FMkR(String string) {
        AqqI.KTiK(string, -1);
    }

    public static void KTiK(String string, int n) {
        Iterator iterator = AqqI.Gt().iterator();
        while (iterator.hasNext()) {
            Player player = (Player)iterator.next();
            AqqI.yJLS(player, string, n);
        }
    }

    public static String HeSD(Entity entity) {
        if (AqqI.Gt() == false) {
            return null;
        }
        return entity.getCustomName();
    }

    public static int PKGC(Player player) {
        try {
            Object object = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt()))), 23);
            Object object2 = AqqI.Gt(AqqI.Gt(AqqI.Gt(AqqI.Gt(new StringBuilder(FMkR$WjFM.a("\ub4ca\u5bea\u18d8\u505f\ua9e4\u8fa6\u3075\uc71b\u4fbd\ud097\u3157\ud8a4\uea9e\u6893\u64a8\u0284\u4e3a\u4f33\uc4e8\uf96d\u8663\u9cb4\u91db")), object), FMkR$WjFM.a("\ub48b\u5bfd\u18d1\u5005\ua9ef\u8fa7\u3067\uc75e\u4f97\ud091\u3118\ud8a1\uea98\u68a2\u64a2\u0291\u4e21\u4f23\uc4f1"))));
            Object object3 = AqqI.Gt(AqqI.Gt(object2, FMkR$WjFM.a("\ub4c2\u5bfd\u18cb\u5039\ua9e7\u8fbd\u307a\uc71c\u4fb1"), new Class[0]), player, new Object[0]);
            Integer n = (Integer)AqqI.Gt(AqqI.Gt(AqqI.Gt(object3), FMkR$WjFM.a("\ub4d5\u5bf1\u18d1\u5016")), object3);
            return (int)AqqI.Gt(n);
        }
        catch (Exception exception) {
            return -1;
        }
    }

    private static Object Gt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

