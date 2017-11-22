/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class DsJQ$DYFV
extends Enum<DsJQ$DYFV> {
    public static final /* enum */ DsJQ$DYFV hldv;
    public static final /* enum */ DsJQ$DYFV KWQJ;
    public static final /* enum */ DsJQ$DYFV KxsJ;
    public static final /* enum */ DsJQ$DYFV gaQn;
    public static final /* enum */ DsJQ$DYFV QOqA;
    public static final /* enum */ DsJQ$DYFV GdVb;
    public static final /* enum */ DsJQ$DYFV htub;
    public static final /* enum */ DsJQ$DYFV WQah;
    public static final /* enum */ DsJQ$DYFV FGaJ;
    public static final /* enum */ DsJQ$DYFV THXq;
    public static final /* enum */ DsJQ$DYFV ARFJ;
    public static final /* enum */ DsJQ$DYFV GSTt;
    public static final /* enum */ DsJQ$DYFV agpJ;
    public static final /* enum */ DsJQ$DYFV EgBO;
    public static final /* enum */ DsJQ$DYFV yvep;
    public static final /* enum */ DsJQ$DYFV kvNf;
    public static final /* enum */ DsJQ$DYFV WkTx;
    public static final /* enum */ DsJQ$DYFV WRDC;
    public static final /* enum */ DsJQ$DYFV jaiT;
    public static final /* enum */ DsJQ$DYFV foPO;
    private final String path;
    private static final /* synthetic */ DsJQ$DYFV[] JBkm;

    static {
        cv.V(-1966409878, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1068\ufedc\u5d0a\u7f5b\ua29c\u3f20\u41c8\uce56\ubbd4\u4ce1\u1326\u66d7\u0dfa\u05ac\ud871\u105b"), 0, (String)DsJQ$DYFV.Po(DsJQ$DYFV.Po(new StringBuilder(KUXS$dwji.S("\u104b\ufef0\u5d30\u7f30\ua2b2\u3f1b\u41e7\uce75\ubbe3\u4ccc\u1314\u66f4\u0ddc\u05d4\ud847\u106c\ude1b\udd0d\u6c82\u89e6\u8853")), DsJQ$DYFV.getServerVersion()))));
        cv.V(-2056456069, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321"), 1, (String)DsJQ$DYFV.Po(DsJQ$DYFV.Po(new StringBuilder(KUXS$dwji.S("\u104a\ufee7\u5d23\u7f30\ua2bd\u3f07\u41e2\uce7b\ubbe9\u4cca\u135b\u66f1\u0dda\u059b\ud852\u107d\ude0b\udd0e\u6c8c\u89ff\u8814\u8bc2\uf3a2")), DsJQ$DYFV.getServerVersion()))));
        cv.V(1013971066, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0dea\u05b6\ud87b\u104a\ude22"), 2, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1047\ufef9\u5d2b\u7f7d\ua2b4")));
        cv.V(215152741, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0deb\u05b2\ud861\u1047\ude22\udd32\u6ca8"), 3, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1046\ufefd\u5d31\u7f70\ua2b4\u3f1b\u41e6")));
        cv.V(-36439964, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0deb\u05b5\ud879\u1044\ude28\udd35\u6ca3"), 4, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1046\ufefa\u5d29\u7f73\ua2be\u3f1c\u41ed")));
        cv.V(159971431, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0deb\u05b5\ud87a\u105f\ude2c\udd29\u6cb4\u89d5\u8829\u8bff\uf3c3\uda4f\u824f"), 5, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1046\ufefa\u5d2a\u7f68\ua2ba\u3f00\u41fa\uce71\ubbf4\u4cd7\u131a\u66fc\u0ddb")));
        cv.V(1170667622, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0ded\u05b4\ud877\u1041\ude28\udd35\u6cb3\u89d9\u8838\u8bf8\uf3df"), 6, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1040\ufefb\u5d27\u7f76\ua2be\u3f1c\u41fd\uce7d\ubbe5\u4cd0\u1301\u66e1")));
        cv.V(597817169, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0ded\u05b4\ud860\u1040\ude3d\udd22"), 7, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1040\ufefb\u5d30\u7f77\ua2ab\u3f0b")));
        cv.V(-574359455, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0ded\u05ac\ud871\u1047\ude3d"), 8, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1040\ufee3\u5d21\u7f70\ua2ab")));
        cv.V(-1703806880, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0def\u05bf\ud87a\u104c\ude3b\udd3a\u6cb3\u89db\u882f"), 9, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1042\ufef0\u5d2a\u7f7b\ua2ad\u3f13\u41fd\uce7f\ubbf2")));
        cv.V(-2078410653, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0de0\u05bf\ud878\u1059"), 10, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u104d\ufef0\u5d28\u7f6e")));
        cv.V(-245368734, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0de1\u05b4\ud862\u104c\ude27\udd2f\u6ca8\u89c6\u8824"), 11, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u104c\ufefb\u5d32\u7f7b\ua2b1\u3f06\u41e6\uce62\ubbf9")));
        cv.V(-1546848147, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0de5\u05bb\ud864"), 12, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1048\ufef4\u5d34")));
        cv.V(1840576620, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0de5\u05bf\ud860\u1048\ude2d\udd3a\u6cb3\u89d5"), 13, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1048\ufef0\u5d30\u7f7f\ua2bb\u3f13\u41fd\uce71")));
        cv.V(512817263, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0df8\u05b5\ud860\u1040\ude26\udd35"), 14, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1055\ufefa\u5d30\u7f77\ua2b0\u3f1c")));
        cv.V(900921454, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0df8\u05a8\ud87b\u1043\ude2c\udd38\u6cb3\u89dd\u8831\u8bf3\uf3df"), 15, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1055\ufee7\u5d2b\u7f74\ua2ba\u3f11\u41fd\uce79\ubbec\u4cdb\u1306")));
        cv.V(-57739159, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0dfb\u05b9\ud87c\u104c\ude2d\udd2e\u6cab\u89d1\u882f"), 16, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1056\ufef6\u5d2c\u7f7b\ua2bb\u3f07\u41e5\uce75\ubbf2")));
        cv.V(365623400, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0dfb\u05b9\ud87b\u105b\ude2c\udd39\u6ca8\u89d5\u882f\u8bf2"), 17, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1056\ufef6\u5d2b\u7f6c\ua2ba\u3f10\u41e6\uce71\ubbf2\u4cda")));
        cv.V(-1346176917, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0dfd\u05aa\ud870\u1048\ude3d\udd3e\u6cb5"), 18, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1050\ufee5\u5d20\u7f7f\ua2ab\u3f17\u41fb")));
        cv.V(816838762, (Object)new DsJQ$DYFV(KUXS$dwji.S("\u1066\ufec7\u5d05\u7f58\ua28b\u3f30\u41dc\uce5b\ubbcb\u4cf7\u1321\u66cd\u0dfd\u05ae\ud87d\u1045"), 19, (DsJQ$DYFV)((Object)cv.e(-2056456069)), KUXS$dwji.S("\u1050\ufee1\u5d2d\u7f72")));
        cv.V(1846540373, new DsJQ$DYFV[]{(DsJQ$DYFV)((Object)cv.e(-1966409878)), (DsJQ$DYFV)((Object)cv.e(-2056456069)), (DsJQ$DYFV)((Object)cv.e(1013971066)), (DsJQ$DYFV)((Object)cv.e(215152741)), (DsJQ$DYFV)((Object)cv.e(-36439964)), (DsJQ$DYFV)((Object)cv.e(159971431)), (DsJQ$DYFV)((Object)cv.e(1170667622)), (DsJQ$DYFV)((Object)cv.e(597817169)), (DsJQ$DYFV)((Object)cv.e(-574359455)), (DsJQ$DYFV)((Object)cv.e(-1703806880)), (DsJQ$DYFV)((Object)cv.e(-2078410653)), (DsJQ$DYFV)((Object)cv.e(-245368734)), (DsJQ$DYFV)((Object)cv.e(-1546848147)), (DsJQ$DYFV)((Object)cv.e(1840576620)), (DsJQ$DYFV)((Object)cv.e(512817263)), (DsJQ$DYFV)((Object)cv.e(900921454)), (DsJQ$DYFV)((Object)cv.e(-57739159)), (DsJQ$DYFV)((Object)cv.e(365623400)), (DsJQ$DYFV)((Object)cv.e(-1346176917)), (DsJQ$DYFV)((Object)cv.e(816838762))});
    }

    private DsJQ$DYFV(String string2, int n2, String string3) {
        this.path = string2;
    }

    private DsJQ$DYFV(String string2, int n2, DsJQ$DYFV dsJQ$DYFV, String string3) {
        this(string, n, (String)DsJQ$DYFV.Po(DsJQ$DYFV.Po(DsJQ$DYFV.Po(DsJQ$DYFV.Po(new StringBuilder(), string2), KUXS$dwji.S("\uc70d")), n2)));
    }

    public String getPath() {
        return (String)cv.b((Object)this, -1385826220);
    }

    public Class<?> getClass(String string) throws ClassNotFoundException {
        return DsJQ$DYFV.Po(DsJQ$DYFV.Po(DsJQ$DYFV.Po(DsJQ$DYFV.Po(DsJQ$DYFV.Po(new StringBuilder(), this), rgig$AWxc.r("\ua262")), string)));
    }

    public String toString() {
        return (String)cv.b((Object)this, -1385826220);
    }

    public static String getServerVersion() {
        return DsJQ$DYFV.Po(DsJQ$DYFV.Po(DsJQ$DYFV.Po(DsJQ$DYFV.Po(DsJQ$DYFV.Po()))), 23);
    }

    public static DsJQ$DYFV[] values() {
        DsJQ$DYFV[] arrdsJQ$DYFV = (DsJQ$DYFV[])cv.e(1846540373);
        int n = arrdsJQ$DYFV.length;
        DsJQ$DYFV[] arrdsJQ$DYFV2 = new DsJQ$DYFV[n];
        DsJQ$DYFV.Po(arrdsJQ$DYFV, false, arrdsJQ$DYFV2, false, n);
        return arrdsJQ$DYFV2;
    }

    public static DsJQ$DYFV valueOf(String string) {
        return (DsJQ$DYFV)((Object)DsJQ$DYFV.Po(DsJQ$DYFV.class, string));
    }

    private static Object Po(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

