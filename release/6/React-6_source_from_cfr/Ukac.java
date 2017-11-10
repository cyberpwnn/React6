/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Ukac {
    public static final long ONE_KB = 1024;
    public static final long ONE_MB = 0x100000;
    public static final long ONE_GB = 0x40000000;
    public static final File[] EMPTY_FILE_ARRAY;

    static {
        yy.K(-662566880, new File[0]);
    }

    public static String byteCountToDisplaySize(long l) {
        Object object = l / 0x40000000 > 0 ? Ukac.PD(Ukac.PD(new StringBuilder((String)Ukac.PD(Ukac.PD(l / 0x40000000))), BkvY$LhxG.I("\u6b77\uff63\u612a"))) : (l / 0x100000 > 0 ? Ukac.PD(Ukac.PD(new StringBuilder((String)Ukac.PD(Ukac.PD(l / 0x100000))), BkvY$LhxG.I("\u6b77\uff69\u612a"))) : (l / 1024 > 0 ? Ukac.PD(Ukac.PD(new StringBuilder((String)Ukac.PD(Ukac.PD(l / 1024))), BkvY$LhxG.I("\u6b77\uff6f\u612a"))) : Ukac.PD(Ukac.PD(new StringBuilder((String)Ukac.PD(Ukac.PD(l))), BkvY$LhxG.I("\u6b77\uff46\u6111\ue168\u5e51\uf6aa")))));
        return object;
    }

    public static void touch(File file) throws IOException {
        if (Ukac.PD(file) == false) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Ukac.PD(fileOutputStream);
        }
        Ukac.PD(file, Ukac.PD());
    }

    public static File[] convertFileCollectionToFileArray(Collection<String> collection) {
        return collection.toArray(new File[collection.size()]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static File toFile(URL var0) {
        if (var0 == null) return null;
        if (Ukac.PD(Ukac.PD(var0), NVIs$JbpD.H("\u8bf5\u959a\u937a\u03e9")) == false) {
            return null;
        }
        var1_1 = Ukac.PD(Ukac.PD(var0), 47, ((Character)yy.p(67045479)).charValue());
        var2_2 = false;
        ** GOTO lbl31
lbl-1000: // 1 sources:
        {
            if (var2_2 + 2 < Ukac.PD(var1_1)) {
                var3_3 = Ukac.PD(var1_1, var2_2 + true, var2_2 + 3);
                var4_4 = Ukac.PD(var3_3, 16);
                var1_1 = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder((String)Ukac.PD(Ukac.PD(var1_1, false, var2_2))), var4_4), Ukac.PD(var1_1, var2_2 + 3)));
            }
lbl31: // 4 sources:
            v0 = Ukac.PD(var1_1, 37, var2_2);
            var2_2 = v0;
            ** while (v0 >= 0)
        }
