/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.bukkit.plugin.Plugin;

public class FhLM {
    private static ktOu<String, wfPa<String>> SLec;

    static {
        cv.V(-2090273637, new ktOu());
    }

    public static wfPa<Plugin> DXfX(String string) {
        wfPa<Plugin> wfPa2 = new wfPa<Plugin>();
        Object object = FhLM.Hh(FhLM.Hh((ktOu)cv.e(-2090273637)));
        block0 : while (object.hasNext()) {
            String string2 = (String)object.next();
            Object object2 = FhLM.Hh((wfPa)FhLM.Hh((ktOu)cv.e(-2090273637), string2));
            while (object2.hasNext()) {
                String string3 = (String)object2.next();
                if (FhLM.Hh(string3, string) == false) continue;
                FhLM.Hh(wfPa2, FhLM.Hh().getPlugin(string2));
                continue block0;
            }
        }
        return wfPa2;
    }

    public static void sHhL() throws IOException {
        File file = new File(YEBy$TyVf.W("\u8d87\ud0ae\ue0a8\u0b47\u341c\u949a\u22b1"));
        File[] arrfile = (File[])FhLM.Hh(file);
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            block11 : {
                File file2 = arrfile[n2];
                if (FhLM.Hh(file2) == false) break block11;
                if (FhLM.Hh(FhLM.Hh(file2), YEBy$TyVf.W("\u8dd9\ud0a8\ue0bc\u0b52")) == false) break block11;
                wfPa wfPa2 = new wfPa();
                Object object = null;
                File file3 = file2;
                FileInputStream fileInputStream = new FileInputStream(file3);
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                Object object2 = FhLM.Hh(zipInputStream);
                while (object2 != null) {
                    block13 : {
                        Object object3;
                        block12 : {
                            if (FhLM.Hh(object2) != false) break block12;
                            if (FhLM.Hh(FhLM.Hh(object2), YEBy$TyVf.W("\u8dd9\ud0a1\ue0b1\u0b41\u3406\u9487")) == false) break block12;
                            if (FhLM.Hh(FhLM.Hh(object2), YEBy$TyVf.W("\u8dd3")) != false) break block13;
                            object3 = FhLM.Hh(FhLM.Hh(FhLM.Hh(object2), YEBy$TyVf.W("\u8dd8"), YEBy$TyVf.W("\u8dd9")), YEBy$TyVf.W("\u8dd9\ud0a1\ue0b1\u0b41\u3406\u9487"), "");
                            FhLM.Hh(wfPa2, object3);
                        }
                        if (FhLM.Hh(object2) == false) {
                            if (FhLM.Hh(FhLM.Hh(object2), YEBy$TyVf.W("\u8dd9\ud0a1\ue0b1\u0b41\u3406\u9487")) == false) {
                                if (FhLM.Hh(FhLM.Hh(object2), YEBy$TyVf.W("\u8d87\ud0ae\ue0a8\u0b47\u341c\u949a\u22ec\u9b37\udfb1\u40b9")) != false) {
                                    object3 = FhLM.IWSm(file3, (String)FhLM.Hh(object2));
                                    String[] arrstring = (String[])FhLM.Hh(object3, YEBy$TyVf.W("\u8dfd"));
                                    int n3 = arrstring.length;
                                    int n4 = 0;
                                    while (n4 < n3) {
                                        String string = arrstring[n4];
                                        if (FhLM.Hh(string, YEBy$TyVf.W("\u8d99\ud0a3\ue0b0\u0b45\u344f")) != false) {
                                            object = FhLM.Hh(((String[])FhLM.Hh(string, YEBy$TyVf.W("\u8dcd")))[1]);
                                        }
                                        ++n4;
                                    }
                                }
                            }
                        }
                    }
                    object2 = FhLM.Hh(zipInputStream);
                }
                FhLM.Hh(zipInputStream);
                if (object != null) {
                    FhLM.Hh((ktOu)cv.e(-2090273637), object, wfPa2);
                    FhLM.Hh(FhLM.Hh(FhLM.Hh(FhLM.Hh(FhLM.Hh(FhLM.Hh(new StringBuilder(YEBy$TyVf.W("\u8dbe\ud0a6\ue0b8\u0b4e\u3401\u949d\u22a4\u9b27\udfb9\u40b1\uae87")), object), YEBy$TyVf.W("\u8dd7\ud0b5\ue0b4\u0b54\u341d\u94d4")), FhLM.Hh(wfPa2)), YEBy$TyVf.W("\u8dd7\ud0b1\ue0b4\u0b47\u341b\u9495\u22b6\u9b3b\udfae\u40b0\uaed4\u8288"))));
                }
            }
            ++n2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static String IWSm(File var0, String var1_1) throws IOException {
        var2_2 = var1_1;
        var3_3 = var0;
        var4_4 = new ZipFile(var3_3);
        var5_5 = FhLM.Hh(var4_4);
        while (var5_5.hasMoreElements()) {
            var6_6 = (ZipEntry)var5_5.nextElement();
            if (FhLM.Hh(FhLM.Hh(var6_6), var2_2) == false) continue;
            var7_7 = FhLM.Hh(var4_4, var6_6);
            var8_8 = new InputStreamReader((InputStream)var7_7);
            var9_9 = new BufferedReader(var8_8);
            var10_10 = "";
            ** GOTO lbl28
        }
        FhLM.Hh(var4_4);
        return null;
lbl-1000: // 1 sources:
        {
            var10_10 = FhLM.Hh(FhLM.Hh(FhLM.Hh(new StringBuilder((String)FhLM.Hh(var10_10)), var11_11), YEBy$TyVf.W("\u4912")));
lbl28: // 2 sources:
            ** while ((var11_11 = FhLM.Hh(var9_9)) != null)
        }
lbl29: // 1 sources:
        FhLM.Hh(var9_9);
        return var10_10;
    }

    private static Object Hh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

