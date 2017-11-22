/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class AOcy {
    public static final Character oonj;
    public static final Character Euvn;
    public static final Character kdCe;
    public static final Character PeVM;
    public static final Character Knwa;
    public static final Character HCkc;
    public static final Character UIpl;
    public static final Character lMRy;
    public static final Character rNdV;

    public static String escape(String string) {
        StringBuilder stringBuilder = new StringBuilder((int)AOcy.cZ(string));
        Object object = AOcy.cZ(string);
        block7 : for (int i = 0; i < object; ++i) {
            Object object2 = AOcy.cZ(string, i);
            switch (object2) {
                case 38: {
                    AOcy.cZ(stringBuilder, YEBy$TyVf.W("\u475f\ud4a0\ud2f4\u3050\u93cb"));
                    continue block7;
                }
                case 60: {
                    AOcy.cZ(stringBuilder, YEBy$TyVf.W("\u475f\ud4ad\ud2ed\u301b"));
                    continue block7;
                }
                case 62: {
                    AOcy.cZ(stringBuilder, YEBy$TyVf.W("\u475f\ud4a6\ud2ed\u301b"));
                    continue block7;
                }
                case 34: {
                    AOcy.cZ(stringBuilder, YEBy$TyVf.W("\u475f\ud4b0\ud2ec\u304f\u9384\u6b3c"));
                    continue block7;
                }
                case 39: {
                    AOcy.cZ(stringBuilder, YEBy$TyVf.W("\u475f\ud4a0\ud2e9\u304f\u9383\u6b3c"));
                    continue block7;
                }
                default: {
                    AOcy.cZ(stringBuilder, object2);
                }
            }
        }
        return AOcy.cZ(stringBuilder);
    }

    public static void nImU(String string) throws TOKE {
        Object object = AOcy.cZ(string);
        if (object == false) {
            throw new TOKE(rgig$AWxc.r("\u43b6\u80ef\u03dd\u2a58\u4cc7\udf7b\uc1c5\u9cf3\uecf6\ue531\ue6d5\u6b8f\ued6e"));
        }
        for (int i = 0; i < object; ++i) {
            if (AOcy.cZ(AOcy.cZ(string, i)) == false) continue;
            throw new TOKE((String)AOcy.cZ(AOcy.cZ(AOcy.cZ(new StringBuilder(rgig$AWxc.r("\u43d4")), string), rgig$AWxc.r("\u43d4\u80a2\u03ce\u2a43\u4cd0\udf2f\uc1d7\u9cee\uecea\ue52b\ue69b\u6b89\ued60\u9567\u1670\uf107\u06ea\ucd1c\u23aa\u5bd6\u6ae2\u1092\ub8f6\uba4b\u69b6\uf6b5\ueec7\u2418\u4cc6"))));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean ssNb(GkIA gkIA, vslr vslr2, String string) throws TOKE {
        String string2;
        vslr vslr3 = null;
        Object object = AOcy.cZ(gkIA);
        if (object != (Character)cv.e(1168177361)) {
            if (object == (Character)cv.e(-1596458785)) {
                AOcy.cZ(gkIA, KUXS$dwji.S("\u54c5\uad7f"));
                return false;
            }
            if (object == (Character)cv.e(-588646185)) {
                object = AOcy.cZ(gkIA);
                if (string == null) {
                    throw AOcy.cZ(gkIA, AOcy.cZ(AOcy.cZ(new StringBuilder(KUXS$dwji.S("\u54b7\uad28\uca96\u6c07\u42bd\ua9fb\u8119\ue4a0\u7493\ua7f2\ud3d0\u94ef\ub83d\u153f\u5f3e\ufea6\ub96b\ucf6e\ua0ce\u8797\udd5c")), object)));
                }
                if (AOcy.cZ(object, string) == false) {
                    throw AOcy.cZ(gkIA, AOcy.cZ(AOcy.cZ(AOcy.cZ(AOcy.cZ(new StringBuilder(KUXS$dwji.S("\u54b7\uad28\uca96\u6c07\u42bd\ua9fb\u8119\ue4a0\u7493\ua7f2\ud3d0")), string), KUXS$dwji.S("\u54da\uad20\uca8b\u6c0e\u42fc")), object)));
                }
                if (AOcy.cZ(gkIA) == (Character)cv.e(-2091321130)) return true;
                throw AOcy.cZ(gkIA, KUXS$dwji.S("\u54b7\uad28\uca96\u6c19\u42b4\ua9ee\u810a\ue4ad\u7492\ua7b6\ud393\u94e0\ub83e\u1523\u5f28\ufee3\ub93f\ucf7b\ua0c8"));
            }
            if (object instanceof Character) {
                throw AOcy.cZ(gkIA, KUXS$dwji.S("\u54b7\uad28\uca96\u6c19\u42b4\ua9ee\u810a\ue4ad\u7492\ua7b6\ud384\u94ed\ub836"));
            }
        } else {
            Object object2 = AOcy.cZ(gkIA);
            if (object2 == 45) {
                if (AOcy.cZ(gkIA) == 45) {
                    AOcy.cZ(gkIA, KUXS$dwji.S("\u54d7\uad6c\ucadb"));
                    return false;
                }
                AOcy.cZ(gkIA);
            } else if (object2 == 91) {
                object = AOcy.cZ(gkIA);
                if (AOcy.cZ(KUXS$dwji.S("\u54b9\uad05\ucaa4\u6c3e\u429d"), object) == false) throw AOcy.cZ(gkIA, KUXS$dwji.S("\u54bf\uad39\uca95\u6c0f\u42bf\ua9fb\u811f\ue4ac\u74d6\ua7b1\ud3b3\u94c8\ub810\u1504\u5f0c\ufe98\ub96c"));
                if (AOcy.cZ(gkIA) != 91) throw AOcy.cZ(gkIA, KUXS$dwji.S("\u54bf\uad39\uca95\u6c0f\u42bf\ua9fb\u811f\ue4ac\u74d6\ua7b1\ud3b3\u94c8\ub810\u1504\u5f0c\ufe98\ub96c"));
                Object object3 = AOcy.cZ(gkIA);
                if (AOcy.cZ(object3) <= 0) return false;
                AOcy.cZ(vslr2, KUXS$dwji.S("\u5499\uad2e\uca8b\u6c1e\u42b9\ua9e1\u810e"), object3);
                return false;
            }
            int n = 1;
            do {
                if ((object = AOcy.cZ(gkIA)) == null) {
                    throw AOcy.cZ(gkIA, KUXS$dwji.S("\u54b7\uad28\uca96\u6c19\u42b5\ua9e1\u811d\ue4e8\u74d1\ua7a8\ud3d7\u94ac\ub830\u1536\u5f39\ufea6\ub939\ucf3a\ua088\u87cc\udd5d\u286d\u5600"));
                }
                if (object == (Character)cv.e(-490538795)) {
                    ++n;
                    continue;
                }
                if (object != (Character)cv.e(-2091321130)) continue;
                --n;
            } while (n > 0);
            return false;
        }
        String string3 = (String)object;
        object = null;
        vslr3 = new vslr();
        do {
            if (object == null) {
                object = AOcy.cZ(gkIA);
            }
            if (!(object instanceof String)) break;
            string2 = (String)object;
            object = AOcy.cZ(gkIA);
            if (object == (Character)cv.e(1041299678)) {
                object = AOcy.cZ(gkIA);
                if (!(object instanceof String)) {
                    throw AOcy.cZ(gkIA, KUXS$dwji.S("\u54b7\uad28\uca96\u6c19\u42b5\ua9e1\u811d\ue4e8\u7480\ua7f7\ud39c\u94f9\ub834"));
                }
                AOcy.cZ(vslr3, string2, AOcy.stringToValue((String)object));
                object = null;
                continue;
            }
            AOcy.cZ(vslr3, string2, "");
        } while (true);
        if (object == (Character)cv.e(-588646185)) {
            if (AOcy.cZ(gkIA) != (Character)cv.e(-2091321130)) {
                throw AOcy.cZ(gkIA, KUXS$dwji.S("\u54b7\uad28\uca96\u6c19\u42b4\ua9ee\u810a\ue4ad\u7492\ua7b6\ud384\u94ed\ub836"));
            }
            if (AOcy.cZ(vslr3) > 0) {
                AOcy.cZ(vslr2, string3, vslr3);
                return false;
            }
            AOcy.cZ(vslr2, string3, "");
            return false;
        }
        if (object != (Character)cv.e(-2091321130)) throw AOcy.cZ(gkIA, KUXS$dwji.S("\u54b7\uad28\uca96\u6c19\u42b4\ua9ee\u810a\ue4ad\u7492\ua7b6\ud384\u94ed\ub836"));
        do {
            if ((object = AOcy.cZ(gkIA)) == null) {
                if (string3 == null) return false;
                throw AOcy.cZ(gkIA, AOcy.cZ(AOcy.cZ(new StringBuilder(KUXS$dwji.S("\u54af\uad2f\uca86\u6c06\u42b3\ua9fc\u811f\ue4ac\u74d6\ua7e2\ud391\u94eb\ub871")), string3)));
            }
            if (object instanceof String) {
                string2 = (String)object;
                if (AOcy.cZ(string2) <= 0) continue;
                AOcy.cZ(vslr3, KUXS$dwji.S("\u5499\uad2e\uca8b\u6c1e\u42b9\ua9e1\u810e"), AOcy.stringToValue(string2));
                continue;
            }
            if (object == (Character)cv.e(-490538795) && AOcy.ssNb(gkIA, vslr3, string3)) break;
        } while (true);
        if (AOcy.cZ(vslr3) == false) {
            AOcy.cZ(vslr2, string3, "");
            return false;
        }
        if (AOcy.cZ(vslr3) == true) {
            if (AOcy.cZ(vslr3, KUXS$dwji.S("\u5499\uad2e\uca8b\u6c1e\u42b9\ua9e1\u810e")) != null) {
                AOcy.cZ(vslr2, string3, AOcy.cZ(vslr3, KUXS$dwji.S("\u5499\uad2e\uca8b\u6c1e\u42b9\ua9e1\u810e")));
                return false;
            }
        }
        AOcy.cZ(vslr2, string3, vslr3);
        return false;
    }

    public static Object stringToValue(String string) {
        if (AOcy.cZ(YEBy$TyVf.W("\u6161\u8bd5\u9827\u73bf"), string) != false) {
            return (Boolean)cv.e(-811926723);
        }
        if (AOcy.cZ(YEBy$TyVf.W("\u6173\u8bc6\u983e\u73a9\u3039"), string) != false) {
            return (Boolean)cv.e(-1234961614);
        }
        if (AOcy.cZ(YEBy$TyVf.W("\u617b\u8bd2\u983e\u73b6"), string) != false) {
            return cv.e(-335152310);
        }
        try {
            Object object = AOcy.cZ(string, false);
            if (object == 45 || object >= 48 && object <= 57) {
                Long l = new Long(string);
                if (AOcy.cZ(AOcy.cZ(l), string) != false) {
                    return l;
                }
            }
        }
        catch (Exception exception) {
            try {
                Double d = new Double(string);
                if (AOcy.cZ(AOcy.cZ(d), string) != false) {
                    return d;
                }
            }
            catch (Exception exception2) {
                // empty catch block
            }
        }
        return string;
    }

    public static vslr vtFs(String string) throws TOKE {
        vslr vslr2 = new vslr();
        GkIA gkIA = new GkIA(string);
        do {
            if (AOcy.cZ(gkIA) == false) break;
            if (AOcy.cZ(gkIA, YEBy$TyVf.W("\u2703")) == false) break;
            AOcy.ssNb(gkIA, vslr2, null);
        } while (true);
        return vslr2;
    }

    public static String toString(Object object) throws TOKE {
        return AOcy.toString(object, null);
    }

    public static String toString(Object object, String string) throws TOKE {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        if (object instanceof vslr) {
            if (string != null) {
                AOcy.cZ(stringBuilder, 60);
                AOcy.cZ(stringBuilder, string);
                AOcy.cZ(stringBuilder, 62);
            }
            vslr vslr2 = (vslr)object;
            Object object2 = AOcy.cZ(vslr2);
            while (object2.hasNext()) {
                int n;
                Object object3;
                HdyI hdyI;
                String string3 = (String)object2.next();
                Object object4 = AOcy.cZ(vslr2, string3);
                if (object4 == null) {
                    object4 = "";
                }
                String string4 = object4 instanceof String ? (String)object4 : null;
                if (AOcy.cZ(rgig$AWxc.r("\u5b22\ube91\u1e15\u5f1c\ua4f7\ubdd3\u64f6"), string3) != false) {
                    if (object4 instanceof HdyI) {
                        hdyI = (HdyI)object4;
                        object3 = AOcy.cZ(hdyI);
                        for (n = 0; n < object3; ++n) {
                            if (n > 0) {
                                AOcy.cZ(stringBuilder, 10);
                            }
                            AOcy.cZ(stringBuilder, AOcy.escape((String)AOcy.cZ(AOcy.cZ(hdyI, n))));
                        }
                        continue;
                    }
                    AOcy.cZ(stringBuilder, AOcy.escape((String)AOcy.cZ(object4)));
                    continue;
                }
                if (object4 instanceof HdyI) {
                    hdyI = (HdyI)object4;
                    object3 = AOcy.cZ(hdyI);
                    for (n = 0; n < object3; ++n) {
                        object4 = AOcy.cZ(hdyI, n);
                        if (object4 instanceof HdyI) {
                            AOcy.cZ(stringBuilder, 60);
                            AOcy.cZ(stringBuilder, string3);
                            AOcy.cZ(stringBuilder, 62);
                            AOcy.cZ(stringBuilder, AOcy.toString(object4));
                            AOcy.cZ(stringBuilder, rgig$AWxc.r("\u5b7d\ubed1"));
                            AOcy.cZ(stringBuilder, string3);
                            AOcy.cZ(stringBuilder, 62);
                            continue;
                        }
                        AOcy.cZ(stringBuilder, AOcy.toString(object4, string3));
                    }
                    continue;
                }
                if (AOcy.cZ("", object4) != false) {
                    AOcy.cZ(stringBuilder, 60);
                    AOcy.cZ(stringBuilder, string3);
                    AOcy.cZ(stringBuilder, rgig$AWxc.r("\u5b6e\ubec0"));
                    continue;
                }
                AOcy.cZ(stringBuilder, AOcy.toString(object4, string3));
            }
            if (string != null) {
                AOcy.cZ(stringBuilder, rgig$AWxc.r("\u5b7d\ubed1"));
                AOcy.cZ(stringBuilder, string);
                AOcy.cZ(stringBuilder, 62);
            }
            return AOcy.cZ(stringBuilder);
        }
        if (AOcy.cZ(AOcy.cZ(object)) != false) {
            object = new HdyI(object);
        }
        if (object instanceof HdyI) {
            HdyI hdyI = (HdyI)object;
            Object object5 = AOcy.cZ(hdyI);
            for (int i = 0; i < object5; ++i) {
                AOcy.cZ(stringBuilder, AOcy.toString(AOcy.cZ(hdyI, i), string == null ? rgig$AWxc.r("\u5b20\ube8c\u1e09\u5f09\ua4eb") : string));
            }
            return AOcy.cZ(stringBuilder);
        }
        String string5 = object == null ? rgig$AWxc.r("\u5b2f\ube8b\u1e17\u5f04") : (string2 = AOcy.escape((String)AOcy.cZ(object)));
        if (string == null) {
            return AOcy.cZ(AOcy.cZ(AOcy.cZ(new StringBuilder(rgig$AWxc.r("\u5b63")), string2), rgig$AWxc.r("\u5b63")));
        }
        if (AOcy.cZ(string2) == false) {
            return AOcy.cZ(AOcy.cZ(AOcy.cZ(new StringBuilder(rgig$AWxc.r("\u5b7d")), string), rgig$AWxc.r("\u5b6e\ubec0")));
        }
        return AOcy.cZ(AOcy.cZ(AOcy.cZ(AOcy.cZ(AOcy.cZ(AOcy.cZ(AOcy.cZ(new StringBuilder(rgig$AWxc.r("\u5b7d")), string), rgig$AWxc.r("\u5b7f")), string2), rgig$AWxc.r("\u5b7d\ubed1")), string), rgig$AWxc.r("\u5b7f")));
    }

    static {
        cv.V(-291898989, AOcy.cZ(38));
        cv.V(1183119762, AOcy.cZ(39));
        cv.V(1168177361, AOcy.cZ(33));
        cv.V(1041299678, AOcy.cZ(61));
        cv.V(-2091321130, AOcy.cZ(62));
        cv.V(-490538795, AOcy.cZ(60));
        cv.V(-1596458785, AOcy.cZ(63));
        cv.V(592837021, AOcy.cZ(34));
        cv.V(-588646185, AOcy.cZ(47));
    }

    private static Object cZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

