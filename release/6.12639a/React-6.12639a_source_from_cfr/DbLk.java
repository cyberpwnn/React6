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

public class DbLk {
    public static final long ONE_KB = 1024;
    public static final long ONE_MB = 0x100000;
    public static final long ONE_GB = 0x40000000;
    public static final File[] EMPTY_FILE_ARRAY;

    static {
        o.w(1064909576, new File[0]);
    }

    public static String byteCountToDisplaySize(long l) {
        Object object = l / 0x40000000 > 0 ? DbLk.ma(DbLk.ma(new StringBuilder((String)DbLk.ma(DbLk.ma(l / 0x40000000))), nJPf$sILv.G("\u6d29\u32d7\u4b8c"))) : (l / 0x100000 > 0 ? DbLk.ma(DbLk.ma(new StringBuilder((String)DbLk.ma(DbLk.ma(l / 0x100000))), nJPf$sILv.G("\u6d29\u32dd\u4b8c"))) : (l / 1024 > 0 ? DbLk.ma(DbLk.ma(new StringBuilder((String)DbLk.ma(DbLk.ma(l / 1024))), nJPf$sILv.G("\u6d29\u32db\u4b8c"))) : DbLk.ma(DbLk.ma(new StringBuilder((String)DbLk.ma(DbLk.ma(l))), nJPf$sILv.G("\u6d29\u32f2\u4bb7\u537d\ua487\uc1fd")))));
        return object;
    }

    public static void touch(File file) throws IOException {
        if (DbLk.ma(file) == false) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DbLk.ma(fileOutputStream);
        }
        DbLk.ma(file, DbLk.ma());
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
        if (DbLk.ma(DbLk.ma(var0), mrFx$WjFM.d("\u4305\u31ef\u3cf8\u0d07")) == false) {
            return null;
        }
        var1_1 = DbLk.ma(DbLk.ma(var0), 47, ((Character)o.k(60177155)).charValue());
        var2_2 = false;
        ** GOTO lbl31
lbl-1000: // 1 sources:
        {
            if (var2_2 + 2 < DbLk.ma(var1_1)) {
                var3_3 = DbLk.ma(var1_1, var2_2 + true, var2_2 + 3);
                var4_4 = DbLk.ma(var3_3, 16);
                var1_1 = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder((String)DbLk.ma(DbLk.ma(var1_1, false, var2_2))), var4_4), DbLk.ma(var1_1, var2_2 + 3)));
            }
lbl31: // 4 sources:
            v0 = DbLk.ma(var1_1, 37, var2_2);
            var2_2 = v0;
            ** while (v0 >= 0)
        }