lbl36: // 1 sources:
        return new File((String)var1_1);
    }

    public static File[] toFiles(URL[] arruRL) {
        if (arruRL == null || arruRL.length == 0) {
            return (File[])yy.p(-662566880);
        }
        File[] arrfile = new File[arruRL.length];
        int n = 0;
        while (n < arruRL.length) {
            URL uRL = arruRL[n];
            if (uRL != null) {
                if (Ukac.PD(Ukac.PD(uRL), KDGY$JAHk.Y("\u77ec\u7c0e\u6cbd\uf5b9")) == false) {
                    throw new IllegalArgumentException((String)Ukac.PD(Ukac.PD(new StringBuilder(KDGY$JAHk.Y("\u77df\u7c35\u6c9d\uf5fc\u2394\u99f4\u25ce\ud699\u5856\u2314\u0229\ue96c\ued0c\ub23c\uddef\uda94\uafe4\u585a\ub464\u5a18\ub43a\u027b\u5efe\u2d8c\u062b\ua4ba\u9abd\ue5a5\uec42\u47be\u7d5f\u1d52\ua2ce\u3453\u73cd\u1733\ua8b9\u4f90")), uRL)));
                }
                arrfile[n] = Ukac.toFile(uRL);
            }
            ++n;
        }
        return arrfile;
    }

    public static URL[] toURLs(File[] arrfile) throws IOException {
        URL[] arruRL = new URL[arrfile.length];
        int n = 0;
        while (n < arruRL.length) {
            arruRL[n] = Ukac.PD(arrfile[n]);
            ++n;
        }
        return arruRL;
    }

    public static void copyFileToDirectory(File file, File file2) throws IOException {
        if (file2 == null) {
            throw new NullPointerException(BkvY$LhxG.I("\ue95f\u7f98\u865a\u4a51\u9d24\u014a\u1166\ub15d\u5923\uf4e3\u1777\u3bd7\u716b\u6030\u6114\u365d\ua9df\ufbb5\u2f74\u5ff7\ub84e\ue868\u1079\u6b99\u4a90\uba59\u8006\u6a07"));
        }
        if (Ukac.PD(file2) != false) {
            if (Ukac.PD(file2) == false) {
                throw new IllegalArgumentException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(BkvY$LhxG.I("\ue95f\u7f98\u865a\u4a51\u9d24\u014a\u1166\ub15d\u5923\uf4e3\u1777\u3bd7\u7121")), file2), BkvY$LhxG.I("\ue93c\u7fdd\u8640\u4a56\u9d6d\u014a\u1168\ub15d\u596a\uf4ed\u1739\u3b93\u716f\u6037\u6102\u364a\ua98b\ufbb4\u2f69\u5ffa"))));
            }
        }
        Ukac.copyFile(file, new File(file2, (String)Ukac.PD(file)), true);
    }

    public static void copyFile(File file, File file2) throws IOException {
        Ukac.copyFile(file, file2, true);
    }

    public static void copyFile(File file, File file2, boolean bl) throws IOException {
        if (file == null) {
            throw new NullPointerException(BkvY$LhxG.I("\udcee\u8f58\u2055\u8a42\u9b80\u7b64\u2ae6\u1809\u63cc\ub4b3\u725c\u05b6\u2c5b\u1987\u19b5\ud657\u032c\uc5e2\u031d\udd1e\u5d54\u6069\u53bb"));
        }
        if (file2 == null) {
            throw new NullPointerException(BkvY$LhxG.I("\udcf9\u8f52\u2053\u8a44\u9b8a\u7b6f\u2aa7\u1810\u63d0\ub4af\u7246\u05b6\u2c58\u199d\u19b2\ud603\u036e\uc5e9\u0352\udd04\u5d01\u6067\u53b2\uca14\u1f67\u7be2\ucf11\u9b4f"));
        }
        if (Ukac.PD(file) == false) {
            throw new FileNotFoundException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(BkvY$LhxG.I("\udcee\u8f58\u2055\u8a42\u9b80\u7b64\u2ae6\u1843")), file), BkvY$LhxG.I("\udc9a\u8f17\u2044\u8a5f\u9b86\u7b72\u2ae6\u180a\u63d6\ub4b4\u7208\u05f3\u2c4d\u1981\u19b2\ud603"))));
        }
        if (Ukac.PD(file) != false) {
            throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(BkvY$LhxG.I("\udcee\u8f58\u2055\u8a42\u9b80\u7b64\u2ae6\u1843")), file), BkvY$LhxG.I("\udc9a\u8f17\u2045\u8a48\u9b8a\u7b72\u2ab2\u1817\u6399\ub4a2\u725d\u05e2\u2c15\u1981\u19b2\ud657\u032f\uc5a7\u0359\udd19\u5d53\u6060\u53b4\uca40\u1f66\u7be5\ucf04"))));
        }
        if (Ukac.PD(Ukac.PD(file), Ukac.PD(file2)) != false) {
            throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(BkvY$LhxG.I("\udcee\u8f58\u2055\u8a42\u9b80\u7b64\u2ae6\u1843")), file), BkvY$LhxG.I("\udc9a\u8f17\u2041\u8a5e\u9b87\u7b21\u2aa2\u1801\u63ca\ub4b4\u7241\u05f8\u2c54\u199c\u19a8\ud618\u0320\uc5a7\u031a")), file2), BkvY$LhxG.I("\udc9a\u8f17\u2041\u8a42\u9b86\u7b21\u2ab2\u180c\u63dc\ub4e0\u725b\u05f7\u2c58\u198d"))));
        }
        if (Ukac.PD(file2) != null) {
            if (Ukac.PD(Ukac.PD(file2)) == false) {
                if (Ukac.PD(Ukac.PD(file2)) == false) {
                    throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(BkvY$LhxG.I("\udcf9\u8f52\u2053\u8a44\u9b8a\u7b6f\u2aa7\u1810\u63d0\ub4af\u7246\u05b6\u2c12")), file2), BkvY$LhxG.I("\udc9a\u8f17\u2044\u8a59\u9b91\u7b64\u2aa5\u1810\u63d6\ub4b2\u7251\u05b6\u2c56\u1989\u19af\ud619\u0321\uc5f3\u031d\udd12\u5d44\u6025\u53b4\uca46\u1f6c\u7bf6\ucf09\u9b46\u5e7a"))));
                }
            }
        }
        if (Ukac.PD(file2) != false) {
            if (Ukac.PD(file2) == false) {
                throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(BkvY$LhxG.I("\udcf9\u8f52\u2053\u8a44\u9b8a\u7b6f\u2aa7\u1810\u63d0\ub4af\u7246\u05b6\u2c12")), file2), BkvY$LhxG.I("\udc9a\u8f17\u2045\u8a48\u9b8a\u7b72\u2ab2\u1817\u6399\ub4a2\u725d\u05e2\u2c15\u1981\u19b2\ud657\u033c\uc5e2\u035c\udd14\u5d0c\u606a\u53b9\uca58\u1f70"))));
            }
        }
        Ukac.mXJp(file, file2, bl);
    }

    private static void mXJp(File file, File file2, boolean bl) throws IOException {
        if (Ukac.PD(file2) != false) {
            if (Ukac.PD(file2) != false) {
                throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(NVIs$JbpD.H("\ud902\u91a1\ub3b4\u533e\u82de\u9ccd\u8c58\u1855\u824d\u5386\ue7c0\ub764\u8292")), file2), NVIs$JbpD.H("\ud961\u91e4\ub3a2\u5332\u82de\u9cd0\u8c4d\u1852\u8204\u538b\ue7db\ub730\u8295\ua6b2\u8e4b\ucfc2\u03b4\uef3a\u3a47\ue322\uf949\u1c5b\u4f2c\ueb85\u1403\ubb52\u676e"))));
            }
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                Ukac.PD(fileInputStream, fileOutputStream);
            }
            finally {
                Ukac.PD(fileOutputStream);
            }
        }
        finally {
            Ukac.PD(fileInputStream);
        }
        if (Ukac.PD(file) != Ukac.PD(file2)) {
            throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(NVIs$JbpD.H("\ud900\u91a5\ub3ae\u5326\u82d2\u9cc7\u8c19\u1855\u824b\u53c9\ue7cd\ub72b\u82c5\ua6a2\u8e18\ucf84\u03a0\uef76\u3a4f\ue36b\uf958\u1c51\u4f21\ueb85\u1409\ubb4e\u6763\ucc69\u3c53\u1c51\u7572\u034e\ua28f\uec48\ue40b")), file), NVIs$JbpD.H("\ud961\u91e4\ub3b3\u5325\u8297\u9c84")), file2), NVIs$JbpD.H("\ud961"))));
        }
        if (bl) {
            Ukac.PD(file2, Ukac.PD(file));
        }
    }

    public static void copyDirectoryToDirectory(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException(BkvY$LhxG.I("\u5599\u0663\u6e35\ua885\u42c0\ua4a6\u7436\u3f68\u21dc\udf3d\u602c\u9bea\ua8b7\uc1c5\u1633\udff1\ub486\u5752\u1f5d\udf2d\ua846\u3911\ue10e"));
        }
        if (Ukac.PD(file) != false) {
            if (Ukac.PD(file) == false) {
                throw new IllegalArgumentException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(BkvY$LhxG.I("\u5599\u0663\u6e35\ua885\u42c0\ua4a6\u7436\u3f22")), file2), BkvY$LhxG.I("\u55ed\u062c\u6e29\ua884\u4283\ua4ad\u7479\u3f71\u2189\udf2f\u6078\u9bae\ua8b0\uc1d8\u1622\udfb2\ub490\u5758\u1f0f\udf3a"))));
            }
        }
        if (file2 == null) {
            throw new NullPointerException(BkvY$LhxG.I("\u558e\u0669\u6e33\ua883\u42ca\ua4ad\u7477\u3f71\u21c0\udf21\u6036\u9bea\ua8b4\uc1df\u1634\udfa5\ub4c4\u5759\u1f12\udf37\ua813\u391f\ue107\u5a55\u5803\uad5c\u748d\u3681"));
        }
        if (Ukac.PD(file2) != false) {
            if (Ukac.PD(file2) == false) {
                throw new IllegalArgumentException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(BkvY$LhxG.I("\u558e\u0669\u6e33\ua883\u42ca\ua4ad\u7477\u3f71\u21c0\udf21\u6036\u9bea\ua8fe")), file2), BkvY$LhxG.I("\u55ed\u062c\u6e29\ua884\u4283\ua4ad\u7479\u3f71\u2189\udf2f\u6078\u9bae\ua8b0\uc1d8\u1622\udfb2\ub490\u5758\u1f0f\udf3a"))));
            }
        }
        Ukac.copyDirectory(file, new File(file2, (String)Ukac.PD(file)), true);
    }

    public static void copyDirectory(File file, File file2) throws IOException {
        Ukac.copyDirectory(file, file2, true);
    }

    public static void copyDirectory(File file, File file2, boolean bl) throws IOException {
        if (file == null) {
            throw new NullPointerException(KDGY$JAHk.Y("\uc148\uc544\ueecb\ude42\uae2d\udb09\u0996\u4dda\u0daf\u76ea\ue4cd\u48a2\u02c7\ua4da\u988d\ua46e\u9c12\u4b1e\uaff4\uc9ed\u6b41\u682a\ueed0"));
        }
        if (file2 == null) {
            throw new NullPointerException(KDGY$JAHk.Y("\uc15f\uc54e\ueecd\ude44\uae27\udb02\u09d7\u4dc3\u0db3\u76f6\ue4d7\u48a2\u02c4\ua4c0\u988a\ua43a\u9c50\u4b15\uafbb\uc9f7\u6b14\u6824\ueed9\u548e\ub56d\ub792\u3ead\u6cc9"));
        }
        if (Ukac.PD(file) == false) {
            throw new FileNotFoundException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(KDGY$JAHk.Y("\uc148\uc544\ueecb\ude42\uae2d\udb09\u0996\u4d90")), file), KDGY$JAHk.Y("\uc13c\uc50b\ueeda\ude5f\uae2b\udb1f\u0996\u4dd9\u0db5\u76ed\ue499\u48e7\u02d1\ua4dc\u988a\ua43a"))));
        }
        if (Ukac.PD(file) == false) {
            throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(KDGY$JAHk.Y("\uc148\uc544\ueecb\ude42\uae2d\udb09\u0996\u4d90")), file), KDGY$JAHk.Y("\uc13c\uc50b\ueedb\ude48\uae27\udb1f\u09c2\u4dc4\u0dfa\u76fb\ue4cc\u48f6\u0289\ua4dc\u988a\ua46e\u9c1e\u4b14\uafa0\uc9a3\u6b55\u6866\ueed8\u54c7\ub571\ub782\u3ea2\u6cd1\u8b21\ud9ae\uab9d"))));
        }
        if (Ukac.PD(Ukac.PD(file), Ukac.PD(file2)) != false) {
            throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(KDGY$JAHk.Y("\uc148\uc544\ueecb\ude42\uae2d\udb09\u0996\u4d90")), file), KDGY$JAHk.Y("\uc13c\uc50b\ueedf\ude5e\uae2a\udb4c\u09d2\u4dd2\u0da9\u76ed\ue4d0\u48ec\u02c8\ua4c1\u9890\ua421\u9c1e\u4b5b\uaff3")), file2), KDGY$JAHk.Y("\uc13c\uc50b\ueedf\ude42\uae2b\udb4c\u09c2\u4ddf\u0dbf\u76b9\ue4ca\u48e3\u02c4\ua4d0"))));
        }
        Ukac.ksfs(file, file2, bl);
    }

    private static void ksfs(File file, File file2, boolean bl) throws IOException {
        if (Ukac.PD(file2) != false) {
            if (Ukac.PD(file2) == false) {
                throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(NVIs$JbpD.H("\u0b15\u0d6b\u559a\u80c9\u7fbf\u1a75\u4be4\u13d9\u5b07\ufe2f\uc63e\u5fb1\u2764")), file2), NVIs$JbpD.H("\u0b76\u0d2e\u558c\u80c5\u7fbf\u1a68\u4bf1\u13de\u5b4e\ufe22\uc625\u5fe5\u2763\u8e7f\u42ba\ub795\ud9d2\ue62b\u8418\ub660\u4aa2\u676c\u3d3b\u2705\u6784\u3883\u417d\u16b0\u5867\ud43f\u563c"))));
            }
        } else {
            if (Ukac.PD(file2) == false) {
                throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(NVIs$JbpD.H("\u0b15\u0d6b\u559a\u80c9\u7fbf\u1a75\u4be4\u13d9\u5b07\ufe2f\uc63e\u5fb1\u2764")), file2), NVIs$JbpD.H("\u0b76\u0d2e\u558d\u80d4\u7fa4\u1a7e\u4be6\u13d9\u5b01\ufe32\uc629\u5fb1\u2720\u8e77\u42a7\ub7db\ud9d3\ue630\u844c\ub622\u4aa6\u676c\u3d3c\u271e\u6793\u3887\u416a\u16a1\u586c"))));
            }
            if (bl) {
                Ukac.PD(file2, Ukac.PD(file));
            }
        }
        if (Ukac.PD(file2) == false) {
            throw new IOException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(NVIs$JbpD.H("\u0b15\u0d6b\u559a\u80c9\u7fbf\u1a75\u4be4\u13d9\u5b07\ufe2f\uc63e\u5fb1\u2764")), file2), NVIs$JbpD.H("\u0b76\u0d2e\u558a\u80dc\u7fb8\u1a75\u4bea\u13d9\u5b4e\ufe22\uc635\u5fb1\u2734\u8e64\u42a0\ub7c1\ud9c8\ue621\u8402\ub660\u4ab7\u6723"))));
        }
        File[] arrfile = (File[])Ukac.PD(file);
        if (arrfile == null) {
            throw new IOException((String)Ukac.PD(Ukac.PD(new StringBuilder(NVIs$JbpD.H("\u0b17\u0d6f\u5580\u80d1\u7fb3\u1a7f\u4ba5\u13d9\u5b01\ufe60\uc63c\u5ff8\u2730\u8e62\u42e9\ub7d6\ud9d3\ue62a\u8418\ub625\u4aad\u6738\u3d2c\u274c\u6799\u3880\u413e")), file)));
        }
        int n = 0;
        while (n < arrfile.length) {
            File file3 = new File(file2, (String)Ukac.PD(arrfile[n]));
            if (Ukac.PD(arrfile[n]) != false) {
                Ukac.ksfs(arrfile[n], file3, bl);
            } else {
                Ukac.mXJp(arrfile[n], file3, bl);
            }
            ++n;
        }
    }

    public static void copyURLToFile(URL uRL, File file) throws IOException {
        if (Ukac.PD(file) != null) {
            if (Ukac.PD(Ukac.PD(file)) == false) {
                Ukac.PD(Ukac.PD(file));
            }
        }
        if (Ukac.PD(file) != false) {
            if (Ukac.PD(file) == false) {
                Object object = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(KDGY$JAHk.Y("\udcf5\uf805\ube52\u071e\u7138\u8845\u98bf\uceaf\ud19f\ud262\ufb0c\u3a53\u4a2c\u60ac\ub654\u432f\u3145\u740c\u6f37\uf04a")), file), KDGY$JAHk.Y("\udc80\uf80d\ube5c\u070e\u7174\u8857\u98ed\uceb2\ud184\ud22b\ufb0d\u3a44\u4a67")));
                throw new IOException((String)object);
            }
        }
        Object object = Ukac.PD(uRL);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                Ukac.PD(object, fileOutputStream);
            }
            finally {
                Ukac.PD(fileOutputStream);
            }
        }
        finally {
            Ukac.PD(object);
        }
    }

    public static void deleteDirectory(File file) throws IOException {
        if (Ukac.PD(file) == false) {
            return;
        }
        Ukac.cleanDirectory(file);
        if (Ukac.PD(file) == false) {
            Object object = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(KDGY$JAHk.Y("\uff89\u2a89\u4ff9\ud86e\u3119\u0c3c\ufb21\ud276\u1f2e\u87ff\ua9d6\u12eb\u2e34\u6c23\u297f\u89d9\u9cd0\uc962\u95cd\u8ea8\u20e6\ube17\uaeff\u52c2\uf934\u04ba\u0a5d")), file), KDGY$JAHk.Y("\ufff2")));
            throw new IOException((String)object);
        }
    }

    public static void cleanDirectory(File file) throws IOException {
        if (Ukac.PD(file) == false) {
            Object object = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(), file), KDGY$JAHk.Y("\ue61b\u20ac\u4847\uc302\u00ed\ua9a1\u838c\ub364\u29c9\uc042\u6e55\u0ad2\u12a7\u61f2\u9fc2")));
            throw new IllegalArgumentException((String)object);
        }
        if (Ukac.PD(file) == false) {
            Object object = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(), file), KDGY$JAHk.Y("\ue61b\u20a1\u485b\uc347\u00f0\ua9ee\u8396\ub32b\u29dc\uc042\u6e54\u0ac3\u12bc\u61e4\u9fd5\u2386\u7f39\u819b\u44c1")));
            throw new IllegalArgumentException((String)object);
        }
        File[] arrfile = (File[])Ukac.PD(file);
        if (arrfile == null) {
            throw new IOException((String)Ukac.PD(Ukac.PD(new StringBuilder(KDGY$JAHk.Y("\ue67d\u20a9\u4841\uc30b\u00fb\ua9e5\u83c2\ub37f\u29d2\uc042\u6e5c\u0ac3\u12bd\u61f5\u9f96\u2391\u7f39\u8187\u44cc\u38f7\u5317\u22ca\u63ef\u16bc\u3d9a\udb0a\u0b16")), file)));
        }
        IOException iOException = null;
        int n = 0;
        while (n < arrfile.length) {
            File file2 = arrfile[n];
            try {
                Ukac.forceDelete(file2);
            }
            catch (IOException iOException2) {
                IOException iOException3 = iOException2;
                iOException = iOException2;
            }
            ++n;
        }
        if (iOException != null) {
            throw iOException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean waitFor(File file, int n) {
        int n2 = 0;
        int n3 = 0;
        while (Ukac.PD(file) == false) {
            if (n3++ >= 10) {
                n3 = 0;
                if (n2++ > n) {
                    return false;
                }
            }
            try {
                Ukac.PD(100);
            }
            catch (InterruptedException interruptedException) {
            }
            catch (Exception exception) {
                return true;
            }
        }
        return true;
    }

    public static String readFileToString(File file, String string) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            Object object = Ukac.PD(fileInputStream, string);
            return object;
        }
        finally {
            Ukac.PD(fileInputStream);
        }
    }

    public static byte[] readFileToByteArray(File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byte[] arrby = (byte[])Ukac.PD(fileInputStream);
            return arrby;
        }
        finally {
            Ukac.PD(fileInputStream);
        }
    }

    public static List<String> readLines(File file, String string) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            Object object = Ukac.PD(fileInputStream, string);
            return object;
        }
        finally {
            Ukac.PD(fileInputStream);
        }
    }

    public static void writeStringToFile(File file, String string, String string2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Ukac.PD(string, fileOutputStream, string2);
        }
        finally {
            Ukac.PD(fileOutputStream);
        }
    }

    public static void writeByteArrayToFile(File file, byte[] arrby) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Ukac.PD(fileOutputStream, arrby);
        }
        finally {
            Ukac.PD(fileOutputStream);
        }
    }

    public static void writeLines(File file, String string, Collection<String> collection) throws IOException {
        Ukac.writeLines(file, string, collection, null);
    }

    public static void writeLines(File file, String string, Collection<String> collection, String string2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Ukac.PD(collection, string2, fileOutputStream, string);
        }
        finally {
            Ukac.PD(fileOutputStream);
        }
    }

    public static void forceDelete(File file) throws IOException {
        if (Ukac.PD(file) != false) {
            Ukac.deleteDirectory(file);
            return;
        }
        if (Ukac.PD(file) == false) {
            throw new FileNotFoundException((String)Ukac.PD(Ukac.PD(new StringBuilder(NVIs$JbpD.H("\u5949\u421e\uad81\u944b\ufd87\u41bf\u41b0\u9f38\ucd8b\u2a69\u69e8\udba6\u9324\u0be6\u753f\uc761\u3d90\u36db\ud97c\u481c\ucc84")), file)));
        }
        if (Ukac.PD(file) == false) {
            Object object = Ukac.PD(Ukac.PD(new StringBuilder(NVIs$JbpD.H("\u595a\u4219\uad8c\u944c\ufdcb\u41be\u41ff\u9f29\ucd97\u2a69\u69e2\udbac\u933c\u0ba3\u752e\uc77c\u3dd9\u36ce\ud961\u484a\uccc1n\u2bc6")), file));
            throw new IOException((String)object);
        }
    }

    public static void forceDeleteOnExit(File file) throws IOException {
        if (Ukac.PD(file) != false) {
            Ukac.yJLL(file);
            return;
        }
        Ukac.PD(file);
    }

    private static void yJLL(File file) throws IOException {
        if (Ukac.PD(file) == false) {
            return;
        }
        Ukac.SnBs(file);
        Ukac.PD(file);
    }

    private static void SnBs(File file) throws IOException {
        if (Ukac.PD(file) == false) {
            Object object = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(), file), NVIs$JbpD.H("\u9b2a\u7229\uaae9\u777e\u86d7\u6673\u5283\u9b9d\u997d\uc893\ucc02\u86bd\u3a0d\u794c\ucf89")));
            throw new IllegalArgumentException((String)object);
        }
        if (Ukac.PD(file) == false) {
            Object object = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(), file), NVIs$JbpD.H("\u9b2a\u7224\uaaf5\u773b\u86ca\u663c\u5299\u9bd2\u9968\uc893\ucc03\u86ac\u3a16\u795a\ucf9e\ub482\ufdc4\uc89b\u98cd")));
            throw new IllegalArgumentException((String)object);
        }
        File[] arrfile = (File[])Ukac.PD(file);
        if (arrfile == null) {
            throw new IOException((String)Ukac.PD(Ukac.PD(new StringBuilder(NVIs$JbpD.H("\u9b4c\u722c\uaaef\u7777\u86c1\u6637\u52cd\u9b86\u9966\uc893\ucc0b\u86ac\u3a17\u794b\ucfdd\ub495\ufdc4\uc887\u98c0\u4460\u1246\uaa33\u3db6\u68a2\udf36\u79d6\u2dfc")), file)));
        }
        IOException iOException = null;
        int n = 0;
        while (n < arrfile.length) {
            File file2 = arrfile[n];
            try {
                Ukac.forceDeleteOnExit(file2);
            }
            catch (IOException iOException2) {
                IOException iOException3 = iOException2;
                iOException = iOException2;
            }
            ++n;
        }
        if (iOException != null) {
            throw iOException;
        }
    }

    public static void forceMkdir(File file) throws IOException {
        if (Ukac.PD(file) != false) {
            if (Ukac.PD(file) != false) {
                Object object = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(KDGY$JAHk.Y("\u9b61\ue91e\ue90f\u415c\u5585")), file), KDGY$JAHk.Y("\u9b07\ue912\ue91b\u4150\u55d6\u3091\u7bc5\uaaf2\u87a7\ue133\u6987\ud6db\u16b0\ufd02\u8088\u5c18\u3e98\uc9ed\u4e23\u9b64\u83c8\ue821\u59fd\uaedf\u3722\ub974\ub7e8\ubfab\u30d5\u8c9c\u1755\ua99c\uda5b\u5d5c\u0556\uba48\uba85\uc6bb\u483f\u7acb\u6504\u224c\ud43a\u0fe6\u0c6b\u3d4f\u852a\u0918\u5375\u1adb\u1702\ua64a\u7c90\u2662\u599c\u011c\ue199\u00f0\u802f")));
                throw new IOException((String)object);
            }
        } else if (Ukac.PD(file) == false) {
            Object object = Ukac.PD(Ukac.PD(new StringBuilder(KDGY$JAHk.Y("\u9b72\ue919\ue902\u415b\u55c9\u3080\u7b96\uaaa6\u87a9\ue17d\u6980\ud689\u16bc\ufd10\u80dc\u5c13\u3ed7\uc9fd\u4e6a\u9b77\u838d\ue826\u59e0\uaec2\u3735\ub96e\ub7bc")), file));
            throw new IOException((String)object);
        }
    }

    public static long sizeOfDirectory(File file) {
        if (Ukac.PD(file) == false) {
            Object object = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(), file), NVIs$JbpD.H("\u21d5\uf45e\uc433\u6fb3\uf486\uec94\ue7aa\u6669\u1b4e\ufb2b\ub717\u89d5\u6cc3\ubd2b\u645a")));
            throw new IllegalArgumentException((String)object);
        }
        if (Ukac.PD(file) == false) {
            Object object = Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(), file), NVIs$JbpD.H("\u21d5\uf453\uc42f\u6ff6\uf49b\uecdb\ue7b0\u6626\u1b5b\ufb2b\ub716\u89c4\u6cd8\ubd3d\u644d\ub505\u326b\u0e8f\u9cb3")));
            throw new IllegalArgumentException((String)object);
        }
        long l = 0;
        File[] arrfile = (File[])Ukac.PD(file);
        if (arrfile == null) {
            return 0;
        }
        int n = 0;
        while (n < arrfile.length) {
            File file2 = arrfile[n];
            l = Ukac.PD(file2) != false ? (l += Ukac.sizeOfDirectory(file2)) : (l += Ukac.PD(file2));
            ++n;
        }
        return l;
    }

    public static boolean isFileNewer(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException(BkvY$LhxG.I("\u8877\u8a0e\uf26e\u62c1\u5a6c\uf378\ub4c0\ucf96\u70c3\u5176\u9297\u41e1\u94d7\u2d59\u64ae\u15d6\ue0f3\u7ccc\u00ca\u2a8a\ubc11\ub57b\u8490\ue79c\u6ce0\u7dfd\uc665"));
        }
        if (Ukac.PD(file2) == false) {
            throw new IllegalArgumentException((String)Ukac.PD(Ukac.PD(Ukac.PD(new StringBuilder(BkvY$LhxG.I("\u886d\u8a09\uf22b\u6292\u5a6e\uf378\ub4c5\ucf9a\u70d7\u517a\u929c\u41e6\u9492\u2d0b\u64ad\u15d9\ue0fa\u7cdb\u008f\u2ac3")), file), BkvY$LhxG.I("\u881e\u8a41\uf22a\u62dd\u5a79\uf36e\ub4cd\ucfd8\u70d1\u513f\u9297\u41fd\u949e\u2d58\u64bf"))));
        }
        return Ukac.isFileNewer(file, (long)Ukac.PD(file2));
    }

    public static boolean isFileNewer(File file, Date date) {
        if (date == null) {
            throw new IllegalArgumentException(BkvY$LhxG.I("\u8877\u8a0e\uf26e\u62c1\u5a6c\uf378\ub4c0\ucf96\u70c3\u5176\u9297\u41e1\u94d7\u2d4f\u64aa\u15c4\ue0f3"));
        }
        return Ukac.isFileNewer(file, (long)Ukac.PD(date));
    }

    public static boolean isFileNewer(File file, long l) {
        if (file == null) {
            throw new IllegalArgumentException(BkvY$LhxG.I("\u8877\u8a0e\uf26e\u62c1\u5a6c\uf378\ub4c0\ucf96\u70c3\u5176\u9297\u41e1\u94d7\u2d4d\u64a2\u15dc\ue0f3"));
        }
        if (Ukac.PD(file) == false) {
            return false;
        }
        if (Ukac.PD(file) > l) {
            return true;
        }
        return false;
    }

    private static Object PD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

