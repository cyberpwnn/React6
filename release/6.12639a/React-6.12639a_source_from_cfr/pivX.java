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

public class pivX {
    private static TNku<String, feCR<String>> aFGJ;

    static {
        o.w(-853324479, new TNku());
    }

    public static feCR<Plugin> qlgl(String string) {
        feCR<Plugin> feCR2 = new feCR<Plugin>();
        Object object = pivX.Rk(pivX.Rk((TNku)o.k(-853324479)));
        block0 : while (object.hasNext()) {
            String string2 = (String)object.next();
            Object object2 = pivX.Rk((feCR)pivX.Rk((TNku)o.k(-853324479), string2));
            while (object2.hasNext()) {
                String string3 = (String)object2.next();
                if (pivX.Rk(string3, string) == false) continue;
                pivX.Rk(feCR2, pivX.Rk().getPlugin(string2));
                continue block0;
            }
        }
        return feCR2;
    }

    public static void tfGc() throws IOException {
        File file = new File(nJPf$sILv.G("\u53b2\u4874\u8b84\u8042\uea28\u6d12\u93e3"));
        File[] arrfile = (File[])pivX.Rk(file);
        int n = arrfile.length;
        int n2 = 0;
        while (n2 < n) {
            block11 : {
                File file2 = arrfile[n2];
                if (pivX.Rk(file2) == false) break block11;
                if (pivX.Rk(pivX.Rk(file2), nJPf$sILv.G("\u53ec\u4872\u8b90\u8057")) == false) break block11;
                feCR feCR2 = new feCR();
                Object object = null;
                File file3 = file2;
                FileInputStream fileInputStream = new FileInputStream(file3);
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                Object object2 = pivX.Rk(zipInputStream);
                while (object2 != null) {
                    block13 : {
                        Object object3;
                        block12 : {
                            if (pivX.Rk(object2) != false) break block12;
                            if (pivX.Rk(pivX.Rk(object2), nJPf$sILv.G("\u53ec\u487b\u8b9d\u8044\uea32\u6d0f")) == false) break block12;
                            if (pivX.Rk(pivX.Rk(object2), nJPf$sILv.G("\u53e6")) != false) break block13;
                            object3 = pivX.Rk(pivX.Rk(pivX.Rk(object2), nJPf$sILv.G("\u53ed"), nJPf$sILv.G("\u53ec")), nJPf$sILv.G("\u53ec\u487b\u8b9d\u8044\uea32\u6d0f"), "");
                            pivX.Rk(feCR2, object3);
                        }
                        if (pivX.Rk(object2) == false) {
                            if (pivX.Rk(pivX.Rk(object2), nJPf$sILv.G("\u53ec\u487b\u8b9d\u8044\uea32\u6d0f")) == false) {
                                if (pivX.Rk(pivX.Rk(object2), nJPf$sILv.G("\u53b2\u4874\u8b84\u8042\uea28\u6d12\u93be\ueb26\u512a\u29fe")) != false) {
                                    object3 = pivX.biLo(file3, (String)pivX.Rk(object2));
                                    String[] arrstring = (String[])pivX.Rk(object3, nJPf$sILv.G("\u53c8"));
                                    int n3 = arrstring.length;
                                    int n4 = 0;
                                    while (n4 < n3) {
                                        String string = arrstring[n4];
                                        if (pivX.Rk(string, nJPf$sILv.G("\u53ac\u4879\u8b9c\u8040\uea7b")) != false) {
                                            object = pivX.Rk(((String[])pivX.Rk(string, nJPf$sILv.G("\u53f8")))[1]);
                                        }
                                        ++n4;
                                    }
                                }
                            }
                        }
                    }
                    object2 = pivX.Rk(zipInputStream);
                }
                pivX.Rk(zipInputStream);
                if (object != null) {
                    pivX.Rk((TNku)o.k(-853324479), object, feCR2);
                    pivX.Rk(pivX.Rk(pivX.Rk(pivX.Rk(pivX.Rk(pivX.Rk(new StringBuilder(nJPf$sILv.G("\u538b\u487c\u8b94\u804b\uea35\u6d15\u93f6\ueb36\u5122\u29f6\u3c78")), object), nJPf$sILv.G("\u53e2\u486f\u8b98\u8051\uea29\u6d5c")), pivX.Rk(feCR2)), nJPf$sILv.G("\u53e2\u486b\u8b98\u8042\uea2f\u6d1d\u93e4\ueb2a\u5135\u29f7\u3c2b\u941a"))));
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
    private static String biLo(File var0, String var1_1) throws IOException {
        var2_2 = var1_1;
        var3_3 = var0;
        var4_4 = new ZipFile(var3_3);
        var5_5 = pivX.Rk(var4_4);
        while (var5_5.hasMoreElements()) {
            var6_6 = (ZipEntry)var5_5.nextElement();
            if (pivX.Rk(pivX.Rk(var6_6), var2_2) == false) continue;
            var7_7 = pivX.Rk(var4_4, var6_6);
            var8_8 = new InputStreamReader((InputStream)var7_7);
            var9_9 = new BufferedReader(var8_8);
            var10_10 = "";
            ** GOTO lbl28
        }
        pivX.Rk(var4_4);
        return null;
lbl-1000: // 1 sources:
        {
            var10_10 = pivX.Rk(pivX.Rk(pivX.Rk(new StringBuilder((String)pivX.Rk(var10_10)), var11_11), nJPf$sILv.G("\u10e7")));
lbl28: // 2 sources:
            ** while ((var11_11 = pivX.Rk(var9_9)) != null)
        }
lbl29: // 1 sources:
        pivX.Rk(var9_9);
        return var10_10;
    }

    private static Object Rk(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