lbl36: // 1 sources:
        return new File((String)var1_1);
    }

    public static File[] toFiles(URL[] arruRL) {
        if (arruRL == null || arruRL.length == 0) {
            return (File[])o.k(1064909576);
        }
        File[] arrfile = new File[arruRL.length];
        int n = 0;
        while (n < arruRL.length) {
            URL uRL = arruRL[n];
            if (uRL != null) {
                if (DbLk.ma(DbLk.ma(uRL), mrFx$WjFM.d("\u0bf1\u3dae\u6eab\u1524")) == false) {
                    throw new IllegalArgumentException((String)DbLk.ma(DbLk.ma(new StringBuilder(mrFx$WjFM.d("\u0bc2\u3d95\u6e8b\u1561\u6379\ucb9c\u9cd6\u988f\ua007\u2569\u284d\u3c27\uc92c\u03ac\uad44\u7268\u70b1\u1269\u4e81\u3377\u8ab5\u6154\u2fec\u5219\uc39b\uc811\ue0b9\ufbf6\u3327\u709e\udc6d\u6ed6\u3875\u84b9\u29d8\u5477\ub0ae\uba75")), uRL)));
                }
                arrfile[n] = DbLk.toFile(uRL);
            }
            ++n;
        }
        return arrfile;
    }

    public static URL[] toURLs(File[] arrfile) throws IOException {
        URL[] arruRL = new URL[arrfile.length];
        int n = 0;
        while (n < arruRL.length) {
            arruRL[n] = DbLk.ma(arrfile[n]);
            ++n;
        }
        return arruRL;
    }

    public static void copyFileToDirectory(File file, File file2) throws IOException {
        if (file2 == null) {
            throw new NullPointerException(nJPf$sILv.G("\u83fa\u961f\u6bec\uca44\uc187\ub46e\u639d\uf043\u644f\u938a\ua040\uf90b\u4049\ufa06\u6774\ue06c\ud274\ub251\u2c30\uf917\u4bb8\uce64\u230c\u6f96\u4695\u04af\u4604\u889a"));
        }
        if (DbLk.ma(file2) != false) {
            if (DbLk.ma(file2) == false) {
                throw new IllegalArgumentException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\u83fa\u961f\u6bec\uca44\uc187\ub46e\u639d\uf043\u644f\u938a\ua040\uf90b\u4003")), file2), nJPf$sILv.G("\u8399\u965a\u6bf6\uca43\uc1ce\ub46e\u6393\uf043\u6406\u9384\ua00e\uf94f\u404d\ufa01\u6762\ue07b\ud220\ub250\u2c2d\uf91a"))));
            }
        }
        DbLk.copyFile(file, new File(file2, (String)DbLk.ma(file)), true);
    }

    public static void copyFile(File file, File file2) throws IOException {
        DbLk.copyFile(file, file2, true);
    }

    public static void copyFile(File file, File file2, boolean bl) throws IOException {
        if (file == null) {
            throw new NullPointerException(FMkR$WjFM.a("\u288e\ud8fc\ua286\u3364\ueff2\u7016\u4761\u1d23\uf760\u9e0c\u49d0\uffb8\u193b\u44b7\ue527\u5085\uc1a3\u951e\uc3a7\u474a\u55b8\u030b\u3a9b"));
        }
        if (file2 == null) {
            throw new NullPointerException(FMkR$WjFM.a("\u2899\ud8f6\ua280\u3362\ueff8\u701d\u4720\u1d3a\uf77c\u9e10\u49ca\uffb8\u1938\u44ad\ue520\u50d1\uc1e1\u9515\uc3e8\u4750\u55ed\u0305\u3a92\u6858\u18c2\u7cea\u3907\u20fc"));
        }
        if (DbLk.ma(file) == false) {
            throw new FileNotFoundException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u288e\ud8fc\ua286\u3364\ueff2\u7016\u4761\u1d69")), file), FMkR$WjFM.a("\u28fa\ud8b3\ua297\u3379\ueff4\u7000\u4761\u1d20\uf77a\u9e0b\u4984\ufffd\u192d\u44b1\ue520\u50d1"))));
        }
        if (DbLk.ma(file) != false) {
            throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u288e\ud8fc\ua286\u3364\ueff2\u7016\u4761\u1d69")), file), FMkR$WjFM.a("\u28fa\ud8b3\ua296\u336e\ueff8\u7000\u4735\u1d3d\uf735\u9e1d\u49d1\uffec\u1975\u44b1\ue520\u5085\uc1a0\u955b\uc3e3\u474d\u55bf\u0302\u3a94\u680c\u18c3\u7ced\u3912"))));
        }
        if (DbLk.ma(DbLk.ma(file), DbLk.ma(file2)) != false) {
            throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u288e\ud8fc\ua286\u3364\ueff2\u7016\u4761\u1d69")), file), FMkR$WjFM.a("\u28fa\ud8b3\ua292\u3378\ueff5\u7053\u4725\u1d2b\uf766\u9e0b\u49cd\ufff6\u1934\u44ac\ue53a\u50ca\uc1af\u955b\uc3a0")), file2), FMkR$WjFM.a("\u28fa\ud8b3\ua292\u3364\ueff4\u7053\u4735\u1d26\uf770\u9e5f\u49d7\ufff9\u1938\u44bd"))));
        }
        if (DbLk.ma(file2) != null) {
            if (DbLk.ma(DbLk.ma(file2)) == false) {
                if (DbLk.ma(DbLk.ma(file2)) == false) {
                    throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u2899\ud8f6\ua280\u3362\ueff8\u701d\u4720\u1d3a\uf77c\u9e10\u49ca\uffb8\u1972")), file2), FMkR$WjFM.a("\u28fa\ud8b3\ua297\u337f\uefe3\u7016\u4722\u1d3a\uf77a\u9e0d\u49dd\uffb8\u1936\u44b9\ue53d\u50cb\uc1ae\u950f\uc3a7\u4746\u55a8\u0347\u3a94\u680a\u18c9\u7cfe\u391f\u20f5\ua83b"))));
                }
            }
        }
        if (DbLk.ma(file2) != false) {
            if (DbLk.ma(file2) == false) {
                throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u2899\ud8f6\ua280\u3362\ueff8\u701d\u4720\u1d3a\uf77c\u9e10\u49ca\uffb8\u1972")), file2), FMkR$WjFM.a("\u28fa\ud8b3\ua296\u336e\ueff8\u7000\u4735\u1d3d\uf735\u9e1d\u49d1\uffec\u1975\u44b1\ue520\u5085\uc1b3\u951e\uc3e6\u4740\u55e0\u0308\u3a99\u6814\u18d5"))));
            }
        }
        DbLk.yJLS(file, file2, bl);
    }

    private static void yJLS(File file, File file2, boolean bl) throws IOException {
        if (DbLk.ma(file2) != false) {
            if (DbLk.ma(file2) != false) {
                throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u64ef\uf0ea\u5029\uc138\u8ce1\u6322\ub1ae\u7d97\u1fc1\u34a2\u98bc\u60c7\ueb8c")), file2), FMkR$WjFM.a("\u648c\uf0af\u503f\uc134\u8ce1\u633f\ub1bb\u7d90\u1f88\u34af\u98a7\u6093\ueb8b\uf8fc\u4fb5\uc992\udf1d\u5e48\u372e\ueb90\u8532\ufddf\u6585\ua842\ub11e\u1949\u11c9"))));
            }
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                DbLk.ma(fileInputStream, fileOutputStream);
            }
            finally {
                DbLk.ma(fileOutputStream);
            }
        }
        finally {
            DbLk.ma(fileInputStream);
        }
        if (DbLk.ma(file) != DbLk.ma(file2)) {
            throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u64ed\uf0ee\u5033\uc120\u8ced\u6328\ub1ef\u7d97\u1fc7\u34ed\u98b1\u6088\uebdb\uf8ec\u4fe6\uc9d4\udf09\u5e04\u3726\uebd9\u8523\ufdd5\u6588\ua842\ub114\u1955\u11c4\u76f0\u79e9\ud7e1\uf716\ufbea\ufd0f\u1db8\uec41")), file), FMkR$WjFM.a("\u648c\uf0af\u502e\uc123\u8ca8\u636b")), file2), FMkR$WjFM.a("\u648c"))));
        }
        if (bl) {
            DbLk.ma(file2, DbLk.ma(file));
        }
    }

    public static void copyDirectoryToDirectory(File file, File file2) throws IOException {
        if (file == null) {
            throw new NullPointerException(nJPf$sILv.G("\udead\u1679\u479c\u5a5b\u2f99\uea5d\uab74\u18ed\u7ad3\u2d2a\u57c2\u4850\u6067\u4c6d\uf4c0\u1c0b\u139e\u7b9c\u90f8\u6966\u6a0d\u8d3f\u700c"));
        }
        if (DbLk.ma(file) != false) {
            if (DbLk.ma(file) == false) {
                throw new IllegalArgumentException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\udead\u1679\u479c\u5a5b\u2f99\uea5d\uab74\u18a7")), file2), nJPf$sILv.G("\uded9\u1636\u4780\u5a5a\u2fda\uea56\uab3b\u18f4\u7a86\u2d38\u5796\u4814\u6060\u4c70\uf4d1\u1c48\u1388\u7b96\u90aa\u6971"))));
            }
        }
        if (file2 == null) {
            throw new NullPointerException(nJPf$sILv.G("\udeba\u1673\u479a\u5a5d\u2f93\uea56\uab35\u18f4\u7acf\u2d36\u57d8\u4850\u6064\u4c77\uf4c7\u1c5f\u13dc\u7b97\u90b7\u697c\u6a58\u8d31\u7005\uc0b5\u7e37\uca60\u8b81\u6ed9"));
        }
        if (DbLk.ma(file2) != false) {
            if (DbLk.ma(file2) == false) {
                throw new IllegalArgumentException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\udeba\u1673\u479a\u5a5d\u2f93\uea56\uab35\u18f4\u7acf\u2d36\u57d8\u4850\u602e")), file2), nJPf$sILv.G("\uded9\u1636\u4780\u5a5a\u2fda\uea56\uab3b\u18f4\u7a86\u2d38\u5796\u4814\u6060\u4c70\uf4d1\u1c48\u1388\u7b96\u90aa\u6971"))));
            }
        }
        DbLk.copyDirectory(file, new File(file2, (String)DbLk.ma(file)), true);
    }

    public static void copyDirectory(File file, File file2) throws IOException {
        DbLk.copyDirectory(file, file2, true);
    }

    public static void copyDirectory(File file, File file2, boolean bl) throws IOException {
        if (file == null) {
            throw new NullPointerException(FMkR$WjFM.a("\u278d\u6d07\ud433\ue03b\u082e\u5450\ua622\ud017\u4e2a\u9346\u8296\ube5a\u77da\udb3f\u3d1e\u50a7\u919a\uc965\u8d0a\u7dab\u3e12\u95e8\u205e"));
        }
        if (file2 == null) {
            throw new NullPointerException(FMkR$WjFM.a("\u279a\u6d0d\ud435\ue03d\u0824\u545b\ua663\ud00e\u4e36\u935a\u828c\ube5a\u77d9\udb25\u3d19\u50f3\u91d8\uc96e\u8d45\u7db1\u3e47\u95e6\u2057\ue64e\u5c1e\uc2d5\ucc0d\u49ec"));
        }
        if (DbLk.ma(file) == false) {
            throw new FileNotFoundException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u278d\u6d07\ud433\ue03b\u082e\u5450\ua622\ud05d")), file), FMkR$WjFM.a("\u27f9\u6d48\ud422\ue026\u0828\u5446\ua622\ud014\u4e30\u9341\u82c2\ube1f\u77cc\udb39\u3d19\u50f3"))));
        }
        if (DbLk.ma(file) == false) {
            throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u278d\u6d07\ud433\ue03b\u082e\u5450\ua622\ud05d")), file), FMkR$WjFM.a("\u27f9\u6d48\ud423\ue031\u0824\u5446\ua676\ud009\u4e7f\u9357\u8297\ube0e\u7794\udb39\u3d19\u50a7\u9196\uc96f\u8d5e\u7de5\u3e06\u95a4\u2056\ue607\u5c02\uc2c5\ucc02\u49f4\u8f52\ucccd\u2df8"))));
        }
        if (DbLk.ma(DbLk.ma(file), DbLk.ma(file2)) != false) {
            throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\u278d\u6d07\ud433\ue03b\u082e\u5450\ua622\ud05d")), file), FMkR$WjFM.a("\u27f9\u6d48\ud427\ue027\u0829\u5415\ua666\ud01f\u4e2c\u9341\u828b\ube14\u77d5\udb24\u3d03\u50e8\u9196\uc920\u8d0d")), file2), FMkR$WjFM.a("\u27f9\u6d48\ud427\ue03b\u0828\u5415\ua676\ud012\u4e3a\u9315\u8291\ube1b\u77d9\udb35"))));
        }
        DbLk.UtIU(file, file2, bl);
    }

    private static void UtIU(File file, File file2, boolean bl) throws IOException {
        if (DbLk.ma(file2) != false) {
            if (DbLk.ma(file2) == false) {
                throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\u148c\ub457\u5b59\ucab0\u7a3d\uab63\u465a\u2cd2\u6bbd\ue693\u32cc\ue5c4\u11e6")), file2), nJPf$sILv.G("\u14ef\ub412\u5b4f\ucabc\u7a3d\uab7e\u464f\u2cd5\u6bf4\ue69e\u32d7\ue590\u11e1\u9d95\u3456\ue72d\u8abc\u565f\ueb33\u07f4\u3758\uccc0\u0c5e\ucf07\ua335\u67e2\ubd50\u73fa\u9635\u19b9\ue682"))));
            }
        } else {
            if (DbLk.ma(file2) == false) {
                throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\u148c\ub457\u5b59\ucab0\u7a3d\uab63\u465a\u2cd2\u6bbd\ue693\u32cc\ue5c4\u11e6")), file2), nJPf$sILv.G("\u14ef\ub412\u5b4e\ucaad\u7a26\uab68\u4658\u2cd2\u6bbb\ue68e\u32db\ue5c4\u11a2\u9d9d\u344b\ue763\u8abd\u5644\ueb67\u07b6\u375c\uccc0\u0c59\ucf1c\ua322\u67e6\ubd47\u73eb\u963e"))));
            }
            if (bl) {
                DbLk.ma(file2, DbLk.ma(file));
            }
        }
        if (DbLk.ma(file2) == false) {
            throw new IOException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\u148c\ub457\u5b59\ucab0\u7a3d\uab63\u465a\u2cd2\u6bbd\ue693\u32cc\ue5c4\u11e6")), file2), nJPf$sILv.G("\u14ef\ub412\u5b49\ucaa5\u7a3a\uab63\u4654\u2cd2\u6bf4\ue69e\u32c7\ue5c4\u11b6\u9d8e\u344c\ue779\u8aa6\u5655\ueb29\u07f4\u374d\ucc8f"))));
        }
        File[] arrfile = (File[])DbLk.ma(file);
        if (arrfile == null) {
            throw new IOException((String)DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\u148e\ub453\u5b43\ucaa8\u7a31\uab69\u461b\u2cd2\u6bbb\ue6dc\u32ce\ue58d\u11b2\u9d88\u3405\ue76e\u8abd\u565e\ueb33\u07b1\u3757\ucc94\u0c49\ucf4e\ua328\u67e1\ubd13")), file)));
        }
        int n = 0;
        while (n < arrfile.length) {
            File file3 = new File(file2, (String)DbLk.ma(arrfile[n]));
            if (DbLk.ma(arrfile[n]) != false) {
                DbLk.UtIU(arrfile[n], file3, bl);
            } else {
                DbLk.yJLS(arrfile[n], file3, bl);
            }
            ++n;
        }
    }

    public static void copyURLToFile(URL uRL, File file) throws IOException {
        if (DbLk.ma(file) != null) {
            if (DbLk.ma(DbLk.ma(file)) == false) {
                DbLk.ma(DbLk.ma(file));
            }
        }
        if (DbLk.ma(file) != false) {
            if (DbLk.ma(file) == false) {
                Object object = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(FMkR$WjFM.a("\uaf37\u467c\ucdb5\u4ccd\u2e80\u25f7\ueb83\u1963\u9489\u597a\u3592\u2a80\u098f\u92cd\ucf11\u2ec6\ua2a2\u9513\u51de\uf5bb")), file), FMkR$WjFM.a("\uaf42\u4674\ucdbb\u4cdd\u2ecc\u25e5\uebd1\u197e\u9492\u5933\u3593\u2a97\u09c4")));
                throw new IOException((String)object);
            }
        }
        Object object = DbLk.ma(uRL);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                DbLk.ma(object, fileOutputStream);
            }
            finally {
                DbLk.ma(fileOutputStream);
            }
        }
        finally {
            DbLk.ma(object);
        }
    }

    public static void deleteDirectory(File file) throws IOException {
        if (DbLk.ma(file) == false) {
            return;
        }
        DbLk.cleanDirectory(file);
        if (DbLk.ma(file) == false) {
            Object object = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\ua897\ud9ad\ud88f\u5fa5\u3b20\u6cae\u9f54\uc96d\u25a9\u820b\u4bbf\u5c48\ub387\ua0b1\u042a\u5957\u978b\ua039\ufa47\u9225\u0768\ue9f5\u8197\u8d94\u4f55\u3af7\ua92b")), file), nJPf$sILv.G("\ua8ec")));
            throw new IOException((String)object);
        }
    }

    public static void cleanDirectory(File file) throws IOException {
        if (DbLk.ma(file) == false) {
            Object object = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(), file), mrFx$WjFM.d("\uc521\ue380\u8fbb\u405b\ub942\u43ff\ud4d6\u9730\u651e\u979d\u5bc0\u0e61\u42ac\u1778\ufe95")));
            throw new IllegalArgumentException((String)object);
        }
        if (DbLk.ma(file) == false) {
            Object object = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(), file), mrFx$WjFM.d("\uc521\ue38d\u8fa7\u401e\ub95f\u43b0\ud4cc\u977f\u650b\u979d\u5bc1\u0e70\u42b7\u176e\ufe82\u48ba\uad63\u48d5\uda7f")));
            throw new IllegalArgumentException((String)object);
        }
        File[] arrfile = (File[])DbLk.ma(file);
        if (arrfile == null) {
            throw new IOException((String)DbLk.ma(DbLk.ma(new StringBuilder(mrFx$WjFM.d("\uc547\ue385\u8fbd\u4052\ub954\u43bb\ud498\u972b\u6505\u979d\u5bc9\u0e70\u42b6\u177f\ufec1\u48ad\uad63\u48c9\uda72\uc2c9\u26dd\ub0a5\u8630\ub135\u6022\u9341\u727c")), file)));
        }
        IOException iOException = null;
        int n = 0;
        while (n < arrfile.length) {
            File file2 = arrfile[n];
            try {
                DbLk.forceDelete(file2);
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
        while (DbLk.ma(file) == false) {
            if (n3++ >= 10) {
                n3 = 0;
                if (n2++ > n) {
                    return false;
                }
            }
            try {
                DbLk.ma(100);
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
            Object object = DbLk.ma(fileInputStream, string);
            return object;
        }
        finally {
            DbLk.ma(fileInputStream);
        }
    }

    public static byte[] readFileToByteArray(File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byte[] arrby = (byte[])DbLk.ma(fileInputStream);
            return arrby;
        }
        finally {
            DbLk.ma(fileInputStream);
        }
    }

    public static List<String> readLines(File file, String string) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            Object object = DbLk.ma(fileInputStream, string);
            return object;
        }
        finally {
            DbLk.ma(fileInputStream);
        }
    }

    public static void writeStringToFile(File file, String string, String string2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            DbLk.ma(string, fileOutputStream, string2);
        }
        finally {
            DbLk.ma(fileOutputStream);
        }
    }

    public static void writeByteArrayToFile(File file, byte[] arrby) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            DbLk.ma(fileOutputStream, arrby);
        }
        finally {
            DbLk.ma(fileOutputStream);
        }
    }

    public static void writeLines(File file, String string, Collection<String> collection) throws IOException {
        DbLk.writeLines(file, string, collection, null);
    }

    public static void writeLines(File file, String string, Collection<String> collection, String string2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            DbLk.ma(collection, string2, fileOutputStream, string);
        }
        finally {
            DbLk.ma(fileOutputStream);
        }
    }

    public static void forceDelete(File file) throws IOException {
        if (DbLk.ma(file) != false) {
            DbLk.deleteDirectory(file);
            return;
        }
        if (DbLk.ma(file) == false) {
            throw new FileNotFoundException((String)DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\uc61e\u99bf\u727e\ued53\uc930\u4a8b\ud875\u2973\u04cf\ua520\u3d5d\uf66b\ufe4a\u8a81\u4538\u44e9\u835c\u907d\ub903\uec66\uc3cc")), file)));
        }
        if (DbLk.ma(file) == false) {
            Object object = DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\uc60d\u99b8\u7273\ued54\uc97c\u4a8a\ud83a\u2962\u04d3\ua520\u3d57\uf661\ufe52\u8ac4\u4529\u44f4\u8315\u9068\ub91e\uec30\uc389\u0906\u6d6d")), file));
            throw new IOException((String)object);
        }
    }

    public static void forceDeleteOnExit(File file) throws IOException {
        if (DbLk.ma(file) != false) {
            DbLk.TEqA(file);
            return;
        }
        DbLk.ma(file);
    }

    private static void TEqA(File file) throws IOException {
        if (DbLk.ma(file) == false) {
            return;
        }
        DbLk.KTiK(file);
        DbLk.ma(file);
    }

    private static void KTiK(File file) throws IOException {
        if (DbLk.ma(file) == false) {
            Object object = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(), file), nJPf$sILv.G("\ua57e\uce0f\udc6a\u8cea\u4fea\u6d80\u6357\ue35f\uf88d\u4ff0\u955f\udf6d\u36f7\u78c1\u050f")));
            throw new IllegalArgumentException((String)object);
        }
        if (DbLk.ma(file) == false) {
            Object object = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(), file), nJPf$sILv.G("\ua57e\uce02\udc76\u8caf\u4ff7\u6dcf\u634d\ue310\uf898\u4ff0\u955e\udf7c\u36ec\u78d7\u0518\u3741\u9eaf\u4efc\uae9d")));
            throw new IllegalArgumentException((String)object);
        }
        File[] arrfile = (File[])DbLk.ma(file);
        if (arrfile == null) {
            throw new IOException((String)DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\ua518\uce0a\udc6c\u8ce3\u4ffc\u6dc4\u6319\ue344\uf896\u4ff0\u9556\udf7c\u36ed\u78c6\u055b\u3756\u9eaf\u4ee0\uae90\u0903\u4fc1\u184b\uc779\ua67e\ufa52\u548c\ube88")), file)));
        }
        IOException iOException = null;
        int n = 0;
        while (n < arrfile.length) {
            File file2 = arrfile[n];
            try {
                DbLk.forceDeleteOnExit(file2);
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
        if (DbLk.ma(file) != false) {
            if (DbLk.ma(file) != false) {
                Object object = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\u03d7\u4a61\u13bc\u6929\u9299")), file), nJPf$sILv.G("\u03b1\u4a6d\u13a8\u6925\u92ca\ue3af\ubb65\udc01\uf6ec\ue26d\u0879\u98ef\u4cfd\uee0c\u553d\u18f8\u24af\ua8dd\u3dd8\ufb66\u4455\ubf3e\uc127\u555a\ubd36\u7e96\uaf5d\ub780\u2910\ufcca\u2fa7\u9cc5\uc465\u46f1\u971d\u6dfc\u6987\ub0a2\u0fae\u98b6\u70ee\u762f\u7d82\uf832\u8c73\u0c46\u5fe2\ue4b9\u6bb4\u67c8\u59a1\u52a4\u0944\u6416\u5b49\u4f74\uf39d\u1011\u7e99")));
                throw new IOException((String)object);
            }
        } else if (DbLk.ma(file) == false) {
            Object object = DbLk.ma(DbLk.ma(new StringBuilder(nJPf$sILv.G("\u03c4\u4a66\u13b1\u692e\u92d5\ue3be\ubb36\udc55\uf6e2\ue223\u087e\u98bd\u4cf1\uee1e\u5569\u18f3\u24e0\ua8cd\u3d91\ufb75\u4410\ubf39\uc13a\u5547\ubd21\u7e8c\uaf09")), file));
            throw new IOException((String)object);
        }
    }

    public static long sizeOfDirectory(File file) {
        if (DbLk.ma(file) == false) {
            Object object = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(), file), FMkR$WjFM.a("\u1aee\ueb22\uefc9\udceb\u09e4\ueaea\u7b7e\u6970\u73ec\ua87a\ub71a\u7d71\u9ec1\u830b\ub2c9")));
            throw new IllegalArgumentException((String)object);
        }
        if (DbLk.ma(file) == false) {
            Object object = DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(), file), FMkR$WjFM.a("\u1aee\ueb2f\uefd5\udcae\u09f9\ueaa5\u7b64\u693f\u73f9\ua87a\ub71b\u7d60\u9eda\u831d\ub2de\ua260\u6ffe\u75c2\ud252")));
            throw new IllegalArgumentException((String)object);
        }
        long l = 0;
        File[] arrfile = (File[])DbLk.ma(file);
        if (arrfile == null) {
            return 0;
        }
        int n = 0;
        while (n < arrfile.length) {
            File file2 = arrfile[n];
            l = DbLk.ma(file2) != false ? (l += DbLk.sizeOfDirectory(file2)) : (l += DbLk.ma(file2));
            ++n;
        }
        return l;
    }

    public static boolean isFileNewer(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u1bc7\uacb0\u1914\uc958\ucf86\ub4b9\u8a1f\u8b45\u4ddf\u61fc\u8891\ua7c3\u8922\u1099\ube6d\ub1c4\uf603\u94f7\uf1e1\ud396\ufb38\u3153\u4cf6\ua57b\uc999\u10a5\u4925"));
        }
        if (DbLk.ma(file2) == false) {
            throw new IllegalArgumentException((String)DbLk.ma(DbLk.ma(DbLk.ma(new StringBuilder(mrFx$WjFM.d("\u1bdd\uacb7\u1951\uc90b\ucf84\ub4b9\u8a1a\u8b49\u4dcb\u61f0\u889a\ua7c4\u8967\u10cb\ube6e\ub1cb\uf60a\u94e0\uf1a4\ud3df")), file), mrFx$WjFM.d("\u1bae\uacff\u1950\uc944\ucf93\ub4af\u8a12\u8b0b\u4dcd\u61b5\u8891\ua7df\u896b\u1098\ube7c"))));
        }
        return DbLk.isFileNewer(file, (long)DbLk.ma(file2));
    }

    public static boolean isFileNewer(File file, Date date) {
        if (date == null) {
            throw new IllegalArgumentException(mrFx$WjFM.d("\u1bc7\uacb0\u1914\uc958\ucf86\ub4b9\u8a1f\u8b45\u4ddf\u61fc\u8891\ua7c3\u8922\u108f\ube69\ub1d6\uf603"));
        }
        return DbLk.isFileNewer(file, (long)DbLk.ma(date));
    }

    public static boolean isFileNewer(File file, long l) {
        if (file == null) {
            throw new IllegalArgumentException(nJPf$sILv.G("\uc574\u9e83\ub932\ufd57\u2388\u7236\u4c1a\u7c6f\ue7bc\u5d23\u2609\u948a\u8963\u6187\uef08\u24fc\u9f8f"));
        }
        if (DbLk.ma(file) == false) {
            return false;
        }
        if (DbLk.ma(file) > l) {
            return true;
        }
        return false;
    }

    private static Object ma(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

