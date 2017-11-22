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

public class IWad {
    public static final long ONE_KB = 1024;
    public static final long ONE_MB = 0x100000;
    public static final long ONE_GB = 0x40000000;
    public static final File[] EMPTY_FILE_ARRAY;

    static {
        cv.V(-672663858, new File[0]);
    }

    public static String byteCountToDisplaySize(long l) {
        Object object = l / 0x40000000 > 0 ? IWad.MU(IWad.MU(new StringBuilder((String)IWad.MU(IWad.MU(l / 0x40000000))), KUXS$dwji.S("\ueff1\ue05d\u1462"))) : (l / 0x100000 > 0 ? IWad.MU(IWad.MU(new StringBuilder((String)IWad.MU(IWad.MU(l / 0x100000))), KUXS$dwji.S("\ueff1\ue057\u1462"))) : (l / 1024 > 0 ? IWad.MU(IWad.MU(new StringBuilder((String)IWad.MU(IWad.MU(l / 1024))), KUXS$dwji.S("\ueff1\ue051\u1462"))) : IWad.MU(IWad.MU(new StringBuilder((String)IWad.MU(IWad.MU(l))), KUXS$dwji.S("\ueff1\ue078\u1459\ue70c\u13ef\u78b8")))));
        return object;
    }

    public static void touch(File file) throws IOException {
        if (IWad.MU(file) == false) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            IWad.MU(fileOutputStream);
        }
        IWad.MU(file, IWad.MU());
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
        if (IWad.MU(IWad.MU(var0), YEBy$TyVf.W("\u12a5\u59be\ueffc\u279b")) == false) {
            return null;
        }
        var1_1 = IWad.MU(IWad.MU(var0), 47, ((Character)cv.e(621344436)).charValue());
        var2_2 = false;
        ** GOTO lbl31
lbl-1000: // 1 sources:
        {
            if (var2_2 + 2 < IWad.MU(var1_1)) {
                var3_3 = IWad.MU(var1_1, var2_2 + true, var2_2 + 3);
                var4_4 = IWad.MU(var3_3, 16);
                var1_1 = IWad.MU(IWad.MU(IWad.MU(new StringBuilder((String)IWad.MU(IWad.MU(var1_1, false, var2_2))), var4_4), IWad.MU(var1_1, var2_2 + 3)));
            }
lbl31: // 4 sources:
            v0 = IWad.MU(var1_1, 37, var2_2);
            var2_2 = v0;
            ** while (v0 >= 0)
        }
lbl36: // 1 sources:
        return new File((String)var1_1);
    }

    public static File[] toFiles(URL[] arruRL) {
        if (arruRL == null || arruRL.length == 0) {
            return (File[])cv.e(-672663858);
        }
        File[] arrfile = new File[arruRL.length];
        int n = 0;
        while (n < arruRL.length) {
            URL uRL = arruRL[n];
            if (uRL != null) {
                if (IWad.MU(IWad.MU(uRL), YEBy$TyVf.W("\u0e96\u8103\ubbc4\u9fdb")) == false) {
                    throw new IllegalArgumentException((String)IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u0ea5\u8138\ubbe4\u9f9e\u6f1f\u7098\u6e02\uf6f8\u3286\u6b76\u767c\ub89b\u06ae\uab49\u5ec0\ue6e7\u48d3\u2d76\u5fff\u955f\uc0b8\ua8e4\u43be\u16f8\u1251\ud9be\ud6c3\u919e\uc2b5\u6c6f\u6f7e\u4696\ufabc\ub4a4\u29c4\u0484\uc1bd\ua266")), uRL)));
                }
                arrfile[n] = IWad.toFile(uRL);
            }
            ++n;
        }
        return arrfile;
    }

    public static URL[] toURLs(File[] arrfile) throws IOException {
        URL[] arruRL = new URL[arrfile.length];
        int n = 0;
        while (n < arruRL.length) {
            arruRL[n] = IWad.MU(arrfile[n]);
            ++n;
        }
        return arruRL;
    }

    public static void copyFileToDirectory(File file, File file2) throws IOException {
        if (file2 == null) {
            throw new NullPointerException(rgig$AWxc.r("\u7f33\u7fc5\u7c4d\ua76a\ud291\u34f5\uf173\u0d9a\uef93\ud76b\ud755\u4dea\u85fc\u2041\u0ea6\ua0c8\u2354\uee57\u2853\uca5a\u8fdd\u57df\ua800\u2048\ub118\u6dd3\u5702\ua5f7"));
        }
        if (IWad.MU(file2) != false) {
            if (IWad.MU(file2) == false) {
                throw new IllegalArgumentException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(rgig$AWxc.r("\u7f33\u7fc5\u7c4d\ua76a\ud291\u34f5\uf173\u0d9a\uef93\ud76b\ud755\u4dea\u85b6")), file2), rgig$AWxc.r("\u7f50\u7f80\u7c57\ua76d\ud2d8\u34f5\uf17d\u0d9a\uefda\ud765\ud71b\u4dae\u85f8\u2046\u0eb0\ua0df\u2300\uee56\u284e\uca57"))));
            }
        }
        IWad.copyFile(file, new File(file2, (String)IWad.MU(file)), true);
    }

    public static void copyFile(File file, File file2) throws IOException {
        IWad.copyFile(file, file2, true);
    }

    public static void copyFile(File file, File file2, boolean bl) throws IOException {
        if (file == null) {
            throw new NullPointerException(KUXS$dwji.S("\u8623\u712d\u845b\u1800\u00a9\u2b64\u43d2\uc7c8\u1323\ub24c\ud004\u31ef\u0f31\u8436\ubff6\uaf07\u0251\u99b2\ufd8f\u4bb4\ud401\u85ac\ue27a"));
        }
        if (file2 == null) {
            throw new NullPointerException(KUXS$dwji.S("\u8634\u7127\u845d\u1806\u00a3\u2b6f\u4393\uc7d1\u133f\ub250\ud01e\u31ef\u0f32\u842c\ubff1\uaf53\u0213\u99b9\ufdc0\u4bae\ud454\u85a2\ue273\ua596\u105a\ubc93\uc19c\uc508"));
        }
        if (IWad.MU(file) == false) {
            throw new FileNotFoundException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(KUXS$dwji.S("\u8623\u712d\u845b\u1800\u00a9\u2b64\u43d2\uc782")), file), KUXS$dwji.S("\u8657\u7162\u844a\u181d\u00af\u2b72\u43d2\uc7cb\u1339\ub24b\ud050\u31aa\u0f27\u8430\ubff1\uaf53"))));
        }
        if (IWad.MU(file) != false) {
            throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(KUXS$dwji.S("\u8623\u712d\u845b\u1800\u00a9\u2b64\u43d2\uc782")), file), KUXS$dwji.S("\u8657\u7162\u844b\u180a\u00a3\u2b72\u4386\uc7d6\u1376\ub25d\ud005\u31bb\u0f7f\u8430\ubff1\uaf07\u0252\u99f7\ufdcb\u4bb3\ud406\u85a5\ue275\ua5c2\u105b\ubc94\uc189"))));
        }
        if (IWad.MU(IWad.MU(file), IWad.MU(file2)) != false) {
            throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(IWad.MU(IWad.MU(new StringBuilder(KUXS$dwji.S("\u8623\u712d\u845b\u1800\u00a9\u2b64\u43d2\uc782")), file), KUXS$dwji.S("\u8657\u7162\u844f\u181c\u00ae\u2b21\u4396\uc7c0\u1325\ub24b\ud019\u31a1\u0f3e\u842d\ubfeb\uaf48\u025d\u99f7\ufd88")), file2), KUXS$dwji.S("\u8657\u7162\u844f\u1800\u00af\u2b21\u4386\uc7cd\u1333\ub21f\ud003\u31ae\u0f32\u843c"))));
        }
        if (IWad.MU(file2) != null) {
            if (IWad.MU(IWad.MU(file2)) == false) {
                if (IWad.MU(IWad.MU(file2)) == false) {
                    throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(KUXS$dwji.S("\u8634\u7127\u845d\u1806\u00a3\u2b6f\u4393\uc7d1\u133f\ub250\ud01e\u31ef\u0f78")), file2), KUXS$dwji.S("\u8657\u7162\u844a\u181b\u00b8\u2b64\u4391\uc7d1\u1339\ub24d\ud009\u31ef\u0f3c\u8438\ubfec\uaf49\u025c\u99a3\ufd8f\u4bb8\ud411\u85e0\ue275\ua5c4\u1051\ubc87\uc184\uc501\u5437"))));
                }
            }
        }
        if (IWad.MU(file2) != false) {
            if (IWad.MU(file2) == false) {
                throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(KUXS$dwji.S("\u8634\u7127\u845d\u1806\u00a3\u2b6f\u4393\uc7d1\u133f\ub250\ud01e\u31ef\u0f78")), file2), KUXS$dwji.S("\u8657\u7162\u844b\u180a\u00a3\u2b72\u4386\uc7d6\u1376\ub25d\ud005\u31bb\u0f7f\u8430\ubff1\uaf07\u0241\u99b2\ufdce\u4bbe\ud459\u85af\ue278\ua5da\u104d"))));
            }
        }
        IWad.ssNb(file, file2, bl);
    }

    private static void ssNb(File file, File file2, boolean bl) throws IOException {
        if (IWad.MU(file2) != false) {
            if (IWad.MU(file2) != false) {
                throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u3e82\u6dfd\u8779\u2f0a\u0b20\u7c24\u47e2\u4233\u14a5\udca8\ua350\u4710\u3e43")), file2), YEBy$TyVf.W("\u3ee1\u6db8\u876f\u2f06\u0b20\u7c39\u47f7\u4234\u14ec\udca5\ua34b\u4744\u3e44\u22c6\u3086\u0af5\u1ce6\u40f4\u4a4c\u3e85\uec2d\ucb43\u48db\u79a7\uf390\u81c9\u0ae0"))));
            }
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                IWad.MU(fileInputStream, fileOutputStream);
            }
            finally {
                IWad.MU(fileOutputStream);
            }
        }
        finally {
            IWad.MU(fileInputStream);
        }
        if (IWad.MU(file) != IWad.MU(file2)) {
            throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u3e80\u6df9\u8763\u2f12\u0b2c\u7c2e\u47a3\u4233\u14a3\udce7\ua35d\u475f\u3e14\u22d6\u30d5\u0ab3\u1cf2\u40b8\u4a44\u3ecc\uec3c\ucb49\u48d6\u79a7\uf39a\u81d5\u0aed\u8d95\u54ba\u2079\u5e3d\u3d19\u49b5\u9297\uaa2f")), file), YEBy$TyVf.W("\u3ee1\u6db8\u877e\u2f11\u0b69\u7c6d")), file2), YEBy$TyVf.W("\u3ee1"))));
        }
        if (bl) {
            IWad.MU(file2, IWad.MU(file));
        }
    }

    public static void copyDirectoryToDirectory(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException(KUXS$dwji.S("\u0e24\u4a19\u8245(\u9352\ucb6c\u4f94\u08ca\ua4c1\uab80\u6589\ud9d0\u83a8\u29c7\u8526\uf4a2\ub6f0\u6f76\uac8d\ud349\u6caa\u305f\u0981"));
        }
        if (IWad.MU(file) != false) {
            if (IWad.MU(file) == false) {
                throw new IllegalArgumentException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(KUXS$dwji.S("\u0e24\u4a19\u8245(\u9352\ucb6c\u4f94\u0880")), file2), KUXS$dwji.S("\u0e50\u4a56\u8259)\u9311\ucb67\u4fdb\u08d3\ua494\uab92\u65dd\ud994\u83af\u29da\u8537\uf4e1\ub6e6\u6f7c\uacdf\ud35e"))));
            }
        }
        if (file2 == null) {
            throw new NullPointerException(KUXS$dwji.S("\u0e33\u4a13\u8243.\u9358\ucb67\u4fd5\u08d3\ua4dd\uab9c\u6593\ud9d0\u83ab\u29dd\u8521\uf4f6\ub6b2\u6f7d\uacc2\ud353\u6cff\u3051\u0988\ubf23\u3b2f\u18d4\u2b24\u8efa"));
        }
        if (IWad.MU(file2) != false) {
            if (IWad.MU(file2) == false) {
                throw new IllegalArgumentException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(KUXS$dwji.S("\u0e33\u4a13\u8243.\u9358\ucb67\u4fd5\u08d3\ua4dd\uab9c\u6593\ud9d0\u83e1")), file2), KUXS$dwji.S("\u0e50\u4a56\u8259)\u9311\ucb67\u4fdb\u08d3\ua494\uab92\u65dd\ud994\u83af\u29da\u8537\uf4e1\ub6e6\u6f7c\uacdf\ud35e"))));
            }
        }
        IWad.copyDirectory(file, new File(file2, (String)IWad.MU(file)), true);
    }

    public static void copyDirectory(File file, File file2) throws IOException {
        IWad.copyDirectory(file, file2, true);
    }

    public static void copyDirectory(File file, File file2, boolean bl) throws IOException {
        if (file == null) {
            throw new NullPointerException(YEBy$TyVf.W("\u3d39\u4594\u308f\uce8a\ufcc2\ue4aa\u2f5f\u294b\u2175\u1574\ub1d7\u9886\u35bf\ufe8e\u7c47\ubd3c\u4d11\ud406\ucbc9\u3b8c\ucce1\u4757\u01e2"));
        }
        if (file2 == null) {
            throw new NullPointerException(YEBy$TyVf.W("\u3d2e\u459e\u3089\uce8c\ufcc8\ue4a1\u2f1e\u2952\u2169\u1568\ub1cd\u9886\u35bc\ufe94\u7c40\ubd68\u4d53\ud40d\ucb86\u3b96\uccb4\u4759\u01eb\u2a28\u4aeb\u90ba\u220c\uad38"));
        }
        if (IWad.MU(file) == false) {
            throw new FileNotFoundException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u3d39\u4594\u308f\uce8a\ufcc2\ue4aa\u2f5f\u2901")), file), YEBy$TyVf.W("\u3d4d\u45db\u309e\uce97\ufcc4\ue4bc\u2f5f\u2948\u216f\u1573\ub183\u98c3\u35a9\ufe88\u7c40\ubd68"))));
        }
        if (IWad.MU(file) == false) {
            throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u3d39\u4594\u308f\uce8a\ufcc2\ue4aa\u2f5f\u2901")), file), YEBy$TyVf.W("\u3d4d\u45db\u309f\uce80\ufcc8\ue4bc\u2f0b\u2955\u2120\u1565\ub1d6\u98d2\u35f1\ufe88\u7c40\ubd3c\u4d1d\ud40c\ucb9d\u3bc2\uccf5\u471b\u01ea\u2a61\u4af7\u90aa\u2203\uad20\u6de3\u1b7a\u8780"))));
        }
        if (IWad.MU(IWad.MU(file), IWad.MU(file2)) != false) {
            throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u3d39\u4594\u308f\uce8a\ufcc2\ue4aa\u2f5f\u2901")), file), YEBy$TyVf.W("\u3d4d\u45db\u309b\uce96\ufcc5\ue4ef\u2f1b\u2943\u2173\u1573\ub1ca\u98c8\u35b0\ufe95\u7c5a\ubd73\u4d1d\ud443\ucbce")), file2), YEBy$TyVf.W("\u3d4d\u45db\u309b\uce8a\ufcc4\ue4ef\u2f0b\u294e\u2165\u1527\ub1d0\u98c7\u35bc\ufe84"))));
        }
        IWad.DYFV(file, file2, bl);
    }

    private static void DYFV(File file, File file2, boolean bl) throws IOException {
        if (IWad.MU(file2) != false) {
            if (IWad.MU(file2) == false) {
                throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u6509\ufa4e\u7b71\ufc71\u503c\u445a\u1f6b\uab20\u8ca9\u5d67\u77fe\u0705\u0cc2")), file2), YEBy$TyVf.W("\u656a\ufa0b\u7b67\ufc7d\u503c\u4447\u1f7e\uab27\u8ce0\u5d6a\u77e5\u0751\u0cc5\u93e2\u42ba\u3f78\ua37a\uda91\u314c\uf662\uff51\u87fb\uab6f\u61c7\u5876\u79ce\u1db4\uee40\ue924\u59b3\u5935"))));
            }
        } else {
            if (IWad.MU(file2) == false) {
                throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u6509\ufa4e\u7b71\ufc71\u503c\u445a\u1f6b\uab20\u8ca9\u5d67\u77fe\u0705\u0cc2")), file2), YEBy$TyVf.W("\u656a\ufa0b\u7b66\ufc6c\u5027\u4451\u1f69\uab20\u8caf\u5d7a\u77e9\u0705\u0c86\u93ea\u42a7\u3f36\ua37b\uda8a\u3118\uf620\uff55\u87fb\uab68\u61dc\u5861\u79ca\u1da3\uee51\ue92f"))));
            }
            if (bl) {
                IWad.MU(file2, IWad.MU(file));
            }
        }
        if (IWad.MU(file2) == false) {
            throw new IOException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u6509\ufa4e\u7b71\ufc71\u503c\u445a\u1f6b\uab20\u8ca9\u5d67\u77fe\u0705\u0cc2")), file2), YEBy$TyVf.W("\u656a\ufa0b\u7b61\ufc64\u503b\u445a\u1f65\uab20\u8ce0\u5d6a\u77f5\u0705\u0c92\u93f9\u42a0\u3f2c\ua360\uda9b\u3156\uf662\uff44\u87b4"))));
        }
        File[] arrfile = (File[])IWad.MU(file);
        if (arrfile == null) {
            throw new IOException((String)IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u650b\ufa4a\u7b6b\ufc69\u5030\u4450\u1f2a\uab20\u8caf\u5d28\u77fc\u074c\u0c96\u93ff\u42e9\u3f3b\ua37b\uda90\u314c\uf627\uff5e\u87af\uab78\u618e\u586b\u79cd\u1df7")), file)));
        }
        int n = 0;
        while (n < arrfile.length) {
            File file3 = new File(file2, (String)IWad.MU(arrfile[n]));
            if (IWad.MU(arrfile[n]) != false) {
                IWad.DYFV(arrfile[n], file3, bl);
            } else {
                IWad.ssNb(arrfile[n], file3, bl);
            }
            ++n;
        }
    }

    public static void copyURLToFile(URL uRL, File file) throws IOException {
        if (IWad.MU(file) != null) {
            if (IWad.MU(IWad.MU(file)) == false) {
                IWad.MU(IWad.MU(file));
            }
        }
        if (IWad.MU(file) != false) {
            if (IWad.MU(file) == false) {
                Object object = IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u5ae3\u7706\u2d48\u16a2\u77e8\ucf2d\ud2c5\u65ca\u9869\u5bec\ud71f\uc704\u445a\u67e2\uaa69\ud42b\uef19\uf365\u8bcd\ue7a7")), file), YEBy$TyVf.W("\u5a96\u770e\u2d46\u16b2\u77a4\ucf3f\ud297\u65d7\u9872\u5ba5\ud71e\uc713\u4411")));
                throw new IOException((String)object);
            }
        }
        Object object = IWad.MU(uRL);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                IWad.MU(object, fileOutputStream);
            }
            finally {
                IWad.MU(fileOutputStream);
            }
        }
        finally {
            IWad.MU(object);
        }
    }

    public static void deleteDirectory(File file) throws IOException {
        if (IWad.MU(file) == false) {
            return;
        }
        IWad.cleanDirectory(file);
        if (IWad.MU(file) == false) {
            Object object = IWad.MU(IWad.MU(IWad.MU(new StringBuilder(rgig$AWxc.r("\uf6e6\u6cbe\u8f7d\ueb79\ue697\u308f\u48dd\u4a88\ub79f\u4bfa\uac1c\u291e\u45c5\u0764\u07b9\u72a8\ua3d0\u1aa4\u2976\uff5b\u9106\ud610\u0c19\u9e67\ue617\uc72c\u9765")), file), rgig$AWxc.r("\uf69d")));
            throw new IOException((String)object);
        }
    }

    public static void cleanDirectory(File file) throws IOException {
        if (IWad.MU(file) == false) {
            Object object = IWad.MU(IWad.MU(IWad.MU(new StringBuilder(), file), KUXS$dwji.S("\ud421\u1bd0\u151c\u876d\u84ac\u772b\ucb59\u34ca\u1a9b\u0108\u0904\u6675\u360e\u3f3d\u3a65")));
            throw new IllegalArgumentException((String)object);
        }
        if (IWad.MU(file) == false) {
            Object object = IWad.MU(IWad.MU(IWad.MU(new StringBuilder(), file), KUXS$dwji.S("\ud421\u1bdd\u1500\u8728\u84b1\u7764\ucb43\u3485\u1a8e\u0108\u0905\u6664\u3615\u3f2b\u3a72\uc506\u80a2\u9066\ufa0d")));
            throw new IllegalArgumentException((String)object);
        }
        File[] arrfile = (File[])IWad.MU(file);
        if (arrfile == null) {
            throw new IOException((String)IWad.MU(IWad.MU(new StringBuilder(KUXS$dwji.S("\ud447\u1bd5\u151a\u8764\u84ba\u776f\ucb17\u34d1\u1a80\u0108\u090d\u6664\u3614\u3f3a\u3a31\uc511\u80a2\u907a\ufa00\u2cf6\u1668\u697e\u0bae\ufb03\u14b1\u85ee\uecf8")), file)));
        }
        IOException iOException = null;
        int n = 0;
        while (n < arrfile.length) {
            File file2 = arrfile[n];
            try {
                IWad.forceDelete(file2);
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
        while (IWad.MU(file) == false) {
            if (n3++ >= 10) {
                n3 = 0;
                if (n2++ > n) {
                    return false;
                }
            }
            try {
                IWad.MU(100);
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
            Object object = IWad.MU(fileInputStream, string);
            return object;
        }
        finally {
            IWad.MU(fileInputStream);
        }
    }

    public static byte[] readFileToByteArray(File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byte[] arrby = (byte[])IWad.MU(fileInputStream);
            return arrby;
        }
        finally {
            IWad.MU(fileInputStream);
        }
    }

    public static List<String> readLines(File file, String string) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            Object object = IWad.MU(fileInputStream, string);
            return object;
        }
        finally {
            IWad.MU(fileInputStream);
        }
    }

    public static void writeStringToFile(File file, String string, String string2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            IWad.MU(string, fileOutputStream, string2);
        }
        finally {
            IWad.MU(fileOutputStream);
        }
    }

    public static void writeByteArrayToFile(File file, byte[] arrby) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            IWad.MU(fileOutputStream, arrby);
        }
        finally {
            IWad.MU(fileOutputStream);
        }
    }

    public static void writeLines(File file, String string, Collection<String> collection) throws IOException {
        IWad.writeLines(file, string, collection, null);
    }

    public static void writeLines(File file, String string, Collection<String> collection, String string2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            IWad.MU(collection, string2, fileOutputStream, string);
        }
        finally {
            IWad.MU(fileOutputStream);
        }
    }

    public static void forceDelete(File file) throws IOException {
        if (IWad.MU(file) != false) {
            IWad.deleteDirectory(file);
            return;
        }
        if (IWad.MU(file) == false) {
            throw new FileNotFoundException((String)IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\ub182\u6205\ue04d\uf71b\uaccd\ud745\ubea0\u1737\u3aed\u8c8b\u076b\uebb2\uf7ba\ueaad\uf93e\ue986\u30e0\uad60\u2358\ub015\ub8eb")), file)));
        }
        if (IWad.MU(file) == false) {
            Object object = IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\ub191\u6202\ue040\uf71c\uac81\ud744\ubeef\u1726\u3af1\u8c8b\u0761\uebb8\uf7a2\ueae8\uf92f\ue99b\u30a9\uad75\u2345\ub043\ub8ae\ua79f\u1a94")), file));
            throw new IOException((String)object);
        }
    }

    public static void forceDeleteOnExit(File file) throws IOException {
        if (IWad.MU(file) != false) {
            IWad.YoSa(file);
            return;
        }
        IWad.MU(file);
    }

    private static void YoSa(File file) throws IOException {
        if (IWad.MU(file) == false) {
            return;
        }
        IWad.jhSt(file);
        IWad.MU(file);
    }

    private static void jhSt(File file) throws IOException {
        if (IWad.MU(file) == false) {
            Object object = IWad.MU(IWad.MU(IWad.MU(new StringBuilder(), file), rgig$AWxc.r("\ub896\uc72b\uc12b\uf7cc\ua187\ua17f\u8de2\ue276\ufc43\ue020\ufe37\u3233\u6f03\uf5b3\u5444")));
            throw new IllegalArgumentException((String)object);
        }
        if (IWad.MU(file) == false) {
            Object object = IWad.MU(IWad.MU(IWad.MU(new StringBuilder(), file), rgig$AWxc.r("\ub896\uc726\uc137\uf789\ua19a\ua130\u8df8\ue239\ufc56\ue020\ufe36\u3222\u6f18\uf5a5\u5453\u5762\ubfb4\uede0\u45b2")));
            throw new IllegalArgumentException((String)object);
        }
        File[] arrfile = (File[])IWad.MU(file);
        if (arrfile == null) {
            throw new IOException((String)IWad.MU(IWad.MU(new StringBuilder(rgig$AWxc.r("\ub8f0\uc72e\uc12d\uf7c5\ua191\ua13b\u8dac\ue26d\ufc58\ue020\ufe3e\u3222\u6f19\uf5b4\u5410\u5775\ubfb4\uedfc\u45bf\ud0ae\udd8b\u1fc6\u438c\ud215\ud879\uab8d\ubbd5")), file)));
        }
        IOException iOException = null;
        int n = 0;
        while (n < arrfile.length) {
            File file2 = arrfile[n];
            try {
                IWad.forceDeleteOnExit(file2);
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
        if (IWad.MU(file) != false) {
            if (IWad.MU(file) != false) {
                Object object = IWad.MU(IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u5cf8\u55ea\u1851\u1ca7\uce8a")), file), YEBy$TyVf.W("\u5c9e\u55e6\u1845\u1cab\uced9\udca8\ubb06\uaa20\u9a33\uec09\uc61d\u84db\u9a6b\ufe0f\u3dd1\u1bec\u8b09\uacfd\u31b2\ubf0b\ueffe\u519d\ub06f\u8679\u4598\u59f3\ue49e\uf8dc\uc96c\u933f\ue219\uef8d\u9a76\u751c\ue7e7\u8a8d\u13e2\ua3fa\ub72a\u6c23L\ucfd1\ua47e\u80f3\ub7c8\ua0d4\ue37f\u9db2\u86a4\u9e1c\uaa98\ue86b\ufc64\u741e\u5501\uda45\u7c2d\u4b64\ue822")));
                throw new IOException((String)object);
            }
        } else if (IWad.MU(file) == false) {
            Object object = IWad.MU(IWad.MU(new StringBuilder(YEBy$TyVf.W("\u5ceb\u55ed\u185c\u1ca0\ucec6\udcb9\ubb55\uaa74\u9a3d\uec47\uc61a\u8489\u9a67\ufe1d\u3d85\u1be7\u8b46\uaced\u31fb\ubf18\uefbb\u519a\ub072\u8664\u458f\u59e9\ue4ca")), file));
            throw new IOException((String)object);
        }
    }

    public static long sizeOfDirectory(File file) {
        if (IWad.MU(file) == false) {
            Object object = IWad.MU(IWad.MU(IWad.MU(new StringBuilder(), file), rgig$AWxc.r("\u2947\u9ca9\u35d7\ufac2\u1547\u8bd0\uc018\u18da\uea77\u1f21\u696e\u7ab7\u379a\u69ea\ue607")));
            throw new IllegalArgumentException((String)object);
        }
        if (IWad.MU(file) == false) {
            Object object = IWad.MU(IWad.MU(IWad.MU(new StringBuilder(), file), rgig$AWxc.r("\u2947\u9ca4\u35cb\ufa87\u155a\u8b9f\uc002\u1895\uea62\u1f21\u696f\u7aa6\u3781\u69fc\ue610\u831e\u64c7\u93f3\ue2a1")));
            throw new IllegalArgumentException((String)object);
        }
        long l = 0;
        File[] arrfile = (File[])IWad.MU(file);
        if (arrfile == null) {
            return 0;
        }
        int n = 0;
        while (n < arrfile.length) {
            File file2 = arrfile[n];
            l = IWad.MU(file2) != false ? (l += IWad.sizeOfDirectory(file2)) : (l += IWad.MU(file2));
            ++n;
        }
        return l;
    }

    public static boolean isFileNewer(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException(rgig$AWxc.r("\ub20f\u290c\uc7d1\uc3e1\u2b1b\u5e40\uea74\u6b64\ud30b\udd5d\ucc29\u7a28\ud2c1\u733c\u913e\u0507\ub7ac\u95d8\u83ac\u0ebf\ucef3\u9272\ude3d\u1927\u5ec3\ua329\u5daf"));
        }
        if (IWad.MU(file2) == false) {
            throw new IllegalArgumentException((String)IWad.MU(IWad.MU(IWad.MU(new StringBuilder(rgig$AWxc.r("\ub215\u290b\uc794\uc3b2\u2b19\u5e40\uea71\u6b68\ud31f\udd51\ucc22\u7a2f\ud284\u736e\u913d\u0508\ub7a5\u95cf\u83e9\u0ef6")), file), rgig$AWxc.r("\ub266\u2943\uc795\uc3fd\u2b0e\u5e56\uea79\u6b2a\ud319\udd14\ucc29\u7a34\ud288\u733d\u912f"))));
        }
        return IWad.isFileNewer(file, (long)IWad.MU(file2));
    }

    public static boolean isFileNewer(File file, Date date) {
        if (date == null) {
            throw new IllegalArgumentException(KUXS$dwji.S("\u61c4\uf984\ud1b5\u5264\u1a46\u51ff\u6d81\uf672\uc79f\u753a\u7f6d\u5ff3\u7a5e\u98b4\u88b4\uce0d\u9e66"));
        }
        return IWad.isFileNewer(file, (long)IWad.MU(date));
    }

    public static boolean isFileNewer(File file, long l) {
        if (file == null) {
            throw new IllegalArgumentException(KUXS$dwji.S("\u61c4\uf984\ud1b5\u5264\u1a46\u51ff\u6d81\uf672\uc79f\u753a\u7f6d\u5ff3\u7a5e\u98b6\u88bc\uce15\u9e66"));
        }
        if (IWad.MU(file) == false) {
            return false;
        }
        if (IWad.MU(file) > l) {
            return true;
        }
        return false;
    }

    private static Object MU(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

